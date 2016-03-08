package com.szty.commos.shiros.service;

import java.util.Set;

/**
 *   权限查询
 * ClassName: PermissionsService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月8日 下午1:30:04 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public interface PermissionsService {
	
	/**
	 * 
	 * queryPerssListByUserName:(依据用户名查询所有权限). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param userName
	 * @return
	 * @since JDK 1.7
	 */
	Set<String> queryPerssListByUserName(String userName);

}
