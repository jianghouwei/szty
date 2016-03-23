/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumwatch.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumwatch_Dao;
import com.szty.aihao.core.mvnforumwatch_core;
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
*@MVNFORUMWATCH数据接口
*@作者：宋春林 
*/
public class mvnforumwatch_impl implements mvnforumwatch_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumwatch_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMWATCH实体
* @return 新插入记录的编号
*/
public int insert_mvnforumwatch(mvnforumwatch_Dao _MVNFORUMWATCHModel)  throws Exception{
         String sqlStr = "{call MVNFORUMWATCH_PRO.InsertMVNFORUMWATCH(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getWatchid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getMemberid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getCategoryid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getForumid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getThreadid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getWatchtype());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getWatchoption());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getWatchstatus());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMWATCHModel.getWatchcreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMWATCHModel.getWatchlastsentdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMWATCHModel.getWatchenddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMWATCH
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumwatch(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMWATCH_PRO.InsertMVNFORUMWATCH(?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[11];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_para[8]));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_para[9]));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_para[10]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMWATCH实体
* @return 影响的行数
*/
public int update_mvnforumwatch(mvnforumwatch_Dao _MVNFORUMWATCHModel)  throws Exception{
        String sqlStr = "{call MVNFORUMWATCH_PRO.UpdateMVNFORUMWATCH(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getWatchid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getMemberid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getCategoryid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getForumid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getThreadid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getWatchtype());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getWatchoption());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMWATCHModel.getWatchstatus());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMWATCHModel.getWatchcreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMWATCHModel.getWatchlastsentdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMWATCHModel.getWatchenddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMWATCH中的一条记录
* @param MVNFORUMWATCH实体
* @return 新插入记录的编号
*/
public int delete_mvnforumwatch(int Watchid)  throws Exception{
        String sqlStr = "{call MVNFORUMWATCH_PRO.DeleteMVNFORUMWATCH(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Watchid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumwatch 数据实体
* @param Watchid">Watchid
* @return<mvnforumwatch 数据实体
* @throws Exception 
*/
public mvnforumwatch_Dao get_mvnforumwatchDao(int Watchid) throws Exception{
         String sqlStr = "{ call MVNFORUMWATCH_PRO.GetMVNFORUMWATCHEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Watchid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumwatch_Dao _obj = new mvnforumwatch_Dao();
            _obj.setWatchid(arr.getInt("WATCHID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setWatchtype(arr.getInt("WATCHTYPE"));
            _obj.setWatchoption(arr.getInt("WATCHOPTION"));
            _obj.setWatchstatus(arr.getInt("WATCHSTATUS"));
             try{_obj.setWatchcreationdate(dateformat.parse(arr.getString("WATCHCREATIONDATE")));}catch(Exception ce){_obj.setWatchcreationdate((new Date()));}
             try{_obj.setWatchlastsentdate(dateformat.parse(arr.getString("WATCHLASTSENTDATE")));}catch(Exception ce){_obj.setWatchlastsentdate((new Date()));}
             try{_obj.setWatchenddate(dateformat.parse(arr.getString("WATCHENDDATE")));}catch(Exception ce){_obj.setWatchenddate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMWATCH返回的查询DataRow创建一个MVNFORUMWATCHEntity对象
* @param MVNFORUMWATCH row
* @returnMVNFORUMWATCHList对象
* @throws Exception 
*/
public List<mvnforumwatch_Dao> get_mvnforumwatch_All() throws Exception{
        List<mvnforumwatch_Dao> _list = new ArrayList<mvnforumwatch_Dao>();
		String sqlStr = "{ call MVNFORUMWATCH_PRO.GetMVNFORUMWATCH(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumwatch_Dao _obj = new mvnforumwatch_Dao();
            _obj.setWatchid(arr.getInt("WATCHID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setWatchtype(arr.getInt("WATCHTYPE"));
            _obj.setWatchoption(arr.getInt("WATCHOPTION"));
            _obj.setWatchstatus(arr.getInt("WATCHSTATUS"));
            try{_obj.setWatchcreationdate(dateformat.parse(arr.getString("WATCHCREATIONDATE")));}catch(Exception ce){_obj.setWatchcreationdate((new Date()));}
            try{_obj.setWatchlastsentdate(dateformat.parse(arr.getString("WATCHLASTSENTDATE")));}catch(Exception ce){_obj.setWatchlastsentdate((new Date()));}
            try{_obj.setWatchenddate(dateformat.parse(arr.getString("WATCHENDDATE")));}catch(Exception ce){_obj.setWatchenddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMWATCH返回的查询DataRow创建一个MVNFORUMWATCHEntity对象
* @param MVNFORUMWATCH row
* @returnMVNFORUMWATCHList对象
* @throws Exception 
*/
public List< mvnforumwatch_Dao> get_mvnforumwatch_All(String strWhere) throws Exception{
         List<mvnforumwatch_Dao> _list = new ArrayList<mvnforumwatch_Dao>();
		 String sqlStr = "{ call MVNFORUMWATCH_PRO.GetMVNFORUMWATCHWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumwatch_Dao _obj = new mvnforumwatch_Dao();
            _obj.setWatchid(arr.getInt("WATCHID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setWatchtype(arr.getInt("WATCHTYPE"));
            _obj.setWatchoption(arr.getInt("WATCHOPTION"));
            _obj.setWatchstatus(arr.getInt("WATCHSTATUS"));
           try{_obj.setWatchcreationdate(dateformat.parse(arr.getString("WATCHCREATIONDATE")));}catch(Exception ce){_obj.setWatchcreationdate((new Date()));}
           try{_obj.setWatchlastsentdate(dateformat.parse(arr.getString("WATCHLASTSENTDATE")));}catch(Exception ce){_obj.setWatchlastsentdate((new Date()));}
           try{_obj.setWatchenddate(dateformat.parse(arr.getString("WATCHENDDATE")));}catch(Exception ce){_obj.setWatchenddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMWATCH返回 分页数据
* @param MVNFORUMWATCH row
* @returnMVNFORUMWATCHList对象
* @throws Exception 
*/
public List<mvnforumwatch_Dao> get_mvnforumwatch_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumwatch_Dao> _list = new ArrayList<mvnforumwatch_Dao>();
		String sqlStr = "{ call MVNFORUMWATCH_PRO.GetMVNFORUMWATCHPage(?,?,?,?,?,?)}";
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
				mvnforumwatch_Dao _obj = new mvnforumwatch_Dao();
            _obj.setWatchid(arr.getInt("WATCHID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setWatchtype(arr.getInt("WATCHTYPE"));
            _obj.setWatchoption(arr.getInt("WATCHOPTION"));
            _obj.setWatchstatus(arr.getInt("WATCHSTATUS"));
            try{_obj.setWatchcreationdate(dateformat.parse(arr.getString("WATCHCREATIONDATE")));}catch(Exception ce){_obj.setWatchcreationdate((new Date()));}
            try{_obj.setWatchlastsentdate(dateformat.parse(arr.getString("WATCHLASTSENTDATE")));}catch(Exception ce){_obj.setWatchlastsentdate((new Date()));}
            try{_obj.setWatchenddate(dateformat.parse(arr.getString("WATCHENDDATE")));}catch(Exception ce){_obj.setWatchenddate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMWATCH返回的查询DataRow创建一个MVNFORUMWATCHEntity对象
* @param MVNFORUMWATCH row
* @returnMVNFORUMWATCHDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumwatch_Dao> get_mvnforumwatch_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumwatchstrWhere") == null) {
			Dictionary<Integer, mvnforumwatch_Dao> _dic = new Hashtable<Integer, mvnforumwatch_Dao>();
			List<mvnforumwatch_Dao> _list = new ArrayList<mvnforumwatch_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getWatchid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumwatch", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumwatch_Dao> _dic = (Dictionary<Integer, mvnforumwatch_Dao>) classFactory
					.cacheGet("dicmvnforumwatchstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMWATCH字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumwatch_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMWATCH_PRO.UpdateFieldMVNFORUMWATCH(?,?)}";
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
* 更新MVNFORUMWATCHInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumwatch_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMWATCH_PRO.UpdateFieldMVNFORUMWATCHV(?,?,?)}";
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
* 更新MVNFORUMWATCHIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumwatch_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMWATCH_PRO.UpdateFieldMVNFORUMWATCHU(?,?,?)}";
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
