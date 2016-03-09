package com.szty.commos.shiros.service;

import com.szty.commos.shiros.model.SysAuthRoles;
import com.szty.commos.shiros.model.SysAuthority;

/**
 * 资源权限
 * ClassName: ResAuthService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月9日 下午5:45:23 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public interface ResAuthService {
	

	/**
	 * 插入权限
	 * @param auth
	 * @return
	 */
	public Long saveReroces(SysAuthority auth);
	
	
	
	/**
	 * 插入资源权限表
	 * @param authRoles
	 */
	public void saveAuthRole(SysAuthRoles authRoles);
	
}
