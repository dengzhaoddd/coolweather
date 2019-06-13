package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/*
   处理HTTP请求的公共接口，address为传入请求地址
   callback 网络请求在子线程进行，通过回调获得返回数据
 */
public class HttpUtil {
    public static void sendOkhttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);//开启子线程 发送网络请求，结果返回callback中
    }
}
