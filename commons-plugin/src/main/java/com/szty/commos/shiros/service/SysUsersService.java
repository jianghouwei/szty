package com.szty.commos.shiros.service;

import java.util.List;

import com.stzy.commos.page.model.PageModel;
import com.szty.commos.shiros.model.SysUsers;

/**
 * 用户新增
 * ClassName: SysUsersService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月4日 上午9:38:08 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public interface SysUsersService{

	void saveSysUser( SysUsers sysUsers);
	
	void updateSysUser( SysUsers sysUsers);
	
	void delSysUser( Long id);
	
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
	List<SysUsers> queryList(SysUsers sysUsers);
	/**
	 * 分页查询
	 * querySysUser:(这里用一句话描述这个方法的作用). <br/>
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
	PageModel<SysUsers,Object> queryPageSysUser( SysUsers sysUsers);

}
