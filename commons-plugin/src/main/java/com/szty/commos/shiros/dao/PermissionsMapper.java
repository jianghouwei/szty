package com.szty.commos.shiros.dao;

import java.util.List;

public interface PermissionsMapper {

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
	List<String> queryPerssListByUserName(String userName);
}
