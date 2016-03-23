/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataCitys_bak2012.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.citys_bak2012_Dao;
import com.szty.aihao.core.citys_bak2012_core;
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
*@CITYS_BAK2012数据接口
*@作者：宋春林 
*/
public class citys_bak2012_impl implements citys_bak2012_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(citys_bak2012_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param CITYS_BAK2012实体
* @return 新插入记录的编号
*/
public int insert_citys_bak2012(citys_bak2012_Dao _CITYS_BAK2012Model)  throws Exception{
         String sqlStr = "{call CITYS_BAK2012_PRO.InsertCITYS_BAK2012(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_CITYS_BAK2012Model.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_CITYS_BAK2012Model.getCityname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_CITYS_BAK2012Model.getProcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_CITYS_BAK2012Model.getCitycode());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_CITYS_BAK2012Model.getWeather_code());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_CITYS_BAK2012Model.getCitypinyin());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_CITYS_BAK2012Model.getCityh());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_CITYS_BAK2012Model.getCitysx());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param CITYS_BAK2012
* @Object 
* @return 新插入记录的编号
*/
public int insert_citys_bak2012(Object[] _para)  throws Exception{
      String sqlStr = "{call CITYS_BAK2012_PRO.InsertCITYS_BAK2012(?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[8];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param CITYS_BAK2012实体
* @return 影响的行数
*/
public int update_citys_bak2012(citys_bak2012_Dao _CITYS_BAK2012Model)  throws Exception{
        String sqlStr = "{call CITYS_BAK2012_PRO.UpdateCITYS_BAK2012(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_CITYS_BAK2012Model.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_CITYS_BAK2012Model.getCityname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_CITYS_BAK2012Model.getProcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_CITYS_BAK2012Model.getCitycode());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_CITYS_BAK2012Model.getWeather_code());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_CITYS_BAK2012Model.getCitypinyin());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_CITYS_BAK2012Model.getCityh());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_CITYS_BAK2012Model.getCitysx());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表CITYS_BAK2012中的一条记录
* @param CITYS_BAK2012实体
* @return 新插入记录的编号
*/
public int delete_citys_bak2012(int Id)  throws Exception{
        String sqlStr = "{call CITYS_BAK2012_PRO.DeleteCITYS_BAK2012(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 citys_bak2012 数据实体
* @param Id">Id
* @return<citys_bak2012 数据实体
* @throws Exception 
*/
public citys_bak2012_Dao get_citys_bak2012Dao(int Id) throws Exception{
         String sqlStr = "{ call CITYS_BAK2012_PRO.GetCITYS_BAK2012Entity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			citys_bak2012_Dao _obj = new citys_bak2012_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setWeather_code(arr.getString("WEATHER_CODE"));
            _obj.setCitypinyin(arr.getString("CITYPINYIN"));
            _obj.setCityh(arr.getString("CITYH"));
            _obj.setCitysx(arr.getString("CITYSX"));
			return _obj;
		}
		return null;

}

/**
* 根据CITYS_BAK2012返回的查询DataRow创建一个CITYS_BAK2012Entity对象
* @param CITYS_BAK2012 row
* @returnCITYS_BAK2012List对象
* @throws Exception 
*/
public List<citys_bak2012_Dao> get_citys_bak2012_All() throws Exception{
        List<citys_bak2012_Dao> _list = new ArrayList<citys_bak2012_Dao>();
		String sqlStr = "{ call CITYS_BAK2012_PRO.GetCITYS_BAK2012(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			citys_bak2012_Dao _obj = new citys_bak2012_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setWeather_code(arr.getString("WEATHER_CODE"));
            _obj.setCitypinyin(arr.getString("CITYPINYIN"));
            _obj.setCityh(arr.getString("CITYH"));
            _obj.setCitysx(arr.getString("CITYSX"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据CITYS_BAK2012返回的查询DataRow创建一个CITYS_BAK2012Entity对象
* @param CITYS_BAK2012 row
* @returnCITYS_BAK2012List对象
* @throws Exception 
*/
public List< citys_bak2012_Dao> get_citys_bak2012_All(String strWhere) throws Exception{
         List<citys_bak2012_Dao> _list = new ArrayList<citys_bak2012_Dao>();
		 String sqlStr = "{ call CITYS_BAK2012_PRO.GetCITYS_BAK2012Where(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				citys_bak2012_Dao _obj = new citys_bak2012_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setWeather_code(arr.getString("WEATHER_CODE"));
            _obj.setCitypinyin(arr.getString("CITYPINYIN"));
            _obj.setCityh(arr.getString("CITYH"));
            _obj.setCitysx(arr.getString("CITYSX"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据CITYS_BAK2012返回 分页数据
* @param CITYS_BAK2012 row
* @returnCITYS_BAK2012List对象
* @throws Exception 
*/
public List<citys_bak2012_Dao> get_citys_bak2012_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<citys_bak2012_Dao> _list = new ArrayList<citys_bak2012_Dao>();
		String sqlStr = "{ call CITYS_BAK2012_PRO.GetCITYS_BAK2012Page(?,?,?,?,?,?)}";
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
				citys_bak2012_Dao _obj = new citys_bak2012_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setWeather_code(arr.getString("WEATHER_CODE"));
            _obj.setCitypinyin(arr.getString("CITYPINYIN"));
            _obj.setCityh(arr.getString("CITYH"));
            _obj.setCitysx(arr.getString("CITYSX"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据CITYS_BAK2012返回的查询DataRow创建一个CITYS_BAK2012Entity对象
* @param CITYS_BAK2012 row
* @returnCITYS_BAK2012Dictionary对象
* @throws Exception 
*/
public Dictionary<Integer, citys_bak2012_Dao> get_citys_bak2012_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("diccitys_bak2012strWhere") == null) {
			Dictionary<Integer, citys_bak2012_Dao> _dic = new Hashtable<Integer, citys_bak2012_Dao>();
			List<citys_bak2012_Dao> _list = new ArrayList<citys_bak2012_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("diccitys_bak2012", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, citys_bak2012_Dao> _dic = (Dictionary<Integer, citys_bak2012_Dao>) classFactory
					.cacheGet("diccitys_bak2012strWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新CITYS_BAK2012字段加一
* @param FieldName
* @param sid
*/
public int create_citys_bak2012_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call CITYS_BAK2012_PRO.UpdateFieldCITYS_BAK2012(?,?)}";
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
* 更新CITYS_BAK2012Int型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_citys_bak2012_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call CITYS_BAK2012_PRO.UpdateFieldCITYS_BAK2012V(?,?,?)}";
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
* 更新CITYS_BAK2012IString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_citys_bak2012_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call CITYS_BAK2012_PRO.UpdateFieldCITYS_BAK2012U(?,?,?)}";
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
