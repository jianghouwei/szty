/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataBuiness_baidu.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.buiness_baidu_Dao;
import com.szty.aihao.core.buiness_baidu_core;
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
*@BUINESS_BAIDU数据接口
*@作者：宋春林 
*/
public class buiness_baidu_impl implements buiness_baidu_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(buiness_baidu_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param BUINESS_BAIDU实体
* @return 新插入记录的编号
*/
public int insert_buiness_baidu(buiness_baidu_Dao _BUINESS_BAIDUModel)  throws Exception{
         String sqlStr = "{call BUINESS_BAIDU_PRO.InsertBUINESS_BAIDU(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[34];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_BUINESS_BAIDUModel.getLat());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getLng());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getAddress());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getTelephone());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getUuid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getDistance());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getType());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getTag());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getDetail_url());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getPrice());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getShop_hours());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getOverall_rating());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getTaste_rating());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getService_rating());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getEnvironment_rating());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getFacility_rating());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getHygiene_rating());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getTechnology_rating());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getImage_num());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getGroupon_num());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getDiscount_num());
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getComment_num());
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getFavorite_num());
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getCheckin_num());
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getFormatted_address());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getBusiness());
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getCity());
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getDistrict());
        op[28]= new OracleParameter(29, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getProvince());
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getStreet());
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getStreet_number());
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getCitycode());
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getGrabstartime());
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getGrabendtime());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param BUINESS_BAIDU
* @Object 
* @return 新插入记录的编号
*/
public int insert_buiness_baidu(Object[] _para)  throws Exception{
      String sqlStr = "{call BUINESS_BAIDU_PRO.InsertBUINESS_BAIDU(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[34];
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
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_para[18]);
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_para[19]);
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NVARCHAR,_para[20]);
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NVARCHAR,_para[21]);
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NVARCHAR,_para[22]);
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NVARCHAR,_para[23]);
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NVARCHAR,_para[24]);
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NVARCHAR,_para[25]);
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NVARCHAR,_para[26]);
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NVARCHAR,_para[27]);
        op[28]= new OracleParameter(29, "IN", java.sql.Types.NVARCHAR,_para[28]);
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NVARCHAR,_para[29]);
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NVARCHAR,_para[30]);
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NVARCHAR,_para[31]);
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_para[32]);
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NVARCHAR,_para[33]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param BUINESS_BAIDU实体
* @return 影响的行数
*/
public int update_buiness_baidu(buiness_baidu_Dao _BUINESS_BAIDUModel)  throws Exception{
        String sqlStr = "{call BUINESS_BAIDU_PRO.UpdateBUINESS_BAIDU(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[34];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getLat());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getLng());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getAddress());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getTelephone());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getUuid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getDistance());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getType());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getTag());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getDetail_url());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getPrice());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getShop_hours());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getOverall_rating());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getTaste_rating());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getService_rating());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getEnvironment_rating());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getFacility_rating());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getHygiene_rating());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getTechnology_rating());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getImage_num());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getGroupon_num());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getDiscount_num());
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getComment_num());
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getFavorite_num());
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getCheckin_num());
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getFormatted_address());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getBusiness());
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getCity());
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getDistrict());
        op[28]= new OracleParameter(29, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getProvince());
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getStreet());
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getStreet_number());
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getCitycode());
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getGrabstartime());
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NVARCHAR,_BUINESS_BAIDUModel.getGrabendtime());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表BUINESS_BAIDU中的一条记录
* @param BUINESS_BAIDU实体
* @return 新插入记录的编号
*/
public int delete_buiness_baidu(int Lat)  throws Exception{
        String sqlStr = "{call BUINESS_BAIDU_PRO.DeleteBUINESS_BAIDU(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Lat);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 buiness_baidu 数据实体
* @param Lat">Lat
* @return<buiness_baidu 数据实体
* @throws Exception 
*/
public buiness_baidu_Dao get_buiness_baiduDao(int Lat) throws Exception{
         String sqlStr = "{ call BUINESS_BAIDU_PRO.GetBUINESS_BAIDUEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Lat);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			buiness_baidu_Dao _obj = new buiness_baidu_Dao();
            _obj.setLat(arr.getString("LAT"));
            _obj.setLng(arr.getString("LNG"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setUuid(arr.getString("UUID"));
            _obj.setDistance(arr.getString("DISTANCE"));
            _obj.setType(arr.getString("TYPE"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setDetail_url(arr.getString("DETAIL_URL"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setShop_hours(arr.getString("SHOP_HOURS"));
            _obj.setOverall_rating(arr.getString("OVERALL_RATING"));
            _obj.setTaste_rating(arr.getString("TASTE_RATING"));
            _obj.setService_rating(arr.getString("SERVICE_RATING"));
            _obj.setEnvironment_rating(arr.getString("ENVIRONMENT_RATING"));
            _obj.setFacility_rating(arr.getString("FACILITY_RATING"));
            _obj.setHygiene_rating(arr.getString("HYGIENE_RATING"));
            _obj.setTechnology_rating(arr.getString("TECHNOLOGY_RATING"));
            _obj.setImage_num(arr.getString("IMAGE_NUM"));
            _obj.setGroupon_num(arr.getString("GROUPON_NUM"));
            _obj.setDiscount_num(arr.getString("DISCOUNT_NUM"));
            _obj.setComment_num(arr.getString("COMMENT_NUM"));
            _obj.setFavorite_num(arr.getString("FAVORITE_NUM"));
            _obj.setCheckin_num(arr.getString("CHECKIN_NUM"));
            _obj.setFormatted_address(arr.getString("FORMATTED_ADDRESS"));
            _obj.setBusiness(arr.getString("BUSINESS"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setDistrict(arr.getString("DISTRICT"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setStreet(arr.getString("STREET"));
            _obj.setStreet_number(arr.getString("STREET_NUMBER"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGrabstartime(arr.getString("GRABSTARTIME"));
            _obj.setGrabendtime(arr.getString("GRABENDTIME"));
			return _obj;
		}
		return null;

}

/**
* 根据BUINESS_BAIDU返回的查询DataRow创建一个BUINESS_BAIDUEntity对象
* @param BUINESS_BAIDU row
* @returnBUINESS_BAIDUList对象
* @throws Exception 
*/
public List<buiness_baidu_Dao> get_buiness_baidu_All() throws Exception{
        List<buiness_baidu_Dao> _list = new ArrayList<buiness_baidu_Dao>();
		String sqlStr = "{ call BUINESS_BAIDU_PRO.GetBUINESS_BAIDU(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			buiness_baidu_Dao _obj = new buiness_baidu_Dao();
            _obj.setLat(arr.getString("LAT"));
            _obj.setLng(arr.getString("LNG"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setUuid(arr.getString("UUID"));
            _obj.setDistance(arr.getString("DISTANCE"));
            _obj.setType(arr.getString("TYPE"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setDetail_url(arr.getString("DETAIL_URL"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setShop_hours(arr.getString("SHOP_HOURS"));
            _obj.setOverall_rating(arr.getString("OVERALL_RATING"));
            _obj.setTaste_rating(arr.getString("TASTE_RATING"));
            _obj.setService_rating(arr.getString("SERVICE_RATING"));
            _obj.setEnvironment_rating(arr.getString("ENVIRONMENT_RATING"));
            _obj.setFacility_rating(arr.getString("FACILITY_RATING"));
            _obj.setHygiene_rating(arr.getString("HYGIENE_RATING"));
            _obj.setTechnology_rating(arr.getString("TECHNOLOGY_RATING"));
            _obj.setImage_num(arr.getString("IMAGE_NUM"));
            _obj.setGroupon_num(arr.getString("GROUPON_NUM"));
            _obj.setDiscount_num(arr.getString("DISCOUNT_NUM"));
            _obj.setComment_num(arr.getString("COMMENT_NUM"));
            _obj.setFavorite_num(arr.getString("FAVORITE_NUM"));
            _obj.setCheckin_num(arr.getString("CHECKIN_NUM"));
            _obj.setFormatted_address(arr.getString("FORMATTED_ADDRESS"));
            _obj.setBusiness(arr.getString("BUSINESS"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setDistrict(arr.getString("DISTRICT"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setStreet(arr.getString("STREET"));
            _obj.setStreet_number(arr.getString("STREET_NUMBER"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGrabstartime(arr.getString("GRABSTARTIME"));
            _obj.setGrabendtime(arr.getString("GRABENDTIME"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据BUINESS_BAIDU返回的查询DataRow创建一个BUINESS_BAIDUEntity对象
* @param BUINESS_BAIDU row
* @returnBUINESS_BAIDUList对象
* @throws Exception 
*/
public List< buiness_baidu_Dao> get_buiness_baidu_All(String strWhere) throws Exception{
         List<buiness_baidu_Dao> _list = new ArrayList<buiness_baidu_Dao>();
		 String sqlStr = "{ call BUINESS_BAIDU_PRO.GetBUINESS_BAIDUWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				buiness_baidu_Dao _obj = new buiness_baidu_Dao();
            _obj.setLat(arr.getString("LAT"));
            _obj.setLng(arr.getString("LNG"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setUuid(arr.getString("UUID"));
            _obj.setDistance(arr.getString("DISTANCE"));
            _obj.setType(arr.getString("TYPE"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setDetail_url(arr.getString("DETAIL_URL"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setShop_hours(arr.getString("SHOP_HOURS"));
            _obj.setOverall_rating(arr.getString("OVERALL_RATING"));
            _obj.setTaste_rating(arr.getString("TASTE_RATING"));
            _obj.setService_rating(arr.getString("SERVICE_RATING"));
            _obj.setEnvironment_rating(arr.getString("ENVIRONMENT_RATING"));
            _obj.setFacility_rating(arr.getString("FACILITY_RATING"));
            _obj.setHygiene_rating(arr.getString("HYGIENE_RATING"));
            _obj.setTechnology_rating(arr.getString("TECHNOLOGY_RATING"));
            _obj.setImage_num(arr.getString("IMAGE_NUM"));
            _obj.setGroupon_num(arr.getString("GROUPON_NUM"));
            _obj.setDiscount_num(arr.getString("DISCOUNT_NUM"));
            _obj.setComment_num(arr.getString("COMMENT_NUM"));
            _obj.setFavorite_num(arr.getString("FAVORITE_NUM"));
            _obj.setCheckin_num(arr.getString("CHECKIN_NUM"));
            _obj.setFormatted_address(arr.getString("FORMATTED_ADDRESS"));
            _obj.setBusiness(arr.getString("BUSINESS"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setDistrict(arr.getString("DISTRICT"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setStreet(arr.getString("STREET"));
            _obj.setStreet_number(arr.getString("STREET_NUMBER"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGrabstartime(arr.getString("GRABSTARTIME"));
            _obj.setGrabendtime(arr.getString("GRABENDTIME"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据BUINESS_BAIDU返回 分页数据
* @param BUINESS_BAIDU row
* @returnBUINESS_BAIDUList对象
* @throws Exception 
*/
public List<buiness_baidu_Dao> get_buiness_baidu_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<buiness_baidu_Dao> _list = new ArrayList<buiness_baidu_Dao>();
		String sqlStr = "{ call BUINESS_BAIDU_PRO.GetBUINESS_BAIDUPage(?,?,?,?,?,?)}";
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
				buiness_baidu_Dao _obj = new buiness_baidu_Dao();
            _obj.setLat(arr.getString("LAT"));
            _obj.setLng(arr.getString("LNG"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setUuid(arr.getString("UUID"));
            _obj.setDistance(arr.getString("DISTANCE"));
            _obj.setType(arr.getString("TYPE"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setDetail_url(arr.getString("DETAIL_URL"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setShop_hours(arr.getString("SHOP_HOURS"));
            _obj.setOverall_rating(arr.getString("OVERALL_RATING"));
            _obj.setTaste_rating(arr.getString("TASTE_RATING"));
            _obj.setService_rating(arr.getString("SERVICE_RATING"));
            _obj.setEnvironment_rating(arr.getString("ENVIRONMENT_RATING"));
            _obj.setFacility_rating(arr.getString("FACILITY_RATING"));
            _obj.setHygiene_rating(arr.getString("HYGIENE_RATING"));
            _obj.setTechnology_rating(arr.getString("TECHNOLOGY_RATING"));
            _obj.setImage_num(arr.getString("IMAGE_NUM"));
            _obj.setGroupon_num(arr.getString("GROUPON_NUM"));
            _obj.setDiscount_num(arr.getString("DISCOUNT_NUM"));
            _obj.setComment_num(arr.getString("COMMENT_NUM"));
            _obj.setFavorite_num(arr.getString("FAVORITE_NUM"));
            _obj.setCheckin_num(arr.getString("CHECKIN_NUM"));
            _obj.setFormatted_address(arr.getString("FORMATTED_ADDRESS"));
            _obj.setBusiness(arr.getString("BUSINESS"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setDistrict(arr.getString("DISTRICT"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setStreet(arr.getString("STREET"));
            _obj.setStreet_number(arr.getString("STREET_NUMBER"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGrabstartime(arr.getString("GRABSTARTIME"));
            _obj.setGrabendtime(arr.getString("GRABENDTIME"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据BUINESS_BAIDU返回的查询DataRow创建一个BUINESS_BAIDUEntity对象
* @param BUINESS_BAIDU row
* @returnBUINESS_BAIDUDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, buiness_baidu_Dao> get_buiness_baidu_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicbuiness_baidustrWhere") == null) {
			Dictionary<Integer, buiness_baidu_Dao> _dic = new Hashtable<Integer, buiness_baidu_Dao>();
			List<buiness_baidu_Dao> _list = new ArrayList<buiness_baidu_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getLat()), _list.get(i));
			}
			classFactory.cachePut("dicbuiness_baidu", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, buiness_baidu_Dao> _dic = (Dictionary<Integer, buiness_baidu_Dao>) classFactory
					.cacheGet("dicbuiness_baidustrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新BUINESS_BAIDU字段加一
* @param FieldName
* @param sid
*/
public int create_buiness_baidu_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call BUINESS_BAIDU_PRO.UpdateFieldBUINESS_BAIDU(?,?)}";
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
* 更新BUINESS_BAIDUInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_buiness_baidu_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call BUINESS_BAIDU_PRO.UpdateFieldBUINESS_BAIDUV(?,?,?)}";
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
* 更新BUINESS_BAIDUIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_buiness_baidu_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call BUINESS_BAIDU_PRO.UpdateFieldBUINESS_BAIDUU(?,?,?)}";
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
