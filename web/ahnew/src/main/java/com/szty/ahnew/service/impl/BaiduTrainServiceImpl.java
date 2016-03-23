package com.szty.ahnew.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.szty.ahnew.detail.model.DetailData;
import com.szty.ahnew.detail.model.Info;
import com.szty.ahnew.detail.model.RepDetailTrain;
import com.szty.ahnew.model.ReqTrainModel;
import com.szty.ahnew.model.TrainContent;
import com.szty.ahnew.model.TrainData;
import com.szty.ahnew.model.TrainDetailModel;
import com.szty.ahnew.model.TrainParams;
import com.szty.ahnew.model.TrainSeatModel;
import com.szty.ahnew.service.BaiduTrainService;
import com.szty.ahnew.sts.model.RepSTSTrain;
import com.szty.ahnew.sts.model.SeatInfo;
import com.szty.ahnew.sts.model.Train;
import com.szty.ahnew.util.HttpUtil;
import com.szty.ahnew.util.Utils;

@Service
public class BaiduTrainServiceImpl implements BaiduTrainService {

	private final static String baiduVersion = "1.0";
	private final static String traindetailUrl = "http://apis.baidu.com/qunar/qunar_train_service/traindetail";
	private final static String trainStsUrl = "http://apis.baidu.com/qunar/qunar_train_service/s2ssearch";
	private final static String baiDuApiKey = "06bd3adcc88f75f7201e8a8ac04a5302";

//	@Autowired
//	private ApiUtilConfing apiUtil;

	public TrainContent getTrainDetail(ReqTrainModel reqTrainModel) {
		TrainContent tr = new TrainContent();
		RepDetailTrain train = this.getTrainDetailForModel(reqTrainModel);
		List<List<String>> l = train.getData().getInfo().getValue();
		reqTrainModel.setFrom(l.get(0).get(1));
		reqTrainModel.setTo(l.get(l.size() - 1).get(1));
		RepSTSTrain trains = this.getTrainS2SForModel(reqTrainModel);
		if (train != null && train.getData() != null && trains != null
				&& trains.getData() != null) {
			tr.setTask("public.train");
			tr.setConfidence(" 0.8");
			List<TrainData> data = new ArrayList<TrainData>();
			TrainData td = new TrainData();
			td.setSource("12306铁路");
			td.setType("train_one");
			TrainParams pas = new TrainParams();
			pas.setBackground("train");
			DetailData detData = train.getData();
			Info info = detData.getInfo();
			List<List<String>> value = info.getValue();
			List<Train> list = getTrain(reqTrainModel.getTrain(), trains
					.getData().getTrainList());
			List<TrainDetailModel> details = this.getDetailModel(list,
					reqTrainModel, value);
			pas.setDetails(details);
			td.setParams(pas);
			data.add(td);
			tr.setData(data);
		}
		return tr;
	}

	public TrainContent getTrainS2S(ReqTrainModel reqTrainModel) {
		TrainContent tr = new TrainContent();
		RepSTSTrain train = this.getTrainS2SForModel(reqTrainModel);
		if (train != null && train.getData() != null) {
			tr.setTask("public.train");
			tr.setConfidence(" 0.8");
			List<TrainData> data = new ArrayList<TrainData>();
			TrainData td = new TrainData();
			td.setSource("12306铁路");
			td.setType("train_one");
			TrainParams pas = new TrainParams();
			pas.setBackground("train");
			List<TrainDetailModel> details = this.getDetailModel(train
					.getData().getTrainList(), reqTrainModel, null);
			pas.setDetails(details);
			td.setParams(pas);
			data.add(td);
			tr.setData(data);
		}
		return tr;
	}

