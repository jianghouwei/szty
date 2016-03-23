/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataA.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.a_Dao;
import com.szty.aihao.core.a_core;
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
*@A数据接口
*@作者：宋春林 
*/
public class a_impl implements a_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(a_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param A实体
* @return 新插入记录的编号
*/
public int insert_a(a_Dao _AModel)  throws Exception{
         String sqlStr = "{call A_PRO.InsertA(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AModel.getBusname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AModel.getTelephone());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AModel.getProvincename());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AModel.getCityname());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AModel.getGroupname());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AModel.getProvincecode());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AModel.getCitycode());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AModel.getGroupcode());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AModel.getWeight());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param A
* @Object 
* @return 新插入记录的编号
*/
public int insert_a(Object[] _para)  throws Exception{
      String sqlStr = "{call A_PRO.InsertA(?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[9];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param A实体
* @return 影响的行数
*/
public int update_a(a_Dao _AModel)  throws Exception{
        String sqlStr = "{call A_PRO.UpdateA(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_AModel.getBusname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AModel.getTelephone());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AModel.getProvincename());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AModel.getCityname());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AModel.getGroupname());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AModel.getProvincecode());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AModel.getCitycode());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AModel.getGroupcode());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AModel.getWeight());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表A中的一条记录
* @param A实体
* @return 新插入记录的编号
*/
public int delete_a(int Busname)  throws Exception{
        String sqlStr = "{call A_PRO.DeleteA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Busname);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 a 数据实体
* @param Busname">Busname
* @return<a 数据实体
* @throws Exception 
*/
public a_Dao get_aDao(int Busname) throws Exception{
         String sqlStr = "{ call A_PRO.GetAEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Busname);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			a_Dao _obj = new a_Dao();
            _obj.setBusname(arr.getString("BUSNAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setProvincename(arr.getString("PROVINCENAME"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupcode(arr.getString("GROUPCODE"));
            _obj.setWeight(arr.getString("WEIGHT"));
			return _obj;
		}
		return null;

}

/**
* 根据A返回的查询DataRow创建一个AEntity对象
* @param A row
* @returnAList对象
* @throws Exception 
*/
public List<a_Dao> get_a_All() throws Exception{
        List<a_Dao> _list = new ArrayList<a_Dao>();
		String sqlStr = "{ call A_PRO.GetA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			a_Dao _obj = new a_Dao();
            _obj.setBusname(arr.getString("BUSNAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setProvincename(arr.getString("PROVINCENAME"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupcode(arr.getString("GROUPCODE"));
            _obj.setWeight(arr.getString("WEIGHT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据A返回的查询DataRow创建一个AEntity对象
* @param A row
* @returnAList对象
* @throws Exception 
*/
public List< a_Dao> get_a_All(String strWhere) throws Exception{
         List<a_Dao> _list = new ArrayList<a_Dao>();
		 String sqlStr = "{ call A_PRO.GetAWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				a_Dao _obj = new a_Dao();
            _obj.setBusname(arr.getString("BUSNAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setProvincename(arr.getString("PROVINCENAME"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupcode(arr.getString("GROUPCODE"));
            _obj.setWeight(arr.getString("WEIGHT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据A返回 分页数据
* @param A row
* @returnAList对象
* @throws Exception 
*/
public List<a_Dao> get_a_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<a_Dao> _list = new ArrayList<a_Dao>();
		String sqlStr = "{ call A_PRO.GetAPage(?,?,?,?,?,?)}";
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
				a_Dao _obj = new a_Dao();
            _obj.setBusname(arr.getString("BUSNAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setProvincename(arr.getString("PROVINCENAME"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupcode(arr.getString("GROUPCODE"));
            _obj.setWeight(arr.getString("WEIGHT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据A返回的查询DataRow创建一个AEntity对象
* @param A row
* @returnADictionary对象
* @throws Exception 
*/
public Dictionary<Integer, a_Dao> get_a_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicastrWhere") == null) {
			Dictionary<Integer, a_Dao> _dic = new Hashtable<Integer, a_Dao>();
			List<a_Dao> _list = new ArrayList<a_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getBusname()), _list.get(i));
			}
			classFactory.cachePut("dica", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, a_Dao> _dic = (Dictionary<Integer, a_Dao>) classFactory
					.cacheGet("dicastrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新A字段加一
* @param FieldName
* @param sid
*/
public int create_a_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call A_PRO.UpdateFieldA(?,?)}";
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
* 更新AInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_a_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call A_PRO.UpdateFieldAV(?,?,?)}";
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
* 更新AIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_a_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call A_PRO.UpdateFieldAU(?,?,?)}";
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
