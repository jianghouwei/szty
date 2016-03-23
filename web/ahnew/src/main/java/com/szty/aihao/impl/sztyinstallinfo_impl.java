/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSztyinstallinfo.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sztyinstallinfo_Dao;
import com.szty.aihao.core.sztyinstallinfo_core;
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
*@SZTYINSTALLINFO数据接口
*@作者：宋春林 
*/
public class sztyinstallinfo_impl implements sztyinstallinfo_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sztyinstallinfo_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTYINSTALLINFO实体
* @return 新插入记录的编号
*/
public int insert_sztyinstallinfo(sztyinstallinfo_Dao _SZTYINSTALLINFOModel)  throws Exception{
         String sqlStr = "{call SZTYINSTALLINFO_PRO.InsertSZTYINSTALLINFO(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTYINSTALLINFOModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getPlatform());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getChannel());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getProductcode());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getVersion());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getPhonemodel());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_SZTYINSTALLINFOModel.getCreatetime()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getPhonebrand());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getOstype());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getMobile());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTYINSTALLINFO
* @Object 
* @return 新插入记录的编号
*/
public int insert_sztyinstallinfo(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTYINSTALLINFO_PRO.InsertSZTYINSTALLINFO(?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[11];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_para[7]));
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
* @param SZTYINSTALLINFO实体
* @return 影响的行数
*/
public int update_sztyinstallinfo(sztyinstallinfo_Dao _SZTYINSTALLINFOModel)  throws Exception{
        String sqlStr = "{call SZTYINSTALLINFO_PRO.UpdateSZTYINSTALLINFO(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_SZTYINSTALLINFOModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getPlatform());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getChannel());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getProductcode());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getVersion());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getImsi());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getPhonemodel());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_SZTYINSTALLINFOModel.getCreatetime()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getPhonebrand());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getOstype());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_SZTYINSTALLINFOModel.getMobile());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTYINSTALLINFO中的一条记录
* @param SZTYINSTALLINFO实体
* @return 新插入记录的编号
*/
public int delete_sztyinstallinfo(int Id)  throws Exception{
        String sqlStr = "{call SZTYINSTALLINFO_PRO.DeleteSZTYINSTALLINFO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 sztyinstallinfo 数据实体
* @param Id">Id
* @return<sztyinstallinfo 数据实体
* @throws Exception 
*/
public sztyinstallinfo_Dao get_sztyinstallinfoDao(int Id) throws Exception{
         String sqlStr = "{ call SZTYINSTALLINFO_PRO.GetSZTYINSTALLINFOEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyinstallinfo_Dao _obj = new sztyinstallinfo_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPhonemodel(arr.getString("PHONEMODEL"));
             try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setPhonebrand(arr.getString("PHONEBRAND"));
            _obj.setOstype(arr.getString("OSTYPE"));
            _obj.setMobile(arr.getString("MOBILE"));
			return _obj;
		}
		return null;

}

/**
* 根据SZTYINSTALLINFO返回的查询DataRow创建一个SZTYINSTALLINFOEntity对象
* @param SZTYINSTALLINFO row
* @returnSZTYINSTALLINFOList对象
* @throws Exception 
*/
public List<sztyinstallinfo_Dao> get_sztyinstallinfo_All() throws Exception{
        List<sztyinstallinfo_Dao> _list = new ArrayList<sztyinstallinfo_Dao>();
		String sqlStr = "{ call SZTYINSTALLINFO_PRO.GetSZTYINSTALLINFO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyinstallinfo_Dao _obj = new sztyinstallinfo_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPhonemodel(arr.getString("PHONEMODEL"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setPhonebrand(arr.getString("PHONEBRAND"));
            _obj.setOstype(arr.getString("OSTYPE"));
            _obj.setMobile(arr.getString("MOBILE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTYINSTALLINFO返回的查询DataRow创建一个SZTYINSTALLINFOEntity对象
* @param SZTYINSTALLINFO row
* @returnSZTYINSTALLINFOList对象
* @throws Exception 
*/
public List< sztyinstallinfo_Dao> get_sztyinstallinfo_All(String strWhere) throws Exception{
         List<sztyinstallinfo_Dao> _list = new ArrayList<sztyinstallinfo_Dao>();
		 String sqlStr = "{ call SZTYINSTALLINFO_PRO.GetSZTYINSTALLINFOWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sztyinstallinfo_Dao _obj = new sztyinstallinfo_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPhonemodel(arr.getString("PHONEMODEL"));
           try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setPhonebrand(arr.getString("PHONEBRAND"));
            _obj.setOstype(arr.getString("OSTYPE"));
            _obj.setMobile(arr.getString("MOBILE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTYINSTALLINFO返回 分页数据
* @param SZTYINSTALLINFO row
* @returnSZTYINSTALLINFOList对象
* @throws Exception 
*/
public List<sztyinstallinfo_Dao> get_sztyinstallinfo_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sztyinstallinfo_Dao> _list = new ArrayList<sztyinstallinfo_Dao>();
		String sqlStr = "{ call SZTYINSTALLINFO_PRO.GetSZTYINSTALLINFOPage(?,?,?,?,?,?)}";
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
				sztyinstallinfo_Dao _obj = new sztyinstallinfo_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setChannel(arr.getString("CHANNEL"));
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
            _obj.setVersion(arr.getString("VERSION"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPhonemodel(arr.getString("PHONEMODEL"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setPhonebrand(arr.getString("PHONEBRAND"));
            _obj.setOstype(arr.getString("OSTYPE"));
            _obj.setMobile(arr.getString("MOBILE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTYINSTALLINFO返回的查询DataRow创建一个SZTYINSTALLINFOEntity对象
* @param SZTYINSTALLINFO row
* @returnSZTYINSTALLINFODictionary对象
* @throws Exception 
*/
public Dictionary<Integer, sztyinstallinfo_Dao> get_sztyinstallinfo_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsztyinstallinfostrWhere") == null) {
			Dictionary<Integer, sztyinstallinfo_Dao> _dic = new Hashtable<Integer, sztyinstallinfo_Dao>();
			List<sztyinstallinfo_Dao> _list = new ArrayList<sztyinstallinfo_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicsztyinstallinfo", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sztyinstallinfo_Dao> _dic = (Dictionary<Integer, sztyinstallinfo_Dao>) classFactory
					.cacheGet("dicsztyinstallinfostrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTYINSTALLINFO字段加一
* @param FieldName
* @param sid
*/
public int create_sztyinstallinfo_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTYINSTALLINFO_PRO.UpdateFieldSZTYINSTALLINFO(?,?)}";
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
* 更新SZTYINSTALLINFOInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_sztyinstallinfo_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTYINSTALLINFO_PRO.UpdateFieldSZTYINSTALLINFOV(?,?,?)}";
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
* 更新SZTYINSTALLINFOIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_sztyinstallinfo_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTYINSTALLINFO_PRO.UpdateFieldSZTYINSTALLINFOU(?,?,?)}";
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
