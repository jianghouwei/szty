package com.szty.web.ota.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Service;

import com.szty.commos.cache.spring.SpringCacheManagerWrapper;
import com.szty.web.ota.service.OtaUpdateService;
import com.szty.web.ota.utils.FileProperties;
import com.szty.web.ota.utils.FileUtil;

@Service
public class OtaUpdateServiceImpl implements OtaUpdateService {

	private static final Logger log = Logger.getLogger(OtaUpdateServiceImpl.class);
	
	@Autowired
	private  EhCacheCacheManager springCacheManager;
	
	@Autowired
	private FileProperties fileProties;

	public String getFileTOJsonByAppAndChannelOfFile(String app, String channel,String extension) throws FileNotFoundException,IOException{
		Cache cache = springCacheManager.getCache("OtaJsonFileCache");
		// 获取文件路径
		String filePath = fileProties.filePath;
		log.info("文件路径：配置文件读取>>>>>>>>>>>[" + filePath + "]");
		if (filePath == null) {
			// 默认获取classPath路径
			filePath = OtaUpdateServiceImpl.class.getClassLoader().getResource("").getPath();
			log.info("文件路径：项目根目录 >>>>>>>>>>>[" + filePath + "]");
		}
		if(extension == null){
			extension = fileProties.extension;
		}
		String fileName = fileProties.fileName+"_"+channel + extension;
		log.info("文件名称： >>>>>>>>>>>[" + filePath + "]");
		//读取文件
		String result = null;
		result = cache.get(fileName, String.class);
		if(result != null){
			return result;
		}
		try {
			result = FileUtil.readFile(filePath+File.separatorChar+fileName, "utf-8");
			cache.put(fileName, result);
		} catch (FileNotFoundException e) {
			result = "文件不存在";
			throw new FileNotFoundException(result);
		} catch (IOException e) {
			result = "IO异常";
			throw new IOException(result);
		}
		return result;
	}

	public String getFileTOJsonByAppAndChannelOfData(String app, String channel,String extension) {

		return null;
	}


}
