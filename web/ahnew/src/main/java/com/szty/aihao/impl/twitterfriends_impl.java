/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTwitterfriends.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.twitterfriends_Dao;
import com.szty.aihao.core.twitterfriends_core;
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
*@TWITTERFRIENDS数据接口
*@作者：宋春林 
*/
public class twitterfriends_impl implements twitterfriends_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(twitterfriends_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TWITTERFRIENDS实体
* @return 新插入记录的编号
*/
public int insert_twitterfriends(twitterfriends_Dao _TWITTERFRIENDSModel)  throws Exception{
         String sqlStr = "{call TWITTERFRIENDS_PRO.InsertTWITTERFRIENDS(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TWITTERFRIENDSModel.getUserid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERFRIENDSModel.getFriendsid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TWITTERFRIENDS
* @Object 
* @return 新插入记录的编号
*/
public int insert_twitterfriends(Object[] _para)  throws Exception{
      String sqlStr = "{call TWITTERFRIENDS_PRO.InsertTWITTERFRIENDS(?,?)}";
	  OracleParameter[] op = new OracleParameter[2];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param TWITTERFRIENDS实体
* @return 影响的行数
*/
public int update_twitterfriends(twitterfriends_Dao _TWITTERFRIENDSModel)  throws Exception{
        String sqlStr = "{call TWITTERFRIENDS_PRO.UpdateTWITTERFRIENDS(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_TWITTERFRIENDSModel.getUserid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERFRIENDSModel.getFriendsid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TWITTERFRIENDS中的一条记录
* @param TWITTERFRIENDS实体
* @return 新插入记录的编号
*/
public int delete_twitterfriends(int Userid)  throws Exception{
        String sqlStr = "{call TWITTERFRIENDS_PRO.DeleteTWITTERFRIENDS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Userid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 twitterfriends 数据实体
* @param Userid">Userid
* @return<twitterfriends 数据实体
* @throws Exception 
*/
public twitterfriends_Dao get_twitterfriendsDao(int Userid) throws Exception{
         String sqlStr = "{ call TWITTERFRIENDS_PRO.GetTWITTERFRIENDSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Userid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twitterfriends_Dao _obj = new twitterfriends_Dao();
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setFriendsid(arr.getInt("FRIENDSID"));
			return _obj;
		}
		return null;

}

/**
* 根据TWITTERFRIENDS返回的查询DataRow创建一个TWITTERFRIENDSEntity对象
* @param TWITTERFRIENDS row
* @returnTWITTERFRIENDSList对象
* @throws Exception 
*/
public List<twitterfriends_Dao> get_twitterfriends_All() throws Exception{
        List<twitterfriends_Dao> _list = new ArrayList<twitterfriends_Dao>();
		String sqlStr = "{ call TWITTERFRIENDS_PRO.GetTWITTERFRIENDS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twitterfriends_Dao _obj = new twitterfriends_Dao();
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setFriendsid(arr.getInt("FRIENDSID"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TWITTERFRIENDS返回的查询DataRow创建一个TWITTERFRIENDSEntity对象
* @param TWITTERFRIENDS row
* @returnTWITTERFRIENDSList对象
* @throws Exception 
*/
public List< twitterfriends_Dao> get_twitterfriends_All(String strWhere) throws Exception{
         List<twitterfriends_Dao> _list = new ArrayList<twitterfriends_Dao>();
		 String sqlStr = "{ call TWITTERFRIENDS_PRO.GetTWITTERFRIENDSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				twitterfriends_Dao _obj = new twitterfriends_Dao();
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setFriendsid(arr.getInt("FRIENDSID"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TWITTERFRIENDS返回 分页数据
* @param TWITTERFRIENDS row
* @returnTWITTERFRIENDSList对象
* @throws Exception 
*/
public List<twitterfriends_Dao> get_twitterfriends_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<twitterfriends_Dao> _list = new ArrayList<twitterfriends_Dao>();
		String sqlStr = "{ call TWITTERFRIENDS_PRO.GetTWITTERFRIENDSPage(?,?,?,?,?,?)}";
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
				twitterfriends_Dao _obj = new twitterfriends_Dao();
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setFriendsid(arr.getInt("FRIENDSID"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TWITTERFRIENDS返回的查询DataRow创建一个TWITTERFRIENDSEntity对象
* @param TWITTERFRIENDS row
* @returnTWITTERFRIENDSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, twitterfriends_Dao> get_twitterfriends_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictwitterfriendsstrWhere") == null) {
			Dictionary<Integer, twitterfriends_Dao> _dic = new Hashtable<Integer, twitterfriends_Dao>();
			List<twitterfriends_Dao> _list = new ArrayList<twitterfriends_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getUserid()), _list.get(i));
			}
			classFactory.cachePut("dictwitterfriends", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, twitterfriends_Dao> _dic = (Dictionary<Integer, twitterfriends_Dao>) classFactory
					.cacheGet("dictwitterfriendsstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TWITTERFRIENDS字段加一
* @param FieldName
* @param sid
*/
public int create_twitterfriends_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TWITTERFRIENDS_PRO.UpdateFieldTWITTERFRIENDS(?,?)}";
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
* 更新TWITTERFRIENDSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_twitterfriends_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TWITTERFRIENDS_PRO.UpdateFieldTWITTERFRIENDSV(?,?,?)}";
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
* 更新TWITTERFRIENDSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_twitterfriends_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TWITTERFRIENDS_PRO.UpdateFieldTWITTERFRIENDSU(?,?,?)}";
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
