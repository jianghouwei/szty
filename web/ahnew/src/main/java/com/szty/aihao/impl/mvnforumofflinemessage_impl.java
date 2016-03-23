/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumofflinemessage.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumofflinemessage_Dao;
import com.szty.aihao.core.mvnforumofflinemessage_core;
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
*@MVNFORUMOFFLINEMESSAGE数据接口
*@作者：宋春林 
*/
public class mvnforumofflinemessage_impl implements mvnforumofflinemessage_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumofflinemessage_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMOFFLINEMESSAGE实体
* @return 新插入记录的编号
*/
public int insert_mvnforumofflinemessage(mvnforumofflinemessage_Dao _MVNFORUMOFFLINEMESSAGEModel)  throws Exception{
         String sqlStr = "{call MVNFORUMOFFLINEMESSAGE_PRO.InsertMVNFORUMOFFLINEMESSAGE(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMOFFLINEMESSAGEModel.getMessageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEModel.getSendmobile());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEModel.getReceivemobile());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEModel.getMessage());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEModel.getResourceid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMOFFLINEMESSAGEModel.getMessagecreationdate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMOFFLINEMESSAGEModel.getStatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMOFFLINEMESSAGE
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumofflinemessage(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMOFFLINEMESSAGE_PRO.InsertMVNFORUMOFFLINEMESSAGE(?,?,?,?,?,?,?)}";
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
* @param MVNFORUMOFFLINEMESSAGE实体
* @return 影响的行数
*/
public int update_mvnforumofflinemessage(mvnforumofflinemessage_Dao _MVNFORUMOFFLINEMESSAGEModel)  throws Exception{
        String sqlStr = "{call MVNFORUMOFFLINEMESSAGE_PRO.UpdateMVNFORUMOFFLINEMESSAGE(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMOFFLINEMESSAGEModel.getMessageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEModel.getSendmobile());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEModel.getReceivemobile());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEModel.getMessage());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMOFFLINEMESSAGEModel.getResourceid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMOFFLINEMESSAGEModel.getMessagecreationdate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMOFFLINEMESSAGEModel.getStatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMOFFLINEMESSAGE中的一条记录
* @param MVNFORUMOFFLINEMESSAGE实体
* @return 新插入记录的编号
*/
public int delete_mvnforumofflinemessage(int Messageid)  throws Exception{
        String sqlStr = "{call MVNFORUMOFFLINEMESSAGE_PRO.DeleteMVNFORUMOFFLINEMESSAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Messageid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumofflinemessage 数据实体
* @param Messageid">Messageid
* @return<mvnforumofflinemessage 数据实体
* @throws Exception 
*/
public mvnforumofflinemessage_Dao get_mvnforumofflinemessageDao(int Messageid) throws Exception{
         String sqlStr = "{ call MVNFORUMOFFLINEMESSAGE_PRO.GetMVNFORUMOFFLINEMESSAGEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Messageid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumofflinemessage_Dao _obj = new mvnforumofflinemessage_Dao();
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
* 根据MVNFORUMOFFLINEMESSAGE返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEEntity对象
* @param MVNFORUMOFFLINEMESSAGE row
* @returnMVNFORUMOFFLINEMESSAGEList对象
* @throws Exception 
*/
public List<mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_All() throws Exception{
        List<mvnforumofflinemessage_Dao> _list = new ArrayList<mvnforumofflinemessage_Dao>();
		String sqlStr = "{ call MVNFORUMOFFLINEMESSAGE_PRO.GetMVNFORUMOFFLINEMESSAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumofflinemessage_Dao _obj = new mvnforumofflinemessage_Dao();
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
* 根据MVNFORUMOFFLINEMESSAGE返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEEntity对象
* @param MVNFORUMOFFLINEMESSAGE row
* @returnMVNFORUMOFFLINEMESSAGEList对象
* @throws Exception 
*/
public List< mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_All(String strWhere) throws Exception{
         List<mvnforumofflinemessage_Dao> _list = new ArrayList<mvnforumofflinemessage_Dao>();
		 String sqlStr = "{ call MVNFORUMOFFLINEMESSAGE_PRO.GetMVNFORUMOFFLINEMESSAGEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumofflinemessage_Dao _obj = new mvnforumofflinemessage_Dao();
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
* 根据MVNFORUMOFFLINEMESSAGE返回 分页数据
* @param MVNFORUMOFFLINEMESSAGE row
* @returnMVNFORUMOFFLINEMESSAGEList对象
* @throws Exception 
*/
public List<mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumofflinemessage_Dao> _list = new ArrayList<mvnforumofflinemessage_Dao>();
		String sqlStr = "{ call MVNFORUMOFFLINEMESSAGE_PRO.GetMVNFORUMOFFLINEMESSAGEPage(?,?,?,?,?,?)}";
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
				mvnforumofflinemessage_Dao _obj = new mvnforumofflinemessage_Dao();
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
* 根据MVNFORUMOFFLINEMESSAGE返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEEntity对象
* @param MVNFORUMOFFLINEMESSAGE row
* @returnMVNFORUMOFFLINEMESSAGEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumofflinemessagestrWhere") == null) {
			Dictionary<Integer, mvnforumofflinemessage_Dao> _dic = new Hashtable<Integer, mvnforumofflinemessage_Dao>();
			List<mvnforumofflinemessage_Dao> _list = new ArrayList<mvnforumofflinemessage_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMessageid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumofflinemessage", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumofflinemessage_Dao> _dic = (Dictionary<Integer, mvnforumofflinemessage_Dao>) classFactory
					.cacheGet("dicmvnforumofflinemessagestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMOFFLINEMESSAGE字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumofflinemessage_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMOFFLINEMESSAGE_PRO.UpdateFieldMVNFORUMOFFLINEMESSAGE(?,?)}";
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
* 更新MVNFORUMOFFLINEMESSAGEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumofflinemessage_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMOFFLINEMESSAGE_PRO.UpdateFieldMVNFORUMOFFLINEMESSAGEV(?,?,?)}";
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
* 更新MVNFORUMOFFLINEMESSAGEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumofflinemessage_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMOFFLINEMESSAGE_PRO.UpdateFieldMVNFORUMOFFLINEMESSAGEU(?,?,?)}";
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
