package com.szty.commos.shiros.dao;

import com.szty.commos.shiros.model.SysGroupsRoles;
import java.util.List;


/**
 * 
 * SysGroupsRolesMapper数据库操作接口类
 * 
 */

public interface SysGroupsRolesMapper{


	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( SysGroupsRoles sysGroupsRoles);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( SysGroupsRoles sysGroupsRoles);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	 public void saveBatchSysGroupsRoles(List<SysGroupsRoles> list);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey ( SysGroupsRoles sysGroupsRoles );

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
	 public SysGroupsRoles  selectByPrimaryKey (Long id );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<SysGroupsRoles>  queryList (SysGroupsRoles sysGroupsRoles);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<SysGroupsRoles>  queryPageList(SysGroupsRoles sysGroupsRoles);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (SysGroupsRoles sysGroupsRoles);

}