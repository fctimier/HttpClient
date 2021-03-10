package com.http.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

/**
 * TODO
 *
 * @date 2021/3/10
 */
public class MaiN {


    public static void main(String[] args) {

        String url = "http://www.woshipm.com/api2/views/recommendUsers";
        HttpUtil httpUtil = new HttpUtil();

        String rs = httpUtil.doGet(url, "");

        System.out.println(rs);

        /*String result;
        HttpGet get = new HttpGet(url);
        DefaultHttpClient client = new DefaultHttpClient();
        try {
            HttpResponse response = client.execute(get);
            result = EntityUtils.toString(response.getEntity());

            CookieStore cookieStore =   client.getCookieStore();
            List<Cookie> cookies =cookieStore.getCookies();
            System.out.println(cookies.size());
            for(Cookie c :cookies) {//get Cookies info
                System.out.println(c.getName() + ":" + c.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        }
    }
