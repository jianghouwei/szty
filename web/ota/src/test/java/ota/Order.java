package ota;

import java.util.HashMap;
import java.util.Map;

import com.szty.commos.utils.HttpUtil;

public class Order {

	public static String getOrderId = "http://localhost:8080/ota/getOrderId";

	public static String setOrder = "http://localhost:8080/ota/setOrder";

	public static String pushReply = "http://121.42.47.224/ota/pushReply";

	public static void getOrderId() {
		Map<String ,Object> params = new HashMap<String ,Object>();
		params.put("phone", "18818200818");
		HttpUtil.doGet(getOrderId, params);
	}
	public static void setOrder() {
		Map<String ,Object> params = new HashMap<String ,Object>();
		params.put("phone", "18818200818");
		HttpUtil.doGet(setOrder, params);
	}
	public static void main(String[] args) {
		pushReply();
	}

	public static void pushReply() {
		
//		private String bef_lng;
//		
//		private String bef_lat;
//		
//		private String bef_phone;
//		
//		private String src_type;
//		private String order_id;
//		private String third_order_id;
//		private String lng;
//		private String lat;
//		private String driver_name;
//		private String taxi_no;
//		private String taxi_company;
//		private String phone;
//		private String photo_url;
//		private String nonce;
//		private String timestamp;
//		private String token;
//		private String order_num;
//		private String praise_num;
//		private String channel;
		Map<String ,Object> params = new HashMap<String ,Object>();
		params.put("src_type", "dd");
		params.put("order_id", "f70f4c04f3e04067bad662784db34940");
		params.put("third_order_id", "dd123123213213");
		params.put("lng", "19.602");
		params.put("lat", "19.602");
		params.put("driver_name", "陈师傅");
		params.put("taxi_no", "wan.A9768");
		params.put("phone", "18818200818");
		params.put("photo_url", "http");
		params.put("nonce", "1232");
		
		HttpUtil.doPost(pushReply, params);

	}

}
