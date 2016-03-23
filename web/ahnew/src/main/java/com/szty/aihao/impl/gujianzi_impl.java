/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataGujianzi.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.gujianzi_Dao;
import com.szty.aihao.core.gujianzi_core;
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
*@GUJIANZI数据接口
*@作者：宋春林 
*/
public class gujianzi_impl implements gujianzi_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(gujianzi_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param GUJIANZI实体
* @return 新插入记录的编号
*/
public int insert_gujianzi(gujianzi_Dao _GUJIANZIModel)  throws Exception{
         String sqlStr = "{call GUJIANZI_PRO.InsertGUJIANZI(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_GUJIANZIModel.getGjzid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GUJIANZIModel.getGjzname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GUJIANZIModel.getGjzcolor());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_GUJIANZIModel.getGjzorder());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_GUJIANZIModel.getCity());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_GUJIANZIModel.getProvince());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_GUJIANZIModel.getCdate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_GUJIANZIModel.getStatus());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_GUJIANZIModel.getGjzpic());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_GUJIANZIModel.getGjzsize());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_GUJIANZIModel.getGjzowner());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param GUJIANZI
* @Object 
* @return 新插入记录的编号
*/
public int insert_gujianzi(Object[] _para)  throws Exception{
      String sqlStr = "{call GUJIANZI_PRO.InsertGUJIANZI(?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[11];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param GUJIANZI实体
* @return 影响的行数
*/
public int update_gujianzi(gujianzi_Dao _GUJIANZIModel)  throws Exception{
        String sqlStr = "{call GUJIANZI_PRO.UpdateGUJIANZI(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_GUJIANZIModel.getGjzid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GUJIANZIModel.getGjzname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GUJIANZIModel.getGjzcolor());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_GUJIANZIModel.getGjzorder());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_GUJIANZIModel.getCity());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_GUJIANZIModel.getProvince());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_GUJIANZIModel.getCdate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_GUJIANZIModel.getStatus());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_GUJIANZIModel.getGjzpic());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_GUJIANZIModel.getGjzsize());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_GUJIANZIModel.getGjzowner());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表GUJIANZI中的一条记录
* @param GUJIANZI实体
* @return 新插入记录的编号
*/
public int delete_gujianzi(int Gjzid)  throws Exception{
        String sqlStr = "{call GUJIANZI_PRO.DeleteGUJIANZI(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Gjzid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 gujianzi 数据实体
* @param Gjzid">Gjzid
* @return<gujianzi 数据实体
* @throws Exception 
*/
public gujianzi_Dao get_gujianziDao(int Gjzid) throws Exception{
         String sqlStr = "{ call GUJIANZI_PRO.GetGUJIANZIEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Gjzid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			gujianzi_Dao _obj = new gujianzi_Dao();
            _obj.setGjzid(arr.getInt("GJZID"));
            _obj.setGjzname(arr.getString("GJZNAME"));
            _obj.setGjzcolor(arr.getString("GJZCOLOR"));
            _obj.setGjzorder(arr.getInt("GJZORDER"));
            _obj.setCity(arr.getInt("CITY"));
            _obj.setProvince(arr.getInt("PROVINCE"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setGjzpic(arr.getString("GJZPIC"));
            _obj.setGjzsize(arr.getInt("GJZSIZE"));
            _obj.setGjzowner(arr.getString("GJZOWNER"));
			return _obj;
		}
		return null;

}

/**
* 根据GUJIANZI返回的查询DataRow创建一个GUJIANZIEntity对象
* @param GUJIANZI row
* @returnGUJIANZIList对象
* @throws Exception 
*/
public List<gujianzi_Dao> get_gujianzi_All() throws Exception{
        List<gujianzi_Dao> _list = new ArrayList<gujianzi_Dao>();
		String sqlStr = "{ call GUJIANZI_PRO.GetGUJIANZI(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			gujianzi_Dao _obj = new gujianzi_Dao();
            _obj.setGjzid(arr.getInt("GJZID"));
            _obj.setGjzname(arr.getString("GJZNAME"));
            _obj.setGjzcolor(arr.getString("GJZCOLOR"));
            _obj.setGjzorder(arr.getInt("GJZORDER"));
            _obj.setCity(arr.getInt("CITY"));
            _obj.setProvince(arr.getInt("PROVINCE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setGjzpic(arr.getString("GJZPIC"));
            _obj.setGjzsize(arr.getInt("GJZSIZE"));
            _obj.setGjzowner(arr.getString("GJZOWNER"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据GUJIANZI返回的查询DataRow创建一个GUJIANZIEntity对象
* @param GUJIANZI row
* @returnGUJIANZIList对象
* @throws Exception 
*/
public List< gujianzi_Dao> get_gujianzi_All(String strWhere) throws Exception{
         List<gujianzi_Dao> _list = new ArrayList<gujianzi_Dao>();
		 String sqlStr = "{ call GUJIANZI_PRO.GetGUJIANZIWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				gujianzi_Dao _obj = new gujianzi_Dao();
            _obj.setGjzid(arr.getInt("GJZID"));
            _obj.setGjzname(arr.getString("GJZNAME"));
            _obj.setGjzcolor(arr.getString("GJZCOLOR"));
            _obj.setGjzorder(arr.getInt("GJZORDER"));
            _obj.setCity(arr.getInt("CITY"));
            _obj.setProvince(arr.getInt("PROVINCE"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setGjzpic(arr.getString("GJZPIC"));
            _obj.setGjzsize(arr.getInt("GJZSIZE"));
            _obj.setGjzowner(arr.getString("GJZOWNER"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据GUJIANZI返回 分页数据
* @param GUJIANZI row
* @returnGUJIANZIList对象
* @throws Exception 
*/
public List<gujianzi_Dao> get_gujianzi_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<gujianzi_Dao> _list = new ArrayList<gujianzi_Dao>();
		String sqlStr = "{ call GUJIANZI_PRO.GetGUJIANZIPage(?,?,?,?,?,?)}";
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
				gujianzi_Dao _obj = new gujianzi_Dao();
            _obj.setGjzid(arr.getInt("GJZID"));
            _obj.setGjzname(arr.getString("GJZNAME"));
            _obj.setGjzcolor(arr.getString("GJZCOLOR"));
            _obj.setGjzorder(arr.getInt("GJZORDER"));
            _obj.setCity(arr.getInt("CITY"));
            _obj.setProvince(arr.getInt("PROVINCE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setGjzpic(arr.getString("GJZPIC"));
            _obj.setGjzsize(arr.getInt("GJZSIZE"));
            _obj.setGjzowner(arr.getString("GJZOWNER"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据GUJIANZI返回的查询DataRow创建一个GUJIANZIEntity对象
* @param GUJIANZI row
* @returnGUJIANZIDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, gujianzi_Dao> get_gujianzi_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicgujianzistrWhere") == null) {
			Dictionary<Integer, gujianzi_Dao> _dic = new Hashtable<Integer, gujianzi_Dao>();
			List<gujianzi_Dao> _list = new ArrayList<gujianzi_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getGjzid()), _list.get(i));
			}
			classFactory.cachePut("dicgujianzi", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, gujianzi_Dao> _dic = (Dictionary<Integer, gujianzi_Dao>) classFactory
					.cacheGet("dicgujianzistrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新GUJIANZI字段加一
* @param FieldName
* @param sid
*/
public int create_gujianzi_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call GUJIANZI_PRO.UpdateFieldGUJIANZI(?,?)}";
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
* 更新GUJIANZIInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_gujianzi_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call GUJIANZI_PRO.UpdateFieldGUJIANZIV(?,?,?)}";
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
* 更新GUJIANZIIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_gujianzi_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call GUJIANZI_PRO.UpdateFieldGUJIANZIU(?,?,?)}";
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
