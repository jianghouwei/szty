/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataProvinces.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.provinces_Dao;
import com.szty.aihao.core.provinces_core;
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
*@PROVINCES数据接口
*@作者：宋春林 
*/
public class provinces_impl implements provinces_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(provinces_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param PROVINCES实体
* @return 新插入记录的编号
*/
public int insert_provinces(provinces_Dao _PROVINCESModel)  throws Exception{
         String sqlStr = "{call PROVINCES_PRO.InsertPROVINCES(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_PROVINCESModel.getProname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_PROVINCESModel.getProcode());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param PROVINCES
* @Object 
* @return 新插入记录的编号
*/
public int insert_provinces(Object[] _para)  throws Exception{
      String sqlStr = "{call PROVINCES_PRO.InsertPROVINCES(?,?)}";
	  OracleParameter[] op = new OracleParameter[2];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param PROVINCES实体
* @return 影响的行数
*/
public int update_provinces(provinces_Dao _PROVINCESModel)  throws Exception{
        String sqlStr = "{call PROVINCES_PRO.UpdatePROVINCES(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_PROVINCESModel.getProname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_PROVINCESModel.getProcode());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表PROVINCES中的一条记录
* @param PROVINCES实体
* @return 新插入记录的编号
*/
public int delete_provinces(int Proname)  throws Exception{
        String sqlStr = "{call PROVINCES_PRO.DeletePROVINCES(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Proname);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 provinces 数据实体
* @param Proname">Proname
* @return<provinces 数据实体
* @throws Exception 
*/
public provinces_Dao get_provincesDao(int Proname) throws Exception{
         String sqlStr = "{ call PROVINCES_PRO.GetPROVINCESEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Proname);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			provinces_Dao _obj = new provinces_Dao();
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
			return _obj;
		}
		return null;

}

/**
* 根据PROVINCES返回的查询DataRow创建一个PROVINCESEntity对象
* @param PROVINCES row
* @returnPROVINCESList对象
* @throws Exception 
*/
public List<provinces_Dao> get_provinces_All() throws Exception{
        List<provinces_Dao> _list = new ArrayList<provinces_Dao>();
		String sqlStr = "{ call PROVINCES_PRO.GetPROVINCES(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			provinces_Dao _obj = new provinces_Dao();
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据PROVINCES返回的查询DataRow创建一个PROVINCESEntity对象
* @param PROVINCES row
* @returnPROVINCESList对象
* @throws Exception 
*/
public List< provinces_Dao> get_provinces_All(String strWhere) throws Exception{
         List<provinces_Dao> _list = new ArrayList<provinces_Dao>();
		 String sqlStr = "{ call PROVINCES_PRO.GetPROVINCESWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				provinces_Dao _obj = new provinces_Dao();
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据PROVINCES返回 分页数据
* @param PROVINCES row
* @returnPROVINCESList对象
* @throws Exception 
*/
public List<provinces_Dao> get_provinces_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<provinces_Dao> _list = new ArrayList<provinces_Dao>();
		String sqlStr = "{ call PROVINCES_PRO.GetPROVINCESPage(?,?,?,?,?,?)}";
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
				provinces_Dao _obj = new provinces_Dao();
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据PROVINCES返回的查询DataRow创建一个PROVINCESEntity对象
* @param PROVINCES row
* @returnPROVINCESDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, provinces_Dao> get_provinces_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicprovincesstrWhere") == null) {
			Dictionary<Integer, provinces_Dao> _dic = new Hashtable<Integer, provinces_Dao>();
			List<provinces_Dao> _list = new ArrayList<provinces_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getProname()), _list.get(i));
			}
			classFactory.cachePut("dicprovinces", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, provinces_Dao> _dic = (Dictionary<Integer, provinces_Dao>) classFactory
					.cacheGet("dicprovincesstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新PROVINCES字段加一
* @param FieldName
* @param sid
*/
public int create_provinces_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call PROVINCES_PRO.UpdateFieldPROVINCES(?,?)}";
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
* 更新PROVINCESInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_provinces_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call PROVINCES_PRO.UpdateFieldPROVINCESV(?,?,?)}";
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
* 更新PROVINCESIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_provinces_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call PROVINCES_PRO.UpdateFieldPROVINCESU(?,?,?)}";
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
