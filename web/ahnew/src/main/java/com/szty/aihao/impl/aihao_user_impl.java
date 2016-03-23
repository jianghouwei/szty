/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihao_user.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihao_user_Dao;
import com.szty.aihao.core.aihao_user_core;
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
*@AIHAO_USER数据接口
*@作者：宋春林 
*/
public class aihao_user_impl implements aihao_user_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihao_user_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAO_USER实体
* @return 新插入记录的编号
*/
public int insert_aihao_user(aihao_user_Dao _AIHAO_USERModel)  throws Exception{
         String sqlStr = "{call AIHAO_USER_PRO.InsertAIHAO_USER(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAO_USERModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAO_USERModel.getUsername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAO_USERModel.getPassword());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_USERModel.getCtime()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_USERModel.getUtime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAO_USER
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihao_user(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAO_USER_PRO.InsertAIHAO_USER(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAO_USER实体
* @return 影响的行数
*/
public int update_aihao_user(aihao_user_Dao _AIHAO_USERModel)  throws Exception{
        String sqlStr = "{call AIHAO_USER_PRO.UpdateAIHAO_USER(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAO_USERModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAO_USERModel.getUsername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAO_USERModel.getPassword());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_USERModel.getCtime()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_USERModel.getUtime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAO_USER中的一条记录
* @param AIHAO_USER实体
* @return 新插入记录的编号
*/
public int delete_aihao_user(int Id)  throws Exception{
        String sqlStr = "{call AIHAO_USER_PRO.DeleteAIHAO_USER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihao_user 数据实体
* @param Id">Id
* @return<aihao_user 数据实体
* @throws Exception 
*/
public aihao_user_Dao get_aihao_userDao(int Id) throws Exception{
         String sqlStr = "{ call AIHAO_USER_PRO.GetAIHAO_USEREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_user_Dao _obj = new aihao_user_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPassword(arr.getString("PASSWORD"));
             try{_obj.setCtime(dateformat.parse(arr.getString("CTIME")));}catch(Exception ce){_obj.setCtime((new Date()));}
             try{_obj.setUtime(dateformat.parse(arr.getString("UTIME")));}catch(Exception ce){_obj.setUtime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据AIHAO_USER返回的查询DataRow创建一个AIHAO_USEREntity对象
* @param AIHAO_USER row
* @returnAIHAO_USERList对象
* @throws Exception 
*/
public List<aihao_user_Dao> get_aihao_user_All() throws Exception{
        List<aihao_user_Dao> _list = new ArrayList<aihao_user_Dao>();
		String sqlStr = "{ call AIHAO_USER_PRO.GetAIHAO_USER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_user_Dao _obj = new aihao_user_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPassword(arr.getString("PASSWORD"));
            try{_obj.setCtime(dateformat.parse(arr.getString("CTIME")));}catch(Exception ce){_obj.setCtime((new Date()));}
            try{_obj.setUtime(dateformat.parse(arr.getString("UTIME")));}catch(Exception ce){_obj.setUtime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAO_USER返回的查询DataRow创建一个AIHAO_USEREntity对象
* @param AIHAO_USER row
* @returnAIHAO_USERList对象
* @throws Exception 
*/
public List< aihao_user_Dao> get_aihao_user_All(String strWhere) throws Exception{
         List<aihao_user_Dao> _list = new ArrayList<aihao_user_Dao>();
		 String sqlStr = "{ call AIHAO_USER_PRO.GetAIHAO_USERWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihao_user_Dao _obj = new aihao_user_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPassword(arr.getString("PASSWORD"));
           try{_obj.setCtime(dateformat.parse(arr.getString("CTIME")));}catch(Exception ce){_obj.setCtime((new Date()));}
           try{_obj.setUtime(dateformat.parse(arr.getString("UTIME")));}catch(Exception ce){_obj.setUtime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAO_USER返回 分页数据
* @param AIHAO_USER row
* @returnAIHAO_USERList对象
* @throws Exception 
*/
public List<aihao_user_Dao> get_aihao_user_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihao_user_Dao> _list = new ArrayList<aihao_user_Dao>();
		String sqlStr = "{ call AIHAO_USER_PRO.GetAIHAO_USERPage(?,?,?,?,?,?)}";
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
				aihao_user_Dao _obj = new aihao_user_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPassword(arr.getString("PASSWORD"));
            try{_obj.setCtime(dateformat.parse(arr.getString("CTIME")));}catch(Exception ce){_obj.setCtime((new Date()));}
            try{_obj.setUtime(dateformat.parse(arr.getString("UTIME")));}catch(Exception ce){_obj.setUtime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAO_USER返回的查询DataRow创建一个AIHAO_USEREntity对象
* @param AIHAO_USER row
* @returnAIHAO_USERDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihao_user_Dao> get_aihao_user_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihao_userstrWhere") == null) {
			Dictionary<Integer, aihao_user_Dao> _dic = new Hashtable<Integer, aihao_user_Dao>();
			List<aihao_user_Dao> _list = new ArrayList<aihao_user_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihao_user", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihao_user_Dao> _dic = (Dictionary<Integer, aihao_user_Dao>) classFactory
					.cacheGet("dicaihao_userstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAO_USER字段加一
* @param FieldName
* @param sid
*/
public int create_aihao_user_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAO_USER_PRO.UpdateFieldAIHAO_USER(?,?)}";
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
* 更新AIHAO_USERInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihao_user_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAO_USER_PRO.UpdateFieldAIHAO_USERV(?,?,?)}";
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
* 更新AIHAO_USERIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihao_user_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAO_USER_PRO.UpdateFieldAIHAO_USERU(?,?,?)}";
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
