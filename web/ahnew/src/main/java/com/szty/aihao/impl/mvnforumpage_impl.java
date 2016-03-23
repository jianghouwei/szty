/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumpage.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumpage_Dao;
import com.szty.aihao.core.mvnforumpage_core;
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
*@MVNFORUMPAGE数据接口
*@作者：宋春林 
*/
public class mvnforumpage_impl implements mvnforumpage_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumpage_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPAGE实体
* @return 新插入记录的编号
*/
public int insert_mvnforumpage(mvnforumpage_Dao _MVNFORUMPAGEModel)  throws Exception{
         String sqlStr = "{call MVNFORUMPAGE_PRO.InsertMVNFORUMPAGE(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMPAGEModel.getPageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEModel.getParentpageid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEModel.getBrowsecount());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPAGEModel.getPagecreationdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPAGEModel.getPagemodifieddate()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPAGEModel.getPageownername());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPAGEModel.getPagetitle());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEModel.getPagestatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPAGE
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumpage(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMPAGE_PRO.InsertMVNFORUMPAGE(?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[8];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMPAGE实体
* @return 影响的行数
*/
public int update_mvnforumpage(mvnforumpage_Dao _MVNFORUMPAGEModel)  throws Exception{
        String sqlStr = "{call MVNFORUMPAGE_PRO.UpdateMVNFORUMPAGE(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEModel.getPageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEModel.getParentpageid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEModel.getBrowsecount());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPAGEModel.getPagecreationdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPAGEModel.getPagemodifieddate()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPAGEModel.getPageownername());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPAGEModel.getPagetitle());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEModel.getPagestatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMPAGE中的一条记录
* @param MVNFORUMPAGE实体
* @return 新插入记录的编号
*/
public int delete_mvnforumpage(int Pageid)  throws Exception{
        String sqlStr = "{call MVNFORUMPAGE_PRO.DeleteMVNFORUMPAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Pageid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumpage 数据实体
* @param Pageid">Pageid
* @return<mvnforumpage 数据实体
* @throws Exception 
*/
public mvnforumpage_Dao get_mvnforumpageDao(int Pageid) throws Exception{
         String sqlStr = "{ call MVNFORUMPAGE_PRO.GetMVNFORUMPAGEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Pageid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumpage_Dao _obj = new mvnforumpage_Dao();
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setParentpageid(arr.getInt("PARENTPAGEID"));
            _obj.setBrowsecount(arr.getInt("BROWSECOUNT"));
             try{_obj.setPagecreationdate(dateformat.parse(arr.getString("PAGECREATIONDATE")));}catch(Exception ce){_obj.setPagecreationdate((new Date()));}
             try{_obj.setPagemodifieddate(dateformat.parse(arr.getString("PAGEMODIFIEDDATE")));}catch(Exception ce){_obj.setPagemodifieddate((new Date()));}
            _obj.setPageownername(arr.getString("PAGEOWNERNAME"));
            _obj.setPagetitle(arr.getString("PAGETITLE"));
            _obj.setPagestatus(arr.getInt("PAGESTATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMPAGE返回的查询DataRow创建一个MVNFORUMPAGEEntity对象
* @param MVNFORUMPAGE row
* @returnMVNFORUMPAGEList对象
* @throws Exception 
*/
public List<mvnforumpage_Dao> get_mvnforumpage_All() throws Exception{
        List<mvnforumpage_Dao> _list = new ArrayList<mvnforumpage_Dao>();
		String sqlStr = "{ call MVNFORUMPAGE_PRO.GetMVNFORUMPAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumpage_Dao _obj = new mvnforumpage_Dao();
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setParentpageid(arr.getInt("PARENTPAGEID"));
            _obj.setBrowsecount(arr.getInt("BROWSECOUNT"));
            try{_obj.setPagecreationdate(dateformat.parse(arr.getString("PAGECREATIONDATE")));}catch(Exception ce){_obj.setPagecreationdate((new Date()));}
            try{_obj.setPagemodifieddate(dateformat.parse(arr.getString("PAGEMODIFIEDDATE")));}catch(Exception ce){_obj.setPagemodifieddate((new Date()));}
            _obj.setPageownername(arr.getString("PAGEOWNERNAME"));
            _obj.setPagetitle(arr.getString("PAGETITLE"));
            _obj.setPagestatus(arr.getInt("PAGESTATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMPAGE返回的查询DataRow创建一个MVNFORUMPAGEEntity对象
* @param MVNFORUMPAGE row
* @returnMVNFORUMPAGEList对象
* @throws Exception 
*/
public List< mvnforumpage_Dao> get_mvnforumpage_All(String strWhere) throws Exception{
         List<mvnforumpage_Dao> _list = new ArrayList<mvnforumpage_Dao>();
		 String sqlStr = "{ call MVNFORUMPAGE_PRO.GetMVNFORUMPAGEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumpage_Dao _obj = new mvnforumpage_Dao();
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setParentpageid(arr.getInt("PARENTPAGEID"));
            _obj.setBrowsecount(arr.getInt("BROWSECOUNT"));
           try{_obj.setPagecreationdate(dateformat.parse(arr.getString("PAGECREATIONDATE")));}catch(Exception ce){_obj.setPagecreationdate((new Date()));}
           try{_obj.setPagemodifieddate(dateformat.parse(arr.getString("PAGEMODIFIEDDATE")));}catch(Exception ce){_obj.setPagemodifieddate((new Date()));}
            _obj.setPageownername(arr.getString("PAGEOWNERNAME"));
            _obj.setPagetitle(arr.getString("PAGETITLE"));
            _obj.setPagestatus(arr.getInt("PAGESTATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMPAGE返回 分页数据
* @param MVNFORUMPAGE row
* @returnMVNFORUMPAGEList对象
* @throws Exception 
*/
public List<mvnforumpage_Dao> get_mvnforumpage_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumpage_Dao> _list = new ArrayList<mvnforumpage_Dao>();
		String sqlStr = "{ call MVNFORUMPAGE_PRO.GetMVNFORUMPAGEPage(?,?,?,?,?,?)}";
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
				mvnforumpage_Dao _obj = new mvnforumpage_Dao();
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setParentpageid(arr.getInt("PARENTPAGEID"));
            _obj.setBrowsecount(arr.getInt("BROWSECOUNT"));
            try{_obj.setPagecreationdate(dateformat.parse(arr.getString("PAGECREATIONDATE")));}catch(Exception ce){_obj.setPagecreationdate((new Date()));}
            try{_obj.setPagemodifieddate(dateformat.parse(arr.getString("PAGEMODIFIEDDATE")));}catch(Exception ce){_obj.setPagemodifieddate((new Date()));}
            _obj.setPageownername(arr.getString("PAGEOWNERNAME"));
            _obj.setPagetitle(arr.getString("PAGETITLE"));
            _obj.setPagestatus(arr.getInt("PAGESTATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMPAGE返回的查询DataRow创建一个MVNFORUMPAGEEntity对象
* @param MVNFORUMPAGE row
* @returnMVNFORUMPAGEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumpage_Dao> get_mvnforumpage_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumpagestrWhere") == null) {
			Dictionary<Integer, mvnforumpage_Dao> _dic = new Hashtable<Integer, mvnforumpage_Dao>();
			List<mvnforumpage_Dao> _list = new ArrayList<mvnforumpage_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getPageid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumpage", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumpage_Dao> _dic = (Dictionary<Integer, mvnforumpage_Dao>) classFactory
					.cacheGet("dicmvnforumpagestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMPAGE字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumpage_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMPAGE_PRO.UpdateFieldMVNFORUMPAGE(?,?)}";
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
* 更新MVNFORUMPAGEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumpage_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMPAGE_PRO.UpdateFieldMVNFORUMPAGEV(?,?,?)}";
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
* 更新MVNFORUMPAGEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumpage_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMPAGE_PRO.UpdateFieldMVNFORUMPAGEU(?,?,?)}";
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
