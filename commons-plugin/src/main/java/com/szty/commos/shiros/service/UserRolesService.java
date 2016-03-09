package com.szty.commos.shiros.service;

import java.util.List;

import com.szty.commos.shiros.model.dto.RolesUsersModel;

/**
 *  用户角色权限保存
 * ClassName: UserRolesService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月9日 下午3:45:01 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public interface UserRolesService {

	
	/**
	 * 角色用户保存
	 * saveUserRole:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param userIds
	 * @param roleIds
	 * @since JDK 1.7
	 */
	void saveUserRole(List<Long> userIds , List<Long> roleIds);
	
	
	/**
	 * role 角色 选中的角色
	 * queryRolesListByuserId:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @return
	 * @since JDK 1.7
	 */
	public List<RolesUsersModel> queryRolesListByuserId();
}
