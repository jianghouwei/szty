package com.szty.commos.shiros.service;

import java.util.List;
import java.util.Set;

import com.szty.commos.page.model.PageModel;
import com.szty.commos.shiros.model.SysRoles;

/**
 *  角色管理
 * ClassName: SysRolesService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月4日 下午4:08:50 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public interface SysRolesService {
	
    void saveSysRoles( SysRoles SysRoles);
	
	void updateSysRoles( SysRoles SysRoles);
	
	void delSysRoles( Long id);
	
	/**
	 * 
	 * queryList:(查询多条数据). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param sysUsers
	 * @return
	 * @since JDK 1.7
	 */
	List<SysRoles> queryList(SysRoles SysRoles);
	/**
	 * 分页查询
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param sysUsers
	 * @return
	 * @since JDK 1.7
	 */
	PageModel<SysRoles,Object> queryPageSysRoles( SysRoles SysRoles);
	
	/**
	 * 依据用户名查询Roles
	 * queryRolesListByUserName:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param SysRoles
	 * @return
	 * @since JDK 1.7
	 */
	Set<String> queryRolesListByUserName(String userName);
	
	

}
