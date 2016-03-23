package com.szty.aihao.page;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login {

	public static String getDo(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String username = request.getParameter("ddname") == null ? "" : request
				.getParameter("ddname");
		String pass = request.getParameter("ddpass") == null ? "" : request
				.getParameter("ddpass");
		String post = request.getParameter("post") == null ? "" : request
				.getParameter("post");
		String checkC = request.getParameter("rand") == null ? "" : request
				.getParameter("rand");
		System.out.println("post:" + post + "," + username + "," + pass);
		String[] ad = new String[] { "admin", "wangna", "monica","liantong","dengrenguang"};
		String[] passstr = new String[] { "admin", "123456", "123456","liantong","dengrenguang"};
		String[] flag = new String[] { "ALL", "STA" , "STA","STA","STD"};
		if (post.equals("posted")) {
			for (int i = 0; i < ad.length; i++) {
				if (username.equals(ad[i]) & pass.equals(passstr[i])) {
					System.out.println("post:right");
					String cookieName = "99managedff";
					Cookie cookie = new Cookie(cookieName, flag[i]);
					cookie.setMaxAge(8 * 3600);
					response.addCookie(cookie);
					response.sendRedirect("index");
					return "";
				} else {
					System.out.println("post:error");
					if (i ==( ad.length - 1)) {
						return "<script type='text/javascript'>alert('�û�������벻����');</script>";
					}
				}
			}
		}

		return "";
	}
}
