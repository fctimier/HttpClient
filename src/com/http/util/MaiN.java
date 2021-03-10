package com.http.util;

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
    }
}
