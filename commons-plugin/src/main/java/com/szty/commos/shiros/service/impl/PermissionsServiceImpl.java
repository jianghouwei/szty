package com.szty.commos.shiros.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.szty.commos.cache.spring.SpringCacheManagerWrapper;
import com.szty.commos.shiros.dao.PermissionsMapper;
import com.szty.commos.shiros.service.PermissionsService;

@Service
public class PermissionsServiceImpl  implements PermissionsService{

	@Autowired
	private PermissionsMapper permissionsMapper;
	
	@Autowired
	private  SpringCacheManagerWrapper cacheManager;
	
	public Set<String> queryPerssListByUserName(String userName) {
		
		List<String> list = new ArrayList<String>();
		String str =  (String) cacheManager.getCache("sys-authCache").get("auths." + userName);
		if(! StringUtils.isEmpty(str)){
			list = JSON.parseArray(str, String.class);
		}else{
			List<String> auths = permissionsMapper.queryPerssListByUserName(userName);
			for(String auth : auths){
				if(auth != null){
					list.addAll(Arrays.asList(auth.split(","))) ;
				}
				
			}
			if("admin".equals(userName)){
				list.add("admin:*");
			}
			String authstr = JSON.toJSONString(list);
			cacheManager.getCache("sys-authCache").put("auths." + userName, authstr);
		}
		return new HashSet<String>(list);
	}

	
}
