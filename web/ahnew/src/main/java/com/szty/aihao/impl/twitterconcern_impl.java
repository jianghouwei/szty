/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTwitterconcern.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.twitterconcern_Dao;
import com.szty.aihao.core.twitterconcern_core;
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
*@TWITTERCONCERN数据接口
*@作者：宋春林 
*/
public class twitterconcern_impl implements twitterconcern_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(twitterconcern_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TWITTERCONCERN实体
* @return 新插入记录的编号
*/
public int insert_twitterconcern(twitterconcern_Dao _TWITTERCONCERNModel)  throws Exception{
         String sqlStr = "{call TWITTERCONCERN_PRO.InsertTWITTERCONCERN(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TWITTERCONCERNModel.getConcernid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERCONCERNModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_TWITTERCONCERNModel.getPassiveuserid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERCONCERNModel.getConcerntime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TWITTERCONCERN
* @Object 
* @return 新插入记录的编号
*/
public int insert_twitterconcern(Object[] _para)  throws Exception{
      String sqlStr = "{call TWITTERCONCERN_PRO.InsertTWITTERCONCERN(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param TWITTERCONCERN实体
* @return 影响的行数
*/
public int update_twitterconcern(twitterconcern_Dao _TWITTERCONCERNModel)  throws Exception{
        String sqlStr = "{call TWITTERCONCERN_PRO.UpdateTWITTERCONCERN(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_TWITTERCONCERNModel.getConcernid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERCONCERNModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_TWITTERCONCERNModel.getPassiveuserid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERCONCERNModel.getConcerntime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TWITTERCONCERN中的一条记录
* @param TWITTERCONCERN实体
* @return 新插入记录的编号
*/
public int delete_twitterconcern(int Concernid)  throws Exception{
        String sqlStr = "{call TWITTERCONCERN_PRO.DeleteTWITTERCONCERN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Concernid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 twitterconcern 数据实体
* @param Concernid">Concernid
* @return<twitterconcern 数据实体
* @throws Exception 
*/
public twitterconcern_Dao get_twitterconcernDao(int Concernid) throws Exception{
         String sqlStr = "{ call TWITTERCONCERN_PRO.GetTWITTERCONCERNEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Concernid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twitterconcern_Dao _obj = new twitterconcern_Dao();
            _obj.setConcernid(arr.getInt("CONCERNID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setPassiveuserid(arr.getInt("PASSIVEUSERID"));
             try{_obj.setConcerntime(dateformat.parse(arr.getString("CONCERNTIME")));}catch(Exception ce){_obj.setConcerntime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据TWITTERCONCERN返回的查询DataRow创建一个TWITTERCONCERNEntity对象
* @param TWITTERCONCERN row
* @returnTWITTERCONCERNList对象
* @throws Exception 
*/
public List<twitterconcern_Dao> get_twitterconcern_All() throws Exception{
        List<twitterconcern_Dao> _list = new ArrayList<twitterconcern_Dao>();
		String sqlStr = "{ call TWITTERCONCERN_PRO.GetTWITTERCONCERN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twitterconcern_Dao _obj = new twitterconcern_Dao();
            _obj.setConcernid(arr.getInt("CONCERNID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setPassiveuserid(arr.getInt("PASSIVEUSERID"));
            try{_obj.setConcerntime(dateformat.parse(arr.getString("CONCERNTIME")));}catch(Exception ce){_obj.setConcerntime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TWITTERCONCERN返回的查询DataRow创建一个TWITTERCONCERNEntity对象
* @param TWITTERCONCERN row
* @returnTWITTERCONCERNList对象
* @throws Exception 
*/
public List< twitterconcern_Dao> get_twitterconcern_All(String strWhere) throws Exception{
         List<twitterconcern_Dao> _list = new ArrayList<twitterconcern_Dao>();
		 String sqlStr = "{ call TWITTERCONCERN_PRO.GetTWITTERCONCERNWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				twitterconcern_Dao _obj = new twitterconcern_Dao();
            _obj.setConcernid(arr.getInt("CONCERNID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setPassiveuserid(arr.getInt("PASSIVEUSERID"));
           try{_obj.setConcerntime(dateformat.parse(arr.getString("CONCERNTIME")));}catch(Exception ce){_obj.setConcerntime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TWITTERCONCERN返回 分页数据
* @param TWITTERCONCERN row
* @returnTWITTERCONCERNList对象
* @throws Exception 
*/
public List<twitterconcern_Dao> get_twitterconcern_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<twitterconcern_Dao> _list = new ArrayList<twitterconcern_Dao>();
		String sqlStr = "{ call TWITTERCONCERN_PRO.GetTWITTERCONCERNPage(?,?,?,?,?,?)}";
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
				twitterconcern_Dao _obj = new twitterconcern_Dao();
            _obj.setConcernid(arr.getInt("CONCERNID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setPassiveuserid(arr.getInt("PASSIVEUSERID"));
            try{_obj.setConcerntime(dateformat.parse(arr.getString("CONCERNTIME")));}catch(Exception ce){_obj.setConcerntime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TWITTERCONCERN返回的查询DataRow创建一个TWITTERCONCERNEntity对象
* @param TWITTERCONCERN row
* @returnTWITTERCONCERNDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, twitterconcern_Dao> get_twitterconcern_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictwitterconcernstrWhere") == null) {
			Dictionary<Integer, twitterconcern_Dao> _dic = new Hashtable<Integer, twitterconcern_Dao>();
			List<twitterconcern_Dao> _list = new ArrayList<twitterconcern_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getConcernid()), _list.get(i));
			}
			classFactory.cachePut("dictwitterconcern", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, twitterconcern_Dao> _dic = (Dictionary<Integer, twitterconcern_Dao>) classFactory
					.cacheGet("dictwitterconcernstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TWITTERCONCERN字段加一
* @param FieldName
* @param sid
*/
public int create_twitterconcern_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TWITTERCONCERN_PRO.UpdateFieldTWITTERCONCERN(?,?)}";
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
* 更新TWITTERCONCERNInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_twitterconcern_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TWITTERCONCERN_PRO.UpdateFieldTWITTERCONCERNV(?,?,?)}";
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
* 更新TWITTERCONCERNIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_twitterconcern_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TWITTERCONCERN_PRO.UpdateFieldTWITTERCONCERNU(?,?,?)}";
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
