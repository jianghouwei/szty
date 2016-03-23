/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumpost.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumpost_Dao;
import com.szty.aihao.core.mvnforumpost_core;
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
*@MVNFORUMPOST数据接口
*@作者：宋春林 
*/
public class mvnforumpost_impl implements mvnforumpost_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumpost_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPOST实体
* @return 新插入记录的编号
*/
public int insert_mvnforumpost(mvnforumpost_Dao _MVNFORUMPOSTModel)  throws Exception{
         String sqlStr = "{call MVNFORUMPOST_PRO.InsertMVNFORUMPOST(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPostid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getParentpostid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getForumid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getThreadid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getMemberid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getMembername());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getLasteditmembername());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getPosttopic());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getPostbody());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPOSTModel.getPostcreationdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPOSTModel.getPostlasteditdate()));
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getPostcreationip());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getPostlasteditip());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPosteditcount());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPostformatoption());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPostoption());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPoststatus());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getPosticon());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPostattachcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPOST
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumpost(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMPOST_PRO.InsertMVNFORUMPOST(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[19];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_para[9]));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_para[10]));
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_para[18]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMPOST实体
* @return 影响的行数
*/
public int update_mvnforumpost(mvnforumpost_Dao _MVNFORUMPOSTModel)  throws Exception{
        String sqlStr = "{call MVNFORUMPOST_PRO.UpdateMVNFORUMPOST(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPostid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getParentpostid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getForumid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getThreadid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getMemberid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getMembername());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getLasteditmembername());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getPosttopic());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getPostbody());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPOSTModel.getPostcreationdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPOSTModel.getPostlasteditdate()));
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getPostcreationip());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getPostlasteditip());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPosteditcount());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPostformatoption());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPostoption());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPoststatus());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPOSTModel.getPosticon());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_MVNFORUMPOSTModel.getPostattachcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMPOST中的一条记录
* @param MVNFORUMPOST实体
* @return 新插入记录的编号
*/
public int delete_mvnforumpost(int Postid)  throws Exception{
        String sqlStr = "{call MVNFORUMPOST_PRO.DeleteMVNFORUMPOST(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Postid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumpost 数据实体
* @param Postid">Postid
* @return<mvnforumpost 数据实体
* @throws Exception 
*/
public mvnforumpost_Dao get_mvnforumpostDao(int Postid) throws Exception{
         String sqlStr = "{ call MVNFORUMPOST_PRO.GetMVNFORUMPOSTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Postid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumpost_Dao _obj = new mvnforumpost_Dao();
            _obj.setPostid(arr.getInt("POSTID"));
            _obj.setParentpostid(arr.getInt("PARENTPOSTID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setLasteditmembername(arr.getString("LASTEDITMEMBERNAME"));
            _obj.setPosttopic(arr.getString("POSTTOPIC"));
            _obj.setPostbody(arr.getString("POSTBODY"));
             try{_obj.setPostcreationdate(dateformat.parse(arr.getString("POSTCREATIONDATE")));}catch(Exception ce){_obj.setPostcreationdate((new Date()));}
             try{_obj.setPostlasteditdate(dateformat.parse(arr.getString("POSTLASTEDITDATE")));}catch(Exception ce){_obj.setPostlasteditdate((new Date()));}
            _obj.setPostcreationip(arr.getString("POSTCREATIONIP"));
            _obj.setPostlasteditip(arr.getString("POSTLASTEDITIP"));
            _obj.setPosteditcount(arr.getInt("POSTEDITCOUNT"));
            _obj.setPostformatoption(arr.getInt("POSTFORMATOPTION"));
            _obj.setPostoption(arr.getInt("POSTOPTION"));
            _obj.setPoststatus(arr.getInt("POSTSTATUS"));
            _obj.setPosticon(arr.getString("POSTICON"));
            _obj.setPostattachcount(arr.getInt("POSTATTACHCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMPOST返回的查询DataRow创建一个MVNFORUMPOSTEntity对象
* @param MVNFORUMPOST row
* @returnMVNFORUMPOSTList对象
* @throws Exception 
*/
public List<mvnforumpost_Dao> get_mvnforumpost_All() throws Exception{
        List<mvnforumpost_Dao> _list = new ArrayList<mvnforumpost_Dao>();
		String sqlStr = "{ call MVNFORUMPOST_PRO.GetMVNFORUMPOST(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumpost_Dao _obj = new mvnforumpost_Dao();
            _obj.setPostid(arr.getInt("POSTID"));
            _obj.setParentpostid(arr.getInt("PARENTPOSTID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setLasteditmembername(arr.getString("LASTEDITMEMBERNAME"));
            _obj.setPosttopic(arr.getString("POSTTOPIC"));
            _obj.setPostbody(arr.getString("POSTBODY"));
            try{_obj.setPostcreationdate(dateformat.parse(arr.getString("POSTCREATIONDATE")));}catch(Exception ce){_obj.setPostcreationdate((new Date()));}
            try{_obj.setPostlasteditdate(dateformat.parse(arr.getString("POSTLASTEDITDATE")));}catch(Exception ce){_obj.setPostlasteditdate((new Date()));}
            _obj.setPostcreationip(arr.getString("POSTCREATIONIP"));
            _obj.setPostlasteditip(arr.getString("POSTLASTEDITIP"));
            _obj.setPosteditcount(arr.getInt("POSTEDITCOUNT"));
            _obj.setPostformatoption(arr.getInt("POSTFORMATOPTION"));
            _obj.setPostoption(arr.getInt("POSTOPTION"));
            _obj.setPoststatus(arr.getInt("POSTSTATUS"));
            _obj.setPosticon(arr.getString("POSTICON"));
            _obj.setPostattachcount(arr.getInt("POSTATTACHCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMPOST返回的查询DataRow创建一个MVNFORUMPOSTEntity对象
* @param MVNFORUMPOST row
* @returnMVNFORUMPOSTList对象
* @throws Exception 
*/
public List< mvnforumpost_Dao> get_mvnforumpost_All(String strWhere) throws Exception{
         List<mvnforumpost_Dao> _list = new ArrayList<mvnforumpost_Dao>();
		 String sqlStr = "{ call MVNFORUMPOST_PRO.GetMVNFORUMPOSTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumpost_Dao _obj = new mvnforumpost_Dao();
            _obj.setPostid(arr.getInt("POSTID"));
            _obj.setParentpostid(arr.getInt("PARENTPOSTID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setLasteditmembername(arr.getString("LASTEDITMEMBERNAME"));
            _obj.setPosttopic(arr.getString("POSTTOPIC"));
            _obj.setPostbody(arr.getString("POSTBODY"));
           try{_obj.setPostcreationdate(dateformat.parse(arr.getString("POSTCREATIONDATE")));}catch(Exception ce){_obj.setPostcreationdate((new Date()));}
           try{_obj.setPostlasteditdate(dateformat.parse(arr.getString("POSTLASTEDITDATE")));}catch(Exception ce){_obj.setPostlasteditdate((new Date()));}
            _obj.setPostcreationip(arr.getString("POSTCREATIONIP"));
            _obj.setPostlasteditip(arr.getString("POSTLASTEDITIP"));
            _obj.setPosteditcount(arr.getInt("POSTEDITCOUNT"));
            _obj.setPostformatoption(arr.getInt("POSTFORMATOPTION"));
            _obj.setPostoption(arr.getInt("POSTOPTION"));
            _obj.setPoststatus(arr.getInt("POSTSTATUS"));
            _obj.setPosticon(arr.getString("POSTICON"));
            _obj.setPostattachcount(arr.getInt("POSTATTACHCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMPOST返回 分页数据
* @param MVNFORUMPOST row
* @returnMVNFORUMPOSTList对象
* @throws Exception 
*/
public List<mvnforumpost_Dao> get_mvnforumpost_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumpost_Dao> _list = new ArrayList<mvnforumpost_Dao>();
		String sqlStr = "{ call MVNFORUMPOST_PRO.GetMVNFORUMPOSTPage(?,?,?,?,?,?)}";
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
				mvnforumpost_Dao _obj = new mvnforumpost_Dao();
            _obj.setPostid(arr.getInt("POSTID"));
            _obj.setParentpostid(arr.getInt("PARENTPOSTID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setThreadid(arr.getInt("THREADID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setLasteditmembername(arr.getString("LASTEDITMEMBERNAME"));
            _obj.setPosttopic(arr.getString("POSTTOPIC"));
            _obj.setPostbody(arr.getString("POSTBODY"));
            try{_obj.setPostcreationdate(dateformat.parse(arr.getString("POSTCREATIONDATE")));}catch(Exception ce){_obj.setPostcreationdate((new Date()));}
            try{_obj.setPostlasteditdate(dateformat.parse(arr.getString("POSTLASTEDITDATE")));}catch(Exception ce){_obj.setPostlasteditdate((new Date()));}
            _obj.setPostcreationip(arr.getString("POSTCREATIONIP"));
            _obj.setPostlasteditip(arr.getString("POSTLASTEDITIP"));
            _obj.setPosteditcount(arr.getInt("POSTEDITCOUNT"));
            _obj.setPostformatoption(arr.getInt("POSTFORMATOPTION"));
            _obj.setPostoption(arr.getInt("POSTOPTION"));
            _obj.setPoststatus(arr.getInt("POSTSTATUS"));
            _obj.setPosticon(arr.getString("POSTICON"));
            _obj.setPostattachcount(arr.getInt("POSTATTACHCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMPOST返回的查询DataRow创建一个MVNFORUMPOSTEntity对象
* @param MVNFORUMPOST row
* @returnMVNFORUMPOSTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumpost_Dao> get_mvnforumpost_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumpoststrWhere") == null) {
			Dictionary<Integer, mvnforumpost_Dao> _dic = new Hashtable<Integer, mvnforumpost_Dao>();
			List<mvnforumpost_Dao> _list = new ArrayList<mvnforumpost_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getPostid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumpost", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumpost_Dao> _dic = (Dictionary<Integer, mvnforumpost_Dao>) classFactory
					.cacheGet("dicmvnforumpoststrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMPOST字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumpost_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMPOST_PRO.UpdateFieldMVNFORUMPOST(?,?)}";
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
* 更新MVNFORUMPOSTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumpost_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMPOST_PRO.UpdateFieldMVNFORUMPOSTV(?,?,?)}";
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
* 更新MVNFORUMPOSTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumpost_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMPOST_PRO.UpdateFieldMVNFORUMPOSTU(?,?,?)}";
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
