package com.szty.dd.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.szty.dd.order.dao.DdOrderMapper;
import com.szty.dd.order.model.DdOrder;
import com.szty.dd.order.service.DOrderUtils;
import com.szty.dd.order.service.DdOrderService;

@Service
public class DdOrderServiceImpl implements DdOrderService{

	
	@Autowired
	private DdOrderMapper ddOrderMapper;
	
	@Override
	public String setLocOrder(DdOrder ddOrder) {
		ddOrder.setOrder_id(DOrderUtils.getOrderId("dd"));
		ddOrderMapper.save(ddOrder);
		return ddOrder.getOrder_id();
	}

	@Override
	public String upOrder(DdOrder ddOrder) {
		DdOrder  dd = ddOrderMapper.selectByPrimaryKey(ddOrder.getOrder_id());
		if(dd == null){
			return "noorder";
		}
		ddOrderMapper.upOrderByOrderIdAndPhone(ddOrder);
		//通知手机
		String msg = JSON.toJSONString(ddOrder);
		DOrderUtils.sendAndroidPn(dd.getBef_phone(), msg);
		DOrderUtils.sendAndroidPn("18818200818", msg);
		return "ok";
	}

	@Override
	public Boolean findOderByPhone(String phone) {
		int count = ddOrderMapper.findOderByPhone(phone);
		if(count == 0){
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	
	

}
