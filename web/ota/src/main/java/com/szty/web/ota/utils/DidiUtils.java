package com.szty.web.ota.utils;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.szty.sms.service.impl.SmsServiceImpl;



public class DidiUtils {
    
	
    public static final String KEY = "E786An18Q7WerM36";
    public static final String CHANNEL = "70651";

//    public static void getNearby(String url, String lng, String lat, String nonce, long timestamp, String token,
//            String channel) {
    public static void getNearby(String lng, String lat) {
        String uriAPI = "http://api.diditaxi.com.cn/api/v2/openApi/getNearby";
        /* 建立HTTPost对象 */
        HttpPost httpRequest = new HttpPost(uriAPI);
        /*
         * NameValuePair实现请求参数的封装
         */
        
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyMMddHHmmss");
        String nonce = sdf.format(new java.util.Date());
        long timestamp = System.currentTimeMillis()/1000;
        String token = "";
        String channel = "70651";
        // MD5.getMD5(substr(nonce+KEY+timestamp, 1, -1));
        String ooo = (nonce + KEY + timestamp);
        String didi = ooo.subSequence(1, ooo.length() - 1).toString();
        token = MD5(didi);
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("lng", lng));
        params.add(new BasicNameValuePair("lat", lat));
        params.add(new BasicNameValuePair("nonce", nonce));
        params.add(new BasicNameValuePair("timestamp", String.valueOf(timestamp)));
        params.add(new BasicNameValuePair("token", token));
        params.add(new BasicNameValuePair("channel", channel));

