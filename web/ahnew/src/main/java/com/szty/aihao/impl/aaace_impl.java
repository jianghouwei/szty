/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAaace.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aaace_Dao;
import com.szty.aihao.core.aaace_core;
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
*@AAACE数据接口
*@作者：宋春林 
*/
public class aaace_impl implements aaace_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aaace_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AAACE实体
* @return 新插入记录的编号
*/
public int insert_aaace(aaace_Dao _AAACEModel)  throws Exception{
         String sqlStr = "{call AAACE_PRO.InsertAAACE(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AAACEModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AAACEModel.getXxx());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AAACE
* @Object 
* @return 新插入记录的编号
*/
public int insert_aaace(Object[] _para)  throws Exception{
      String sqlStr = "{call AAACE_PRO.InsertAAACE(?,?)}";
	  OracleParameter[] op = new OracleParameter[2];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AAACE实体
* @return 影响的行数
*/
public int update_aaace(aaace_Dao _AAACEModel)  throws Exception{
        String sqlStr = "{call AAACE_PRO.UpdateAAACE(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_AAACEModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AAACEModel.getXxx());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AAACE中的一条记录
* @param AAACE实体
* @return 新插入记录的编号
*/
public int delete_aaace(int Id)  throws Exception{
        String sqlStr = "{call AAACE_PRO.DeleteAAACE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aaace 数据实体
* @param Id">Id
* @return<aaace 数据实体
* @throws Exception 
*/
public aaace_Dao get_aaaceDao(int Id) throws Exception{
         String sqlStr = "{ call AAACE_PRO.GetAAACEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aaace_Dao _obj = new aaace_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setXxx(arr.getString("XXX"));
			return _obj;
		}
		return null;

}

/**
* 根据AAACE返回的查询DataRow创建一个AAACEEntity对象
* @param AAACE row
* @returnAAACEList对象
* @throws Exception 
*/
public List<aaace_Dao> get_aaace_All() throws Exception{
        List<aaace_Dao> _list = new ArrayList<aaace_Dao>();
		String sqlStr = "{ call AAACE_PRO.GetAAACE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aaace_Dao _obj = new aaace_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setXxx(arr.getString("XXX"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AAACE返回的查询DataRow创建一个AAACEEntity对象
* @param AAACE row
* @returnAAACEList对象
* @throws Exception 
*/
public List< aaace_Dao> get_aaace_All(String strWhere) throws Exception{
         List<aaace_Dao> _list = new ArrayList<aaace_Dao>();
		 String sqlStr = "{ call AAACE_PRO.GetAAACEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aaace_Dao _obj = new aaace_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setXxx(arr.getString("XXX"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AAACE返回 分页数据
* @param AAACE row
* @returnAAACEList对象
* @throws Exception 
*/
public List<aaace_Dao> get_aaace_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aaace_Dao> _list = new ArrayList<aaace_Dao>();
		String sqlStr = "{ call AAACE_PRO.GetAAACEPage(?,?,?,?,?,?)}";
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
				aaace_Dao _obj = new aaace_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setXxx(arr.getString("XXX"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AAACE返回的查询DataRow创建一个AAACEEntity对象
* @param AAACE row
* @returnAAACEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aaace_Dao> get_aaace_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaaacestrWhere") == null) {
			Dictionary<Integer, aaace_Dao> _dic = new Hashtable<Integer, aaace_Dao>();
			List<aaace_Dao> _list = new ArrayList<aaace_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaaace", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aaace_Dao> _dic = (Dictionary<Integer, aaace_Dao>) classFactory
					.cacheGet("dicaaacestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AAACE字段加一
* @param FieldName
* @param sid
*/
public int create_aaace_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AAACE_PRO.UpdateFieldAAACE(?,?)}";
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
* 更新AAACEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aaace_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AAACE_PRO.UpdateFieldAAACEV(?,?,?)}";
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
* 更新AAACEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aaace_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AAACE_PRO.UpdateFieldAAACEU(?,?,?)}";
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
