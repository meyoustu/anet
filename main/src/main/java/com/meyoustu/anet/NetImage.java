package com.meyoustu.anet;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class NetImage {

    private static final AtomicInteger atomicInteger = new AtomicInteger(1);

    static final ThreadPoolExecutor threadPoolExecutor =
            new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                    Runtime.getRuntime().availableProcessors(),
                    0, TimeUnit.SECONDS,
                    new LinkedBlockingQueue<>(),
                    r -> new Thread(r, "ImgService Thread -- " + atomicInteger.getAndIncrement()));


    private static final int TIME_OUT = 5000;

    private String url;

    private LoadListener loadListener;

    private HttpHeader requestHeader;

    public NetImage(String url) {
        this.url = url;
    }

    public void setLoadListener(LoadListener loadListener) {
        this.loadListener = loadListener;
    }

    public void setRequestHeader(HttpHeader requestHeader) {
        this.requestHeader = requestHeader;
    }

    public void load() {
        threadPoolExecutor.execute(() -> {
            try {
                URLConnection conn = new URL(url).openConnection();
                conn.setConnectTimeout(TIME_OUT);
                conn.setReadTimeout(TIME_OUT);
                if (null != requestHeader) {
                    for (Map.Entry<String, String> entry : requestHeader.entrySet()) {
                        conn.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                conn.connect();

                loadListener.onLoaded(url, BitmapFactory.decodeStream((InputStream) conn.getContent()));
            } catch (Throwable tr) {
                if (null != loadListener) {
                    loadListener.onFailure(url, tr);
                }
            }
        });
    }


    public interface LoadListener {
        void onLoaded(String url, Bitmap image);

        void onFailure(String url, Throwable tr);
    }

}
