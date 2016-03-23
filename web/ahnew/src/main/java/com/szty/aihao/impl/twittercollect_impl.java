/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTwittercollect.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.twittercollect_Dao;
import com.szty.aihao.core.twittercollect_core;
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
*@TWITTERCOLLECT数据接口
*@作者：宋春林 
*/
public class twittercollect_impl implements twittercollect_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(twittercollect_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TWITTERCOLLECT实体
* @return 新插入记录的编号
*/
public int insert_twittercollect(twittercollect_Dao _TWITTERCOLLECTModel)  throws Exception{
         String sqlStr = "{call TWITTERCOLLECT_PRO.InsertTWITTERCOLLECT(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TWITTERCOLLECTModel.getCollectid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERCOLLECTModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_TWITTERCOLLECTModel.getTopicsid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERCOLLECTModel.getCollecttime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TWITTERCOLLECT
* @Object 
* @return 新插入记录的编号
*/
public int insert_twittercollect(Object[] _para)  throws Exception{
      String sqlStr = "{call TWITTERCOLLECT_PRO.InsertTWITTERCOLLECT(?,?,?,?)}";
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
* @param TWITTERCOLLECT实体
* @return 影响的行数
*/
public int update_twittercollect(twittercollect_Dao _TWITTERCOLLECTModel)  throws Exception{
        String sqlStr = "{call TWITTERCOLLECT_PRO.UpdateTWITTERCOLLECT(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_TWITTERCOLLECTModel.getCollectid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERCOLLECTModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_TWITTERCOLLECTModel.getTopicsid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERCOLLECTModel.getCollecttime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TWITTERCOLLECT中的一条记录
* @param TWITTERCOLLECT实体
* @return 新插入记录的编号
*/
public int delete_twittercollect(int Collectid)  throws Exception{
        String sqlStr = "{call TWITTERCOLLECT_PRO.DeleteTWITTERCOLLECT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Collectid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 twittercollect 数据实体
* @param Collectid">Collectid
* @return<twittercollect 数据实体
* @throws Exception 
*/
public twittercollect_Dao get_twittercollectDao(int Collectid) throws Exception{
         String sqlStr = "{ call TWITTERCOLLECT_PRO.GetTWITTERCOLLECTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Collectid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twittercollect_Dao _obj = new twittercollect_Dao();
            _obj.setCollectid(arr.getInt("COLLECTID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setTopicsid(arr.getInt("TOPICSID"));
             try{_obj.setCollecttime(dateformat.parse(arr.getString("COLLECTTIME")));}catch(Exception ce){_obj.setCollecttime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据TWITTERCOLLECT返回的查询DataRow创建一个TWITTERCOLLECTEntity对象
* @param TWITTERCOLLECT row
* @returnTWITTERCOLLECTList对象
* @throws Exception 
*/
public List<twittercollect_Dao> get_twittercollect_All() throws Exception{
        List<twittercollect_Dao> _list = new ArrayList<twittercollect_Dao>();
		String sqlStr = "{ call TWITTERCOLLECT_PRO.GetTWITTERCOLLECT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twittercollect_Dao _obj = new twittercollect_Dao();
            _obj.setCollectid(arr.getInt("COLLECTID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setTopicsid(arr.getInt("TOPICSID"));
            try{_obj.setCollecttime(dateformat.parse(arr.getString("COLLECTTIME")));}catch(Exception ce){_obj.setCollecttime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TWITTERCOLLECT返回的查询DataRow创建一个TWITTERCOLLECTEntity对象
* @param TWITTERCOLLECT row
* @returnTWITTERCOLLECTList对象
* @throws Exception 
*/
public List< twittercollect_Dao> get_twittercollect_All(String strWhere) throws Exception{
         List<twittercollect_Dao> _list = new ArrayList<twittercollect_Dao>();
		 String sqlStr = "{ call TWITTERCOLLECT_PRO.GetTWITTERCOLLECTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				twittercollect_Dao _obj = new twittercollect_Dao();
            _obj.setCollectid(arr.getInt("COLLECTID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setTopicsid(arr.getInt("TOPICSID"));
           try{_obj.setCollecttime(dateformat.parse(arr.getString("COLLECTTIME")));}catch(Exception ce){_obj.setCollecttime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TWITTERCOLLECT返回 分页数据
* @param TWITTERCOLLECT row
* @returnTWITTERCOLLECTList对象
* @throws Exception 
*/
public List<twittercollect_Dao> get_twittercollect_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<twittercollect_Dao> _list = new ArrayList<twittercollect_Dao>();
		String sqlStr = "{ call TWITTERCOLLECT_PRO.GetTWITTERCOLLECTPage(?,?,?,?,?,?)}";
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
				twittercollect_Dao _obj = new twittercollect_Dao();
            _obj.setCollectid(arr.getInt("COLLECTID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setTopicsid(arr.getInt("TOPICSID"));
            try{_obj.setCollecttime(dateformat.parse(arr.getString("COLLECTTIME")));}catch(Exception ce){_obj.setCollecttime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TWITTERCOLLECT返回的查询DataRow创建一个TWITTERCOLLECTEntity对象
* @param TWITTERCOLLECT row
* @returnTWITTERCOLLECTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, twittercollect_Dao> get_twittercollect_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictwittercollectstrWhere") == null) {
			Dictionary<Integer, twittercollect_Dao> _dic = new Hashtable<Integer, twittercollect_Dao>();
			List<twittercollect_Dao> _list = new ArrayList<twittercollect_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getCollectid()), _list.get(i));
			}
			classFactory.cachePut("dictwittercollect", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, twittercollect_Dao> _dic = (Dictionary<Integer, twittercollect_Dao>) classFactory
					.cacheGet("dictwittercollectstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TWITTERCOLLECT字段加一
* @param FieldName
* @param sid
*/
public int create_twittercollect_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TWITTERCOLLECT_PRO.UpdateFieldTWITTERCOLLECT(?,?)}";
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
* 更新TWITTERCOLLECTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_twittercollect_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TWITTERCOLLECT_PRO.UpdateFieldTWITTERCOLLECTV(?,?,?)}";
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
* 更新TWITTERCOLLECTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_twittercollect_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TWITTERCOLLECT_PRO.UpdateFieldTWITTERCOLLECTU(?,?,?)}";
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
