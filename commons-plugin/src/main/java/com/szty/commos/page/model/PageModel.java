package com.szty.commos.page.model;

import java.util.List;


/**
 * easyui 分页组建 ClassName: Page <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月3日 下午3:21:52 <br/>
 *
 * @author mao.ru
 * @version @param <T>
 * @version @param <V>
 * @since JDK 1.7
 */
public class PageModel<T, V> {

	/** 总条数 **/
	private Integer total;

	/** 查询数据 **/
	private List<T> rows;

	/** 附加参数--统计等其他列表需要，据集体情况而定 **/
	private List<V> footer;
	

	/** 请求页码 **/
	private Integer page;
	
	/** 请求页码容量 **/
	
	private Integer pageSize;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public List<V> getFooter() {
		return footer;
	}

	public void setFooter(List<V> footer) {
		this.footer = footer;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
