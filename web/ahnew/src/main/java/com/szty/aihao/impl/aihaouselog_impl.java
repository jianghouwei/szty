/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaouselog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaouselog_Dao;
import com.szty.aihao.core.aihaouselog_core;
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
*@AIHAOUSELOG数据接口
*@作者：宋春林 
*/
public class aihaouselog_impl implements aihaouselog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaouselog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOUSELOG实体
* @return 新插入记录的编号
*/
public int insert_aihaouselog(aihaouselog_Dao _AIHAOUSELOGModel)  throws Exception{
         String sqlStr = "{call AIHAOUSELOG_PRO.InsertAIHAOUSELOG(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[15];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getPlatform());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getProductcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getChannel());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getVersion());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getMobile());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getOs());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getBrand());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getModel());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getProvincecode());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getCitycode());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUSELOGModel.getCdate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getCode());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getCnt());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOUSELOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaouselog(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOUSELOG_PRO.InsertAIHAOUSELOG(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[15];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_para[12]));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_para[14]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOUSELOG实体
* @return 影响的行数
*/
public int update_aihaouselog(aihaouselog_Dao _AIHAOUSELOGModel)  throws Exception{
        String sqlStr = "{call AIHAOUSELOG_PRO.UpdateAIHAOUSELOG(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[15];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getPlatform());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getProductcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getChannel());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getVersion());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getMobile());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getOs());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getBrand());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOUSELOGModel.getModel());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getProvincecode());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getCitycode());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUSELOGModel.getCdate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getCode());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_AIHAOUSELOGModel.getCnt());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOUSELOG中的一条记录
* @param AIHAOUSELOG实体
* @return 新插入记录的编号
*/
public int delete_aihaouselog(int Id)  throws Exception{
        String sqlStr = "{call AIHAOUSELOG_PRO.DeleteAIHAOUSELOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaouselog 数据实体
* @param Id">Id
* @return<aihaouselog 数据实体
* @throws Exception 
*/
public aihaouselog_Dao get_aihaouselogDao(int Id) throws Exception{
         String sqlStr = "{ call AIHAOUSELOG_PRO.GetAIHAOUSELOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaouselog_Dao _obj = new aihaouselog_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setPlatform(arr.getInt("PLATFORM"));
            _obj.setProductcode(arr.getInt("PRODUCTCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setBrand(arr.getString("BRAND"));
            _obj.setModel(arr.getString("MODEL"));
            _obj.setProvincecode(arr.getInt("PROVINCECODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setCode(arr.getInt("CODE"));
            _obj.setCnt(arr.getInt("CNT"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOUSELOG返回的查询DataRow创建一个AIHAOUSELOGEntity对象
* @param AIHAOUSELOG row
* @returnAIHAOUSELOGList对象
* @throws Exception 
*/
public List<aihaouselog_Dao> get_aihaouselog_All() throws Exception{
        List<aihaouselog_Dao> _list = new ArrayList<aihaouselog_Dao>();
		String sqlStr = "{ call AIHAOUSELOG_PRO.GetAIHAOUSELOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaouselog_Dao _obj = new aihaouselog_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setPlatform(arr.getInt("PLATFORM"));
            _obj.setProductcode(arr.getInt("PRODUCTCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setBrand(arr.getString("BRAND"));
            _obj.setModel(arr.getString("MODEL"));
            _obj.setProvincecode(arr.getInt("PROVINCECODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setCode(arr.getInt("CODE"));
            _obj.setCnt(arr.getInt("CNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOUSELOG返回的查询DataRow创建一个AIHAOUSELOGEntity对象
* @param AIHAOUSELOG row
* @returnAIHAOUSELOGList对象
* @throws Exception 
*/
public List< aihaouselog_Dao> get_aihaouselog_All(String strWhere) throws Exception{
         List<aihaouselog_Dao> _list = new ArrayList<aihaouselog_Dao>();
		 String sqlStr = "{ call AIHAOUSELOG_PRO.GetAIHAOUSELOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaouselog_Dao _obj = new aihaouselog_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setPlatform(arr.getInt("PLATFORM"));
            _obj.setProductcode(arr.getInt("PRODUCTCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setBrand(arr.getString("BRAND"));
            _obj.setModel(arr.getString("MODEL"));
            _obj.setProvincecode(arr.getInt("PROVINCECODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setCode(arr.getInt("CODE"));
            _obj.setCnt(arr.getInt("CNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOUSELOG返回 分页数据
* @param AIHAOUSELOG row
* @returnAIHAOUSELOGList对象
* @throws Exception 
*/
public List<aihaouselog_Dao> get_aihaouselog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaouselog_Dao> _list = new ArrayList<aihaouselog_Dao>();
		String sqlStr = "{ call AIHAOUSELOG_PRO.GetAIHAOUSELOGPage(?,?,?,?,?,?)}";
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
				aihaouselog_Dao _obj = new aihaouselog_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setPlatform(arr.getInt("PLATFORM"));
            _obj.setProductcode(arr.getInt("PRODUCTCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setBrand(arr.getString("BRAND"));
            _obj.setModel(arr.getString("MODEL"));
            _obj.setProvincecode(arr.getInt("PROVINCECODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setCode(arr.getInt("CODE"));
            _obj.setCnt(arr.getInt("CNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOUSELOG返回的查询DataRow创建一个AIHAOUSELOGEntity对象
* @param AIHAOUSELOG row
* @returnAIHAOUSELOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaouselog_Dao> get_aihaouselog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaouselogstrWhere") == null) {
			Dictionary<Integer, aihaouselog_Dao> _dic = new Hashtable<Integer, aihaouselog_Dao>();
			List<aihaouselog_Dao> _list = new ArrayList<aihaouselog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihaouselog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaouselog_Dao> _dic = (Dictionary<Integer, aihaouselog_Dao>) classFactory
					.cacheGet("dicaihaouselogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOUSELOG字段加一
* @param FieldName
* @param sid
*/
public int create_aihaouselog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOUSELOG_PRO.UpdateFieldAIHAOUSELOG(?,?)}";
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
* 更新AIHAOUSELOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaouselog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOUSELOG_PRO.UpdateFieldAIHAOUSELOGV(?,?,?)}";
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
* 更新AIHAOUSELOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaouselog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOUSELOG_PRO.UpdateFieldAIHAOUSELOGU(?,?,?)}";
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
