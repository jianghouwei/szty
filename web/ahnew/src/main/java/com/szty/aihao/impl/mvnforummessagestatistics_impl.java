/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforummessagestatistics.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforummessagestatistics_Dao;
import com.szty.aihao.core.mvnforummessagestatistics_core;
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
*@MVNFORUMMESSAGESTATISTICS数据接口
*@作者：宋春林 
*/
public class mvnforummessagestatistics_impl implements mvnforummessagestatistics_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforummessagestatistics_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMESSAGESTATISTICS实体
* @return 新插入记录的编号
*/
public int insert_mvnforummessagestatistics(mvnforummessagestatistics_Dao _MVNFORUMMESSAGESTATISTICSModel)  throws Exception{
         String sqlStr = "{call MVNFORUMMESSAGESTATISTICS_PRO.InsertMVNFORUMMESSAGESTATISTICS(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getFromid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getToid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMESSAGESTATISTICSModel.getMessagecreationdate()));
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getMessageattachcount());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getMessagetype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getMessageoption());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getMessagestatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMESSAGESTATISTICS
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforummessagestatistics(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMMESSAGESTATISTICS_PRO.InsertMVNFORUMMESSAGESTATISTICS(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.DATE, dateformat.format(_para[2]));
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
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
* @param MVNFORUMMESSAGESTATISTICS实体
* @return 影响的行数
*/
public int update_mvnforummessagestatistics(mvnforummessagestatistics_Dao _MVNFORUMMESSAGESTATISTICSModel)  throws Exception{
        String sqlStr = "{call MVNFORUMMESSAGESTATISTICS_PRO.UpdateMVNFORUMMESSAGESTATISTICS(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getFromid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getToid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMESSAGESTATISTICSModel.getMessagecreationdate()));
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getMessageattachcount());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getMessagetype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getMessageoption());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGESTATISTICSModel.getMessagestatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMMESSAGESTATISTICS中的一条记录
* @param MVNFORUMMESSAGESTATISTICS实体
* @return 新插入记录的编号
*/
public int delete_mvnforummessagestatistics(int Fromid)  throws Exception{
        String sqlStr = "{call MVNFORUMMESSAGESTATISTICS_PRO.DeleteMVNFORUMMESSAGESTATISTICS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Fromid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforummessagestatistics 数据实体
* @param Fromid">Fromid
* @return<mvnforummessagestatistics 数据实体
* @throws Exception 
*/
public mvnforummessagestatistics_Dao get_mvnforummessagestatisticsDao(int Fromid) throws Exception{
         String sqlStr = "{ call MVNFORUMMESSAGESTATISTICS_PRO.GetMVNFORUMMESSAGESTATISTICSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Fromid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummessagestatistics_Dao _obj = new mvnforummessagestatistics_Dao();
            _obj.setFromid(arr.getInt("FROMID"));
            _obj.setToid(arr.getInt("TOID"));
             try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
            _obj.setMessageattachcount(arr.getInt("MESSAGEATTACHCOUNT"));
            _obj.setMessagetype(arr.getInt("MESSAGETYPE"));
            _obj.setMessageoption(arr.getInt("MESSAGEOPTION"));
            _obj.setMessagestatus(arr.getInt("MESSAGESTATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMMESSAGESTATISTICS返回的查询DataRow创建一个MVNFORUMMESSAGESTATISTICSEntity对象
* @param MVNFORUMMESSAGESTATISTICS row
* @returnMVNFORUMMESSAGESTATISTICSList对象
* @throws Exception 
*/
public List<mvnforummessagestatistics_Dao> get_mvnforummessagestatistics_All() throws Exception{
        List<mvnforummessagestatistics_Dao> _list = new ArrayList<mvnforummessagestatistics_Dao>();
		String sqlStr = "{ call MVNFORUMMESSAGESTATISTICS_PRO.GetMVNFORUMMESSAGESTATISTICS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummessagestatistics_Dao _obj = new mvnforummessagestatistics_Dao();
            _obj.setFromid(arr.getInt("FROMID"));
            _obj.setToid(arr.getInt("TOID"));
            try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
            _obj.setMessageattachcount(arr.getInt("MESSAGEATTACHCOUNT"));
            _obj.setMessagetype(arr.getInt("MESSAGETYPE"));
            _obj.setMessageoption(arr.getInt("MESSAGEOPTION"));
            _obj.setMessagestatus(arr.getInt("MESSAGESTATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMMESSAGESTATISTICS返回的查询DataRow创建一个MVNFORUMMESSAGESTATISTICSEntity对象
* @param MVNFORUMMESSAGESTATISTICS row
* @returnMVNFORUMMESSAGESTATISTICSList对象
* @throws Exception 
*/
public List< mvnforummessagestatistics_Dao> get_mvnforummessagestatistics_All(String strWhere) throws Exception{
         List<mvnforummessagestatistics_Dao> _list = new ArrayList<mvnforummessagestatistics_Dao>();
		 String sqlStr = "{ call MVNFORUMMESSAGESTATISTICS_PRO.GetMVNFORUMMESSAGESTATISTICSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforummessagestatistics_Dao _obj = new mvnforummessagestatistics_Dao();
            _obj.setFromid(arr.getInt("FROMID"));
            _obj.setToid(arr.getInt("TOID"));
           try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
            _obj.setMessageattachcount(arr.getInt("MESSAGEATTACHCOUNT"));
            _obj.setMessagetype(arr.getInt("MESSAGETYPE"));
            _obj.setMessageoption(arr.getInt("MESSAGEOPTION"));
            _obj.setMessagestatus(arr.getInt("MESSAGESTATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMMESSAGESTATISTICS返回 分页数据
* @param MVNFORUMMESSAGESTATISTICS row
* @returnMVNFORUMMESSAGESTATISTICSList对象
* @throws Exception 
*/
public List<mvnforummessagestatistics_Dao> get_mvnforummessagestatistics_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforummessagestatistics_Dao> _list = new ArrayList<mvnforummessagestatistics_Dao>();
		String sqlStr = "{ call MVNFORUMMESSAGESTATISTICS_PRO.GetMVNFORUMMESSAGESTATISTICSPage(?,?,?,?,?,?)}";
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
				mvnforummessagestatistics_Dao _obj = new mvnforummessagestatistics_Dao();
            _obj.setFromid(arr.getInt("FROMID"));
            _obj.setToid(arr.getInt("TOID"));
            try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
            _obj.setMessageattachcount(arr.getInt("MESSAGEATTACHCOUNT"));
            _obj.setMessagetype(arr.getInt("MESSAGETYPE"));
            _obj.setMessageoption(arr.getInt("MESSAGEOPTION"));
            _obj.setMessagestatus(arr.getInt("MESSAGESTATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMMESSAGESTATISTICS返回的查询DataRow创建一个MVNFORUMMESSAGESTATISTICSEntity对象
* @param MVNFORUMMESSAGESTATISTICS row
* @returnMVNFORUMMESSAGESTATISTICSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforummessagestatistics_Dao> get_mvnforummessagestatistics_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforummessagestatisticsstrWhere") == null) {
			Dictionary<Integer, mvnforummessagestatistics_Dao> _dic = new Hashtable<Integer, mvnforummessagestatistics_Dao>();
			List<mvnforummessagestatistics_Dao> _list = new ArrayList<mvnforummessagestatistics_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getFromid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforummessagestatistics", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforummessagestatistics_Dao> _dic = (Dictionary<Integer, mvnforummessagestatistics_Dao>) classFactory
					.cacheGet("dicmvnforummessagestatisticsstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMMESSAGESTATISTICS字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforummessagestatistics_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMMESSAGESTATISTICS_PRO.UpdateFieldMVNFORUMMESSAGESTATISTICS(?,?)}";
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
* 更新MVNFORUMMESSAGESTATISTICSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforummessagestatistics_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMMESSAGESTATISTICS_PRO.UpdateFieldMVNFORUMMESSAGESTATISTICSV(?,?,?)}";
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
* 更新MVNFORUMMESSAGESTATISTICSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforummessagestatistics_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMMESSAGESTATISTICS_PRO.UpdateFieldMVNFORUMMESSAGESTATISTICSU(?,?,?)}";
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
