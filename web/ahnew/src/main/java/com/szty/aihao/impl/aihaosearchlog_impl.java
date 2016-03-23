/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaosearchlog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaosearchlog_Dao;
import com.szty.aihao.core.aihaosearchlog_core;
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
*@AIHAOSEARCHLOG数据接口
*@作者：宋春林 
*/
public class aihaosearchlog_impl implements aihaosearchlog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaosearchlog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOSEARCHLOG实体
* @return 新插入记录的编号
*/
public int insert_aihaosearchlog(aihaosearchlog_Dao _AIHAOSEARCHLOGModel)  throws Exception{
         String sqlStr = "{call AIHAOSEARCHLOG_PRO.InsertAIHAOSEARCHLOG(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[18];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOSEARCHLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getProductid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getPcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getChannel());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getVer());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getMobile());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getPb());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getPm());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getOs());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getAr());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getC());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getLa());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getLo());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getKeywords());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOSEARCHLOGModel.getCdate()));
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_AIHAOSEARCHLOGModel.getTotalreturn());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_AIHAOSEARCHLOGModel.getComefrom());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOSEARCHLOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaosearchlog(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOSEARCHLOG_PRO.InsertAIHAOSEARCHLOG(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[18];
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
        op[15]= new OracleParameter(16, "IN", java.sql.Types.DATE, dateformat.format(_para[15]));
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_para[17]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOSEARCHLOG实体
* @return 影响的行数
*/
public int update_aihaosearchlog(aihaosearchlog_Dao _AIHAOSEARCHLOGModel)  throws Exception{
        String sqlStr = "{call AIHAOSEARCHLOG_PRO.UpdateAIHAOSEARCHLOG(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[18];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOSEARCHLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getProductid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getPcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getChannel());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getVer());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getMobile());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getPb());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getPm());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getOs());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getAr());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getC());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getLa());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getLo());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOSEARCHLOGModel.getKeywords());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOSEARCHLOGModel.getCdate()));
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_AIHAOSEARCHLOGModel.getTotalreturn());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_AIHAOSEARCHLOGModel.getComefrom());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOSEARCHLOG中的一条记录
* @param AIHAOSEARCHLOG实体
* @return 新插入记录的编号
*/
public int delete_aihaosearchlog(int Logid)  throws Exception{
        String sqlStr = "{call AIHAOSEARCHLOG_PRO.DeleteAIHAOSEARCHLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Logid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaosearchlog 数据实体
* @param Logid">Logid
* @return<aihaosearchlog 数据实体
* @throws Exception 
*/
public aihaosearchlog_Dao get_aihaosearchlogDao(int Logid) throws Exception{
         String sqlStr = "{ call AIHAOSEARCHLOG_PRO.GetAIHAOSEARCHLOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Logid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaosearchlog_Dao _obj = new aihaosearchlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
            _obj.setAr(arr.getString("AR"));
            _obj.setC(arr.getString("C"));
            _obj.setLa(arr.getString("LA"));
            _obj.setLo(arr.getString("LO"));
            _obj.setKeywords(arr.getString("KEYWORDS"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setTotalreturn(arr.getInt("TOTALRETURN"));
            _obj.setComefrom(arr.getInt("COMEFROM"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOSEARCHLOG返回的查询DataRow创建一个AIHAOSEARCHLOGEntity对象
* @param AIHAOSEARCHLOG row
* @returnAIHAOSEARCHLOGList对象
* @throws Exception 
*/
public List<aihaosearchlog_Dao> get_aihaosearchlog_All() throws Exception{
        List<aihaosearchlog_Dao> _list = new ArrayList<aihaosearchlog_Dao>();
		String sqlStr = "{ call AIHAOSEARCHLOG_PRO.GetAIHAOSEARCHLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaosearchlog_Dao _obj = new aihaosearchlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
            _obj.setAr(arr.getString("AR"));
            _obj.setC(arr.getString("C"));
            _obj.setLa(arr.getString("LA"));
            _obj.setLo(arr.getString("LO"));
            _obj.setKeywords(arr.getString("KEYWORDS"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setTotalreturn(arr.getInt("TOTALRETURN"));
            _obj.setComefrom(arr.getInt("COMEFROM"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOSEARCHLOG返回的查询DataRow创建一个AIHAOSEARCHLOGEntity对象
* @param AIHAOSEARCHLOG row
* @returnAIHAOSEARCHLOGList对象
* @throws Exception 
*/
public List< aihaosearchlog_Dao> get_aihaosearchlog_All(String strWhere) throws Exception{
         List<aihaosearchlog_Dao> _list = new ArrayList<aihaosearchlog_Dao>();
		 String sqlStr = "{ call AIHAOSEARCHLOG_PRO.GetAIHAOSEARCHLOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaosearchlog_Dao _obj = new aihaosearchlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
            _obj.setAr(arr.getString("AR"));
            _obj.setC(arr.getString("C"));
            _obj.setLa(arr.getString("LA"));
            _obj.setLo(arr.getString("LO"));
            _obj.setKeywords(arr.getString("KEYWORDS"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setTotalreturn(arr.getInt("TOTALRETURN"));
            _obj.setComefrom(arr.getInt("COMEFROM"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOSEARCHLOG返回 分页数据
* @param AIHAOSEARCHLOG row
* @returnAIHAOSEARCHLOGList对象
* @throws Exception 
*/
public List<aihaosearchlog_Dao> get_aihaosearchlog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaosearchlog_Dao> _list = new ArrayList<aihaosearchlog_Dao>();
		String sqlStr = "{ call AIHAOSEARCHLOG_PRO.GetAIHAOSEARCHLOGPage(?,?,?,?,?,?)}";
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
				aihaosearchlog_Dao _obj = new aihaosearchlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
            _obj.setAr(arr.getString("AR"));
            _obj.setC(arr.getString("C"));
            _obj.setLa(arr.getString("LA"));
            _obj.setLo(arr.getString("LO"));
            _obj.setKeywords(arr.getString("KEYWORDS"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setTotalreturn(arr.getInt("TOTALRETURN"));
            _obj.setComefrom(arr.getInt("COMEFROM"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOSEARCHLOG返回的查询DataRow创建一个AIHAOSEARCHLOGEntity对象
* @param AIHAOSEARCHLOG row
* @returnAIHAOSEARCHLOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaosearchlog_Dao> get_aihaosearchlog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaosearchlogstrWhere") == null) {
			Dictionary<Integer, aihaosearchlog_Dao> _dic = new Hashtable<Integer, aihaosearchlog_Dao>();
			List<aihaosearchlog_Dao> _list = new ArrayList<aihaosearchlog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLogid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaosearchlog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaosearchlog_Dao> _dic = (Dictionary<Integer, aihaosearchlog_Dao>) classFactory
					.cacheGet("dicaihaosearchlogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOSEARCHLOG字段加一
* @param FieldName
* @param sid
*/
public int create_aihaosearchlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOSEARCHLOG_PRO.UpdateFieldAIHAOSEARCHLOG(?,?)}";
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
* 更新AIHAOSEARCHLOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaosearchlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOSEARCHLOG_PRO.UpdateFieldAIHAOSEARCHLOGV(?,?,?)}";
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
* 更新AIHAOSEARCHLOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaosearchlog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOSEARCHLOG_PRO.UpdateFieldAIHAOSEARCHLOGU(?,?,?)}";
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
