package com.szty.admobi.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * JSP 页面直接放行
 * ClassName: JspController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月3日 下午2:34:35 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
@Controller
public class JspController {

	/**
	 * 用户管理菜单过滤
	 * getJsp:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param request
	 * @return
	 * @since JDK 1.7
	 */
	@RequestMapping(value = "/sysmba/sysuser")
	public String getUsersJsp(HttpServletRequest request) {
		return "sysmba/sysuser";
		
	}
	/**
	 * 角色管理菜单过滤
	 * getRolesJsp:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param request
	 * @return
	 * @since JDK 1.7
	 */
	@RequestMapping(value = "sysmba/sysroles")
	public String getRolesJsp(HttpServletRequest request) {
		return "sysmba/sysroles";
		
	}
	/**
	 * 资源菜单过滤
	 * getresourcesJsp:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param request
	 * @return
	 * @since JDK 1.7
	 */
	@RequestMapping(value = "sysmba/sysresources")
	public String getresourcesJsp(HttpServletRequest request) {
		return "sysmba/sysresources";
		
	}
	/**
	 * 组别菜单过滤
	 * getGroupsJsp:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param request
	 * @return
	 * @since JDK 1.7
	 */
	@RequestMapping(value = "sysmba/sysgroups")
	public String getGroupsJsp(HttpServletRequest request) {
		return "sysmba/sysgroups";
		
	}
	
}
