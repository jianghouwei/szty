﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaomember_bak_130913.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaomember_bak_130913_Dao;
import com.szty.aihao.core.aihaomember_bak_130913_core;
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
*@AIHAOMEMBER_BAK_130913数据接口
*@作者：宋春林 
*/
public class aihaomember_bak_130913_impl implements aihaomember_bak_130913_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaomember_bak_130913_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOMEMBER_BAK_130913实体
* @return 新插入记录的编号
*/
public int insert_aihaomember_bak_130913(aihaomember_bak_130913_Dao _AIHAOMEMBER_BAK_130913Model)  throws Exception{
         String sqlStr = "{call AIHAOMEMBER_BAK_130913_PRO.InsertAIHAOMEMBER_BAK_130913(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[22];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOMEMBER_BAK_130913Model.getMemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getUniquevalue());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getImei());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getProductid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getPcode());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getChannel());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getVer());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getMobile());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getMobilebrand());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getMobilemodels());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getOs());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getBindsinaaccount());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getBindqqspaceaccount());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getBindweixinaccount());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getOtheraccount());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getMembersetupprovince());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getMembersetupcity());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOMEMBER_BAK_130913Model.getMembercreationtime()));
        op[18]= new OracleParameter(19, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOMEMBER_BAK_130913Model.getMembermodifytime()));
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_AIHAOMEMBER_BAK_130913Model.getMemberintegral());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_AIHAOMEMBER_BAK_130913Model.getMemberlevel());
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NUMERIC,_AIHAOMEMBER_BAK_130913Model.getMemberexp());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOMEMBER_BAK_130913
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaomember_bak_130913(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOMEMBER_BAK_130913_PRO.InsertAIHAOMEMBER_BAK_130913(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[22];
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
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.DATE, dateformat.format(_para[17]));
        op[18]= new OracleParameter(19, "IN", java.sql.Types.DATE, dateformat.format(_para[18]));
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_para[19]);
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_para[20]);
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NUMERIC,_para[21]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOMEMBER_BAK_130913实体
* @return 影响的行数
*/
public int update_aihaomember_bak_130913(aihaomember_bak_130913_Dao _AIHAOMEMBER_BAK_130913Model)  throws Exception{
        String sqlStr = "{call AIHAOMEMBER_BAK_130913_PRO.UpdateAIHAOMEMBER_BAK_130913(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[22];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOMEMBER_BAK_130913Model.getMemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getUniquevalue());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getImei());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getProductid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getPcode());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getChannel());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getVer());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getMobile());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getMobilebrand());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getMobilemodels());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getOs());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getBindsinaaccount());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getBindqqspaceaccount());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getBindweixinaccount());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getOtheraccount());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getMembersetupprovince());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AIHAOMEMBER_BAK_130913Model.getMembersetupcity());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOMEMBER_BAK_130913Model.getMembercreationtime()));
        op[18]= new OracleParameter(19, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOMEMBER_BAK_130913Model.getMembermodifytime()));
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_AIHAOMEMBER_BAK_130913Model.getMemberintegral());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_AIHAOMEMBER_BAK_130913Model.getMemberlevel());
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NUMERIC,_AIHAOMEMBER_BAK_130913Model.getMemberexp());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOMEMBER_BAK_130913中的一条记录
* @param AIHAOMEMBER_BAK_130913实体
* @return 新插入记录的编号
*/
public int delete_aihaomember_bak_130913(int Memberid)  throws Exception{
        String sqlStr = "{call AIHAOMEMBER_BAK_130913_PRO.DeleteAIHAOMEMBER_BAK_130913(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Memberid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaomember_bak_130913 数据实体
* @param Memberid">Memberid
* @return<aihaomember_bak_130913 数据实体
* @throws Exception 
*/
public aihaomember_bak_130913_Dao get_aihaomember_bak_130913Dao(int Memberid) throws Exception{
         String sqlStr = "{ call AIHAOMEMBER_BAK_130913_PRO.GetAIHAOMEMBER_BAK_130913Entity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Memberid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaomember_bak_130913_Dao _obj = new aihaomember_bak_130913_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setMobilebrand(arr.getString("MOBILEBRAND"));
            _obj.setMobilemodels(arr.getString("MOBILEMODELS"));
            _obj.setOs(arr.getString("OS"));
            _obj.setBindsinaaccount(arr.getString("BINDSINAACCOUNT"));
            _obj.setBindqqspaceaccount(arr.getString("BINDQQSPACEACCOUNT"));
            _obj.setBindweixinaccount(arr.getString("BINDWEIXINACCOUNT"));
            _obj.setOtheraccount(arr.getString("OTHERACCOUNT"));
            _obj.setMembersetupprovince(arr.getString("MEMBERSETUPPROVINCE"));
            _obj.setMembersetupcity(arr.getString("MEMBERSETUPCITY"));
             try{_obj.setMembercreationtime(dateformat.parse(arr.getString("MEMBERCREATIONTIME")));}catch(Exception ce){_obj.setMembercreationtime((new Date()));}
             try{_obj.setMembermodifytime(dateformat.parse(arr.getString("MEMBERMODIFYTIME")));}catch(Exception ce){_obj.setMembermodifytime((new Date()));}
            _obj.setMemberintegral(arr.getInt("MEMBERINTEGRAL"));
            _obj.setMemberlevel(arr.getInt("MEMBERLEVEL"));
            _obj.setMemberexp(arr.getInt("MEMBEREXP"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOMEMBER_BAK_130913返回的查询DataRow创建一个AIHAOMEMBER_BAK_130913Entity对象
* @param AIHAOMEMBER_BAK_130913 row
* @returnAIHAOMEMBER_BAK_130913List对象
* @throws Exception 
*/
public List<aihaomember_bak_130913_Dao> get_aihaomember_bak_130913_All() throws Exception{
        List<aihaomember_bak_130913_Dao> _list = new ArrayList<aihaomember_bak_130913_Dao>();
		String sqlStr = "{ call AIHAOMEMBER_BAK_130913_PRO.GetAIHAOMEMBER_BAK_130913(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaomember_bak_130913_Dao _obj = new aihaomember_bak_130913_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setMobilebrand(arr.getString("MOBILEBRAND"));
            _obj.setMobilemodels(arr.getString("MOBILEMODELS"));
            _obj.setOs(arr.getString("OS"));
            _obj.setBindsinaaccount(arr.getString("BINDSINAACCOUNT"));
            _obj.setBindqqspaceaccount(arr.getString("BINDQQSPACEACCOUNT"));
            _obj.setBindweixinaccount(arr.getString("BINDWEIXINACCOUNT"));
            _obj.setOtheraccount(arr.getString("OTHERACCOUNT"));
            _obj.setMembersetupprovince(arr.getString("MEMBERSETUPPROVINCE"));
            _obj.setMembersetupcity(arr.getString("MEMBERSETUPCITY"));
            try{_obj.setMembercreationtime(dateformat.parse(arr.getString("MEMBERCREATIONTIME")));}catch(Exception ce){_obj.setMembercreationtime((new Date()));}
            try{_obj.setMembermodifytime(dateformat.parse(arr.getString("MEMBERMODIFYTIME")));}catch(Exception ce){_obj.setMembermodifytime((new Date()));}
            _obj.setMemberintegral(arr.getInt("MEMBERINTEGRAL"));
            _obj.setMemberlevel(arr.getInt("MEMBERLEVEL"));
            _obj.setMemberexp(arr.getInt("MEMBEREXP"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOMEMBER_BAK_130913返回的查询DataRow创建一个AIHAOMEMBER_BAK_130913Entity对象
* @param AIHAOMEMBER_BAK_130913 row
* @returnAIHAOMEMBER_BAK_130913List对象
* @throws Exception 
*/
public List< aihaomember_bak_130913_Dao> get_aihaomember_bak_130913_All(String strWhere) throws Exception{
         List<aihaomember_bak_130913_Dao> _list = new ArrayList<aihaomember_bak_130913_Dao>();
		 String sqlStr = "{ call AIHAOMEMBER_BAK_130913_PRO.GetAIHAOMEMBER_BAK_130913Where(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaomember_bak_130913_Dao _obj = new aihaomember_bak_130913_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setMobilebrand(arr.getString("MOBILEBRAND"));
            _obj.setMobilemodels(arr.getString("MOBILEMODELS"));
            _obj.setOs(arr.getString("OS"));
            _obj.setBindsinaaccount(arr.getString("BINDSINAACCOUNT"));
            _obj.setBindqqspaceaccount(arr.getString("BINDQQSPACEACCOUNT"));
            _obj.setBindweixinaccount(arr.getString("BINDWEIXINACCOUNT"));
            _obj.setOtheraccount(arr.getString("OTHERACCOUNT"));
            _obj.setMembersetupprovince(arr.getString("MEMBERSETUPPROVINCE"));
            _obj.setMembersetupcity(arr.getString("MEMBERSETUPCITY"));
           try{_obj.setMembercreationtime(dateformat.parse(arr.getString("MEMBERCREATIONTIME")));}catch(Exception ce){_obj.setMembercreationtime((new Date()));}
           try{_obj.setMembermodifytime(dateformat.parse(arr.getString("MEMBERMODIFYTIME")));}catch(Exception ce){_obj.setMembermodifytime((new Date()));}
            _obj.setMemberintegral(arr.getInt("MEMBERINTEGRAL"));
            _obj.setMemberlevel(arr.getInt("MEMBERLEVEL"));
            _obj.setMemberexp(arr.getInt("MEMBEREXP"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOMEMBER_BAK_130913返回 分页数据
* @param AIHAOMEMBER_BAK_130913 row
* @returnAIHAOMEMBER_BAK_130913List对象
* @throws Exception 
*/
public List<aihaomember_bak_130913_Dao> get_aihaomember_bak_130913_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaomember_bak_130913_Dao> _list = new ArrayList<aihaomember_bak_130913_Dao>();
		String sqlStr = "{ call AIHAOMEMBER_BAK_130913_PRO.GetAIHAOMEMBER_BAK_130913Page(?,?,?,?,?,?)}";
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
				aihaomember_bak_130913_Dao _obj = new aihaomember_bak_130913_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setMobilebrand(arr.getString("MOBILEBRAND"));
            _obj.setMobilemodels(arr.getString("MOBILEMODELS"));
            _obj.setOs(arr.getString("OS"));
            _obj.setBindsinaaccount(arr.getString("BINDSINAACCOUNT"));
            _obj.setBindqqspaceaccount(arr.getString("BINDQQSPACEACCOUNT"));
            _obj.setBindweixinaccount(arr.getString("BINDWEIXINACCOUNT"));
            _obj.setOtheraccount(arr.getString("OTHERACCOUNT"));
            _obj.setMembersetupprovince(arr.getString("MEMBERSETUPPROVINCE"));
            _obj.setMembersetupcity(arr.getString("MEMBERSETUPCITY"));
            try{_obj.setMembercreationtime(dateformat.parse(arr.getString("MEMBERCREATIONTIME")));}catch(Exception ce){_obj.setMembercreationtime((new Date()));}
            try{_obj.setMembermodifytime(dateformat.parse(arr.getString("MEMBERMODIFYTIME")));}catch(Exception ce){_obj.setMembermodifytime((new Date()));}
            _obj.setMemberintegral(arr.getInt("MEMBERINTEGRAL"));
            _obj.setMemberlevel(arr.getInt("MEMBERLEVEL"));
            _obj.setMemberexp(arr.getInt("MEMBEREXP"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOMEMBER_BAK_130913返回的查询DataRow创建一个AIHAOMEMBER_BAK_130913Entity对象
* @param AIHAOMEMBER_BAK_130913 row
* @returnAIHAOMEMBER_BAK_130913Dictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaomember_bak_130913_Dao> get_aihaomember_bak_130913_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaomember_bak_130913strWhere") == null) {
			Dictionary<Integer, aihaomember_bak_130913_Dao> _dic = new Hashtable<Integer, aihaomember_bak_130913_Dao>();
			List<aihaomember_bak_130913_Dao> _list = new ArrayList<aihaomember_bak_130913_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMemberid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaomember_bak_130913", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaomember_bak_130913_Dao> _dic = (Dictionary<Integer, aihaomember_bak_130913_Dao>) classFactory
					.cacheGet("dicaihaomember_bak_130913strWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOMEMBER_BAK_130913字段加一
* @param FieldName
* @param sid
*/
public int create_aihaomember_bak_130913_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOMEMBER_BAK_130913_PRO.UpdateFieldAIHAOMEMBER_BAK_130913(?,?)}";
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
* 更新AIHAOMEMBER_BAK_130913Int型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaomember_bak_130913_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOMEMBER_BAK_130913_PRO.UpdateFieldAIHAOMEMBER_BAK_130913V(?,?,?)}";
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
* 更新AIHAOMEMBER_BAK_130913IString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaomember_bak_130913_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOMEMBER_BAK_130913_PRO.UpdateFieldAIHAOMEMBER_BAK_130913U(?,?,?)}";
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
