/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumsymconfig.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumsymconfig_Dao;
import com.szty.aihao.core.mvnforumsymconfig_core;
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
*@MVNFORUMSYMCONFIG数据接口
*@作者：宋春林 
*/
public class mvnforumsymconfig_impl implements mvnforumsymconfig_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumsymconfig_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSYMCONFIG实体
* @return 新插入记录的编号
*/
public int insert_mvnforumsymconfig(mvnforumsymconfig_Dao _MVNFORUMSYMCONFIGModel)  throws Exception{
         String sqlStr = "{call MVNFORUMSYMCONFIG_PRO.InsertMVNFORUMSYMCONFIG(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMSYMCONFIGModel.getConfigid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMCONFIGModel.getContentid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMSYMCONFIGModel.getFlg());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMCONFIGModel.getSupportua());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSYMCONFIG
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumsymconfig(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMSYMCONFIG_PRO.InsertMVNFORUMSYMCONFIG(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMSYMCONFIG实体
* @return 影响的行数
*/
public int update_mvnforumsymconfig(mvnforumsymconfig_Dao _MVNFORUMSYMCONFIGModel)  throws Exception{
        String sqlStr = "{call MVNFORUMSYMCONFIG_PRO.UpdateMVNFORUMSYMCONFIG(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMSYMCONFIGModel.getConfigid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMCONFIGModel.getContentid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMSYMCONFIGModel.getFlg());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMCONFIGModel.getSupportua());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMSYMCONFIG中的一条记录
* @param MVNFORUMSYMCONFIG实体
* @return 新插入记录的编号
*/
public int delete_mvnforumsymconfig(int Configid)  throws Exception{
        String sqlStr = "{call MVNFORUMSYMCONFIG_PRO.DeleteMVNFORUMSYMCONFIG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Configid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumsymconfig 数据实体
* @param Configid">Configid
* @return<mvnforumsymconfig 数据实体
* @throws Exception 
*/
public mvnforumsymconfig_Dao get_mvnforumsymconfigDao(int Configid) throws Exception{
         String sqlStr = "{ call MVNFORUMSYMCONFIG_PRO.GetMVNFORUMSYMCONFIGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Configid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsymconfig_Dao _obj = new mvnforumsymconfig_Dao();
            _obj.setConfigid(arr.getInt("CONFIGID"));
            _obj.setContentid(arr.getString("CONTENTID"));
            _obj.setFlg(arr.getInt("FLG"));
            _obj.setSupportua(arr.getString("SUPPORTUA"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMSYMCONFIG返回的查询DataRow创建一个MVNFORUMSYMCONFIGEntity对象
* @param MVNFORUMSYMCONFIG row
* @returnMVNFORUMSYMCONFIGList对象
* @throws Exception 
*/
public List<mvnforumsymconfig_Dao> get_mvnforumsymconfig_All() throws Exception{
        List<mvnforumsymconfig_Dao> _list = new ArrayList<mvnforumsymconfig_Dao>();
		String sqlStr = "{ call MVNFORUMSYMCONFIG_PRO.GetMVNFORUMSYMCONFIG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsymconfig_Dao _obj = new mvnforumsymconfig_Dao();
            _obj.setConfigid(arr.getInt("CONFIGID"));
            _obj.setContentid(arr.getString("CONTENTID"));
            _obj.setFlg(arr.getInt("FLG"));
            _obj.setSupportua(arr.getString("SUPPORTUA"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMSYMCONFIG返回的查询DataRow创建一个MVNFORUMSYMCONFIGEntity对象
* @param MVNFORUMSYMCONFIG row
* @returnMVNFORUMSYMCONFIGList对象
* @throws Exception 
*/
public List< mvnforumsymconfig_Dao> get_mvnforumsymconfig_All(String strWhere) throws Exception{
         List<mvnforumsymconfig_Dao> _list = new ArrayList<mvnforumsymconfig_Dao>();
		 String sqlStr = "{ call MVNFORUMSYMCONFIG_PRO.GetMVNFORUMSYMCONFIGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumsymconfig_Dao _obj = new mvnforumsymconfig_Dao();
            _obj.setConfigid(arr.getInt("CONFIGID"));
            _obj.setContentid(arr.getString("CONTENTID"));
            _obj.setFlg(arr.getInt("FLG"));
            _obj.setSupportua(arr.getString("SUPPORTUA"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMSYMCONFIG返回 分页数据
* @param MVNFORUMSYMCONFIG row
* @returnMVNFORUMSYMCONFIGList对象
* @throws Exception 
*/
public List<mvnforumsymconfig_Dao> get_mvnforumsymconfig_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumsymconfig_Dao> _list = new ArrayList<mvnforumsymconfig_Dao>();
		String sqlStr = "{ call MVNFORUMSYMCONFIG_PRO.GetMVNFORUMSYMCONFIGPage(?,?,?,?,?,?)}";
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
				mvnforumsymconfig_Dao _obj = new mvnforumsymconfig_Dao();
            _obj.setConfigid(arr.getInt("CONFIGID"));
            _obj.setContentid(arr.getString("CONTENTID"));
            _obj.setFlg(arr.getInt("FLG"));
            _obj.setSupportua(arr.getString("SUPPORTUA"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMSYMCONFIG返回的查询DataRow创建一个MVNFORUMSYMCONFIGEntity对象
* @param MVNFORUMSYMCONFIG row
* @returnMVNFORUMSYMCONFIGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumsymconfig_Dao> get_mvnforumsymconfig_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumsymconfigstrWhere") == null) {
			Dictionary<Integer, mvnforumsymconfig_Dao> _dic = new Hashtable<Integer, mvnforumsymconfig_Dao>();
			List<mvnforumsymconfig_Dao> _list = new ArrayList<mvnforumsymconfig_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getConfigid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumsymconfig", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumsymconfig_Dao> _dic = (Dictionary<Integer, mvnforumsymconfig_Dao>) classFactory
					.cacheGet("dicmvnforumsymconfigstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMSYMCONFIG字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumsymconfig_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMSYMCONFIG_PRO.UpdateFieldMVNFORUMSYMCONFIG(?,?)}";
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
* 更新MVNFORUMSYMCONFIGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumsymconfig_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMSYMCONFIG_PRO.UpdateFieldMVNFORUMSYMCONFIGV(?,?,?)}";
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
* 更新MVNFORUMSYMCONFIGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumsymconfig_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMSYMCONFIG_PRO.UpdateFieldMVNFORUMSYMCONFIGU(?,?,?)}";
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
