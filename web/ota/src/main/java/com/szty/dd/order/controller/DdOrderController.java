package com.szty.dd.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szty.dd.order.model.DdMsg;
import com.szty.dd.order.model.DdOrder;
import com.szty.dd.order.service.DOrderUtils;
import com.szty.dd.order.service.DdOrderService;
import com.szty.framework.base.msg.RepMsg;
import com.szty.web.ota.controller.ResponseUtil;

/**
 * 滴滴下单 ClassName: DdOrderController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月21日 下午4:59:45 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
@Controller
public class DdOrderController {

	private static final Logger log = Logger.getLogger(DdOrderController.class);

	
	@Autowired
	private DdOrderService ddOrderService;
	
	@RequestMapping(value = "/getOrderId")
	public String getOrderId(HttpServletRequest request, HttpServletResponse response) {

		ResponseUtil.outJson(response, RepMsg.JsonMsg("orderId", DOrderUtils.getOrderId("dd")));
		
		return null;
	}

	@RequestMapping(value = "/setOrder")
	public String setOrder(HttpServletRequest request, HttpServletResponse response) {
		DdOrder ddOrder = new DdOrder();
//		String route_start = request.getParameter("route_start");// 开始地点
//		String route_end = request.getParameter("route_end");// 结束地点
//		if (route_start == null) {
//			ResponseUtil.outJson(response, RepMsg.JsonMsg("false", "手机号码为空"));
//			return null;
//		}
//		if (route_end == null) {
//			ResponseUtil.outJson(response, RepMsg.JsonMsg("false", "手机号码为空"));
//			return null;
//		}
//		ddOrder.setBef_lat(bef_lat);
//		ddOrder.setBef_lng(bef_lng);
		String phone = request.getParameter("phone");
		if (phone == null) {
			ResponseUtil.outJson(response, RepMsg.JsonMsg("false", "手机号码为空"));
			return null;
		}
		ddOrder.setBef_phone(phone);
		String orderId = ddOrderService.setLocOrder(ddOrder);
		ResponseUtil.outJson(response, RepMsg.JsonMsg("true", "ok"));
		return orderId;
	}

	@RequestMapping(value = "/pushReply")
	public String setDdMsg(HttpServletRequest request, HttpServletResponse response,DdOrder ddorder) {
		System.out.println("请求一次。。。。");
		String order_id = request.getParameter("order_id");
		log.info("滴滴回掉接口订单号【【【【【【" + order_id + "】】】】】】】】】】】】】】】】】】");
		ddOrderService.upOrder(ddorder);
		ResponseUtil.outJson(response, DdMsg.JsonMsg("0", "ok"));
		return null;
	}
}
