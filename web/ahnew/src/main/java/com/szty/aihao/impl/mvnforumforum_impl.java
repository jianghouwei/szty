/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumforum.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumforum_Dao;
import com.szty.aihao.core.mvnforumforum_core;
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
*@MVNFORUMFORUM数据接口
*@作者：宋春林 
*/
public class mvnforumforum_impl implements mvnforumforum_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumforum_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMFORUM实体
* @return 新插入记录的编号
*/
public int insert_mvnforumforum(mvnforumforum_Dao _MVNFORUMFORUMModel)  throws Exception{
         String sqlStr = "{call MVNFORUMFORUM_PRO.InsertMVNFORUMFORUM(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getCategoryid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMFORUMModel.getForumownername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMFORUMModel.getLastpostmembername());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMFORUMModel.getForumname());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMFORUMModel.getForumdesc());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMFORUMModel.getForumcreationdate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMFORUMModel.getForummodifieddate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMFORUMModel.getForumlastpostdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumorder());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumtype());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForummodetype());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumformatoption());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumoption());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumstatus());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForummoderationmode());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_MVNFORUMFORUMModel.getForumpassword());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumthreadcount());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumpostcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMFORUM
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumforum(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMFORUM_PRO.InsertMVNFORUMFORUM(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[19];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_para[7]));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_para[8]));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_para[18]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMFORUM实体
* @return 影响的行数
*/
public int update_mvnforumforum(mvnforumforum_Dao _MVNFORUMFORUMModel)  throws Exception{
        String sqlStr = "{call MVNFORUMFORUM_PRO.UpdateMVNFORUMFORUM(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getCategoryid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMFORUMModel.getForumownername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMFORUMModel.getLastpostmembername());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMFORUMModel.getForumname());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMFORUMModel.getForumdesc());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMFORUMModel.getForumcreationdate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMFORUMModel.getForummodifieddate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMFORUMModel.getForumlastpostdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumorder());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumtype());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForummodetype());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumformatoption());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumoption());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumstatus());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForummoderationmode());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_MVNFORUMFORUMModel.getForumpassword());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumthreadcount());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_MVNFORUMFORUMModel.getForumpostcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMFORUM中的一条记录
* @param MVNFORUMFORUM实体
* @return 新插入记录的编号
*/
public int delete_mvnforumforum(int Forumid)  throws Exception{
        String sqlStr = "{call MVNFORUMFORUM_PRO.DeleteMVNFORUMFORUM(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Forumid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumforum 数据实体
* @param Forumid">Forumid
* @return<mvnforumforum 数据实体
* @throws Exception 
*/
public mvnforumforum_Dao get_mvnforumforumDao(int Forumid) throws Exception{
         String sqlStr = "{ call MVNFORUMFORUM_PRO.GetMVNFORUMFORUMEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Forumid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumforum_Dao _obj = new mvnforumforum_Dao();
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setForumownername(arr.getString("FORUMOWNERNAME"));
            _obj.setLastpostmembername(arr.getString("LASTPOSTMEMBERNAME"));
            _obj.setForumname(arr.getString("FORUMNAME"));
            _obj.setForumdesc(arr.getString("FORUMDESC"));
             try{_obj.setForumcreationdate(dateformat.parse(arr.getString("FORUMCREATIONDATE")));}catch(Exception ce){_obj.setForumcreationdate((new Date()));}
             try{_obj.setForummodifieddate(dateformat.parse(arr.getString("FORUMMODIFIEDDATE")));}catch(Exception ce){_obj.setForummodifieddate((new Date()));}
             try{_obj.setForumlastpostdate(dateformat.parse(arr.getString("FORUMLASTPOSTDATE")));}catch(Exception ce){_obj.setForumlastpostdate((new Date()));}
            _obj.setForumorder(arr.getInt("FORUMORDER"));
            _obj.setForumtype(arr.getInt("FORUMTYPE"));
            _obj.setForummodetype(arr.getInt("FORUMMODETYPE"));
            _obj.setForumformatoption(arr.getInt("FORUMFORMATOPTION"));
            _obj.setForumoption(arr.getInt("FORUMOPTION"));
            _obj.setForumstatus(arr.getInt("FORUMSTATUS"));
            _obj.setForummoderationmode(arr.getInt("FORUMMODERATIONMODE"));
            _obj.setForumpassword(arr.getString("FORUMPASSWORD"));
            _obj.setForumthreadcount(arr.getInt("FORUMTHREADCOUNT"));
            _obj.setForumpostcount(arr.getInt("FORUMPOSTCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMFORUM返回的查询DataRow创建一个MVNFORUMFORUMEntity对象
* @param MVNFORUMFORUM row
* @returnMVNFORUMFORUMList对象
* @throws Exception 
*/
public List<mvnforumforum_Dao> get_mvnforumforum_All() throws Exception{
        List<mvnforumforum_Dao> _list = new ArrayList<mvnforumforum_Dao>();
		String sqlStr = "{ call MVNFORUMFORUM_PRO.GetMVNFORUMFORUM(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumforum_Dao _obj = new mvnforumforum_Dao();
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setForumownername(arr.getString("FORUMOWNERNAME"));
            _obj.setLastpostmembername(arr.getString("LASTPOSTMEMBERNAME"));
            _obj.setForumname(arr.getString("FORUMNAME"));
            _obj.setForumdesc(arr.getString("FORUMDESC"));
            try{_obj.setForumcreationdate(dateformat.parse(arr.getString("FORUMCREATIONDATE")));}catch(Exception ce){_obj.setForumcreationdate((new Date()));}
            try{_obj.setForummodifieddate(dateformat.parse(arr.getString("FORUMMODIFIEDDATE")));}catch(Exception ce){_obj.setForummodifieddate((new Date()));}
            try{_obj.setForumlastpostdate(dateformat.parse(arr.getString("FORUMLASTPOSTDATE")));}catch(Exception ce){_obj.setForumlastpostdate((new Date()));}
            _obj.setForumorder(arr.getInt("FORUMORDER"));
            _obj.setForumtype(arr.getInt("FORUMTYPE"));
            _obj.setForummodetype(arr.getInt("FORUMMODETYPE"));
            _obj.setForumformatoption(arr.getInt("FORUMFORMATOPTION"));
            _obj.setForumoption(arr.getInt("FORUMOPTION"));
            _obj.setForumstatus(arr.getInt("FORUMSTATUS"));
            _obj.setForummoderationmode(arr.getInt("FORUMMODERATIONMODE"));
            _obj.setForumpassword(arr.getString("FORUMPASSWORD"));
            _obj.setForumthreadcount(arr.getInt("FORUMTHREADCOUNT"));
            _obj.setForumpostcount(arr.getInt("FORUMPOSTCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMFORUM返回的查询DataRow创建一个MVNFORUMFORUMEntity对象
* @param MVNFORUMFORUM row
* @returnMVNFORUMFORUMList对象
* @throws Exception 
*/
public List< mvnforumforum_Dao> get_mvnforumforum_All(String strWhere) throws Exception{
         List<mvnforumforum_Dao> _list = new ArrayList<mvnforumforum_Dao>();
		 String sqlStr = "{ call MVNFORUMFORUM_PRO.GetMVNFORUMFORUMWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumforum_Dao _obj = new mvnforumforum_Dao();
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setForumownername(arr.getString("FORUMOWNERNAME"));
            _obj.setLastpostmembername(arr.getString("LASTPOSTMEMBERNAME"));
            _obj.setForumname(arr.getString("FORUMNAME"));
            _obj.setForumdesc(arr.getString("FORUMDESC"));
           try{_obj.setForumcreationdate(dateformat.parse(arr.getString("FORUMCREATIONDATE")));}catch(Exception ce){_obj.setForumcreationdate((new Date()));}
           try{_obj.setForummodifieddate(dateformat.parse(arr.getString("FORUMMODIFIEDDATE")));}catch(Exception ce){_obj.setForummodifieddate((new Date()));}
           try{_obj.setForumlastpostdate(dateformat.parse(arr.getString("FORUMLASTPOSTDATE")));}catch(Exception ce){_obj.setForumlastpostdate((new Date()));}
            _obj.setForumorder(arr.getInt("FORUMORDER"));
            _obj.setForumtype(arr.getInt("FORUMTYPE"));
            _obj.setForummodetype(arr.getInt("FORUMMODETYPE"));
            _obj.setForumformatoption(arr.getInt("FORUMFORMATOPTION"));
            _obj.setForumoption(arr.getInt("FORUMOPTION"));
            _obj.setForumstatus(arr.getInt("FORUMSTATUS"));
            _obj.setForummoderationmode(arr.getInt("FORUMMODERATIONMODE"));
            _obj.setForumpassword(arr.getString("FORUMPASSWORD"));
            _obj.setForumthreadcount(arr.getInt("FORUMTHREADCOUNT"));
            _obj.setForumpostcount(arr.getInt("FORUMPOSTCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMFORUM返回 分页数据
* @param MVNFORUMFORUM row
* @returnMVNFORUMFORUMList对象
* @throws Exception 
*/
public List<mvnforumforum_Dao> get_mvnforumforum_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumforum_Dao> _list = new ArrayList<mvnforumforum_Dao>();
		String sqlStr = "{ call MVNFORUMFORUM_PRO.GetMVNFORUMFORUMPage(?,?,?,?,?,?)}";
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
				mvnforumforum_Dao _obj = new mvnforumforum_Dao();
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setForumownername(arr.getString("FORUMOWNERNAME"));
            _obj.setLastpostmembername(arr.getString("LASTPOSTMEMBERNAME"));
            _obj.setForumname(arr.getString("FORUMNAME"));
            _obj.setForumdesc(arr.getString("FORUMDESC"));
            try{_obj.setForumcreationdate(dateformat.parse(arr.getString("FORUMCREATIONDATE")));}catch(Exception ce){_obj.setForumcreationdate((new Date()));}
            try{_obj.setForummodifieddate(dateformat.parse(arr.getString("FORUMMODIFIEDDATE")));}catch(Exception ce){_obj.setForummodifieddate((new Date()));}
            try{_obj.setForumlastpostdate(dateformat.parse(arr.getString("FORUMLASTPOSTDATE")));}catch(Exception ce){_obj.setForumlastpostdate((new Date()));}
            _obj.setForumorder(arr.getInt("FORUMORDER"));
            _obj.setForumtype(arr.getInt("FORUMTYPE"));
            _obj.setForummodetype(arr.getInt("FORUMMODETYPE"));
            _obj.setForumformatoption(arr.getInt("FORUMFORMATOPTION"));
            _obj.setForumoption(arr.getInt("FORUMOPTION"));
            _obj.setForumstatus(arr.getInt("FORUMSTATUS"));
            _obj.setForummoderationmode(arr.getInt("FORUMMODERATIONMODE"));
            _obj.setForumpassword(arr.getString("FORUMPASSWORD"));
            _obj.setForumthreadcount(arr.getInt("FORUMTHREADCOUNT"));
            _obj.setForumpostcount(arr.getInt("FORUMPOSTCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMFORUM返回的查询DataRow创建一个MVNFORUMFORUMEntity对象
* @param MVNFORUMFORUM row
* @returnMVNFORUMFORUMDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumforum_Dao> get_mvnforumforum_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumforumstrWhere") == null) {
			Dictionary<Integer, mvnforumforum_Dao> _dic = new Hashtable<Integer, mvnforumforum_Dao>();
			List<mvnforumforum_Dao> _list = new ArrayList<mvnforumforum_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getForumid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumforum", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumforum_Dao> _dic = (Dictionary<Integer, mvnforumforum_Dao>) classFactory
					.cacheGet("dicmvnforumforumstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMFORUM字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumforum_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMFORUM_PRO.UpdateFieldMVNFORUMFORUM(?,?)}";
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
* 更新MVNFORUMFORUMInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumforum_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMFORUM_PRO.UpdateFieldMVNFORUMFORUMV(?,?,?)}";
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
* 更新MVNFORUMFORUMIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumforum_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMFORUM_PRO.UpdateFieldMVNFORUMFORUMU(?,?,?)}";
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