        try {
            /* 添加请求参数到请求对象 */
            httpRequest.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            /* 发送请求并等待响应 */
            HttpResponse httpResponse = new DefaultHttpClient().execute(httpRequest);
            /* 若状态码为200 ok */
            if (httpResponse.getStatusLine().getStatusCode() == 200) {
                /* 读返回数据 */
                String strResult = EntityUtils.toString(httpResponse.getEntity());
            } else {
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public static void getTaxiPos(String third_order_id) {
        String uriAPI = "http://api.diditaxi.com.cn/api/v2/openApi/getTaxiPos";
        /* 建立HTTPost对象 */
        HttpPost httpRequest = new HttpPost(uriAPI);
        /*
         * NameValuePair实现请求参数的封装
         */
        
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyMMddHHmmss");
        String nonce = sdf.format(new java.util.Date());
        long timestamp = System.currentTimeMillis()/1000;
        String token = "";
        String channel = "70651";
        // MD5.getMD5(substr(nonce+KEY+timestamp, 1, -1));
        String ooo = (nonce + KEY + timestamp);
        String didi = ooo.subSequence(1, ooo.length() - 1).toString();
        token = MD5(didi);
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("third_order_id", "TVRrd056Y3dNRGt5T1E9PQ=="));
        params.add(new BasicNameValuePair("nonce", nonce));
        params.add(new BasicNameValuePair("timestamp", String.valueOf(timestamp)));
        params.add(new BasicNameValuePair("token", token));
        params.add(new BasicNameValuePair("channel", channel));

        try {
            /* 添加请求参数到请求对象 */
            httpRequest.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            /* 发送请求并等待响应 */
            HttpResponse httpResponse = new DefaultHttpClient().execute(httpRequest);
            /* 若状态码为200 ok */
            if (httpResponse.getStatusLine().getStatusCode() == 200) {
                /* 读返回数据 */
                String strResult = EntityUtils.toString(httpResponse.getEntity());
            } else {
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void postOrder(String third_order_id, int order_state) {
        String uriAPI = "http://api.diditaxi.com.cn/api/v2/openApi/postOrder";
        /* 建立HTTPost对象 */
        HttpPost httpRequest = new HttpPost(uriAPI);
        /*
         * NameValuePair实现请求参数的封装
         */
        
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyMMddHHmmss");
        String nonce = sdf.format(new java.util.Date());
        long timestamp = System.currentTimeMillis()/1000;
        String token = "";
        String channel = "70651";
        // MD5.getMD5(substr(nonce+KEY+timestamp, 1, -1));
        String ooo = (nonce + KEY + timestamp);
        String didi = ooo.subSequence(1, ooo.length() - 1).toString();
        token = MD5(didi);
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("third_order_id", "TVRrd056Y3dNRGt5T1E9PQ=="));
        params.add(new BasicNameValuePair("order_state", String.valueOf(order_state)));
        params.add(new BasicNameValuePair("nonce", nonce));
        params.add(new BasicNameValuePair("timestamp", String.valueOf(timestamp)));
        params.add(new BasicNameValuePair("token", token));
        params.add(new BasicNameValuePair("channel", channel));

        try {
            /* 添加请求参数到请求对象 */
            httpRequest.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            /* 发送请求并等待响应 */
            HttpResponse httpResponse = new DefaultHttpClient().execute(httpRequest);
            /* 若状态码为200 ok */
            if (httpResponse.getStatusLine().getStatusCode() == 200) {
                /* 读返回数据 */
                String strResult = EntityUtils.toString(httpResponse.getEntity());
            } else {
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void getOrderDetail(String third_order_id) {
        String uriAPI = "http://api.diditaxi.com.cn/api/v2/openApi/getOrderDetail";
        /* 建立HTTPost对象 */
        HttpPost httpRequest = new HttpPost(uriAPI);
        /*
         * NameValuePair实现请求参数的封装
         */
        
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyMMddHHmmss");
        String nonce = sdf.format(new java.util.Date());
        long timestamp = System.currentTimeMillis()/1000;
        String token = "";
        String channel = "70651";
        // MD5.getMD5(substr(nonce+KEY+timestamp, 1, -1));
        String ooo = (nonce + KEY + timestamp);
        String didi = ooo.subSequence(1, ooo.length() - 1).toString();
        token = MD5(didi);
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("third_order_id", "TVRrd056Y3dNRGt5T1E9PQ=="));
        params.add(new BasicNameValuePair("nonce", nonce));
        params.add(new BasicNameValuePair("timestamp", String.valueOf(timestamp)));
        params.add(new BasicNameValuePair("token", token));
        params.add(new BasicNameValuePair("channel", channel));

        try {
            /* 添加请求参数到请求对象 */
            httpRequest.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            /* 发送请求并等待响应 */
            HttpResponse httpResponse = new DefaultHttpClient().execute(httpRequest);
            /* 若状态码为200 ok */
            if (httpResponse.getStatusLine().getStatusCode() == 200) {
                /* 读返回数据 */
                String strResult = EntityUtils.toString(httpResponse.getEntity());
            } else {
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String MD5(String input) {
        try {
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(input.getBytes());
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            StringBuffer hexString = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < md.length; i++) {
                String shaHex = Integer.toHexString(md[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
    
    public static void main(String[] args) {
    	DidiUtils.submitReq("128.23", "365.89", "20160318257812313212312222222222", 1, "", "", "18818200818", 0);
	}
    

    /*public static void submitReq(String url, String lng, String lat, int nonce, int timestamp, String token,
            String order_id, int input_type, String route_start, String route_end, String phone, int add_price,
            String use_time, int order_type, int isRetry, String channel) {*/
    /*public static void submitReq(String lng, String lat, String order_id, int input_type, String route_start, 
            String route_end, String phone, int add_price, String use_time, int order_type, int isRetry) {*/
    public static void submitReq(String lng, String lat, String order_id, int input_type, String route_start, 
            String route_end, String phone, int add_price) {
        String uriAPI = "http://api.diditaxi.com.cn/api/v2/openApi/submitReq";
        /* 建立HTTPost对象 */
        HttpPost httpRequest = new HttpPost(uriAPI);
        /*
         * NameValuePair实现请求参数的封装
         */
        
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyMMddHHmmss");
        String nonce = sdf.format(new java.util.Date());
        long timestamp = System.currentTimeMillis()/1000;
        String token = "";
        String channel = "70651";
        String ooo = (nonce + KEY + timestamp);
        String didi = ooo.subSequence(1, ooo.length() - 1).toString();
        token = MD5(didi);
        //order_id = "923455809b1a34c5a319f00b67edf764";
        //phone = "12345678912";
        route_start="上海虹桥火车站";
        route_end="上海南站";
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("lng", lng));
        params.add(new BasicNameValuePair("lat", lat));
        params.add(new BasicNameValuePair("nonce", nonce));
        params.add(new BasicNameValuePair("timestamp", String.valueOf(timestamp)));
        params.add(new BasicNameValuePair("token", token));
        params.add(new BasicNameValuePair("order_id", order_id));
        params.add(new BasicNameValuePair("input_type", String.valueOf(input_type)));
        params.add(new BasicNameValuePair("route_start", route_start));
        params.add(new BasicNameValuePair("route_end", route_end));
        params.add(new BasicNameValuePair("phone", phone));
        params.add(new BasicNameValuePair("add_price", String.valueOf(add_price)));
//        params.add(new BasicNameValuePair("use_time", use_time));
//        params.add(new BasicNameValuePair("order_type", String.valueOf(order_type)));
//        params.add(new BasicNameValuePair("isRetry", String.valueOf(isRetry)));
        
        params.add(new BasicNameValuePair("channel", channel));

        try {
            /* 添加请求参数到请求对象 */
            httpRequest.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            /* 发送请求并等待响应 */
            HttpResponse httpResponse = new DefaultHttpClient().execute(httpRequest);
            /* 若状态码为200 ok */
            if (httpResponse.getStatusLine().getStatusCode() == 200) {
                /* 读返回数据 */
                String strResult = EntityUtils.toString(httpResponse.getEntity());
                System.out.println(strResult);
            } else {
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
