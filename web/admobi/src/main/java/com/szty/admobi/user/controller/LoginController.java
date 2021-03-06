package com.szty.admobi.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登陆验证 ClassName: LoginController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月2日 下午1:08:49 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
@Controller
public class LoginController {

	/**
	 * 
	 * login:(登陆验证). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param request
	 * @param username
	 * @param password
	 * @return
	 * @since JDK 1.7
	 */
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request) {
		UsernamePasswordToken token = new UsernamePasswordToken();
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		//tring rememberMe = request.getParameter("RememberMe");
		//token.setRememberMe(true);
		token.setUsername(userName);
		token.setPassword(passWord.toCharArray());
		Subject user = SecurityUtils.getSubject(); 
		user.login(token);  
		request.getSession().setAttribute("user", user);
		return "index";

	}

}
