package com.szty.commos.shiros.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.szty.commos.cache.spring.SpringCacheManagerWrapper;
import com.szty.commos.page.model.PageModel;
import com.szty.commos.shiros.dao.RolesMapper;
import com.szty.commos.shiros.dao.SysRolesMapper;
import com.szty.commos.shiros.model.SysRoles;
import com.szty.commos.shiros.service.SysRolesService;

/**
 * 
 * ClassName: SysRolesServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月7日 下午6:07:43 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
@Service 
public class SysRolesServiceImpl implements SysRolesService{

	
	@Autowired
	private SysRolesMapper sysRolesMapper;
	
	@Autowired
	private RolesMapper rolesMapper;
	
	@Autowired
	private  SpringCacheManagerWrapper cacheManager;
	
	
	public void saveSysRoles(SysRoles sysRoles) {
		sysRolesMapper.save(sysRoles);
		
	}

	public void updateSysRoles(SysRoles sysRoles) {

		sysRolesMapper.updateByPrimaryKey(sysRoles);
	}

	public void delSysRoles(Long id) {

		sysRolesMapper.delByPrimaryKey(id);
		
	}

	public List<SysRoles> queryList(SysRoles sysRoles) {
 		return sysRolesMapper.queryList(sysRoles);
	}

	public PageModel<SysRoles, Object> queryPageSysRoles(SysRoles sysRoles) {
		PageModel<SysRoles, Object> page = new PageModel<SysRoles, Object>();
		List<SysRoles> rows = sysRolesMapper.queryPageList(sysRoles);
		Integer total = sysRolesMapper.queryPageCount(sysRoles);
		page.setRows(rows);
		page.setTotal(total);
		return page;
	}

	public Set<String> queryRolesListByUserName(String userName) {
		List<String> list = null;
		String str =  (String) cacheManager.getCache("sys-RolesCache").get("roles." + userName);
		if(! StringUtils.isEmpty(str)){
			list = new ArrayList<String>();
			list = JSON.parseArray(str, String.class);
		}else{
			list = rolesMapper.queryRolesListByUserName(userName);
			String roles = JSON.toJSONString(list);
			cacheManager.getCache("sys-RolesCache").put("roles." + userName, roles);
		}
		return new HashSet<String>(list);
	}

}
