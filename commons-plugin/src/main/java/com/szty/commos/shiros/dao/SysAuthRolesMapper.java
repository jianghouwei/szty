package com.szty.commos.shiros.dao;

import com.szty.commos.shiros.model.SysAuthRoles;
import java.util.List;


/**
 * 
 * SysAuthRolesMapper数据库操作接口类
 * 
 */

public interface SysAuthRolesMapper{


	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( SysAuthRoles sysAuthRoles);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( SysAuthRoles sysAuthRoles);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	 public void saveBatchSysAuthRoles(List<SysAuthRoles> list);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey ( SysAuthRoles sysAuthRoles );

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
	 public SysAuthRoles  selectByPrimaryKey (Long id );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<SysAuthRoles>  queryList (SysAuthRoles sysAuthRoles);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<SysAuthRoles>  queryPageList(SysAuthRoles sysAuthRoles);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (SysAuthRoles sysAuthRoles);

}