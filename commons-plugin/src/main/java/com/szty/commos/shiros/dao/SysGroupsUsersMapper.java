package com.szty.commos.shiros.dao;

import com.szty.commos.shiros.model.SysGroupsUsers;
import java.util.List;


/**
 * 
 * SysGroupsUsersMapper数据库操作接口类
 * 
 */

public interface SysGroupsUsersMapper{


	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( SysGroupsUsers sysGroupsUsers);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( SysGroupsUsers sysGroupsUsers);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	 public void saveBatchSysGroupsUsers(List<SysGroupsUsers> list);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey ( SysGroupsUsers sysGroupsUsers );

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
	 public SysGroupsUsers  selectByPrimaryKey (Long id );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<SysGroupsUsers>  queryList (SysGroupsUsers sysGroupsUsers);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<SysGroupsUsers>  queryPageList(SysGroupsUsers sysGroupsUsers);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (SysGroupsUsers sysGroupsUsers);

}