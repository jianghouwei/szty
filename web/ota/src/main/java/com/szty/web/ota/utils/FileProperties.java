package com.szty.web.ota.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 文件属性相关配置 ClassName: FileProperties <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月11日 上午10:33:52 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
@Component
public class FileProperties {

	@Value("#{fileProties.file_basepath}")
	public String filePath;// 读取文件路径配置

	@Value("#{fileProties.file_name}")
	public String fileName;// 文件名称
	
	@Value("#{fileProties.file_extension}")
	public String extension;// 文件名称
}
