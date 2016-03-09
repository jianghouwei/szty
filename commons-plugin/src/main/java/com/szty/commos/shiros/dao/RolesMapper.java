package com.szty.commos.shiros.dao;

import java.util.List;

import com.szty.commos.shiros.model.dto.RolesUsersModel;

/**
 * 
 * SysRolesMapper数据库操作接口类
 * 
 */

public interface RolesMapper {

	/**
	 * 
	 * 依据用户名查询当前用户所有角色
	 * 
	 **/
	public List<String> queryRolesListByUserName(String userName);

	/**
	 * 
	 * 依据用户名查询当前用户所有角色
	 * 
	 **/
	public List<RolesUsersModel> queryRolesListByuserId();

}