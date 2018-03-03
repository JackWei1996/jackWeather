package com.example.jackweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 19604 on 3/4/2018.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
