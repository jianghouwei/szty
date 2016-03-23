/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumquote.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumquote_Dao;
import com.szty.aihao.core.mvnforumquote_core;
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
*@MVNFORUMQUOTE数据接口
*@作者：宋春林 
*/
public class mvnforumquote_impl implements mvnforumquote_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumquote_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMQUOTE实体
* @return 新插入记录的编号
*/
public int insert_mvnforumquote(mvnforumquote_Dao _MVNFORUMQUOTEModel)  throws Exception{
         String sqlStr = "{call MVNFORUMQUOTE_PRO.InsertMVNFORUMQUOTE(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMQUOTEModel.getQuoteid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMQUOTEModel.getPageid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMQUOTEModel.getQuotetype());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMQUOTEModel.getResourceid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMQUOTE
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumquote(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMQUOTE_PRO.InsertMVNFORUMQUOTE(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMQUOTE实体
* @return 影响的行数
*/
public int update_mvnforumquote(mvnforumquote_Dao _MVNFORUMQUOTEModel)  throws Exception{
        String sqlStr = "{call MVNFORUMQUOTE_PRO.UpdateMVNFORUMQUOTE(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMQUOTEModel.getQuoteid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMQUOTEModel.getPageid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMQUOTEModel.getQuotetype());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMQUOTEModel.getResourceid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMQUOTE中的一条记录
* @param MVNFORUMQUOTE实体
* @return 新插入记录的编号
*/
public int delete_mvnforumquote(int Quoteid)  throws Exception{
        String sqlStr = "{call MVNFORUMQUOTE_PRO.DeleteMVNFORUMQUOTE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Quoteid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumquote 数据实体
* @param Quoteid">Quoteid
* @return<mvnforumquote 数据实体
* @throws Exception 
*/
public mvnforumquote_Dao get_mvnforumquoteDao(int Quoteid) throws Exception{
         String sqlStr = "{ call MVNFORUMQUOTE_PRO.GetMVNFORUMQUOTEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Quoteid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumquote_Dao _obj = new mvnforumquote_Dao();
            _obj.setQuoteid(arr.getInt("QUOTEID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setQuotetype(arr.getInt("QUOTETYPE"));
            _obj.setResourceid(arr.getInt("RESOURCEID"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMQUOTE返回的查询DataRow创建一个MVNFORUMQUOTEEntity对象
* @param MVNFORUMQUOTE row
* @returnMVNFORUMQUOTEList对象
* @throws Exception 
*/
public List<mvnforumquote_Dao> get_mvnforumquote_All() throws Exception{
        List<mvnforumquote_Dao> _list = new ArrayList<mvnforumquote_Dao>();
		String sqlStr = "{ call MVNFORUMQUOTE_PRO.GetMVNFORUMQUOTE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumquote_Dao _obj = new mvnforumquote_Dao();
            _obj.setQuoteid(arr.getInt("QUOTEID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setQuotetype(arr.getInt("QUOTETYPE"));
            _obj.setResourceid(arr.getInt("RESOURCEID"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMQUOTE返回的查询DataRow创建一个MVNFORUMQUOTEEntity对象
* @param MVNFORUMQUOTE row
* @returnMVNFORUMQUOTEList对象
* @throws Exception 
*/
public List< mvnforumquote_Dao> get_mvnforumquote_All(String strWhere) throws Exception{
         List<mvnforumquote_Dao> _list = new ArrayList<mvnforumquote_Dao>();
		 String sqlStr = "{ call MVNFORUMQUOTE_PRO.GetMVNFORUMQUOTEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumquote_Dao _obj = new mvnforumquote_Dao();
            _obj.setQuoteid(arr.getInt("QUOTEID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setQuotetype(arr.getInt("QUOTETYPE"));
            _obj.setResourceid(arr.getInt("RESOURCEID"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMQUOTE返回 分页数据
* @param MVNFORUMQUOTE row
* @returnMVNFORUMQUOTEList对象
* @throws Exception 
*/
public List<mvnforumquote_Dao> get_mvnforumquote_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumquote_Dao> _list = new ArrayList<mvnforumquote_Dao>();
		String sqlStr = "{ call MVNFORUMQUOTE_PRO.GetMVNFORUMQUOTEPage(?,?,?,?,?,?)}";
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
				mvnforumquote_Dao _obj = new mvnforumquote_Dao();
            _obj.setQuoteid(arr.getInt("QUOTEID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setQuotetype(arr.getInt("QUOTETYPE"));
            _obj.setResourceid(arr.getInt("RESOURCEID"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMQUOTE返回的查询DataRow创建一个MVNFORUMQUOTEEntity对象
* @param MVNFORUMQUOTE row
* @returnMVNFORUMQUOTEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumquote_Dao> get_mvnforumquote_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumquotestrWhere") == null) {
			Dictionary<Integer, mvnforumquote_Dao> _dic = new Hashtable<Integer, mvnforumquote_Dao>();
			List<mvnforumquote_Dao> _list = new ArrayList<mvnforumquote_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getQuoteid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumquote", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumquote_Dao> _dic = (Dictionary<Integer, mvnforumquote_Dao>) classFactory
					.cacheGet("dicmvnforumquotestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMQUOTE字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumquote_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMQUOTE_PRO.UpdateFieldMVNFORUMQUOTE(?,?)}";
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
* 更新MVNFORUMQUOTEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumquote_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMQUOTE_PRO.UpdateFieldMVNFORUMQUOTEV(?,?,?)}";
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
* 更新MVNFORUMQUOTEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumquote_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMQUOTE_PRO.UpdateFieldMVNFORUMQUOTEU(?,?,?)}";
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
