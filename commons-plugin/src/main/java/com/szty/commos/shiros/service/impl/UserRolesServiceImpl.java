package com.szty.commos.shiros.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szty.commos.shiros.dao.RolesMapper;
import com.szty.commos.shiros.dao.SysUsersRolesMapper;
import com.szty.commos.shiros.model.SysUsersRoles;
import com.szty.commos.shiros.model.dto.RolesUsersModel;
import com.szty.commos.shiros.service.UserRolesService;

@Service
public class UserRolesServiceImpl implements UserRolesService {

	@Autowired
	private SysUsersRolesMapper sysUsersRolesMapper;
	
	@Autowired
	private RolesMapper rolesMapper;

	@Override
	public void saveUserRole(List<Long> userIds, List<Long> roleIds) {

		List<SysUsersRoles> list = new ArrayList<SysUsersRoles>();
		for (Long userId : userIds) {
			for (Long roleId : roleIds) {
				SysUsersRoles sysur = new SysUsersRoles();
				sysur.setUsersId(userId);
				sysur.setRolesId(roleId);
				list.add(sysur);
			}
		}
		sysUsersRolesMapper.saveBatchSysUsersRoles(list);

	}

	@Override
	public List<RolesUsersModel> queryRolesListByuserId() {
		
		return rolesMapper.queryRolesListByuserId();
	}

}
