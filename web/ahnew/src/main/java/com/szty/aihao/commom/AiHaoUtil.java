package com.szty.aihao.commom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;

import com.szty.aihao.dao.aihao10_Dao;

/**
 * 获取实时天气信息功能性函数扩展类
 */
public class AiHaoUtil {
	private final static String TAG = "ljz";
	private final static String format = "json";

	private final static String BASE_URL = "http://s.927114.com/sapi?";
	private final static String TEST_URL = "http://s.927114.com/sapi?p=60&pcode=&channel=&ver=&imsi=&imei=&m=&pb=&pm=&os=&c=&lo=116.37111600026&la=39.978222002551&ar=10&k=KFC&lattype=1&r=20";
	private final static String WEATHER_URL = "http://www.weather.com.cn/adat/sk/101010100.html";

	public AiHaoUtil() {

	}

	public static void main(String[] args) {
		Field[] fs;
		
			
			aihao10_Dao a=new aihao10_Dao();
			a.setAddress("asdads");
		
				try {
					fs = a.getClass().getFields();
					System.out.println(fs.length);
					for (Field u : fs) {
						System.out.println(u.getName());
					}
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			

			
	
	}

	public static String executeHttpGet() {
		String result = null;
		URL url = null;
		HttpURLConnection connection = null;
		InputStreamReader in = null;
		try {
			// url = new URL(WEATHER_URL);
			url = new URL(TEST_URL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(10 * 1000);
			in = new InputStreamReader(connection.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(in);
			StringBuffer strBuffer = new StringBuffer();
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				strBuffer.append(line);
			}
			result = strBuffer.toString();
			System.out.println(result);
			// Log.d(TAG, "-------executeHttpGet------result = " + result);
		} catch (Exception e) {
			// Log.d(TAG, "-------executeHttpGet------e = " + e);
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		return result;
	}
}