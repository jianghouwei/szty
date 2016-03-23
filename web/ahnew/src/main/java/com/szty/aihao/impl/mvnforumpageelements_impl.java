/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumpageelements.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumpageelements_Dao;
import com.szty.aihao.core.mvnforumpageelements_core;
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
*@MVNFORUMPAGEELEMENTS数据接口
*@作者：宋春林 
*/
public class mvnforumpageelements_impl implements mvnforumpageelements_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumpageelements_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPAGEELEMENTS实体
* @return 新插入记录的编号
*/
public int insert_mvnforumpageelements(mvnforumpageelements_Dao _MVNFORUMPAGEELEMENTSModel)  throws Exception{
         String sqlStr = "{call MVNFORUMPAGEELEMENTS_PRO.InsertMVNFORUMPAGEELEMENTS(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMPAGEELEMENTSModel.getElementid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEELEMENTSModel.getPageid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPAGEELEMENTSModel.getContent());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEELEMENTSModel.getElementorder());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPAGEELEMENTS
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumpageelements(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMPAGEELEMENTS_PRO.InsertMVNFORUMPAGEELEMENTS(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMPAGEELEMENTS实体
* @return 影响的行数
*/
public int update_mvnforumpageelements(mvnforumpageelements_Dao _MVNFORUMPAGEELEMENTSModel)  throws Exception{
        String sqlStr = "{call MVNFORUMPAGEELEMENTS_PRO.UpdateMVNFORUMPAGEELEMENTS(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEELEMENTSModel.getElementid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEELEMENTSModel.getPageid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPAGEELEMENTSModel.getContent());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMPAGEELEMENTSModel.getElementorder());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMPAGEELEMENTS中的一条记录
* @param MVNFORUMPAGEELEMENTS实体
* @return 新插入记录的编号
*/
public int delete_mvnforumpageelements(int Elementid)  throws Exception{
        String sqlStr = "{call MVNFORUMPAGEELEMENTS_PRO.DeleteMVNFORUMPAGEELEMENTS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Elementid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumpageelements 数据实体
* @param Elementid">Elementid
* @return<mvnforumpageelements 数据实体
* @throws Exception 
*/
public mvnforumpageelements_Dao get_mvnforumpageelementsDao(int Elementid) throws Exception{
         String sqlStr = "{ call MVNFORUMPAGEELEMENTS_PRO.GetMVNFORUMPAGEELEMENTSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Elementid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumpageelements_Dao _obj = new mvnforumpageelements_Dao();
            _obj.setElementid(arr.getInt("ELEMENTID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setContent(arr.getString("CONTENT"));
            _obj.setElementorder(arr.getInt("ELEMENTORDER"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMPAGEELEMENTS返回的查询DataRow创建一个MVNFORUMPAGEELEMENTSEntity对象
* @param MVNFORUMPAGEELEMENTS row
* @returnMVNFORUMPAGEELEMENTSList对象
* @throws Exception 
*/
public List<mvnforumpageelements_Dao> get_mvnforumpageelements_All() throws Exception{
        List<mvnforumpageelements_Dao> _list = new ArrayList<mvnforumpageelements_Dao>();
		String sqlStr = "{ call MVNFORUMPAGEELEMENTS_PRO.GetMVNFORUMPAGEELEMENTS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumpageelements_Dao _obj = new mvnforumpageelements_Dao();
            _obj.setElementid(arr.getInt("ELEMENTID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setContent(arr.getString("CONTENT"));
            _obj.setElementorder(arr.getInt("ELEMENTORDER"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMPAGEELEMENTS返回的查询DataRow创建一个MVNFORUMPAGEELEMENTSEntity对象
* @param MVNFORUMPAGEELEMENTS row
* @returnMVNFORUMPAGEELEMENTSList对象
* @throws Exception 
*/
public List< mvnforumpageelements_Dao> get_mvnforumpageelements_All(String strWhere) throws Exception{
         List<mvnforumpageelements_Dao> _list = new ArrayList<mvnforumpageelements_Dao>();
		 String sqlStr = "{ call MVNFORUMPAGEELEMENTS_PRO.GetMVNFORUMPAGEELEMENTSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumpageelements_Dao _obj = new mvnforumpageelements_Dao();
            _obj.setElementid(arr.getInt("ELEMENTID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setContent(arr.getString("CONTENT"));
            _obj.setElementorder(arr.getInt("ELEMENTORDER"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMPAGEELEMENTS返回 分页数据
* @param MVNFORUMPAGEELEMENTS row
* @returnMVNFORUMPAGEELEMENTSList对象
* @throws Exception 
*/
public List<mvnforumpageelements_Dao> get_mvnforumpageelements_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumpageelements_Dao> _list = new ArrayList<mvnforumpageelements_Dao>();
		String sqlStr = "{ call MVNFORUMPAGEELEMENTS_PRO.GetMVNFORUMPAGEELEMENTSPage(?,?,?,?,?,?)}";
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
				mvnforumpageelements_Dao _obj = new mvnforumpageelements_Dao();
            _obj.setElementid(arr.getInt("ELEMENTID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setContent(arr.getString("CONTENT"));
            _obj.setElementorder(arr.getInt("ELEMENTORDER"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMPAGEELEMENTS返回的查询DataRow创建一个MVNFORUMPAGEELEMENTSEntity对象
* @param MVNFORUMPAGEELEMENTS row
* @returnMVNFORUMPAGEELEMENTSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumpageelements_Dao> get_mvnforumpageelements_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumpageelementsstrWhere") == null) {
			Dictionary<Integer, mvnforumpageelements_Dao> _dic = new Hashtable<Integer, mvnforumpageelements_Dao>();
			List<mvnforumpageelements_Dao> _list = new ArrayList<mvnforumpageelements_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getElementid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumpageelements", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumpageelements_Dao> _dic = (Dictionary<Integer, mvnforumpageelements_Dao>) classFactory
					.cacheGet("dicmvnforumpageelementsstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMPAGEELEMENTS字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumpageelements_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMPAGEELEMENTS_PRO.UpdateFieldMVNFORUMPAGEELEMENTS(?,?)}";
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
* 更新MVNFORUMPAGEELEMENTSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumpageelements_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMPAGEELEMENTS_PRO.UpdateFieldMVNFORUMPAGEELEMENTSV(?,?,?)}";
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
* 更新MVNFORUMPAGEELEMENTSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumpageelements_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMPAGEELEMENTS_PRO.UpdateFieldMVNFORUMPAGEELEMENTSU(?,?,?)}";
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
