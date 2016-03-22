package com.szty.dd.order.service;

import com.szty.dd.order.model.DdOrder;

/**
 * 滴滴下单service
 * ClassName: DdOrderService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月21日 下午5:01:05 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public interface DdOrderService {

	
	/**
	 * 写入订单
	 * setLocOrder:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param ddOrder
	 * @return
	 * @since JDK 1.7
	 */
	String setLocOrder(DdOrder ddOrder);
	
	
	
	/**
	 * 更新订单
	 * upOrder:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param ddOrder
	 * @return
	 * @since JDK 1.7
	 */
	String upOrder(DdOrder ddOrder);
	
	Boolean findOderByPhone(String phone);
	
}
