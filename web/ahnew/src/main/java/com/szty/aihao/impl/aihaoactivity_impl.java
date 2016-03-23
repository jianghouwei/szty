/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaoactivity.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaoactivity_Dao;
import com.szty.aihao.core.aihaoactivity_core;
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
*@AIHAOACTIVITY数据接口
*@作者：宋春林 
*/
public class aihaoactivity_impl implements aihaoactivity_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaoactivity_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOACTIVITY实体
* @return 新插入记录的编号
*/
public int insert_aihaoactivity(aihaoactivity_Dao _AIHAOACTIVITYModel)  throws Exception{
         String sqlStr = "{call AIHAOACTIVITY_PRO.InsertAIHAOACTIVITY(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOACTIVITYModel.getActivtiylogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYModel.getActivtiyname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYModel.getUniquevalue());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYModel.getMembername());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYModel.getMemberphone());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOACTIVITYModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOACTIVITY
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaoactivity(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOACTIVITY_PRO.InsertAIHAOACTIVITY(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOACTIVITY实体
* @return 影响的行数
*/
public int update_aihaoactivity(aihaoactivity_Dao _AIHAOACTIVITYModel)  throws Exception{
        String sqlStr = "{call AIHAOACTIVITY_PRO.UpdateAIHAOACTIVITY(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOACTIVITYModel.getActivtiylogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYModel.getActivtiyname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYModel.getUniquevalue());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYModel.getMembername());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYModel.getMemberphone());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOACTIVITYModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOACTIVITY中的一条记录
* @param AIHAOACTIVITY实体
* @return 新插入记录的编号
*/
public int delete_aihaoactivity(int Activtiylogid)  throws Exception{
        String sqlStr = "{call AIHAOACTIVITY_PRO.DeleteAIHAOACTIVITY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Activtiylogid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaoactivity 数据实体
* @param Activtiylogid">Activtiylogid
* @return<aihaoactivity 数据实体
* @throws Exception 
*/
public aihaoactivity_Dao get_aihaoactivityDao(int Activtiylogid) throws Exception{
         String sqlStr = "{ call AIHAOACTIVITY_PRO.GetAIHAOACTIVITYEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Activtiylogid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoactivity_Dao _obj = new aihaoactivity_Dao();
            _obj.setActivtiylogid(arr.getInt("ACTIVTIYLOGID"));
            _obj.setActivtiyname(arr.getString("ACTIVTIYNAME"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setMemberphone(arr.getString("MEMBERPHONE"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOACTIVITY返回的查询DataRow创建一个AIHAOACTIVITYEntity对象
* @param AIHAOACTIVITY row
* @returnAIHAOACTIVITYList对象
* @throws Exception 
*/
public List<aihaoactivity_Dao> get_aihaoactivity_All() throws Exception{
        List<aihaoactivity_Dao> _list = new ArrayList<aihaoactivity_Dao>();
		String sqlStr = "{ call AIHAOACTIVITY_PRO.GetAIHAOACTIVITY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoactivity_Dao _obj = new aihaoactivity_Dao();
            _obj.setActivtiylogid(arr.getInt("ACTIVTIYLOGID"));
            _obj.setActivtiyname(arr.getString("ACTIVTIYNAME"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setMemberphone(arr.getString("MEMBERPHONE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOACTIVITY返回的查询DataRow创建一个AIHAOACTIVITYEntity对象
* @param AIHAOACTIVITY row
* @returnAIHAOACTIVITYList对象
* @throws Exception 
*/
public List< aihaoactivity_Dao> get_aihaoactivity_All(String strWhere) throws Exception{
         List<aihaoactivity_Dao> _list = new ArrayList<aihaoactivity_Dao>();
		 String sqlStr = "{ call AIHAOACTIVITY_PRO.GetAIHAOACTIVITYWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaoactivity_Dao _obj = new aihaoactivity_Dao();
            _obj.setActivtiylogid(arr.getInt("ACTIVTIYLOGID"));
            _obj.setActivtiyname(arr.getString("ACTIVTIYNAME"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setMemberphone(arr.getString("MEMBERPHONE"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOACTIVITY返回 分页数据
* @param AIHAOACTIVITY row
* @returnAIHAOACTIVITYList对象
* @throws Exception 
*/
public List<aihaoactivity_Dao> get_aihaoactivity_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaoactivity_Dao> _list = new ArrayList<aihaoactivity_Dao>();
		String sqlStr = "{ call AIHAOACTIVITY_PRO.GetAIHAOACTIVITYPage(?,?,?,?,?,?)}";
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
				aihaoactivity_Dao _obj = new aihaoactivity_Dao();
            _obj.setActivtiylogid(arr.getInt("ACTIVTIYLOGID"));
            _obj.setActivtiyname(arr.getString("ACTIVTIYNAME"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setMemberphone(arr.getString("MEMBERPHONE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOACTIVITY返回的查询DataRow创建一个AIHAOACTIVITYEntity对象
* @param AIHAOACTIVITY row
* @returnAIHAOACTIVITYDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaoactivity_Dao> get_aihaoactivity_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaoactivitystrWhere") == null) {
			Dictionary<Integer, aihaoactivity_Dao> _dic = new Hashtable<Integer, aihaoactivity_Dao>();
			List<aihaoactivity_Dao> _list = new ArrayList<aihaoactivity_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getActivtiylogid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaoactivity", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaoactivity_Dao> _dic = (Dictionary<Integer, aihaoactivity_Dao>) classFactory
					.cacheGet("dicaihaoactivitystrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOACTIVITY字段加一
* @param FieldName
* @param sid
*/
public int create_aihaoactivity_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOACTIVITY_PRO.UpdateFieldAIHAOACTIVITY(?,?)}";
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
* 更新AIHAOACTIVITYInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaoactivity_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOACTIVITY_PRO.UpdateFieldAIHAOACTIVITYV(?,?,?)}";
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
* 更新AIHAOACTIVITYIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaoactivity_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOACTIVITY_PRO.UpdateFieldAIHAOACTIVITYU(?,?,?)}";
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
