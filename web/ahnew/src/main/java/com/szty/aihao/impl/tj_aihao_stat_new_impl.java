/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTj_aihao_stat_new.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.tj_aihao_stat_new_Dao;
import com.szty.aihao.core.tj_aihao_stat_new_core;
import com.szty.aihao.factory.*;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.rowset.OracleCachedRowSet;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
*@文件说明
*@TJ_AIHAO_STAT_NEW数据接口
*@作者：宋春林 
*/
public class tj_aihao_stat_new_impl implements tj_aihao_stat_new_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(tj_aihao_stat_new_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TJ_AIHAO_STAT_NEW实体
* @return 新插入记录的编号
*/
public int insert_tj_aihao_stat_new(tj_aihao_stat_new_Dao _TJ_AIHAO_STAT_NEWModel)  throws Exception{
         String sqlStr = "{call TJ_AIHAO_STAT_NEW_PRO.InsertTJ_AIHAO_STAT_NEW(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[16];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TJ_AIHAO_STAT_NEWModel.getCdate());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getOs());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getChannelid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STAT_NEWModel.getActive_users_month());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getData_category());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getTime_category());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STAT_NEWModel.getNum());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getOpname());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getVername());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STAT_NEWModel.getActive_users_day());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STAT_NEWModel.getActive_users_week());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getChanname());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getRmk1());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getRmk2());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getRmk3());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getRmk4());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TJ_AIHAO_STAT_NEW
* @Object 
* @return 新插入记录的编号
*/
public int insert_tj_aihao_stat_new(Object[] _para)  throws Exception{
      String sqlStr = "{call TJ_AIHAO_STAT_NEW_PRO.InsertTJ_AIHAO_STAT_NEW(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[16];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param TJ_AIHAO_STAT_NEW实体
* @return 影响的行数
*/
public int update_tj_aihao_stat_new(tj_aihao_stat_new_Dao _TJ_AIHAO_STAT_NEWModel)  throws Exception{
        String sqlStr = "{call TJ_AIHAO_STAT_NEW_PRO.UpdateTJ_AIHAO_STAT_NEW(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[16];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getCdate());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getOs());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getChannelid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STAT_NEWModel.getActive_users_month());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getData_category());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getTime_category());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STAT_NEWModel.getNum());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getOpname());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getVername());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STAT_NEWModel.getActive_users_day());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STAT_NEWModel.getActive_users_week());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getChanname());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getRmk1());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getRmk2());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getRmk3());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STAT_NEWModel.getRmk4());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TJ_AIHAO_STAT_NEW中的一条记录
* @param TJ_AIHAO_STAT_NEW实体
* @return 新插入记录的编号
*/
public int delete_tj_aihao_stat_new(int Cdate)  throws Exception{
        String sqlStr = "{call TJ_AIHAO_STAT_NEW_PRO.DeleteTJ_AIHAO_STAT_NEW(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Cdate);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 tj_aihao_stat_new 数据实体
* @param Cdate">Cdate
* @return<tj_aihao_stat_new 数据实体
* @throws Exception 
*/
public tj_aihao_stat_new_Dao get_tj_aihao_stat_newDao(int Cdate) throws Exception{
         String sqlStr = "{ call TJ_AIHAO_STAT_NEW_PRO.GetTJ_AIHAO_STAT_NEWEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Cdate);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			tj_aihao_stat_new_Dao _obj = new tj_aihao_stat_new_Dao();
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setChannelid(arr.getString("CHANNELID"));
            _obj.setActive_users_month(arr.getInt("ACTIVE_USERS_MONTH"));
            _obj.setData_category(arr.getString("DATA_CATEGORY"));
            _obj.setTime_category(arr.getString("TIME_CATEGORY"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setOpname(arr.getString("OPNAME"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setActive_users_day(arr.getInt("ACTIVE_USERS_DAY"));
            _obj.setActive_users_week(arr.getInt("ACTIVE_USERS_WEEK"));
            _obj.setChanname(arr.getString("CHANNAME"));
            _obj.setRmk1(arr.getString("RMK1"));
            _obj.setRmk2(arr.getString("RMK2"));
            _obj.setRmk3(arr.getString("RMK3"));
            _obj.setRmk4(arr.getString("RMK4"));
			return _obj;
		}
		return null;

}

/**
* 根据TJ_AIHAO_STAT_NEW返回的查询DataRow创建一个TJ_AIHAO_STAT_NEWEntity对象
* @param TJ_AIHAO_STAT_NEW row
* @returnTJ_AIHAO_STAT_NEWList对象
* @throws Exception 
*/
public List<tj_aihao_stat_new_Dao> get_tj_aihao_stat_new_All() throws Exception{
        List<tj_aihao_stat_new_Dao> _list = new ArrayList<tj_aihao_stat_new_Dao>();
		String sqlStr = "{ call TJ_AIHAO_STAT_NEW_PRO.GetTJ_AIHAO_STAT_NEW(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			tj_aihao_stat_new_Dao _obj = new tj_aihao_stat_new_Dao();
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setChannelid(arr.getString("CHANNELID"));
            _obj.setActive_users_month(arr.getInt("ACTIVE_USERS_MONTH"));
            _obj.setData_category(arr.getString("DATA_CATEGORY"));
            _obj.setTime_category(arr.getString("TIME_CATEGORY"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setOpname(arr.getString("OPNAME"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setActive_users_day(arr.getInt("ACTIVE_USERS_DAY"));
            _obj.setActive_users_week(arr.getInt("ACTIVE_USERS_WEEK"));
            _obj.setChanname(arr.getString("CHANNAME"));
            _obj.setRmk1(arr.getString("RMK1"));
            _obj.setRmk2(arr.getString("RMK2"));
            _obj.setRmk3(arr.getString("RMK3"));
            _obj.setRmk4(arr.getString("RMK4"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TJ_AIHAO_STAT_NEW返回的查询DataRow创建一个TJ_AIHAO_STAT_NEWEntity对象
* @param TJ_AIHAO_STAT_NEW row
* @returnTJ_AIHAO_STAT_NEWList对象
* @throws Exception 
*/
public List< tj_aihao_stat_new_Dao> get_tj_aihao_stat_new_All(String strWhere) throws Exception{
         List<tj_aihao_stat_new_Dao> _list = new ArrayList<tj_aihao_stat_new_Dao>();
		 String sqlStr = "{ call TJ_AIHAO_STAT_NEW_PRO.GetTJ_AIHAO_STAT_NEWWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				tj_aihao_stat_new_Dao _obj = new tj_aihao_stat_new_Dao();
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setChannelid(arr.getString("CHANNELID"));
            _obj.setActive_users_month(arr.getInt("ACTIVE_USERS_MONTH"));
            _obj.setData_category(arr.getString("DATA_CATEGORY"));
            _obj.setTime_category(arr.getString("TIME_CATEGORY"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setOpname(arr.getString("OPNAME"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setActive_users_day(arr.getInt("ACTIVE_USERS_DAY"));
            _obj.setActive_users_week(arr.getInt("ACTIVE_USERS_WEEK"));
            _obj.setChanname(arr.getString("CHANNAME"));
            _obj.setRmk1(arr.getString("RMK1"));
            _obj.setRmk2(arr.getString("RMK2"));
            _obj.setRmk3(arr.getString("RMK3"));
            _obj.setRmk4(arr.getString("RMK4"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TJ_AIHAO_STAT_NEW返回 分页数据
* @param TJ_AIHAO_STAT_NEW row
* @returnTJ_AIHAO_STAT_NEWList对象
* @throws Exception 
*/
public List<tj_aihao_stat_new_Dao> get_tj_aihao_stat_new_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<tj_aihao_stat_new_Dao> _list = new ArrayList<tj_aihao_stat_new_Dao>();
		String sqlStr = "{ call TJ_AIHAO_STAT_NEW_PRO.GetTJ_AIHAO_STAT_NEWPage(?,?,?,?,?,?)}";
		OracleParameter[] op = new OracleParameter[6];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "OUT", OracleTypes.NUMBER, "");
		op[2] = new OracleParameter(3, "OUT", OracleTypes.NUMBER, "");
		op[3] = new OracleParameter(4, "IN", OracleTypes.NUMBER, pageIndex);
		op[4] = new OracleParameter(5, "IN", OracleTypes.NUMBER, pageSize);
		op[5] = new OracleParameter(6, "IN", OracleTypes.VARCHAR, strWhere);
		OraclePageCache opc = OracleHelper.executeQueryPage(sqlStr, op);
		OracleCachedRowSet arr = opc.getOcrs();
		while (arr.next()) {
				tj_aihao_stat_new_Dao _obj = new tj_aihao_stat_new_Dao();
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setChannelid(arr.getString("CHANNELID"));
            _obj.setActive_users_month(arr.getInt("ACTIVE_USERS_MONTH"));
            _obj.setData_category(arr.getString("DATA_CATEGORY"));
            _obj.setTime_category(arr.getString("TIME_CATEGORY"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setOpname(arr.getString("OPNAME"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setActive_users_day(arr.getInt("ACTIVE_USERS_DAY"));
            _obj.setActive_users_week(arr.getInt("ACTIVE_USERS_WEEK"));
            _obj.setChanname(arr.getString("CHANNAME"));
            _obj.setRmk1(arr.getString("RMK1"));
            _obj.setRmk2(arr.getString("RMK2"));
            _obj.setRmk3(arr.getString("RMK3"));
            _obj.setRmk4(arr.getString("RMK4"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TJ_AIHAO_STAT_NEW返回的查询DataRow创建一个TJ_AIHAO_STAT_NEWEntity对象
* @param TJ_AIHAO_STAT_NEW row
* @returnTJ_AIHAO_STAT_NEWDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, tj_aihao_stat_new_Dao> get_tj_aihao_stat_new_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictj_aihao_stat_newstrWhere") == null) {
			Dictionary<Integer, tj_aihao_stat_new_Dao> _dic = new Hashtable<Integer, tj_aihao_stat_new_Dao>();
			List<tj_aihao_stat_new_Dao> _list = new ArrayList<tj_aihao_stat_new_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getCdate()), _list.get(i));
			}
			classFactory.cachePut("dictj_aihao_stat_new", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, tj_aihao_stat_new_Dao> _dic = (Dictionary<Integer, tj_aihao_stat_new_Dao>) classFactory
					.cacheGet("dictj_aihao_stat_newstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TJ_AIHAO_STAT_NEW字段加一
* @param FieldName
* @param sid
*/
public int create_tj_aihao_stat_new_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TJ_AIHAO_STAT_NEW_PRO.UpdateFieldTJ_AIHAO_STAT_NEW(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "IN", OracleTypes.NUMBER, sid);
		op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, FieldName);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}
/**
* 更新TJ_AIHAO_STAT_NEWInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_tj_aihao_stat_new_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TJ_AIHAO_STAT_NEW_PRO.UpdateFieldTJ_AIHAO_STAT_NEWV(?,?,?)}";
		OracleParameter[] op = new OracleParameter[3];
		op[0] = new OracleParameter(1, "IN", OracleTypes.NUMBER, sid);
		op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, FieldName);
		op[2] = new OracleParameter(3, "IN", OracleTypes.NUMBER, Num);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;


}
/**
* 更新TJ_AIHAO_STAT_NEWIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_tj_aihao_stat_new_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TJ_AIHAO_STAT_NEW_PRO.UpdateFieldTJ_AIHAO_STAT_NEWU(?,?,?)}";
		OracleParameter[] op = new OracleParameter[3];
		op[0] = new OracleParameter(1, "IN", OracleTypes.NUMBER, sid);
		op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, FieldName);
		op[2] = new OracleParameter(3, "IN", OracleTypes.VARCHAR, Value);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}



}
