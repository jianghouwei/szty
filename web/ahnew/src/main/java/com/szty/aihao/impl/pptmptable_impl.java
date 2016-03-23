/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataPptmptable.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.pptmptable_Dao;
import com.szty.aihao.core.pptmptable_core;
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
*@PPTMPTABLE数据接口
*@作者：宋春林 
*/
public class pptmptable_impl implements pptmptable_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(pptmptable_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param PPTMPTABLE实体
* @return 新插入记录的编号
*/
public int insert_pptmptable(pptmptable_Dao _PPTMPTABLEModel)  throws Exception{
         String sqlStr = "{call PPTMPTABLE_PRO.InsertPPTMPTABLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[14];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_PPTMPTABLEModel.getBid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getCity());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getAddress());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getPpcphone());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getLaln());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getBigclass());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getLat());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getLng());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getBaidulat());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getBaidulng());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_PPTMPTABLEModel.getProvinceid());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_PPTMPTABLEModel.getCityid());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getGeohas());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param PPTMPTABLE
* @Object 
* @return 新插入记录的编号
*/
public int insert_pptmptable(Object[] _para)  throws Exception{
      String sqlStr = "{call PPTMPTABLE_PRO.InsertPPTMPTABLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[14];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param PPTMPTABLE实体
* @return 影响的行数
*/
public int update_pptmptable(pptmptable_Dao _PPTMPTABLEModel)  throws Exception{
        String sqlStr = "{call PPTMPTABLE_PRO.UpdatePPTMPTABLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[14];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getBid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getCity());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getAddress());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getPpcphone());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getLaln());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getBigclass());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getLat());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getLng());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getBaidulat());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getBaidulng());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_PPTMPTABLEModel.getProvinceid());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_PPTMPTABLEModel.getCityid());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_PPTMPTABLEModel.getGeohas());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表PPTMPTABLE中的一条记录
* @param PPTMPTABLE实体
* @return 新插入记录的编号
*/
public int delete_pptmptable(int Bid)  throws Exception{
        String sqlStr = "{call PPTMPTABLE_PRO.DeletePPTMPTABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Bid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 pptmptable 数据实体
* @param Bid">Bid
* @return<pptmptable 数据实体
* @throws Exception 
*/
public pptmptable_Dao get_pptmptableDao(int Bid) throws Exception{
         String sqlStr = "{ call PPTMPTABLE_PRO.GetPPTMPTABLEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Bid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			pptmptable_Dao _obj = new pptmptable_Dao();
            _obj.setBid(arr.getString("BID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setPpcphone(arr.getString("PPCPHONE"));
            _obj.setLaln(arr.getString("LALN"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setLat(arr.getString("LAT"));
            _obj.setLng(arr.getString("LNG"));
            _obj.setBaidulat(arr.getString("BAIDULAT"));
            _obj.setBaidulng(arr.getString("BAIDULNG"));
            _obj.setProvinceid(arr.getInt("PROVINCEID"));
            _obj.setCityid(arr.getInt("CITYID"));
            _obj.setGeohas(arr.getString("GEOHAS"));
			return _obj;
		}
		return null;

}

/**
* 根据PPTMPTABLE返回的查询DataRow创建一个PPTMPTABLEEntity对象
* @param PPTMPTABLE row
* @returnPPTMPTABLEList对象
* @throws Exception 
*/
public List<pptmptable_Dao> get_pptmptable_All() throws Exception{
        List<pptmptable_Dao> _list = new ArrayList<pptmptable_Dao>();
		String sqlStr = "{ call PPTMPTABLE_PRO.GetPPTMPTABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			pptmptable_Dao _obj = new pptmptable_Dao();
            _obj.setBid(arr.getString("BID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setPpcphone(arr.getString("PPCPHONE"));
            _obj.setLaln(arr.getString("LALN"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setLat(arr.getString("LAT"));
            _obj.setLng(arr.getString("LNG"));
            _obj.setBaidulat(arr.getString("BAIDULAT"));
            _obj.setBaidulng(arr.getString("BAIDULNG"));
            _obj.setProvinceid(arr.getInt("PROVINCEID"));
            _obj.setCityid(arr.getInt("CITYID"));
            _obj.setGeohas(arr.getString("GEOHAS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据PPTMPTABLE返回的查询DataRow创建一个PPTMPTABLEEntity对象
* @param PPTMPTABLE row
* @returnPPTMPTABLEList对象
* @throws Exception 
*/
public List< pptmptable_Dao> get_pptmptable_All(String strWhere) throws Exception{
         List<pptmptable_Dao> _list = new ArrayList<pptmptable_Dao>();
		 String sqlStr = "{ call PPTMPTABLE_PRO.GetPPTMPTABLEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				pptmptable_Dao _obj = new pptmptable_Dao();
            _obj.setBid(arr.getString("BID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setPpcphone(arr.getString("PPCPHONE"));
            _obj.setLaln(arr.getString("LALN"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setLat(arr.getString("LAT"));
            _obj.setLng(arr.getString("LNG"));
            _obj.setBaidulat(arr.getString("BAIDULAT"));
            _obj.setBaidulng(arr.getString("BAIDULNG"));
            _obj.setProvinceid(arr.getInt("PROVINCEID"));
            _obj.setCityid(arr.getInt("CITYID"));
            _obj.setGeohas(arr.getString("GEOHAS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据PPTMPTABLE返回 分页数据
* @param PPTMPTABLE row
* @returnPPTMPTABLEList对象
* @throws Exception 
*/
public List<pptmptable_Dao> get_pptmptable_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<pptmptable_Dao> _list = new ArrayList<pptmptable_Dao>();
		String sqlStr = "{ call PPTMPTABLE_PRO.GetPPTMPTABLEPage(?,?,?,?,?,?)}";
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
				pptmptable_Dao _obj = new pptmptable_Dao();
            _obj.setBid(arr.getString("BID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setPpcphone(arr.getString("PPCPHONE"));
            _obj.setLaln(arr.getString("LALN"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setLat(arr.getString("LAT"));
            _obj.setLng(arr.getString("LNG"));
            _obj.setBaidulat(arr.getString("BAIDULAT"));
            _obj.setBaidulng(arr.getString("BAIDULNG"));
            _obj.setProvinceid(arr.getInt("PROVINCEID"));
            _obj.setCityid(arr.getInt("CITYID"));
            _obj.setGeohas(arr.getString("GEOHAS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据PPTMPTABLE返回的查询DataRow创建一个PPTMPTABLEEntity对象
* @param PPTMPTABLE row
* @returnPPTMPTABLEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, pptmptable_Dao> get_pptmptable_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicpptmptablestrWhere") == null) {
			Dictionary<Integer, pptmptable_Dao> _dic = new Hashtable<Integer, pptmptable_Dao>();
			List<pptmptable_Dao> _list = new ArrayList<pptmptable_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getBid()), _list.get(i));
			}
			classFactory.cachePut("dicpptmptable", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, pptmptable_Dao> _dic = (Dictionary<Integer, pptmptable_Dao>) classFactory
					.cacheGet("dicpptmptablestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新PPTMPTABLE字段加一
* @param FieldName
* @param sid
*/
public int create_pptmptable_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call PPTMPTABLE_PRO.UpdateFieldPPTMPTABLE(?,?)}";
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
* 更新PPTMPTABLEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_pptmptable_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call PPTMPTABLE_PRO.UpdateFieldPPTMPTABLEV(?,?,?)}";
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
* 更新PPTMPTABLEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_pptmptable_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call PPTMPTABLE_PRO.UpdateFieldPPTMPTABLEU(?,?,?)}";
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
