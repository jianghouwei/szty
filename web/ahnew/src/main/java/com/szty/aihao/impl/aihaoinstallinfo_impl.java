/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaoinstallinfo.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaoinstallinfo_Dao;
import com.szty.aihao.core.aihaoinstallinfo_core;
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
*@AIHAOINSTALLINFO数据接口
*@作者：宋春林 
*/
public class aihaoinstallinfo_impl implements aihaoinstallinfo_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaoinstallinfo_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOINSTALLINFO实体
* @return 新插入记录的编号
*/
public int insert_aihaoinstallinfo(aihaoinstallinfo_Dao _AIHAOINSTALLINFOModel)  throws Exception{
         String sqlStr = "{call AIHAOINSTALLINFO_PRO.InsertAIHAOINSTALLINFO(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOINSTALLINFOModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getChannel());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getVersion());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getImsi());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getPhonemodel());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOINSTALLINFOModel.getCreatetime()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getPhonebrand());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getOstype());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getMobile());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getPlatform());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getProductcode());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOINSTALLINFO
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaoinstallinfo(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOINSTALLINFO_PRO.InsertAIHAOINSTALLINFO(?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[11];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOINSTALLINFO实体
* @return 影响的行数
*/
public int update_aihaoinstallinfo(aihaoinstallinfo_Dao _AIHAOINSTALLINFOModel)  throws Exception{
        String sqlStr = "{call AIHAOINSTALLINFO_PRO.UpdateAIHAOINSTALLINFO(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOINSTALLINFOModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getChannel());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getVersion());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getImsi());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getPhonemodel());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOINSTALLINFOModel.getCreatetime()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getPhonebrand());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getOstype());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getMobile());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getPlatform());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOINSTALLINFOModel.getProductcode());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOINSTALLINFO中的一条记录
* @param AIHAOINSTALLINFO实体
* @return 新插入记录的编号
*/
public int delete_aihaoinstallinfo(int Id)  throws Exception{
        String sqlStr = "{call AIHAOINSTALLINFO_PRO.DeleteAIHAOINSTALLINFO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaoinstallinfo 数据实体
* @param Id">Id
* @return<aihaoinstallinfo 数据实体
* @throws Exception 
*/
public aihaoinstallinfo_Dao get_aihaoinstallinfoDao(int Id) throws Exception{
         String sqlStr = "{ call AIHAOINSTALLINFO_PRO.GetAIHAOINSTALLINFOEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoinstallinfo_Dao _obj = new aihaoinstallinfo_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPhonemodel(arr.getString("PHONEMODEL"));
             try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setPhonebrand(arr.getString("PHONEBRAND"));
            _obj.setOstype(arr.getString("OSTYPE"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOINSTALLINFO返回的查询DataRow创建一个AIHAOINSTALLINFOEntity对象
* @param AIHAOINSTALLINFO row
* @returnAIHAOINSTALLINFOList对象
* @throws Exception 
*/
public List<aihaoinstallinfo_Dao> get_aihaoinstallinfo_All() throws Exception{
        List<aihaoinstallinfo_Dao> _list = new ArrayList<aihaoinstallinfo_Dao>();
		String sqlStr = "{ call AIHAOINSTALLINFO_PRO.GetAIHAOINSTALLINFO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoinstallinfo_Dao _obj = new aihaoinstallinfo_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPhonemodel(arr.getString("PHONEMODEL"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setPhonebrand(arr.getString("PHONEBRAND"));
            _obj.setOstype(arr.getString("OSTYPE"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOINSTALLINFO返回的查询DataRow创建一个AIHAOINSTALLINFOEntity对象
* @param AIHAOINSTALLINFO row
* @returnAIHAOINSTALLINFOList对象
* @throws Exception 
*/
public List< aihaoinstallinfo_Dao> get_aihaoinstallinfo_All(String strWhere) throws Exception{
         List<aihaoinstallinfo_Dao> _list = new ArrayList<aihaoinstallinfo_Dao>();
		 String sqlStr = "{ call AIHAOINSTALLINFO_PRO.GetAIHAOINSTALLINFOWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaoinstallinfo_Dao _obj = new aihaoinstallinfo_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPhonemodel(arr.getString("PHONEMODEL"));
           try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setPhonebrand(arr.getString("PHONEBRAND"));
            _obj.setOstype(arr.getString("OSTYPE"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOINSTALLINFO返回 分页数据
* @param AIHAOINSTALLINFO row
* @returnAIHAOINSTALLINFOList对象
* @throws Exception 
*/
public List<aihaoinstallinfo_Dao> get_aihaoinstallinfo_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaoinstallinfo_Dao> _list = new ArrayList<aihaoinstallinfo_Dao>();
		String sqlStr = "{ call AIHAOINSTALLINFO_PRO.GetAIHAOINSTALLINFOPage(?,?,?,?,?,?)}";
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
				aihaoinstallinfo_Dao _obj = new aihaoinstallinfo_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPhonemodel(arr.getString("PHONEMODEL"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setPhonebrand(arr.getString("PHONEBRAND"));
            _obj.setOstype(arr.getString("OSTYPE"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOINSTALLINFO返回的查询DataRow创建一个AIHAOINSTALLINFOEntity对象
* @param AIHAOINSTALLINFO row
* @returnAIHAOINSTALLINFODictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaoinstallinfo_Dao> get_aihaoinstallinfo_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaoinstallinfostrWhere") == null) {
			Dictionary<Integer, aihaoinstallinfo_Dao> _dic = new Hashtable<Integer, aihaoinstallinfo_Dao>();
			List<aihaoinstallinfo_Dao> _list = new ArrayList<aihaoinstallinfo_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihaoinstallinfo", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaoinstallinfo_Dao> _dic = (Dictionary<Integer, aihaoinstallinfo_Dao>) classFactory
					.cacheGet("dicaihaoinstallinfostrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOINSTALLINFO字段加一
* @param FieldName
* @param sid
*/
public int create_aihaoinstallinfo_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOINSTALLINFO_PRO.UpdateFieldAIHAOINSTALLINFO(?,?)}";
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
* 更新AIHAOINSTALLINFOInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaoinstallinfo_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOINSTALLINFO_PRO.UpdateFieldAIHAOINSTALLINFOV(?,?,?)}";
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
* 更新AIHAOINSTALLINFOIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaoinstallinfo_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOINSTALLINFO_PRO.UpdateFieldAIHAOINSTALLINFOU(?,?,?)}";
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
