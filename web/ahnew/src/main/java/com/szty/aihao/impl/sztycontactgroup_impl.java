/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSztycontactgroup.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sztycontactgroup_Dao;
import com.szty.aihao.core.sztycontactgroup_core;
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
*@SZTYCONTACTGROUP数据接口
*@作者：宋春林 
*/
public class sztycontactgroup_impl implements sztycontactgroup_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sztycontactgroup_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTYCONTACTGROUP实体
* @return 新插入记录的编号
*/
public int insert_sztycontactgroup(sztycontactgroup_Dao _SZTYCONTACTGROUPModel)  throws Exception{
         String sqlStr = "{call SZTYCONTACTGROUP_PRO.InsertSZTYCONTACTGROUP(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTYCONTACTGROUPModel.getGid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SZTYCONTACTGROUPModel.getUsid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTGROUPModel.getGroupname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTGROUPModel.getGrouptype());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTYCONTACTGROUP
* @Object 
* @return 新插入记录的编号
*/
public int insert_sztycontactgroup(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTYCONTACTGROUP_PRO.InsertSZTYCONTACTGROUP(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SZTYCONTACTGROUP实体
* @return 影响的行数
*/
public int update_sztycontactgroup(sztycontactgroup_Dao _SZTYCONTACTGROUPModel)  throws Exception{
        String sqlStr = "{call SZTYCONTACTGROUP_PRO.UpdateSZTYCONTACTGROUP(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_SZTYCONTACTGROUPModel.getGid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SZTYCONTACTGROUPModel.getUsid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTGROUPModel.getGroupname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTGROUPModel.getGrouptype());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTYCONTACTGROUP中的一条记录
* @param SZTYCONTACTGROUP实体
* @return 新插入记录的编号
*/
public int delete_sztycontactgroup(int Gid)  throws Exception{
        String sqlStr = "{call SZTYCONTACTGROUP_PRO.DeleteSZTYCONTACTGROUP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Gid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 sztycontactgroup 数据实体
* @param Gid">Gid
* @return<sztycontactgroup 数据实体
* @throws Exception 
*/
public sztycontactgroup_Dao get_sztycontactgroupDao(int Gid) throws Exception{
         String sqlStr = "{ call SZTYCONTACTGROUP_PRO.GetSZTYCONTACTGROUPEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Gid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztycontactgroup_Dao _obj = new sztycontactgroup_Dao();
            _obj.setGid(arr.getInt("GID"));
            _obj.setUsid(arr.getInt("USID"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setGrouptype(arr.getString("GROUPTYPE"));
			return _obj;
		}
		return null;

}

/**
* 根据SZTYCONTACTGROUP返回的查询DataRow创建一个SZTYCONTACTGROUPEntity对象
* @param SZTYCONTACTGROUP row
* @returnSZTYCONTACTGROUPList对象
* @throws Exception 
*/
public List<sztycontactgroup_Dao> get_sztycontactgroup_All() throws Exception{
        List<sztycontactgroup_Dao> _list = new ArrayList<sztycontactgroup_Dao>();
		String sqlStr = "{ call SZTYCONTACTGROUP_PRO.GetSZTYCONTACTGROUP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztycontactgroup_Dao _obj = new sztycontactgroup_Dao();
            _obj.setGid(arr.getInt("GID"));
            _obj.setUsid(arr.getInt("USID"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setGrouptype(arr.getString("GROUPTYPE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTYCONTACTGROUP返回的查询DataRow创建一个SZTYCONTACTGROUPEntity对象
* @param SZTYCONTACTGROUP row
* @returnSZTYCONTACTGROUPList对象
* @throws Exception 
*/
public List< sztycontactgroup_Dao> get_sztycontactgroup_All(String strWhere) throws Exception{
         List<sztycontactgroup_Dao> _list = new ArrayList<sztycontactgroup_Dao>();
		 String sqlStr = "{ call SZTYCONTACTGROUP_PRO.GetSZTYCONTACTGROUPWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sztycontactgroup_Dao _obj = new sztycontactgroup_Dao();
            _obj.setGid(arr.getInt("GID"));
            _obj.setUsid(arr.getInt("USID"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setGrouptype(arr.getString("GROUPTYPE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTYCONTACTGROUP返回 分页数据
* @param SZTYCONTACTGROUP row
* @returnSZTYCONTACTGROUPList对象
* @throws Exception 
*/
public List<sztycontactgroup_Dao> get_sztycontactgroup_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sztycontactgroup_Dao> _list = new ArrayList<sztycontactgroup_Dao>();
		String sqlStr = "{ call SZTYCONTACTGROUP_PRO.GetSZTYCONTACTGROUPPage(?,?,?,?,?,?)}";
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
				sztycontactgroup_Dao _obj = new sztycontactgroup_Dao();
            _obj.setGid(arr.getInt("GID"));
            _obj.setUsid(arr.getInt("USID"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setGrouptype(arr.getString("GROUPTYPE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTYCONTACTGROUP返回的查询DataRow创建一个SZTYCONTACTGROUPEntity对象
* @param SZTYCONTACTGROUP row
* @returnSZTYCONTACTGROUPDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, sztycontactgroup_Dao> get_sztycontactgroup_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsztycontactgroupstrWhere") == null) {
			Dictionary<Integer, sztycontactgroup_Dao> _dic = new Hashtable<Integer, sztycontactgroup_Dao>();
			List<sztycontactgroup_Dao> _list = new ArrayList<sztycontactgroup_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getGid()), _list.get(i));
			}
			classFactory.cachePut("dicsztycontactgroup", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sztycontactgroup_Dao> _dic = (Dictionary<Integer, sztycontactgroup_Dao>) classFactory
					.cacheGet("dicsztycontactgroupstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTYCONTACTGROUP字段加一
* @param FieldName
* @param sid
*/
public int create_sztycontactgroup_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTYCONTACTGROUP_PRO.UpdateFieldSZTYCONTACTGROUP(?,?)}";
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
* 更新SZTYCONTACTGROUPInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_sztycontactgroup_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTYCONTACTGROUP_PRO.UpdateFieldSZTYCONTACTGROUPV(?,?,?)}";
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
* 更新SZTYCONTACTGROUPIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_sztycontactgroup_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTYCONTACTGROUP_PRO.UpdateFieldSZTYCONTACTGROUPU(?,?,?)}";
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
