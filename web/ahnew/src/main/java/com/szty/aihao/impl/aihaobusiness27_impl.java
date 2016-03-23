/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaobusiness27.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaobusiness27_Dao;
import com.szty.aihao.core.aihaobusiness27_core;
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
*@AIHAOBUSINESS27数据接口
*@作者：宋春林 
*/
public class aihaobusiness27_impl implements aihaobusiness27_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaobusiness27_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOBUSINESS27实体
* @return 新插入记录的编号
*/
public int insert_aihaobusiness27(aihaobusiness27_Dao _AIHAOBUSINESS27Model)  throws Exception{
         String sqlStr = "{call AIHAOBUSINESS27_PRO.InsertAIHAOBUSINESS27(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOBUSINESS27Model.getSname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getFbigclass());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getBigclass());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getTag());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getProvince());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getCity());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getArea());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getAddress());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS27Model.getLatitude());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS27Model.getLongitude());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getArea_code());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getTelephone());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getPhone());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS27Model.getId());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getProvincecode());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getCitycode());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS27Model.getGroupid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOBUSINESS27
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaobusiness27(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOBUSINESS27_PRO.InsertAIHAOBUSINESS27(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[17];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DOUBLE,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DOUBLE,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_para[16]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOBUSINESS27实体
* @return 影响的行数
*/
public int update_aihaobusiness27(aihaobusiness27_Dao _AIHAOBUSINESS27Model)  throws Exception{
        String sqlStr = "{call AIHAOBUSINESS27_PRO.UpdateAIHAOBUSINESS27(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getSname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getFbigclass());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getBigclass());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getTag());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getProvince());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getCity());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getArea());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getAddress());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS27Model.getLatitude());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS27Model.getLongitude());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getArea_code());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getTelephone());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getPhone());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS27Model.getId());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getProvincecode());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS27Model.getCitycode());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS27Model.getGroupid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOBUSINESS27中的一条记录
* @param AIHAOBUSINESS27实体
* @return 新插入记录的编号
*/
public int delete_aihaobusiness27(int Sname)  throws Exception{
        String sqlStr = "{call AIHAOBUSINESS27_PRO.DeleteAIHAOBUSINESS27(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Sname);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaobusiness27 数据实体
* @param Sname">Sname
* @return<aihaobusiness27 数据实体
* @throws Exception 
*/
public aihaobusiness27_Dao get_aihaobusiness27Dao(int Sname) throws Exception{
         String sqlStr = "{ call AIHAOBUSINESS27_PRO.GetAIHAOBUSINESS27Entity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Sname);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaobusiness27_Dao _obj = new aihaobusiness27_Dao();
            _obj.setSname(arr.getString("SNAME"));
            _obj.setFbigclass(arr.getString("FBIGCLASS"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setArea_code(arr.getString("AREA_CODE"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setId(arr.getInt("ID"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOBUSINESS27返回的查询DataRow创建一个AIHAOBUSINESS27Entity对象
* @param AIHAOBUSINESS27 row
* @returnAIHAOBUSINESS27List对象
* @throws Exception 
*/
public List<aihaobusiness27_Dao> get_aihaobusiness27_All() throws Exception{
        List<aihaobusiness27_Dao> _list = new ArrayList<aihaobusiness27_Dao>();
		String sqlStr = "{ call AIHAOBUSINESS27_PRO.GetAIHAOBUSINESS27(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaobusiness27_Dao _obj = new aihaobusiness27_Dao();
            _obj.setSname(arr.getString("SNAME"));
            _obj.setFbigclass(arr.getString("FBIGCLASS"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setArea_code(arr.getString("AREA_CODE"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setId(arr.getInt("ID"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOBUSINESS27返回的查询DataRow创建一个AIHAOBUSINESS27Entity对象
* @param AIHAOBUSINESS27 row
* @returnAIHAOBUSINESS27List对象
* @throws Exception 
*/
public List< aihaobusiness27_Dao> get_aihaobusiness27_All(String strWhere) throws Exception{
         List<aihaobusiness27_Dao> _list = new ArrayList<aihaobusiness27_Dao>();
		 String sqlStr = "{ call AIHAOBUSINESS27_PRO.GetAIHAOBUSINESS27Where(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaobusiness27_Dao _obj = new aihaobusiness27_Dao();
            _obj.setSname(arr.getString("SNAME"));
            _obj.setFbigclass(arr.getString("FBIGCLASS"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setArea_code(arr.getString("AREA_CODE"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setId(arr.getInt("ID"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOBUSINESS27返回 分页数据
* @param AIHAOBUSINESS27 row
* @returnAIHAOBUSINESS27List对象
* @throws Exception 
*/
public List<aihaobusiness27_Dao> get_aihaobusiness27_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaobusiness27_Dao> _list = new ArrayList<aihaobusiness27_Dao>();
		String sqlStr = "{ call AIHAOBUSINESS27_PRO.GetAIHAOBUSINESS27Page(?,?,?,?,?,?)}";
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
				aihaobusiness27_Dao _obj = new aihaobusiness27_Dao();
            _obj.setSname(arr.getString("SNAME"));
            _obj.setFbigclass(arr.getString("FBIGCLASS"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setArea_code(arr.getString("AREA_CODE"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setId(arr.getInt("ID"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOBUSINESS27返回的查询DataRow创建一个AIHAOBUSINESS27Entity对象
* @param AIHAOBUSINESS27 row
* @returnAIHAOBUSINESS27Dictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaobusiness27_Dao> get_aihaobusiness27_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaobusiness27strWhere") == null) {
			Dictionary<Integer, aihaobusiness27_Dao> _dic = new Hashtable<Integer, aihaobusiness27_Dao>();
			List<aihaobusiness27_Dao> _list = new ArrayList<aihaobusiness27_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getSname()), _list.get(i));
			}
			classFactory.cachePut("dicaihaobusiness27", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaobusiness27_Dao> _dic = (Dictionary<Integer, aihaobusiness27_Dao>) classFactory
					.cacheGet("dicaihaobusiness27strWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOBUSINESS27字段加一
* @param FieldName
* @param sid
*/
public int create_aihaobusiness27_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOBUSINESS27_PRO.UpdateFieldAIHAOBUSINESS27(?,?)}";
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
* 更新AIHAOBUSINESS27Int型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaobusiness27_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOBUSINESS27_PRO.UpdateFieldAIHAOBUSINESS27V(?,?,?)}";
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
* 更新AIHAOBUSINESS27IString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaobusiness27_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOBUSINESS27_PRO.UpdateFieldAIHAOBUSINESS27U(?,?,?)}";
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
