package com.szty.wxyd.service;

import com.szty.wxyd.model.BindModel;
import com.szty.wxyd.model.CodeList;
import com.szty.wxyd.model.CreateQrcode;
import com.szty.wxyd.model.QrcodeMode;
import com.szty.wxyd.model.ResDeviceModel;
import com.szty.wxyd.model.SetpModel;

/**
 * 
 * @ClassName: DeviceHandleService
 * @Description: TODO(设备绑定，解绑，操作)
 * @author mao.ru
 * @date 2016年1月12日 下午2:20:31
 *
 */
public interface DeviceHandleService {

	/**
	 * 备注 deviceid由微信服务器分配
	 * 
	 * @Title: getQrcode
	 * @author mao.ru
	 * @Description: TODO(第三方获取deviceid和设备二维码)
	 * @param 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public QrcodeMode setDirverQrcode();

	/**
	 * 
	 * @Title: setAuthorizeDevice
	 * @author mao.ru
	 * @Description: TODO(设备新接口授权)
	 * @param @return 设定文件
	 * @return String 返回类型 1:成功2:失败
	 * @throws
	 */
	public String setAuthorizeDevice(ResDeviceModel resModel);

	/**
	 * 
	 * @Title: setAuthorizeDevice
	 * @author mao.ru
	 * @Description: TODO(设备旧接口授权)
	 * @param @return 设定文件
	 * @return String 返回类型 1:成功2:失败
	 * @throws
	 */
	public String setOldAuthorizeDevice(ResDeviceModel resModel);

	/**
	 * 
	 * @Title: setBindDevice
	 * @author mao.ru
	 * @Description: TODO(绑定设备)
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String setBindDevice(BindModel bindModel);

	/**
	 * 
	 * @Title: setUnBindDevice
	 * @author mao.ru
	 * @Description: TODO(解绑设备)
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String setUnBindDevice(BindModel bindModel);

	/**
	 * 
	 * @Title: setBindDevice
	 * @author mao.ru
	 * @Description: TODO(绑定设备)
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String setCompelBindDevice(BindModel bindModel);

	/**
	 * 
	 * @Title: setUnBindDevice
	 * @author mao.ru
	 * @Description: TODO(解绑设备)
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String setCompelUnBindDevice(BindModel bindModel);

	/**
	 * 
	 * @Title: setStep
	 * @author mao.ru
	 * @Description: TODO(上传当前步数)
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String setStep(SetpModel setpModel);

	/**
	 * 依据devi id 查询二维码
	 * @Title: getCreateQrcode
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param createQrcode
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public CodeList getCreateQrcode(CreateQrcode createQrcode);
}
