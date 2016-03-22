package com.szty.dd.order.dao;

import java.util.List;

import com.szty.dd.order.model.DdOrder;

public interface DdOrderMapper {

	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( DdOrder ddOrder);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( DdOrder ddOrder);


	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	 public int updateBySelective( DdOrder ddOrder);
	 
	 
	 /**
	  * 依据orderID  ophone
	  * upOrderByOrderIdAndPhone:(这里用一句话描述这个方法的作用). <br/>
	  * TODO(这里描述这个方法适用条件 – 可选).<br/>
	  * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	  * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	  * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	  *
	  * @author mao.ru
	  * @param ddOrder
	  * @since JDK 1.7
	  */
	 void upOrderByOrderIdAndPhone( DdOrder ddOrder);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey( DdOrder ddOrder);


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	 public DdOrder  selectByPrimaryKey (String orderId );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<DdOrder>  queryList (DdOrder ddOrder);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<DdOrder>  queryPageList(DdOrder ddOrder);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (DdOrder ddOrder);
	 
	 /**
	  * 查询当前手机号码是否可以再次下单！
	  * */
	 public Integer findOderByPhone(String phone);
}
