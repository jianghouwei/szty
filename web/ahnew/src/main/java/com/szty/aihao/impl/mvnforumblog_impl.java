/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumblog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumblog_Dao;
import com.szty.aihao.core.mvnforumblog_core;
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
*@MVNFORUMBLOG数据接口
*@作者：宋春林 
*/
public class mvnforumblog_impl implements mvnforumblog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumblog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBLOG实体
* @return 新插入记录的编号
*/
public int insert_mvnforumblog(mvnforumblog_Dao _MVNFORUMBLOGModel)  throws Exception{
         String sqlStr = "{call MVNFORUMBLOG_PRO.InsertMVNFORUMBLOG(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMBLOGModel.getBlogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGModel.getBlogownername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGModel.getBlognickname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGModel.getBlogtitle());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGModel.getBlogcontent());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBLOGModel.getBlogcreationdate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBLOGModel.getBlogmodifieddate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGModel.getBlogstatus());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGModel.getReviewcount());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGModel.getCoverfavoritecount());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBLOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumblog(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMBLOG_PRO.InsertMVNFORUMBLOG(?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[11];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMBLOG实体
* @return 影响的行数
*/
public int update_mvnforumblog(mvnforumblog_Dao _MVNFORUMBLOGModel)  throws Exception{
        String sqlStr = "{call MVNFORUMBLOG_PRO.UpdateMVNFORUMBLOG(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGModel.getBlogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGModel.getBlogownername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGModel.getBlognickname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGModel.getBlogtitle());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGModel.getBlogcontent());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBLOGModel.getBlogcreationdate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBLOGModel.getBlogmodifieddate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGModel.getBlogstatus());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGModel.getReviewcount());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGModel.getCoverfavoritecount());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMBLOG中的一条记录
* @param MVNFORUMBLOG实体
* @return 新插入记录的编号
*/
public int delete_mvnforumblog(int Blogid)  throws Exception{
        String sqlStr = "{call MVNFORUMBLOG_PRO.DeleteMVNFORUMBLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Blogid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumblog 数据实体
* @param Blogid">Blogid
* @return<mvnforumblog 数据实体
* @throws Exception 
*/
public mvnforumblog_Dao get_mvnforumblogDao(int Blogid) throws Exception{
         String sqlStr = "{ call MVNFORUMBLOG_PRO.GetMVNFORUMBLOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Blogid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumblog_Dao _obj = new mvnforumblog_Dao();
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setBlogownername(arr.getString("BLOGOWNERNAME"));
            _obj.setBlognickname(arr.getString("BLOGNICKNAME"));
            _obj.setBlogtitle(arr.getString("BLOGTITLE"));
            _obj.setBlogcontent(arr.getString("BLOGCONTENT"));
             try{_obj.setBlogcreationdate(dateformat.parse(arr.getString("BLOGCREATIONDATE")));}catch(Exception ce){_obj.setBlogcreationdate((new Date()));}
             try{_obj.setBlogmodifieddate(dateformat.parse(arr.getString("BLOGMODIFIEDDATE")));}catch(Exception ce){_obj.setBlogmodifieddate((new Date()));}
            _obj.setBlogstatus(arr.getInt("BLOGSTATUS"));
            _obj.setReviewcount(arr.getInt("REVIEWCOUNT"));
            _obj.setCoverfavoritecount(arr.getInt("COVERFAVORITECOUNT"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMBLOG返回的查询DataRow创建一个MVNFORUMBLOGEntity对象
* @param MVNFORUMBLOG row
* @returnMVNFORUMBLOGList对象
* @throws Exception 
*/
public List<mvnforumblog_Dao> get_mvnforumblog_All() throws Exception{
        List<mvnforumblog_Dao> _list = new ArrayList<mvnforumblog_Dao>();
		String sqlStr = "{ call MVNFORUMBLOG_PRO.GetMVNFORUMBLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumblog_Dao _obj = new mvnforumblog_Dao();
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setBlogownername(arr.getString("BLOGOWNERNAME"));
            _obj.setBlognickname(arr.getString("BLOGNICKNAME"));
            _obj.setBlogtitle(arr.getString("BLOGTITLE"));
            _obj.setBlogcontent(arr.getString("BLOGCONTENT"));
            try{_obj.setBlogcreationdate(dateformat.parse(arr.getString("BLOGCREATIONDATE")));}catch(Exception ce){_obj.setBlogcreationdate((new Date()));}
            try{_obj.setBlogmodifieddate(dateformat.parse(arr.getString("BLOGMODIFIEDDATE")));}catch(Exception ce){_obj.setBlogmodifieddate((new Date()));}
            _obj.setBlogstatus(arr.getInt("BLOGSTATUS"));
            _obj.setReviewcount(arr.getInt("REVIEWCOUNT"));
            _obj.setCoverfavoritecount(arr.getInt("COVERFAVORITECOUNT"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMBLOG返回的查询DataRow创建一个MVNFORUMBLOGEntity对象
* @param MVNFORUMBLOG row
* @returnMVNFORUMBLOGList对象
* @throws Exception 
*/
public List< mvnforumblog_Dao> get_mvnforumblog_All(String strWhere) throws Exception{
         List<mvnforumblog_Dao> _list = new ArrayList<mvnforumblog_Dao>();
		 String sqlStr = "{ call MVNFORUMBLOG_PRO.GetMVNFORUMBLOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumblog_Dao _obj = new mvnforumblog_Dao();
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setBlogownername(arr.getString("BLOGOWNERNAME"));
            _obj.setBlognickname(arr.getString("BLOGNICKNAME"));
            _obj.setBlogtitle(arr.getString("BLOGTITLE"));
            _obj.setBlogcontent(arr.getString("BLOGCONTENT"));
           try{_obj.setBlogcreationdate(dateformat.parse(arr.getString("BLOGCREATIONDATE")));}catch(Exception ce){_obj.setBlogcreationdate((new Date()));}
           try{_obj.setBlogmodifieddate(dateformat.parse(arr.getString("BLOGMODIFIEDDATE")));}catch(Exception ce){_obj.setBlogmodifieddate((new Date()));}
            _obj.setBlogstatus(arr.getInt("BLOGSTATUS"));
            _obj.setReviewcount(arr.getInt("REVIEWCOUNT"));
            _obj.setCoverfavoritecount(arr.getInt("COVERFAVORITECOUNT"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMBLOG返回 分页数据
* @param MVNFORUMBLOG row
* @returnMVNFORUMBLOGList对象
* @throws Exception 
*/
public List<mvnforumblog_Dao> get_mvnforumblog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumblog_Dao> _list = new ArrayList<mvnforumblog_Dao>();
		String sqlStr = "{ call MVNFORUMBLOG_PRO.GetMVNFORUMBLOGPage(?,?,?,?,?,?)}";
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
				mvnforumblog_Dao _obj = new mvnforumblog_Dao();
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setBlogownername(arr.getString("BLOGOWNERNAME"));
            _obj.setBlognickname(arr.getString("BLOGNICKNAME"));
            _obj.setBlogtitle(arr.getString("BLOGTITLE"));
            _obj.setBlogcontent(arr.getString("BLOGCONTENT"));
            try{_obj.setBlogcreationdate(dateformat.parse(arr.getString("BLOGCREATIONDATE")));}catch(Exception ce){_obj.setBlogcreationdate((new Date()));}
            try{_obj.setBlogmodifieddate(dateformat.parse(arr.getString("BLOGMODIFIEDDATE")));}catch(Exception ce){_obj.setBlogmodifieddate((new Date()));}
            _obj.setBlogstatus(arr.getInt("BLOGSTATUS"));
            _obj.setReviewcount(arr.getInt("REVIEWCOUNT"));
            _obj.setCoverfavoritecount(arr.getInt("COVERFAVORITECOUNT"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMBLOG返回的查询DataRow创建一个MVNFORUMBLOGEntity对象
* @param MVNFORUMBLOG row
* @returnMVNFORUMBLOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumblog_Dao> get_mvnforumblog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumblogstrWhere") == null) {
			Dictionary<Integer, mvnforumblog_Dao> _dic = new Hashtable<Integer, mvnforumblog_Dao>();
			List<mvnforumblog_Dao> _list = new ArrayList<mvnforumblog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getBlogid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumblog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumblog_Dao> _dic = (Dictionary<Integer, mvnforumblog_Dao>) classFactory
					.cacheGet("dicmvnforumblogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMBLOG字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumblog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMBLOG_PRO.UpdateFieldMVNFORUMBLOG(?,?)}";
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
* 更新MVNFORUMBLOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumblog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMBLOG_PRO.UpdateFieldMVNFORUMBLOGV(?,?,?)}";
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
* 更新MVNFORUMBLOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumblog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMBLOG_PRO.UpdateFieldMVNFORUMBLOGU(?,?,?)}";
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
