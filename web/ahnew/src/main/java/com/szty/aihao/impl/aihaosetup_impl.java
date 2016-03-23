/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaosetup.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaosetup_Dao;
import com.szty.aihao.core.aihaosetup_core;
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
*@AIHAOSETUP数据接口
*@作者：宋春林 
*/
public class aihaosetup_impl implements aihaosetup_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaosetup_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOSETUP实体
* @return 新插入记录的编号
*/
public int insert_aihaosetup(aihaosetup_Dao _AIHAOSETUPModel)  throws Exception{
         String sqlStr = "{call AIHAOSETUP_PRO.InsertAIHAOSETUP(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOSETUPModel.getSetupid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getProductid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getPcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getChannel());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getVer());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getMobile());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getPb());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getPm());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getOs());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOSETUPModel.getCdate()));
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getImei());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOSETUP
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaosetup(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOSETUP_PRO.InsertAIHAOSETUP(?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[12];
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
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_para[10]));
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOSETUP实体
* @return 影响的行数
*/
public int update_aihaosetup(aihaosetup_Dao _AIHAOSETUPModel)  throws Exception{
        String sqlStr = "{call AIHAOSETUP_PRO.UpdateAIHAOSETUP(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOSETUPModel.getSetupid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getProductid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getPcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getChannel());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getVer());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getMobile());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getPb());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getPm());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getOs());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOSETUPModel.getCdate()));
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOSETUPModel.getImei());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOSETUP中的一条记录
* @param AIHAOSETUP实体
* @return 新插入记录的编号
*/
public int delete_aihaosetup(int Setupid)  throws Exception{
        String sqlStr = "{call AIHAOSETUP_PRO.DeleteAIHAOSETUP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Setupid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaosetup 数据实体
* @param Setupid">Setupid
* @return<aihaosetup 数据实体
* @throws Exception 
*/
public aihaosetup_Dao get_aihaosetupDao(int Setupid) throws Exception{
         String sqlStr = "{ call AIHAOSETUP_PRO.GetAIHAOSETUPEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Setupid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaosetup_Dao _obj = new aihaosetup_Dao();
            _obj.setSetupid(arr.getInt("SETUPID"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setImei(arr.getString("IMEI"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOSETUP返回的查询DataRow创建一个AIHAOSETUPEntity对象
* @param AIHAOSETUP row
* @returnAIHAOSETUPList对象
* @throws Exception 
*/
public List<aihaosetup_Dao> get_aihaosetup_All() throws Exception{
        List<aihaosetup_Dao> _list = new ArrayList<aihaosetup_Dao>();
		String sqlStr = "{ call AIHAOSETUP_PRO.GetAIHAOSETUP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaosetup_Dao _obj = new aihaosetup_Dao();
            _obj.setSetupid(arr.getInt("SETUPID"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setImei(arr.getString("IMEI"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOSETUP返回的查询DataRow创建一个AIHAOSETUPEntity对象
* @param AIHAOSETUP row
* @returnAIHAOSETUPList对象
* @throws Exception 
*/
public List< aihaosetup_Dao> get_aihaosetup_All(String strWhere) throws Exception{
         List<aihaosetup_Dao> _list = new ArrayList<aihaosetup_Dao>();
		 String sqlStr = "{ call AIHAOSETUP_PRO.GetAIHAOSETUPWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaosetup_Dao _obj = new aihaosetup_Dao();
            _obj.setSetupid(arr.getInt("SETUPID"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setImei(arr.getString("IMEI"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOSETUP返回 分页数据
* @param AIHAOSETUP row
* @returnAIHAOSETUPList对象
* @throws Exception 
*/
public List<aihaosetup_Dao> get_aihaosetup_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaosetup_Dao> _list = new ArrayList<aihaosetup_Dao>();
		String sqlStr = "{ call AIHAOSETUP_PRO.GetAIHAOSETUPPage(?,?,?,?,?,?)}";
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
				aihaosetup_Dao _obj = new aihaosetup_Dao();
            _obj.setSetupid(arr.getInt("SETUPID"));
            _obj.setProductid(arr.getString("PRODUCTID"));
            _obj.setPcode(arr.getString("PCODE"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVer(arr.getString("VER"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPb(arr.getString("PB"));
            _obj.setPm(arr.getString("PM"));
            _obj.setOs(arr.getString("OS"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setImei(arr.getString("IMEI"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOSETUP返回的查询DataRow创建一个AIHAOSETUPEntity对象
* @param AIHAOSETUP row
* @returnAIHAOSETUPDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaosetup_Dao> get_aihaosetup_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaosetupstrWhere") == null) {
			Dictionary<Integer, aihaosetup_Dao> _dic = new Hashtable<Integer, aihaosetup_Dao>();
			List<aihaosetup_Dao> _list = new ArrayList<aihaosetup_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getSetupid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaosetup", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaosetup_Dao> _dic = (Dictionary<Integer, aihaosetup_Dao>) classFactory
					.cacheGet("dicaihaosetupstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOSETUP字段加一
* @param FieldName
* @param sid
*/
public int create_aihaosetup_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOSETUP_PRO.UpdateFieldAIHAOSETUP(?,?)}";
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
* 更新AIHAOSETUPInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaosetup_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOSETUP_PRO.UpdateFieldAIHAOSETUPV(?,?,?)}";
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
* 更新AIHAOSETUPIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaosetup_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOSETUP_PRO.UpdateFieldAIHAOSETUPU(?,?,?)}";
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
