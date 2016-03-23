/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataT_user_chan.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.t_user_chan_Dao;
import com.szty.aihao.core.t_user_chan_core;
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
*@T_USER_CHAN数据接口
*@作者：宋春林 
*/
public class t_user_chan_impl implements t_user_chan_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(t_user_chan_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param T_USER_CHAN实体
* @return 新插入记录的编号
*/
public int insert_t_user_chan(t_user_chan_Dao _T_USER_CHANModel)  throws Exception{
         String sqlStr = "{call T_USER_CHAN_PRO.InsertT_USER_CHAN(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_T_USER_CHANModel.getUname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_T_USER_CHANModel.getChanid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_T_USER_CHANModel.getRmk());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_T_USER_CHANModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param T_USER_CHAN
* @Object 
* @return 新插入记录的编号
*/
public int insert_t_user_chan(Object[] _para)  throws Exception{
      String sqlStr = "{call T_USER_CHAN_PRO.InsertT_USER_CHAN(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param T_USER_CHAN实体
* @return 影响的行数
*/
public int update_t_user_chan(t_user_chan_Dao _T_USER_CHANModel)  throws Exception{
        String sqlStr = "{call T_USER_CHAN_PRO.UpdateT_USER_CHAN(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_T_USER_CHANModel.getUname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_T_USER_CHANModel.getChanid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_T_USER_CHANModel.getRmk());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_T_USER_CHANModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表T_USER_CHAN中的一条记录
* @param T_USER_CHAN实体
* @return 新插入记录的编号
*/
public int delete_t_user_chan(int Uname)  throws Exception{
        String sqlStr = "{call T_USER_CHAN_PRO.DeleteT_USER_CHAN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Uname);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 t_user_chan 数据实体
* @param Uname">Uname
* @return<t_user_chan 数据实体
* @throws Exception 
*/
public t_user_chan_Dao get_t_user_chanDao(int Uname) throws Exception{
         String sqlStr = "{ call T_USER_CHAN_PRO.GetT_USER_CHANEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Uname);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			t_user_chan_Dao _obj = new t_user_chan_Dao();
            _obj.setUname(arr.getString("UNAME"));
            _obj.setChanid(arr.getString("CHANID"));
            _obj.setRmk(arr.getString("RMK"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据T_USER_CHAN返回的查询DataRow创建一个T_USER_CHANEntity对象
* @param T_USER_CHAN row
* @returnT_USER_CHANList对象
* @throws Exception 
*/
public List<t_user_chan_Dao> get_t_user_chan_All() throws Exception{
        List<t_user_chan_Dao> _list = new ArrayList<t_user_chan_Dao>();
		String sqlStr = "{ call T_USER_CHAN_PRO.GetT_USER_CHAN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			t_user_chan_Dao _obj = new t_user_chan_Dao();
            _obj.setUname(arr.getString("UNAME"));
            _obj.setChanid(arr.getString("CHANID"));
            _obj.setRmk(arr.getString("RMK"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据T_USER_CHAN返回的查询DataRow创建一个T_USER_CHANEntity对象
* @param T_USER_CHAN row
* @returnT_USER_CHANList对象
* @throws Exception 
*/
public List< t_user_chan_Dao> get_t_user_chan_All(String strWhere) throws Exception{
         List<t_user_chan_Dao> _list = new ArrayList<t_user_chan_Dao>();
		 String sqlStr = "{ call T_USER_CHAN_PRO.GetT_USER_CHANWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				t_user_chan_Dao _obj = new t_user_chan_Dao();
            _obj.setUname(arr.getString("UNAME"));
            _obj.setChanid(arr.getString("CHANID"));
            _obj.setRmk(arr.getString("RMK"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据T_USER_CHAN返回 分页数据
* @param T_USER_CHAN row
* @returnT_USER_CHANList对象
* @throws Exception 
*/
public List<t_user_chan_Dao> get_t_user_chan_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<t_user_chan_Dao> _list = new ArrayList<t_user_chan_Dao>();
		String sqlStr = "{ call T_USER_CHAN_PRO.GetT_USER_CHANPage(?,?,?,?,?,?)}";
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
				t_user_chan_Dao _obj = new t_user_chan_Dao();
            _obj.setUname(arr.getString("UNAME"));
            _obj.setChanid(arr.getString("CHANID"));
            _obj.setRmk(arr.getString("RMK"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据T_USER_CHAN返回的查询DataRow创建一个T_USER_CHANEntity对象
* @param T_USER_CHAN row
* @returnT_USER_CHANDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, t_user_chan_Dao> get_t_user_chan_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dict_user_chanstrWhere") == null) {
			Dictionary<Integer, t_user_chan_Dao> _dic = new Hashtable<Integer, t_user_chan_Dao>();
			List<t_user_chan_Dao> _list = new ArrayList<t_user_chan_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getUname()), _list.get(i));
			}
			classFactory.cachePut("dict_user_chan", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, t_user_chan_Dao> _dic = (Dictionary<Integer, t_user_chan_Dao>) classFactory
					.cacheGet("dict_user_chanstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新T_USER_CHAN字段加一
* @param FieldName
* @param sid
*/
public int create_t_user_chan_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call T_USER_CHAN_PRO.UpdateFieldT_USER_CHAN(?,?)}";
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
* 更新T_USER_CHANInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_t_user_chan_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call T_USER_CHAN_PRO.UpdateFieldT_USER_CHANV(?,?,?)}";
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
* 更新T_USER_CHANIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_t_user_chan_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call T_USER_CHAN_PRO.UpdateFieldT_USER_CHANU(?,?,?)}";
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
