package com.szty.commos.shiros.dao;

import com.szty.commos.shiros.model.SysAuthority;
import java.util.List;


/**
 * 
 * SysAuthorityMapper数据库操作接口类
 * 
 */

public interface SysAuthorityMapper{


	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( SysAuthority sysAuthority);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( SysAuthority sysAuthority);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	 public void saveBatchSysAuthority(List<SysAuthority> list);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey ( SysAuthority sysAuthority );

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
	 public SysAuthority  selectByPrimaryKey (Long id );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<SysAuthority>  queryList (SysAuthority sysAuthority);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<SysAuthority>  queryPageList(SysAuthority sysAuthority);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (SysAuthority sysAuthority);

}