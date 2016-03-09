package com.szty.admobi.user.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.szty.commos.shiros.model.SysRoles;
import com.szty.commos.shiros.model.SysUsers;
import com.szty.commos.shiros.model.dto.OntreeModel;
import com.szty.commos.shiros.model.dto.RolesUsersModel;
import com.szty.commos.shiros.service.SysRolesService;
import com.szty.commos.shiros.service.SysUsersService;
import com.szty.commos.shiros.service.UserRolesService;
import com.szty.framework.base.msg.ControllerMsg;

/**
 * 用户角色分配
 * ClassName: RolesUsersController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月9日 下午5:48:53 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
@Controller
public class RolesUsersController {

	@Autowired
	private SysUsersService sysUsersService;
	
	@Autowired
	private SysRolesService sysRolesService;
	
	@Autowired
	private UserRolesService userRolesService;
	
	
	
	@RequestMapping(value = "/rolesUsers")
	public @ResponseBody String setRolesUsers(HttpServletRequest request, String userIds , String roleIds) {
		System.out.println(userIds + ">>>>:" + roleIds);
		String[] userId = userIds.split(",");
		String[] roleId = roleIds.split(",");
		List<Long> uIds = this.listStringToLong(userId);
		List<Long> rIds = this.listStringToLong(roleId);
		userRolesService.saveUserRole(uIds, rIds);
		return JSON.toJSONString(new ControllerMsg("ok", "成功"));

	}
	
	

	/**
	 * 
	 * getUserTree:(这里用一句话描述这个方法的作用). <br/>
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
	@RequestMapping(value = "/usersTrees")
	public @ResponseBody String getUserTree(HttpServletRequest request) {
		SysUsers sysUsers = new SysUsers();
		List<SysUsers> list = sysUsersService.queryList(sysUsers);
		List<OntreeModel>  trees = new ArrayList<OntreeModel>();
		for(SysUsers su : list){
			OntreeModel  onTree = new OntreeModel();
			onTree.setId(su.getId().toString());
			onTree.setText(su.getUserName());
			trees.add(onTree);
		}
		return JSON.toJSONString(trees);

	}
	
	/**
	 * 
	 * getUserTree:(这里用一句话描述这个方法的作用). <br/>
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
	@RequestMapping(value = "/rolesTrees")
	public @ResponseBody String getRolesTree(HttpServletRequest request) {
		SysRoles sysRoles = new SysRoles();
		List<SysRoles> list = sysRolesService.queryList(sysRoles);
		List<OntreeModel>  trees = new ArrayList<OntreeModel>();
		for(SysRoles sr : list){
			OntreeModel  onTree = new OntreeModel();
			onTree.setId(sr.getId().toString());
			onTree.setText(sr.getRoleName());
			trees.add(onTree);
		}
		return JSON.toJSONString(trees);

	}
	
	/**
	 * 
	 * getUserTree:(这里用一句话描述这个方法的作用). <br/>
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
	@RequestMapping(value = "/rolesCheckTrees")
	public @ResponseBody String getCheckRolesTree(HttpServletRequest request,Long userId) {
		List<RolesUsersModel> list = userRolesService.queryRolesListByuserId();
		List<OntreeModel>  trees = new ArrayList<OntreeModel>();
		for(RolesUsersModel sr : list){
			OntreeModel  onTree = new OntreeModel();
			onTree.setId(sr.getRolesId().toString());
			onTree.setText(sr.getRoleName());
			if(userId != null && userId.equals(sr.getUsersId())){
				onTree.setChecked(Boolean.TRUE);
			}else{
				onTree.setChecked(Boolean.FALSE);
			}
			trees.add(onTree);
		}
		return JSON.toJSONString(trees);

	}
	
	/**
	 * String 数组转换成List<Long>
	 * listStringToLong:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param strs
	 * @return
	 * @since JDK 1.7
	 */
	protected List<Long> listStringToLong(String[] strs){
		if(strs == null || strs.length == 0){
			return null;
		}
		List<Long> list = new ArrayList<Long>();
		for(String str : strs){
			list.add(Long.valueOf(str));
		}
		return list;
		
	}

}
