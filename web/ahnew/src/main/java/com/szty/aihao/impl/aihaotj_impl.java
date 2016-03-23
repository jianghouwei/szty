/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaotj.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaotj_Dao;
import com.szty.aihao.core.aihaotj_core;
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
*@AIHAOTJ数据接口
*@作者：宋春林 
*/
public class aihaotj_impl implements aihaotj_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaotj_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOTJ实体
* @return 新插入记录的编号
*/
public int insert_aihaotj(aihaotj_Dao _AIHAOTJModel)  throws Exception{
         String sqlStr = "{call AIHAOTJ_PRO.InsertAIHAOTJ(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOTJModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getProductid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getPcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getChannel());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getVer());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getMobile());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getPb());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getPm());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getOs());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getAr());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getC());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getLa());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getLo());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getTj());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOTJModel.getCdate()));
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getCalllist());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOTJ
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaotj(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOTJ_PRO.InsertAIHAOTJ(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
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
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.DATE, dateformat.format(_para[15]));
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_para[16]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOTJ实体
* @return 影响的行数
*/
public int update_aihaotj(aihaotj_Dao _AIHAOTJModel)  throws Exception{
        String sqlStr = "{call AIHAOTJ_PRO.UpdateAIHAOTJ(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOTJModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getProductid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getPcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getChannel());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getVer());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getMobile());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getPb());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getPm());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getOs());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getAr());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getC());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getLa());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getLo());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getTj());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOTJModel.getCdate()));
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AIHAOTJModel.getCalllist());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOTJ中的一条记录
* @param AIHAOTJ实体
* @return 新插入记录的编号
*/
public int delete_aihaotj(int Logid)  throws Exception{
        String sqlStr = "{call AIHAOTJ_PRO.DeleteAIHAOTJ(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Logid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaotj 数据实体
* @param Logid">Logid
* @return<aihaotj 数据实体
* @throws Exception 
*/
public aihaotj_Dao get_aihaotjDao(int Logid) throws Exception{
         String sqlStr = "{ call AIHAOTJ_PRO.GetAIHAOTJEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Logid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaotj_Dao _obj = new aihaotj_Dao();
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
            _obj.setTj(arr.getString("TJ"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setCalllist(arr.getString("CALLLIST"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOTJ返回的查询DataRow创建一个AIHAOTJEntity对象
* @param AIHAOTJ row
* @returnAIHAOTJList对象
* @throws Exception 
*/
public List<aihaotj_Dao> get_aihaotj_All() throws Exception{
        List<aihaotj_Dao> _list = new ArrayList<aihaotj_Dao>();
		String sqlStr = "{ call AIHAOTJ_PRO.GetAIHAOTJ(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaotj_Dao _obj = new aihaotj_Dao();
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
            _obj.setTj(arr.getString("TJ"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setCalllist(arr.getString("CALLLIST"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOTJ返回的查询DataRow创建一个AIHAOTJEntity对象
* @param AIHAOTJ row
* @returnAIHAOTJList对象
* @throws Exception 
*/
public List< aihaotj_Dao> get_aihaotj_All(String strWhere) throws Exception{
         List<aihaotj_Dao> _list = new ArrayList<aihaotj_Dao>();
		 String sqlStr = "{ call AIHAOTJ_PRO.GetAIHAOTJWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaotj_Dao _obj = new aihaotj_Dao();
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
            _obj.setTj(arr.getString("TJ"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setCalllist(arr.getString("CALLLIST"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOTJ返回 分页数据
* @param AIHAOTJ row
* @returnAIHAOTJList对象
* @throws Exception 
*/
public List<aihaotj_Dao> get_aihaotj_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaotj_Dao> _list = new ArrayList<aihaotj_Dao>();
		String sqlStr = "{ call AIHAOTJ_PRO.GetAIHAOTJPage(?,?,?,?,?,?)}";
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
				aihaotj_Dao _obj = new aihaotj_Dao();
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
            _obj.setTj(arr.getString("TJ"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setCalllist(arr.getString("CALLLIST"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOTJ返回的查询DataRow创建一个AIHAOTJEntity对象
* @param AIHAOTJ row
* @returnAIHAOTJDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaotj_Dao> get_aihaotj_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaotjstrWhere") == null) {
			Dictionary<Integer, aihaotj_Dao> _dic = new Hashtable<Integer, aihaotj_Dao>();
			List<aihaotj_Dao> _list = new ArrayList<aihaotj_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLogid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaotj", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaotj_Dao> _dic = (Dictionary<Integer, aihaotj_Dao>) classFactory
					.cacheGet("dicaihaotjstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOTJ字段加一
* @param FieldName
* @param sid
*/
public int create_aihaotj_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOTJ_PRO.UpdateFieldAIHAOTJ(?,?)}";
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
* 更新AIHAOTJInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaotj_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOTJ_PRO.UpdateFieldAIHAOTJV(?,?,?)}";
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
* 更新AIHAOTJIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaotj_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOTJ_PRO.UpdateFieldAIHAOTJU(?,?,?)}";
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
