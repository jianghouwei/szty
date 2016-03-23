/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaosonclass.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaosonclass_Dao;
import com.szty.aihao.core.aihaosonclass_core;
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
*@AIHAOSONCLASS数据接口
*@作者：宋春林 
*/
public class aihaosonclass_impl implements aihaosonclass_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaosonclass_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOSONCLASS实体
* @return 新插入记录的编号
*/
public int insert_aihaosonclass(aihaosonclass_Dao _AIHAOSONCLASSModel)  throws Exception{
         String sqlStr = "{call AIHAOSONCLASS_PRO.InsertAIHAOSONCLASS(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOSONCLASSModel.getSonclassid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_AIHAOSONCLASSModel.getBigclassid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOSONCLASSModel.getSonclassname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOSONCLASSModel.getSonclasspic());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAOSONCLASSModel.getSonclasspicsize());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOSONCLASS
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaosonclass(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOSONCLASS_PRO.InsertAIHAOSONCLASS(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOSONCLASS实体
* @return 影响的行数
*/
public int update_aihaosonclass(aihaosonclass_Dao _AIHAOSONCLASSModel)  throws Exception{
        String sqlStr = "{call AIHAOSONCLASS_PRO.UpdateAIHAOSONCLASS(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOSONCLASSModel.getSonclassid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_AIHAOSONCLASSModel.getBigclassid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOSONCLASSModel.getSonclassname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOSONCLASSModel.getSonclasspic());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAOSONCLASSModel.getSonclasspicsize());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOSONCLASS中的一条记录
* @param AIHAOSONCLASS实体
* @return 新插入记录的编号
*/
public int delete_aihaosonclass(int Sonclassid)  throws Exception{
        String sqlStr = "{call AIHAOSONCLASS_PRO.DeleteAIHAOSONCLASS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Sonclassid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaosonclass 数据实体
* @param Sonclassid">Sonclassid
* @return<aihaosonclass 数据实体
* @throws Exception 
*/
public aihaosonclass_Dao get_aihaosonclassDao(int Sonclassid) throws Exception{
         String sqlStr = "{ call AIHAOSONCLASS_PRO.GetAIHAOSONCLASSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Sonclassid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaosonclass_Dao _obj = new aihaosonclass_Dao();
            _obj.setSonclassid(arr.getInt("SONCLASSID"));
            _obj.setBigclassid(arr.getInt("BIGCLASSID"));
            _obj.setSonclassname(arr.getString("SONCLASSNAME"));
            _obj.setSonclasspic(arr.getString("SONCLASSPIC"));
            _obj.setSonclasspicsize(arr.getInt("SONCLASSPICSIZE"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOSONCLASS返回的查询DataRow创建一个AIHAOSONCLASSEntity对象
* @param AIHAOSONCLASS row
* @returnAIHAOSONCLASSList对象
* @throws Exception 
*/
public List<aihaosonclass_Dao> get_aihaosonclass_All() throws Exception{
        List<aihaosonclass_Dao> _list = new ArrayList<aihaosonclass_Dao>();
		String sqlStr = "{ call AIHAOSONCLASS_PRO.GetAIHAOSONCLASS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaosonclass_Dao _obj = new aihaosonclass_Dao();
            _obj.setSonclassid(arr.getInt("SONCLASSID"));
            _obj.setBigclassid(arr.getInt("BIGCLASSID"));
            _obj.setSonclassname(arr.getString("SONCLASSNAME"));
            _obj.setSonclasspic(arr.getString("SONCLASSPIC"));
            _obj.setSonclasspicsize(arr.getInt("SONCLASSPICSIZE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOSONCLASS返回的查询DataRow创建一个AIHAOSONCLASSEntity对象
* @param AIHAOSONCLASS row
* @returnAIHAOSONCLASSList对象
* @throws Exception 
*/
public List< aihaosonclass_Dao> get_aihaosonclass_All(String strWhere) throws Exception{
         List<aihaosonclass_Dao> _list = new ArrayList<aihaosonclass_Dao>();
		 String sqlStr = "{ call AIHAOSONCLASS_PRO.GetAIHAOSONCLASSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaosonclass_Dao _obj = new aihaosonclass_Dao();
            _obj.setSonclassid(arr.getInt("SONCLASSID"));
            _obj.setBigclassid(arr.getInt("BIGCLASSID"));
            _obj.setSonclassname(arr.getString("SONCLASSNAME"));
            _obj.setSonclasspic(arr.getString("SONCLASSPIC"));
            _obj.setSonclasspicsize(arr.getInt("SONCLASSPICSIZE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOSONCLASS返回 分页数据
* @param AIHAOSONCLASS row
* @returnAIHAOSONCLASSList对象
* @throws Exception 
*/
public List<aihaosonclass_Dao> get_aihaosonclass_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaosonclass_Dao> _list = new ArrayList<aihaosonclass_Dao>();
		String sqlStr = "{ call AIHAOSONCLASS_PRO.GetAIHAOSONCLASSPage(?,?,?,?,?,?)}";
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
				aihaosonclass_Dao _obj = new aihaosonclass_Dao();
            _obj.setSonclassid(arr.getInt("SONCLASSID"));
            _obj.setBigclassid(arr.getInt("BIGCLASSID"));
            _obj.setSonclassname(arr.getString("SONCLASSNAME"));
            _obj.setSonclasspic(arr.getString("SONCLASSPIC"));
            _obj.setSonclasspicsize(arr.getInt("SONCLASSPICSIZE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOSONCLASS返回的查询DataRow创建一个AIHAOSONCLASSEntity对象
* @param AIHAOSONCLASS row
* @returnAIHAOSONCLASSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaosonclass_Dao> get_aihaosonclass_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaosonclassstrWhere") == null) {
			Dictionary<Integer, aihaosonclass_Dao> _dic = new Hashtable<Integer, aihaosonclass_Dao>();
			List<aihaosonclass_Dao> _list = new ArrayList<aihaosonclass_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getSonclassid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaosonclass", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaosonclass_Dao> _dic = (Dictionary<Integer, aihaosonclass_Dao>) classFactory
					.cacheGet("dicaihaosonclassstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOSONCLASS字段加一
* @param FieldName
* @param sid
*/
public int create_aihaosonclass_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOSONCLASS_PRO.UpdateFieldAIHAOSONCLASS(?,?)}";
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
* 更新AIHAOSONCLASSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaosonclass_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOSONCLASS_PRO.UpdateFieldAIHAOSONCLASSV(?,?,?)}";
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
* 更新AIHAOSONCLASSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaosonclass_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOSONCLASS_PRO.UpdateFieldAIHAOSONCLASSU(?,?,?)}";
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
