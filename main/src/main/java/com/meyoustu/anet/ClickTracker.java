package com.meyoustu.anet;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLSocketFactory;

public class ClickTracker {

    private static final String TAG = "ClickTracker";

    private static final AtomicInteger atomicInteger = new AtomicInteger(1);

    private static final ThreadPoolExecutor threadPoolExecutor =
            new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                    Runtime.getRuntime().availableProcessors(),
                    0, TimeUnit.SECONDS,
                    new LinkedBlockingQueue<>(),
                    r -> new Thread(r, String.format("%s Thread -- %s",
                            TAG, atomicInteger.getAndIncrement())));


    private String url;
    private Uri uri;

    public ClickTracker(String url) {
        this.url = url;
        this.uri = Uri.parse(url);
    }

    private int getUriPort() {
        int port = uri.getPort();
        if (port == -1) {
            if ("http".equals(uri.getScheme())) {
                port = 80;
            } else if ("https".equals(uri.getScheme())) {
                port = 443;
            }
        }
        return port;
    }

    private void handleError(Throwable tr) {
        Log.e(TAG, Log.getStackTraceString(tr));
    }

    public void doTrack() {
        threadPoolExecutor.execute(() -> {
            Socket socket = null;

            try {
                if ("https".equals(uri.getScheme())) {
                    socket = SSLSocketFactory.getDefault()
                            .createSocket(uri.getHost(), getUriPort());
                } else {
                    socket = new Socket(uri.getHost(), getUriPort());
                }


                HttpHeader.FirstLine firstLine = new HttpHeader.FirstLine()
                        .setUri(url.substring(url.indexOf(uri.getPath())));
                HttpHeader httpHeader = new HttpHeader()
                        .setFirstLine(firstLine)
                        .putHost(String.format("%s:%s", uri.getHost(), getUriPort()));

                Log.i(TAG, String.format("Request Head => \n%s", httpHeader.toString()));

                OutputStream os = socket.getOutputStream();
                os.write(httpHeader.toString().getBytes());
                os.flush();
            } catch (IOException e) {
                handleError(e);
            } finally {
                if (null != socket) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        handleError(e);
                    }
                }
            }
        });
    }

}
