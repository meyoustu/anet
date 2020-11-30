package com.meyoustu.anet.app;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.meyoustu.anet.ClickTracker;
import com.meyoustu.anet.HttpHeader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Map<String, String> map = new LinkedHashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        HttpHeader httpHeader = new HttpHeader();
//        httpHeader.setFirstLine(
//                new HttpHeader.FirstLine()
//        );
//
//        httpHeader.putDate(new Date());
//        httpHeader.putContentLength(10000);
//        httpHeader.putAccept("*/*");
//
//        Log.e("httpHeader => ", "\n" + httpHeader.toString());

         ClickTracker clickTracker = new ClickTracker(
                "http://101.200.121.37:9034/test?name=Liangcheng%20Juves"
        );
        clickTracker.doTrack();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                HttpHeader.FirstLineAttr firstLineAttr = new HttpHeader.FirstLineAttr();
//                firstLineAttr.setHttpRequestMethod(HttpRequestMethod.GET);
//
//                firstLineAttr.setPath("");
//
//
//                Log.e("firstLineAttr ==> ", firstLineAttr.toString());
//
//                try {
//                    Socket socket = new Socket("baidu.com", 80);
//                    StringBuilder stringBuilder = new StringBuilder();
//                    stringBuilder.append(firstLineAttr.toString());
//                    stringBuilder.append("\n");
////                    stringBuilder.append("Host: 101.200.121.37:9034\n");
//                    stringBuilder.append("\n");
//
//                    OutputStream outputStream = socket.getOutputStream();
//                    outputStream.write(stringBuilder.toString().getBytes());
//                    outputStream.flush();
//
//
//                    byte[] bytes = new byte[1024];
//                    for (int len; (len = socket.getInputStream().read(bytes)) != -1;
//                         Log.e("test", new String(bytes, 0, len)))
//                        ;
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();

    }
}