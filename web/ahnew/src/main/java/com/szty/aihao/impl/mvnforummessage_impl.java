/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforummessage.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforummessage_Dao;
import com.szty.aihao.core.mvnforummessage_core;
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
*@MVNFORUMMESSAGE数据接口
*@作者：宋春林 
*/
public class mvnforummessage_impl implements mvnforummessage_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforummessage_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMESSAGE实体
* @return 新插入记录的编号
*/
public int insert_mvnforummessage(mvnforummessage_Dao _MVNFORUMMESSAGEModel)  throws Exception{
         String sqlStr = "{call MVNFORUMMESSAGE_PRO.InsertMVNFORUMMESSAGE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getFoldername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMemberid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessagesenderid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagesendername());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagetolist());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagecclist());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagebcclist());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagetopic());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagebody());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessagetype());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessageoption());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessagestatus());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessagereadstatus());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessagenotify());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessageicon());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessageattachcount());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessageip());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMESSAGEModel.getMessagecreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMESSAGE
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforummessage(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMMESSAGE_PRO.InsertMVNFORUMMESSAGE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[19];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.DATE, dateformat.format(_para[18]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMMESSAGE实体
* @return 影响的行数
*/
public int update_mvnforummessage(mvnforummessage_Dao _MVNFORUMMESSAGEModel)  throws Exception{
        String sqlStr = "{call MVNFORUMMESSAGE_PRO.UpdateMVNFORUMMESSAGE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getFoldername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMemberid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessagesenderid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagesendername());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagetolist());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagecclist());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagebcclist());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagetopic());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessagebody());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessagetype());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessageoption());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessagestatus());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessagereadstatus());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessagenotify());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessageicon());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEModel.getMessageattachcount());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEModel.getMessageip());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMESSAGEModel.getMessagecreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMMESSAGE中的一条记录
* @param MVNFORUMMESSAGE实体
* @return 新插入记录的编号
*/
public int delete_mvnforummessage(int Messageid)  throws Exception{
        String sqlStr = "{call MVNFORUMMESSAGE_PRO.DeleteMVNFORUMMESSAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Messageid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforummessage 数据实体
* @param Messageid">Messageid
* @return<mvnforummessage 数据实体
* @throws Exception 
*/
public mvnforummessage_Dao get_mvnforummessageDao(int Messageid) throws Exception{
         String sqlStr = "{ call MVNFORUMMESSAGE_PRO.GetMVNFORUMMESSAGEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Messageid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummessage_Dao _obj = new mvnforummessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setFoldername(arr.getString("FOLDERNAME"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMessagesenderid(arr.getInt("MESSAGESENDERID"));
            _obj.setMessagesendername(arr.getString("MESSAGESENDERNAME"));
            _obj.setMessagetolist(arr.getString("MESSAGETOLIST"));
            _obj.setMessagecclist(arr.getString("MESSAGECCLIST"));
            _obj.setMessagebcclist(arr.getString("MESSAGEBCCLIST"));
            _obj.setMessagetopic(arr.getString("MESSAGETOPIC"));
            _obj.setMessagebody(arr.getString("MESSAGEBODY"));
            _obj.setMessagetype(arr.getInt("MESSAGETYPE"));
            _obj.setMessageoption(arr.getInt("MESSAGEOPTION"));
            _obj.setMessagestatus(arr.getInt("MESSAGESTATUS"));
            _obj.setMessagereadstatus(arr.getInt("MESSAGEREADSTATUS"));
            _obj.setMessagenotify(arr.getInt("MESSAGENOTIFY"));
            _obj.setMessageicon(arr.getString("MESSAGEICON"));
            _obj.setMessageattachcount(arr.getInt("MESSAGEATTACHCOUNT"));
            _obj.setMessageip(arr.getString("MESSAGEIP"));
             try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMMESSAGE返回的查询DataRow创建一个MVNFORUMMESSAGEEntity对象
* @param MVNFORUMMESSAGE row
* @returnMVNFORUMMESSAGEList对象
* @throws Exception 
*/
public List<mvnforummessage_Dao> get_mvnforummessage_All() throws Exception{
        List<mvnforummessage_Dao> _list = new ArrayList<mvnforummessage_Dao>();
		String sqlStr = "{ call MVNFORUMMESSAGE_PRO.GetMVNFORUMMESSAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummessage_Dao _obj = new mvnforummessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setFoldername(arr.getString("FOLDERNAME"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMessagesenderid(arr.getInt("MESSAGESENDERID"));
            _obj.setMessagesendername(arr.getString("MESSAGESENDERNAME"));
            _obj.setMessagetolist(arr.getString("MESSAGETOLIST"));
            _obj.setMessagecclist(arr.getString("MESSAGECCLIST"));
            _obj.setMessagebcclist(arr.getString("MESSAGEBCCLIST"));
            _obj.setMessagetopic(arr.getString("MESSAGETOPIC"));
            _obj.setMessagebody(arr.getString("MESSAGEBODY"));
            _obj.setMessagetype(arr.getInt("MESSAGETYPE"));
            _obj.setMessageoption(arr.getInt("MESSAGEOPTION"));
            _obj.setMessagestatus(arr.getInt("MESSAGESTATUS"));
            _obj.setMessagereadstatus(arr.getInt("MESSAGEREADSTATUS"));
            _obj.setMessagenotify(arr.getInt("MESSAGENOTIFY"));
            _obj.setMessageicon(arr.getString("MESSAGEICON"));
            _obj.setMessageattachcount(arr.getInt("MESSAGEATTACHCOUNT"));
            _obj.setMessageip(arr.getString("MESSAGEIP"));
            try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMMESSAGE返回的查询DataRow创建一个MVNFORUMMESSAGEEntity对象
* @param MVNFORUMMESSAGE row
* @returnMVNFORUMMESSAGEList对象
* @throws Exception 
*/
public List< mvnforummessage_Dao> get_mvnforummessage_All(String strWhere) throws Exception{
         List<mvnforummessage_Dao> _list = new ArrayList<mvnforummessage_Dao>();
		 String sqlStr = "{ call MVNFORUMMESSAGE_PRO.GetMVNFORUMMESSAGEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforummessage_Dao _obj = new mvnforummessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setFoldername(arr.getString("FOLDERNAME"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMessagesenderid(arr.getInt("MESSAGESENDERID"));
            _obj.setMessagesendername(arr.getString("MESSAGESENDERNAME"));
            _obj.setMessagetolist(arr.getString("MESSAGETOLIST"));
            _obj.setMessagecclist(arr.getString("MESSAGECCLIST"));
            _obj.setMessagebcclist(arr.getString("MESSAGEBCCLIST"));
            _obj.setMessagetopic(arr.getString("MESSAGETOPIC"));
            _obj.setMessagebody(arr.getString("MESSAGEBODY"));
            _obj.setMessagetype(arr.getInt("MESSAGETYPE"));
            _obj.setMessageoption(arr.getInt("MESSAGEOPTION"));
            _obj.setMessagestatus(arr.getInt("MESSAGESTATUS"));
            _obj.setMessagereadstatus(arr.getInt("MESSAGEREADSTATUS"));
            _obj.setMessagenotify(arr.getInt("MESSAGENOTIFY"));
            _obj.setMessageicon(arr.getString("MESSAGEICON"));
            _obj.setMessageattachcount(arr.getInt("MESSAGEATTACHCOUNT"));
            _obj.setMessageip(arr.getString("MESSAGEIP"));
           try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMMESSAGE返回 分页数据
* @param MVNFORUMMESSAGE row
* @returnMVNFORUMMESSAGEList对象
* @throws Exception 
*/
public List<mvnforummessage_Dao> get_mvnforummessage_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforummessage_Dao> _list = new ArrayList<mvnforummessage_Dao>();
		String sqlStr = "{ call MVNFORUMMESSAGE_PRO.GetMVNFORUMMESSAGEPage(?,?,?,?,?,?)}";
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
				mvnforummessage_Dao _obj = new mvnforummessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setFoldername(arr.getString("FOLDERNAME"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMessagesenderid(arr.getInt("MESSAGESENDERID"));
            _obj.setMessagesendername(arr.getString("MESSAGESENDERNAME"));
            _obj.setMessagetolist(arr.getString("MESSAGETOLIST"));
            _obj.setMessagecclist(arr.getString("MESSAGECCLIST"));
            _obj.setMessagebcclist(arr.getString("MESSAGEBCCLIST"));
            _obj.setMessagetopic(arr.getString("MESSAGETOPIC"));
            _obj.setMessagebody(arr.getString("MESSAGEBODY"));
            _obj.setMessagetype(arr.getInt("MESSAGETYPE"));
            _obj.setMessageoption(arr.getInt("MESSAGEOPTION"));
            _obj.setMessagestatus(arr.getInt("MESSAGESTATUS"));
            _obj.setMessagereadstatus(arr.getInt("MESSAGEREADSTATUS"));
            _obj.setMessagenotify(arr.getInt("MESSAGENOTIFY"));
            _obj.setMessageicon(arr.getString("MESSAGEICON"));
            _obj.setMessageattachcount(arr.getInt("MESSAGEATTACHCOUNT"));
            _obj.setMessageip(arr.getString("MESSAGEIP"));
            try{_obj.setMessagecreationdate(dateformat.parse(arr.getString("MESSAGECREATIONDATE")));}catch(Exception ce){_obj.setMessagecreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMMESSAGE返回的查询DataRow创建一个MVNFORUMMESSAGEEntity对象
* @param MVNFORUMMESSAGE row
* @returnMVNFORUMMESSAGEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforummessage_Dao> get_mvnforummessage_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforummessagestrWhere") == null) {
			Dictionary<Integer, mvnforummessage_Dao> _dic = new Hashtable<Integer, mvnforummessage_Dao>();
			List<mvnforummessage_Dao> _list = new ArrayList<mvnforummessage_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMessageid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforummessage", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforummessage_Dao> _dic = (Dictionary<Integer, mvnforummessage_Dao>) classFactory
					.cacheGet("dicmvnforummessagestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMMESSAGE字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforummessage_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMMESSAGE_PRO.UpdateFieldMVNFORUMMESSAGE(?,?)}";
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
* 更新MVNFORUMMESSAGEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforummessage_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMMESSAGE_PRO.UpdateFieldMVNFORUMMESSAGEV(?,?,?)}";
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
* 更新MVNFORUMMESSAGEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforummessage_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMMESSAGE_PRO.UpdateFieldMVNFORUMMESSAGEU(?,?,?)}";
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
