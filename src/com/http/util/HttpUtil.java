//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.http.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.SystemDefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpUtil {
    public HttpUtil() {
    }

    public String doPost(String requestURL, String jsonObjectStr) {
        System.out.println("requestURL为[" + requestURL + "]");
        HttpClient httpClient = new DefaultHttpClient();
        String rsString = null;

        try {
            httpClient.getParams().setParameter("http.connection.timeout", 20000000);
            httpClient.getParams().setParameter("http.socket.timeout", 20000000);
            HttpPost httppost = new HttpPost(requestURL);
            StringEntity request = new StringEntity(jsonObjectStr, "UTF-8");
            httppost.setHeader("Content-Type", "text/json; charset=utf-8");
            httppost.setEntity(request);
            HttpResponse response = httpClient.execute(httppost);
            rsString = EntityUtils.toString(response.getEntity(), "UTF-8");
            System.out.println("返回数据信息为[" + rsString + "]");
        } catch (Exception var11) {
            var11.printStackTrace();
        } finally {
            httpClient.getConnectionManager().shutdown();
        }

        return rsString;
    }

    public String doGet(String requestURL, String params) {
        System.out.println("requestURL为[" + requestURL + "]");
        System.out.println("参数为[" + params + "]");
        HttpClient httpClient = new DefaultHttpClient();
        String rsString = null;

        try {
            httpClient.getParams().setParameter("http.connection.timeout", 20000000);
            httpClient.getParams().setParameter("http.socket.timeout", 20000000);
            HttpGet httpget = new HttpGet(requestURL + "?" + params);
            httpget.setHeader("Content-Type", "text/json; charset=utf-8");
            HttpResponse response = httpClient.execute(httpget);
            rsString = EntityUtils.toString(response.getEntity(), "UTF-8");
            System.out.println("返回数据信息为[" + rsString + "]");
        } catch (Exception var10) {
            var10.printStackTrace();
        } finally {
            httpClient.getConnectionManager().shutdown();
        }

        return rsString;
    }
}
