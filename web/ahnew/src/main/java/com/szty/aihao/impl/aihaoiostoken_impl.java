﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaoiostoken.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaoiostoken_Dao;
import com.szty.aihao.core.aihaoiostoken_core;
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
*@AIHAOIOSTOKEN数据接口
*@作者：宋春林 
*/
public class aihaoiostoken_impl implements aihaoiostoken_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaoiostoken_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOIOSTOKEN实体
* @return 新插入记录的编号
*/
public int insert_aihaoiostoken(aihaoiostoken_Dao _AIHAOIOSTOKENModel)  throws Exception{
         String sqlStr = "{call AIHAOIOSTOKEN_PRO.InsertAIHAOIOSTOKEN(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOIOSTOKENModel.getProductid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getPcode());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getChannel());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getVer());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getImsi());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getMobile());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getPb());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getPm());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getOs());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getToken());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getTokentype());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOIOSTOKENModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOIOSTOKEN
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaoiostoken(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOIOSTOKEN_PRO.InsertAIHAOIOSTOKEN(?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[12];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_para[11]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOIOSTOKEN实体
* @return 影响的行数
*/
public int update_aihaoiostoken(aihaoiostoken_Dao _AIHAOIOSTOKENModel)  throws Exception{
        String sqlStr = "{call AIHAOIOSTOKEN_PRO.UpdateAIHAOIOSTOKEN(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getProductid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getPcode());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getChannel());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getVer());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getImsi());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getMobile());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getPb());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getPm());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getOs());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getToken());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOIOSTOKENModel.getTokentype());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOIOSTOKENModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOIOSTOKEN中的一条记录
* @param AIHAOIOSTOKEN实体
* @return 新插入记录的编号
*/
public int delete_aihaoiostoken(int Productid)  throws Exception{
        String sqlStr = "{call AIHAOIOSTOKEN_PRO.DeleteAIHAOIOSTOKEN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Productid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaoiostoken 数据实体
* @param Productid">Productid
* @return<aihaoiostoken 数据实体
* @throws Exception 
*/
public aihaoiostoken_Dao get_aihaoiostokenDao(int Productid) throws Exception{
         String sqlStr = "{ call AIHAOIOSTOKEN_PRO.GetAIHAOIOSTOKENEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Productid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoiostoken_Dao _obj = new aihaoiostoken_Dao();
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
            _obj.setToken(arr.getString("TOKEN"));
            _obj.setTokentype(arr.getString("TOKENTYPE"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOIOSTOKEN返回的查询DataRow创建一个AIHAOIOSTOKENEntity对象
* @param AIHAOIOSTOKEN row
* @returnAIHAOIOSTOKENList对象
* @throws Exception 
*/
public List<aihaoiostoken_Dao> get_aihaoiostoken_All() throws Exception{
        List<aihaoiostoken_Dao> _list = new ArrayList<aihaoiostoken_Dao>();
		String sqlStr = "{ call AIHAOIOSTOKEN_PRO.GetAIHAOIOSTOKEN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoiostoken_Dao _obj = new aihaoiostoken_Dao();
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
            _obj.setToken(arr.getString("TOKEN"));
            _obj.setTokentype(arr.getString("TOKENTYPE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOIOSTOKEN返回的查询DataRow创建一个AIHAOIOSTOKENEntity对象
* @param AIHAOIOSTOKEN row
* @returnAIHAOIOSTOKENList对象
* @throws Exception 
*/
public List< aihaoiostoken_Dao> get_aihaoiostoken_All(String strWhere) throws Exception{
         List<aihaoiostoken_Dao> _list = new ArrayList<aihaoiostoken_Dao>();
		 String sqlStr = "{ call AIHAOIOSTOKEN_PRO.GetAIHAOIOSTOKENWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaoiostoken_Dao _obj = new aihaoiostoken_Dao();
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
            _obj.setToken(arr.getString("TOKEN"));
            _obj.setTokentype(arr.getString("TOKENTYPE"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOIOSTOKEN返回 分页数据
* @param AIHAOIOSTOKEN row
* @returnAIHAOIOSTOKENList对象
* @throws Exception 
*/
public List<aihaoiostoken_Dao> get_aihaoiostoken_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaoiostoken_Dao> _list = new ArrayList<aihaoiostoken_Dao>();
		String sqlStr = "{ call AIHAOIOSTOKEN_PRO.GetAIHAOIOSTOKENPage(?,?,?,?,?,?)}";
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
				aihaoiostoken_Dao _obj = new aihaoiostoken_Dao();
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
            _obj.setToken(arr.getString("TOKEN"));
            _obj.setTokentype(arr.getString("TOKENTYPE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOIOSTOKEN返回的查询DataRow创建一个AIHAOIOSTOKENEntity对象
* @param AIHAOIOSTOKEN row
* @returnAIHAOIOSTOKENDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaoiostoken_Dao> get_aihaoiostoken_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaoiostokenstrWhere") == null) {
			Dictionary<Integer, aihaoiostoken_Dao> _dic = new Hashtable<Integer, aihaoiostoken_Dao>();
			List<aihaoiostoken_Dao> _list = new ArrayList<aihaoiostoken_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getProductid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaoiostoken", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaoiostoken_Dao> _dic = (Dictionary<Integer, aihaoiostoken_Dao>) classFactory
					.cacheGet("dicaihaoiostokenstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOIOSTOKEN字段加一
* @param FieldName
* @param sid
*/
public int create_aihaoiostoken_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOIOSTOKEN_PRO.UpdateFieldAIHAOIOSTOKEN(?,?)}";
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
* 更新AIHAOIOSTOKENInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaoiostoken_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOIOSTOKEN_PRO.UpdateFieldAIHAOIOSTOKENV(?,?,?)}";
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
* 更新AIHAOIOSTOKENIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaoiostoken_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOIOSTOKEN_PRO.UpdateFieldAIHAOIOSTOKENU(?,?,?)}";
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
