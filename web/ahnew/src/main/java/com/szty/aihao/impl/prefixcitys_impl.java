/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataPrefixcitys.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.prefixcitys_Dao;
import com.szty.aihao.core.prefixcitys_core;
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
*@PREFIXCITYS数据接口
*@作者：宋春林 
*/
public class prefixcitys_impl implements prefixcitys_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(prefixcitys_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param PREFIXCITYS实体
* @return 新插入记录的编号
*/
public int insert_prefixcitys(prefixcitys_Dao _PREFIXCITYSModel)  throws Exception{
         String sqlStr = "{call PREFIXCITYS_PRO.InsertPREFIXCITYS(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_PREFIXCITYSModel.getPrefix());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_PREFIXCITYSModel.getProcode());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_PREFIXCITYSModel.getCitycode());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param PREFIXCITYS
* @Object 
* @return 新插入记录的编号
*/
public int insert_prefixcitys(Object[] _para)  throws Exception{
      String sqlStr = "{call PREFIXCITYS_PRO.InsertPREFIXCITYS(?,?,?)}";
	  OracleParameter[] op = new OracleParameter[3];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param PREFIXCITYS实体
* @return 影响的行数
*/
public int update_prefixcitys(prefixcitys_Dao _PREFIXCITYSModel)  throws Exception{
        String sqlStr = "{call PREFIXCITYS_PRO.UpdatePREFIXCITYS(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_PREFIXCITYSModel.getPrefix());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_PREFIXCITYSModel.getProcode());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_PREFIXCITYSModel.getCitycode());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表PREFIXCITYS中的一条记录
* @param PREFIXCITYS实体
* @return 新插入记录的编号
*/
public int delete_prefixcitys(int Prefix)  throws Exception{
        String sqlStr = "{call PREFIXCITYS_PRO.DeletePREFIXCITYS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Prefix);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 prefixcitys 数据实体
* @param Prefix">Prefix
* @return<prefixcitys 数据实体
* @throws Exception 
*/
public prefixcitys_Dao get_prefixcitysDao(int Prefix) throws Exception{
         String sqlStr = "{ call PREFIXCITYS_PRO.GetPREFIXCITYSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Prefix);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			prefixcitys_Dao _obj = new prefixcitys_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
			return _obj;
		}
		return null;

}

/**
* 根据PREFIXCITYS返回的查询DataRow创建一个PREFIXCITYSEntity对象
* @param PREFIXCITYS row
* @returnPREFIXCITYSList对象
* @throws Exception 
*/
public List<prefixcitys_Dao> get_prefixcitys_All() throws Exception{
        List<prefixcitys_Dao> _list = new ArrayList<prefixcitys_Dao>();
		String sqlStr = "{ call PREFIXCITYS_PRO.GetPREFIXCITYS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			prefixcitys_Dao _obj = new prefixcitys_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据PREFIXCITYS返回的查询DataRow创建一个PREFIXCITYSEntity对象
* @param PREFIXCITYS row
* @returnPREFIXCITYSList对象
* @throws Exception 
*/
public List< prefixcitys_Dao> get_prefixcitys_All(String strWhere) throws Exception{
         List<prefixcitys_Dao> _list = new ArrayList<prefixcitys_Dao>();
		 String sqlStr = "{ call PREFIXCITYS_PRO.GetPREFIXCITYSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				prefixcitys_Dao _obj = new prefixcitys_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据PREFIXCITYS返回 分页数据
* @param PREFIXCITYS row
* @returnPREFIXCITYSList对象
* @throws Exception 
*/
public List<prefixcitys_Dao> get_prefixcitys_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<prefixcitys_Dao> _list = new ArrayList<prefixcitys_Dao>();
		String sqlStr = "{ call PREFIXCITYS_PRO.GetPREFIXCITYSPage(?,?,?,?,?,?)}";
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
				prefixcitys_Dao _obj = new prefixcitys_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据PREFIXCITYS返回的查询DataRow创建一个PREFIXCITYSEntity对象
* @param PREFIXCITYS row
* @returnPREFIXCITYSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, prefixcitys_Dao> get_prefixcitys_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicprefixcitysstrWhere") == null) {
			Dictionary<Integer, prefixcitys_Dao> _dic = new Hashtable<Integer, prefixcitys_Dao>();
			List<prefixcitys_Dao> _list = new ArrayList<prefixcitys_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getPrefix()), _list.get(i));
			}
			classFactory.cachePut("dicprefixcitys", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, prefixcitys_Dao> _dic = (Dictionary<Integer, prefixcitys_Dao>) classFactory
					.cacheGet("dicprefixcitysstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新PREFIXCITYS字段加一
* @param FieldName
* @param sid
*/
public int create_prefixcitys_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call PREFIXCITYS_PRO.UpdateFieldPREFIXCITYS(?,?)}";
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
* 更新PREFIXCITYSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_prefixcitys_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call PREFIXCITYS_PRO.UpdateFieldPREFIXCITYSV(?,?,?)}";
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
* 更新PREFIXCITYSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_prefixcitys_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call PREFIXCITYS_PRO.UpdateFieldPREFIXCITYSU(?,?,?)}";
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
