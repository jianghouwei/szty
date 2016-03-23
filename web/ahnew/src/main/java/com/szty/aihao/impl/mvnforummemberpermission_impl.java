/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforummemberpermission.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforummemberpermission_Dao;
import com.szty.aihao.core.mvnforummemberpermission_core;
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
*@MVNFORUMMEMBERPERMISSION数据接口
*@作者：宋春林 
*/
public class mvnforummemberpermission_impl implements mvnforummemberpermission_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforummemberpermission_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMEMBERPERMISSION实体
* @return 新插入记录的编号
*/
public int insert_mvnforummemberpermission(mvnforummemberpermission_Dao _MVNFORUMMEMBERPERMISSIONModel)  throws Exception{
         String sqlStr = "{call MVNFORUMMEMBERPERMISSION_PRO.InsertMVNFORUMMEMBERPERMISSION(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMMEMBERPERMISSIONModel.getMemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERPERMISSIONModel.getPermission());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMEMBERPERMISSION
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforummemberpermission(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMMEMBERPERMISSION_PRO.InsertMVNFORUMMEMBERPERMISSION(?,?)}";
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
* @param MVNFORUMMEMBERPERMISSION实体
* @return 影响的行数
*/
public int update_mvnforummemberpermission(mvnforummemberpermission_Dao _MVNFORUMMEMBERPERMISSIONModel)  throws Exception{
        String sqlStr = "{call MVNFORUMMEMBERPERMISSION_PRO.UpdateMVNFORUMMEMBERPERMISSION(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERPERMISSIONModel.getMemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERPERMISSIONModel.getPermission());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMMEMBERPERMISSION中的一条记录
* @param MVNFORUMMEMBERPERMISSION实体
* @return 新插入记录的编号
*/
public int delete_mvnforummemberpermission(int Memberid)  throws Exception{
        String sqlStr = "{call MVNFORUMMEMBERPERMISSION_PRO.DeleteMVNFORUMMEMBERPERMISSION(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Memberid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforummemberpermission 数据实体
* @param Memberid">Memberid
* @return<mvnforummemberpermission 数据实体
* @throws Exception 
*/
public mvnforummemberpermission_Dao get_mvnforummemberpermissionDao(int Memberid) throws Exception{
         String sqlStr = "{ call MVNFORUMMEMBERPERMISSION_PRO.GetMVNFORUMMEMBERPERMISSIONEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Memberid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummemberpermission_Dao _obj = new mvnforummemberpermission_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMMEMBERPERMISSION返回的查询DataRow创建一个MVNFORUMMEMBERPERMISSIONEntity对象
* @param MVNFORUMMEMBERPERMISSION row
* @returnMVNFORUMMEMBERPERMISSIONList对象
* @throws Exception 
*/
public List<mvnforummemberpermission_Dao> get_mvnforummemberpermission_All() throws Exception{
        List<mvnforummemberpermission_Dao> _list = new ArrayList<mvnforummemberpermission_Dao>();
		String sqlStr = "{ call MVNFORUMMEMBERPERMISSION_PRO.GetMVNFORUMMEMBERPERMISSION(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummemberpermission_Dao _obj = new mvnforummemberpermission_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMMEMBERPERMISSION返回的查询DataRow创建一个MVNFORUMMEMBERPERMISSIONEntity对象
* @param MVNFORUMMEMBERPERMISSION row
* @returnMVNFORUMMEMBERPERMISSIONList对象
* @throws Exception 
*/
public List< mvnforummemberpermission_Dao> get_mvnforummemberpermission_All(String strWhere) throws Exception{
         List<mvnforummemberpermission_Dao> _list = new ArrayList<mvnforummemberpermission_Dao>();
		 String sqlStr = "{ call MVNFORUMMEMBERPERMISSION_PRO.GetMVNFORUMMEMBERPERMISSIONWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforummemberpermission_Dao _obj = new mvnforummemberpermission_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMMEMBERPERMISSION返回 分页数据
* @param MVNFORUMMEMBERPERMISSION row
* @returnMVNFORUMMEMBERPERMISSIONList对象
* @throws Exception 
*/
public List<mvnforummemberpermission_Dao> get_mvnforummemberpermission_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforummemberpermission_Dao> _list = new ArrayList<mvnforummemberpermission_Dao>();
		String sqlStr = "{ call MVNFORUMMEMBERPERMISSION_PRO.GetMVNFORUMMEMBERPERMISSIONPage(?,?,?,?,?,?)}";
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
				mvnforummemberpermission_Dao _obj = new mvnforummemberpermission_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMMEMBERPERMISSION返回的查询DataRow创建一个MVNFORUMMEMBERPERMISSIONEntity对象
* @param MVNFORUMMEMBERPERMISSION row
* @returnMVNFORUMMEMBERPERMISSIONDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforummemberpermission_Dao> get_mvnforummemberpermission_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforummemberpermissionstrWhere") == null) {
			Dictionary<Integer, mvnforummemberpermission_Dao> _dic = new Hashtable<Integer, mvnforummemberpermission_Dao>();
			List<mvnforummemberpermission_Dao> _list = new ArrayList<mvnforummemberpermission_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMemberid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforummemberpermission", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforummemberpermission_Dao> _dic = (Dictionary<Integer, mvnforummemberpermission_Dao>) classFactory
					.cacheGet("dicmvnforummemberpermissionstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMMEMBERPERMISSION字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforummemberpermission_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMMEMBERPERMISSION_PRO.UpdateFieldMVNFORUMMEMBERPERMISSION(?,?)}";
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
* 更新MVNFORUMMEMBERPERMISSIONInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforummemberpermission_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMMEMBERPERMISSION_PRO.UpdateFieldMVNFORUMMEMBERPERMISSIONV(?,?,?)}";
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
* 更新MVNFORUMMEMBERPERMISSIONIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforummemberpermission_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMMEMBERPERMISSION_PRO.UpdateFieldMVNFORUMMEMBERPERMISSIONU(?,?,?)}";
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
