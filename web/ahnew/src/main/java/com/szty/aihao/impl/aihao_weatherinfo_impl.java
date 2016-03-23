/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihao_weatherinfo.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihao_weatherinfo_Dao;
import com.szty.aihao.core.aihao_weatherinfo_core;
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
*@AIHAO_WEATHERINFO数据接口
*@作者：宋春林 
*/
public class aihao_weatherinfo_impl implements aihao_weatherinfo_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihao_weatherinfo_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAO_WEATHERINFO实体
* @return 新插入记录的编号
*/
public int insert_aihao_weatherinfo(aihao_weatherinfo_Dao _AIHAO_WEATHERINFOModel)  throws Exception{
         String sqlStr = "{call AIHAO_WEATHERINFO_PRO.InsertAIHAO_WEATHERINFO(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[21];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAO_WEATHERINFOModel.getWid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_WEATHERINFOModel.getWdate()));
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getProvinceid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getCityid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getTemp_high());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getTemp_low());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getWeather_day());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_AIHAO_WEATHERINFOModel.getWeather_day_code());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getWeather_night());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_AIHAO_WEATHERINFOModel.getWeather_night_code());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getWind());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getSuggest());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getUv());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getXc());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getCx());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getCl());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getLs());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getAllergy());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getCo());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_WEATHERINFOModel.getCreattime()));
        op[20]= new OracleParameter(21, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_WEATHERINFOModel.getUpdatetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAO_WEATHERINFO
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihao_weatherinfo(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAO_WEATHERINFO_PRO.InsertAIHAO_WEATHERINFO(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[21];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.DATE, dateformat.format(_para[1]));
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_para[18]);
        op[19]= new OracleParameter(20, "IN", java.sql.Types.DATE, dateformat.format(_para[19]));
        op[20]= new OracleParameter(21, "IN", java.sql.Types.DATE, dateformat.format(_para[20]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAO_WEATHERINFO实体
* @return 影响的行数
*/
public int update_aihao_weatherinfo(aihao_weatherinfo_Dao _AIHAO_WEATHERINFOModel)  throws Exception{
        String sqlStr = "{call AIHAO_WEATHERINFO_PRO.UpdateAIHAO_WEATHERINFO(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[21];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAO_WEATHERINFOModel.getWid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_WEATHERINFOModel.getWdate()));
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getProvinceid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getCityid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getTemp_high());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getTemp_low());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getWeather_day());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_AIHAO_WEATHERINFOModel.getWeather_day_code());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getWeather_night());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_AIHAO_WEATHERINFOModel.getWeather_night_code());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getWind());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getSuggest());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getUv());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getXc());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getCx());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getCl());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getLs());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getAllergy());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_AIHAO_WEATHERINFOModel.getCo());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_WEATHERINFOModel.getCreattime()));
        op[20]= new OracleParameter(21, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_WEATHERINFOModel.getUpdatetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAO_WEATHERINFO中的一条记录
* @param AIHAO_WEATHERINFO实体
* @return 新插入记录的编号
*/
public int delete_aihao_weatherinfo(int Wid)  throws Exception{
        String sqlStr = "{call AIHAO_WEATHERINFO_PRO.DeleteAIHAO_WEATHERINFO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Wid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihao_weatherinfo 数据实体
* @param Wid">Wid
* @return<aihao_weatherinfo 数据实体
* @throws Exception 
*/
public aihao_weatherinfo_Dao get_aihao_weatherinfoDao(int Wid) throws Exception{
         String sqlStr = "{ call AIHAO_WEATHERINFO_PRO.GetAIHAO_WEATHERINFOEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Wid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_weatherinfo_Dao _obj = new aihao_weatherinfo_Dao();
            _obj.setWid(arr.getInt("WID"));
             try{_obj.setWdate(dateformat.parse(arr.getString("WDATE")));}catch(Exception ce){_obj.setWdate((new Date()));}
            _obj.setProvinceid(arr.getString("PROVINCEID"));
            _obj.setCityid(arr.getString("CITYID"));
            _obj.setTemp_high(arr.getString("TEMP_HIGH"));
            _obj.setTemp_low(arr.getString("TEMP_LOW"));
            _obj.setWeather_day(arr.getString("WEATHER_DAY"));
            _obj.setWeather_day_code(arr.getInt("WEATHER_DAY_CODE"));
            _obj.setWeather_night(arr.getString("WEATHER_NIGHT"));
            _obj.setWeather_night_code(arr.getInt("WEATHER_NIGHT_CODE"));
            _obj.setWind(arr.getString("WIND"));
            _obj.setSuggest(arr.getString("SUGGEST"));
            _obj.setUv(arr.getString("UV"));
            _obj.setXc(arr.getString("XC"));
            _obj.setCx(arr.getString("CX"));
            _obj.setCl(arr.getString("CL"));
            _obj.setLs(arr.getString("LS"));
            _obj.setAllergy(arr.getString("ALLERGY"));
            _obj.setCo(arr.getString("CO"));
             try{_obj.setCreattime(dateformat.parse(arr.getString("CREATTIME")));}catch(Exception ce){_obj.setCreattime((new Date()));}
             try{_obj.setUpdatetime(dateformat.parse(arr.getString("UPDATETIME")));}catch(Exception ce){_obj.setUpdatetime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据AIHAO_WEATHERINFO返回的查询DataRow创建一个AIHAO_WEATHERINFOEntity对象
* @param AIHAO_WEATHERINFO row
* @returnAIHAO_WEATHERINFOList对象
* @throws Exception 
*/
public List<aihao_weatherinfo_Dao> get_aihao_weatherinfo_All() throws Exception{
        List<aihao_weatherinfo_Dao> _list = new ArrayList<aihao_weatherinfo_Dao>();
		String sqlStr = "{ call AIHAO_WEATHERINFO_PRO.GetAIHAO_WEATHERINFO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_weatherinfo_Dao _obj = new aihao_weatherinfo_Dao();
            _obj.setWid(arr.getInt("WID"));
            try{_obj.setWdate(dateformat.parse(arr.getString("WDATE")));}catch(Exception ce){_obj.setWdate((new Date()));}
            _obj.setProvinceid(arr.getString("PROVINCEID"));
            _obj.setCityid(arr.getString("CITYID"));
            _obj.setTemp_high(arr.getString("TEMP_HIGH"));
            _obj.setTemp_low(arr.getString("TEMP_LOW"));
            _obj.setWeather_day(arr.getString("WEATHER_DAY"));
            _obj.setWeather_day_code(arr.getInt("WEATHER_DAY_CODE"));
            _obj.setWeather_night(arr.getString("WEATHER_NIGHT"));
            _obj.setWeather_night_code(arr.getInt("WEATHER_NIGHT_CODE"));
            _obj.setWind(arr.getString("WIND"));
            _obj.setSuggest(arr.getString("SUGGEST"));
            _obj.setUv(arr.getString("UV"));
            _obj.setXc(arr.getString("XC"));
            _obj.setCx(arr.getString("CX"));
            _obj.setCl(arr.getString("CL"));
            _obj.setLs(arr.getString("LS"));
            _obj.setAllergy(arr.getString("ALLERGY"));
            _obj.setCo(arr.getString("CO"));
            try{_obj.setCreattime(dateformat.parse(arr.getString("CREATTIME")));}catch(Exception ce){_obj.setCreattime((new Date()));}
            try{_obj.setUpdatetime(dateformat.parse(arr.getString("UPDATETIME")));}catch(Exception ce){_obj.setUpdatetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAO_WEATHERINFO返回的查询DataRow创建一个AIHAO_WEATHERINFOEntity对象
* @param AIHAO_WEATHERINFO row
* @returnAIHAO_WEATHERINFOList对象
* @throws Exception 
*/
public List< aihao_weatherinfo_Dao> get_aihao_weatherinfo_All(String strWhere) throws Exception{
         List<aihao_weatherinfo_Dao> _list = new ArrayList<aihao_weatherinfo_Dao>();
		 String sqlStr = "{ call AIHAO_WEATHERINFO_PRO.GetAIHAO_WEATHERINFOWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihao_weatherinfo_Dao _obj = new aihao_weatherinfo_Dao();
            _obj.setWid(arr.getInt("WID"));
           try{_obj.setWdate(dateformat.parse(arr.getString("WDATE")));}catch(Exception ce){_obj.setWdate((new Date()));}
            _obj.setProvinceid(arr.getString("PROVINCEID"));
            _obj.setCityid(arr.getString("CITYID"));
            _obj.setTemp_high(arr.getString("TEMP_HIGH"));
            _obj.setTemp_low(arr.getString("TEMP_LOW"));
            _obj.setWeather_day(arr.getString("WEATHER_DAY"));
            _obj.setWeather_day_code(arr.getInt("WEATHER_DAY_CODE"));
            _obj.setWeather_night(arr.getString("WEATHER_NIGHT"));
            _obj.setWeather_night_code(arr.getInt("WEATHER_NIGHT_CODE"));
            _obj.setWind(arr.getString("WIND"));
            _obj.setSuggest(arr.getString("SUGGEST"));
            _obj.setUv(arr.getString("UV"));
            _obj.setXc(arr.getString("XC"));
            _obj.setCx(arr.getString("CX"));
            _obj.setCl(arr.getString("CL"));
            _obj.setLs(arr.getString("LS"));
            _obj.setAllergy(arr.getString("ALLERGY"));
            _obj.setCo(arr.getString("CO"));
           try{_obj.setCreattime(dateformat.parse(arr.getString("CREATTIME")));}catch(Exception ce){_obj.setCreattime((new Date()));}
           try{_obj.setUpdatetime(dateformat.parse(arr.getString("UPDATETIME")));}catch(Exception ce){_obj.setUpdatetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAO_WEATHERINFO返回 分页数据
* @param AIHAO_WEATHERINFO row
* @returnAIHAO_WEATHERINFOList对象
* @throws Exception 
*/
public List<aihao_weatherinfo_Dao> get_aihao_weatherinfo_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihao_weatherinfo_Dao> _list = new ArrayList<aihao_weatherinfo_Dao>();
		String sqlStr = "{ call AIHAO_WEATHERINFO_PRO.GetAIHAO_WEATHERINFOPage(?,?,?,?,?,?)}";
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
				aihao_weatherinfo_Dao _obj = new aihao_weatherinfo_Dao();
            _obj.setWid(arr.getInt("WID"));
            try{_obj.setWdate(dateformat.parse(arr.getString("WDATE")));}catch(Exception ce){_obj.setWdate((new Date()));}
            _obj.setProvinceid(arr.getString("PROVINCEID"));
            _obj.setCityid(arr.getString("CITYID"));
            _obj.setTemp_high(arr.getString("TEMP_HIGH"));
            _obj.setTemp_low(arr.getString("TEMP_LOW"));
            _obj.setWeather_day(arr.getString("WEATHER_DAY"));
            _obj.setWeather_day_code(arr.getInt("WEATHER_DAY_CODE"));
            _obj.setWeather_night(arr.getString("WEATHER_NIGHT"));
            _obj.setWeather_night_code(arr.getInt("WEATHER_NIGHT_CODE"));
            _obj.setWind(arr.getString("WIND"));
            _obj.setSuggest(arr.getString("SUGGEST"));
            _obj.setUv(arr.getString("UV"));
            _obj.setXc(arr.getString("XC"));
            _obj.setCx(arr.getString("CX"));
            _obj.setCl(arr.getString("CL"));
            _obj.setLs(arr.getString("LS"));
            _obj.setAllergy(arr.getString("ALLERGY"));
            _obj.setCo(arr.getString("CO"));
            try{_obj.setCreattime(dateformat.parse(arr.getString("CREATTIME")));}catch(Exception ce){_obj.setCreattime((new Date()));}
            try{_obj.setUpdatetime(dateformat.parse(arr.getString("UPDATETIME")));}catch(Exception ce){_obj.setUpdatetime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAO_WEATHERINFO返回的查询DataRow创建一个AIHAO_WEATHERINFOEntity对象
* @param AIHAO_WEATHERINFO row
* @returnAIHAO_WEATHERINFODictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihao_weatherinfo_Dao> get_aihao_weatherinfo_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihao_weatherinfostrWhere") == null) {
			Dictionary<Integer, aihao_weatherinfo_Dao> _dic = new Hashtable<Integer, aihao_weatherinfo_Dao>();
			List<aihao_weatherinfo_Dao> _list = new ArrayList<aihao_weatherinfo_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getWid()), _list.get(i));
			}
			classFactory.cachePut("dicaihao_weatherinfo", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihao_weatherinfo_Dao> _dic = (Dictionary<Integer, aihao_weatherinfo_Dao>) classFactory
					.cacheGet("dicaihao_weatherinfostrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAO_WEATHERINFO字段加一
* @param FieldName
* @param sid
*/
public int create_aihao_weatherinfo_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAO_WEATHERINFO_PRO.UpdateFieldAIHAO_WEATHERINFO(?,?)}";
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
* 更新AIHAO_WEATHERINFOInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihao_weatherinfo_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAO_WEATHERINFO_PRO.UpdateFieldAIHAO_WEATHERINFOV(?,?,?)}";
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
* 更新AIHAO_WEATHERINFOIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihao_weatherinfo_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAO_WEATHERINFO_PRO.UpdateFieldAIHAO_WEATHERINFOU(?,?,?)}";
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
