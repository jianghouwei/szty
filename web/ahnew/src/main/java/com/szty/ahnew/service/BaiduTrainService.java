package com.szty.ahnew.service;

import com.szty.ahnew.model.ReqTrainModel;
import com.szty.ahnew.model.TrainContent;

/**
 * 
 * @ClassName: BaiduTrainService
 * @Description: TODO(爱好---百度车次查询接口)
 * @author mao.ru
 * @date 2016年1月21日 上午10:37:47
 *
 */
public interface BaiduTrainService {
	/**
	 * 
	 * @Title: getTrainDetail
	 * @author mao.ru
	 * @Description: TODO(车次详情接口)
	 * @param 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public TrainContent getTrainDetail(ReqTrainModel reqTrainModel);

	/**
	 * 
	 * @Title: getTrainS2S
	 * @author mao.ru
	 * @Description: TODO(站站查询接口)
	 * @param @param reqTrainModel 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public TrainContent getTrainS2S(ReqTrainModel reqTrainModel);

}