	/**
	 * 站站查询回去参数
	 * 
	 * @Title: getTrainS2SDet
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param reqTrainModel
	 * @param @return 设定文件
	 * @return RepSTSTrain 返回类型
	 * @throws
	 */
	protected RepSTSTrain getTrainS2SForModel(ReqTrainModel reqTrainModel) {
		reqTrainModel.setUserId(null);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("from", reqTrainModel.getFrom());
		params.put("to", reqTrainModel.getTo());
		params.put("date", reqTrainModel.getDate());
		Map<String, String> head = new HashMap<String, String>();
//		params.put("version", apiUtil.baiduVersion);
//		head.put("apikey", apiUtil.baiDuApiKey);
//		String rep = HttpUtil.doGet(apiUtil.trainStsUrl, params, head);
		head.put("apikey", baiDuApiKey);
		params.put("version", baiduVersion);
		String rep = HttpUtil.doGet(trainStsUrl, params, head);
		RepSTSTrain train = null;
		if (!Utils.isEmpty(rep)) {
			train = JSON.parseObject(rep, RepSTSTrain.class);
		}
		return train;
	}

	/**
	 * 车次详情查询model
	 * 
	 * @Title: getTrainDetailForModel
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param reqTrainModel
	 * @param @return 设定文件
	 * @return RepDetailTrain 返回类型
	 * @throws
	 */
	protected RepDetailTrain getTrainDetailForModel(ReqTrainModel reqTrainModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("train", reqTrainModel.getTrain());
		if (!Utils.isEmpty(reqTrainModel.getFrom())) {
			params.put("from", reqTrainModel.getFrom());
		}
		if (!Utils.isEmpty(reqTrainModel.getTo())) {
			params.put("to", reqTrainModel.getTo());
		}
		params.put("date", reqTrainModel.getDate());
		Map<String, String> head = new HashMap<String, String>();
//		params.put("version", apiUtil.baiduVersion);
//		head.put("apikey", apiUtil.baiDuApiKey);
//		String rep = HttpUtil.doGet(apiUtil.traindetailUrl, params, head);
		params.put("version", baiduVersion);
		head.put("apikey", baiDuApiKey);
		String rep = HttpUtil.doGet(traindetailUrl, params, head);
		RepDetailTrain train = null;
		if (!Utils.isEmpty(rep)) {
			train = JSON.parseObject(rep, RepDetailTrain.class);
		}
		return train;
	}

