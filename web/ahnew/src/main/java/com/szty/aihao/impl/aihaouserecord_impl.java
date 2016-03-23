/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaouserecord.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaouserecord_Dao;
import com.szty.aihao.core.aihaouserecord_core;
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
*@AIHAOUSERECORD数据接口
*@作者：宋春林 
*/
public class aihaouserecord_impl implements aihaouserecord_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaouserecord_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOUSERECORD实体
* @return 新插入记录的编号
*/
public int insert_aihaouserecord(aihaouserecord_Dao _AIHAOUSERECORDModel)  throws Exception{
         String sqlStr = "{call AIHAOUSERECORD_PRO.InsertAIHAOUSERECORD(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOUSERECORDModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.BIGINT,_AIHAOUSERECORDModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_AIHAOUSERECORDModel.getUsetype());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUSERECORDModel.getCreatetime()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOUSERECORDModel.getImsi());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOUSERECORD
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaouserecord(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOUSERECORD_PRO.InsertAIHAOUSERECORD(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.BIGINT,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOUSERECORD实体
* @return 影响的行数
*/
public int update_aihaouserecord(aihaouserecord_Dao _AIHAOUSERECORDModel)  throws Exception{
        String sqlStr = "{call AIHAOUSERECORD_PRO.UpdateAIHAOUSERECORD(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.BIGINT,_AIHAOUSERECORDModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.BIGINT,_AIHAOUSERECORDModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_AIHAOUSERECORDModel.getUsetype());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUSERECORDModel.getCreatetime()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOUSERECORDModel.getImsi());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOUSERECORD中的一条记录
* @param AIHAOUSERECORD实体
* @return 新插入记录的编号
*/
public int delete_aihaouserecord(int Id)  throws Exception{
        String sqlStr = "{call AIHAOUSERECORD_PRO.DeleteAIHAOUSERECORD(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaouserecord 数据实体
* @param Id">Id
* @return<aihaouserecord 数据实体
* @throws Exception 
*/
public aihaouserecord_Dao get_aihaouserecordDao(int Id) throws Exception{
         String sqlStr = "{ call AIHAOUSERECORD_PRO.GetAIHAOUSERECORDEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaouserecord_Dao _obj = new aihaouserecord_Dao();
            _obj.setUsetype(arr.getInt("USETYPE"));
             try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setImsi(arr.getString("IMSI"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOUSERECORD返回的查询DataRow创建一个AIHAOUSERECORDEntity对象
* @param AIHAOUSERECORD row
* @returnAIHAOUSERECORDList对象
* @throws Exception 
*/
public List<aihaouserecord_Dao> get_aihaouserecord_All() throws Exception{
        List<aihaouserecord_Dao> _list = new ArrayList<aihaouserecord_Dao>();
		String sqlStr = "{ call AIHAOUSERECORD_PRO.GetAIHAOUSERECORD(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaouserecord_Dao _obj = new aihaouserecord_Dao();
            _obj.setUsetype(arr.getInt("USETYPE"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setImsi(arr.getString("IMSI"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOUSERECORD返回的查询DataRow创建一个AIHAOUSERECORDEntity对象
* @param AIHAOUSERECORD row
* @returnAIHAOUSERECORDList对象
* @throws Exception 
*/
public List< aihaouserecord_Dao> get_aihaouserecord_All(String strWhere) throws Exception{
         List<aihaouserecord_Dao> _list = new ArrayList<aihaouserecord_Dao>();
		 String sqlStr = "{ call AIHAOUSERECORD_PRO.GetAIHAOUSERECORDWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaouserecord_Dao _obj = new aihaouserecord_Dao();
            _obj.setUsetype(arr.getInt("USETYPE"));
           try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setImsi(arr.getString("IMSI"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOUSERECORD返回 分页数据
* @param AIHAOUSERECORD row
* @returnAIHAOUSERECORDList对象
* @throws Exception 
*/
public List<aihaouserecord_Dao> get_aihaouserecord_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaouserecord_Dao> _list = new ArrayList<aihaouserecord_Dao>();
		String sqlStr = "{ call AIHAOUSERECORD_PRO.GetAIHAOUSERECORDPage(?,?,?,?,?,?)}";
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
				aihaouserecord_Dao _obj = new aihaouserecord_Dao();
            _obj.setUsetype(arr.getInt("USETYPE"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setImsi(arr.getString("IMSI"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOUSERECORD返回的查询DataRow创建一个AIHAOUSERECORDEntity对象
* @param AIHAOUSERECORD row
* @returnAIHAOUSERECORDDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaouserecord_Dao> get_aihaouserecord_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaouserecordstrWhere") == null) {
			Dictionary<Integer, aihaouserecord_Dao> _dic = new Hashtable<Integer, aihaouserecord_Dao>();
			List<aihaouserecord_Dao> _list = new ArrayList<aihaouserecord_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((int)(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihaouserecord", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaouserecord_Dao> _dic = (Dictionary<Integer, aihaouserecord_Dao>) classFactory
					.cacheGet("dicaihaouserecordstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOUSERECORD字段加一
* @param FieldName
* @param sid
*/
public int create_aihaouserecord_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOUSERECORD_PRO.UpdateFieldAIHAOUSERECORD(?,?)}";
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
* 更新AIHAOUSERECORDInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaouserecord_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOUSERECORD_PRO.UpdateFieldAIHAOUSERECORDV(?,?,?)}";
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
* 更新AIHAOUSERECORDIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaouserecord_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOUSERECORD_PRO.UpdateFieldAIHAOUSERECORDU(?,?,?)}";
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
