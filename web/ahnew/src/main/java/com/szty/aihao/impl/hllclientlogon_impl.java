/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataHllclientlogon.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.hllclientlogon_Dao;
import com.szty.aihao.core.hllclientlogon_core;
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
*@HLLCLIENTLOGON数据接口
*@作者：宋春林 
*/
public class hllclientlogon_impl implements hllclientlogon_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(hllclientlogon_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param HLLCLIENTLOGON实体
* @return 新插入记录的编号
*/
public int insert_hllclientlogon(hllclientlogon_Dao _HLLCLIENTLOGONModel)  throws Exception{
         String sqlStr = "{call HLLCLIENTLOGON_PRO.InsertHLLCLIENTLOGON(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_HLLCLIENTLOGONModel.getLogonid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_HLLCLIENTLOGONModel.getImsi());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_HLLCLIENTLOGONModel.getOperatingsystem());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_HLLCLIENTLOGONModel.getWebunionid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_HLLCLIENTLOGONModel.getLogoncreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param HLLCLIENTLOGON
* @Object 
* @return 新插入记录的编号
*/
public int insert_hllclientlogon(Object[] _para)  throws Exception{
      String sqlStr = "{call HLLCLIENTLOGON_PRO.InsertHLLCLIENTLOGON(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param HLLCLIENTLOGON实体
* @return 影响的行数
*/
public int update_hllclientlogon(hllclientlogon_Dao _HLLCLIENTLOGONModel)  throws Exception{
        String sqlStr = "{call HLLCLIENTLOGON_PRO.UpdateHLLCLIENTLOGON(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_HLLCLIENTLOGONModel.getLogonid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_HLLCLIENTLOGONModel.getImsi());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_HLLCLIENTLOGONModel.getOperatingsystem());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_HLLCLIENTLOGONModel.getWebunionid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_HLLCLIENTLOGONModel.getLogoncreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表HLLCLIENTLOGON中的一条记录
* @param HLLCLIENTLOGON实体
* @return 新插入记录的编号
*/
public int delete_hllclientlogon(int Logonid)  throws Exception{
        String sqlStr = "{call HLLCLIENTLOGON_PRO.DeleteHLLCLIENTLOGON(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Logonid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 hllclientlogon 数据实体
* @param Logonid">Logonid
* @return<hllclientlogon 数据实体
* @throws Exception 
*/
public hllclientlogon_Dao get_hllclientlogonDao(int Logonid) throws Exception{
         String sqlStr = "{ call HLLCLIENTLOGON_PRO.GetHLLCLIENTLOGONEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Logonid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			hllclientlogon_Dao _obj = new hllclientlogon_Dao();
            _obj.setLogonid(arr.getInt("LOGONID"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setWebunionid(arr.getString("WEBUNIONID"));
             try{_obj.setLogoncreationdate(dateformat.parse(arr.getString("LOGONCREATIONDATE")));}catch(Exception ce){_obj.setLogoncreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据HLLCLIENTLOGON返回的查询DataRow创建一个HLLCLIENTLOGONEntity对象
* @param HLLCLIENTLOGON row
* @returnHLLCLIENTLOGONList对象
* @throws Exception 
*/
public List<hllclientlogon_Dao> get_hllclientlogon_All() throws Exception{
        List<hllclientlogon_Dao> _list = new ArrayList<hllclientlogon_Dao>();
		String sqlStr = "{ call HLLCLIENTLOGON_PRO.GetHLLCLIENTLOGON(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			hllclientlogon_Dao _obj = new hllclientlogon_Dao();
            _obj.setLogonid(arr.getInt("LOGONID"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setWebunionid(arr.getString("WEBUNIONID"));
            try{_obj.setLogoncreationdate(dateformat.parse(arr.getString("LOGONCREATIONDATE")));}catch(Exception ce){_obj.setLogoncreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据HLLCLIENTLOGON返回的查询DataRow创建一个HLLCLIENTLOGONEntity对象
* @param HLLCLIENTLOGON row
* @returnHLLCLIENTLOGONList对象
* @throws Exception 
*/
public List< hllclientlogon_Dao> get_hllclientlogon_All(String strWhere) throws Exception{
         List<hllclientlogon_Dao> _list = new ArrayList<hllclientlogon_Dao>();
		 String sqlStr = "{ call HLLCLIENTLOGON_PRO.GetHLLCLIENTLOGONWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				hllclientlogon_Dao _obj = new hllclientlogon_Dao();
            _obj.setLogonid(arr.getInt("LOGONID"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setWebunionid(arr.getString("WEBUNIONID"));
           try{_obj.setLogoncreationdate(dateformat.parse(arr.getString("LOGONCREATIONDATE")));}catch(Exception ce){_obj.setLogoncreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据HLLCLIENTLOGON返回 分页数据
* @param HLLCLIENTLOGON row
* @returnHLLCLIENTLOGONList对象
* @throws Exception 
*/
public List<hllclientlogon_Dao> get_hllclientlogon_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<hllclientlogon_Dao> _list = new ArrayList<hllclientlogon_Dao>();
		String sqlStr = "{ call HLLCLIENTLOGON_PRO.GetHLLCLIENTLOGONPage(?,?,?,?,?,?)}";
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
				hllclientlogon_Dao _obj = new hllclientlogon_Dao();
            _obj.setLogonid(arr.getInt("LOGONID"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setWebunionid(arr.getString("WEBUNIONID"));
            try{_obj.setLogoncreationdate(dateformat.parse(arr.getString("LOGONCREATIONDATE")));}catch(Exception ce){_obj.setLogoncreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据HLLCLIENTLOGON返回的查询DataRow创建一个HLLCLIENTLOGONEntity对象
* @param HLLCLIENTLOGON row
* @returnHLLCLIENTLOGONDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, hllclientlogon_Dao> get_hllclientlogon_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dichllclientlogonstrWhere") == null) {
			Dictionary<Integer, hllclientlogon_Dao> _dic = new Hashtable<Integer, hllclientlogon_Dao>();
			List<hllclientlogon_Dao> _list = new ArrayList<hllclientlogon_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLogonid()), _list.get(i));
			}
			classFactory.cachePut("dichllclientlogon", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, hllclientlogon_Dao> _dic = (Dictionary<Integer, hllclientlogon_Dao>) classFactory
					.cacheGet("dichllclientlogonstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新HLLCLIENTLOGON字段加一
* @param FieldName
* @param sid
*/
public int create_hllclientlogon_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call HLLCLIENTLOGON_PRO.UpdateFieldHLLCLIENTLOGON(?,?)}";
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
* 更新HLLCLIENTLOGONInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_hllclientlogon_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call HLLCLIENTLOGON_PRO.UpdateFieldHLLCLIENTLOGONV(?,?,?)}";
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
* 更新HLLCLIENTLOGONIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_hllclientlogon_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call HLLCLIENTLOGON_PRO.UpdateFieldHLLCLIENTLOGONU(?,?,?)}";
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
