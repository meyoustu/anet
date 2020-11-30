package com.meyoustu.anet;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ImageService {

    private static final AtomicInteger atomicInteger = new AtomicInteger(1);

    private static final ThreadPoolExecutor threadPoolExecutor =
            new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                    Runtime.getRuntime().availableProcessors(),
                    0, TimeUnit.SECONDS,
                    new LinkedBlockingQueue<>(),
                    r -> new Thread(r, "ImgService Thread -- " + atomicInteger.getAndIncrement()));


    private static final int TIME_OUT = 5000;


    private Map<String, String> map;
    private ReceiveListener receiveListener;


    public ImageService(Map<String, String> urls) {
        this.map = urls;
    }

    public void setReceiveListener(ReceiveListener receiveListener) {
        this.receiveListener = receiveListener;
    }

    public void start() {
        if (null != map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String sign = entry.getKey();
                String url = entry.getValue();
                if (null != sign && null != url) {
                    execOneTask(sign, url);
                }
            }
        }
        if (!threadPoolExecutor.isShutdown()) {
            threadPoolExecutor.shutdown();
        }
    }


    private void execOneTask(String sign, String url) {
        threadPoolExecutor.execute(() -> {
            try {
                URLConnection coon = new URL(url).openConnection();
                coon.setConnectTimeout(TIME_OUT);
                coon.setReadTimeout(TIME_OUT);
                coon.connect();

                Bitmap bmp = BitmapFactory.decodeStream((InputStream) coon.getContent());
                if (null != receiveListener) {
                    receiveListener.onReceive(sign, url, bmp);
                }
            } catch (IOException e) {
                if (null != receiveListener) {
                    receiveListener.onFailure(sign, url);
                }
            }
        });
    }


    public interface ReceiveListener {
        void onReceive(String sign, String url, Bitmap image);

        void onFailure(String sign, String url);
    }

}
