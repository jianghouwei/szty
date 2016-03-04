package com.szty.admobi.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.stzy.commos.page.model.PageModel;
import com.szty.commos.shiros.model.SysGroups;
import com.szty.commos.shiros.service.SysGroupsService;
import com.szty.framework.base.msg.ControllerMsg;

/**
 * 组别管理
 * ClassName: SysGroupController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月4日 下午3:37:49 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
@Controller
public class SysGroupController {

	@Autowired
	private SysGroupsService sysGroupsService;
	
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
	 * @param sysGroups
	 * @return
	 * @since JDK 1.7
	 */
	@RequestMapping(value = "/groupsList")
	public @ResponseBody String getgroupList(HttpServletRequest request,SysGroups sysGroups) {
		sysGroups.setLimitStart(0);
		sysGroups.setPageSize(10);
		PageModel<SysGroups,Object> page = sysGroupsService.queryPageSysGroups(sysGroups);
		return JSON.toJSONString(page);
	}

	@RequestMapping(value = "/groupsAdd")
	public @ResponseBody String setGroupsAdd(HttpServletRequest request , SysGroups sysGroups, String logo){
		sysGroupsService.saveSysGroups(sysGroups);
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/groupsEdit")
	public @ResponseBody String setGroupsEdit(HttpServletRequest request,SysGroups sysGroups, String logo) {
		sysGroupsService.updateSysGroups(sysGroups);
		
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/groupsDel")
	public @ResponseBody String setGroupsDel(HttpServletRequest request,SysGroups sysGroups, String logo) {
		sysGroupsService.delSysGroups(sysGroups.getId());
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/groupsView")
	public @ResponseBody String setGroupsView(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/groupsEnable")
	public @ResponseBody String setGroupsEnable(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/groupsUnEnable")
	public @ResponseBody String setGroupsUnEnable(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}
}
