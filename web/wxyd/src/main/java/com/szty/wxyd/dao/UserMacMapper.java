package com.szty.wxyd.dao;

import com.szty.wxyd.data.model.UserMac;
import java.util.List;


/**
 * 
 * UserMacMapper数据库操作接口类
 * 
 */

public interface UserMacMapper{


	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( UserMac userMac);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( UserMac userMac);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	 public void saveBatchUserMac(List<UserMac> list);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	 public int updateBySelective( UserMac userMac);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey( UserMac userMac);


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	 public UserMac  selectByPrimaryKey (Long id );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<UserMac>  queryList (UserMac userMac);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<UserMac>  queryPageList(UserMac userMac);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (UserMac userMac);

}