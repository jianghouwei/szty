package com.szty.commos.shiros.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szty.commos.shiros.dao.SysAuthRolesMapper;
import com.szty.commos.shiros.dao.SysAuthorityMapper;
import com.szty.commos.shiros.model.SysAuthRoles;
import com.szty.commos.shiros.model.SysAuthority;
import com.szty.commos.shiros.service.ResAuthService;

@Service
public class ResAuthServiceImpl implements ResAuthService {

	@Autowired
	private SysAuthorityMapper sysAuthorityMapper;
	
	
	@Autowired
	private SysAuthRolesMapper sysAuthRolesMapper;

	public Long saveReroces(SysAuthority auth) {
		sysAuthorityMapper.save(auth);
		return auth.getId();
	}

	public void saveAuthRole(SysAuthRoles authRoles) {
		
		sysAuthRolesMapper.save(authRoles);
	}

}
