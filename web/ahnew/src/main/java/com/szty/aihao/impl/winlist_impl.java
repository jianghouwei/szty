/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataWinlist.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.winlist_Dao;
import com.szty.aihao.core.winlist_core;
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
*@WINLIST数据接口
*@作者：宋春林 
*/
public class winlist_impl implements winlist_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(winlist_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param WINLIST实体
* @return 新插入记录的编号
*/
public int insert_winlist(winlist_Dao _WINLISTModel)  throws Exception{
         String sqlStr = "{call WINLIST_PRO.InsertWINLIST(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_WINLISTModel.getWinnerid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_WINLISTModel.getUsername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_WINLISTModel.getPhone());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_WINLISTModel.getCdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_WINLISTModel.getStatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param WINLIST
* @Object 
* @return 新插入记录的编号
*/
public int insert_winlist(Object[] _para)  throws Exception{
      String sqlStr = "{call WINLIST_PRO.InsertWINLIST(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param WINLIST实体
* @return 影响的行数
*/
public int update_winlist(winlist_Dao _WINLISTModel)  throws Exception{
        String sqlStr = "{call WINLIST_PRO.UpdateWINLIST(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.BIGINT,_WINLISTModel.getWinnerid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_WINLISTModel.getUsername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_WINLISTModel.getPhone());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_WINLISTModel.getCdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_WINLISTModel.getStatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表WINLIST中的一条记录
* @param WINLIST实体
* @return 新插入记录的编号
*/
public int delete_winlist(int Winnerid)  throws Exception{
        String sqlStr = "{call WINLIST_PRO.DeleteWINLIST(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Winnerid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 winlist 数据实体
* @param Winnerid">Winnerid
* @return<winlist 数据实体
* @throws Exception 
*/
public winlist_Dao get_winlistDao(int Winnerid) throws Exception{
         String sqlStr = "{ call WINLIST_PRO.GetWINLISTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Winnerid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			winlist_Dao _obj = new winlist_Dao();
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPhone(arr.getString("PHONE"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据WINLIST返回的查询DataRow创建一个WINLISTEntity对象
* @param WINLIST row
* @returnWINLISTList对象
* @throws Exception 
*/
public List<winlist_Dao> get_winlist_All() throws Exception{
        List<winlist_Dao> _list = new ArrayList<winlist_Dao>();
		String sqlStr = "{ call WINLIST_PRO.GetWINLIST(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			winlist_Dao _obj = new winlist_Dao();
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPhone(arr.getString("PHONE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据WINLIST返回的查询DataRow创建一个WINLISTEntity对象
* @param WINLIST row
* @returnWINLISTList对象
* @throws Exception 
*/
public List< winlist_Dao> get_winlist_All(String strWhere) throws Exception{
         List<winlist_Dao> _list = new ArrayList<winlist_Dao>();
		 String sqlStr = "{ call WINLIST_PRO.GetWINLISTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				winlist_Dao _obj = new winlist_Dao();
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPhone(arr.getString("PHONE"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据WINLIST返回 分页数据
* @param WINLIST row
* @returnWINLISTList对象
* @throws Exception 
*/
public List<winlist_Dao> get_winlist_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<winlist_Dao> _list = new ArrayList<winlist_Dao>();
		String sqlStr = "{ call WINLIST_PRO.GetWINLISTPage(?,?,?,?,?,?)}";
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
				winlist_Dao _obj = new winlist_Dao();
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setPhone(arr.getString("PHONE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据WINLIST返回的查询DataRow创建一个WINLISTEntity对象
* @param WINLIST row
* @returnWINLISTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, winlist_Dao> get_winlist_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicwinliststrWhere") == null) {
			Dictionary<Integer, winlist_Dao> _dic = new Hashtable<Integer, winlist_Dao>();
			List<winlist_Dao> _list = new ArrayList<winlist_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((int)(_list.get(i).getWinnerid()), _list.get(i));
			}
			classFactory.cachePut("dicwinlist", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, winlist_Dao> _dic = (Dictionary<Integer, winlist_Dao>) classFactory
					.cacheGet("dicwinliststrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新WINLIST字段加一
* @param FieldName
* @param sid
*/
public int create_winlist_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call WINLIST_PRO.UpdateFieldWINLIST(?,?)}";
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
* 更新WINLISTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_winlist_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call WINLIST_PRO.UpdateFieldWINLISTV(?,?,?)}";
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
* 更新WINLISTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_winlist_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call WINLIST_PRO.UpdateFieldWINLISTU(?,?,?)}";
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
