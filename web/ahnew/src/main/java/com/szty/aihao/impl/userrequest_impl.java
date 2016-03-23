/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataUserrequest.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.userrequest_Dao;
import com.szty.aihao.core.userrequest_core;
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
*@USERREQUEST数据接口
*@作者：宋春林 
*/
public class userrequest_impl implements userrequest_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(userrequest_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param USERREQUEST实体
* @return 新插入记录的编号
*/
public int insert_userrequest(userrequest_Dao _USERREQUESTModel)  throws Exception{
         String sqlStr = "{call USERREQUEST_PRO.InsertUSERREQUEST(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_USERREQUESTModel.getMsgid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_USERREQUESTModel.getUsername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_USERREQUESTModel.getPhone());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_USERREQUESTModel.getAddress());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_USERREQUESTModel.getAddresscode());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_USERREQUESTModel.getRequestname());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_USERREQUESTModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param USERREQUEST
* @Object 
* @return 新插入记录的编号
*/
public int insert_userrequest(Object[] _para)  throws Exception{
      String sqlStr = "{call USERREQUEST_PRO.InsertUSERREQUEST(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param USERREQUEST实体
* @return 影响的行数
*/
public int update_userrequest(userrequest_Dao _USERREQUESTModel)  throws Exception{
        String sqlStr = "{call USERREQUEST_PRO.UpdateUSERREQUEST(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.BIGINT,_USERREQUESTModel.getMsgid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_USERREQUESTModel.getUsername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_USERREQUESTModel.getPhone());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_USERREQUESTModel.getAddress());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_USERREQUESTModel.getAddresscode());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_USERREQUESTModel.getRequestname());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_USERREQUESTModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表USERREQUEST中的一条记录
* @param USERREQUEST实体
* @return 新插入记录的编号
*/
public int delete_userrequest(int Msgid)  throws Exception{
        String sqlStr = "{call USERREQUEST_PRO.DeleteUSERREQUEST(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Msgid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 userrequest 数据实体
* @param Msgid">Msgid
* @return<userrequest 数据实体
* @throws Exception 
*/
public userrequest_Dao get_userrequestDao(int Msgid) throws Exception{
         String sqlStr = "{ call USERREQUEST_PRO.GetUSERREQUESTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Msgid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			userrequest_Dao _obj = new userrequest_Dao();
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setAddresscode(arr.getString("ADDRESSCODE"));
            _obj.setRequestname(arr.getString("REQUESTNAME"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据USERREQUEST返回的查询DataRow创建一个USERREQUESTEntity对象
* @param USERREQUEST row
* @returnUSERREQUESTList对象
* @throws Exception 
*/
public List<userrequest_Dao> get_userrequest_All() throws Exception{
        List<userrequest_Dao> _list = new ArrayList<userrequest_Dao>();
		String sqlStr = "{ call USERREQUEST_PRO.GetUSERREQUEST(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			userrequest_Dao _obj = new userrequest_Dao();
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setAddresscode(arr.getString("ADDRESSCODE"));
            _obj.setRequestname(arr.getString("REQUESTNAME"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据USERREQUEST返回的查询DataRow创建一个USERREQUESTEntity对象
* @param USERREQUEST row
* @returnUSERREQUESTList对象
* @throws Exception 
*/
public List< userrequest_Dao> get_userrequest_All(String strWhere) throws Exception{
         List<userrequest_Dao> _list = new ArrayList<userrequest_Dao>();
		 String sqlStr = "{ call USERREQUEST_PRO.GetUSERREQUESTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				userrequest_Dao _obj = new userrequest_Dao();
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setAddresscode(arr.getString("ADDRESSCODE"));
            _obj.setRequestname(arr.getString("REQUESTNAME"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据USERREQUEST返回 分页数据
* @param USERREQUEST row
* @returnUSERREQUESTList对象
* @throws Exception 
*/
public List<userrequest_Dao> get_userrequest_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<userrequest_Dao> _list = new ArrayList<userrequest_Dao>();
		String sqlStr = "{ call USERREQUEST_PRO.GetUSERREQUESTPage(?,?,?,?,?,?)}";
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
				userrequest_Dao _obj = new userrequest_Dao();
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setAddresscode(arr.getString("ADDRESSCODE"));
            _obj.setRequestname(arr.getString("REQUESTNAME"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据USERREQUEST返回的查询DataRow创建一个USERREQUESTEntity对象
* @param USERREQUEST row
* @returnUSERREQUESTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, userrequest_Dao> get_userrequest_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicuserrequeststrWhere") == null) {
			Dictionary<Integer, userrequest_Dao> _dic = new Hashtable<Integer, userrequest_Dao>();
			List<userrequest_Dao> _list = new ArrayList<userrequest_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((int)(_list.get(i).getMsgid()), _list.get(i));
			}
			classFactory.cachePut("dicuserrequest", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, userrequest_Dao> _dic = (Dictionary<Integer, userrequest_Dao>) classFactory
					.cacheGet("dicuserrequeststrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新USERREQUEST字段加一
* @param FieldName
* @param sid
*/
public int create_userrequest_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call USERREQUEST_PRO.UpdateFieldUSERREQUEST(?,?)}";
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
* 更新USERREQUESTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_userrequest_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call USERREQUEST_PRO.UpdateFieldUSERREQUESTV(?,?,?)}";
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
* 更新USERREQUESTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_userrequest_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call USERREQUEST_PRO.UpdateFieldUSERREQUESTU(?,?,?)}";
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
