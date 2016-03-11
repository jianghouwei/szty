package com.szty.web.ota.controller;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

public class ResponseUtil {
	
	private static final Logger logs = Logger.getLogger(ResponseUtil.class);
	
	public static void outJson(HttpServletResponse response,String json){
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("application/json;charset=UTF-8");
		try{
			logs.debug(json);
			response.getWriter().write(json);
			response.getWriter().flush();
			response.getWriter().close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void outHtml(HttpServletResponse response,String json){
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("text/html; charset=UTF-8");
		try{
            logs.debug(json);
			response.getWriter().write(json);
			response.getWriter().flush();
			response.getWriter().close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void outScript(HttpServletResponse response,String json){
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("application/javascript;charset=UTF-8");
		try{
			response.getWriter().write(json);
			response.getWriter().flush();
			response.getWriter().close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void outtoxml(String xml, HttpServletResponse response) {
		response.setContentType("text/xml; charset=utf-8");
		// //通过Response对象,设置输出格式是xml的
		response.setHeader("Cache-Control", "no-cache"); // 取消浏览器缓存
		PrintWriter out = null;
		try {
			response.getWriter().write(xml);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 发送文本。使用UTF-8编码。
	 * 
	 * @param response
	 *            HttpServletResponse
	 * @param text
	 *            发送的字符串
	 */
	public static void renderText(HttpServletResponse response,HashMap<String,String>headers, String text) throws Exception{
		render(response, headers, "text/plain;charset=UTF-8", text);
	}

	/**
	 * 发送json。使用UTF-8编码。
	 * 
	 * @param response
	 *            HttpServletResponse
	 * @param text
	 *            发送的字符串
	 */
	public static void renderJson(HttpServletResponse response,HashMap<String,String>headers, String text) throws Exception{
		render(response,headers, "application/json;charset=UTF-8", text);
	}

	/**
	 * 发送xml。使用UTF-8编码。
	 * 
	 * @param response
	 *            HttpServletResponse
	 * @param text
	 *            发送的字符串
	 */
	public static void renderXml(HttpServletResponse response,HashMap<String,String>headers, String text) throws Exception{
		render(response,headers, "text/xml;charset=UTF-8", text) ;
	}
	
	/**
	 * 发送html。使用UTF-8编码。
	 * 
	 * @param param 参数
	 * @param method 方法名
	 */
	public static void renderJs(HttpServletResponse response,String param, String method){
		response.setContentType("text/html; charset=UTF-8");
		try{
			StringBuilder str=new StringBuilder();
			str.append("<script>").append(method+"('");
			str.append(param);
			str.append("');</script>");
			//response.setContentLength(str.toString().getBytes("utf-8").length);
			PrintWriter out =response.getWriter();
			out.write(str.toString());
			out.flush();
			out.close();
		}catch(IOException e){
			logs.error(e.getMessage(),e);
		}
	}
	/**
	 * 发送内容。 使用utf-8编码
	 * @param response
	 * @param contentType
	 * @param text
	 */
	public static void render(HttpServletResponse response, HashMap<String,String>headers,
			String contentType,String text) throws Exception{
		Set<String> keyNames =headers.keySet();
		for(String hName:keyNames){
			response.addHeader(hName, headers.get(hName));
		}
		response.setContentType(contentType);
		response.setContentLength(text.getBytes("utf-8").length);
		logs.debug("text = "+text);
		response.getWriter().write(text);
		response.getWriter().flush();
		response.getWriter().close();
	}
}
