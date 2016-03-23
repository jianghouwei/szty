package com.szty.wxyd.model;

public class RespAuthorize extends ReqModel{

	private BaseInfo base_info;

	public BaseInfo getBase_info() {
		return base_info;
	}

	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}


	class BaseInfo {

		private String device_type;
		private String device_id;

		public String getDevice_type() {
			return device_type;
		}

		public void setDevice_type(String device_type) {
			this.device_type = device_type;
		}

		public String getDevice_id() {
			return device_id;
		}

		public void setDevice_id(String device_id) {
			this.device_id = device_id;
		}

	}

}
