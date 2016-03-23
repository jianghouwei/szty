/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforummobileos.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforummobileos_Dao;
import com.szty.aihao.core.mvnforummobileos_core;
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
*@MVNFORUMMOBILEOS数据接口
*@作者：宋春林 
*/
public class mvnforummobileos_impl implements mvnforummobileos_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforummobileos_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMOBILEOS实体
* @return 新插入记录的编号
*/
public int insert_mvnforummobileos(mvnforummobileos_Dao _MVNFORUMMOBILEOSModel)  throws Exception{
         String sqlStr = "{call MVNFORUMMOBILEOS_PRO.InsertMVNFORUMMOBILEOS(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMMOBILEOSModel.getMobileosid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMOBILEOSModel.getMobilemanufacturer());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMOBILEOSModel.getOperatingsystem());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMOBILEOSModel.getMobilescreen());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMOBILEOSModel.getMobiletype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMOBILEOSModel.getJava());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMOBILEOS
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforummobileos(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMMOBILEOS_PRO.InsertMVNFORUMMOBILEOS(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMMOBILEOS实体
* @return 影响的行数
*/
public int update_mvnforummobileos(mvnforummobileos_Dao _MVNFORUMMOBILEOSModel)  throws Exception{
        String sqlStr = "{call MVNFORUMMOBILEOS_PRO.UpdateMVNFORUMMOBILEOS(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMMOBILEOSModel.getMobileosid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMOBILEOSModel.getMobilemanufacturer());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMOBILEOSModel.getOperatingsystem());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMOBILEOSModel.getMobilescreen());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMOBILEOSModel.getMobiletype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMOBILEOSModel.getJava());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMMOBILEOS中的一条记录
* @param MVNFORUMMOBILEOS实体
* @return 新插入记录的编号
*/
public int delete_mvnforummobileos(int Mobileosid)  throws Exception{
        String sqlStr = "{call MVNFORUMMOBILEOS_PRO.DeleteMVNFORUMMOBILEOS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Mobileosid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforummobileos 数据实体
* @param Mobileosid">Mobileosid
* @return<mvnforummobileos 数据实体
* @throws Exception 
*/
public mvnforummobileos_Dao get_mvnforummobileosDao(int Mobileosid) throws Exception{
         String sqlStr = "{ call MVNFORUMMOBILEOS_PRO.GetMVNFORUMMOBILEOSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Mobileosid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummobileos_Dao _obj = new mvnforummobileos_Dao();
            _obj.setMobileosid(arr.getInt("MOBILEOSID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setJava(arr.getString("JAVA"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMMOBILEOS返回的查询DataRow创建一个MVNFORUMMOBILEOSEntity对象
* @param MVNFORUMMOBILEOS row
* @returnMVNFORUMMOBILEOSList对象
* @throws Exception 
*/
public List<mvnforummobileos_Dao> get_mvnforummobileos_All() throws Exception{
        List<mvnforummobileos_Dao> _list = new ArrayList<mvnforummobileos_Dao>();
		String sqlStr = "{ call MVNFORUMMOBILEOS_PRO.GetMVNFORUMMOBILEOS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummobileos_Dao _obj = new mvnforummobileos_Dao();
            _obj.setMobileosid(arr.getInt("MOBILEOSID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setJava(arr.getString("JAVA"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMMOBILEOS返回的查询DataRow创建一个MVNFORUMMOBILEOSEntity对象
* @param MVNFORUMMOBILEOS row
* @returnMVNFORUMMOBILEOSList对象
* @throws Exception 
*/
public List< mvnforummobileos_Dao> get_mvnforummobileos_All(String strWhere) throws Exception{
         List<mvnforummobileos_Dao> _list = new ArrayList<mvnforummobileos_Dao>();
		 String sqlStr = "{ call MVNFORUMMOBILEOS_PRO.GetMVNFORUMMOBILEOSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforummobileos_Dao _obj = new mvnforummobileos_Dao();
            _obj.setMobileosid(arr.getInt("MOBILEOSID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setJava(arr.getString("JAVA"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMMOBILEOS返回 分页数据
* @param MVNFORUMMOBILEOS row
* @returnMVNFORUMMOBILEOSList对象
* @throws Exception 
*/
public List<mvnforummobileos_Dao> get_mvnforummobileos_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforummobileos_Dao> _list = new ArrayList<mvnforummobileos_Dao>();
		String sqlStr = "{ call MVNFORUMMOBILEOS_PRO.GetMVNFORUMMOBILEOSPage(?,?,?,?,?,?)}";
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
				mvnforummobileos_Dao _obj = new mvnforummobileos_Dao();
            _obj.setMobileosid(arr.getInt("MOBILEOSID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setJava(arr.getString("JAVA"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMMOBILEOS返回的查询DataRow创建一个MVNFORUMMOBILEOSEntity对象
* @param MVNFORUMMOBILEOS row
* @returnMVNFORUMMOBILEOSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforummobileos_Dao> get_mvnforummobileos_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforummobileosstrWhere") == null) {
			Dictionary<Integer, mvnforummobileos_Dao> _dic = new Hashtable<Integer, mvnforummobileos_Dao>();
			List<mvnforummobileos_Dao> _list = new ArrayList<mvnforummobileos_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMobileosid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforummobileos", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforummobileos_Dao> _dic = (Dictionary<Integer, mvnforummobileos_Dao>) classFactory
					.cacheGet("dicmvnforummobileosstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMMOBILEOS字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforummobileos_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMMOBILEOS_PRO.UpdateFieldMVNFORUMMOBILEOS(?,?)}";
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
* 更新MVNFORUMMOBILEOSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforummobileos_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMMOBILEOS_PRO.UpdateFieldMVNFORUMMOBILEOSV(?,?,?)}";
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
* 更新MVNFORUMMOBILEOSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforummobileos_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMMOBILEOS_PRO.UpdateFieldMVNFORUMMOBILEOSU(?,?,?)}";
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
