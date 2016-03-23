/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataErrcorrecttable.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.errcorrecttable_Dao;
import com.szty.aihao.core.errcorrecttable_core;
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
*@ERRCORRECTTABLE数据接口
*@作者：宋春林 
*/
public class errcorrecttable_impl implements errcorrecttable_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(errcorrecttable_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param ERRCORRECTTABLE实体
* @return 新插入记录的编号
*/
public int insert_errcorrecttable(errcorrecttable_Dao _ERRCORRECTTABLEModel)  throws Exception{
         String sqlStr = "{call ERRCORRECTTABLE_PRO.InsertERRCORRECTTABLE(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[13];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_ERRCORRECTTABLEModel.getErrorid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantmobile());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantaddress());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantlat());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantlng());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantother());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_ERRCORRECTTABLEModel.getClientos());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getErrorcreatemobile());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_ERRCORRECTTABLEModel.getCdate()));
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_ERRCORRECTTABLEModel.getUdate()));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_ERRCORRECTTABLEModel.getCheckstatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param ERRCORRECTTABLE
* @Object 
* @return 新插入记录的编号
*/
public int insert_errcorrecttable(Object[] _para)  throws Exception{
      String sqlStr = "{call ERRCORRECTTABLE_PRO.InsertERRCORRECTTABLE(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[13];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_para[10]));
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_para[11]));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_para[12]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param ERRCORRECTTABLE实体
* @return 影响的行数
*/
public int update_errcorrecttable(errcorrecttable_Dao _ERRCORRECTTABLEModel)  throws Exception{
        String sqlStr = "{call ERRCORRECTTABLE_PRO.UpdateERRCORRECTTABLE(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[13];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_ERRCORRECTTABLEModel.getErrorid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantmobile());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantaddress());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantlat());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantlng());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getMerchantother());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_ERRCORRECTTABLEModel.getClientos());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_ERRCORRECTTABLEModel.getErrorcreatemobile());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_ERRCORRECTTABLEModel.getCdate()));
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_ERRCORRECTTABLEModel.getUdate()));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_ERRCORRECTTABLEModel.getCheckstatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表ERRCORRECTTABLE中的一条记录
* @param ERRCORRECTTABLE实体
* @return 新插入记录的编号
*/
public int delete_errcorrecttable(int Errorid)  throws Exception{
        String sqlStr = "{call ERRCORRECTTABLE_PRO.DeleteERRCORRECTTABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Errorid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 errcorrecttable 数据实体
* @param Errorid">Errorid
* @return<errcorrecttable 数据实体
* @throws Exception 
*/
public errcorrecttable_Dao get_errcorrecttableDao(int Errorid) throws Exception{
         String sqlStr = "{ call ERRCORRECTTABLE_PRO.GetERRCORRECTTABLEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Errorid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			errcorrecttable_Dao _obj = new errcorrecttable_Dao();
            _obj.setErrorid(arr.getInt("ERRORID"));
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantmobile(arr.getString("MERCHANTMOBILE"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setMerchantlat(arr.getString("MERCHANTLAT"));
            _obj.setMerchantlng(arr.getString("MERCHANTLNG"));
            _obj.setMerchantother(arr.getString("MERCHANTOTHER"));
            _obj.setClientos(arr.getInt("CLIENTOS"));
            _obj.setErrorcreatemobile(arr.getString("ERRORCREATEMOBILE"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
             try{_obj.setUdate(dateformat.parse(arr.getString("UDATE")));}catch(Exception ce){_obj.setUdate((new Date()));}
            _obj.setCheckstatus(arr.getInt("CHECKSTATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据ERRCORRECTTABLE返回的查询DataRow创建一个ERRCORRECTTABLEEntity对象
* @param ERRCORRECTTABLE row
* @returnERRCORRECTTABLEList对象
* @throws Exception 
*/
public List<errcorrecttable_Dao> get_errcorrecttable_All() throws Exception{
        List<errcorrecttable_Dao> _list = new ArrayList<errcorrecttable_Dao>();
		String sqlStr = "{ call ERRCORRECTTABLE_PRO.GetERRCORRECTTABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			errcorrecttable_Dao _obj = new errcorrecttable_Dao();
            _obj.setErrorid(arr.getInt("ERRORID"));
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantmobile(arr.getString("MERCHANTMOBILE"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setMerchantlat(arr.getString("MERCHANTLAT"));
            _obj.setMerchantlng(arr.getString("MERCHANTLNG"));
            _obj.setMerchantother(arr.getString("MERCHANTOTHER"));
            _obj.setClientos(arr.getInt("CLIENTOS"));
            _obj.setErrorcreatemobile(arr.getString("ERRORCREATEMOBILE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            try{_obj.setUdate(dateformat.parse(arr.getString("UDATE")));}catch(Exception ce){_obj.setUdate((new Date()));}
            _obj.setCheckstatus(arr.getInt("CHECKSTATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据ERRCORRECTTABLE返回的查询DataRow创建一个ERRCORRECTTABLEEntity对象
* @param ERRCORRECTTABLE row
* @returnERRCORRECTTABLEList对象
* @throws Exception 
*/
public List< errcorrecttable_Dao> get_errcorrecttable_All(String strWhere) throws Exception{
         List<errcorrecttable_Dao> _list = new ArrayList<errcorrecttable_Dao>();
		 String sqlStr = "{ call ERRCORRECTTABLE_PRO.GetERRCORRECTTABLEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				errcorrecttable_Dao _obj = new errcorrecttable_Dao();
            _obj.setErrorid(arr.getInt("ERRORID"));
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantmobile(arr.getString("MERCHANTMOBILE"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setMerchantlat(arr.getString("MERCHANTLAT"));
            _obj.setMerchantlng(arr.getString("MERCHANTLNG"));
            _obj.setMerchantother(arr.getString("MERCHANTOTHER"));
            _obj.setClientos(arr.getInt("CLIENTOS"));
            _obj.setErrorcreatemobile(arr.getString("ERRORCREATEMOBILE"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
           try{_obj.setUdate(dateformat.parse(arr.getString("UDATE")));}catch(Exception ce){_obj.setUdate((new Date()));}
            _obj.setCheckstatus(arr.getInt("CHECKSTATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据ERRCORRECTTABLE返回 分页数据
* @param ERRCORRECTTABLE row
* @returnERRCORRECTTABLEList对象
* @throws Exception 
*/
public List<errcorrecttable_Dao> get_errcorrecttable_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<errcorrecttable_Dao> _list = new ArrayList<errcorrecttable_Dao>();
		String sqlStr = "{ call ERRCORRECTTABLE_PRO.GetERRCORRECTTABLEPage(?,?,?,?,?,?)}";
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
				errcorrecttable_Dao _obj = new errcorrecttable_Dao();
            _obj.setErrorid(arr.getInt("ERRORID"));
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantmobile(arr.getString("MERCHANTMOBILE"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setMerchantlat(arr.getString("MERCHANTLAT"));
            _obj.setMerchantlng(arr.getString("MERCHANTLNG"));
            _obj.setMerchantother(arr.getString("MERCHANTOTHER"));
            _obj.setClientos(arr.getInt("CLIENTOS"));
            _obj.setErrorcreatemobile(arr.getString("ERRORCREATEMOBILE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            try{_obj.setUdate(dateformat.parse(arr.getString("UDATE")));}catch(Exception ce){_obj.setUdate((new Date()));}
            _obj.setCheckstatus(arr.getInt("CHECKSTATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据ERRCORRECTTABLE返回的查询DataRow创建一个ERRCORRECTTABLEEntity对象
* @param ERRCORRECTTABLE row
* @returnERRCORRECTTABLEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, errcorrecttable_Dao> get_errcorrecttable_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicerrcorrecttablestrWhere") == null) {
			Dictionary<Integer, errcorrecttable_Dao> _dic = new Hashtable<Integer, errcorrecttable_Dao>();
			List<errcorrecttable_Dao> _list = new ArrayList<errcorrecttable_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getErrorid()), _list.get(i));
			}
			classFactory.cachePut("dicerrcorrecttable", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, errcorrecttable_Dao> _dic = (Dictionary<Integer, errcorrecttable_Dao>) classFactory
					.cacheGet("dicerrcorrecttablestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新ERRCORRECTTABLE字段加一
* @param FieldName
* @param sid
*/
public int create_errcorrecttable_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call ERRCORRECTTABLE_PRO.UpdateFieldERRCORRECTTABLE(?,?)}";
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
* 更新ERRCORRECTTABLEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_errcorrecttable_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call ERRCORRECTTABLE_PRO.UpdateFieldERRCORRECTTABLEV(?,?,?)}";
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
* 更新ERRCORRECTTABLEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_errcorrecttable_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call ERRCORRECTTABLE_PRO.UpdateFieldERRCORRECTTABLEU(?,?,?)}";
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
