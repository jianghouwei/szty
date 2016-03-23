/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumprovince.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumprovince_Dao;
import com.szty.aihao.core.mvnforumprovince_core;
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
*@MVNFORUMPROVINCE数据接口
*@作者：宋春林 
*/
public class mvnforumprovince_impl implements mvnforumprovince_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumprovince_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPROVINCE实体
* @return 新插入记录的编号
*/
public int insert_mvnforumprovince(mvnforumprovince_Dao _MVNFORUMPROVINCEModel)  throws Exception{
         String sqlStr = "{call MVNFORUMPROVINCE_PRO.InsertMVNFORUMPROVINCE(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMPROVINCEModel.getProid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPROVINCEModel.getProname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPROVINCEModel.getKeys());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPROVINCE
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumprovince(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMPROVINCE_PRO.InsertMVNFORUMPROVINCE(?,?,?)}";
	  OracleParameter[] op = new OracleParameter[3];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMPROVINCE实体
* @return 影响的行数
*/
public int update_mvnforumprovince(mvnforumprovince_Dao _MVNFORUMPROVINCEModel)  throws Exception{
        String sqlStr = "{call MVNFORUMPROVINCE_PRO.UpdateMVNFORUMPROVINCE(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMPROVINCEModel.getProid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPROVINCEModel.getProname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPROVINCEModel.getKeys());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMPROVINCE中的一条记录
* @param MVNFORUMPROVINCE实体
* @return 新插入记录的编号
*/
public int delete_mvnforumprovince(int Proid)  throws Exception{
        String sqlStr = "{call MVNFORUMPROVINCE_PRO.DeleteMVNFORUMPROVINCE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Proid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumprovince 数据实体
* @param Proid">Proid
* @return<mvnforumprovince 数据实体
* @throws Exception 
*/
public mvnforumprovince_Dao get_mvnforumprovinceDao(int Proid) throws Exception{
         String sqlStr = "{ call MVNFORUMPROVINCE_PRO.GetMVNFORUMPROVINCEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Proid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumprovince_Dao _obj = new mvnforumprovince_Dao();
            _obj.setProid(arr.getInt("PROID"));
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setKeys(arr.getString("KEYS"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMPROVINCE返回的查询DataRow创建一个MVNFORUMPROVINCEEntity对象
* @param MVNFORUMPROVINCE row
* @returnMVNFORUMPROVINCEList对象
* @throws Exception 
*/
public List<mvnforumprovince_Dao> get_mvnforumprovince_All() throws Exception{
        List<mvnforumprovince_Dao> _list = new ArrayList<mvnforumprovince_Dao>();
		String sqlStr = "{ call MVNFORUMPROVINCE_PRO.GetMVNFORUMPROVINCE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumprovince_Dao _obj = new mvnforumprovince_Dao();
            _obj.setProid(arr.getInt("PROID"));
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setKeys(arr.getString("KEYS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMPROVINCE返回的查询DataRow创建一个MVNFORUMPROVINCEEntity对象
* @param MVNFORUMPROVINCE row
* @returnMVNFORUMPROVINCEList对象
* @throws Exception 
*/
public List< mvnforumprovince_Dao> get_mvnforumprovince_All(String strWhere) throws Exception{
         List<mvnforumprovince_Dao> _list = new ArrayList<mvnforumprovince_Dao>();
		 String sqlStr = "{ call MVNFORUMPROVINCE_PRO.GetMVNFORUMPROVINCEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumprovince_Dao _obj = new mvnforumprovince_Dao();
            _obj.setProid(arr.getInt("PROID"));
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setKeys(arr.getString("KEYS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMPROVINCE返回 分页数据
* @param MVNFORUMPROVINCE row
* @returnMVNFORUMPROVINCEList对象
* @throws Exception 
*/
public List<mvnforumprovince_Dao> get_mvnforumprovince_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumprovince_Dao> _list = new ArrayList<mvnforumprovince_Dao>();
		String sqlStr = "{ call MVNFORUMPROVINCE_PRO.GetMVNFORUMPROVINCEPage(?,?,?,?,?,?)}";
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
				mvnforumprovince_Dao _obj = new mvnforumprovince_Dao();
            _obj.setProid(arr.getInt("PROID"));
            _obj.setProname(arr.getString("PRONAME"));
            _obj.setKeys(arr.getString("KEYS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMPROVINCE返回的查询DataRow创建一个MVNFORUMPROVINCEEntity对象
* @param MVNFORUMPROVINCE row
* @returnMVNFORUMPROVINCEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumprovince_Dao> get_mvnforumprovince_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumprovincestrWhere") == null) {
			Dictionary<Integer, mvnforumprovince_Dao> _dic = new Hashtable<Integer, mvnforumprovince_Dao>();
			List<mvnforumprovince_Dao> _list = new ArrayList<mvnforumprovince_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getProid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumprovince", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumprovince_Dao> _dic = (Dictionary<Integer, mvnforumprovince_Dao>) classFactory
					.cacheGet("dicmvnforumprovincestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMPROVINCE字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumprovince_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMPROVINCE_PRO.UpdateFieldMVNFORUMPROVINCE(?,?)}";
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
* 更新MVNFORUMPROVINCEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumprovince_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMPROVINCE_PRO.UpdateFieldMVNFORUMPROVINCEV(?,?,?)}";
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
* 更新MVNFORUMPROVINCEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumprovince_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMPROVINCE_PRO.UpdateFieldMVNFORUMPROVINCEU(?,?,?)}";
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