	/**
	 * 客户终点站是否是列车结束站点
	 * 
	 * @Title: isEnd
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param rt
	 * @param @param endName
	 * @param @return 设定文件
	 * @return Boolean 返回类型
	 * @throws
	 */
	protected Boolean isEnd(List<List<String>> value, String endName) {
		String name = value.get(value.size() - 1).get(1);
		int ln = name.length();
		int len = endName.length();
		if (len <= ln) {
			if (Utils.isEquals(endName, name)) {
				return true;
			}
		} else {
			if (Utils.isEquals(name, endName)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @Title: isStrat
	 * @author mao.ru
	 * @Description: TODO( 客户开始站是否是列车起始站)
	 * @param @param rt
	 * @param @param endName
	 * @param @return 设定文件
	 * @return Boolean 返回类型
	 * @throws
	 */
	protected Boolean isStrat(List<List<String>> value, String endName) {
		String name = value.get(0).get(1);
		int ln = name.length();
		int len = endName.length();
		if (len <= ln) {
			if (Utils.isEquals(endName, name)) {
				return true;
			}
		} else {
			if (Utils.isEquals(name, endName)) {
				return true;
			}
		}
		return false;

	}

	/**
	 * 当前查询车次是否有票
	 * 
	 * @Title: isHaveTickets
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	protected String isHaveTickets(List<SeatInfo> l) {
		for (SeatInfo s : l) {
			if (!"0".equals(s.getRemainNum())) {
				return "has_tickets";
			}
		}
		return "sold_out";
	}

	protected List<List<String>> getLtLStringV(ReqTrainModel reqTrainModel) {
		RepDetailTrain rd = this.getTrainDetailForModel(reqTrainModel);
		if (rd != null && rd.getData() != null) {
			return rd.getData().getInfo().getValue();
		}
		return null;

	}

	/**
	 * 
	 * @Title: getDetailModel
	 * @author mao.ru
	 * @Description: TODO(拼装车次详情信息)
	 * @param @return 设定文件
	 * @return List<TrainDetailModel> 返回类型
	 * @throws
	 */
	protected List<TrainDetailModel> getDetailModel(List<Train> list,
			ReqTrainModel reqTrainModel, List<List<String>> value) {
		List<TrainDetailModel> details = new ArrayList<TrainDetailModel>();
		for (Train t : list) {
			TrainDetailModel detail = new TrainDetailModel();
			detail.setLinkUrl(null);// 请求url
			detail.setDepartureCity(reqTrainModel.getFrom());
			detail.setDestinationCity(reqTrainModel.getTo());
			detail.setNumber(t.getTrainNo());
			detail.setStartDate(reqTrainModel.getDate());
			detail.setDuration(t.getDuration());// 火车行驶时常
			detail.setStartStation(t.getFrom());
			detail.setStartTime(t.getStartTime());
			detail.setEndStation(t.getTo());
			detail.setEndTime(t.getEndTime());
			if (value == null || value.isEmpty()) {
				reqTrainModel.setFrom(t.getFrom());
				reqTrainModel.setTo(t.getTo());
				reqTrainModel.setTrain(t.getTrainNo());
				value = this.getLtLStringV(reqTrainModel);
			}
			if (value != null && !value.isEmpty()) {
				detail.setIsEnd(this.isEnd(value, reqTrainModel.getTo())
						.toString());// 是否是始发站，
				detail.setIsStart(this.isStrat(value, reqTrainModel.getFrom())
						.toString());// 是否是重点站
			}
			List<TrainSeatModel> seats = new ArrayList<TrainSeatModel>();
			List<SeatInfo> infos = t.getSeatInfos();
			Boolean isticketstatus = false;// 无票
			for (SeatInfo s : infos) {
				TrainSeatModel ts = new TrainSeatModel();
				ts.setName(s.getSeat());
				ts.setPrice(s.getSeatPrice());
				ts.setTicket(s.getRemainNum());
				if (!s.getRemainNum().equals("0")) {
					isticketstatus = true;
				}
				seats.add(ts);
			}
			detail.setSeats(seats);
			if (isticketstatus) {
				detail.setTicketStatus("has_tickets");// has_tickets
			} else {
				detail.setTicketStatus("sold_out");// sold_out
			}
			details.add(detail);
		}
		return details;

	}

	/**
	 * 详情页使用
	 * 
	 * @Title: name
	 * @author mao.ru
	 * @Description: TODO(依据车次查找站站车次信息)
	 * @param @return 设定文件
	 * @return List<Train> 返回类型
	 * @throws
	 */
	protected List<Train> getTrain(String number, List<Train> l) {
		for (Train t : l) {
			String[] s = t.getTrainNo().split("/");
			if (Arrays.asList(s).contains(number)) {
				List<Train> list = new ArrayList<Train>();
				list.add(t);
				return list;
			}
		}
		return null;
	}

	public static void main(String[] args) {
//		BaiduTrainService bs = new BaiduTrainServiceImpl();
//		ReqTrainModel reqTrainModel = new ReqTrainModel();
//		reqTrainModel.setFrom("南京");
//		reqTrainModel.setTo("上海");
//		reqTrainModel.setDate("2016-01-23");
		// reqTrainModel.setTrain("G101");
		// bs.getTrainDetail(reqTrainModel);
//		System.out.println(JSON.toJSONString(reqTrainModel));
		//bs.getTrainS2S(reqTrainModel);
		// String str = "D3059/D3062";
		// String[] s = str.split("/");
		// System.out.println(s[0].toString() + s[1]);
	}

}
