package com.szty.commos.shiros.dao;

import com.szty.commos.shiros.model.SysResources;
import java.util.List;


/**
 * 
 * SysResourcesMapper数据库操作接口类
 * 
 */

public interface SysResourcesMapper{


	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( SysResources sysResources);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( SysResources sysResources);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	 public void saveBatchSysResources(List<SysResources> list);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey ( SysResources sysResources );

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
	 public SysResources  selectByPrimaryKey (Long id );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<SysResources>  queryList (SysResources sysResources);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<SysResources>  queryPageList(SysResources sysResources);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (SysResources sysResources);

}