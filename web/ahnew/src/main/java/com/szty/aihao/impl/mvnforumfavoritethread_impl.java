/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumfavoritethread.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumfavoritethread_Dao;
import com.szty.aihao.core.mvnforumfavoritethread_core;
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
*@MVNFORUMFAVORITETHREAD数据接口
*@作者：宋春林 
*/
public class mvnforumfavoritethread_impl implements mvnforumfavoritethread_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumfavoritethread_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMFAVORITETHREAD实体
* @return 新插入记录的编号
*/
public int insert_mvnforumfavoritethread(mvnforumfavoritethread_Dao _MVNFORUMFAVORITETHREADModel)  throws Exception{
         String sqlStr = "{call MVNFORUMFAVORITETHREAD_PRO.InsertMVNFORUMFAVORITETHREAD(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getMemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getThreadid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getForumid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMFAVORITETHREADModel.getFavoritecreationdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getFavoritetype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getFavoriteoption());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getFavoritestatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMFAVORITETHREAD
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumfavoritethread(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMFAVORITETHREAD_PRO.InsertMVNFORUMFAVORITETHREAD(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMFAVORITETHREAD实体
* @return 影响的行数
*/
public int update_mvnforumfavoritethread(mvnforumfavoritethread_Dao _MVNFORUMFAVORITETHREADModel)  throws Exception{
        String sqlStr = "{call MVNFORUMFAVORITETHREAD_PRO.UpdateMVNFORUMFAVORITETHREAD(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getMemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getThreadid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getForumid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMFAVORITETHREADModel.getFavoritecreationdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getFavoritetype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getFavoriteoption());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMFAVORITETHREADModel.getFavoritestatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMFAVORITETHREAD中的一条记录
* @param MVNFORUMFAVORITETHREAD实体
* @return 新插入记录的编号
*/
public int delete_mvnforumfavoritethread(int Memberid)  throws Exception{
        String sqlStr = "{call MVNFORUMFAVORITETHREAD_PRO.DeleteMVNFORUMFAVORITETHREAD(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Memberid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumfavoritethread 数据实体
* @param Memberid">Memberid
* @return<mvnforumfavoritethread 数据实体
* @throws Exception 
*/
public mvnforumfavoritethread_Dao get_mvnforumfavoritethreadDao(int Memberid) throws Exception{
         String sqlStr = "{ call MVNFORUMFAVORITETHREAD_PRO.GetMVNFORUMFAVORITETHREADEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Memberid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumfavoritethread_Dao _obj = new mvnforumfavoritethread_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setForumid(arr.getInt("FORUMID"));
             try{_obj.setFavoritecreationdate(dateformat.parse(arr.getString("FAVORITECREATIONDATE")));}catch(Exception ce){_obj.setFavoritecreationdate((new Date()));}
            _obj.setFavoritetype(arr.getInt("FAVORITETYPE"));
            _obj.setFavoriteoption(arr.getInt("FAVORITEOPTION"));
            _obj.setFavoritestatus(arr.getInt("FAVORITESTATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMFAVORITETHREAD返回的查询DataRow创建一个MVNFORUMFAVORITETHREADEntity对象
* @param MVNFORUMFAVORITETHREAD row
* @returnMVNFORUMFAVORITETHREADList对象
* @throws Exception 
*/
public List<mvnforumfavoritethread_Dao> get_mvnforumfavoritethread_All() throws Exception{
        List<mvnforumfavoritethread_Dao> _list = new ArrayList<mvnforumfavoritethread_Dao>();
		String sqlStr = "{ call MVNFORUMFAVORITETHREAD_PRO.GetMVNFORUMFAVORITETHREAD(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumfavoritethread_Dao _obj = new mvnforumfavoritethread_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            try{_obj.setFavoritecreationdate(dateformat.parse(arr.getString("FAVORITECREATIONDATE")));}catch(Exception ce){_obj.setFavoritecreationdate((new Date()));}
            _obj.setFavoritetype(arr.getInt("FAVORITETYPE"));
            _obj.setFavoriteoption(arr.getInt("FAVORITEOPTION"));
            _obj.setFavoritestatus(arr.getInt("FAVORITESTATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMFAVORITETHREAD返回的查询DataRow创建一个MVNFORUMFAVORITETHREADEntity对象
* @param MVNFORUMFAVORITETHREAD row
* @returnMVNFORUMFAVORITETHREADList对象
* @throws Exception 
*/
public List< mvnforumfavoritethread_Dao> get_mvnforumfavoritethread_All(String strWhere) throws Exception{
         List<mvnforumfavoritethread_Dao> _list = new ArrayList<mvnforumfavoritethread_Dao>();
		 String sqlStr = "{ call MVNFORUMFAVORITETHREAD_PRO.GetMVNFORUMFAVORITETHREADWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumfavoritethread_Dao _obj = new mvnforumfavoritethread_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setForumid(arr.getInt("FORUMID"));
           try{_obj.setFavoritecreationdate(dateformat.parse(arr.getString("FAVORITECREATIONDATE")));}catch(Exception ce){_obj.setFavoritecreationdate((new Date()));}
            _obj.setFavoritetype(arr.getInt("FAVORITETYPE"));
            _obj.setFavoriteoption(arr.getInt("FAVORITEOPTION"));
            _obj.setFavoritestatus(arr.getInt("FAVORITESTATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMFAVORITETHREAD返回 分页数据
* @param MVNFORUMFAVORITETHREAD row
* @returnMVNFORUMFAVORITETHREADList对象
* @throws Exception 
*/
public List<mvnforumfavoritethread_Dao> get_mvnforumfavoritethread_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumfavoritethread_Dao> _list = new ArrayList<mvnforumfavoritethread_Dao>();
		String sqlStr = "{ call MVNFORUMFAVORITETHREAD_PRO.GetMVNFORUMFAVORITETHREADPage(?,?,?,?,?,?)}";
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
				mvnforumfavoritethread_Dao _obj = new mvnforumfavoritethread_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            try{_obj.setFavoritecreationdate(dateformat.parse(arr.getString("FAVORITECREATIONDATE")));}catch(Exception ce){_obj.setFavoritecreationdate((new Date()));}
            _obj.setFavoritetype(arr.getInt("FAVORITETYPE"));
            _obj.setFavoriteoption(arr.getInt("FAVORITEOPTION"));
            _obj.setFavoritestatus(arr.getInt("FAVORITESTATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMFAVORITETHREAD返回的查询DataRow创建一个MVNFORUMFAVORITETHREADEntity对象
* @param MVNFORUMFAVORITETHREAD row
* @returnMVNFORUMFAVORITETHREADDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumfavoritethread_Dao> get_mvnforumfavoritethread_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumfavoritethreadstrWhere") == null) {
			Dictionary<Integer, mvnforumfavoritethread_Dao> _dic = new Hashtable<Integer, mvnforumfavoritethread_Dao>();
			List<mvnforumfavoritethread_Dao> _list = new ArrayList<mvnforumfavoritethread_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMemberid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumfavoritethread", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumfavoritethread_Dao> _dic = (Dictionary<Integer, mvnforumfavoritethread_Dao>) classFactory
					.cacheGet("dicmvnforumfavoritethreadstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMFAVORITETHREAD字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumfavoritethread_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMFAVORITETHREAD_PRO.UpdateFieldMVNFORUMFAVORITETHREAD(?,?)}";
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
* 更新MVNFORUMFAVORITETHREADInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumfavoritethread_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMFAVORITETHREAD_PRO.UpdateFieldMVNFORUMFAVORITETHREADV(?,?,?)}";
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
* 更新MVNFORUMFAVORITETHREADIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumfavoritethread_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMFAVORITETHREAD_PRO.UpdateFieldMVNFORUMFAVORITETHREADU(?,?,?)}";
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
