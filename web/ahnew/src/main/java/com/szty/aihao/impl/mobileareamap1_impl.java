/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMobileareamap1.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mobileareamap1_Dao;
import com.szty.aihao.core.mobileareamap1_core;
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
*@MOBILEAREAMAP1数据接口
*@作者：宋春林 
*/
public class mobileareamap1_impl implements mobileareamap1_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mobileareamap1_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MOBILEAREAMAP1实体
* @return 新插入记录的编号
*/
public int insert_mobileareamap1(mobileareamap1_Dao _MOBILEAREAMAP1Model)  throws Exception{
         String sqlStr = "{call MOBILEAREAMAP1_PRO.InsertMOBILEAREAMAP1(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MOBILEAREAMAP1Model.getCountryid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getCountryname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getPrefix());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getProvince_id());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getProvince_name());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getArea_id());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getArea_name());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getCardtype());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.BIGINT,_MOBILEAREAMAP1Model.getMobile_type());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MOBILEAREAMAP1
* @Object 
* @return 新插入记录的编号
*/
public int insert_mobileareamap1(Object[] _para)  throws Exception{
      String sqlStr = "{call MOBILEAREAMAP1_PRO.InsertMOBILEAREAMAP1(?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[9];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.BIGINT,_para[8]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MOBILEAREAMAP1实体
* @return 影响的行数
*/
public int update_mobileareamap1(mobileareamap1_Dao _MOBILEAREAMAP1Model)  throws Exception{
        String sqlStr = "{call MOBILEAREAMAP1_PRO.UpdateMOBILEAREAMAP1(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getCountryid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getCountryname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getPrefix());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getProvince_id());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getProvince_name());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getArea_id());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getArea_name());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAP1Model.getCardtype());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.BIGINT,_MOBILEAREAMAP1Model.getMobile_type());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MOBILEAREAMAP1中的一条记录
* @param MOBILEAREAMAP1实体
* @return 新插入记录的编号
*/
public int delete_mobileareamap1(int Countryid)  throws Exception{
        String sqlStr = "{call MOBILEAREAMAP1_PRO.DeleteMOBILEAREAMAP1(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Countryid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mobileareamap1 数据实体
* @param Countryid">Countryid
* @return<mobileareamap1 数据实体
* @throws Exception 
*/
public mobileareamap1_Dao get_mobileareamap1Dao(int Countryid) throws Exception{
         String sqlStr = "{ call MOBILEAREAMAP1_PRO.GetMOBILEAREAMAP1Entity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Countryid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mobileareamap1_Dao _obj = new mobileareamap1_Dao();
            _obj.setCountryid(arr.getString("COUNTRYID"));
            _obj.setCountryname(arr.getString("COUNTRYNAME"));
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
            _obj.setCardtype(arr.getString("CARDTYPE"));
			return _obj;
		}
		return null;

}

/**
* 根据MOBILEAREAMAP1返回的查询DataRow创建一个MOBILEAREAMAP1Entity对象
* @param MOBILEAREAMAP1 row
* @returnMOBILEAREAMAP1List对象
* @throws Exception 
*/
public List<mobileareamap1_Dao> get_mobileareamap1_All() throws Exception{
        List<mobileareamap1_Dao> _list = new ArrayList<mobileareamap1_Dao>();
		String sqlStr = "{ call MOBILEAREAMAP1_PRO.GetMOBILEAREAMAP1(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mobileareamap1_Dao _obj = new mobileareamap1_Dao();
            _obj.setCountryid(arr.getString("COUNTRYID"));
            _obj.setCountryname(arr.getString("COUNTRYNAME"));
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
            _obj.setCardtype(arr.getString("CARDTYPE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MOBILEAREAMAP1返回的查询DataRow创建一个MOBILEAREAMAP1Entity对象
* @param MOBILEAREAMAP1 row
* @returnMOBILEAREAMAP1List对象
* @throws Exception 
*/
public List< mobileareamap1_Dao> get_mobileareamap1_All(String strWhere) throws Exception{
         List<mobileareamap1_Dao> _list = new ArrayList<mobileareamap1_Dao>();
		 String sqlStr = "{ call MOBILEAREAMAP1_PRO.GetMOBILEAREAMAP1Where(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mobileareamap1_Dao _obj = new mobileareamap1_Dao();
            _obj.setCountryid(arr.getString("COUNTRYID"));
            _obj.setCountryname(arr.getString("COUNTRYNAME"));
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
            _obj.setCardtype(arr.getString("CARDTYPE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MOBILEAREAMAP1返回 分页数据
* @param MOBILEAREAMAP1 row
* @returnMOBILEAREAMAP1List对象
* @throws Exception 
*/
public List<mobileareamap1_Dao> get_mobileareamap1_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mobileareamap1_Dao> _list = new ArrayList<mobileareamap1_Dao>();
		String sqlStr = "{ call MOBILEAREAMAP1_PRO.GetMOBILEAREAMAP1Page(?,?,?,?,?,?)}";
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
				mobileareamap1_Dao _obj = new mobileareamap1_Dao();
            _obj.setCountryid(arr.getString("COUNTRYID"));
            _obj.setCountryname(arr.getString("COUNTRYNAME"));
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
            _obj.setCardtype(arr.getString("CARDTYPE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MOBILEAREAMAP1返回的查询DataRow创建一个MOBILEAREAMAP1Entity对象
* @param MOBILEAREAMAP1 row
* @returnMOBILEAREAMAP1Dictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mobileareamap1_Dao> get_mobileareamap1_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmobileareamap1strWhere") == null) {
			Dictionary<Integer, mobileareamap1_Dao> _dic = new Hashtable<Integer, mobileareamap1_Dao>();
			List<mobileareamap1_Dao> _list = new ArrayList<mobileareamap1_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getCountryid()), _list.get(i));
			}
			classFactory.cachePut("dicmobileareamap1", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mobileareamap1_Dao> _dic = (Dictionary<Integer, mobileareamap1_Dao>) classFactory
					.cacheGet("dicmobileareamap1strWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MOBILEAREAMAP1字段加一
* @param FieldName
* @param sid
*/
public int create_mobileareamap1_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MOBILEAREAMAP1_PRO.UpdateFieldMOBILEAREAMAP1(?,?)}";
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
* 更新MOBILEAREAMAP1Int型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mobileareamap1_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MOBILEAREAMAP1_PRO.UpdateFieldMOBILEAREAMAP1V(?,?,?)}";
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
* 更新MOBILEAREAMAP1IString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mobileareamap1_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MOBILEAREAMAP1_PRO.UpdateFieldMOBILEAREAMAP1U(?,?,?)}";
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
