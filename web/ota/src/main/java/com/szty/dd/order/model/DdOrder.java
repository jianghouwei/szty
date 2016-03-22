package com.szty.dd.order.model;

/**
 * 滴滴订单 ClassName: DdOrder <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月22日 上午9:58:53 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
public class DdOrder {

	private Long id;

	private String bef_lng;

	private String bef_lat;

	private String bef_phone;

	private String src_type;
	private String order_id;
	private String third_order_id;
	private String lng;
	private String lat;
	private String driver_name;
	private String taxi_no;
	private String taxi_company;
	private String phone;
	private String photo_url;
	private String nonce;
	private String timestamp;
	private String token;
	private String order_num;
	private String praise_num;
	private String channel;

	private String errno;

	private String nerrmsg;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSrc_type() {
		return src_type;
	}

	public void setSrc_type(String src_type) {
		this.src_type = src_type;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getThird_order_id() {
		return third_order_id;
	}

	public void setThird_order_id(String third_order_id) {
		this.third_order_id = third_order_id;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getDriver_name() {
		return driver_name;
	}

	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}

	public String getTaxi_no() {
		return taxi_no;
	}

	public void setTaxi_no(String taxi_no) {
		this.taxi_no = taxi_no;
	}

	public String getTaxi_company() {
		return taxi_company;
	}

	public void setTaxi_company(String taxi_company) {
		this.taxi_company = taxi_company;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto_url() {
		return photo_url;
	}

	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getOrder_num() {
		return order_num;
	}

	public void setOrder_num(String order_num) {
		this.order_num = order_num;
	}

	public String getPraise_num() {
		return praise_num;
	}

	public void setPraise_num(String praise_num) {
		this.praise_num = praise_num;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getBef_lng() {
		return bef_lng;
	}

	public void setBef_lng(String bef_lng) {
		this.bef_lng = bef_lng;
	}

	public String getBef_lat() {
		return bef_lat;
	}

	public void setBef_lat(String bef_lat) {
		this.bef_lat = bef_lat;
	}

	public String getBef_phone() {
		return bef_phone;
	}

	public void setBef_phone(String bef_phone) {
		this.bef_phone = bef_phone;
	}

	public String getErrno() {
		return errno;
	}

	public void setErrno(String errno) {
		this.errno = errno;
	}

	public String getNerrmsg() {
		return nerrmsg;
	}

	public void setNerrmsg(String nerrmsg) {
		this.nerrmsg = nerrmsg;
	}

	@Override
	public String toString() {
		return "DdOrder [id=" + id + ", bef_lng=" + bef_lng + ", bef_lat=" + bef_lat + ", bef_phone=" + bef_phone
				+ ", src_type=" + src_type + ", order_id=" + order_id + ", third_order_id=" + third_order_id + ", lng="
				+ lng + ", lat=" + lat + ", driver_name=" + driver_name + ", taxi_no=" + taxi_no + ", taxi_company="
				+ taxi_company + ", phone=" + phone + ", photo_url=" + photo_url + ", nonce=" + nonce + ", timestamp="
				+ timestamp + ", token=" + token + ", order_num=" + order_num + ", praise_num=" + praise_num
				+ ", channel=" + channel + ", errno=" + errno + ", nerrmsg=" + nerrmsg + "]";
	}

}
