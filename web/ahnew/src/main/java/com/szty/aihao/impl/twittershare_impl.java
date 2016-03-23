/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTwittershare.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.twittershare_Dao;
import com.szty.aihao.core.twittershare_core;
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
*@TWITTERSHARE数据接口
*@作者：宋春林 
*/
public class twittershare_impl implements twittershare_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(twittershare_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TWITTERSHARE实体
* @return 新插入记录的编号
*/
public int insert_twittershare(twittershare_Dao _TWITTERSHAREModel)  throws Exception{
         String sqlStr = "{call TWITTERSHARE_PRO.InsertTWITTERSHARE(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TWITTERSHAREModel.getShareid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERSHAREModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_TWITTERSHAREModel.getTopicsid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERSHAREModel.getSharetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TWITTERSHARE
* @Object 
* @return 新插入记录的编号
*/
public int insert_twittershare(Object[] _para)  throws Exception{
      String sqlStr = "{call TWITTERSHARE_PRO.InsertTWITTERSHARE(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param TWITTERSHARE实体
* @return 影响的行数
*/
public int update_twittershare(twittershare_Dao _TWITTERSHAREModel)  throws Exception{
        String sqlStr = "{call TWITTERSHARE_PRO.UpdateTWITTERSHARE(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_TWITTERSHAREModel.getShareid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERSHAREModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_TWITTERSHAREModel.getTopicsid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERSHAREModel.getSharetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TWITTERSHARE中的一条记录
* @param TWITTERSHARE实体
* @return 新插入记录的编号
*/
public int delete_twittershare(int Shareid)  throws Exception{
        String sqlStr = "{call TWITTERSHARE_PRO.DeleteTWITTERSHARE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Shareid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 twittershare 数据实体
* @param Shareid">Shareid
* @return<twittershare 数据实体
* @throws Exception 
*/
public twittershare_Dao get_twittershareDao(int Shareid) throws Exception{
         String sqlStr = "{ call TWITTERSHARE_PRO.GetTWITTERSHAREEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Shareid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twittershare_Dao _obj = new twittershare_Dao();
            _obj.setShareid(arr.getInt("SHAREID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setTopicsid(arr.getInt("TOPICSID"));
             try{_obj.setSharetime(dateformat.parse(arr.getString("SHARETIME")));}catch(Exception ce){_obj.setSharetime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据TWITTERSHARE返回的查询DataRow创建一个TWITTERSHAREEntity对象
* @param TWITTERSHARE row
* @returnTWITTERSHAREList对象
* @throws Exception 
*/
public List<twittershare_Dao> get_twittershare_All() throws Exception{
        List<twittershare_Dao> _list = new ArrayList<twittershare_Dao>();
		String sqlStr = "{ call TWITTERSHARE_PRO.GetTWITTERSHARE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twittershare_Dao _obj = new twittershare_Dao();
            _obj.setShareid(arr.getInt("SHAREID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setTopicsid(arr.getInt("TOPICSID"));
            try{_obj.setSharetime(dateformat.parse(arr.getString("SHARETIME")));}catch(Exception ce){_obj.setSharetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TWITTERSHARE返回的查询DataRow创建一个TWITTERSHAREEntity对象
* @param TWITTERSHARE row
* @returnTWITTERSHAREList对象
* @throws Exception 
*/
public List< twittershare_Dao> get_twittershare_All(String strWhere) throws Exception{
         List<twittershare_Dao> _list = new ArrayList<twittershare_Dao>();
		 String sqlStr = "{ call TWITTERSHARE_PRO.GetTWITTERSHAREWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				twittershare_Dao _obj = new twittershare_Dao();
            _obj.setShareid(arr.getInt("SHAREID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setTopicsid(arr.getInt("TOPICSID"));
           try{_obj.setSharetime(dateformat.parse(arr.getString("SHARETIME")));}catch(Exception ce){_obj.setSharetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TWITTERSHARE返回 分页数据
* @param TWITTERSHARE row
* @returnTWITTERSHAREList对象
* @throws Exception 
*/
public List<twittershare_Dao> get_twittershare_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<twittershare_Dao> _list = new ArrayList<twittershare_Dao>();
		String sqlStr = "{ call TWITTERSHARE_PRO.GetTWITTERSHAREPage(?,?,?,?,?,?)}";
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
				twittershare_Dao _obj = new twittershare_Dao();
            _obj.setShareid(arr.getInt("SHAREID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setTopicsid(arr.getInt("TOPICSID"));
            try{_obj.setSharetime(dateformat.parse(arr.getString("SHARETIME")));}catch(Exception ce){_obj.setSharetime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TWITTERSHARE返回的查询DataRow创建一个TWITTERSHAREEntity对象
* @param TWITTERSHARE row
* @returnTWITTERSHAREDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, twittershare_Dao> get_twittershare_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictwittersharestrWhere") == null) {
			Dictionary<Integer, twittershare_Dao> _dic = new Hashtable<Integer, twittershare_Dao>();
			List<twittershare_Dao> _list = new ArrayList<twittershare_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getShareid()), _list.get(i));
			}
			classFactory.cachePut("dictwittershare", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, twittershare_Dao> _dic = (Dictionary<Integer, twittershare_Dao>) classFactory
					.cacheGet("dictwittersharestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TWITTERSHARE字段加一
* @param FieldName
* @param sid
*/
public int create_twittershare_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TWITTERSHARE_PRO.UpdateFieldTWITTERSHARE(?,?)}";
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
* 更新TWITTERSHAREInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_twittershare_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TWITTERSHARE_PRO.UpdateFieldTWITTERSHAREV(?,?,?)}";
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
* 更新TWITTERSHAREIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_twittershare_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TWITTERSHARE_PRO.UpdateFieldTWITTERSHAREU(?,?,?)}";
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
