package com.szty.commos.shiros.dao;

import com.szty.commos.shiros.model.SysUsersRoles;
import java.util.List;


/**
 * 
 * SysUsersRolesMapper数据库操作接口类
 * 
 */

public interface SysUsersRolesMapper{


	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( SysUsersRoles sysUsersRoles);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( SysUsersRoles sysUsersRoles);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	 public void saveBatchSysUsersRoles(List<SysUsersRoles> list);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey ( SysUsersRoles sysUsersRoles );

	/**
	 * 
	 * 删除 
	 * 
	 **/
	 public void delByPrimaryKey (Long id );


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	 public SysUsersRoles  selectByPrimaryKey (Long id );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<SysUsersRoles>  queryList (SysUsersRoles sysUsersRoles);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<SysUsersRoles>  queryPageList(SysUsersRoles sysUsersRoles);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (SysUsersRoles sysUsersRoles);

}