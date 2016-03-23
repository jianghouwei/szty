package com.szty.aihao;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.szty.aihao.dao.aihao10_Dao;
import com.szty.aihao.dao.aihao11_Dao;
import com.szty.aihao.dao.aihao12_Dao;
import com.szty.aihao.dao.aihao13_Dao;
import com.szty.aihao.dao.aihao14_Dao;
import com.szty.aihao.dao.aihao15_Dao;
import com.szty.aihao.dao.aihao16_Dao;
import com.szty.aihao.dao.aihao17_Dao;
import com.szty.aihao.dao.aihao18_Dao;
import com.szty.aihao.dao.aihao19_Dao;
import com.szty.aihao.dao.aihao20_Dao;
import com.szty.aihao.dao.aihao21_Dao;
import com.szty.aihao.dao.aihao22_Dao;
import com.szty.aihao.dao.aihao23_Dao;
import com.szty.aihao.dao.aihao24_Dao;
import com.szty.aihao.dao.aihao25_Dao;
import com.szty.aihao.dao.aihao26_Dao;
import com.szty.aihao.dao.aihao27_Dao;
import com.szty.aihao.dao.aihao28_Dao;
import com.szty.aihao.dao.aihao29_Dao;
import com.szty.aihao.dao.aihao30_Dao;
import com.szty.aihao.dao.aihao31_Dao;
import com.szty.aihao.dao.aihao32_Dao;
import com.szty.aihao.dao.aihao33_Dao;
import com.szty.aihao.dao.aihao34_Dao;
import com.szty.aihao.dao.aihao35_Dao;
import com.szty.aihao.dao.aihao36_Dao;
import com.szty.aihao.dao.aihao37_Dao;
import com.szty.aihao.dao.aihao38_Dao;
import com.szty.aihao.dao.aihao39_Dao;
import com.szty.aihao.dao.aihao40_Dao;
import com.szty.aihao.dao.aihao_dao;
import com.szty.aihao.dao.sc_category_Dao;
import com.szty.aihao.myservice.myService;
import com.szty.aihao.service.aihao10_service;

