package com.szty.commos.shiros.dao;

import com.szty.commos.shiros.model.SysGroups;
import java.util.List;


/**
 * 
 * SysGroupsMapper数据库操作接口类
 * 
 */

public interface SysGroupsMapper{


	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( SysGroups sysGroups);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( SysGroups sysGroups);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	 public void saveBatchSysGroups(List<SysGroups> list);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey ( SysGroups sysGroups );

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
	 public SysGroups  selectByPrimaryKey (Long id );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<SysGroups>  queryList (SysGroups sysGroups);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<SysGroups>  queryPageList(SysGroups sysGroups);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (SysGroups sysGroups);

}