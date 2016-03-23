/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataGa.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.ga_Dao;
import com.szty.aihao.core.ga_core;
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
*@GA数据接口
*@作者：宋春林 
*/
public class ga_impl implements ga_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(ga_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param GA实体
* @return 新插入记录的编号
*/
public int insert_ga(ga_Dao _GAModel)  throws Exception{
         String sqlStr = "{call GA_PRO.InsertGA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[44];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_GAModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GAModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GAModel.getTelno());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_GAModel.getAddress());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_GAModel.getBranch_name());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_GAModel.getShort_name());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_GAModel.getIntroduction());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_GAModel.getRecommendation());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_GAModel.getFeature());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_GAModel.getSpecial_offer());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_GAModel.getStyle());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_GAModel.getProvince_id());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_GAModel.getCity_id());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_GAModel.getDistrict_id());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_GAModel.getTrade_id());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_GAModel.getProvince_name());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_GAModel.getCity_name());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_GAModel.getDistrict_name());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_GAModel.getTrade_name());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_GAModel.getLevel());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.DATE, dateformat.format(_GAModel.getCreated_at()));
        op[21]= new OracleParameter(22, "IN", java.sql.Types.DATE, dateformat.format(_GAModel.getUpdated_at()));
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NVARCHAR,_GAModel.getService_mask());
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NVARCHAR,_GAModel.getX());
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NVARCHAR,_GAModel.getY());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NVARCHAR,_GAModel.getLandmark());
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NVARCHAR,_GAModel.getRegion());
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NVARCHAR,_GAModel.getAttributes());
        op[28]= new OracleParameter(29, "IN", java.sql.Types.NVARCHAR,_GAModel.getSource());
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NUMERIC,_GAModel.getXy_level());
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NUMERIC,_GAModel.getWeight());
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NUMERIC,_GAModel.getIs_exist());
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_GAModel.getTag());
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NVARCHAR,_GAModel.getCategory());
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_GAModel.getPrice());
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NVARCHAR,_GAModel.getOpen_time());
        op[36]= new OracleParameter(37, "IN", java.sql.Types.NVARCHAR,_GAModel.getOfficial_site());
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NUMERIC,_GAModel.getWl_discount());
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_GAModel.getBizcode());
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NUMERIC,_GAModel.getStatus());
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_GAModel.getOwner());
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NUMERIC,_GAModel.getCollector_id());
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NUMERIC,_GAModel.getReview_count());
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NUMERIC,_GAModel.getIs_disp());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param GA
* @Object 
* @return 新插入记录的编号
*/
public int insert_ga(Object[] _para)  throws Exception{
      String sqlStr = "{call GA_PRO.InsertGA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[44];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_para[18]);
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_para[19]);
        op[20]= new OracleParameter(21, "IN", java.sql.Types.DATE, dateformat.format(_para[20]));
        op[21]= new OracleParameter(22, "IN", java.sql.Types.DATE, dateformat.format(_para[21]));
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NVARCHAR,_para[22]);
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NVARCHAR,_para[23]);
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NVARCHAR,_para[24]);
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NVARCHAR,_para[25]);
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NVARCHAR,_para[26]);
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NVARCHAR,_para[27]);
        op[28]= new OracleParameter(29, "IN", java.sql.Types.NVARCHAR,_para[28]);
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NUMERIC,_para[29]);
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NUMERIC,_para[30]);
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NUMERIC,_para[31]);
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_para[32]);
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NVARCHAR,_para[33]);
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_para[34]);
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NVARCHAR,_para[35]);
        op[36]= new OracleParameter(37, "IN", java.sql.Types.NVARCHAR,_para[36]);
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NUMERIC,_para[37]);
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_para[38]);
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NUMERIC,_para[39]);
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_para[40]);
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NUMERIC,_para[41]);
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NUMERIC,_para[42]);
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NUMERIC,_para[43]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param GA实体
* @return 影响的行数
*/
public int update_ga(ga_Dao _GAModel)  throws Exception{
        String sqlStr = "{call GA_PRO.UpdateGA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[44];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_GAModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GAModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GAModel.getTelno());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_GAModel.getAddress());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_GAModel.getBranch_name());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_GAModel.getShort_name());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_GAModel.getIntroduction());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_GAModel.getRecommendation());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_GAModel.getFeature());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_GAModel.getSpecial_offer());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_GAModel.getStyle());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_GAModel.getProvince_id());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_GAModel.getCity_id());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_GAModel.getDistrict_id());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_GAModel.getTrade_id());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_GAModel.getProvince_name());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_GAModel.getCity_name());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_GAModel.getDistrict_name());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_GAModel.getTrade_name());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_GAModel.getLevel());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.DATE, dateformat.format(_GAModel.getCreated_at()));
        op[21]= new OracleParameter(22, "IN", java.sql.Types.DATE, dateformat.format(_GAModel.getUpdated_at()));
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NVARCHAR,_GAModel.getService_mask());
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NVARCHAR,_GAModel.getX());
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NVARCHAR,_GAModel.getY());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NVARCHAR,_GAModel.getLandmark());
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NVARCHAR,_GAModel.getRegion());
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NVARCHAR,_GAModel.getAttributes());
        op[28]= new OracleParameter(29, "IN", java.sql.Types.NVARCHAR,_GAModel.getSource());
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NUMERIC,_GAModel.getXy_level());
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NUMERIC,_GAModel.getWeight());
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NUMERIC,_GAModel.getIs_exist());
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_GAModel.getTag());
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NVARCHAR,_GAModel.getCategory());
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_GAModel.getPrice());
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NVARCHAR,_GAModel.getOpen_time());
        op[36]= new OracleParameter(37, "IN", java.sql.Types.NVARCHAR,_GAModel.getOfficial_site());
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NUMERIC,_GAModel.getWl_discount());
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_GAModel.getBizcode());
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NUMERIC,_GAModel.getStatus());
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_GAModel.getOwner());
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NUMERIC,_GAModel.getCollector_id());
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NUMERIC,_GAModel.getReview_count());
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NUMERIC,_GAModel.getIs_disp());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表GA中的一条记录
* @param GA实体
* @return 新插入记录的编号
*/
public int delete_ga(int Id)  throws Exception{
        String sqlStr = "{call GA_PRO.DeleteGA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 ga 数据实体
* @param Id">Id
* @return<ga 数据实体
* @throws Exception 
*/
public ga_Dao get_gaDao(int Id) throws Exception{
         String sqlStr = "{ call GA_PRO.GetGAEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			ga_Dao _obj = new ga_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelno(arr.getString("TELNO"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setBranch_name(arr.getString("BRANCH_NAME"));
            _obj.setShort_name(arr.getString("SHORT_NAME"));
            _obj.setIntroduction(arr.getString("INTRODUCTION"));
            _obj.setRecommendation(arr.getString("RECOMMENDATION"));
            _obj.setFeature(arr.getString("FEATURE"));
            _obj.setSpecial_offer(arr.getString("SPECIAL_OFFER"));
            _obj.setStyle(arr.getString("STYLE"));
            _obj.setProvince_id(arr.getInt("PROVINCE_ID"));
            _obj.setCity_id(arr.getInt("CITY_ID"));
            _obj.setDistrict_id(arr.getInt("DISTRICT_ID"));
            _obj.setTrade_id(arr.getInt("TRADE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setCity_name(arr.getString("CITY_NAME"));
            _obj.setDistrict_name(arr.getString("DISTRICT_NAME"));
            _obj.setTrade_name(arr.getString("TRADE_NAME"));
            _obj.setLevel(arr.getInt("LEVEL"));
             try{_obj.setCreated_at(dateformat.parse(arr.getString("CREATED_AT")));}catch(Exception ce){_obj.setCreated_at((new Date()));}
             try{_obj.setUpdated_at(dateformat.parse(arr.getString("UPDATED_AT")));}catch(Exception ce){_obj.setUpdated_at((new Date()));}
            _obj.setService_mask(arr.getString("SERVICE_MASK"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _obj.setLandmark(arr.getString("LANDMARK"));
            _obj.setRegion(arr.getString("REGION"));
            _obj.setSource(arr.getString("SOURCE"));
            _obj.setXy_level(arr.getInt("XY_LEVEL"));
            _obj.setWeight(arr.getInt("WEIGHT"));
            _obj.setIs_exist(arr.getInt("IS_EXIST"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setOpen_time(arr.getString("OPEN_TIME"));
            _obj.setOfficial_site(arr.getString("OFFICIAL_SITE"));
            _obj.setWl_discount(arr.getInt("WL_DISCOUNT"));
            _obj.setBizcode(arr.getString("BIZCODE"));
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setOwner(arr.getString("OWNER"));
            _obj.setCollector_id(arr.getInt("COLLECTOR_ID"));
            _obj.setReview_count(arr.getInt("REVIEW_COUNT"));
            _obj.setIs_disp(arr.getInt("IS_DISP"));
			return _obj;
		}
		return null;

}

/**
* 根据GA返回的查询DataRow创建一个GAEntity对象
* @param GA row
* @returnGAList对象
* @throws Exception 
*/
public List<ga_Dao> get_ga_All() throws Exception{
        List<ga_Dao> _list = new ArrayList<ga_Dao>();
		String sqlStr = "{ call GA_PRO.GetGA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			ga_Dao _obj = new ga_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelno(arr.getString("TELNO"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setBranch_name(arr.getString("BRANCH_NAME"));
            _obj.setShort_name(arr.getString("SHORT_NAME"));
            _obj.setIntroduction(arr.getString("INTRODUCTION"));
            _obj.setRecommendation(arr.getString("RECOMMENDATION"));
            _obj.setFeature(arr.getString("FEATURE"));
            _obj.setSpecial_offer(arr.getString("SPECIAL_OFFER"));
            _obj.setStyle(arr.getString("STYLE"));
            _obj.setProvince_id(arr.getInt("PROVINCE_ID"));
            _obj.setCity_id(arr.getInt("CITY_ID"));
            _obj.setDistrict_id(arr.getInt("DISTRICT_ID"));
            _obj.setTrade_id(arr.getInt("TRADE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setCity_name(arr.getString("CITY_NAME"));
            _obj.setDistrict_name(arr.getString("DISTRICT_NAME"));
            _obj.setTrade_name(arr.getString("TRADE_NAME"));
            _obj.setLevel(arr.getInt("LEVEL"));
            try{_obj.setCreated_at(dateformat.parse(arr.getString("CREATED_AT")));}catch(Exception ce){_obj.setCreated_at((new Date()));}
            try{_obj.setUpdated_at(dateformat.parse(arr.getString("UPDATED_AT")));}catch(Exception ce){_obj.setUpdated_at((new Date()));}
            _obj.setService_mask(arr.getString("SERVICE_MASK"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _obj.setLandmark(arr.getString("LANDMARK"));
            _obj.setRegion(arr.getString("REGION"));
            _obj.setSource(arr.getString("SOURCE"));
            _obj.setXy_level(arr.getInt("XY_LEVEL"));
            _obj.setWeight(arr.getInt("WEIGHT"));
            _obj.setIs_exist(arr.getInt("IS_EXIST"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setOpen_time(arr.getString("OPEN_TIME"));
            _obj.setOfficial_site(arr.getString("OFFICIAL_SITE"));
            _obj.setWl_discount(arr.getInt("WL_DISCOUNT"));
            _obj.setBizcode(arr.getString("BIZCODE"));
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setOwner(arr.getString("OWNER"));
            _obj.setCollector_id(arr.getInt("COLLECTOR_ID"));
            _obj.setReview_count(arr.getInt("REVIEW_COUNT"));
            _obj.setIs_disp(arr.getInt("IS_DISP"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据GA返回的查询DataRow创建一个GAEntity对象
* @param GA row
* @returnGAList对象
* @throws Exception 
*/
public List< ga_Dao> get_ga_All(String strWhere) throws Exception{
         List<ga_Dao> _list = new ArrayList<ga_Dao>();
		 String sqlStr = "{ call GA_PRO.GetGAWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				ga_Dao _obj = new ga_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelno(arr.getString("TELNO"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setBranch_name(arr.getString("BRANCH_NAME"));
            _obj.setShort_name(arr.getString("SHORT_NAME"));
            _obj.setIntroduction(arr.getString("INTRODUCTION"));
            _obj.setRecommendation(arr.getString("RECOMMENDATION"));
            _obj.setFeature(arr.getString("FEATURE"));
            _obj.setSpecial_offer(arr.getString("SPECIAL_OFFER"));
            _obj.setStyle(arr.getString("STYLE"));
            _obj.setProvince_id(arr.getInt("PROVINCE_ID"));
            _obj.setCity_id(arr.getInt("CITY_ID"));
            _obj.setDistrict_id(arr.getInt("DISTRICT_ID"));
            _obj.setTrade_id(arr.getInt("TRADE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setCity_name(arr.getString("CITY_NAME"));
            _obj.setDistrict_name(arr.getString("DISTRICT_NAME"));
            _obj.setTrade_name(arr.getString("TRADE_NAME"));
            _obj.setLevel(arr.getInt("LEVEL"));
           try{_obj.setCreated_at(dateformat.parse(arr.getString("CREATED_AT")));}catch(Exception ce){_obj.setCreated_at((new Date()));}
           try{_obj.setUpdated_at(dateformat.parse(arr.getString("UPDATED_AT")));}catch(Exception ce){_obj.setUpdated_at((new Date()));}
            _obj.setService_mask(arr.getString("SERVICE_MASK"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _obj.setLandmark(arr.getString("LANDMARK"));
            _obj.setRegion(arr.getString("REGION"));
            _obj.setSource(arr.getString("SOURCE"));
            _obj.setXy_level(arr.getInt("XY_LEVEL"));
            _obj.setWeight(arr.getInt("WEIGHT"));
            _obj.setIs_exist(arr.getInt("IS_EXIST"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setOpen_time(arr.getString("OPEN_TIME"));
            _obj.setOfficial_site(arr.getString("OFFICIAL_SITE"));
            _obj.setWl_discount(arr.getInt("WL_DISCOUNT"));
            _obj.setBizcode(arr.getString("BIZCODE"));
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setOwner(arr.getString("OWNER"));
            _obj.setCollector_id(arr.getInt("COLLECTOR_ID"));
            _obj.setReview_count(arr.getInt("REVIEW_COUNT"));
            _obj.setIs_disp(arr.getInt("IS_DISP"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据GA返回 分页数据
* @param GA row
* @returnGAList对象
* @throws Exception 
*/
public List<ga_Dao> get_ga_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<ga_Dao> _list = new ArrayList<ga_Dao>();
		String sqlStr = "{ call GA_PRO.GetGAPage(?,?,?,?,?,?)}";
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
				ga_Dao _obj = new ga_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelno(arr.getString("TELNO"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setBranch_name(arr.getString("BRANCH_NAME"));
            _obj.setShort_name(arr.getString("SHORT_NAME"));
            _obj.setIntroduction(arr.getString("INTRODUCTION"));
            _obj.setRecommendation(arr.getString("RECOMMENDATION"));
            _obj.setFeature(arr.getString("FEATURE"));
            _obj.setSpecial_offer(arr.getString("SPECIAL_OFFER"));
            _obj.setStyle(arr.getString("STYLE"));
            _obj.setProvince_id(arr.getInt("PROVINCE_ID"));
            _obj.setCity_id(arr.getInt("CITY_ID"));
            _obj.setDistrict_id(arr.getInt("DISTRICT_ID"));
            _obj.setTrade_id(arr.getInt("TRADE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setCity_name(arr.getString("CITY_NAME"));
            _obj.setDistrict_name(arr.getString("DISTRICT_NAME"));
            _obj.setTrade_name(arr.getString("TRADE_NAME"));
            _obj.setLevel(arr.getInt("LEVEL"));
            try{_obj.setCreated_at(dateformat.parse(arr.getString("CREATED_AT")));}catch(Exception ce){_obj.setCreated_at((new Date()));}
            try{_obj.setUpdated_at(dateformat.parse(arr.getString("UPDATED_AT")));}catch(Exception ce){_obj.setUpdated_at((new Date()));}
            _obj.setService_mask(arr.getString("SERVICE_MASK"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _obj.setLandmark(arr.getString("LANDMARK"));
            _obj.setRegion(arr.getString("REGION"));
            _obj.setSource(arr.getString("SOURCE"));
            _obj.setXy_level(arr.getInt("XY_LEVEL"));
            _obj.setWeight(arr.getInt("WEIGHT"));
            _obj.setIs_exist(arr.getInt("IS_EXIST"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setOpen_time(arr.getString("OPEN_TIME"));
            _obj.setOfficial_site(arr.getString("OFFICIAL_SITE"));
            _obj.setWl_discount(arr.getInt("WL_DISCOUNT"));
            _obj.setBizcode(arr.getString("BIZCODE"));
            _obj.setStatus(arr.getInt("STATUS"));
            _obj.setOwner(arr.getString("OWNER"));
            _obj.setCollector_id(arr.getInt("COLLECTOR_ID"));
            _obj.setReview_count(arr.getInt("REVIEW_COUNT"));
            _obj.setIs_disp(arr.getInt("IS_DISP"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据GA返回的查询DataRow创建一个GAEntity对象
* @param GA row
* @returnGADictionary对象
* @throws Exception 
*/
public Dictionary<Integer, ga_Dao> get_ga_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicgastrWhere") == null) {
			Dictionary<Integer, ga_Dao> _dic = new Hashtable<Integer, ga_Dao>();
			List<ga_Dao> _list = new ArrayList<ga_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicga", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, ga_Dao> _dic = (Dictionary<Integer, ga_Dao>) classFactory
					.cacheGet("dicgastrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新GA字段加一
* @param FieldName
* @param sid
*/
public int create_ga_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call GA_PRO.UpdateFieldGA(?,?)}";
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
* 更新GAInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_ga_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call GA_PRO.UpdateFieldGAV(?,?,?)}";
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
* 更新GAIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_ga_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call GA_PRO.UpdateFieldGAU(?,?,?)}";
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
