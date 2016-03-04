package com.szty.commos.shiros.dao;

import com.szty.commos.shiros.model.SysUsers;
import java.util.List;


/**
 * 
 * SysUsersMapper数据库操作接口类
 * 
 */

public interface SysUsersMapper{


	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( SysUsers sysUsers);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( SysUsers sysUsers);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	 public void saveBatchSysUsers(List<SysUsers> list);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey ( SysUsers sysUsers );

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
	 public SysUsers  selectByPrimaryKey (Long id );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<SysUsers>  queryList (SysUsers sysUsers);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<SysUsers>  queryPageList(SysUsers sysUsers);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (SysUsers sysUsers);

}