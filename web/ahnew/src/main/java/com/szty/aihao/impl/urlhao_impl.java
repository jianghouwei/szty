/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataUrlhao.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.urlhao_Dao;
import com.szty.aihao.core.urlhao_core;
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
*@URLHAO数据接口
*@作者：宋春林 
*/
public class urlhao_impl implements urlhao_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(urlhao_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param URLHAO实体
* @return 新插入记录的编号
*/
public int insert_urlhao(urlhao_Dao _URLHAOModel)  throws Exception{
         String sqlStr = "{call URLHAO_PRO.InsertURLHAO(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_URLHAOModel.getHaoid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_URLHAOModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_URLHAOModel.getUrl());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_URLHAOModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param URLHAO
* @Object 
* @return 新插入记录的编号
*/
public int insert_urlhao(Object[] _para)  throws Exception{
      String sqlStr = "{call URLHAO_PRO.InsertURLHAO(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param URLHAO实体
* @return 影响的行数
*/
public int update_urlhao(urlhao_Dao _URLHAOModel)  throws Exception{
        String sqlStr = "{call URLHAO_PRO.UpdateURLHAO(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.BIGINT,_URLHAOModel.getHaoid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_URLHAOModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_URLHAOModel.getUrl());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_URLHAOModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表URLHAO中的一条记录
* @param URLHAO实体
* @return 新插入记录的编号
*/
public int delete_urlhao(int Haoid)  throws Exception{
        String sqlStr = "{call URLHAO_PRO.DeleteURLHAO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Haoid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 urlhao 数据实体
* @param Haoid">Haoid
* @return<urlhao 数据实体
* @throws Exception 
*/
public urlhao_Dao get_urlhaoDao(int Haoid) throws Exception{
         String sqlStr = "{ call URLHAO_PRO.GetURLHAOEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Haoid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			urlhao_Dao _obj = new urlhao_Dao();
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据URLHAO返回的查询DataRow创建一个URLHAOEntity对象
* @param URLHAO row
* @returnURLHAOList对象
* @throws Exception 
*/
public List<urlhao_Dao> get_urlhao_All() throws Exception{
        List<urlhao_Dao> _list = new ArrayList<urlhao_Dao>();
		String sqlStr = "{ call URLHAO_PRO.GetURLHAO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			urlhao_Dao _obj = new urlhao_Dao();
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据URLHAO返回的查询DataRow创建一个URLHAOEntity对象
* @param URLHAO row
* @returnURLHAOList对象
* @throws Exception 
*/
public List< urlhao_Dao> get_urlhao_All(String strWhere) throws Exception{
         List<urlhao_Dao> _list = new ArrayList<urlhao_Dao>();
		 String sqlStr = "{ call URLHAO_PRO.GetURLHAOWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				urlhao_Dao _obj = new urlhao_Dao();
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据URLHAO返回 分页数据
* @param URLHAO row
* @returnURLHAOList对象
* @throws Exception 
*/
public List<urlhao_Dao> get_urlhao_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<urlhao_Dao> _list = new ArrayList<urlhao_Dao>();
		String sqlStr = "{ call URLHAO_PRO.GetURLHAOPage(?,?,?,?,?,?)}";
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
				urlhao_Dao _obj = new urlhao_Dao();
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据URLHAO返回的查询DataRow创建一个URLHAOEntity对象
* @param URLHAO row
* @returnURLHAODictionary对象
* @throws Exception 
*/
public Dictionary<Integer, urlhao_Dao> get_urlhao_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicurlhaostrWhere") == null) {
			Dictionary<Integer, urlhao_Dao> _dic = new Hashtable<Integer, urlhao_Dao>();
			List<urlhao_Dao> _list = new ArrayList<urlhao_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((int)(_list.get(i).getHaoid()), _list.get(i));
			}
			classFactory.cachePut("dicurlhao", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, urlhao_Dao> _dic = (Dictionary<Integer, urlhao_Dao>) classFactory
					.cacheGet("dicurlhaostrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新URLHAO字段加一
* @param FieldName
* @param sid
*/
public int create_urlhao_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call URLHAO_PRO.UpdateFieldURLHAO(?,?)}";
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
* 更新URLHAOInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_urlhao_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call URLHAO_PRO.UpdateFieldURLHAOV(?,?,?)}";
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
* 更新URLHAOIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_urlhao_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call URLHAO_PRO.UpdateFieldURLHAOU(?,?,?)}";
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
