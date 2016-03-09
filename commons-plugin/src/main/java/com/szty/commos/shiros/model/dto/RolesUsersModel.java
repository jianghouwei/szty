package com.szty.commos.shiros.model.dto;

import java.util.List;

import com.szty.commos.shiros.model.SysRoles;
import com.szty.commos.shiros.model.SysUsers;

public class RolesUsersModel {


	private Long rolesId;

	private Long usersId;

	private String roleName;
	
	private List<SysUsers> sysUsers;

	private List<SysRoles> sysRoles;

	public List<SysUsers> getSysUsers() {
		return sysUsers;
	}

	public void setSysUsers(List<SysUsers> sysUsers) {
		this.sysUsers = sysUsers;
	}

	public List<SysRoles> getSysRoles() {
		return sysRoles;
	}

	public void setSysRoles(List<SysRoles> sysRoles) {
		this.sysRoles = sysRoles;
	}


	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getRolesId() {
		return rolesId;
	}

	public void setRolesId(Long rolesId) {
		this.rolesId = rolesId;
	}

	public Long getUsersId() {
		return usersId;
	}

	public void setUsersId(Long usersId) {
		this.usersId = usersId;
	}
	

}
