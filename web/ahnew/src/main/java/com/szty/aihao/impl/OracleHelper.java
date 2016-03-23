 package com.szty.aihao.impl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.rowset.OracleCachedRowSet;

public class OracleHelper {
	static Connection conn = null;
	static String driver = PropertyUtils.getValue("driver");
	static String _url =PropertyUtils.getValue("url");
	static String _user = PropertyUtils.getValue("user");
	static String _pwd = PropertyUtils.getValue("pwd");
	static DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static Connection getConnection() throws Exception {
		if (conn != null && !conn.isClosed()) {
			return conn;
		} else {

			try {

				Class.forName(driver);

			} catch (Exception ce) {
				ce.printStackTrace();
			}
			conn = DriverManager.getConnection(_url, _user, _pwd);

			return conn;
		}

	}

	/**
	 * 
	 * @param sptext
	 *            存储过程语句
	 * @param parms
	 *            OracleParameter[]
	 * @return boolean 成功为true,失败为false
	 * @throws Exception
	 */
	public static boolean executeProcedure(String sptext,
			OracleParameter[] parms) throws Exception {
		Connection conn = null;
		CallableStatement cstmt = null;

		try {
			conn = getConnection();
			conn.setAutoCommit(true);
			cstmt = conn.prepareCall(sptext);
			prepareCommand(cstmt, parms);
			return cstmt.execute();

		} catch (Exception e) {
			throw new Exception("executeProcedure方法出错:" + e.getMessage());
		} finally {
			try {
				if (cstmt != null)
					cstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				throw new Exception("执行executeProcedure方法出错:" + e.getMessage());
			}
		}
	}

	/**
	 * 
	 * @param sptext
	 *            存储过程语句
	 * @param parms
	 *            OracleParameter[]
	 * @return Object[] 出参的结果
	 * @throws Exception
	 */
	public static OracleCachedRowSet executeQuery(String sptext,
			OracleParameter[] parms) throws Exception {
		Connection conn = null;
		CallableStatement cstmt = null;
		try {
			conn = getConnection();
			cstmt = conn.prepareCall(sptext);
			// 应用参数
			prepareCommand(cstmt, parms);
			cstmt.execute();
			System.out.println("execute 2");
			ResultSet rs = ((OracleCallableStatement) cstmt).getCursor(1);
			OracleCachedRowSet ocrs = new OracleCachedRowSet();
			ocrs.populate(rs);
			rs.close();
			return ocrs;
		} catch (Exception e) {
			throw new Exception("executeProcedureObject方法出错:" + e.getMessage());
		} finally {
			try {
				if (cstmt != null)
					cstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				throw new Exception("executeProcedureObject方法出错:"
						+ e.getMessage());
			}
		}
	}

	/**
	 * 
	 * @param sptext
	 *            存储过程语句
	 * @param parms
	 *            OracleParameter[]
	 * @return Object[] 出参的结果
	 * @throws Exception
	 */
	public static OraclePageCache executeQueryPage(String sptext,
			OracleParameter[] parms) throws Exception {
		Connection conn = null;
		CallableStatement cstmt = null;
		try {
			conn = getConnection();
			cstmt = conn.prepareCall(sptext);
			// 应用参数
			prepareCommand(cstmt, parms);
			cstmt.execute();
			ResultSet rs = ((OracleCallableStatement) cstmt).getCursor(1);
			OraclePageCache opc = new OraclePageCache();
			opc.setPageCount(cstmt.getInt(2));
			opc.setTotalCount(cstmt.getInt(3));
			OracleCachedRowSet ocrs = new OracleCachedRowSet();
			ocrs.populate(rs);
			opc.setOcrs(ocrs);
			rs.close();
			return opc;
		} catch (Exception e) {
			throw new Exception("executeProcedureObject方法出错:" + e.getMessage());
		} finally {
			try {
				if (cstmt != null)
					cstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				throw new Exception("executeProcedureObject方法出错:"
						+ e.getMessage());
			}
		}
	}

	/**
	 * 
	 * @param pstmt
	 * @param parms
	 * @throws Exception
	 */
	private static void prepareCommand(CallableStatement cstmt,
			OracleParameter[] parms) throws Exception {
		if (parms == null) {
			return;
		}
		System.out.println("prepareCommoand  begin");
		int count;
		count = parms.length;

		for (int i = 0; i < count; i++) {
			OracleParameter op = new OracleParameter();
			op = parms[i];
			System.out.println("for " + i);
			if (op.getMode().compareToIgnoreCase("OUT") >= 0) {
				System.out.println("for OUT");
				cstmt.registerOutParameter(op.getIndex(), op.getSqlDataType());
			} else {

				switch (op.getSqlDataType()) {
				case OracleTypes.DOUBLE:
					System.out.println("for IN Double");
					cstmt.setDouble(op.getIndex(),
							Double.parseDouble(op.getData().toString()));
					break;
				case OracleTypes.BIGINT:
					System.out.println("for BigInt");
					cstmt.setLong(op.getIndex(),
							Long.parseLong(op.getData().toString()));
					break;
				case OracleTypes.DATE:
					System.out.println("for Date");
					cstmt.setTime(
							op.getIndex(),
							(new java.sql.Time((dateformat.parse((String) op
									.getData()).getTime()))));
					break;
				case OracleTypes.FLOAT:
					System.out.println("for Float");
					cstmt.setFloat(op.getIndex(),
							Float.parseFloat(op.getData().toString()));
					break;
				case OracleTypes.INTEGER:
					System.out.println("for Int");
					cstmt.setInt(op.getIndex(),
							Integer.parseInt(op.getData().toString()));
					break;
				case OracleTypes.NUMBER:
					System.out.println("for NUMBER");
					cstmt.setInt(op.getIndex(),
							Integer.parseInt(op.getData().toString()));
					break;
				case OracleTypes.VARCHAR:
					System.out.println("for VARCHAR");
					cstmt.setString(op.getIndex(), (String)op.getData());
					break;
				case OracleTypes.NVARCHAR:
					System.out.println("for NVARCHAR");
					cstmt.setString(op.getIndex(), (String)op.getData());
					break;
				}

			}

		}
	}

}




