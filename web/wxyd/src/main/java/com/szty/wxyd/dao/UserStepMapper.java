package com.szty.wxyd.dao;

import com.szty.wxyd.data.model.UserStep;
import java.util.List;

/**
 * 
 * UserStepMapper数据库操作接口类
 * 
 */

public interface UserStepMapper {

	/**
	 * 
	 * 添加
	 * 
	 **/
	public void save(UserStep userStep);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	public void saveBySelective(UserStep userStep);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	public void saveBatchUserStep(List<UserStep> list);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	public int updateBySelective(UserStep userStep);

	/**
	 * 
	 * 主键ID修改
	 * 
	 **/
	public int updateByPrimaryKey(UserStep userStep);

	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public UserStep selectByPrimaryKey(Long id);

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	public List<UserStep> queryList(UserStep userStep);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	public List<UserStep> queryPageList(UserStep userStep);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	public Integer queryPageCount(UserStep userStep);

	/**
	 * 查询最新一条记录
	 * 
	 * @Title: queryListByMaxCreatTime
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param userStep
	 * @param @return 设定文件
	 * @return UserStep 返回类型
	 * @throws
	 */
	public UserStep queryListByMaxCreatTime(UserStep userStep);

}