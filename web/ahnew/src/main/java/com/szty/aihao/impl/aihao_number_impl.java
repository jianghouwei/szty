/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihao_number.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihao_number_Dao;
import com.szty.aihao.core.aihao_number_core;
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
*@AIHAO_NUMBER数据接口
*@作者：宋春林 
*/
public class aihao_number_impl implements aihao_number_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihao_number_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAO_NUMBER实体
* @return 新插入记录的编号
*/
public int insert_aihao_number(aihao_number_Dao _AIHAO_NUMBERModel)  throws Exception{
         String sqlStr = "{call AIHAO_NUMBER_PRO.InsertAIHAO_NUMBER(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[14];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAO_NUMBERModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBERModel.getProcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getProname());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBERModel.getCitycode());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getCityname());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getArea());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getAddress());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DOUBLE,_AIHAO_NUMBERModel.getLatitude());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DOUBLE,_AIHAO_NUMBERModel.getLongitude());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getPhone());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBERModel.getGroupid());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBERModel.getWeights());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getImgid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAO_NUMBER
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihao_number(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAO_NUMBER_PRO.InsertAIHAO_NUMBER(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[14];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DOUBLE,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DOUBLE,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAO_NUMBER实体
* @return 影响的行数
*/
public int update_aihao_number(aihao_number_Dao _AIHAO_NUMBERModel)  throws Exception{
        String sqlStr = "{call AIHAO_NUMBER_PRO.UpdateAIHAO_NUMBER(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[14];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBERModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBERModel.getProcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getProname());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBERModel.getCitycode());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getCityname());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getArea());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getAddress());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DOUBLE,_AIHAO_NUMBERModel.getLatitude());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DOUBLE,_AIHAO_NUMBERModel.getLongitude());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getPhone());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBERModel.getGroupid());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBERModel.getWeights());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBERModel.getImgid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAO_NUMBER中的一条记录
* @param AIHAO_NUMBER实体
* @return 新插入记录的编号
*/
public int delete_aihao_number(int Id)  throws Exception{
        String sqlStr = "{call AIHAO_NUMBER_PRO.DeleteAIHAO_NUMBER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihao_number 数据实体
* @param Id">Id
* @return<aihao_number 数据实体
* @throws Exception 
*/
public aihao_number_Dao get_aihao_numberDao(int Id) throws Exception{
         String sqlStr = "{ call AIHAO_NUMBER_PRO.GetAIHAO_NUMBEREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_number_Dao _obj = new aihao_number_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setWeights(arr.getInt("WEIGHTS"));
            _obj.setImgid(arr.getString("IMGID"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAO_NUMBER返回的查询DataRow创建一个AIHAO_NUMBEREntity对象
* @param AIHAO_NUMBER row
* @returnAIHAO_NUMBERList对象
* @throws Exception 
*/
public List<aihao_number_Dao> get_aihao_number_All() throws Exception{
        List<aihao_number_Dao> _list = new ArrayList<aihao_number_Dao>();
		String sqlStr = "{ call AIHAO_NUMBER_PRO.GetAIHAO_NUMBER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_number_Dao _obj = new aihao_number_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setWeights(arr.getInt("WEIGHTS"));
            _obj.setImgid(arr.getString("IMGID"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAO_NUMBER返回的查询DataRow创建一个AIHAO_NUMBEREntity对象
* @param AIHAO_NUMBER row
* @returnAIHAO_NUMBERList对象
* @throws Exception 
*/
public List< aihao_number_Dao> get_aihao_number_All(String strWhere) throws Exception{
         List<aihao_number_Dao> _list = new ArrayList<aihao_number_Dao>();
		 String sqlStr = "{ call AIHAO_NUMBER_PRO.GetAIHAO_NUMBERWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihao_number_Dao _obj = new aihao_number_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setWeights(arr.getInt("WEIGHTS"));
            _obj.setImgid(arr.getString("IMGID"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAO_NUMBER返回 分页数据
* @param AIHAO_NUMBER row
* @returnAIHAO_NUMBERList对象
* @throws Exception 
*/
public List<aihao_number_Dao> get_aihao_number_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihao_number_Dao> _list = new ArrayList<aihao_number_Dao>();
		String sqlStr = "{ call AIHAO_NUMBER_PRO.GetAIHAO_NUMBERPage(?,?,?,?,?,?)}";
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
				aihao_number_Dao _obj = new aihao_number_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setWeights(arr.getInt("WEIGHTS"));
            _obj.setImgid(arr.getString("IMGID"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAO_NUMBER返回的查询DataRow创建一个AIHAO_NUMBEREntity对象
* @param AIHAO_NUMBER row
* @returnAIHAO_NUMBERDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihao_number_Dao> get_aihao_number_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihao_numberstrWhere") == null) {
			Dictionary<Integer, aihao_number_Dao> _dic = new Hashtable<Integer, aihao_number_Dao>();
			List<aihao_number_Dao> _list = new ArrayList<aihao_number_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihao_number", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihao_number_Dao> _dic = (Dictionary<Integer, aihao_number_Dao>) classFactory
					.cacheGet("dicaihao_numberstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAO_NUMBER字段加一
* @param FieldName
* @param sid
*/
public int create_aihao_number_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAO_NUMBER_PRO.UpdateFieldAIHAO_NUMBER(?,?)}";
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
* 更新AIHAO_NUMBERInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihao_number_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAO_NUMBER_PRO.UpdateFieldAIHAO_NUMBERV(?,?,?)}";
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
* 更新AIHAO_NUMBERIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihao_number_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAO_NUMBER_PRO.UpdateFieldAIHAO_NUMBERU(?,?,?)}";
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
