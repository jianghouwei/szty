/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSztyuserinfo.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sztyuserinfo_Dao;
import com.szty.aihao.core.sztyuserinfo_core;
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
*@SZTYUSERINFO数据接口
*@作者：宋春林 
*/
public class sztyuserinfo_impl implements sztyuserinfo_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sztyuserinfo_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTYUSERINFO实体
* @return 新插入记录的编号
*/
public int insert_sztyuserinfo(sztyuserinfo_Dao _SZTYUSERINFOModel)  throws Exception{
         String sqlStr = "{call SZTYUSERINFO_PRO.InsertSZTYUSERINFO(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTYUSERINFOModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYUSERINFOModel.getAccount());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYUSERINFOModel.getMobile());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYUSERINFOModel.getImsi());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYUSERINFOModel.getPassword());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYUSERINFOModel.getStatus());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_SZTYUSERINFOModel.getCreatetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTYUSERINFO
* @Object 
* @return 新插入记录的编号
*/
public int insert_sztyuserinfo(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTYUSERINFO_PRO.InsertSZTYUSERINFO(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SZTYUSERINFO实体
* @return 影响的行数
*/
public int update_sztyuserinfo(sztyuserinfo_Dao _SZTYUSERINFOModel)  throws Exception{
        String sqlStr = "{call SZTYUSERINFO_PRO.UpdateSZTYUSERINFO(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.BIGINT,_SZTYUSERINFOModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYUSERINFOModel.getAccount());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYUSERINFOModel.getMobile());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYUSERINFOModel.getImsi());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYUSERINFOModel.getPassword());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYUSERINFOModel.getStatus());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_SZTYUSERINFOModel.getCreatetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTYUSERINFO中的一条记录
* @param SZTYUSERINFO实体
* @return 新插入记录的编号
*/
public int delete_sztyuserinfo(int Id)  throws Exception{
        String sqlStr = "{call SZTYUSERINFO_PRO.DeleteSZTYUSERINFO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 sztyuserinfo 数据实体
* @param Id">Id
* @return<sztyuserinfo 数据实体
* @throws Exception 
*/
public sztyuserinfo_Dao get_sztyuserinfoDao(int Id) throws Exception{
         String sqlStr = "{ call SZTYUSERINFO_PRO.GetSZTYUSERINFOEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyuserinfo_Dao _obj = new sztyuserinfo_Dao();
            _obj.setAccount(arr.getString("ACCOUNT"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPassword(arr.getString("PASSWORD"));
            _obj.setStatus(arr.getString("STATUS"));
             try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据SZTYUSERINFO返回的查询DataRow创建一个SZTYUSERINFOEntity对象
* @param SZTYUSERINFO row
* @returnSZTYUSERINFOList对象
* @throws Exception 
*/
public List<sztyuserinfo_Dao> get_sztyuserinfo_All() throws Exception{
        List<sztyuserinfo_Dao> _list = new ArrayList<sztyuserinfo_Dao>();
		String sqlStr = "{ call SZTYUSERINFO_PRO.GetSZTYUSERINFO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyuserinfo_Dao _obj = new sztyuserinfo_Dao();
            _obj.setAccount(arr.getString("ACCOUNT"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPassword(arr.getString("PASSWORD"));
            _obj.setStatus(arr.getString("STATUS"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTYUSERINFO返回的查询DataRow创建一个SZTYUSERINFOEntity对象
* @param SZTYUSERINFO row
* @returnSZTYUSERINFOList对象
* @throws Exception 
*/
public List< sztyuserinfo_Dao> get_sztyuserinfo_All(String strWhere) throws Exception{
         List<sztyuserinfo_Dao> _list = new ArrayList<sztyuserinfo_Dao>();
		 String sqlStr = "{ call SZTYUSERINFO_PRO.GetSZTYUSERINFOWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sztyuserinfo_Dao _obj = new sztyuserinfo_Dao();
            _obj.setAccount(arr.getString("ACCOUNT"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPassword(arr.getString("PASSWORD"));
            _obj.setStatus(arr.getString("STATUS"));
           try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTYUSERINFO返回 分页数据
* @param SZTYUSERINFO row
* @returnSZTYUSERINFOList对象
* @throws Exception 
*/
public List<sztyuserinfo_Dao> get_sztyuserinfo_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sztyuserinfo_Dao> _list = new ArrayList<sztyuserinfo_Dao>();
		String sqlStr = "{ call SZTYUSERINFO_PRO.GetSZTYUSERINFOPage(?,?,?,?,?,?)}";
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
				sztyuserinfo_Dao _obj = new sztyuserinfo_Dao();
            _obj.setAccount(arr.getString("ACCOUNT"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setPassword(arr.getString("PASSWORD"));
            _obj.setStatus(arr.getString("STATUS"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTYUSERINFO返回的查询DataRow创建一个SZTYUSERINFOEntity对象
* @param SZTYUSERINFO row
* @returnSZTYUSERINFODictionary对象
* @throws Exception 
*/
public Dictionary<Integer, sztyuserinfo_Dao> get_sztyuserinfo_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsztyuserinfostrWhere") == null) {
			Dictionary<Integer, sztyuserinfo_Dao> _dic = new Hashtable<Integer, sztyuserinfo_Dao>();
			List<sztyuserinfo_Dao> _list = new ArrayList<sztyuserinfo_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((int)(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicsztyuserinfo", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sztyuserinfo_Dao> _dic = (Dictionary<Integer, sztyuserinfo_Dao>) classFactory
					.cacheGet("dicsztyuserinfostrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTYUSERINFO字段加一
* @param FieldName
* @param sid
*/
public int create_sztyuserinfo_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTYUSERINFO_PRO.UpdateFieldSZTYUSERINFO(?,?)}";
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
* 更新SZTYUSERINFOInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_sztyuserinfo_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTYUSERINFO_PRO.UpdateFieldSZTYUSERINFOV(?,?,?)}";
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
* 更新SZTYUSERINFOIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_sztyuserinfo_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTYUSERINFO_PRO.UpdateFieldSZTYUSERINFOU(?,?,?)}";
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
