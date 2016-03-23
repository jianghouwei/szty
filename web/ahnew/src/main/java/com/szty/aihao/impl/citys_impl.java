/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataCitys.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.citys_Dao;
import com.szty.aihao.core.citys_core;
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
*@CITYS数据接口
*@作者：宋春林 
*/
public class citys_impl implements citys_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(citys_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param CITYS实体
* @return 新插入记录的编号
*/
public int insert_citys(citys_Dao _CITYSModel)  throws Exception{
         String sqlStr = "{call CITYS_PRO.InsertCITYS(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_CITYSModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getCityname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_CITYSModel.getProcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_CITYSModel.getCitycode());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getWeather_code());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getCitypinyin());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getCityh());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getCitysx());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getQuhao());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getYoubian());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param CITYS
* @Object 
* @return 新插入记录的编号
*/
public int insert_citys(Object[] _para)  throws Exception{
      String sqlStr = "{call CITYS_PRO.InsertCITYS(?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[10];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param CITYS实体
* @return 影响的行数
*/
public int update_citys(citys_Dao _CITYSModel)  throws Exception{
        String sqlStr = "{call CITYS_PRO.UpdateCITYS(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_CITYSModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getCityname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_CITYSModel.getProcode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_CITYSModel.getCitycode());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getWeather_code());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getCitypinyin());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getCityh());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getCitysx());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getQuhao());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_CITYSModel.getYoubian());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表CITYS中的一条记录
* @param CITYS实体
* @return 新插入记录的编号
*/
public int delete_citys(int Id)  throws Exception{
        String sqlStr = "{call CITYS_PRO.DeleteCITYS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 citys 数据实体
* @param Id">Id
* @return<citys 数据实体
* @throws Exception 
*/
public citys_Dao get_citysDao(int Id) throws Exception{
         String sqlStr = "{ call CITYS_PRO.GetCITYSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			citys_Dao _obj = new citys_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setWeather_code(arr.getString("WEATHER_CODE"));
            _obj.setCitypinyin(arr.getString("CITYPINYIN"));
            _obj.setCityh(arr.getString("CITYH"));
            _obj.setCitysx(arr.getString("CITYSX"));
            _obj.setQuhao(arr.getString("QUHAO"));
            _obj.setYoubian(arr.getString("YOUBIAN"));
			return _obj;
		}
		return null;

}

/**
* 根据CITYS返回的查询DataRow创建一个CITYSEntity对象
* @param CITYS row
* @returnCITYSList对象
* @throws Exception 
*/
public List<citys_Dao> get_citys_All() throws Exception{
        List<citys_Dao> _list = new ArrayList<citys_Dao>();
		String sqlStr = "{ call CITYS_PRO.GetCITYS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			citys_Dao _obj = new citys_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setWeather_code(arr.getString("WEATHER_CODE"));
            _obj.setCitypinyin(arr.getString("CITYPINYIN"));
            _obj.setCityh(arr.getString("CITYH"));
            _obj.setCitysx(arr.getString("CITYSX"));
            _obj.setQuhao(arr.getString("QUHAO"));
            _obj.setYoubian(arr.getString("YOUBIAN"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据CITYS返回的查询DataRow创建一个CITYSEntity对象
* @param CITYS row
* @returnCITYSList对象
* @throws Exception 
*/
public List< citys_Dao> get_citys_All(String strWhere) throws Exception{
         List<citys_Dao> _list = new ArrayList<citys_Dao>();
		 String sqlStr = "{ call CITYS_PRO.GetCITYSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				citys_Dao _obj = new citys_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setWeather_code(arr.getString("WEATHER_CODE"));
            _obj.setCitypinyin(arr.getString("CITYPINYIN"));
            _obj.setCityh(arr.getString("CITYH"));
            _obj.setCitysx(arr.getString("CITYSX"));
            _obj.setQuhao(arr.getString("QUHAO"));
            _obj.setYoubian(arr.getString("YOUBIAN"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据CITYS返回 分页数据
* @param CITYS row
* @returnCITYSList对象
* @throws Exception 
*/
public List<citys_Dao> get_citys_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<citys_Dao> _list = new ArrayList<citys_Dao>();
		String sqlStr = "{ call CITYS_PRO.GetCITYSPage(?,?,?,?,?,?)}";
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
				citys_Dao _obj = new citys_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setWeather_code(arr.getString("WEATHER_CODE"));
            _obj.setCitypinyin(arr.getString("CITYPINYIN"));
            _obj.setCityh(arr.getString("CITYH"));
            _obj.setCitysx(arr.getString("CITYSX"));
            _obj.setQuhao(arr.getString("QUHAO"));
            _obj.setYoubian(arr.getString("YOUBIAN"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据CITYS返回的查询DataRow创建一个CITYSEntity对象
* @param CITYS row
* @returnCITYSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, citys_Dao> get_citys_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("diccitysstrWhere") == null) {
			Dictionary<Integer, citys_Dao> _dic = new Hashtable<Integer, citys_Dao>();
			List<citys_Dao> _list = new ArrayList<citys_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("diccitys", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, citys_Dao> _dic = (Dictionary<Integer, citys_Dao>) classFactory
					.cacheGet("diccitysstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新CITYS字段加一
* @param FieldName
* @param sid
*/
public int create_citys_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call CITYS_PRO.UpdateFieldCITYS(?,?)}";
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
* 更新CITYSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_citys_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call CITYS_PRO.UpdateFieldCITYSV(?,?,?)}";
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
* 更新CITYSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_citys_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call CITYS_PRO.UpdateFieldCITYSU(?,?,?)}";
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
