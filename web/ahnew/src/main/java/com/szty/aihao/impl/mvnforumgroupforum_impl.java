/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumgroupforum.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumgroupforum_Dao;
import com.szty.aihao.core.mvnforumgroupforum_core;
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
*@MVNFORUMGROUPFORUM数据接口
*@作者：宋春林 
*/
public class mvnforumgroupforum_impl implements mvnforumgroupforum_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumgroupforum_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMGROUPFORUM实体
* @return 新插入记录的编号
*/
public int insert_mvnforumgroupforum(mvnforumgroupforum_Dao _MVNFORUMGROUPFORUMModel)  throws Exception{
         String sqlStr = "{call MVNFORUMGROUPFORUM_PRO.InsertMVNFORUMGROUPFORUM(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMGROUPFORUMModel.getGroupid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMGROUPFORUMModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMGROUPFORUMModel.getPermission());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMGROUPFORUM
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumgroupforum(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMGROUPFORUM_PRO.InsertMVNFORUMGROUPFORUM(?,?,?)}";
	  OracleParameter[] op = new OracleParameter[3];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMGROUPFORUM实体
* @return 影响的行数
*/
public int update_mvnforumgroupforum(mvnforumgroupforum_Dao _MVNFORUMGROUPFORUMModel)  throws Exception{
        String sqlStr = "{call MVNFORUMGROUPFORUM_PRO.UpdateMVNFORUMGROUPFORUM(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMGROUPFORUMModel.getGroupid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMGROUPFORUMModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMGROUPFORUMModel.getPermission());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMGROUPFORUM中的一条记录
* @param MVNFORUMGROUPFORUM实体
* @return 新插入记录的编号
*/
public int delete_mvnforumgroupforum(int Groupid)  throws Exception{
        String sqlStr = "{call MVNFORUMGROUPFORUM_PRO.DeleteMVNFORUMGROUPFORUM(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Groupid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumgroupforum 数据实体
* @param Groupid">Groupid
* @return<mvnforumgroupforum 数据实体
* @throws Exception 
*/
public mvnforumgroupforum_Dao get_mvnforumgroupforumDao(int Groupid) throws Exception{
         String sqlStr = "{ call MVNFORUMGROUPFORUM_PRO.GetMVNFORUMGROUPFORUMEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Groupid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumgroupforum_Dao _obj = new mvnforumgroupforum_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMGROUPFORUM返回的查询DataRow创建一个MVNFORUMGROUPFORUMEntity对象
* @param MVNFORUMGROUPFORUM row
* @returnMVNFORUMGROUPFORUMList对象
* @throws Exception 
*/
public List<mvnforumgroupforum_Dao> get_mvnforumgroupforum_All() throws Exception{
        List<mvnforumgroupforum_Dao> _list = new ArrayList<mvnforumgroupforum_Dao>();
		String sqlStr = "{ call MVNFORUMGROUPFORUM_PRO.GetMVNFORUMGROUPFORUM(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumgroupforum_Dao _obj = new mvnforumgroupforum_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMGROUPFORUM返回的查询DataRow创建一个MVNFORUMGROUPFORUMEntity对象
* @param MVNFORUMGROUPFORUM row
* @returnMVNFORUMGROUPFORUMList对象
* @throws Exception 
*/
public List< mvnforumgroupforum_Dao> get_mvnforumgroupforum_All(String strWhere) throws Exception{
         List<mvnforumgroupforum_Dao> _list = new ArrayList<mvnforumgroupforum_Dao>();
		 String sqlStr = "{ call MVNFORUMGROUPFORUM_PRO.GetMVNFORUMGROUPFORUMWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumgroupforum_Dao _obj = new mvnforumgroupforum_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMGROUPFORUM返回 分页数据
* @param MVNFORUMGROUPFORUM row
* @returnMVNFORUMGROUPFORUMList对象
* @throws Exception 
*/
public List<mvnforumgroupforum_Dao> get_mvnforumgroupforum_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumgroupforum_Dao> _list = new ArrayList<mvnforumgroupforum_Dao>();
		String sqlStr = "{ call MVNFORUMGROUPFORUM_PRO.GetMVNFORUMGROUPFORUMPage(?,?,?,?,?,?)}";
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
				mvnforumgroupforum_Dao _obj = new mvnforumgroupforum_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMGROUPFORUM返回的查询DataRow创建一个MVNFORUMGROUPFORUMEntity对象
* @param MVNFORUMGROUPFORUM row
* @returnMVNFORUMGROUPFORUMDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumgroupforum_Dao> get_mvnforumgroupforum_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumgroupforumstrWhere") == null) {
			Dictionary<Integer, mvnforumgroupforum_Dao> _dic = new Hashtable<Integer, mvnforumgroupforum_Dao>();
			List<mvnforumgroupforum_Dao> _list = new ArrayList<mvnforumgroupforum_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getGroupid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumgroupforum", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumgroupforum_Dao> _dic = (Dictionary<Integer, mvnforumgroupforum_Dao>) classFactory
					.cacheGet("dicmvnforumgroupforumstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMGROUPFORUM字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumgroupforum_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMGROUPFORUM_PRO.UpdateFieldMVNFORUMGROUPFORUM(?,?)}";
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
* 更新MVNFORUMGROUPFORUMInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumgroupforum_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMGROUPFORUM_PRO.UpdateFieldMVNFORUMGROUPFORUMV(?,?,?)}";
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
* 更新MVNFORUMGROUPFORUMIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumgroupforum_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMGROUPFORUM_PRO.UpdateFieldMVNFORUMGROUPFORUMU(?,?,?)}";
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
