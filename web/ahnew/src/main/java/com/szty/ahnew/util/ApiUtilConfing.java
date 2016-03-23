package com.szty.ahnew.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: WeiXinConfing
 * @Description: TODO(接口配置文件)
 * @author mao.ru
 * @date 2016年1月11日 下午3:55:39
 *
 */
@Component
public class ApiUtilConfing {
	@Value("#{apiutil.apiutil_baidu_apikey}")
	public String baiDuApiKey; // 获取acesstoken标致
	@Value("#{apiutil.apiutil_train_s2ssearch}")
	public String trainStsUrl;// 站站查询
	@Value("#{apiutil.apiutil_train_traindetail}")
	public String traindetailUrl;// 车次查询
	@Value("#{apiutil.apiutil_baidu_version}")
	public String baiduVersion;// 百度车次查询版本号

}
