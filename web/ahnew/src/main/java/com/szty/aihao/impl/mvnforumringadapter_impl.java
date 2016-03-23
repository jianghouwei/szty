/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumringadapter.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumringadapter_Dao;
import com.szty.aihao.core.mvnforumringadapter_core;
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
*@MVNFORUMRINGADAPTER数据接口
*@作者：宋春林 
*/
public class mvnforumringadapter_impl implements mvnforumringadapter_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumringadapter_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMRINGADAPTER实体
* @return 新插入记录的编号
*/
public int insert_mvnforumringadapter(mvnforumringadapter_Dao _MVNFORUMRINGADAPTERModel)  throws Exception{
         String sqlStr = "{call MVNFORUMRINGADAPTER_PRO.InsertMVNFORUMRINGADAPTER(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMRINGADAPTERModel.getAdapterid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGADAPTERModel.getRingid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGADAPTERModel.getAdaptername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGADAPTERModel.getRingformat());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGADAPTERModel.getRingsize());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGADAPTERModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMRINGADAPTER
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumringadapter(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMRINGADAPTER_PRO.InsertMVNFORUMRINGADAPTER(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMRINGADAPTER实体
* @return 影响的行数
*/
public int update_mvnforumringadapter(mvnforumringadapter_Dao _MVNFORUMRINGADAPTERModel)  throws Exception{
        String sqlStr = "{call MVNFORUMRINGADAPTER_PRO.UpdateMVNFORUMRINGADAPTER(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGADAPTERModel.getAdapterid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGADAPTERModel.getRingid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGADAPTERModel.getAdaptername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGADAPTERModel.getRingformat());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGADAPTERModel.getRingsize());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGADAPTERModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMRINGADAPTER中的一条记录
* @param MVNFORUMRINGADAPTER实体
* @return 新插入记录的编号
*/
public int delete_mvnforumringadapter(int Adapterid)  throws Exception{
        String sqlStr = "{call MVNFORUMRINGADAPTER_PRO.DeleteMVNFORUMRINGADAPTER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Adapterid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumringadapter 数据实体
* @param Adapterid">Adapterid
* @return<mvnforumringadapter 数据实体
* @throws Exception 
*/
public mvnforumringadapter_Dao get_mvnforumringadapterDao(int Adapterid) throws Exception{
         String sqlStr = "{ call MVNFORUMRINGADAPTER_PRO.GetMVNFORUMRINGADAPTEREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Adapterid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumringadapter_Dao _obj = new mvnforumringadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setRingid(arr.getInt("RINGID"));
            _obj.setAdaptername(arr.getString("ADAPTERNAME"));
            _obj.setRingformat(arr.getString("RINGFORMAT"));
            _obj.setRingsize(arr.getInt("RINGSIZE"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMRINGADAPTER返回的查询DataRow创建一个MVNFORUMRINGADAPTEREntity对象
* @param MVNFORUMRINGADAPTER row
* @returnMVNFORUMRINGADAPTERList对象
* @throws Exception 
*/
public List<mvnforumringadapter_Dao> get_mvnforumringadapter_All() throws Exception{
        List<mvnforumringadapter_Dao> _list = new ArrayList<mvnforumringadapter_Dao>();
		String sqlStr = "{ call MVNFORUMRINGADAPTER_PRO.GetMVNFORUMRINGADAPTER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumringadapter_Dao _obj = new mvnforumringadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setRingid(arr.getInt("RINGID"));
            _obj.setAdaptername(arr.getString("ADAPTERNAME"));
            _obj.setRingformat(arr.getString("RINGFORMAT"));
            _obj.setRingsize(arr.getInt("RINGSIZE"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMRINGADAPTER返回的查询DataRow创建一个MVNFORUMRINGADAPTEREntity对象
* @param MVNFORUMRINGADAPTER row
* @returnMVNFORUMRINGADAPTERList对象
* @throws Exception 
*/
public List< mvnforumringadapter_Dao> get_mvnforumringadapter_All(String strWhere) throws Exception{
         List<mvnforumringadapter_Dao> _list = new ArrayList<mvnforumringadapter_Dao>();
		 String sqlStr = "{ call MVNFORUMRINGADAPTER_PRO.GetMVNFORUMRINGADAPTERWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumringadapter_Dao _obj = new mvnforumringadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setRingid(arr.getInt("RINGID"));
            _obj.setAdaptername(arr.getString("ADAPTERNAME"));
            _obj.setRingformat(arr.getString("RINGFORMAT"));
            _obj.setRingsize(arr.getInt("RINGSIZE"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMRINGADAPTER返回 分页数据
* @param MVNFORUMRINGADAPTER row
* @returnMVNFORUMRINGADAPTERList对象
* @throws Exception 
*/
public List<mvnforumringadapter_Dao> get_mvnforumringadapter_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumringadapter_Dao> _list = new ArrayList<mvnforumringadapter_Dao>();
		String sqlStr = "{ call MVNFORUMRINGADAPTER_PRO.GetMVNFORUMRINGADAPTERPage(?,?,?,?,?,?)}";
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
				mvnforumringadapter_Dao _obj = new mvnforumringadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setRingid(arr.getInt("RINGID"));
            _obj.setAdaptername(arr.getString("ADAPTERNAME"));
            _obj.setRingformat(arr.getString("RINGFORMAT"));
            _obj.setRingsize(arr.getInt("RINGSIZE"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMRINGADAPTER返回的查询DataRow创建一个MVNFORUMRINGADAPTEREntity对象
* @param MVNFORUMRINGADAPTER row
* @returnMVNFORUMRINGADAPTERDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumringadapter_Dao> get_mvnforumringadapter_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumringadapterstrWhere") == null) {
			Dictionary<Integer, mvnforumringadapter_Dao> _dic = new Hashtable<Integer, mvnforumringadapter_Dao>();
			List<mvnforumringadapter_Dao> _list = new ArrayList<mvnforumringadapter_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getAdapterid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumringadapter", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumringadapter_Dao> _dic = (Dictionary<Integer, mvnforumringadapter_Dao>) classFactory
					.cacheGet("dicmvnforumringadapterstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMRINGADAPTER字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumringadapter_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMRINGADAPTER_PRO.UpdateFieldMVNFORUMRINGADAPTER(?,?)}";
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
* 更新MVNFORUMRINGADAPTERInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumringadapter_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMRINGADAPTER_PRO.UpdateFieldMVNFORUMRINGADAPTERV(?,?,?)}";
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
* 更新MVNFORUMRINGADAPTERIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumringadapter_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMRINGADAPTER_PRO.UpdateFieldMVNFORUMRINGADAPTERU(?,?,?)}";
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
