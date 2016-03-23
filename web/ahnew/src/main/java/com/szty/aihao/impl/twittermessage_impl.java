/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTwittermessage.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.twittermessage_Dao;
import com.szty.aihao.core.twittermessage_core;
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
*@TWITTERMESSAGE数据接口
*@作者：宋春林 
*/
public class twittermessage_impl implements twittermessage_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(twittermessage_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TWITTERMESSAGE实体
* @return 新插入记录的编号
*/
public int insert_twittermessage(twittermessage_Dao _TWITTERMESSAGEModel)  throws Exception{
         String sqlStr = "{call TWITTERMESSAGE_PRO.InsertTWITTERMESSAGE(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TWITTERMESSAGEModel.getMessageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERMESSAGEModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_TWITTERMESSAGEModel.getSenduserid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TWITTERMESSAGEModel.getContent());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_TWITTERMESSAGEModel.getState());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERMESSAGEModel.getMessagetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TWITTERMESSAGE
* @Object 
* @return 新插入记录的编号
*/
public int insert_twittermessage(Object[] _para)  throws Exception{
      String sqlStr = "{call TWITTERMESSAGE_PRO.InsertTWITTERMESSAGE(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param TWITTERMESSAGE实体
* @return 影响的行数
*/
public int update_twittermessage(twittermessage_Dao _TWITTERMESSAGEModel)  throws Exception{
        String sqlStr = "{call TWITTERMESSAGE_PRO.UpdateTWITTERMESSAGE(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_TWITTERMESSAGEModel.getMessageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERMESSAGEModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_TWITTERMESSAGEModel.getSenduserid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TWITTERMESSAGEModel.getContent());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_TWITTERMESSAGEModel.getState());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERMESSAGEModel.getMessagetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TWITTERMESSAGE中的一条记录
* @param TWITTERMESSAGE实体
* @return 新插入记录的编号
*/
public int delete_twittermessage(int Messageid)  throws Exception{
        String sqlStr = "{call TWITTERMESSAGE_PRO.DeleteTWITTERMESSAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Messageid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 twittermessage 数据实体
* @param Messageid">Messageid
* @return<twittermessage 数据实体
* @throws Exception 
*/
public twittermessage_Dao get_twittermessageDao(int Messageid) throws Exception{
         String sqlStr = "{ call TWITTERMESSAGE_PRO.GetTWITTERMESSAGEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Messageid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twittermessage_Dao _obj = new twittermessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setSenduserid(arr.getInt("SENDUSERID"));
            _obj.setContent(arr.getString("CONTENT"));
            _obj.setState(arr.getInt("STATE"));
             try{_obj.setMessagetime(dateformat.parse(arr.getString("MESSAGETIME")));}catch(Exception ce){_obj.setMessagetime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据TWITTERMESSAGE返回的查询DataRow创建一个TWITTERMESSAGEEntity对象
* @param TWITTERMESSAGE row
* @returnTWITTERMESSAGEList对象
* @throws Exception 
*/
public List<twittermessage_Dao> get_twittermessage_All() throws Exception{
        List<twittermessage_Dao> _list = new ArrayList<twittermessage_Dao>();
		String sqlStr = "{ call TWITTERMESSAGE_PRO.GetTWITTERMESSAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twittermessage_Dao _obj = new twittermessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setSenduserid(arr.getInt("SENDUSERID"));
            _obj.setContent(arr.getString("CONTENT"));
            _obj.setState(arr.getInt("STATE"));
            try{_obj.setMessagetime(dateformat.parse(arr.getString("MESSAGETIME")));}catch(Exception ce){_obj.setMessagetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TWITTERMESSAGE返回的查询DataRow创建一个TWITTERMESSAGEEntity对象
* @param TWITTERMESSAGE row
* @returnTWITTERMESSAGEList对象
* @throws Exception 
*/
public List< twittermessage_Dao> get_twittermessage_All(String strWhere) throws Exception{
         List<twittermessage_Dao> _list = new ArrayList<twittermessage_Dao>();
		 String sqlStr = "{ call TWITTERMESSAGE_PRO.GetTWITTERMESSAGEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				twittermessage_Dao _obj = new twittermessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setSenduserid(arr.getInt("SENDUSERID"));
            _obj.setContent(arr.getString("CONTENT"));
            _obj.setState(arr.getInt("STATE"));
           try{_obj.setMessagetime(dateformat.parse(arr.getString("MESSAGETIME")));}catch(Exception ce){_obj.setMessagetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TWITTERMESSAGE返回 分页数据
* @param TWITTERMESSAGE row
* @returnTWITTERMESSAGEList对象
* @throws Exception 
*/
public List<twittermessage_Dao> get_twittermessage_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<twittermessage_Dao> _list = new ArrayList<twittermessage_Dao>();
		String sqlStr = "{ call TWITTERMESSAGE_PRO.GetTWITTERMESSAGEPage(?,?,?,?,?,?)}";
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
				twittermessage_Dao _obj = new twittermessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setSenduserid(arr.getInt("SENDUSERID"));
            _obj.setContent(arr.getString("CONTENT"));
            _obj.setState(arr.getInt("STATE"));
            try{_obj.setMessagetime(dateformat.parse(arr.getString("MESSAGETIME")));}catch(Exception ce){_obj.setMessagetime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TWITTERMESSAGE返回的查询DataRow创建一个TWITTERMESSAGEEntity对象
* @param TWITTERMESSAGE row
* @returnTWITTERMESSAGEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, twittermessage_Dao> get_twittermessage_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictwittermessagestrWhere") == null) {
			Dictionary<Integer, twittermessage_Dao> _dic = new Hashtable<Integer, twittermessage_Dao>();
			List<twittermessage_Dao> _list = new ArrayList<twittermessage_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMessageid()), _list.get(i));
			}
			classFactory.cachePut("dictwittermessage", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, twittermessage_Dao> _dic = (Dictionary<Integer, twittermessage_Dao>) classFactory
					.cacheGet("dictwittermessagestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TWITTERMESSAGE字段加一
* @param FieldName
* @param sid
*/
public int create_twittermessage_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TWITTERMESSAGE_PRO.UpdateFieldTWITTERMESSAGE(?,?)}";
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
* 更新TWITTERMESSAGEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_twittermessage_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TWITTERMESSAGE_PRO.UpdateFieldTWITTERMESSAGEV(?,?,?)}";
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
* 更新TWITTERMESSAGEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_twittermessage_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TWITTERMESSAGE_PRO.UpdateFieldTWITTERMESSAGEU(?,?,?)}";
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
