/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaonearsearchlog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaonearsearchlog_Dao;
import com.szty.aihao.core.aihaonearsearchlog_core;
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
*@AIHAONEARSEARCHLOG数据接口
*@作者：宋春林 
*/
public class aihaonearsearchlog_impl implements aihaonearsearchlog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaonearsearchlog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAONEARSEARCHLOG实体
* @return 新插入记录的编号
*/
public int insert_aihaonearsearchlog(aihaonearsearchlog_Dao _AIHAONEARSEARCHLOGModel)  throws Exception{
         String sqlStr = "{call AIHAONEARSEARCHLOG_PRO.InsertAIHAONEARSEARCHLOG(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAONEARSEARCHLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getProductid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getPcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getChannel());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getVer());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getMobile());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getPb());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getPm());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getOs());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getAr());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getC());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getLa());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getLo());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_AIHAONEARSEARCHLOGModel.getLongth());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getBigclass());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.DATE, dateformat.format(_AIHAONEARSEARCHLOGModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAONEARSEARCHLOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaonearsearchlog(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAONEARSEARCHLOG_PRO.InsertAIHAONEARSEARCHLOG(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[17];
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
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.DATE, dateformat.format(_para[16]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAONEARSEARCHLOG实体
* @return 影响的行数
*/
public int update_aihaonearsearchlog(aihaonearsearchlog_Dao _AIHAONEARSEARCHLOGModel)  throws Exception{
        String sqlStr = "{call AIHAONEARSEARCHLOG_PRO.UpdateAIHAONEARSEARCHLOG(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAONEARSEARCHLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getProductid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getPcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getChannel());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getVer());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getMobile());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getPb());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getPm());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getOs());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getAr());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getC());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getLa());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getLo());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_AIHAONEARSEARCHLOGModel.getLongth());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAONEARSEARCHLOGModel.getBigclass());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.DATE, dateformat.format(_AIHAONEARSEARCHLOGModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAONEARSEARCHLOG中的一条记录
* @param AIHAONEARSEARCHLOG实体
* @return 新插入记录的编号
*/
public int delete_aihaonearsearchlog(int Logid)  throws Exception{
        String sqlStr = "{call AIHAONEARSEARCHLOG_PRO.DeleteAIHAONEARSEARCHLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Logid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaonearsearchlog 数据实体
* @param Logid">Logid
* @return<aihaonearsearchlog 数据实体
* @throws Exception 
*/
public aihaonearsearchlog_Dao get_aihaonearsearchlogDao(int Logid) throws Exception{
         String sqlStr = "{ call AIHAONEARSEARCHLOG_PRO.GetAIHAONEARSEARCHLOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Logid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaonearsearchlog_Dao _obj = new aihaonearsearchlog_Dao();
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
            _obj.setLongth(arr.getInt("LONGTH"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据AIHAONEARSEARCHLOG返回的查询DataRow创建一个AIHAONEARSEARCHLOGEntity对象
* @param AIHAONEARSEARCHLOG row
* @returnAIHAONEARSEARCHLOGList对象
* @throws Exception 
*/
public List<aihaonearsearchlog_Dao> get_aihaonearsearchlog_All() throws Exception{
        List<aihaonearsearchlog_Dao> _list = new ArrayList<aihaonearsearchlog_Dao>();
		String sqlStr = "{ call AIHAONEARSEARCHLOG_PRO.GetAIHAONEARSEARCHLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaonearsearchlog_Dao _obj = new aihaonearsearchlog_Dao();
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
            _obj.setLongth(arr.getInt("LONGTH"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAONEARSEARCHLOG返回的查询DataRow创建一个AIHAONEARSEARCHLOGEntity对象
* @param AIHAONEARSEARCHLOG row
* @returnAIHAONEARSEARCHLOGList对象
* @throws Exception 
*/
public List< aihaonearsearchlog_Dao> get_aihaonearsearchlog_All(String strWhere) throws Exception{
         List<aihaonearsearchlog_Dao> _list = new ArrayList<aihaonearsearchlog_Dao>();
		 String sqlStr = "{ call AIHAONEARSEARCHLOG_PRO.GetAIHAONEARSEARCHLOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaonearsearchlog_Dao _obj = new aihaonearsearchlog_Dao();
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
            _obj.setLongth(arr.getInt("LONGTH"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAONEARSEARCHLOG返回 分页数据
* @param AIHAONEARSEARCHLOG row
* @returnAIHAONEARSEARCHLOGList对象
* @throws Exception 
*/
public List<aihaonearsearchlog_Dao> get_aihaonearsearchlog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaonearsearchlog_Dao> _list = new ArrayList<aihaonearsearchlog_Dao>();
		String sqlStr = "{ call AIHAONEARSEARCHLOG_PRO.GetAIHAONEARSEARCHLOGPage(?,?,?,?,?,?)}";
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
				aihaonearsearchlog_Dao _obj = new aihaonearsearchlog_Dao();
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
            _obj.setLongth(arr.getInt("LONGTH"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAONEARSEARCHLOG返回的查询DataRow创建一个AIHAONEARSEARCHLOGEntity对象
* @param AIHAONEARSEARCHLOG row
* @returnAIHAONEARSEARCHLOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaonearsearchlog_Dao> get_aihaonearsearchlog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaonearsearchlogstrWhere") == null) {
			Dictionary<Integer, aihaonearsearchlog_Dao> _dic = new Hashtable<Integer, aihaonearsearchlog_Dao>();
			List<aihaonearsearchlog_Dao> _list = new ArrayList<aihaonearsearchlog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLogid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaonearsearchlog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaonearsearchlog_Dao> _dic = (Dictionary<Integer, aihaonearsearchlog_Dao>) classFactory
					.cacheGet("dicaihaonearsearchlogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAONEARSEARCHLOG字段加一
* @param FieldName
* @param sid
*/
public int create_aihaonearsearchlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAONEARSEARCHLOG_PRO.UpdateFieldAIHAONEARSEARCHLOG(?,?)}";
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
* 更新AIHAONEARSEARCHLOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaonearsearchlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAONEARSEARCHLOG_PRO.UpdateFieldAIHAONEARSEARCHLOGV(?,?,?)}";
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
* 更新AIHAONEARSEARCHLOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaonearsearchlog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAONEARSEARCHLOG_PRO.UpdateFieldAIHAONEARSEARCHLOGU(?,?,?)}";
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
