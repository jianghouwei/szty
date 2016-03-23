/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforummembergroup.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforummembergroup_Dao;
import com.szty.aihao.core.mvnforummembergroup_core;
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
*@MVNFORUMMEMBERGROUP数据接口
*@作者：宋春林 
*/
public class mvnforummembergroup_impl implements mvnforummembergroup_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforummembergroup_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMEMBERGROUP实体
* @return 新插入记录的编号
*/
public int insert_mvnforummembergroup(mvnforummembergroup_Dao _MVNFORUMMEMBERGROUPModel)  throws Exception{
         String sqlStr = "{call MVNFORUMMEMBERGROUP_PRO.InsertMVNFORUMMEMBERGROUP(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMMEMBERGROUPModel.getGroupid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERGROUPModel.getMemberid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERGROUPModel.getMembername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERGROUPModel.getPrivilege());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERGROUPModel.getCreationdate()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERGROUPModel.getModifieddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMEMBERGROUP
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforummembergroup(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMMEMBERGROUP_PRO.InsertMVNFORUMMEMBERGROUP(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMMEMBERGROUP实体
* @return 影响的行数
*/
public int update_mvnforummembergroup(mvnforummembergroup_Dao _MVNFORUMMEMBERGROUPModel)  throws Exception{
        String sqlStr = "{call MVNFORUMMEMBERGROUP_PRO.UpdateMVNFORUMMEMBERGROUP(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERGROUPModel.getGroupid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERGROUPModel.getMemberid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERGROUPModel.getMembername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERGROUPModel.getPrivilege());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERGROUPModel.getCreationdate()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERGROUPModel.getModifieddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMMEMBERGROUP中的一条记录
* @param MVNFORUMMEMBERGROUP实体
* @return 新插入记录的编号
*/
public int delete_mvnforummembergroup(int Groupid)  throws Exception{
        String sqlStr = "{call MVNFORUMMEMBERGROUP_PRO.DeleteMVNFORUMMEMBERGROUP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Groupid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforummembergroup 数据实体
* @param Groupid">Groupid
* @return<mvnforummembergroup 数据实体
* @throws Exception 
*/
public mvnforummembergroup_Dao get_mvnforummembergroupDao(int Groupid) throws Exception{
         String sqlStr = "{ call MVNFORUMMEMBERGROUP_PRO.GetMVNFORUMMEMBERGROUPEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Groupid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummembergroup_Dao _obj = new mvnforummembergroup_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setPrivilege(arr.getInt("PRIVILEGE"));
             try{_obj.setCreationdate(dateformat.parse(arr.getString("CREATIONDATE")));}catch(Exception ce){_obj.setCreationdate((new Date()));}
             try{_obj.setModifieddate(dateformat.parse(arr.getString("MODIFIEDDATE")));}catch(Exception ce){_obj.setModifieddate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMMEMBERGROUP返回的查询DataRow创建一个MVNFORUMMEMBERGROUPEntity对象
* @param MVNFORUMMEMBERGROUP row
* @returnMVNFORUMMEMBERGROUPList对象
* @throws Exception 
*/
public List<mvnforummembergroup_Dao> get_mvnforummembergroup_All() throws Exception{
        List<mvnforummembergroup_Dao> _list = new ArrayList<mvnforummembergroup_Dao>();
		String sqlStr = "{ call MVNFORUMMEMBERGROUP_PRO.GetMVNFORUMMEMBERGROUP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummembergroup_Dao _obj = new mvnforummembergroup_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setPrivilege(arr.getInt("PRIVILEGE"));
            try{_obj.setCreationdate(dateformat.parse(arr.getString("CREATIONDATE")));}catch(Exception ce){_obj.setCreationdate((new Date()));}
            try{_obj.setModifieddate(dateformat.parse(arr.getString("MODIFIEDDATE")));}catch(Exception ce){_obj.setModifieddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMMEMBERGROUP返回的查询DataRow创建一个MVNFORUMMEMBERGROUPEntity对象
* @param MVNFORUMMEMBERGROUP row
* @returnMVNFORUMMEMBERGROUPList对象
* @throws Exception 
*/
public List< mvnforummembergroup_Dao> get_mvnforummembergroup_All(String strWhere) throws Exception{
         List<mvnforummembergroup_Dao> _list = new ArrayList<mvnforummembergroup_Dao>();
		 String sqlStr = "{ call MVNFORUMMEMBERGROUP_PRO.GetMVNFORUMMEMBERGROUPWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforummembergroup_Dao _obj = new mvnforummembergroup_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setPrivilege(arr.getInt("PRIVILEGE"));
           try{_obj.setCreationdate(dateformat.parse(arr.getString("CREATIONDATE")));}catch(Exception ce){_obj.setCreationdate((new Date()));}
           try{_obj.setModifieddate(dateformat.parse(arr.getString("MODIFIEDDATE")));}catch(Exception ce){_obj.setModifieddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMMEMBERGROUP返回 分页数据
* @param MVNFORUMMEMBERGROUP row
* @returnMVNFORUMMEMBERGROUPList对象
* @throws Exception 
*/
public List<mvnforummembergroup_Dao> get_mvnforummembergroup_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforummembergroup_Dao> _list = new ArrayList<mvnforummembergroup_Dao>();
		String sqlStr = "{ call MVNFORUMMEMBERGROUP_PRO.GetMVNFORUMMEMBERGROUPPage(?,?,?,?,?,?)}";
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
				mvnforummembergroup_Dao _obj = new mvnforummembergroup_Dao();
            _obj.setGroupid(arr.getInt("GROUPID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setPrivilege(arr.getInt("PRIVILEGE"));
            try{_obj.setCreationdate(dateformat.parse(arr.getString("CREATIONDATE")));}catch(Exception ce){_obj.setCreationdate((new Date()));}
            try{_obj.setModifieddate(dateformat.parse(arr.getString("MODIFIEDDATE")));}catch(Exception ce){_obj.setModifieddate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMMEMBERGROUP返回的查询DataRow创建一个MVNFORUMMEMBERGROUPEntity对象
* @param MVNFORUMMEMBERGROUP row
* @returnMVNFORUMMEMBERGROUPDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforummembergroup_Dao> get_mvnforummembergroup_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforummembergroupstrWhere") == null) {
			Dictionary<Integer, mvnforummembergroup_Dao> _dic = new Hashtable<Integer, mvnforummembergroup_Dao>();
			List<mvnforummembergroup_Dao> _list = new ArrayList<mvnforummembergroup_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getGroupid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforummembergroup", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforummembergroup_Dao> _dic = (Dictionary<Integer, mvnforummembergroup_Dao>) classFactory
					.cacheGet("dicmvnforummembergroupstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMMEMBERGROUP字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforummembergroup_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMMEMBERGROUP_PRO.UpdateFieldMVNFORUMMEMBERGROUP(?,?)}";
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
* 更新MVNFORUMMEMBERGROUPInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforummembergroup_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMMEMBERGROUP_PRO.UpdateFieldMVNFORUMMEMBERGROUPV(?,?,?)}";
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
* 更新MVNFORUMMEMBERGROUPIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforummembergroup_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMMEMBERGROUP_PRO.UpdateFieldMVNFORUMMEMBERGROUPU(?,?,?)}";
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
