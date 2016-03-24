package com.szty.ahnew.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.szty.ahnew.model.ReqTrainModel;
import com.szty.ahnew.model.TrainContent;
import com.szty.ahnew.service.BaiduTrainService;
import com.szty.ahnew.util.DateStyle;
import com.szty.ahnew.util.DateUtil;
import com.szty.ahnew.util.ResponseMsg;
import com.szty.ahnew.util.Utils;

/**
 * 
 * @ClassName: BaiDuApiAction
 * @Description: TODO(百度Api平台接口调用)
 * @author mao.ru
 * @date 2016年1月20日 上午10:15:29
 *
 */
@Controller
public class BaiDuApiAction {

	@Autowired
	private BaiduTrainService baiduTrainService;

	/**
	 * 
	 * @Title: bind
	 * @author mao.ru
	 * @Description: TODO(获取列车数据)
	 * @param @param setModel
	 * @param @return
	 * @param @throws Exception 设定文件
	 * @return String 返回类型
	 * @throws @RequestBody ReqTrainModel reqTrainModel ,
	 */
	@RequestMapping(value = "/getTrain", method = { RequestMethod.GET },produces = "text/html;charset=UTF-8")
	public String getTrain(HttpServletRequest request) throws Exception {
		// @RequestParam("version") String version,
		// @RequestParam("train") String train,
		// @RequestParam("from") String from, @RequestParam("to") String to,
		// @RequestParam("date") String date,
		// @RequestParam("userId") String userId
		// private String ;//请求用户
		ReqTrainModel reqTrainModel = new ReqTrainModel();
		String version = request.getParameter("version");
		String train = request.getParameter("train");
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String date = request.getParameter("date");
		String userId = request.getParameter("userId");
		if(from != null && to != null){
			try {
				from = new String(from.getBytes("ISO8859-1"), "UTF-8");
				to = new String(to.getBytes("ISO8859-1"), "UTF-8");
			} catch (UnsupportedEncodingException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
		if (Utils.isEmpty(date)
				|| !DateUtil.isValidDate(date, DateStyle.YYYY_MM_DD)) {
			return JSON.toJSONString(new ResponseMsg("error",
					"查询时间不能为空切必须为:YYYY-MM-DD格式"));
		}
		// 车次和始末站不能同时为空
		if (!(!Utils.isEmpty(train) || (!Utils.isEmpty(from) && !Utils.isEmpty(to)))) {
			return JSON
					.toJSONString(new ResponseMsg("error", "车次和出发到达站点不能同时为空"));
		}
		//ReqTrainModel reqTrainModel = new ReqTrainModel();
		reqTrainModel.setDate(date);
		reqTrainModel.setFrom(from);
		reqTrainModel.setTo(to);
		reqTrainModel.setTrain(train);
		reqTrainModel.setUserId(userId);
		reqTrainModel.setVersion(version);
		if (Utils.isEmpty(train)) {
			TrainContent content = baiduTrainService.getTrainS2S(reqTrainModel);
			return JSON
					.toJSONString(new ResponseMsg("success", "查询成功", content));
		} else {
			TrainContent content = baiduTrainService
					.getTrainDetail(reqTrainModel);
			return JSON
					.toJSONString(new ResponseMsg("success", "查询成功", content));
		}
	}

}
