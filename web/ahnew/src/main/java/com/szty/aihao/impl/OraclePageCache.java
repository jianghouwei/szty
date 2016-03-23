package com.szty.aihao.impl;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class OraclePageCache
{
	public static  int pageCount;
	public static  int totalCount;
	private OracleCachedRowSet ocrs;
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public OracleCachedRowSet getOcrs() {
		return ocrs;
	}
	public void setOcrs(OracleCachedRowSet ocrs) {
		this.ocrs = ocrs;
	}
	
}