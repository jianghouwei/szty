package com.szty.admobi.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.stzy.commos.page.model.PageModel;
import com.szty.commos.shiros.model.SysResources;
import com.szty.commos.shiros.service.SysResourcesService;
import com.szty.framework.base.msg.ControllerMsg;

/**
 * 资源管理（页面+页面按钮 如增删改查）
 * ClassName: SysResourcesController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月4日 下午4:26:33 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
@Controller
public class SysResourcesController {

	@Autowired
	private SysResourcesService SysResourcesService;
	
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
	 * @param SysResources
	 * @return
	 * @since JDK 1.7
	 */
	@RequestMapping(value = "/resourcesList")
	public @ResponseBody String getResourcesList(HttpServletRequest request,SysResources SysResources) {
		SysResources.setLimitStart(0);
		SysResources.setPageSize(10);
		PageModel<SysResources,Object> page = SysResourcesService.queryPageSysResources(SysResources);
		return JSON.toJSONString(page);
	}

	@RequestMapping(value = "/resourcesAdd")
	public @ResponseBody String setResourcesAdd(HttpServletRequest request , SysResources SysResources, String logo){
		SysResourcesService.saveSysResources(SysResources);
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/resourcesEdit")
	public @ResponseBody String setResourcesEdit(HttpServletRequest request,SysResources SysResources, String logo) {
		SysResourcesService.updateSysResources(SysResources);
		
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/resourcesDel")
	public @ResponseBody String setResourcesDel(HttpServletRequest request,SysResources SysResources, String logo) {
		SysResourcesService.delSysResources(SysResources.getId());
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/resourcesView")
	public @ResponseBody String setResourcesView(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/resourcesEnable")
	public @ResponseBody String setResourcesEnable(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	@RequestMapping(value = "/resourcesUnEnable")
	public @ResponseBody String setResourcesUnEnable(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}
}
