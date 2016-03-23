/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTwitteruser.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.twitteruser_Dao;
import com.szty.aihao.core.twitteruser_core;
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
*@TWITTERUSER数据接口
*@作者：宋春林 
*/
public class twitteruser_impl implements twitteruser_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(twitteruser_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TWITTERUSER实体
* @return 新插入记录的编号
*/
public int insert_twitteruser(twitteruser_Dao _TWITTERUSERModel)  throws Exception{
         String sqlStr = "{call TWITTERUSER_PRO.InsertTWITTERUSER(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[15];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TWITTERUSERModel.getUserid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getUsername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getPassword());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getNickname());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getEmail());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_TWITTERUSERModel.getSex());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getLocation());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getWeb());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getBirthday());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getNotes());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getPichead());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERUSERModel.getLasttime()));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getLastip());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_TWITTERUSERModel.getState());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERUSERModel.getRegtime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TWITTERUSER
* @Object 
* @return 新插入记录的编号
*/
public int insert_twitteruser(Object[] _para)  throws Exception{
      String sqlStr = "{call TWITTERUSER_PRO.InsertTWITTERUSER(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[15];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_para[11]));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.DATE, dateformat.format(_para[14]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param TWITTERUSER实体
* @return 影响的行数
*/
public int update_twitteruser(twitteruser_Dao _TWITTERUSERModel)  throws Exception{
        String sqlStr = "{call TWITTERUSER_PRO.UpdateTWITTERUSER(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[15];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_TWITTERUSERModel.getUserid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getUsername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getPassword());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getNickname());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getEmail());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_TWITTERUSERModel.getSex());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getLocation());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getWeb());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getBirthday());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getNotes());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getPichead());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERUSERModel.getLasttime()));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_TWITTERUSERModel.getLastip());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_TWITTERUSERModel.getState());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERUSERModel.getRegtime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TWITTERUSER中的一条记录
* @param TWITTERUSER实体
* @return 新插入记录的编号
*/
public int delete_twitteruser(int Userid)  throws Exception{
        String sqlStr = "{call TWITTERUSER_PRO.DeleteTWITTERUSER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Userid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 twitteruser 数据实体
* @param Userid">Userid
* @return<twitteruser 数据实体
* @throws Exception 
*/
public twitteruser_Dao get_twitteruserDao(int Userid) throws Exception{
         String sqlStr = "{ call TWITTERUSER_PRO.GetTWITTERUSEREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Userid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twitteruser_Dao _obj = new twitteruser_Dao();
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPassword(arr.getString("PASSWORD"));
            _obj.setNickname(arr.getString("NICKNAME"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setSex(arr.getInt("SEX"));
            _obj.setLocation(arr.getString("LOCATION"));
            _obj.setWeb(arr.getString("WEB"));
            _obj.setBirthday(arr.getString("BIRTHDAY"));
            _obj.setNotes(arr.getString("NOTES"));
            _obj.setPichead(arr.getString("PICHEAD"));
             try{_obj.setLasttime(dateformat.parse(arr.getString("LASTTIME")));}catch(Exception ce){_obj.setLasttime((new Date()));}
            _obj.setLastip(arr.getString("LASTIP"));
            _obj.setState(arr.getInt("STATE"));
             try{_obj.setRegtime(dateformat.parse(arr.getString("REGTIME")));}catch(Exception ce){_obj.setRegtime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据TWITTERUSER返回的查询DataRow创建一个TWITTERUSEREntity对象
* @param TWITTERUSER row
* @returnTWITTERUSERList对象
* @throws Exception 
*/
public List<twitteruser_Dao> get_twitteruser_All() throws Exception{
        List<twitteruser_Dao> _list = new ArrayList<twitteruser_Dao>();
		String sqlStr = "{ call TWITTERUSER_PRO.GetTWITTERUSER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twitteruser_Dao _obj = new twitteruser_Dao();
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPassword(arr.getString("PASSWORD"));
            _obj.setNickname(arr.getString("NICKNAME"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setSex(arr.getInt("SEX"));
            _obj.setLocation(arr.getString("LOCATION"));
            _obj.setWeb(arr.getString("WEB"));
            _obj.setBirthday(arr.getString("BIRTHDAY"));
            _obj.setNotes(arr.getString("NOTES"));
            _obj.setPichead(arr.getString("PICHEAD"));
            try{_obj.setLasttime(dateformat.parse(arr.getString("LASTTIME")));}catch(Exception ce){_obj.setLasttime((new Date()));}
            _obj.setLastip(arr.getString("LASTIP"));
            _obj.setState(arr.getInt("STATE"));
            try{_obj.setRegtime(dateformat.parse(arr.getString("REGTIME")));}catch(Exception ce){_obj.setRegtime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TWITTERUSER返回的查询DataRow创建一个TWITTERUSEREntity对象
* @param TWITTERUSER row
* @returnTWITTERUSERList对象
* @throws Exception 
*/
public List< twitteruser_Dao> get_twitteruser_All(String strWhere) throws Exception{
         List<twitteruser_Dao> _list = new ArrayList<twitteruser_Dao>();
		 String sqlStr = "{ call TWITTERUSER_PRO.GetTWITTERUSERWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				twitteruser_Dao _obj = new twitteruser_Dao();
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPassword(arr.getString("PASSWORD"));
            _obj.setNickname(arr.getString("NICKNAME"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setSex(arr.getInt("SEX"));
            _obj.setLocation(arr.getString("LOCATION"));
            _obj.setWeb(arr.getString("WEB"));
            _obj.setBirthday(arr.getString("BIRTHDAY"));
            _obj.setNotes(arr.getString("NOTES"));
            _obj.setPichead(arr.getString("PICHEAD"));
           try{_obj.setLasttime(dateformat.parse(arr.getString("LASTTIME")));}catch(Exception ce){_obj.setLasttime((new Date()));}
            _obj.setLastip(arr.getString("LASTIP"));
            _obj.setState(arr.getInt("STATE"));
           try{_obj.setRegtime(dateformat.parse(arr.getString("REGTIME")));}catch(Exception ce){_obj.setRegtime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TWITTERUSER返回 分页数据
* @param TWITTERUSER row
* @returnTWITTERUSERList对象
* @throws Exception 
*/
public List<twitteruser_Dao> get_twitteruser_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<twitteruser_Dao> _list = new ArrayList<twitteruser_Dao>();
		String sqlStr = "{ call TWITTERUSER_PRO.GetTWITTERUSERPage(?,?,?,?,?,?)}";
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
				twitteruser_Dao _obj = new twitteruser_Dao();
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPassword(arr.getString("PASSWORD"));
            _obj.setNickname(arr.getString("NICKNAME"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setSex(arr.getInt("SEX"));
            _obj.setLocation(arr.getString("LOCATION"));
            _obj.setWeb(arr.getString("WEB"));
            _obj.setBirthday(arr.getString("BIRTHDAY"));
            _obj.setNotes(arr.getString("NOTES"));
            _obj.setPichead(arr.getString("PICHEAD"));
            try{_obj.setLasttime(dateformat.parse(arr.getString("LASTTIME")));}catch(Exception ce){_obj.setLasttime((new Date()));}
            _obj.setLastip(arr.getString("LASTIP"));
            _obj.setState(arr.getInt("STATE"));
            try{_obj.setRegtime(dateformat.parse(arr.getString("REGTIME")));}catch(Exception ce){_obj.setRegtime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TWITTERUSER返回的查询DataRow创建一个TWITTERUSEREntity对象
* @param TWITTERUSER row
* @returnTWITTERUSERDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, twitteruser_Dao> get_twitteruser_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictwitteruserstrWhere") == null) {
			Dictionary<Integer, twitteruser_Dao> _dic = new Hashtable<Integer, twitteruser_Dao>();
			List<twitteruser_Dao> _list = new ArrayList<twitteruser_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getUserid()), _list.get(i));
			}
			classFactory.cachePut("dictwitteruser", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, twitteruser_Dao> _dic = (Dictionary<Integer, twitteruser_Dao>) classFactory
					.cacheGet("dictwitteruserstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TWITTERUSER字段加一
* @param FieldName
* @param sid
*/
public int create_twitteruser_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TWITTERUSER_PRO.UpdateFieldTWITTERUSER(?,?)}";
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
* 更新TWITTERUSERInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_twitteruser_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TWITTERUSER_PRO.UpdateFieldTWITTERUSERV(?,?,?)}";
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
* 更新TWITTERUSERIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_twitteruser_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TWITTERUSER_PRO.UpdateFieldTWITTERUSERU(?,?,?)}";
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
