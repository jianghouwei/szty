/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataT_ptype_info.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.t_ptype_info_Dao;
import com.szty.aihao.core.t_ptype_info_core;
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
*@T_PTYPE_INFO数据接口
*@作者：宋春林 
*/
public class t_ptype_info_impl implements t_ptype_info_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(t_ptype_info_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param T_PTYPE_INFO实体
* @return 新插入记录的编号
*/
public int insert_t_ptype_info(t_ptype_info_Dao _T_PTYPE_INFOModel)  throws Exception{
         String sqlStr = "{call T_PTYPE_INFO_PRO.InsertT_PTYPE_INFO(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_T_PTYPE_INFOModel.getPid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_T_PTYPE_INFOModel.getPtype());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_T_PTYPE_INFOModel.getRmk());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param T_PTYPE_INFO
* @Object 
* @return 新插入记录的编号
*/
public int insert_t_ptype_info(Object[] _para)  throws Exception{
      String sqlStr = "{call T_PTYPE_INFO_PRO.InsertT_PTYPE_INFO(?,?,?)}";
	  OracleParameter[] op = new OracleParameter[3];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param T_PTYPE_INFO实体
* @return 影响的行数
*/
public int update_t_ptype_info(t_ptype_info_Dao _T_PTYPE_INFOModel)  throws Exception{
        String sqlStr = "{call T_PTYPE_INFO_PRO.UpdateT_PTYPE_INFO(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_T_PTYPE_INFOModel.getPid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_T_PTYPE_INFOModel.getPtype());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_T_PTYPE_INFOModel.getRmk());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表T_PTYPE_INFO中的一条记录
* @param T_PTYPE_INFO实体
* @return 新插入记录的编号
*/
public int delete_t_ptype_info(int Pid)  throws Exception{
        String sqlStr = "{call T_PTYPE_INFO_PRO.DeleteT_PTYPE_INFO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Pid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 t_ptype_info 数据实体
* @param Pid">Pid
* @return<t_ptype_info 数据实体
* @throws Exception 
*/
public t_ptype_info_Dao get_t_ptype_infoDao(int Pid) throws Exception{
         String sqlStr = "{ call T_PTYPE_INFO_PRO.GetT_PTYPE_INFOEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Pid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			t_ptype_info_Dao _obj = new t_ptype_info_Dao();
            _obj.setPid(arr.getInt("PID"));
            _obj.setPtype(arr.getString("PTYPE"));
            _obj.setRmk(arr.getString("RMK"));
			return _obj;
		}
		return null;

}

/**
* 根据T_PTYPE_INFO返回的查询DataRow创建一个T_PTYPE_INFOEntity对象
* @param T_PTYPE_INFO row
* @returnT_PTYPE_INFOList对象
* @throws Exception 
*/
public List<t_ptype_info_Dao> get_t_ptype_info_All() throws Exception{
        List<t_ptype_info_Dao> _list = new ArrayList<t_ptype_info_Dao>();
		String sqlStr = "{ call T_PTYPE_INFO_PRO.GetT_PTYPE_INFO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			t_ptype_info_Dao _obj = new t_ptype_info_Dao();
            _obj.setPid(arr.getInt("PID"));
            _obj.setPtype(arr.getString("PTYPE"));
            _obj.setRmk(arr.getString("RMK"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据T_PTYPE_INFO返回的查询DataRow创建一个T_PTYPE_INFOEntity对象
* @param T_PTYPE_INFO row
* @returnT_PTYPE_INFOList对象
* @throws Exception 
*/
public List< t_ptype_info_Dao> get_t_ptype_info_All(String strWhere) throws Exception{
         List<t_ptype_info_Dao> _list = new ArrayList<t_ptype_info_Dao>();
		 String sqlStr = "{ call T_PTYPE_INFO_PRO.GetT_PTYPE_INFOWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				t_ptype_info_Dao _obj = new t_ptype_info_Dao();
            _obj.setPid(arr.getInt("PID"));
            _obj.setPtype(arr.getString("PTYPE"));
            _obj.setRmk(arr.getString("RMK"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据T_PTYPE_INFO返回 分页数据
* @param T_PTYPE_INFO row
* @returnT_PTYPE_INFOList对象
* @throws Exception 
*/
public List<t_ptype_info_Dao> get_t_ptype_info_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<t_ptype_info_Dao> _list = new ArrayList<t_ptype_info_Dao>();
		String sqlStr = "{ call T_PTYPE_INFO_PRO.GetT_PTYPE_INFOPage(?,?,?,?,?,?)}";
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
				t_ptype_info_Dao _obj = new t_ptype_info_Dao();
            _obj.setPid(arr.getInt("PID"));
            _obj.setPtype(arr.getString("PTYPE"));
            _obj.setRmk(arr.getString("RMK"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据T_PTYPE_INFO返回的查询DataRow创建一个T_PTYPE_INFOEntity对象
* @param T_PTYPE_INFO row
* @returnT_PTYPE_INFODictionary对象
* @throws Exception 
*/
public Dictionary<Integer, t_ptype_info_Dao> get_t_ptype_info_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dict_ptype_infostrWhere") == null) {
			Dictionary<Integer, t_ptype_info_Dao> _dic = new Hashtable<Integer, t_ptype_info_Dao>();
			List<t_ptype_info_Dao> _list = new ArrayList<t_ptype_info_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getPid()), _list.get(i));
			}
			classFactory.cachePut("dict_ptype_info", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, t_ptype_info_Dao> _dic = (Dictionary<Integer, t_ptype_info_Dao>) classFactory
					.cacheGet("dict_ptype_infostrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新T_PTYPE_INFO字段加一
* @param FieldName
* @param sid
*/
public int create_t_ptype_info_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call T_PTYPE_INFO_PRO.UpdateFieldT_PTYPE_INFO(?,?)}";
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
* 更新T_PTYPE_INFOInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_t_ptype_info_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call T_PTYPE_INFO_PRO.UpdateFieldT_PTYPE_INFOV(?,?,?)}";
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
* 更新T_PTYPE_INFOIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_t_ptype_info_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call T_PTYPE_INFO_PRO.UpdateFieldT_PTYPE_INFOU(?,?,?)}";
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
