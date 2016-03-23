/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataPhoneareamap.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.phoneareamap_Dao;
import com.szty.aihao.core.phoneareamap_core;
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
*@PHONEAREAMAP数据接口
*@作者：宋春林 
*/
public class phoneareamap_impl implements phoneareamap_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(phoneareamap_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param PHONEAREAMAP实体
* @return 新插入记录的编号
*/
public int insert_phoneareamap(phoneareamap_Dao _PHONEAREAMAPModel)  throws Exception{
         String sqlStr = "{call PHONEAREAMAP_PRO.InsertPHONEAREAMAP(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_PHONEAREAMAPModel.getPrefix());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_PHONEAREAMAPModel.getMobile_type());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_PHONEAREAMAPModel.getArea_id());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_PHONEAREAMAPModel.getArea_name());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_PHONEAREAMAPModel.getProvince_id());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_PHONEAREAMAPModel.getProvince_name());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param PHONEAREAMAP
* @Object 
* @return 新插入记录的编号
*/
public int insert_phoneareamap(Object[] _para)  throws Exception{
      String sqlStr = "{call PHONEAREAMAP_PRO.InsertPHONEAREAMAP(?,?,?,?,?,?)}";
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
* @param PHONEAREAMAP实体
* @return 影响的行数
*/
public int update_phoneareamap(phoneareamap_Dao _PHONEAREAMAPModel)  throws Exception{
        String sqlStr = "{call PHONEAREAMAP_PRO.UpdatePHONEAREAMAP(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_PHONEAREAMAPModel.getPrefix());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_PHONEAREAMAPModel.getMobile_type());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_PHONEAREAMAPModel.getArea_id());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_PHONEAREAMAPModel.getArea_name());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_PHONEAREAMAPModel.getProvince_id());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_PHONEAREAMAPModel.getProvince_name());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表PHONEAREAMAP中的一条记录
* @param PHONEAREAMAP实体
* @return 新插入记录的编号
*/
public int delete_phoneareamap(int Prefix)  throws Exception{
        String sqlStr = "{call PHONEAREAMAP_PRO.DeletePHONEAREAMAP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Prefix);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 phoneareamap 数据实体
* @param Prefix">Prefix
* @return<phoneareamap 数据实体
* @throws Exception 
*/
public phoneareamap_Dao get_phoneareamapDao(int Prefix) throws Exception{
         String sqlStr = "{ call PHONEAREAMAP_PRO.GetPHONEAREAMAPEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Prefix);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			phoneareamap_Dao _obj = new phoneareamap_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setMobile_type(arr.getInt("MOBILE_TYPE"));
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
			return _obj;
		}
		return null;

}

/**
* 根据PHONEAREAMAP返回的查询DataRow创建一个PHONEAREAMAPEntity对象
* @param PHONEAREAMAP row
* @returnPHONEAREAMAPList对象
* @throws Exception 
*/
public List<phoneareamap_Dao> get_phoneareamap_All() throws Exception{
        List<phoneareamap_Dao> _list = new ArrayList<phoneareamap_Dao>();
		String sqlStr = "{ call PHONEAREAMAP_PRO.GetPHONEAREAMAP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			phoneareamap_Dao _obj = new phoneareamap_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setMobile_type(arr.getInt("MOBILE_TYPE"));
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据PHONEAREAMAP返回的查询DataRow创建一个PHONEAREAMAPEntity对象
* @param PHONEAREAMAP row
* @returnPHONEAREAMAPList对象
* @throws Exception 
*/
public List< phoneareamap_Dao> get_phoneareamap_All(String strWhere) throws Exception{
         List<phoneareamap_Dao> _list = new ArrayList<phoneareamap_Dao>();
		 String sqlStr = "{ call PHONEAREAMAP_PRO.GetPHONEAREAMAPWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				phoneareamap_Dao _obj = new phoneareamap_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setMobile_type(arr.getInt("MOBILE_TYPE"));
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据PHONEAREAMAP返回 分页数据
* @param PHONEAREAMAP row
* @returnPHONEAREAMAPList对象
* @throws Exception 
*/
public List<phoneareamap_Dao> get_phoneareamap_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<phoneareamap_Dao> _list = new ArrayList<phoneareamap_Dao>();
		String sqlStr = "{ call PHONEAREAMAP_PRO.GetPHONEAREAMAPPage(?,?,?,?,?,?)}";
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
				phoneareamap_Dao _obj = new phoneareamap_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setMobile_type(arr.getInt("MOBILE_TYPE"));
            _obj.setArea_id(arr.getString("AREA_ID"));
            _obj.setArea_name(arr.getString("AREA_NAME"));
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据PHONEAREAMAP返回的查询DataRow创建一个PHONEAREAMAPEntity对象
* @param PHONEAREAMAP row
* @returnPHONEAREAMAPDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, phoneareamap_Dao> get_phoneareamap_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicphoneareamapstrWhere") == null) {
			Dictionary<Integer, phoneareamap_Dao> _dic = new Hashtable<Integer, phoneareamap_Dao>();
			List<phoneareamap_Dao> _list = new ArrayList<phoneareamap_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getPrefix()), _list.get(i));
			}
			classFactory.cachePut("dicphoneareamap", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, phoneareamap_Dao> _dic = (Dictionary<Integer, phoneareamap_Dao>) classFactory
					.cacheGet("dicphoneareamapstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新PHONEAREAMAP字段加一
* @param FieldName
* @param sid
*/
public int create_phoneareamap_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call PHONEAREAMAP_PRO.UpdateFieldPHONEAREAMAP(?,?)}";
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
* 更新PHONEAREAMAPInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_phoneareamap_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call PHONEAREAMAP_PRO.UpdateFieldPHONEAREAMAPV(?,?,?)}";
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
* 更新PHONEAREAMAPIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_phoneareamap_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call PHONEAREAMAP_PRO.UpdateFieldPHONEAREAMAPU(?,?,?)}";
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
