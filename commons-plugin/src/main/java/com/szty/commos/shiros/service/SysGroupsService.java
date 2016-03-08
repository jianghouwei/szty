package com.szty.commos.shiros.service;

import java.util.List;

import com.szty.commos.page.model.PageModel;
import com.szty.commos.shiros.model.SysGroups;

/**
 * 组别管理
 * ClassName: SysGroupsService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月4日 下午4:16:24 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public interface SysGroupsService {

	void saveSysGroups( SysGroups sysGroups);
	
	void updateSysGroups( SysGroups sysGroups);
	
	void delSysGroups( Long id);
	
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
	List<SysGroups> queryList(SysGroups sysGroups);
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
	PageModel<SysGroups,Object> queryPageSysGroups( SysGroups sysGroups);
}
