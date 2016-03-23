/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumsymbus.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumsymbus_Dao;
import com.szty.aihao.core.mvnforumsymbus_core;
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
*@MVNFORUMSYMBUS数据接口
*@作者：宋春林 
*/
public class mvnforumsymbus_impl implements mvnforumsymbus_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumsymbus_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSYMBUS实体
* @return 新插入记录的编号
*/
public int insert_mvnforumsymbus(mvnforumsymbus_Dao _MVNFORUMSYMBUSModel)  throws Exception{
         String sqlStr = "{call MVNFORUMSYMBUS_PRO.InsertMVNFORUMSYMBUS(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMSYMBUSModel.getBusid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getContentid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getImei());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getImsi());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getCid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getPid());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getSid());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getVer());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getRet());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSYMBUSModel.getBuscreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSYMBUS
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumsymbus(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMSYMBUS_PRO.InsertMVNFORUMSYMBUS(?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[10];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_para[9]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMSYMBUS实体
* @return 影响的行数
*/
public int update_mvnforumsymbus(mvnforumsymbus_Dao _MVNFORUMSYMBUSModel)  throws Exception{
        String sqlStr = "{call MVNFORUMSYMBUS_PRO.UpdateMVNFORUMSYMBUS(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMSYMBUSModel.getBusid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getContentid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getImei());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getImsi());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getCid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getPid());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getSid());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getVer());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMBUSModel.getRet());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSYMBUSModel.getBuscreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMSYMBUS中的一条记录
* @param MVNFORUMSYMBUS实体
* @return 新插入记录的编号
*/
public int delete_mvnforumsymbus(int Busid)  throws Exception{
        String sqlStr = "{call MVNFORUMSYMBUS_PRO.DeleteMVNFORUMSYMBUS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Busid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumsymbus 数据实体
* @param Busid">Busid
* @return<mvnforumsymbus 数据实体
* @throws Exception 
*/
public mvnforumsymbus_Dao get_mvnforumsymbusDao(int Busid) throws Exception{
         String sqlStr = "{ call MVNFORUMSYMBUS_PRO.GetMVNFORUMSYMBUSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Busid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsymbus_Dao _obj = new mvnforumsymbus_Dao();
            _obj.setBusid(arr.getInt("BUSID"));
            _obj.setContentid(arr.getString("CONTENTID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setCid(arr.getString("CID"));
            _obj.setPid(arr.getString("PID"));
            _obj.setSid(arr.getString("SID"));
            _obj.setVer(arr.getString("VER"));
            _obj.setRet(arr.getString("RET"));
             try{_obj.setBuscreationdate(dateformat.parse(arr.getString("BUSCREATIONDATE")));}catch(Exception ce){_obj.setBuscreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMSYMBUS返回的查询DataRow创建一个MVNFORUMSYMBUSEntity对象
* @param MVNFORUMSYMBUS row
* @returnMVNFORUMSYMBUSList对象
* @throws Exception 
*/
public List<mvnforumsymbus_Dao> get_mvnforumsymbus_All() throws Exception{
        List<mvnforumsymbus_Dao> _list = new ArrayList<mvnforumsymbus_Dao>();
		String sqlStr = "{ call MVNFORUMSYMBUS_PRO.GetMVNFORUMSYMBUS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsymbus_Dao _obj = new mvnforumsymbus_Dao();
            _obj.setBusid(arr.getInt("BUSID"));
            _obj.setContentid(arr.getString("CONTENTID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setCid(arr.getString("CID"));
            _obj.setPid(arr.getString("PID"));
            _obj.setSid(arr.getString("SID"));
            _obj.setVer(arr.getString("VER"));
            _obj.setRet(arr.getString("RET"));
            try{_obj.setBuscreationdate(dateformat.parse(arr.getString("BUSCREATIONDATE")));}catch(Exception ce){_obj.setBuscreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMSYMBUS返回的查询DataRow创建一个MVNFORUMSYMBUSEntity对象
* @param MVNFORUMSYMBUS row
* @returnMVNFORUMSYMBUSList对象
* @throws Exception 
*/
public List< mvnforumsymbus_Dao> get_mvnforumsymbus_All(String strWhere) throws Exception{
         List<mvnforumsymbus_Dao> _list = new ArrayList<mvnforumsymbus_Dao>();
		 String sqlStr = "{ call MVNFORUMSYMBUS_PRO.GetMVNFORUMSYMBUSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumsymbus_Dao _obj = new mvnforumsymbus_Dao();
            _obj.setBusid(arr.getInt("BUSID"));
            _obj.setContentid(arr.getString("CONTENTID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setCid(arr.getString("CID"));
            _obj.setPid(arr.getString("PID"));
            _obj.setSid(arr.getString("SID"));
            _obj.setVer(arr.getString("VER"));
            _obj.setRet(arr.getString("RET"));
           try{_obj.setBuscreationdate(dateformat.parse(arr.getString("BUSCREATIONDATE")));}catch(Exception ce){_obj.setBuscreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMSYMBUS返回 分页数据
* @param MVNFORUMSYMBUS row
* @returnMVNFORUMSYMBUSList对象
* @throws Exception 
*/
public List<mvnforumsymbus_Dao> get_mvnforumsymbus_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumsymbus_Dao> _list = new ArrayList<mvnforumsymbus_Dao>();
		String sqlStr = "{ call MVNFORUMSYMBUS_PRO.GetMVNFORUMSYMBUSPage(?,?,?,?,?,?)}";
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
				mvnforumsymbus_Dao _obj = new mvnforumsymbus_Dao();
            _obj.setBusid(arr.getInt("BUSID"));
            _obj.setContentid(arr.getString("CONTENTID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setCid(arr.getString("CID"));
            _obj.setPid(arr.getString("PID"));
            _obj.setSid(arr.getString("SID"));
            _obj.setVer(arr.getString("VER"));
            _obj.setRet(arr.getString("RET"));
            try{_obj.setBuscreationdate(dateformat.parse(arr.getString("BUSCREATIONDATE")));}catch(Exception ce){_obj.setBuscreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMSYMBUS返回的查询DataRow创建一个MVNFORUMSYMBUSEntity对象
* @param MVNFORUMSYMBUS row
* @returnMVNFORUMSYMBUSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumsymbus_Dao> get_mvnforumsymbus_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumsymbusstrWhere") == null) {
			Dictionary<Integer, mvnforumsymbus_Dao> _dic = new Hashtable<Integer, mvnforumsymbus_Dao>();
			List<mvnforumsymbus_Dao> _list = new ArrayList<mvnforumsymbus_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getBusid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumsymbus", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumsymbus_Dao> _dic = (Dictionary<Integer, mvnforumsymbus_Dao>) classFactory
					.cacheGet("dicmvnforumsymbusstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMSYMBUS字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumsymbus_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMSYMBUS_PRO.UpdateFieldMVNFORUMSYMBUS(?,?)}";
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
* 更新MVNFORUMSYMBUSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumsymbus_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMSYMBUS_PRO.UpdateFieldMVNFORUMSYMBUSV(?,?,?)}";
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
* 更新MVNFORUMSYMBUSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumsymbus_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMSYMBUS_PRO.UpdateFieldMVNFORUMSYMBUSU(?,?,?)}";
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
