package com.szty.admobi.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.stzy.commos.page.model.PageModel;
import com.szty.commos.shiros.model.SysRoles;
import com.szty.commos.shiros.service.SysRolesService;
import com.szty.framework.base.msg.ControllerMsg;

/**
 *  角色管理
 * ClassName: SysRolesController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月4日 下午4:23:16 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
@Controller
public class SysRolesController {

	@Autowired
	private SysRolesService SysRolesService;
	
	/**
	 * 
	 * getgroupList:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param request
	 * @param SysRoles
	 * @return
	 * @since JDK 1.7
	 */
	@RequestMapping(value = "/rolesList")
	public @ResponseBody String getRolesList(HttpServletRequest request,SysRoles SysRoles) {
		SysRoles.setLimitStart(0);
		SysRoles.setPageSize(10);
		PageModel<SysRoles,Object> page = SysRolesService.queryPageSysRoles(SysRoles);
		return JSON.toJSONString(page);
	}

	@RequestMapping(value = "/rolesAdd")
	public @ResponseBody String setRolesAdd(HttpServletRequest request , SysRoles SysRoles, String logo){
		SysRolesService.saveSysRoles(SysRoles);
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/rolesEdit")
	public @ResponseBody String setRolesEdit(HttpServletRequest request,SysRoles SysRoles, String logo) {
		SysRolesService.updateSysRoles(SysRoles);
		
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/rolesDel")
	public @ResponseBody String setRolesDel(HttpServletRequest request,SysRoles SysRoles, String logo) {
		SysRolesService.delSysRoles(SysRoles.getId());
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/rolesView")
	public @ResponseBody String setRolesView(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/rolesEnable")
	public @ResponseBody String setRolesEnable(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/rolesUnEnable")
	public @ResponseBody String setRolesUnEnable(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}
}
