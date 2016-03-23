/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSztypurview.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sztypurview_Dao;
import com.szty.aihao.core.sztypurview_core;
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
*@SZTYPURVIEW数据接口
*@作者：宋春林 
*/
public class sztypurview_impl implements sztypurview_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sztypurview_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTYPURVIEW实体
* @return 新插入记录的编号
*/
public int insert_sztypurview(sztypurview_Dao _SZTYPURVIEWModel)  throws Exception{
         String sqlStr = "{call SZTYPURVIEW_PRO.InsertSZTYPURVIEW(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTYPURVIEWModel.getPurid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SZTYPURVIEWModel.getPerantid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYPURVIEWModel.getName());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYPURVIEWModel.getUrl());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYPURVIEWModel.getSystype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYPURVIEWModel.getPtype());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTYPURVIEW
* @Object 
* @return 新插入记录的编号
*/
public int insert_sztypurview(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTYPURVIEW_PRO.InsertSZTYPURVIEW(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SZTYPURVIEW实体
* @return 影响的行数
*/
public int update_sztypurview(sztypurview_Dao _SZTYPURVIEWModel)  throws Exception{
        String sqlStr = "{call SZTYPURVIEW_PRO.UpdateSZTYPURVIEW(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_SZTYPURVIEWModel.getPurid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SZTYPURVIEWModel.getPerantid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYPURVIEWModel.getName());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYPURVIEWModel.getUrl());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYPURVIEWModel.getSystype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYPURVIEWModel.getPtype());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTYPURVIEW中的一条记录
* @param SZTYPURVIEW实体
* @return 新插入记录的编号
*/
public int delete_sztypurview(int Purid)  throws Exception{
        String sqlStr = "{call SZTYPURVIEW_PRO.DeleteSZTYPURVIEW(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Purid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 sztypurview 数据实体
* @param Purid">Purid
* @return<sztypurview 数据实体
* @throws Exception 
*/
public sztypurview_Dao get_sztypurviewDao(int Purid) throws Exception{
         String sqlStr = "{ call SZTYPURVIEW_PRO.GetSZTYPURVIEWEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Purid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztypurview_Dao _obj = new sztypurview_Dao();
            _obj.setPurid(arr.getInt("PURID"));
            _obj.setPerantid(arr.getInt("PERANTID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
			return _obj;
		}
		return null;

}

/**
* 根据SZTYPURVIEW返回的查询DataRow创建一个SZTYPURVIEWEntity对象
* @param SZTYPURVIEW row
* @returnSZTYPURVIEWList对象
* @throws Exception 
*/
public List<sztypurview_Dao> get_sztypurview_All() throws Exception{
        List<sztypurview_Dao> _list = new ArrayList<sztypurview_Dao>();
		String sqlStr = "{ call SZTYPURVIEW_PRO.GetSZTYPURVIEW(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztypurview_Dao _obj = new sztypurview_Dao();
            _obj.setPurid(arr.getInt("PURID"));
            _obj.setPerantid(arr.getInt("PERANTID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTYPURVIEW返回的查询DataRow创建一个SZTYPURVIEWEntity对象
* @param SZTYPURVIEW row
* @returnSZTYPURVIEWList对象
* @throws Exception 
*/
public List< sztypurview_Dao> get_sztypurview_All(String strWhere) throws Exception{
         List<sztypurview_Dao> _list = new ArrayList<sztypurview_Dao>();
		 String sqlStr = "{ call SZTYPURVIEW_PRO.GetSZTYPURVIEWWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sztypurview_Dao _obj = new sztypurview_Dao();
            _obj.setPurid(arr.getInt("PURID"));
            _obj.setPerantid(arr.getInt("PERANTID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTYPURVIEW返回 分页数据
* @param SZTYPURVIEW row
* @returnSZTYPURVIEWList对象
* @throws Exception 
*/
public List<sztypurview_Dao> get_sztypurview_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sztypurview_Dao> _list = new ArrayList<sztypurview_Dao>();
		String sqlStr = "{ call SZTYPURVIEW_PRO.GetSZTYPURVIEWPage(?,?,?,?,?,?)}";
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
				sztypurview_Dao _obj = new sztypurview_Dao();
            _obj.setPurid(arr.getInt("PURID"));
            _obj.setPerantid(arr.getInt("PERANTID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTYPURVIEW返回的查询DataRow创建一个SZTYPURVIEWEntity对象
* @param SZTYPURVIEW row
* @returnSZTYPURVIEWDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, sztypurview_Dao> get_sztypurview_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsztypurviewstrWhere") == null) {
			Dictionary<Integer, sztypurview_Dao> _dic = new Hashtable<Integer, sztypurview_Dao>();
			List<sztypurview_Dao> _list = new ArrayList<sztypurview_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getPurid()), _list.get(i));
			}
			classFactory.cachePut("dicsztypurview", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sztypurview_Dao> _dic = (Dictionary<Integer, sztypurview_Dao>) classFactory
					.cacheGet("dicsztypurviewstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTYPURVIEW字段加一
* @param FieldName
* @param sid
*/
public int create_sztypurview_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTYPURVIEW_PRO.UpdateFieldSZTYPURVIEW(?,?)}";
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
* 更新SZTYPURVIEWInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_sztypurview_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTYPURVIEW_PRO.UpdateFieldSZTYPURVIEWV(?,?,?)}";
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
* 更新SZTYPURVIEWIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_sztypurview_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTYPURVIEW_PRO.UpdateFieldSZTYPURVIEWU(?,?,?)}";
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
