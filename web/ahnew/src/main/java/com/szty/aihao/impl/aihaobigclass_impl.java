/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaobigclass.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaobigclass_Dao;
import com.szty.aihao.core.aihaobigclass_core;
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
*@AIHAOBIGCLASS数据接口
*@作者：宋春林 
*/
public class aihaobigclass_impl implements aihaobigclass_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaobigclass_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOBIGCLASS实体
* @return 新插入记录的编号
*/
public int insert_aihaobigclass(aihaobigclass_Dao _AIHAOBIGCLASSModel)  throws Exception{
         String sqlStr = "{call AIHAOBIGCLASS_PRO.InsertAIHAOBIGCLASS(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOBIGCLASSModel.getBigclassid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOBIGCLASSModel.getBigclassname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOBIGCLASSModel.getBigclasspic());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAOBIGCLASSModel.getBigclasspicsize());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAOBIGCLASSModel.getBigclassorder());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOBIGCLASSModel.getBigclasscdate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_AIHAOBIGCLASSModel.getStatus());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOBIGCLASSModel.getBigclassbigpic());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_AIHAOBIGCLASSModel.getBigclassbigpicsize());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOBIGCLASS
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaobigclass(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOBIGCLASS_PRO.InsertAIHAOBIGCLASS(?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[9];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_para[8]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOBIGCLASS实体
* @return 影响的行数
*/
public int update_aihaobigclass(aihaobigclass_Dao _AIHAOBIGCLASSModel)  throws Exception{
        String sqlStr = "{call AIHAOBIGCLASS_PRO.UpdateAIHAOBIGCLASS(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOBIGCLASSModel.getBigclassid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOBIGCLASSModel.getBigclassname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOBIGCLASSModel.getBigclasspic());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAOBIGCLASSModel.getBigclasspicsize());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAOBIGCLASSModel.getBigclassorder());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOBIGCLASSModel.getBigclasscdate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_AIHAOBIGCLASSModel.getStatus());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOBIGCLASSModel.getBigclassbigpic());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_AIHAOBIGCLASSModel.getBigclassbigpicsize());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOBIGCLASS中的一条记录
* @param AIHAOBIGCLASS实体
* @return 新插入记录的编号
*/
public int delete_aihaobigclass(int Bigclassid)  throws Exception{
        String sqlStr = "{call AIHAOBIGCLASS_PRO.DeleteAIHAOBIGCLASS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Bigclassid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaobigclass 数据实体
* @param Bigclassid">Bigclassid
* @return<aihaobigclass 数据实体
* @throws Exception 
*/
public aihaobigclass_Dao get_aihaobigclassDao(int Bigclassid) throws Exception{
         String sqlStr = "{ call AIHAOBIGCLASS_PRO.GetAIHAOBIGCLASSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Bigclassid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaobigclass_Dao _obj = new aihaobigclass_Dao();
            _obj.setBigclassid(arr.getInt("BIGCLASSID"));
            _obj.setBigclassname(arr.getString("BIGCLASSNAME"));
            _obj.setBigclasspic(arr.getString("BIGCLASSPIC"));
            _obj.setBigclasspicsize(arr.getInt("BIGCLASSPICSIZE"));
            _obj.setBigclassorder(arr.getInt("BIGCLASSORDER"));
             try{_obj.setBigclasscdate(dateformat.parse(arr.getString("BIGCLASSCDATE")));}catch(Exception ce){_obj.setBigclasscdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setBigclassbigpic(arr.getString("BIGCLASSBIGPIC"));
            _obj.setBigclassbigpicsize(arr.getInt("BIGCLASSBIGPICSIZE"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOBIGCLASS返回的查询DataRow创建一个AIHAOBIGCLASSEntity对象
* @param AIHAOBIGCLASS row
* @returnAIHAOBIGCLASSList对象
* @throws Exception 
*/
public List<aihaobigclass_Dao> get_aihaobigclass_All() throws Exception{
        List<aihaobigclass_Dao> _list = new ArrayList<aihaobigclass_Dao>();
		String sqlStr = "{ call AIHAOBIGCLASS_PRO.GetAIHAOBIGCLASS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaobigclass_Dao _obj = new aihaobigclass_Dao();
            _obj.setBigclassid(arr.getInt("BIGCLASSID"));
            _obj.setBigclassname(arr.getString("BIGCLASSNAME"));
            _obj.setBigclasspic(arr.getString("BIGCLASSPIC"));
            _obj.setBigclasspicsize(arr.getInt("BIGCLASSPICSIZE"));
            _obj.setBigclassorder(arr.getInt("BIGCLASSORDER"));
            try{_obj.setBigclasscdate(dateformat.parse(arr.getString("BIGCLASSCDATE")));}catch(Exception ce){_obj.setBigclasscdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setBigclassbigpic(arr.getString("BIGCLASSBIGPIC"));
            _obj.setBigclassbigpicsize(arr.getInt("BIGCLASSBIGPICSIZE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOBIGCLASS返回的查询DataRow创建一个AIHAOBIGCLASSEntity对象
* @param AIHAOBIGCLASS row
* @returnAIHAOBIGCLASSList对象
* @throws Exception 
*/
public List< aihaobigclass_Dao> get_aihaobigclass_All(String strWhere) throws Exception{
         List<aihaobigclass_Dao> _list = new ArrayList<aihaobigclass_Dao>();
		 String sqlStr = "{ call AIHAOBIGCLASS_PRO.GetAIHAOBIGCLASSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaobigclass_Dao _obj = new aihaobigclass_Dao();
            _obj.setBigclassid(arr.getInt("BIGCLASSID"));
            _obj.setBigclassname(arr.getString("BIGCLASSNAME"));
            _obj.setBigclasspic(arr.getString("BIGCLASSPIC"));
            _obj.setBigclasspicsize(arr.getInt("BIGCLASSPICSIZE"));
            _obj.setBigclassorder(arr.getInt("BIGCLASSORDER"));
           try{_obj.setBigclasscdate(dateformat.parse(arr.getString("BIGCLASSCDATE")));}catch(Exception ce){_obj.setBigclasscdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setBigclassbigpic(arr.getString("BIGCLASSBIGPIC"));
            _obj.setBigclassbigpicsize(arr.getInt("BIGCLASSBIGPICSIZE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOBIGCLASS返回 分页数据
* @param AIHAOBIGCLASS row
* @returnAIHAOBIGCLASSList对象
* @throws Exception 
*/
public List<aihaobigclass_Dao> get_aihaobigclass_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaobigclass_Dao> _list = new ArrayList<aihaobigclass_Dao>();
		String sqlStr = "{ call AIHAOBIGCLASS_PRO.GetAIHAOBIGCLASSPage(?,?,?,?,?,?)}";
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
				aihaobigclass_Dao _obj = new aihaobigclass_Dao();
            _obj.setBigclassid(arr.getInt("BIGCLASSID"));
            _obj.setBigclassname(arr.getString("BIGCLASSNAME"));
            _obj.setBigclasspic(arr.getString("BIGCLASSPIC"));
            _obj.setBigclasspicsize(arr.getInt("BIGCLASSPICSIZE"));
            _obj.setBigclassorder(arr.getInt("BIGCLASSORDER"));
            try{_obj.setBigclasscdate(dateformat.parse(arr.getString("BIGCLASSCDATE")));}catch(Exception ce){_obj.setBigclasscdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setBigclassbigpic(arr.getString("BIGCLASSBIGPIC"));
            _obj.setBigclassbigpicsize(arr.getInt("BIGCLASSBIGPICSIZE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOBIGCLASS返回的查询DataRow创建一个AIHAOBIGCLASSEntity对象
* @param AIHAOBIGCLASS row
* @returnAIHAOBIGCLASSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaobigclass_Dao> get_aihaobigclass_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaobigclassstrWhere") == null) {
			Dictionary<Integer, aihaobigclass_Dao> _dic = new Hashtable<Integer, aihaobigclass_Dao>();
			List<aihaobigclass_Dao> _list = new ArrayList<aihaobigclass_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getBigclassid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaobigclass", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaobigclass_Dao> _dic = (Dictionary<Integer, aihaobigclass_Dao>) classFactory
					.cacheGet("dicaihaobigclassstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOBIGCLASS字段加一
* @param FieldName
* @param sid
*/
public int create_aihaobigclass_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOBIGCLASS_PRO.UpdateFieldAIHAOBIGCLASS(?,?)}";
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
* 更新AIHAOBIGCLASSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaobigclass_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOBIGCLASS_PRO.UpdateFieldAIHAOBIGCLASSV(?,?,?)}";
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
* 更新AIHAOBIGCLASSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaobigclass_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOBIGCLASS_PRO.UpdateFieldAIHAOBIGCLASSU(?,?,?)}";
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
