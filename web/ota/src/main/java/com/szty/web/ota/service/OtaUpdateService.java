package com.szty.web.ota.service;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 依据娶到好和app 获取
 * ClassName: otaUpdateService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月11日 上午9:58:24 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public interface OtaUpdateService {

	
	/**
	 * 依据渠道号app 名称和渠道号从Json文件，获取 对应升级版本Json
	 * getFileTOJsonByAppAndChannelOfFile:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param app  
	 * @param channel
	 * @return
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @since JDK 1.7
	 */
	public String getFileTOJsonByAppAndChannelOfFile(String app ,String channel,String extension) throws FileNotFoundException, IOException;
	
	
	/**
	 * 依据渠道号app 名称和渠道号从数据库获取 对应升级版本Json
	 * getFileTOJsonByAppAndChannelOfData:( 暂未开发 ). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param app
	 * @param channel
	 * @return
	 * @since JDK 1.7
	 */
	public String getFileTOJsonByAppAndChannelOfData(String app ,String channel,String extension);
}
