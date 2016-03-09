package com.szty.admobi.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.szty.commos.page.model.PageModel;
import com.szty.commos.shiro.utils.EndecryptUtils;
import com.szty.commos.shiros.model.SysUsers;
import com.szty.commos.shiros.service.SysUsersService;
import com.szty.framework.base.msg.ControllerMsg;

/**
 * 会员管理 ClassName: SysUsersController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月2日 下午3:27:37 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
@Controller
public class SysUsersController {
	
	@Autowired
	private SysUsersService sysUsersService;

	/**
	 * 
	 * getUsersList:(查询所有会员). <br/>
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
	@RequestMapping(value = "/usersList")
	public @ResponseBody String getUsersList(HttpServletRequest request,SysUsers sysUsers) {
		sysUsers.setLimitStart(0);
		sysUsers.setPageSize(10);
		PageModel<SysUsers,Object> page = sysUsersService.queryPageSysUser(sysUsers);
		return JSON.toJSONString(page);
	}

	/**
	 * 
	 * setUsersAdd:(会员新增). <br/>
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
	@RequestMapping(value = "/usersAdd")
	public @ResponseBody String setUsersAdd(HttpServletRequest request , SysUsers sysUsers, String logo){
		sysUsers.setUserPassword(EndecryptUtils.md5Password("123456"));
		sysUsersService.saveSysUser(sysUsers);
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	/**
	 * 
	 * setUsersEdit:(会员编辑). <br/>
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
	@RequestMapping(value = "/usersEdit")
	public @ResponseBody String setUsersEdit(HttpServletRequest request,SysUsers sysUsers, String logo) {
		sysUsersService.updateSysUser(sysUsers);
		
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	/**
	 * 
	 * setUsersDel:(会员--删除). <br/>
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
	@RequestMapping(value = "/usersDel")
	public @ResponseBody String setUsersDel(HttpServletRequest request,SysUsers sysUsers, String logo) {
		sysUsersService.delSysUser(sysUsers.getId());
		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	/**
	 * 
	 * setUsersView:(会员查看). <br/>
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
	@RequestMapping(value = "/usersView")
	public @ResponseBody String setUsersView(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	/**
	 * 
	 * setUsersEnable:(会员禁用). <br/>
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
	@RequestMapping(value = "/usersEnable")
	public @ResponseBody String setUsersEnable(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

	/**
	 * 
	 * setUsersUnEnable:(会员启用). <br/>
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
	@RequestMapping(value = "/usersUnEnable")
	public @ResponseBody String setUsersUnEnable(HttpServletRequest request) {

		return JSON.toJSONString(new ControllerMsg("ok","成功")); 
	}

}
