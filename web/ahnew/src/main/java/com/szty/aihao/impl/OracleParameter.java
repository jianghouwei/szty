package com.szty.aihao.impl;
import oracle.jdbc.rowset.OracleCachedRowSet;

public class OracleParameter extends Object {

	public OracleParameter() {
	}
	private int index;
	private String mode;
	private int sqlDataType;
	private Object Data;

	public OracleParameter(int _index, String _mode,int _sqlDataType,
			Object _Data) {
		index=_index;
		mode = _mode;
		Data = _Data;
		sqlDataType=_sqlDataType;
	}

	public int getSqlDataType() {
		return sqlDataType;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setSqlDataType(int sqlDataType) {
		this.sqlDataType = sqlDataType;
	}


	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}


	public Object getData() {
		return Data;
	}

	public void setData(Object data) {
		Data = data;
	}

	
}
