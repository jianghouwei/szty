package com.szty.wxyd.service;

import com.szty.wxyd.model.Menu;
import com.szty.wxyd.model.RepMenuMode;

/**
 * 
 * @ClassName: WeiXinMenuService
 * @Description: TODO(微信菜单功能)
 * @author mao.ru
 * @date 2016年1月11日 下午3:59:24
 *
 */
public interface WeiXinMenuService {

	/**
	 * 创建菜单
	 * 
	 * @param menu
	 */
	public RepMenuMode creatMenu(Menu menu);

	/**
	 * 查询菜单
	 */
	public Menu getMenu();

	/**
	 * 删除菜单
	 * 
	 * @return
	 */
	public RepMenuMode delMenu();
}
