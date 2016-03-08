package com.szty.commos.shiros.service;

import java.util.List;

import com.szty.commos.page.model.PageModel;
import com.szty.commos.shiros.model.SysResources;

/**
 * 资源登记(页面+按钮) 
 * ClassName: SysResourcesService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月4日 下午4:15:09 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public interface SysResourcesService {

    void saveSysResources( SysResources SysResources);
	
	void updateSysResources( SysResources SysResources);
	
	void delSysResources( Long id);
	
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
	List<SysResources> queryList(SysResources SysResources);
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
	PageModel<SysResources,Object> queryPageSysResources( SysResources SysResources);
}