/**
 * Handles requests for the application home page.
 * 
 * http://s.927114.com/sapi?lo=116.37111600026&la=39.978222002551&ar=10&k=KFC&
 * lattype=1 http://s.927114.com//sk?k=KFC&lattype=1
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	aihao10_service sec = new aihao10_service();

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		model.addAttribute("serverTime", "welcome");

		return "home";
	}

	@RequestMapping(value = "/sapi", method = RequestMethod.GET)
	public String sapi(Locale locale, Model model, HttpServletRequest request

	) {

		// try {
		// request.setCharacterEncoding("utf-8");
		// } catch (UnsupportedEncodingException e3) {
		// // TODO Auto-generated catch block
		// e3.printStackTrace();
		// }

		// logger.info("page:{}.", "sapi");
		String lo = request.getParameter("lo") == null ? "" : request.getParameter("lo");// 精度
		String la = request.getParameter("la") == null ? "" : request.getParameter("la");// 纬度
		String k = "";
		k = request.getParameter("k") == null ? "" : request.getParameter("k");
		try {
			k = new String(k.getBytes("ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String m = request.getParameter("m") == null ? "" : request.getParameter("m");// 手机号
		String channel = request.getParameter("channel") == null ? "" : request.getParameter("channel");
		String ver = request.getParameter("ver") == null ? "" : request.getParameter("ver");
		String imsi = request.getParameter("imsi") == null ? "" : request.getParameter("imsi");
		String imei = request.getParameter("imei") == null ? "" : request.getParameter("imei");
		String pb = request.getParameter("pb") == null ? "" : request.getParameter("pb");// 手机品牌
		String pm = request.getParameter("pm") == null ? "" : request.getParameter("pm");// 手机型号
		String os = request.getParameter("os") == null ? "" : request.getParameter("os");// 操作系统
		String pcode = request.getParameter("pcode") == null ? "" : request.getParameter("pcode");
		String ar = request.getParameter("ar") == null ? "" : request.getParameter("ar");// 省份
		String c = request.getParameter("c") == null ? "" : request.getParameter("c");// 城市
		String r = request.getParameter("r") == null ? "10" : request.getParameter("r");// 返回行数
		String o = request.getParameter("o") == null ? "" : request.getParameter("o");// 偏移
		String lattype = request.getParameter("lattype") == null ? "" : request.getParameter("lattype");// 偏移
		JSONObject json = new JSONObject();

		if (lo.equals("") || la.equals("") || ar.equals("") || k.equals("")) {
			json.put("status", "1");
			json.put("msg", "坐标或者省份或者关键字不能为空");
			model.addAttribute("result", json.toString());
			return "result";
		}

		double x = Double.parseDouble(lo);
		double y = Double.parseDouble(la);

		// 5km
		// logger.info("k:{}",k);

		// try {
		// logger.info("encode:{}", URLEncoder.encode("北京", "utf-8"));
		// } catch (UnsupportedEncodingException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		double xl = x - 0.02;
		double xr = x + 0.02;
		double yu = y + 0.02;
		double yd = y - 0.02;
		int row = Integer.parseInt(r);
		String sqlstr = "";
		if (lattype.equals("0"))
			sqlstr = "tag like '%" + k + "%' and (x between " + xl + "  and  " + xr + " ) and (y between " + yd
					+ " and  " + yu + ")  and rownum<=" + row + " order by abs(x+y-" + x + "-" + y + ") ";
		else
			sqlstr = "tag like '%" + k + "%' and (baidux between " + xl + "  and  " + xr + " ) and (baiduy between "
					+ yd + " and  " + yu + ")  and rownum<=" + row + " order by abs(baidux+baiduy-" + x + "-" + y
					+ ") asc";
		logger.info("sqlstr {}.", sqlstr);
		JSONArray arr = new JSONArray();
		try {
			List<?> list = null;
			switch (Integer.parseInt(ar)) {
			case 10:
				list = myService._aihao10.get_aihao10_All(sqlstr);
				break;
			case 11:
				list = myService._aihao11.get_aihao11_All(sqlstr);
				break;
			case 12:
				list = myService._aihao12.get_aihao12_All(sqlstr);
				break;
			case 13:
				list = myService._aihao13.get_aihao13_All(sqlstr);
				break;
			case 14:
				list = myService._aihao14.get_aihao14_All(sqlstr);
				break;
			case 15:
				list = myService._aihao15.get_aihao15_All(sqlstr);
				break;
			case 16:
				list = myService._aihao16.get_aihao16_All(sqlstr);
				break;
			case 17:
				list = myService._aihao17.get_aihao17_All(sqlstr);
				break;
			case 18:
				list = myService._aihao18.get_aihao18_All(sqlstr);
				break;
			case 19:
				list = myService._aihao19.get_aihao19_All(sqlstr);
				break;
			case 20:
				list = myService._aihao20.get_aihao20_All(sqlstr);
				break;
			case 21:
				list = myService._aihao21.get_aihao21_All(sqlstr);
				break;
			case 22:
				list = myService._aihao22.get_aihao22_All(sqlstr);
				break;
			case 23:
				list = myService._aihao23.get_aihao23_All(sqlstr);
				break;
			case 24:
				list = myService._aihao24.get_aihao24_All(sqlstr);
				break;
			case 25:
				list = myService._aihao25.get_aihao25_All(sqlstr);
				break;
			case 26:
				list = myService._aihao26.get_aihao26_All(sqlstr);
				break;
			case 27:
				list = myService._aihao27.get_aihao27_All(sqlstr);
				break;
			case 28:
				list = myService._aihao28.get_aihao28_All(sqlstr);
				break;
			case 29:
				list = myService._aihao29.get_aihao29_All(sqlstr);
				break;
			case 30:
				list = myService._aihao30.get_aihao30_All(sqlstr);
				break;
			case 31:
				list = myService._aihao31.get_aihao31_All(sqlstr);
				break;
			case 32:
				list = myService._aihao32.get_aihao32_All(sqlstr);
				break;
			case 33:
				list = myService._aihao33.get_aihao33_All(sqlstr);
				break;
			case 34:
				list = myService._aihao34.get_aihao34_All(sqlstr);
				break;
			case 35:
				list = myService._aihao35.get_aihao35_All(sqlstr);
				break;
			case 36:
				list = myService._aihao36.get_aihao36_All(sqlstr);
				break;
			case 37:
				list = myService._aihao37.get_aihao37_All(sqlstr);
				break;
			case 38:
				list = myService._aihao38.get_aihao38_All(sqlstr);
				break;
			case 39:
				list = myService._aihao39.get_aihao39_All(sqlstr);
				break;
			}
			if (list.size() > 0) {
				for (Object _dao : list) {
					aihao_dao dao = null;
					switch (Integer.parseInt(ar)) {
					case 10:
						dao = aihao10_Dao.convert((aihao10_Dao) _dao);
						break;
					case 11:
						dao = aihao11_Dao.convert((aihao11_Dao) _dao);
						break;
					case 12:
						dao = aihao12_Dao.convert((aihao12_Dao) _dao);
						break;
					case 13:
						dao = aihao13_Dao.convert((aihao13_Dao) _dao);
						break;
					case 14:
						dao = aihao14_Dao.convert((aihao14_Dao) _dao);
						break;
					case 15:
						dao = aihao15_Dao.convert((aihao15_Dao) _dao);
						break;
					case 16:
						dao = aihao16_Dao.convert((aihao16_Dao) _dao);
						break;
					case 17:
						dao = aihao17_Dao.convert((aihao17_Dao) _dao);
						break;
					case 18:
						dao = aihao18_Dao.convert((aihao18_Dao) _dao);
						break;
					case 19:
						dao = aihao19_Dao.convert((aihao19_Dao) _dao);
						break;
					case 20:
						dao = aihao20_Dao.convert((aihao20_Dao) _dao);
						break;
					case 21:
						dao = aihao21_Dao.convert((aihao21_Dao) _dao);
						break;
					case 22:
						dao = aihao22_Dao.convert((aihao22_Dao) _dao);
						break;
					case 23:
						dao = aihao23_Dao.convert((aihao23_Dao) _dao);
						break;
					case 24:
						dao = aihao24_Dao.convert((aihao24_Dao) _dao);
						break;
					case 25:
						dao = aihao25_Dao.convert((aihao25_Dao) _dao);
						break;
					case 26:
						dao = aihao26_Dao.convert((aihao26_Dao) _dao);
						break;
					case 27:
						dao = aihao27_Dao.convert((aihao27_Dao) _dao);
						break;
					case 28:
						dao = aihao28_Dao.convert((aihao28_Dao) _dao);
						break;
					case 29:
						dao = aihao29_Dao.convert((aihao29_Dao) _dao);
						break;
					case 30:
						dao = aihao30_Dao.convert((aihao30_Dao) _dao);
						break;
					case 31:
						dao = aihao31_Dao.convert((aihao31_Dao) _dao);
						break;
					case 32:
						dao = aihao32_Dao.convert((aihao32_Dao) _dao);
						break;
					case 33:
						dao = aihao33_Dao.convert((aihao33_Dao) _dao);
						break;
					case 34:
						dao = aihao34_Dao.convert((aihao34_Dao) _dao);
						break;
					case 35:
						dao = aihao35_Dao.convert((aihao35_Dao) _dao);
						break;
					case 36:
						dao = aihao36_Dao.convert((aihao36_Dao) _dao);
						break;
					case 37:
						dao = aihao37_Dao.convert((aihao37_Dao) _dao);
						break;
					case 38:
						dao = aihao38_Dao.convert((aihao38_Dao) _dao);
						break;
					case 39:
						dao = aihao39_Dao.convert((aihao39_Dao) _dao);
						break;
					case 40:
						dao = aihao40_Dao.convert((aihao40_Dao) _dao);
						break;

					}
					JSONObject temp = new JSONObject();
					temp.put("priceTag", "");
					temp.put("phone", dao.getTelno());

					temp.put("linkUrl", "");
					temp.put("tag", dao.getTag());
					String[] labels = new String[0];
					temp.put("labels", new JSONArray());
					temp.put("score", "5.0");
					temp.put("recommendDish", "");
					temp.put("id", dao.getId() + "");
					temp.put("imgUrl", "");
					temp.put("title", dao.getName());
					double distance = 0;
					try {
						distance = (Double.parseDouble(dao.getBaidux()) + Double.parseDouble(dao.getBaiduy()) - x - y)
								* 1113 * 100;
					} catch (Exception ce) {
						ce.printStackTrace();
					}
					temp.put("distance", (int) distance + "m");
					temp.put("price", "");
					temp.put("endPoint", dao.getBaiduy() + "," + dao.getBaidux());
					temp.put("address", dao.getAddress());
					temp.put("businessHours", dao.getDistrict_name());
					temp.put("startPoint", y + "," + x);

					arr.add(temp);
				}
				// json.put("details", arr);

				JSONObject data = new JSONObject();
				JSONObject param = new JSONObject();
				param.put("details", arr);
				data.put("params", param);
				data.put("source", "爱号搜索");
				data.put("background", "restaurant");
				data.put("type", "poi_one");
				JSONArray data_arr = new JSONArray();
				data_arr.add(data);
				JSONObject content = new JSONObject();
				content.put("data", data_arr);
				content.put("msgId", "722c148f-f55f-4a4d-9f16-e3b21ff48ba3");
				content.put("query", "附近的" + k);
				content.put("searchQuery", "");
				content.put("task", "public.restaurant");
				content.put("confidence", 0.8);
				json.put("content", content);
				json.put("status", "success");
				json.put("msg", "success");
				json.put("size", arr.size());
				model.addAttribute("result", json.toString());
			} else {
				json.put("status", "0");
				json.put("msg", "success");
				json.put("size", 0);
				model.addAttribute("result", json.toString());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json.put("status", "1");
			json.put("msg", "error");
			model.addAttribute("result", json.toString());
		}

		return "result";
	}

	@RequestMapping(value = "/sk", method = RequestMethod.GET)
	public String sk(Locale locale, Model model, HttpServletRequest request

	) {

		// logger.info("Welcome home! The client locale is {}.", locale);
		String lo = request.getParameter("lo") == null ? "" : request.getParameter("lo");// 精度
		String la = request.getParameter("la") == null ? "" : request.getParameter("la");// 纬度
		String k = "";
		k = request.getParameter("k") == null ? "" : request.getParameter("k");
		try {
			k = new String(k.getBytes("ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String m = request.getParameter("m") == null ? "" : request.getParameter("m");// 手机号
		String channel = request.getParameter("channel") == null ? "" : request.getParameter("channel");
		String ver = request.getParameter("ver") == null ? "" : request.getParameter("ver");
		String imsi = request.getParameter("imsi") == null ? "" : request.getParameter("imsi");
		String imei = request.getParameter("imei") == null ? "" : request.getParameter("imei");
		String pb = request.getParameter("pb") == null ? "" : request.getParameter("pb");// 手机品牌
		String pm = request.getParameter("pm") == null ? "" : request.getParameter("pm");// 手机型号
		String os = request.getParameter("os") == null ? "" : request.getParameter("os");// 操作系统
		String pcode = request.getParameter("pcode") == null ? "" : request.getParameter("pcode");
		String ar = request.getParameter("ar") == null ? "" : request.getParameter("ar");// 省份
		String c = request.getParameter("c") == null ? "" : request.getParameter("c");// 城市
		String r = request.getParameter("r") == null ? "10" : request.getParameter("r");// 返回行数
		String o = request.getParameter("o") == null ? "" : request.getParameter("o");// 偏移
		String lattype = request.getParameter("lattype") == null ? "" : request.getParameter("lattype");// 偏移
		JSONObject json = new JSONObject();
		if (ar.equals("") || k.equals("")) {
			json.put("status", "1");
			json.put("msg", "省份或者关键字不能为空");
			model.addAttribute("result", json.toString());
			return "result";
		}

		int row = 2 * Integer.parseInt(r);
		String sqlstr = "";

		sqlstr = "trade_name" + k + "%'  and rownum<=" + row + "  ";
		logger.info("sqlstr {}.", sqlstr);
		JSONArray arr = new JSONArray();
		try {
			List<?> list = null;
			switch (Integer.parseInt(ar)) {
			case 10:
				list = myService._aihao10.get_aihao10_All(sqlstr);
				break;
			case 11:
				list = myService._aihao11.get_aihao11_All(sqlstr);
				break;
			case 12:
				list = myService._aihao12.get_aihao12_All(sqlstr);
				break;
			case 13:
				list = myService._aihao13.get_aihao13_All(sqlstr);
				break;
			case 14:
				list = myService._aihao14.get_aihao14_All(sqlstr);
				break;
			case 15:
				list = myService._aihao15.get_aihao15_All(sqlstr);
				break;
			case 16:
				list = myService._aihao16.get_aihao16_All(sqlstr);
				break;
			case 17:
				list = myService._aihao17.get_aihao17_All(sqlstr);
				break;
			case 18:
				list = myService._aihao18.get_aihao18_All(sqlstr);
				break;
			case 19:
				list = myService._aihao19.get_aihao19_All(sqlstr);
				break;
			case 20:
				list = myService._aihao20.get_aihao20_All(sqlstr);
				break;
			case 21:
				list = myService._aihao21.get_aihao21_All(sqlstr);
				break;
			case 22:
				list = myService._aihao22.get_aihao22_All(sqlstr);
				break;
			case 23:
				list = myService._aihao23.get_aihao23_All(sqlstr);
				break;
			case 24:
				list = myService._aihao24.get_aihao24_All(sqlstr);
				break;
			case 25:
				list = myService._aihao25.get_aihao25_All(sqlstr);
				break;
			case 26:
				list = myService._aihao26.get_aihao26_All(sqlstr);
				break;
			case 27:
				list = myService._aihao27.get_aihao27_All(sqlstr);
				break;
			case 28:
				list = myService._aihao28.get_aihao28_All(sqlstr);
				break;
			case 29:
				list = myService._aihao29.get_aihao29_All(sqlstr);
				break;
			case 30:
				list = myService._aihao30.get_aihao30_All(sqlstr);
				break;
			case 31:
				list = myService._aihao31.get_aihao31_All(sqlstr);
				break;
			case 32:
				list = myService._aihao32.get_aihao32_All(sqlstr);
				break;
			case 33:
				list = myService._aihao33.get_aihao33_All(sqlstr);
				break;
			case 34:
				list = myService._aihao34.get_aihao34_All(sqlstr);
				break;
			case 35:
				list = myService._aihao35.get_aihao35_All(sqlstr);
				break;
			case 36:
				list = myService._aihao36.get_aihao36_All(sqlstr);
				break;
			case 37:
				list = myService._aihao37.get_aihao37_All(sqlstr);
				break;
			case 38:
				list = myService._aihao38.get_aihao38_All(sqlstr);
				break;
			case 39:
				list = myService._aihao39.get_aihao39_All(sqlstr);
				break;
			}

			if (list.size() > 0) {
				for (Object _dao : list) {
					aihao_dao dao = null;
					switch (Integer.parseInt(ar)) {
					case 10:
						dao = aihao10_Dao.convert((aihao10_Dao) _dao);
						break;
					case 11:
						dao = aihao11_Dao.convert((aihao11_Dao) _dao);
						break;
					case 12:
						dao = aihao12_Dao.convert((aihao12_Dao) _dao);
						break;
					case 13:
						dao = aihao13_Dao.convert((aihao13_Dao) _dao);
						break;
					case 14:
						dao = aihao14_Dao.convert((aihao14_Dao) _dao);
						break;
					case 15:
						dao = aihao15_Dao.convert((aihao15_Dao) _dao);
						break;
					case 16:
						dao = aihao16_Dao.convert((aihao16_Dao) _dao);
						break;
					case 17:
						dao = aihao17_Dao.convert((aihao17_Dao) _dao);
						break;
					case 18:
						dao = aihao18_Dao.convert((aihao18_Dao) _dao);
						break;
					case 19:
						dao = aihao19_Dao.convert((aihao19_Dao) _dao);
						break;
					case 20:
						dao = aihao20_Dao.convert((aihao20_Dao) _dao);
						break;
					case 21:
						dao = aihao21_Dao.convert((aihao21_Dao) _dao);
						break;
					case 22:
						dao = aihao22_Dao.convert((aihao22_Dao) _dao);
						break;
					case 23:
						dao = aihao23_Dao.convert((aihao23_Dao) _dao);
						break;
					case 24:
						dao = aihao24_Dao.convert((aihao24_Dao) _dao);
						break;
					case 25:
						dao = aihao25_Dao.convert((aihao25_Dao) _dao);
						break;
					case 26:
						dao = aihao26_Dao.convert((aihao26_Dao) _dao);
						break;
					case 27:
						dao = aihao27_Dao.convert((aihao27_Dao) _dao);
						break;
					case 28:
						dao = aihao28_Dao.convert((aihao28_Dao) _dao);
						break;
					case 29:
						dao = aihao29_Dao.convert((aihao29_Dao) _dao);
						break;
					case 30:
						dao = aihao30_Dao.convert((aihao30_Dao) _dao);
						break;
					case 31:
						dao = aihao31_Dao.convert((aihao31_Dao) _dao);
						break;
					case 32:
						dao = aihao32_Dao.convert((aihao32_Dao) _dao);
						break;
					case 33:
						dao = aihao33_Dao.convert((aihao33_Dao) _dao);
						break;
					case 34:
						dao = aihao34_Dao.convert((aihao34_Dao) _dao);
						break;
					case 35:
						dao = aihao35_Dao.convert((aihao35_Dao) _dao);
						break;
					case 36:
						dao = aihao36_Dao.convert((aihao36_Dao) _dao);
						break;
					case 37:
						dao = aihao37_Dao.convert((aihao37_Dao) _dao);
						break;
					case 38:
						dao = aihao38_Dao.convert((aihao38_Dao) _dao);
						break;
					case 39:
						dao = aihao39_Dao.convert((aihao39_Dao) _dao);
						break;
					case 40:
						dao = aihao40_Dao.convert((aihao40_Dao) _dao);
						break;

					}

					JSONObject temp = new JSONObject();
					temp.put("address", dao.getAddress());

					temp.put("baidux", dao.getBaidux());
					temp.put("baiduy", dao.getBaiduy());
					temp.put("trade_name", dao.getTrade_name());
					temp.put("branch_name", dao.getBranch_name());
					temp.put("category", dao.getCategory());
					temp.put("city_id", dao.getCity_id());
					temp.put("city_name", dao.getCity_name());

					temp.put("id", dao.getId());
					temp.put("name", dao.getName());
					temp.put("intro", dao.getIntroduction());
					temp.put("landmark", dao.getLandmark());
					temp.put("district_name", dao.getDistrict_name());
					temp.put("site", dao.getOfficial_site());
					temp.put("telno", dao.getTelno());
					temp.put("bigclass", dao.getBigclass());
					temp.put("gpsx", dao.getX());
					temp.put("gpsy", dao.getY());
					arr.add(temp);
				}
				json.put("p", arr);
				json.put("status", "0");
				json.put("msg", "success");
				json.put("size", arr.size());
				model.addAttribute("result", json.toString());
			} else {
				json.put("status", "0");
				json.put("msg", "success");
				json.put("size", 0);
				model.addAttribute("result", json.toString());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json.put("status", "1");
			json.put("msg", "error");
			model.addAttribute("result", json.toString());
		}

		return "result";
	}

	java.util.Dictionary<Integer, com.szty.aihao.dao.sc_category_Dao> dic_cate = null;

	@RequestMapping(value = "/sc", method = RequestMethod.GET)
	public String admin_login(Locale locale, Model model, HttpServletRequest request

	) {

		String aid = request.getParameter("id") == null ? "-1" : request.getParameter("id");
		String p = request.getParameter("p") == null ? "1" : request.getParameter("p");
		String pn = request.getParameter("pn") == null ? "20" : request.getParameter("pn");
		List<com.szty.aihao.dao.fitwear_app_Dao> list = null;
		try {
			dic_cate = myService._sc_category.get_sc_category_Dictionary(" isdel=0");
			if (aid.equals("-1"))
				list = myService._fitwear_app.get_fitwear_app_Page(Integer.parseInt(pn), Integer.parseInt(p),
						"isdel=0  order by cast(sortorder as integer)  desc, id desc");
			else
				list = myService._fitwear_app.get_fitwear_app_Page(Integer.parseInt(pn), Integer.parseInt(p),
						"isdel=0 and category like '%" + aid + "%' order by cast(sortorder as integer) desc, id desc");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JSONObject json = new JSONObject();
		if (list == null || list.size() == 0) {
			json.put("status", 0);
			json.put("size", 0);
			model.addAttribute("result", json.toString());
			return "result";

		}
		JSONArray arr = new JSONArray();
		for (int i = 0; i < list.size(); i++) {
			JSONObject temp = new JSONObject();
			com.szty.aihao.dao.fitwear_app_Dao u = list.get(i);
			temp.put("apk_package_name", u.getPackagename());
			temp.put("apk_url", u.getM_apk());
			String cate = "";
			int msize = 0;
			int fsize = 0;
			try {
				cate = dic_cate.get(Integer.parseInt(u.getCategory())).getCatename();

			} catch (Exception ce) {

			}
			try {
				msize = Integer.parseInt(u.getM_apk_size().replace(",", ""));
			} catch (Exception ce) {

			}
			try {
				fsize = Integer.parseInt(u.getF_apk_size().replace(",", ""));
			} catch (Exception ce) {

			}
			int vcode = 0;
			try {
				vcode = Integer.parseInt(u.getVercode());
			} catch (Exception ce) {

			}
			temp.put("category_name", cate);
			temp.put("changelog", "");
			temp.put("company", "");
			temp.put("create_time", dateformat.format(u.getCreatetime()));
			//String subStr = str.replaceAll("\\&[a-zA-Z]{0,9};", "").replaceAll("<[^>]*>", "\n\t");
			temp.put("description", u.getDescript().replace("\r", "").replace("\n", "").replaceAll("<[^>]*>", ""));
			temp.put("developer_email", "");
			temp.put("developer_name", "");
			temp.put("dislike_num", 0);
			temp.put("download_count", 5242);
			temp.put("apk_url", u.getM_apk().replace(",", ""));
			temp.put("file_size", msize);
			temp.put("id", u.getId());
			temp.put("like_num", 0);
			temp.put("logo_url", u.getLogo().replace(",", ""));
			// temp.put("mms_apk_url", u.getM_apk().replace(",", ""));
			// temp.put("mms_file_size", msize);
			// temp.put("mms_wear_apk_url", u.getF_apk().replace(",", ""));
			// temp.put("mms_wear_file_size", fsize);
			temp.put("name", u.getAppname());
			temp.put("need_aw", 0);
			temp.put("privacy_policy", "");
			temp.put("score", 3);
			temp.put("summary", u.getSummary());
			temp.put("update_time", (u.getCreatetime().getTime() / 1000));
			temp.put("version", u.getVername());
			temp.put("version_code", vcode);
			String f_apk_url="";
			try{
				f_apk_url=u.getF_apk().replace(",", "");
			}
			catch(Exception ce){
				
			}
			temp.put("wear_apk_url", f_apk_url);
			temp.put("wear_file_size", fsize);

			arr.add(temp);
		}
		json.put("data", arr);
		json.put("size", list.size());
		json.put("status", 0);

		model.addAttribute("result", json.toString());
		return "result";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Locale locale, Model model, HttpServletRequest request

	) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String k = request.getParameter("k") == null ? "" : request.getParameter("k");
		String p = request.getParameter("p") == null ? "1" : request.getParameter("p");
		String pn = request.getParameter("pn") == null ? "20" : request.getParameter("pn");
		System.out.println(k+":k");
		List<com.szty.aihao.dao.fitwear_app_Dao> list = null;
		try {
			dic_cate = myService._sc_category.get_sc_category_Dictionary(" isdel=0");

			list = myService._fitwear_app.get_fitwear_app_Page(Integer.parseInt(pn), Integer.parseInt(p),
					" appname like '%" + k + "%'  order by cast(sortorder as integer)  desc,id desc");

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JSONObject json = new JSONObject();
		if (list == null || list.size() == 0) {
			json.put("status", 0);
			json.put("size", 0);
			model.addAttribute("result", json.toString());
			return "result";

		}
		JSONArray arr = new JSONArray();
		for (int i = 0; i < list.size(); i++) {
			JSONObject temp = new JSONObject();
			com.szty.aihao.dao.fitwear_app_Dao u = list.get(i);
			temp.put("apk_package_name", u.getPackagename());
			temp.put("apk_url", u.getM_apk());
			String cate = "";
			int msize = 0;
			int fsize = 0;
			try {
				cate = dic_cate.get(Integer.parseInt(u.getCategory())).getCatename();

			} catch (Exception ce) {

			}
			try {
				msize = Integer.parseInt(u.getM_apk_size().replace(",", ""));
			} catch (Exception ce) {

			}
			try {
				fsize = Integer.parseInt(u.getF_apk_size().replace(",", ""));
			} catch (Exception ce) {

			}
			int vcode = 0;
			try {
				vcode = Integer.parseInt(u.getVercode());
			} catch (Exception ce) {

			}
			temp.put("category_name", cate);
			temp.put("changelog", "");
			temp.put("company", "");
			temp.put("create_time", dateformat.format(u.getCreatetime()));
			temp.put("description", u.getDescript().replace("\r", "").replace("\n", ""));
			temp.put("developer_email", "");
			temp.put("developer_name", "");
			temp.put("dislike_num", 0);
			temp.put("download_count", 5242);
			temp.put("apk_url", u.getM_apk().replace(",", ""));
			temp.put("file_size", msize);
			temp.put("id", u.getId());
			temp.put("like_num", 0);
			temp.put("logo_url", u.getLogo().replace(",", ""));
			// temp.put("mms_apk_url", u.getM_apk().replace(",", ""));
			// temp.put("mms_file_size", msize);
			// temp.put("mms_wear_apk_url", u.getF_apk().replace(",", ""));
			// temp.put("mms_wear_file_size", fsize);
			temp.put("name", u.getAppname());
			temp.put("need_aw", 0);
			temp.put("privacy_policy", "");
			temp.put("score", 3);
			temp.put("summary", u.getSummary());
			temp.put("update_time", (u.getCreatetime().getTime() / 1000));
			temp.put("version", u.getVername());
			temp.put("version_code", vcode);
			temp.put("wear_apk_url", u.getF_apk().replace(",", ""));
			temp.put("wear_file_size", fsize);

			arr.add(temp);
		}
		json.put("data", arr);
		json.put("size", list.size());
		json.put("status", 0);

		model.addAttribute("result", json.toString());
		return "result";
	}

	@RequestMapping(value = "/detailid", method = RequestMethod.GET)
	public String detailById(Locale locale, Model model, HttpServletRequest request
	) {
		/* 20160106 修改 依据id 查询变更为依据包名查询  */
		String id = request.getParameter("id") == null ? "0" : request.getParameter("id");
		String p = request.getParameter("p") == null ? "1" : request.getParameter("p");
		String pn = request.getParameter("pn") == null ? "20" : request.getParameter("pn");
		com.szty.aihao.dao.fitwear_app_Dao dao = null;
		try {
			dic_cate = myService._sc_category.get_sc_category_Dictionary(" isdel=0");
			dao = myService._fitwear_app.get_fitwear_appDao(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		JSONObject json = new JSONObject();
		if (dao == null) {
			json.put("status", 0);
			json.put("size", 0);
			model.addAttribute("result", json.toString());
			return "result";

		}
		JSONArray arr = new JSONArray();

		JSONObject temp = new JSONObject();
		com.szty.aihao.dao.fitwear_app_Dao u = dao;
		temp.put("apk_package_name", u.getPackagename());
		temp.put("apk_url", u.getM_apk());
		String cate = "";
		int msize = 0;
		int fsize = 0;
		try {
			cate = dic_cate.get(Integer.parseInt(u.getCategory())).getCatename();

		} catch (Exception ce) {

		}
		try {
			msize = Integer.parseInt(u.getM_apk_size().replace(",", ""));
		} catch (Exception ce) {

		}
		try {
			fsize = Integer.parseInt(u.getF_apk_size().replace(",", ""));
		} catch (Exception ce) {

		}
		int vcode = 0;
		try {
			vcode = Integer.parseInt(u.getVercode());
		} catch (Exception ce) {

		}
		temp.put("category_name", cate);
		temp.put("changelog", "");
		temp.put("company", "");
		temp.put("create_time", dateformat.format(u.getCreatetime()));
		temp.put("description", u.getDescript().replace("\r", "").replace("\n", ""));
		temp.put("developer_email", "");
		temp.put("developer_name", "");
		temp.put("dislike_num", 0);
		temp.put("download_count", 5242);
		temp.put("apk_url", u.getM_apk().replace(",", ""));
		temp.put("file_size", msize);
		temp.put("id", u.getId());
		temp.put("like_num", 0);
		temp.put("logo_url", u.getLogo().replace(",", ""));
		// temp.put("mms_apk_url", u.getM_apk().replace(",", ""));
		// temp.put("mms_file_size", msize);
		// temp.put("mms_wear_apk_url", u.getF_apk().replace(",", ""));
		// temp.put("mms_wear_file_size", fsize);
		temp.put("name", u.getAppname());
		temp.put("need_aw", 0);
		temp.put("privacy_policy", "");
		temp.put("score", 3);
		temp.put("summary", u.getSummary());
		temp.put("update_time", (u.getCreatetime().getTime() / 1000));
		temp.put("version", u.getVername());
		temp.put("version_code", vcode);
		temp.put("wear_apk_url", u.getF_apk().replace(",", ""));
		temp.put("wear_file_size", fsize);

		arr.add(temp);

		json.put("data", arr);
		json.put("size", 1);
		json.put("status", 0);

		model.addAttribute("result", json.toString());
		return "result";
	}

	@RequestMapping(value = "/detailurl", method = RequestMethod.GET)
	public String detailByIdForApkUrl(Locale locale, Model model, HttpServletRequest request) {
		/* 20160106 修改 依据id 查询变更为依据包名查询  */
		String id = request.getParameter("id") == null ? "0" : request.getParameter("id");
		String p = request.getParameter("p") == null ? "1" : request.getParameter("p");
		String pn = request.getParameter("pn") == null ? "20" : request.getParameter("pn");
		com.szty.aihao.dao.fitwear_app_Dao dao = null;
		try {
			dic_cate = myService._sc_category.get_sc_category_Dictionary(" isdel=0");
			dao = myService._fitwear_app.get_fitwear_appDao(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONObject json = new JSONObject();
		if (dao == null) {
			json.put("status", 0);
			json.put("size", 0);
			model.addAttribute("result", json.toString());
			return "result";
		}
		JSONArray arr = new JSONArray();
		JSONObject temp = new JSONObject();
		com.szty.aihao.dao.fitwear_app_Dao u = dao;
		temp.put("apk_url", u.getM_apk());
//		arr.add(temp);
		json.put("data", temp);
		json.put("size", 1);
		json.put("status", 0);
		model.addAttribute("result", json.toString());
		return "result";
	}
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detailByPkg(Locale locale, Model model, HttpServletRequest request) {
		String pkg = request.getParameter("pkg")== null ? "rownull" : request.getParameter("pkg");
		String p = request.getParameter("p") == null ? "1" : request.getParameter("p");
		String pn = request.getParameter("pn") == null ? "20" : request.getParameter("pn");
		com.szty.aihao.dao.fitwear_app_Dao dao = null;
		try {
			dic_cate = myService._sc_category.get_sc_category_Dictionary(" isdel=0");

			/* 20160106 修改 依据id 查询变更为依据包名查询  */
			//dao = myService._fitwear_app.get_fitwear_appDao(Integer.parseInt(id));
			List<com.szty.aihao.dao.fitwear_app_Dao> list = myService._fitwear_app.get_fitwear_app_All("packagename='"+pkg+"'");
			if(! list.isEmpty()){
				dao = list.get(0);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		JSONObject json = new JSONObject();
		if (dao == null) {
			json.put("status", 0);
			json.put("size", 0);
			model.addAttribute("result", json.toString());
			return "result";

		}
		//JSONArray arr = new JSONArray();

		JSONObject temp = new JSONObject();
		com.szty.aihao.dao.fitwear_app_Dao u = dao;
		temp.put("apk_package_name", u.getPackagename());
		temp.put("apk_url", u.getM_apk());
		String cate = "";
		int msize = 0;
		int fsize = 0;
		try {
			cate = dic_cate.get(Integer.parseInt(u.getCategory())).getCatename();

		} catch (Exception ce) {

		}
		try {
			msize = Integer.parseInt(u.getM_apk_size().replace(",", ""));
		} catch (Exception ce) {

		}
		try {
			fsize = Integer.parseInt(u.getF_apk_size().replace(",", ""));
		} catch (Exception ce) {

		}
		int vcode = 0;
		try {
			vcode = Integer.parseInt(u.getVercode());
		} catch (Exception ce) {

		}
		temp.put("category_name", cate);
		temp.put("changelog", "");
		temp.put("company", "");
		temp.put("create_time", dateformat.format(u.getCreatetime()));
		temp.put("description", u.getDescript().replace("\r", "").replace("\n", ""));
		temp.put("developer_email", "");
		temp.put("developer_name", "");
		temp.put("dislike_num", 0);
		temp.put("download_count", 5242);
		temp.put("apk_url", u.getM_apk().replace(",", ""));
		temp.put("file_size", msize);
		temp.put("id", u.getId());
		temp.put("like_num", 0);
		temp.put("logo_url", u.getLogo().replace(",", ""));
		temp.put("name", u.getAppname());
		temp.put("need_aw", 0);
		temp.put("privacy_policy", "");
		temp.put("score", 3);
		temp.put("summary", u.getSummary());
		temp.put("update_time", (u.getCreatetime().getTime() / 1000));
		temp.put("version", u.getVername());
		temp.put("version_code", vcode);
		temp.put("wear_apk_url", u.getF_apk().replace(",", ""));
		temp.put("wear_file_size", fsize);
		//arr.add(temp);
		json.put("data", temp);
		json.put("size", 1);
		json.put("status", 0);

		model.addAttribute("result", json.toString());
		return "result";
	}

	@RequestMapping(value = "/stype", method = RequestMethod.GET)
	public String stype(Locale locale, Model model, HttpServletRequest request

	) {
		JSONObject json = new JSONObject();
		try {
			List<com.szty.aihao.dao.sc_category_Dao> list = myService._sc_category.get_sc_category_All(" isdel=0");

			JSONArray arr = new JSONArray();
			for (sc_category_Dao u : list) {
				JSONObject temp = new JSONObject();
				temp.put("id", u.getId());
				temp.put("name", u.getCatename());
				arr.add(temp);
			}
			json.put("data", arr);

			json.put("status", 0);

			model.addAttribute("result", json.toString());
			return "result";

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		json.put("status", 1);
		model.addAttribute("result", json.toString());
		return "result";
	}
}
