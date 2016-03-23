/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforummemberforum.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforummemberforum_Dao;
import com.szty.aihao.core.mvnforummemberforum_core;
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
*@MVNFORUMMEMBERFORUM数据接口
*@作者：宋春林 
*/
public class mvnforummemberforum_impl implements mvnforummemberforum_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforummemberforum_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMEMBERFORUM实体
* @return 新插入记录的编号
*/
public int insert_mvnforummemberforum(mvnforummemberforum_Dao _MVNFORUMMEMBERFORUMModel)  throws Exception{
         String sqlStr = "{call MVNFORUMMEMBERFORUM_PRO.InsertMVNFORUMMEMBERFORUM(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMMEMBERFORUMModel.getMemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERFORUMModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERFORUMModel.getPermission());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMEMBERFORUM
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforummemberforum(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMMEMBERFORUM_PRO.InsertMVNFORUMMEMBERFORUM(?,?,?)}";
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
* @param MVNFORUMMEMBERFORUM实体
* @return 影响的行数
*/
public int update_mvnforummemberforum(mvnforummemberforum_Dao _MVNFORUMMEMBERFORUMModel)  throws Exception{
        String sqlStr = "{call MVNFORUMMEMBERFORUM_PRO.UpdateMVNFORUMMEMBERFORUM(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERFORUMModel.getMemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERFORUMModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERFORUMModel.getPermission());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMMEMBERFORUM中的一条记录
* @param MVNFORUMMEMBERFORUM实体
* @return 新插入记录的编号
*/
public int delete_mvnforummemberforum(int Memberid)  throws Exception{
        String sqlStr = "{call MVNFORUMMEMBERFORUM_PRO.DeleteMVNFORUMMEMBERFORUM(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Memberid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforummemberforum 数据实体
* @param Memberid">Memberid
* @return<mvnforummemberforum 数据实体
* @throws Exception 
*/
public mvnforummemberforum_Dao get_mvnforummemberforumDao(int Memberid) throws Exception{
         String sqlStr = "{ call MVNFORUMMEMBERFORUM_PRO.GetMVNFORUMMEMBERFORUMEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Memberid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummemberforum_Dao _obj = new mvnforummemberforum_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMMEMBERFORUM返回的查询DataRow创建一个MVNFORUMMEMBERFORUMEntity对象
* @param MVNFORUMMEMBERFORUM row
* @returnMVNFORUMMEMBERFORUMList对象
* @throws Exception 
*/
public List<mvnforummemberforum_Dao> get_mvnforummemberforum_All() throws Exception{
        List<mvnforummemberforum_Dao> _list = new ArrayList<mvnforummemberforum_Dao>();
		String sqlStr = "{ call MVNFORUMMEMBERFORUM_PRO.GetMVNFORUMMEMBERFORUM(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummemberforum_Dao _obj = new mvnforummemberforum_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMMEMBERFORUM返回的查询DataRow创建一个MVNFORUMMEMBERFORUMEntity对象
* @param MVNFORUMMEMBERFORUM row
* @returnMVNFORUMMEMBERFORUMList对象
* @throws Exception 
*/
public List< mvnforummemberforum_Dao> get_mvnforummemberforum_All(String strWhere) throws Exception{
         List<mvnforummemberforum_Dao> _list = new ArrayList<mvnforummemberforum_Dao>();
		 String sqlStr = "{ call MVNFORUMMEMBERFORUM_PRO.GetMVNFORUMMEMBERFORUMWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforummemberforum_Dao _obj = new mvnforummemberforum_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMMEMBERFORUM返回 分页数据
* @param MVNFORUMMEMBERFORUM row
* @returnMVNFORUMMEMBERFORUMList对象
* @throws Exception 
*/
public List<mvnforummemberforum_Dao> get_mvnforummemberforum_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforummemberforum_Dao> _list = new ArrayList<mvnforummemberforum_Dao>();
		String sqlStr = "{ call MVNFORUMMEMBERFORUM_PRO.GetMVNFORUMMEMBERFORUMPage(?,?,?,?,?,?)}";
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
				mvnforummemberforum_Dao _obj = new mvnforummemberforum_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setPermission(arr.getInt("PERMISSION"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMMEMBERFORUM返回的查询DataRow创建一个MVNFORUMMEMBERFORUMEntity对象
* @param MVNFORUMMEMBERFORUM row
* @returnMVNFORUMMEMBERFORUMDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforummemberforum_Dao> get_mvnforummemberforum_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforummemberforumstrWhere") == null) {
			Dictionary<Integer, mvnforummemberforum_Dao> _dic = new Hashtable<Integer, mvnforummemberforum_Dao>();
			List<mvnforummemberforum_Dao> _list = new ArrayList<mvnforummemberforum_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMemberid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforummemberforum", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforummemberforum_Dao> _dic = (Dictionary<Integer, mvnforummemberforum_Dao>) classFactory
					.cacheGet("dicmvnforummemberforumstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMMEMBERFORUM字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforummemberforum_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMMEMBERFORUM_PRO.UpdateFieldMVNFORUMMEMBERFORUM(?,?)}";
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
* 更新MVNFORUMMEMBERFORUMInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforummemberforum_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMMEMBERFORUM_PRO.UpdateFieldMVNFORUMMEMBERFORUMV(?,?,?)}";
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
* 更新MVNFORUMMEMBERFORUMIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforummemberforum_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMMEMBERFORUM_PRO.UpdateFieldMVNFORUMMEMBERFORUMU(?,?,?)}";
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
