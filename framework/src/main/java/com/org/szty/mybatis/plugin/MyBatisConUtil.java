package com.org.szty.mybatis.plugin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MyBatisConUtil {

	
	
	public static Connection conn = null;
	
	/**
	 * 数据库连接
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void init() throws ClassNotFoundException, SQLException {
		Class.forName(CreateStart.driverName);
		conn = DriverManager.getConnection(CreateStart.url, CreateStart.user, CreateStart.password);
	}

	/**
	 * 获取所有的表
	 * @return
	 * @throws SQLException
	 */
	public static List<String> getTables() throws SQLException {
		List<String> tables = new ArrayList<String>();
		PreparedStatement pstate = conn.prepareStatement("show tables");
		ResultSet results = pstate.executeQuery();
		while (results.next()) {
			String tableName = results.getString(1);
			if(tableName != null){
				//单个表生成
				if(CreateStart.TABLENAME.equals(tableName)){
					tables.add(tableName);
				}
			}else{
				//数据库所有表生成
				tables.add(tableName);
			}
		}
		return tables;
	}
}
