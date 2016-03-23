/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumofflinemessageback.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumofflinemessageback_Dao;
import com.szty.aihao.core.mvnforumofflinemessageback_core;
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
*@MVNFORUMOFFLINEMESSAGEBACK数据接口
*@作者：宋春林 
*/
public class mvnforumofflinemessageback_impl implements mvnforumofflinemessageback_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumofflinemessageback_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMOFFLINEMESSAGEBACK实体
* @return 新插入记录的编号
*/
public int insert_mvnforumofflinemessageback(mvnforumofflinemessageback_Dao _MVNFORUMOFFLINEMESSAGEBACKModel)  throws Exception{
         String sqlStr = "{call MVNFORUMOFFLINEMESSAGEBACK_PRO.InsertMVNFORUMOFFLINEMESSAGEBACK(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMOFFLINEMESSAGEBACKModel.getMessageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEBACKModel.getSendmobile());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEBACKModel.getReceivemobile());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEBACKModel.getMessage());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEBACKModel.getResourceid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMOFFLINEMESSAGEBACKModel.getMessagecreationdate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMOFFLINEMESSAGEBACKModel.getStatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMOFFLINEMESSAGEBACK
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumofflinemessageback(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMOFFLINEMESSAGEBACK_PRO.InsertMVNFORUMOFFLINEMESSAGEBACK(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMOFFLINEMESSAGEBACK实体
* @return 影响的行数
*/
public int update_mvnforumofflinemessageback(mvnforumofflinemessageback_Dao _MVNFORUMOFFLINEMESSAGEBACKModel)  throws Exception{
        String sqlStr = "{call MVNFORUMOFFLINEMESSAGEBACK_PRO.UpdateMVNFORUMOFFLINEMESSAGEBACK(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMOFFLINEMESSAGEBACKModel.getMessageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEBACKModel.getSendmobile());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEBACKModel.getReceivemobile());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEBACKModel.getMessage());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEBACKModel.getResourceid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMOFFLINEMESSAGEBACKModel.getMessagecreationdate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMOFFLINEMESSAGEBACKModel.getStatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMOFFLINEMESSAGEBACK中的一条记录
* @param MVNFORUMOFFLINEMESSAGEBACK实体
* @return 新插入记录的编号
*/
public int delete_mvnforumofflinemessageback(int Messageid)  throws Exception{
        String sqlStr = "{call MVNFORUMOFFLINEMESSAGEBACK_PRO.DeleteMVNFORUMOFFLINEMESSAGEBACK(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Messageid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumofflinemessageback 数据实体
* @param Messageid">Messageid
* @return<mvnforumofflinemessageback 数据实体
* @throws Exception 
*/
public mvnforumofflinemessageback_Dao get_mvnforumofflinemessagebackDao(int Messageid) throws Exception{
         String sqlStr = "{ call MVNFORUMOFFLINEMESSAGEBACK_PRO.GetMVNFORUMOFFLINEMESSAGEBACKEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Messageid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumofflinemessageback_Dao _obj = new mvnforumofflinemessageback_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setSendmobile(arr.getString("SENDMOBILE"));
            _obj.setReceivemobile(arr.getString("RECEIVEMOBILE"));
            _obj.setMessage(arr.getString("MESSAGE"));
            _obj.setResourceid(arr.getString("RESOURCEID"));
             try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMOFFLINEMESSAGEBACK返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEBACKEntity对象
* @param MVNFORUMOFFLINEMESSAGEBACK row
* @returnMVNFORUMOFFLINEMESSAGEBACKList对象
* @throws Exception 
*/
public List<mvnforumofflinemessageback_Dao> get_mvnforumofflinemessageback_All() throws Exception{
        List<mvnforumofflinemessageback_Dao> _list = new ArrayList<mvnforumofflinemessageback_Dao>();
		String sqlStr = "{ call MVNFORUMOFFLINEMESSAGEBACK_PRO.GetMVNFORUMOFFLINEMESSAGEBACK(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumofflinemessageback_Dao _obj = new mvnforumofflinemessageback_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setSendmobile(arr.getString("SENDMOBILE"));
            _obj.setReceivemobile(arr.getString("RECEIVEMOBILE"));
            _obj.setMessage(arr.getString("MESSAGE"));
            _obj.setResourceid(arr.getString("RESOURCEID"));
            try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMOFFLINEMESSAGEBACK返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEBACKEntity对象
* @param MVNFORUMOFFLINEMESSAGEBACK row
* @returnMVNFORUMOFFLINEMESSAGEBACKList对象
* @throws Exception 
*/
public List< mvnforumofflinemessageback_Dao> get_mvnforumofflinemessageback_All(String strWhere) throws Exception{
         List<mvnforumofflinemessageback_Dao> _list = new ArrayList<mvnforumofflinemessageback_Dao>();
		 String sqlStr = "{ call MVNFORUMOFFLINEMESSAGEBACK_PRO.GetMVNFORUMOFFLINEMESSAGEBACKWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumofflinemessageback_Dao _obj = new mvnforumofflinemessageback_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setSendmobile(arr.getString("SENDMOBILE"));
            _obj.setReceivemobile(arr.getString("RECEIVEMOBILE"));
            _obj.setMessage(arr.getString("MESSAGE"));
            _obj.setResourceid(arr.getString("RESOURCEID"));
           try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMOFFLINEMESSAGEBACK返回 分页数据
* @param MVNFORUMOFFLINEMESSAGEBACK row
* @returnMVNFORUMOFFLINEMESSAGEBACKList对象
* @throws Exception 
*/
public List<mvnforumofflinemessageback_Dao> get_mvnforumofflinemessageback_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumofflinemessageback_Dao> _list = new ArrayList<mvnforumofflinemessageback_Dao>();
		String sqlStr = "{ call MVNFORUMOFFLINEMESSAGEBACK_PRO.GetMVNFORUMOFFLINEMESSAGEBACKPage(?,?,?,?,?,?)}";
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
				mvnforumofflinemessageback_Dao _obj = new mvnforumofflinemessageback_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setSendmobile(arr.getString("SENDMOBILE"));
            _obj.setReceivemobile(arr.getString("RECEIVEMOBILE"));
            _obj.setMessage(arr.getString("MESSAGE"));
            _obj.setResourceid(arr.getString("RESOURCEID"));
            try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMOFFLINEMESSAGEBACK返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEBACKEntity对象
* @param MVNFORUMOFFLINEMESSAGEBACK row
* @returnMVNFORUMOFFLINEMESSAGEBACKDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumofflinemessageback_Dao> get_mvnforumofflinemessageback_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumofflinemessagebackstrWhere") == null) {
			Dictionary<Integer, mvnforumofflinemessageback_Dao> _dic = new Hashtable<Integer, mvnforumofflinemessageback_Dao>();
			List<mvnforumofflinemessageback_Dao> _list = new ArrayList<mvnforumofflinemessageback_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMessageid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumofflinemessageback", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumofflinemessageback_Dao> _dic = (Dictionary<Integer, mvnforumofflinemessageback_Dao>) classFactory
					.cacheGet("dicmvnforumofflinemessagebackstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMOFFLINEMESSAGEBACK字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumofflinemessageback_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMOFFLINEMESSAGEBACK_PRO.UpdateFieldMVNFORUMOFFLINEMESSAGEBACK(?,?)}";
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
* 更新MVNFORUMOFFLINEMESSAGEBACKInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumofflinemessageback_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMOFFLINEMESSAGEBACK_PRO.UpdateFieldMVNFORUMOFFLINEMESSAGEBACKV(?,?,?)}";
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
* 更新MVNFORUMOFFLINEMESSAGEBACKIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumofflinemessageback_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMOFFLINEMESSAGEBACK_PRO.UpdateFieldMVNFORUMOFFLINEMESSAGEBACKU(?,?,?)}";
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
