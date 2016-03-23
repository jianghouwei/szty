/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSztyverify.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sztyverify_Dao;
import com.szty.aihao.core.sztyverify_core;
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
*@SZTYVERIFY数据接口
*@作者：宋春林 
*/
public class sztyverify_impl implements sztyverify_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sztyverify_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTYVERIFY实体
* @return 新插入记录的编号
*/
public int insert_sztyverify(sztyverify_Dao _SZTYVERIFYModel)  throws Exception{
         String sqlStr = "{call SZTYVERIFY_PRO.InsertSZTYVERIFY(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTYVERIFYModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYVERIFYModel.getMobile());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYVERIFYModel.getVerifycode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_SZTYVERIFYModel.getType());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_SZTYVERIFYModel.getCreatetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTYVERIFY
* @Object 
* @return 新插入记录的编号
*/
public int insert_sztyverify(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTYVERIFY_PRO.InsertSZTYVERIFY(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SZTYVERIFY实体
* @return 影响的行数
*/
public int update_sztyverify(sztyverify_Dao _SZTYVERIFYModel)  throws Exception{
        String sqlStr = "{call SZTYVERIFY_PRO.UpdateSZTYVERIFY(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_SZTYVERIFYModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYVERIFYModel.getMobile());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYVERIFYModel.getVerifycode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_SZTYVERIFYModel.getType());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_SZTYVERIFYModel.getCreatetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTYVERIFY中的一条记录
* @param SZTYVERIFY实体
* @return 新插入记录的编号
*/
public int delete_sztyverify(int Id)  throws Exception{
        String sqlStr = "{call SZTYVERIFY_PRO.DeleteSZTYVERIFY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 sztyverify 数据实体
* @param Id">Id
* @return<sztyverify 数据实体
* @throws Exception 
*/
public sztyverify_Dao get_sztyverifyDao(int Id) throws Exception{
         String sqlStr = "{ call SZTYVERIFY_PRO.GetSZTYVERIFYEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyverify_Dao _obj = new sztyverify_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setVerifycode(arr.getString("VERIFYCODE"));
            _obj.setType(arr.getInt("TYPE"));
             try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据SZTYVERIFY返回的查询DataRow创建一个SZTYVERIFYEntity对象
* @param SZTYVERIFY row
* @returnSZTYVERIFYList对象
* @throws Exception 
*/
public List<sztyverify_Dao> get_sztyverify_All() throws Exception{
        List<sztyverify_Dao> _list = new ArrayList<sztyverify_Dao>();
		String sqlStr = "{ call SZTYVERIFY_PRO.GetSZTYVERIFY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyverify_Dao _obj = new sztyverify_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setVerifycode(arr.getString("VERIFYCODE"));
            _obj.setType(arr.getInt("TYPE"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTYVERIFY返回的查询DataRow创建一个SZTYVERIFYEntity对象
* @param SZTYVERIFY row
* @returnSZTYVERIFYList对象
* @throws Exception 
*/
public List< sztyverify_Dao> get_sztyverify_All(String strWhere) throws Exception{
         List<sztyverify_Dao> _list = new ArrayList<sztyverify_Dao>();
		 String sqlStr = "{ call SZTYVERIFY_PRO.GetSZTYVERIFYWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sztyverify_Dao _obj = new sztyverify_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setVerifycode(arr.getString("VERIFYCODE"));
            _obj.setType(arr.getInt("TYPE"));
           try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTYVERIFY返回 分页数据
* @param SZTYVERIFY row
* @returnSZTYVERIFYList对象
* @throws Exception 
*/
public List<sztyverify_Dao> get_sztyverify_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sztyverify_Dao> _list = new ArrayList<sztyverify_Dao>();
		String sqlStr = "{ call SZTYVERIFY_PRO.GetSZTYVERIFYPage(?,?,?,?,?,?)}";
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
				sztyverify_Dao _obj = new sztyverify_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setVerifycode(arr.getString("VERIFYCODE"));
            _obj.setType(arr.getInt("TYPE"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTYVERIFY返回的查询DataRow创建一个SZTYVERIFYEntity对象
* @param SZTYVERIFY row
* @returnSZTYVERIFYDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, sztyverify_Dao> get_sztyverify_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsztyverifystrWhere") == null) {
			Dictionary<Integer, sztyverify_Dao> _dic = new Hashtable<Integer, sztyverify_Dao>();
			List<sztyverify_Dao> _list = new ArrayList<sztyverify_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicsztyverify", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sztyverify_Dao> _dic = (Dictionary<Integer, sztyverify_Dao>) classFactory
					.cacheGet("dicsztyverifystrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTYVERIFY字段加一
* @param FieldName
* @param sid
*/
public int create_sztyverify_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTYVERIFY_PRO.UpdateFieldSZTYVERIFY(?,?)}";
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
* 更新SZTYVERIFYInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_sztyverify_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTYVERIFY_PRO.UpdateFieldSZTYVERIFYV(?,?,?)}";
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
* 更新SZTYVERIFYIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_sztyverify_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTYVERIFY_PRO.UpdateFieldSZTYVERIFYU(?,?,?)}";
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
