package com.szty.wxyd.service;

import com.szty.wxyd.data.model.SetpMacOpenModel;
import com.szty.wxyd.loc.model.RespBingMsg;

/**
 * 用户步数上传后端相关服务
 * 
 * @ClassName: StepLocalService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mao.ru
 * @date 2016年1月14日 下午12:59:50
 *
 */
public interface StepLocalService {

	/**
	 * @throws Exception
	 *             1：先获取机器码 2: 注册设备
	 * @Title: registerMacInfo
	 * @author mao.ru
	 * @Description: TODO(避开事物，因为机器码传查询一次少一次)
	 * @param @return 设定文件
	 * @return int 返回类型 1:操作成功 2操作失败3:获取机器码失败
	 * @throws
	 */
	public int postDerviceId(SetpMacOpenModel smom) throws Exception;

	/**
	 * 1. 注册保存mac相关信息 2. 申请绑定mac和openId相关信息 3. 授权mac和device相关认证
	 * 
	 * @Title: registerMacInfo
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @return 设定文件
	 * @return int 返回类型 1:操作成功 2操作失败
	 * @throws
	 */
	public RespBingMsg insterRegisterMacInfo(SetpMacOpenModel smom)
			throws Exception;

	/**
	 * 1.保存openid 步数， 2.同步微信后台步数
	 * 
	 * @Title: saveStepInfo
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @return 设定文件
	 * @return int 返回类型 1:操作成功 2操作失败
	 * @throws
	 */
	public int saveStepInfo(SetpMacOpenModel smom) throws Exception;

	/**
	 * 验证是否要注册，是否绑定， 是否授权
	 * 
	 * @Title: isregister
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param smom
	 * @param @return 设定文件
	 * @return String 返回类型 1: ok 2:mac 无效 3：未授权 4： 位绑定 5:位置情况
	 * @throws
	 */
	public String isRegister(SetpMacOpenModel smom);

	/**
	 * 
	 * @Title: insterLocRegisterMacInfo
	 * @author mao.ru
	 * @Description: TODO(后台绑定设备和申请设备编码)
	 * @param @param smom
	 * @param @return
	 * @param @throws Exception 设定文件
	 * @return RespBingMsg 返回类型
	 * @throws
	 */
	public RespBingMsg insterLocRegisterMacInfo(SetpMacOpenModel smom);
}
