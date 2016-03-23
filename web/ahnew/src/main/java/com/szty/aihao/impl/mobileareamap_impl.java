/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMobileareamap.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mobileareamap_Dao;
import com.szty.aihao.core.mobileareamap_core;
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
*@MOBILEAREAMAP数据接口
*@作者：宋春林 
*/
public class mobileareamap_impl implements mobileareamap_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mobileareamap_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MOBILEAREAMAP实体
* @return 新插入记录的编号
*/
public int insert_mobileareamap(mobileareamap_Dao _MOBILEAREAMAPModel)  throws Exception{
         String sqlStr = "{call MOBILEAREAMAP_PRO.InsertMOBILEAREAMAP(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MOBILEAREAMAPModel.getArea_id());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAPModel.getArea_name());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MOBILEAREAMAP
* @Object 
* @return 新插入记录的编号
*/
public int insert_mobileareamap(Object[] _para)  throws Exception{
      String sqlStr = "{call MOBILEAREAMAP_PRO.InsertMOBILEAREAMAP(?,?)}";
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
* @param MOBILEAREAMAP实体
* @return 影响的行数
*/
public int update_mobileareamap(mobileareamap_Dao _MOBILEAREAMAPModel)  throws Exception{
        String sqlStr = "{call MOBILEAREAMAP_PRO.UpdateMOBILEAREAMAP(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAPModel.getArea_id());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MOBILEAREAMAPModel.getArea_name());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MOBILEAREAMAP中的一条记录
* @param MOBILEAREAMAP实体
* @return 新插入记录的编号
*/
public int delete_mobileareamap(int Area_id)  throws Exception{
        String sqlStr = "{call MOBILEAREAMAP_PRO.DeleteMOBILEAREAMAP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Area_id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mobileareamap 数据实体
* @param Area_id">Area_id
* @return<mobileareamap 数据实体
* @throws Exception 
*/
public mobileareamap_Dao get_mobileareamapDao(int Area_id) throws Exception{
         String sqlStr = "{ call MOBILEAREAMAP_PRO.GetMOBILEAREAMAPEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Area_id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mobileareamap_Dao _obj = new mobileareamap_Dao();
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
			return _obj;
		}
		return null;

}

/**
* 根据MOBILEAREAMAP返回的查询DataRow创建一个MOBILEAREAMAPEntity对象
* @param MOBILEAREAMAP row
* @returnMOBILEAREAMAPList对象
* @throws Exception 
*/
public List<mobileareamap_Dao> get_mobileareamap_All() throws Exception{
        List<mobileareamap_Dao> _list = new ArrayList<mobileareamap_Dao>();
		String sqlStr = "{ call MOBILEAREAMAP_PRO.GetMOBILEAREAMAP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mobileareamap_Dao _obj = new mobileareamap_Dao();
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MOBILEAREAMAP返回的查询DataRow创建一个MOBILEAREAMAPEntity对象
* @param MOBILEAREAMAP row
* @returnMOBILEAREAMAPList对象
* @throws Exception 
*/
public List< mobileareamap_Dao> get_mobileareamap_All(String strWhere) throws Exception{
         List<mobileareamap_Dao> _list = new ArrayList<mobileareamap_Dao>();
		 String sqlStr = "{ call MOBILEAREAMAP_PRO.GetMOBILEAREAMAPWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mobileareamap_Dao _obj = new mobileareamap_Dao();
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MOBILEAREAMAP返回 分页数据
* @param MOBILEAREAMAP row
* @returnMOBILEAREAMAPList对象
* @throws Exception 
*/
public List<mobileareamap_Dao> get_mobileareamap_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mobileareamap_Dao> _list = new ArrayList<mobileareamap_Dao>();
		String sqlStr = "{ call MOBILEAREAMAP_PRO.GetMOBILEAREAMAPPage(?,?,?,?,?,?)}";
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
				mobileareamap_Dao _obj = new mobileareamap_Dao();
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MOBILEAREAMAP返回的查询DataRow创建一个MOBILEAREAMAPEntity对象
* @param MOBILEAREAMAP row
* @returnMOBILEAREAMAPDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mobileareamap_Dao> get_mobileareamap_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmobileareamapstrWhere") == null) {
			Dictionary<Integer, mobileareamap_Dao> _dic = new Hashtable<Integer, mobileareamap_Dao>();
			List<mobileareamap_Dao> _list = new ArrayList<mobileareamap_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getArea_id()), _list.get(i));
			}
			classFactory.cachePut("dicmobileareamap", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mobileareamap_Dao> _dic = (Dictionary<Integer, mobileareamap_Dao>) classFactory
					.cacheGet("dicmobileareamapstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MOBILEAREAMAP字段加一
* @param FieldName
* @param sid
*/
public int create_mobileareamap_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MOBILEAREAMAP_PRO.UpdateFieldMOBILEAREAMAP(?,?)}";
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
* 更新MOBILEAREAMAPInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mobileareamap_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MOBILEAREAMAP_PRO.UpdateFieldMOBILEAREAMAPV(?,?,?)}";
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
* 更新MOBILEAREAMAPIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mobileareamap_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MOBILEAREAMAP_PRO.UpdateFieldMOBILEAREAMAPU(?,?,?)}";
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
