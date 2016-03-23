/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumthread.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumthread_Dao;
import com.szty.aihao.core.mvnforumthread_core;
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
*@MVNFORUMTHREAD数据接口
*@作者：宋春林 
*/
public class mvnforumthread_impl implements mvnforumthread_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumthread_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMTHREAD实体
* @return 新插入记录的编号
*/
public int insert_mvnforumthread(mvnforumthread_Dao _MVNFORUMTHREADModel)  throws Exception{
         String sqlStr = "{call MVNFORUMTHREAD_PRO.InsertMVNFORUMTHREAD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[20];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMTHREADModel.getMembername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMTHREADModel.getLastpostmembername());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMTHREADModel.getThreadtopic());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMTHREADModel.getThreadbody());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadvotecount());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadvotetotalstars());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMTHREADModel.getThreadcreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMTHREADModel.getThreadlastpostdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadtype());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadpriority());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadoption());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadstatus());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadhaspoll());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadviewcount());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadreplycount());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_MVNFORUMTHREADModel.getThreadicon());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadduration());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadattachcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMTHREAD
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumthread(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMTHREAD_PRO.InsertMVNFORUMTHREAD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[20];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_para[8]));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_para[9]));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_para[18]);
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_para[19]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMTHREAD实体
* @return 影响的行数
*/
public int update_mvnforumthread(mvnforumthread_Dao _MVNFORUMTHREADModel)  throws Exception{
        String sqlStr = "{call MVNFORUMTHREAD_PRO.UpdateMVNFORUMTHREAD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[20];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMTHREADModel.getMembername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMTHREADModel.getLastpostmembername());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMTHREADModel.getThreadtopic());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMTHREADModel.getThreadbody());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadvotecount());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadvotetotalstars());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMTHREADModel.getThreadcreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMTHREADModel.getThreadlastpostdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadtype());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadpriority());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadoption());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadstatus());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadhaspoll());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadviewcount());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadreplycount());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_MVNFORUMTHREADModel.getThreadicon());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadduration());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_MVNFORUMTHREADModel.getThreadattachcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMTHREAD中的一条记录
* @param MVNFORUMTHREAD实体
* @return 新插入记录的编号
*/
public int delete_mvnforumthread(int Threadid)  throws Exception{
        String sqlStr = "{call MVNFORUMTHREAD_PRO.DeleteMVNFORUMTHREAD(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Threadid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumthread 数据实体
* @param Threadid">Threadid
* @return<mvnforumthread 数据实体
* @throws Exception 
*/
public mvnforumthread_Dao get_mvnforumthreadDao(int Threadid) throws Exception{
         String sqlStr = "{ call MVNFORUMTHREAD_PRO.GetMVNFORUMTHREADEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Threadid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumthread_Dao _obj = new mvnforumthread_Dao();
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setLastpostmembername(arr.getString("LASTPOSTMEMBERNAME"));
            _obj.setThreadtopic(arr.getString("THREADTOPIC"));
            _obj.setThreadbody(arr.getString("THREADBODY"));
            _obj.setThreadvotecount(arr.getInt("THREADVOTECOUNT"));
            _obj.setThreadvotetotalstars(arr.getInt("THREADVOTETOTALSTARS"));
             try{_obj.setThreadcreationdate(dateformat.parse(arr.getString("THREADCREATIONDATE")));}catch(Exception ce){_obj.setThreadcreationdate((new Date()));}
             try{_obj.setThreadlastpostdate(dateformat.parse(arr.getString("THREADLASTPOSTDATE")));}catch(Exception ce){_obj.setThreadlastpostdate((new Date()));}
            _obj.setThreadtype(arr.getInt("THREADTYPE"));
            _obj.setThreadpriority(arr.getInt("THREADPRIORITY"));
            _obj.setThreadoption(arr.getInt("THREADOPTION"));
            _obj.setThreadstatus(arr.getInt("THREADSTATUS"));
            _obj.setThreadhaspoll(arr.getInt("THREADHASPOLL"));
            _obj.setThreadviewcount(arr.getInt("THREADVIEWCOUNT"));
            _obj.setThreadreplycount(arr.getInt("THREADREPLYCOUNT"));
            _obj.setThreadicon(arr.getString("THREADICON"));
            _obj.setThreadduration(arr.getInt("THREADDURATION"));
            _obj.setThreadattachcount(arr.getInt("THREADATTACHCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMTHREAD返回的查询DataRow创建一个MVNFORUMTHREADEntity对象
* @param MVNFORUMTHREAD row
* @returnMVNFORUMTHREADList对象
* @throws Exception 
*/
public List<mvnforumthread_Dao> get_mvnforumthread_All() throws Exception{
        List<mvnforumthread_Dao> _list = new ArrayList<mvnforumthread_Dao>();
		String sqlStr = "{ call MVNFORUMTHREAD_PRO.GetMVNFORUMTHREAD(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumthread_Dao _obj = new mvnforumthread_Dao();
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setLastpostmembername(arr.getString("LASTPOSTMEMBERNAME"));
            _obj.setThreadtopic(arr.getString("THREADTOPIC"));
            _obj.setThreadbody(arr.getString("THREADBODY"));
            _obj.setThreadvotecount(arr.getInt("THREADVOTECOUNT"));
            _obj.setThreadvotetotalstars(arr.getInt("THREADVOTETOTALSTARS"));
            try{_obj.setThreadcreationdate(dateformat.parse(arr.getString("THREADCREATIONDATE")));}catch(Exception ce){_obj.setThreadcreationdate((new Date()));}
            try{_obj.setThreadlastpostdate(dateformat.parse(arr.getString("THREADLASTPOSTDATE")));}catch(Exception ce){_obj.setThreadlastpostdate((new Date()));}
            _obj.setThreadtype(arr.getInt("THREADTYPE"));
            _obj.setThreadpriority(arr.getInt("THREADPRIORITY"));
            _obj.setThreadoption(arr.getInt("THREADOPTION"));
            _obj.setThreadstatus(arr.getInt("THREADSTATUS"));
            _obj.setThreadhaspoll(arr.getInt("THREADHASPOLL"));
            _obj.setThreadviewcount(arr.getInt("THREADVIEWCOUNT"));
            _obj.setThreadreplycount(arr.getInt("THREADREPLYCOUNT"));
            _obj.setThreadicon(arr.getString("THREADICON"));
            _obj.setThreadduration(arr.getInt("THREADDURATION"));
            _obj.setThreadattachcount(arr.getInt("THREADATTACHCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMTHREAD返回的查询DataRow创建一个MVNFORUMTHREADEntity对象
* @param MVNFORUMTHREAD row
* @returnMVNFORUMTHREADList对象
* @throws Exception 
*/
public List< mvnforumthread_Dao> get_mvnforumthread_All(String strWhere) throws Exception{
         List<mvnforumthread_Dao> _list = new ArrayList<mvnforumthread_Dao>();
		 String sqlStr = "{ call MVNFORUMTHREAD_PRO.GetMVNFORUMTHREADWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumthread_Dao _obj = new mvnforumthread_Dao();
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setLastpostmembername(arr.getString("LASTPOSTMEMBERNAME"));
            _obj.setThreadtopic(arr.getString("THREADTOPIC"));
            _obj.setThreadbody(arr.getString("THREADBODY"));
            _obj.setThreadvotecount(arr.getInt("THREADVOTECOUNT"));
            _obj.setThreadvotetotalstars(arr.getInt("THREADVOTETOTALSTARS"));
           try{_obj.setThreadcreationdate(dateformat.parse(arr.getString("THREADCREATIONDATE")));}catch(Exception ce){_obj.setThreadcreationdate((new Date()));}
           try{_obj.setThreadlastpostdate(dateformat.parse(arr.getString("THREADLASTPOSTDATE")));}catch(Exception ce){_obj.setThreadlastpostdate((new Date()));}
            _obj.setThreadtype(arr.getInt("THREADTYPE"));
            _obj.setThreadpriority(arr.getInt("THREADPRIORITY"));
            _obj.setThreadoption(arr.getInt("THREADOPTION"));
            _obj.setThreadstatus(arr.getInt("THREADSTATUS"));
            _obj.setThreadhaspoll(arr.getInt("THREADHASPOLL"));
            _obj.setThreadviewcount(arr.getInt("THREADVIEWCOUNT"));
            _obj.setThreadreplycount(arr.getInt("THREADREPLYCOUNT"));
            _obj.setThreadicon(arr.getString("THREADICON"));
            _obj.setThreadduration(arr.getInt("THREADDURATION"));
            _obj.setThreadattachcount(arr.getInt("THREADATTACHCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMTHREAD返回 分页数据
* @param MVNFORUMTHREAD row
* @returnMVNFORUMTHREADList对象
* @throws Exception 
*/
public List<mvnforumthread_Dao> get_mvnforumthread_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumthread_Dao> _list = new ArrayList<mvnforumthread_Dao>();
		String sqlStr = "{ call MVNFORUMTHREAD_PRO.GetMVNFORUMTHREADPage(?,?,?,?,?,?)}";
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
				mvnforumthread_Dao _obj = new mvnforumthread_Dao();
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setLastpostmembername(arr.getString("LASTPOSTMEMBERNAME"));
            _obj.setThreadtopic(arr.getString("THREADTOPIC"));
            _obj.setThreadbody(arr.getString("THREADBODY"));
            _obj.setThreadvotecount(arr.getInt("THREADVOTECOUNT"));
            _obj.setThreadvotetotalstars(arr.getInt("THREADVOTETOTALSTARS"));
            try{_obj.setThreadcreationdate(dateformat.parse(arr.getString("THREADCREATIONDATE")));}catch(Exception ce){_obj.setThreadcreationdate((new Date()));}
            try{_obj.setThreadlastpostdate(dateformat.parse(arr.getString("THREADLASTPOSTDATE")));}catch(Exception ce){_obj.setThreadlastpostdate((new Date()));}
            _obj.setThreadtype(arr.getInt("THREADTYPE"));
            _obj.setThreadpriority(arr.getInt("THREADPRIORITY"));
            _obj.setThreadoption(arr.getInt("THREADOPTION"));
            _obj.setThreadstatus(arr.getInt("THREADSTATUS"));
            _obj.setThreadhaspoll(arr.getInt("THREADHASPOLL"));
            _obj.setThreadviewcount(arr.getInt("THREADVIEWCOUNT"));
            _obj.setThreadreplycount(arr.getInt("THREADREPLYCOUNT"));
            _obj.setThreadicon(arr.getString("THREADICON"));
            _obj.setThreadduration(arr.getInt("THREADDURATION"));
            _obj.setThreadattachcount(arr.getInt("THREADATTACHCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMTHREAD返回的查询DataRow创建一个MVNFORUMTHREADEntity对象
* @param MVNFORUMTHREAD row
* @returnMVNFORUMTHREADDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumthread_Dao> get_mvnforumthread_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumthreadstrWhere") == null) {
			Dictionary<Integer, mvnforumthread_Dao> _dic = new Hashtable<Integer, mvnforumthread_Dao>();
			List<mvnforumthread_Dao> _list = new ArrayList<mvnforumthread_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getThreadid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumthread", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumthread_Dao> _dic = (Dictionary<Integer, mvnforumthread_Dao>) classFactory
					.cacheGet("dicmvnforumthreadstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMTHREAD字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumthread_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMTHREAD_PRO.UpdateFieldMVNFORUMTHREAD(?,?)}";
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
* 更新MVNFORUMTHREADInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumthread_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMTHREAD_PRO.UpdateFieldMVNFORUMTHREADV(?,?,?)}";
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
* 更新MVNFORUMTHREADIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumthread_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMTHREAD_PRO.UpdateFieldMVNFORUMTHREADU(?,?,?)}";
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
