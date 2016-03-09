package com.szty.commos.shiros.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szty.commos.cache.spring.SpringCacheManagerWrapper;
import com.szty.commos.page.model.PageModel;
import com.szty.commos.shiros.dao.SysUsersMapper;
import com.szty.commos.shiros.model.SysUsers;
import com.szty.commos.shiros.service.SysUsersService;

/**
 * 用户CRUD ClassName: SysUsersServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月4日 上午11:13:26 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
@Service
public class SysUsersServiceImpl implements SysUsersService {

	@Autowired
	private SysUsersMapper sysUsersMapper;
	@Autowired
	private  SpringCacheManagerWrapper cacheManager;
	
	public void saveSysUser(SysUsers sysUsers) {
		sysUsersMapper.save(sysUsers);

	}

	public void updateSysUser(SysUsers sysUsers) {
		sysUsersMapper.updateByPrimaryKey(sysUsers);

	}

	public void delSysUser(Long id) {
		sysUsersMapper.delByPrimaryKey(id);

	}

	public List<SysUsers> queryList(SysUsers sysUsers) {
		return sysUsersMapper.queryList(sysUsers);
	}

	public PageModel<SysUsers, Object> queryPageSysUser(SysUsers sysUsers) {
		PageModel<SysUsers, Object> page = new PageModel<SysUsers, Object>();
		List<SysUsers> rows = sysUsersMapper.queryPageList(sysUsers);
		Integer total = sysUsersMapper.queryPageCount(sysUsers);
		page.setRows(rows);
		page.setTotal(total);
		return page;
	}

	public SysUsers queryByUserName(String userName) {
		
		SysUsers sysUsers = (SysUsers) cacheManager.getCache("sys-userCache").get(userName);
		if (sysUsers != null) {
			return sysUsers;
		} else {
			sysUsers = new SysUsers();
			sysUsers.setUserName(userName);
			List<SysUsers> list = sysUsersMapper.queryList(sysUsers);
			if (!list.isEmpty()) {
				cacheManager.getCache("sys-userCache").put(userName, list.get(0));
				return list.get(0);
			}
		}
		return null;
	}

}
