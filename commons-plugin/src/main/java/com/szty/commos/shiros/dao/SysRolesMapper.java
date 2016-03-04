package com.szty.commos.shiros.dao;

import com.szty.commos.shiros.model.SysRoles;
import java.util.List;


/**
 * 
 * SysRolesMapper数据库操作接口类
 * 
 */

public interface SysRolesMapper{


	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( SysRoles sysRoles);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( SysRoles sysRoles);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	 public void saveBatchSysRoles(List<SysRoles> list);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey ( SysRoles sysRoles );

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
	 public SysRoles  selectByPrimaryKey (Long id );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<SysRoles>  queryList (SysRoles sysRoles);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<SysRoles>  queryPageList(SysRoles sysRoles);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (SysRoles sysRoles);

}