/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumgrouppermission.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumgrouppermission_Dao;
import com.szty.aihao.core.mvnforumgrouppermission_core;
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
*@MVNFORUMGROUPPERMISSION数据接口
*@作者：宋春林 
*/
public class mvnforumgrouppermission_impl implements mvnforumgrouppermission_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumgrouppermission_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMGROUPPERMISSION实体
* @return 新插入记录的编号
*/
public int insert_mvnforumgrouppermission(mvnforumgrouppermission_Dao _MVNFORUMGROUPPERMISSIONModel)  throws Exception{
         String sqlStr = "{call MVNFORUMGROUPPERMISSION_PRO.InsertMVNFORUMGROUPPERMISSION(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMGROUPPERMISSIONModel.getGroupid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMGROUPPERMISSIONModel.getPermission());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMGROUPPERMISSION
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumgrouppermission(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMGROUPPERMISSION_PRO.InsertMVNFORUMGROUPPERMISSION(?,?)}";
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
* @param MVNFORUMGROUPPERMISSION实体
* @return 影响的行数
*/
public int update_mvnforumgrouppermission(mvnforumgrouppermission_Dao _MVNFORUMGROUPPERMISSIONModel)  throws Exception{
        String sqlStr = "{call MVNFORUMGROUPPERMISSION_PRO.UpdateMVNFORUMGROUPPERMISSION(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMGROUPPERMISSIONModel.getGroupid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMGROUPPERMISSIONModel.getPermission());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMGROUPPERMISSION中的一条记录
* @param MVNFORUMGROUPPERMISSION实体
* @return 新插入记录的编号
*/
public int delete_mvnforumgrouppermission(int Groupid)  throws Exception{
        String sqlStr = "{call MVNFORUMGROUPPERMISSION_PRO.DeleteMVNFORUMGROUPPERMISSION(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Groupid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumgrouppermission 数据实体
* @param Groupid">Groupid
* @return<mvnforumgrouppermission 数据实体
* @throws Exception 
*/
public mvnforumgrouppermission_Dao get_mvnforumgrouppermissionDao(int Groupid) throws Exception{
         String sqlStr = "{ call MVNFORUMGROUPPERMISSION_PRO.GetMVNFORUMGROUPPERMISSIONEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Groupid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumgrouppermission_Dao _obj = new mvnforumgrouppermission_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMGROUPPERMISSION返回的查询DataRow创建一个MVNFORUMGROUPPERMISSIONEntity对象
* @param MVNFORUMGROUPPERMISSION row
* @returnMVNFORUMGROUPPERMISSIONList对象
* @throws Exception 
*/
public List<mvnforumgrouppermission_Dao> get_mvnforumgrouppermission_All() throws Exception{
        List<mvnforumgrouppermission_Dao> _list = new ArrayList<mvnforumgrouppermission_Dao>();
		String sqlStr = "{ call MVNFORUMGROUPPERMISSION_PRO.GetMVNFORUMGROUPPERMISSION(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumgrouppermission_Dao _obj = new mvnforumgrouppermission_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMGROUPPERMISSION返回的查询DataRow创建一个MVNFORUMGROUPPERMISSIONEntity对象
* @param MVNFORUMGROUPPERMISSION row
* @returnMVNFORUMGROUPPERMISSIONList对象
* @throws Exception 
*/
public List< mvnforumgrouppermission_Dao> get_mvnforumgrouppermission_All(String strWhere) throws Exception{
         List<mvnforumgrouppermission_Dao> _list = new ArrayList<mvnforumgrouppermission_Dao>();
		 String sqlStr = "{ call MVNFORUMGROUPPERMISSION_PRO.GetMVNFORUMGROUPPERMISSIONWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumgrouppermission_Dao _obj = new mvnforumgrouppermission_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMGROUPPERMISSION返回 分页数据
* @param MVNFORUMGROUPPERMISSION row
* @returnMVNFORUMGROUPPERMISSIONList对象
* @throws Exception 
*/
public List<mvnforumgrouppermission_Dao> get_mvnforumgrouppermission_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumgrouppermission_Dao> _list = new ArrayList<mvnforumgrouppermission_Dao>();
		String sqlStr = "{ call MVNFORUMGROUPPERMISSION_PRO.GetMVNFORUMGROUPPERMISSIONPage(?,?,?,?,?,?)}";
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
				mvnforumgrouppermission_Dao _obj = new mvnforumgrouppermission_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMGROUPPERMISSION返回的查询DataRow创建一个MVNFORUMGROUPPERMISSIONEntity对象
* @param MVNFORUMGROUPPERMISSION row
* @returnMVNFORUMGROUPPERMISSIONDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumgrouppermission_Dao> get_mvnforumgrouppermission_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumgrouppermissionstrWhere") == null) {
			Dictionary<Integer, mvnforumgrouppermission_Dao> _dic = new Hashtable<Integer, mvnforumgrouppermission_Dao>();
			List<mvnforumgrouppermission_Dao> _list = new ArrayList<mvnforumgrouppermission_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getGroupid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumgrouppermission", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumgrouppermission_Dao> _dic = (Dictionary<Integer, mvnforumgrouppermission_Dao>) classFactory
					.cacheGet("dicmvnforumgrouppermissionstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMGROUPPERMISSION字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumgrouppermission_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMGROUPPERMISSION_PRO.UpdateFieldMVNFORUMGROUPPERMISSION(?,?)}";
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
* 更新MVNFORUMGROUPPERMISSIONInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumgrouppermission_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMGROUPPERMISSION_PRO.UpdateFieldMVNFORUMGROUPPERMISSIONV(?,?,?)}";
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
* 更新MVNFORUMGROUPPERMISSIONIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumgrouppermission_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMGROUPPERMISSION_PRO.UpdateFieldMVNFORUMGROUPPERMISSIONU(?,?,?)}";
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
