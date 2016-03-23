package com.szty.wxyd.model;

/**
 *  
 * @ClassName: QrcodeMode
 * @Description: TODO(获取deviceid和二维码)
 * @author mao.ru
 * @date 2016年1月12日 下午4:16:04
 *
 */
public class QrcodeMode {

	private ReqModel base_resp;
	
	private String deviceid;//设备id
	
	private String qrticket;//设备二维码生产串 


	public ReqModel getBase_resp() {
		return base_resp;
	}

	public void setBase_resp(ReqModel base_resp) {
		this.base_resp = base_resp;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getQrticket() {
		return qrticket;
	}

	public void setQrticket(String qrticket) {
		this.qrticket = qrticket;
	}
	
	
}
