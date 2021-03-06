package com.szty.wxyd.model;

import java.util.List;

/**
 * 
 * @ClassName: ResDeviceModel
 * @Description: TODO(设备授权请求)
 * @author mao.ru
 * @date 2016年1月12日 下午4:54:28
 *
 */
public class ResDeviceModel {

	private String device_num;

	private List<DeviceModel> device_list;

	private String op_type;

	private String product_id;
	public String getDevice_num() {
		return device_num;
	}

	public void setDevice_num(String device_num) {
		this.device_num = device_num;
	}

	public List<DeviceModel> getDevice_list() {
		return device_list;
	}

	public void setDevice_list(List<DeviceModel> device_list) {
		this.device_list = device_list;
	}

	public String getOp_type() {
		return op_type;
	}

	public void setOp_type(String op_type) {
		this.op_type = op_type;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	

}
