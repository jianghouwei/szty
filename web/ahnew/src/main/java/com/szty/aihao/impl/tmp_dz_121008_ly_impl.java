﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTmp_dz_121008_ly.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.tmp_dz_121008_ly_Dao;
import com.szty.aihao.core.tmp_dz_121008_ly_core;
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
*@TMP_DZ_121008_LY数据接口
*@作者：宋春林 
*/
public class tmp_dz_121008_ly_impl implements tmp_dz_121008_ly_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(tmp_dz_121008_ly_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TMP_DZ_121008_LY实体
* @return 新插入记录的编号
*/
public int insert_tmp_dz_121008_ly(tmp_dz_121008_ly_Dao _TMP_DZ_121008_LYModel)  throws Exception{
         String sqlStr = "{call TMP_DZ_121008_LY_PRO.InsertTMP_DZ_121008_LY(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TMP_DZ_121008_LYModel.getP1());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TMP_DZ_121008_LYModel.getP2());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TMP_DZ_121008_LYModel.getP3());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TMP_DZ_121008_LYModel.getP4());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_TMP_DZ_121008_LYModel.getP5());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TMP_DZ_121008_LY
* @Object 
* @return 新插入记录的编号
*/
public int insert_tmp_dz_121008_ly(Object[] _para)  throws Exception{
      String sqlStr = "{call TMP_DZ_121008_LY_PRO.InsertTMP_DZ_121008_LY(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param TMP_DZ_121008_LY实体
* @return 影响的行数
*/
public int update_tmp_dz_121008_ly(tmp_dz_121008_ly_Dao _TMP_DZ_121008_LYModel)  throws Exception{
        String sqlStr = "{call TMP_DZ_121008_LY_PRO.UpdateTMP_DZ_121008_LY(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_TMP_DZ_121008_LYModel.getP1());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TMP_DZ_121008_LYModel.getP2());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TMP_DZ_121008_LYModel.getP3());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TMP_DZ_121008_LYModel.getP4());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_TMP_DZ_121008_LYModel.getP5());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TMP_DZ_121008_LY中的一条记录
* @param TMP_DZ_121008_LY实体
* @return 新插入记录的编号
*/
public int delete_tmp_dz_121008_ly(int P1)  throws Exception{
        String sqlStr = "{call TMP_DZ_121008_LY_PRO.DeleteTMP_DZ_121008_LY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, P1);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 tmp_dz_121008_ly 数据实体
* @param P1">P1
* @return<tmp_dz_121008_ly 数据实体
* @throws Exception 
*/
public tmp_dz_121008_ly_Dao get_tmp_dz_121008_lyDao(int P1) throws Exception{
         String sqlStr = "{ call TMP_DZ_121008_LY_PRO.GetTMP_DZ_121008_LYEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, P1);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			tmp_dz_121008_ly_Dao _obj = new tmp_dz_121008_ly_Dao();
            _obj.setP1(arr.getString("P1"));
            _obj.setP2(arr.getString("P2"));
            _obj.setP3(arr.getString("P3"));
            _obj.setP4(arr.getString("P4"));
            _obj.setP5(arr.getString("P5"));
			return _obj;
		}
		return null;

}

/**
* 根据TMP_DZ_121008_LY返回的查询DataRow创建一个TMP_DZ_121008_LYEntity对象
* @param TMP_DZ_121008_LY row
* @returnTMP_DZ_121008_LYList对象
* @throws Exception 
*/
public List<tmp_dz_121008_ly_Dao> get_tmp_dz_121008_ly_All() throws Exception{
        List<tmp_dz_121008_ly_Dao> _list = new ArrayList<tmp_dz_121008_ly_Dao>();
		String sqlStr = "{ call TMP_DZ_121008_LY_PRO.GetTMP_DZ_121008_LY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			tmp_dz_121008_ly_Dao _obj = new tmp_dz_121008_ly_Dao();
            _obj.setP1(arr.getString("P1"));
            _obj.setP2(arr.getString("P2"));
            _obj.setP3(arr.getString("P3"));
            _obj.setP4(arr.getString("P4"));
            _obj.setP5(arr.getString("P5"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TMP_DZ_121008_LY返回的查询DataRow创建一个TMP_DZ_121008_LYEntity对象
* @param TMP_DZ_121008_LY row
* @returnTMP_DZ_121008_LYList对象
* @throws Exception 
*/
public List< tmp_dz_121008_ly_Dao> get_tmp_dz_121008_ly_All(String strWhere) throws Exception{
         List<tmp_dz_121008_ly_Dao> _list = new ArrayList<tmp_dz_121008_ly_Dao>();
		 String sqlStr = "{ call TMP_DZ_121008_LY_PRO.GetTMP_DZ_121008_LYWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				tmp_dz_121008_ly_Dao _obj = new tmp_dz_121008_ly_Dao();
            _obj.setP1(arr.getString("P1"));
            _obj.setP2(arr.getString("P2"));
            _obj.setP3(arr.getString("P3"));
            _obj.setP4(arr.getString("P4"));
            _obj.setP5(arr.getString("P5"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TMP_DZ_121008_LY返回 分页数据
* @param TMP_DZ_121008_LY row
* @returnTMP_DZ_121008_LYList对象
* @throws Exception 
*/
public List<tmp_dz_121008_ly_Dao> get_tmp_dz_121008_ly_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<tmp_dz_121008_ly_Dao> _list = new ArrayList<tmp_dz_121008_ly_Dao>();
		String sqlStr = "{ call TMP_DZ_121008_LY_PRO.GetTMP_DZ_121008_LYPage(?,?,?,?,?,?)}";
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
				tmp_dz_121008_ly_Dao _obj = new tmp_dz_121008_ly_Dao();
            _obj.setP1(arr.getString("P1"));
            _obj.setP2(arr.getString("P2"));
            _obj.setP3(arr.getString("P3"));
            _obj.setP4(arr.getString("P4"));
            _obj.setP5(arr.getString("P5"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TMP_DZ_121008_LY返回的查询DataRow创建一个TMP_DZ_121008_LYEntity对象
* @param TMP_DZ_121008_LY row
* @returnTMP_DZ_121008_LYDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, tmp_dz_121008_ly_Dao> get_tmp_dz_121008_ly_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictmp_dz_121008_lystrWhere") == null) {
			Dictionary<Integer, tmp_dz_121008_ly_Dao> _dic = new Hashtable<Integer, tmp_dz_121008_ly_Dao>();
			List<tmp_dz_121008_ly_Dao> _list = new ArrayList<tmp_dz_121008_ly_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getP1()), _list.get(i));
			}
			classFactory.cachePut("dictmp_dz_121008_ly", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, tmp_dz_121008_ly_Dao> _dic = (Dictionary<Integer, tmp_dz_121008_ly_Dao>) classFactory
					.cacheGet("dictmp_dz_121008_lystrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TMP_DZ_121008_LY字段加一
* @param FieldName
* @param sid
*/
public int create_tmp_dz_121008_ly_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TMP_DZ_121008_LY_PRO.UpdateFieldTMP_DZ_121008_LY(?,?)}";
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
* 更新TMP_DZ_121008_LYInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_tmp_dz_121008_ly_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TMP_DZ_121008_LY_PRO.UpdateFieldTMP_DZ_121008_LYV(?,?,?)}";
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
* 更新TMP_DZ_121008_LYIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_tmp_dz_121008_ly_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TMP_DZ_121008_LY_PRO.UpdateFieldTMP_DZ_121008_LYU(?,?,?)}";
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
