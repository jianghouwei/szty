﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaoupdatetable.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaoupdatetable_Dao;
import com.szty.aihao.core.aihaoupdatetable_core;
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
*@AIHAOUPDATETABLE数据接口
*@作者：宋春林 
*/
public class aihaoupdatetable_impl implements aihaoupdatetable_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaoupdatetable_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOUPDATETABLE实体
* @return 新插入记录的编号
*/
public int insert_aihaoupdatetable(aihaoupdatetable_Dao _AIHAOUPDATETABLEModel)  throws Exception{
         String sqlStr = "{call AIHAOUPDATETABLE_PRO.InsertAIHAOUPDATETABLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[55];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOUPDATETABLEModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getTelno());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getAddress());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getBranch_name());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getShort_name());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getIntroduction());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getRecommendation());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getFeature());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getSpecial_offer());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getStyle());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getProvince_id());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getCity_id());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getDistrict_id());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getTrade_id());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getProvince_name());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getCity_name());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getDistrict_name());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getTrade_name());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUPDATETABLEModel.getCreated_at()));
        op[20]= new OracleParameter(21, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUPDATETABLEModel.getUpdated_at()));
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getService_mask());
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getX());
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getY());
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getLandmark());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getRegion());
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getSource());
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getXy_level());
        op[28]= new OracleParameter(29, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getWeight());
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getIs_exist());
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getTag());
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getCategory());
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getPrice());
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getOpen_time());
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getOfficial_site());
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getWl_discount());
        op[36]= new OracleParameter(37, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getBizcode());
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getStatus());
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getOwner());
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getCollector_id());
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getReview_count());
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getIs_disp());
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getAttributes());
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getLevelv());
        op[44]= new OracleParameter(45, "IN", java.sql.Types.NUMERIC,_AIHAOUPDATETABLEModel.getRow_num());
        op[45]= new OracleParameter(46, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getGeohas());
        op[46]= new OracleParameter(47, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getBaidux());
        op[47]= new OracleParameter(48, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getBaiduy());
        op[48]= new OracleParameter(49, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getBigclass());
        op[49]= new OracleParameter(50, "IN", java.sql.Types.NUMERIC,_AIHAOUPDATETABLEModel.getYouxiannum());
        op[50]= new OracleParameter(51, "IN", java.sql.Types.NUMERIC,_AIHAOUPDATETABLEModel.getShowstatus());
        op[51]= new OracleParameter(52, "IN", java.sql.Types.NUMERIC,_AIHAOUPDATETABLEModel.getData_flag());
        op[52]= new OracleParameter(53, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUPDATETABLEModel.getAdd_time()));
        op[53]= new OracleParameter(54, "IN", java.sql.Types.BIGINT,_AIHAOUPDATETABLEModel.getAuto_id());
        op[54]= new OracleParameter(55, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getDdyhbandid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOUPDATETABLE
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaoupdatetable(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOUPDATETABLE_PRO.InsertAIHAOUPDATETABLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[55];
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
        op[19]= new OracleParameter(20, "IN", java.sql.Types.DATE, dateformat.format(_para[19]));
        op[20]= new OracleParameter(21, "IN", java.sql.Types.DATE, dateformat.format(_para[20]));
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
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_para[34]);
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NVARCHAR,_para[35]);
        op[36]= new OracleParameter(37, "IN", java.sql.Types.NVARCHAR,_para[36]);
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NVARCHAR,_para[37]);
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_para[38]);
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NVARCHAR,_para[39]);
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_para[40]);
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NVARCHAR,_para[41]);
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NVARCHAR,_para[42]);
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NVARCHAR,_para[43]);
        op[44]= new OracleParameter(45, "IN", java.sql.Types.NUMERIC,_para[44]);
        op[45]= new OracleParameter(46, "IN", java.sql.Types.NVARCHAR,_para[45]);
        op[46]= new OracleParameter(47, "IN", java.sql.Types.NVARCHAR,_para[46]);
        op[47]= new OracleParameter(48, "IN", java.sql.Types.NVARCHAR,_para[47]);
        op[48]= new OracleParameter(49, "IN", java.sql.Types.NVARCHAR,_para[48]);
        op[49]= new OracleParameter(50, "IN", java.sql.Types.NUMERIC,_para[49]);
        op[50]= new OracleParameter(51, "IN", java.sql.Types.NUMERIC,_para[50]);
        op[51]= new OracleParameter(52, "IN", java.sql.Types.NUMERIC,_para[51]);
        op[52]= new OracleParameter(53, "IN", java.sql.Types.DATE, dateformat.format(_para[52]));
        op[53]= new OracleParameter(54, "IN", java.sql.Types.BIGINT,_para[53]);
        op[54]= new OracleParameter(55, "IN", java.sql.Types.NVARCHAR,_para[54]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOUPDATETABLE实体
* @return 影响的行数
*/
public int update_aihaoupdatetable(aihaoupdatetable_Dao _AIHAOUPDATETABLEModel)  throws Exception{
        String sqlStr = "{call AIHAOUPDATETABLE_PRO.UpdateAIHAOUPDATETABLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[55];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getTelno());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getAddress());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getBranch_name());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getShort_name());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getIntroduction());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getRecommendation());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getFeature());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getSpecial_offer());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getStyle());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getProvince_id());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getCity_id());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getDistrict_id());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getTrade_id());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getProvince_name());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getCity_name());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getDistrict_name());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getTrade_name());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUPDATETABLEModel.getCreated_at()));
        op[20]= new OracleParameter(21, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUPDATETABLEModel.getUpdated_at()));
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getService_mask());
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getX());
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getY());
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getLandmark());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getRegion());
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getSource());
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getXy_level());
        op[28]= new OracleParameter(29, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getWeight());
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getIs_exist());
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getTag());
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getCategory());
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getPrice());
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getOpen_time());
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getOfficial_site());
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getWl_discount());
        op[36]= new OracleParameter(37, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getBizcode());
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getStatus());
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getOwner());
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getCollector_id());
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getReview_count());
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getIs_disp());
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getAttributes());
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getLevelv());
        op[44]= new OracleParameter(45, "IN", java.sql.Types.NUMERIC,_AIHAOUPDATETABLEModel.getRow_num());
        op[45]= new OracleParameter(46, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getGeohas());
        op[46]= new OracleParameter(47, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getBaidux());
        op[47]= new OracleParameter(48, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getBaiduy());
        op[48]= new OracleParameter(49, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getBigclass());
        op[49]= new OracleParameter(50, "IN", java.sql.Types.NUMERIC,_AIHAOUPDATETABLEModel.getYouxiannum());
        op[50]= new OracleParameter(51, "IN", java.sql.Types.NUMERIC,_AIHAOUPDATETABLEModel.getShowstatus());
        op[51]= new OracleParameter(52, "IN", java.sql.Types.NUMERIC,_AIHAOUPDATETABLEModel.getData_flag());
        op[52]= new OracleParameter(53, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUPDATETABLEModel.getAdd_time()));
        op[53]= new OracleParameter(54, "IN", java.sql.Types.BIGINT,_AIHAOUPDATETABLEModel.getAuto_id());
        op[54]= new OracleParameter(55, "IN", java.sql.Types.NVARCHAR,_AIHAOUPDATETABLEModel.getDdyhbandid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOUPDATETABLE中的一条记录
* @param AIHAOUPDATETABLE实体
* @return 新插入记录的编号
*/
public int delete_aihaoupdatetable(int Id)  throws Exception{
        String sqlStr = "{call AIHAOUPDATETABLE_PRO.DeleteAIHAOUPDATETABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaoupdatetable 数据实体
* @param Id">Id
* @return<aihaoupdatetable 数据实体
* @throws Exception 
*/
public aihaoupdatetable_Dao get_aihaoupdatetableDao(int Id) throws Exception{
         String sqlStr = "{ call AIHAOUPDATETABLE_PRO.GetAIHAOUPDATETABLEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoupdatetable_Dao _obj = new aihaoupdatetable_Dao();
            _obj.setId(arr.getString("ID"));
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
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setCity_id(arr.getString("CITY_ID"));
            _obj.setDistrict_id(arr.getString("DISTRICT_ID"));
            _obj.setTrade_id(arr.getString("TRADE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setCity_name(arr.getString("CITY_NAME"));
            _obj.setDistrict_name(arr.getString("DISTRICT_NAME"));
            _obj.setTrade_name(arr.getString("TRADE_NAME"));
             try{_obj.setCreated_at(dateformat.parse(arr.getString("CREATED_AT")));}catch(Exception ce){_obj.setCreated_at((new Date()));}
             try{_obj.setUpdated_at(dateformat.parse(arr.getString("UPDATED_AT")));}catch(Exception ce){_obj.setUpdated_at((new Date()));}
            _obj.setService_mask(arr.getString("SERVICE_MASK"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _obj.setLandmark(arr.getString("LANDMARK"));
            _obj.setRegion(arr.getString("REGION"));
            _obj.setSource(arr.getString("SOURCE"));
            _obj.setXy_level(arr.getString("XY_LEVEL"));
            _obj.setWeight(arr.getString("WEIGHT"));
            _obj.setIs_exist(arr.getString("IS_EXIST"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setOpen_time(arr.getString("OPEN_TIME"));
            _obj.setOfficial_site(arr.getString("OFFICIAL_SITE"));
            _obj.setWl_discount(arr.getString("WL_DISCOUNT"));
            _obj.setBizcode(arr.getString("BIZCODE"));
            _obj.setStatus(arr.getString("STATUS"));
            _obj.setOwner(arr.getString("OWNER"));
            _obj.setCollector_id(arr.getString("COLLECTOR_ID"));
            _obj.setReview_count(arr.getString("REVIEW_COUNT"));
            _obj.setIs_disp(arr.getString("IS_DISP"));
            _obj.setLevelv(arr.getString("LEVELV"));
            _obj.setRow_num(arr.getInt("ROW_NUM"));
            _obj.setGeohas(arr.getString("GEOHAS"));
            _obj.setBaidux(arr.getString("BAIDUX"));
            _obj.setBaiduy(arr.getString("BAIDUY"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setYouxiannum(arr.getInt("YOUXIANNUM"));
            _obj.setShowstatus(arr.getInt("SHOWSTATUS"));
            _obj.setData_flag(arr.getInt("DATA_FLAG"));
             try{_obj.setAdd_time(dateformat.parse(arr.getString("ADD_TIME")));}catch(Exception ce){_obj.setAdd_time((new Date()));}
            _obj.setDdyhbandid(arr.getString("DDYHBANDID"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOUPDATETABLE返回的查询DataRow创建一个AIHAOUPDATETABLEEntity对象
* @param AIHAOUPDATETABLE row
* @returnAIHAOUPDATETABLEList对象
* @throws Exception 
*/
public List<aihaoupdatetable_Dao> get_aihaoupdatetable_All() throws Exception{
        List<aihaoupdatetable_Dao> _list = new ArrayList<aihaoupdatetable_Dao>();
		String sqlStr = "{ call AIHAOUPDATETABLE_PRO.GetAIHAOUPDATETABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoupdatetable_Dao _obj = new aihaoupdatetable_Dao();
            _obj.setId(arr.getString("ID"));
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
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setCity_id(arr.getString("CITY_ID"));
            _obj.setDistrict_id(arr.getString("DISTRICT_ID"));
            _obj.setTrade_id(arr.getString("TRADE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setCity_name(arr.getString("CITY_NAME"));
            _obj.setDistrict_name(arr.getString("DISTRICT_NAME"));
            _obj.setTrade_name(arr.getString("TRADE_NAME"));
            try{_obj.setCreated_at(dateformat.parse(arr.getString("CREATED_AT")));}catch(Exception ce){_obj.setCreated_at((new Date()));}
            try{_obj.setUpdated_at(dateformat.parse(arr.getString("UPDATED_AT")));}catch(Exception ce){_obj.setUpdated_at((new Date()));}
            _obj.setService_mask(arr.getString("SERVICE_MASK"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _obj.setLandmark(arr.getString("LANDMARK"));
            _obj.setRegion(arr.getString("REGION"));
            _obj.setSource(arr.getString("SOURCE"));
            _obj.setXy_level(arr.getString("XY_LEVEL"));
            _obj.setWeight(arr.getString("WEIGHT"));
            _obj.setIs_exist(arr.getString("IS_EXIST"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setOpen_time(arr.getString("OPEN_TIME"));
            _obj.setOfficial_site(arr.getString("OFFICIAL_SITE"));
            _obj.setWl_discount(arr.getString("WL_DISCOUNT"));
            _obj.setBizcode(arr.getString("BIZCODE"));
            _obj.setStatus(arr.getString("STATUS"));
            _obj.setOwner(arr.getString("OWNER"));
            _obj.setCollector_id(arr.getString("COLLECTOR_ID"));
            _obj.setReview_count(arr.getString("REVIEW_COUNT"));
            _obj.setIs_disp(arr.getString("IS_DISP"));
            _obj.setLevelv(arr.getString("LEVELV"));
            _obj.setRow_num(arr.getInt("ROW_NUM"));
            _obj.setGeohas(arr.getString("GEOHAS"));
            _obj.setBaidux(arr.getString("BAIDUX"));
            _obj.setBaiduy(arr.getString("BAIDUY"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setYouxiannum(arr.getInt("YOUXIANNUM"));
            _obj.setShowstatus(arr.getInt("SHOWSTATUS"));
            _obj.setData_flag(arr.getInt("DATA_FLAG"));
            try{_obj.setAdd_time(dateformat.parse(arr.getString("ADD_TIME")));}catch(Exception ce){_obj.setAdd_time((new Date()));}
            _obj.setDdyhbandid(arr.getString("DDYHBANDID"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOUPDATETABLE返回的查询DataRow创建一个AIHAOUPDATETABLEEntity对象
* @param AIHAOUPDATETABLE row
* @returnAIHAOUPDATETABLEList对象
* @throws Exception 
*/
public List< aihaoupdatetable_Dao> get_aihaoupdatetable_All(String strWhere) throws Exception{
         List<aihaoupdatetable_Dao> _list = new ArrayList<aihaoupdatetable_Dao>();
		 String sqlStr = "{ call AIHAOUPDATETABLE_PRO.GetAIHAOUPDATETABLEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaoupdatetable_Dao _obj = new aihaoupdatetable_Dao();
            _obj.setId(arr.getString("ID"));
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
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setCity_id(arr.getString("CITY_ID"));
            _obj.setDistrict_id(arr.getString("DISTRICT_ID"));
            _obj.setTrade_id(arr.getString("TRADE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setCity_name(arr.getString("CITY_NAME"));
            _obj.setDistrict_name(arr.getString("DISTRICT_NAME"));
            _obj.setTrade_name(arr.getString("TRADE_NAME"));
           try{_obj.setCreated_at(dateformat.parse(arr.getString("CREATED_AT")));}catch(Exception ce){_obj.setCreated_at((new Date()));}
           try{_obj.setUpdated_at(dateformat.parse(arr.getString("UPDATED_AT")));}catch(Exception ce){_obj.setUpdated_at((new Date()));}
            _obj.setService_mask(arr.getString("SERVICE_MASK"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _obj.setLandmark(arr.getString("LANDMARK"));
            _obj.setRegion(arr.getString("REGION"));
            _obj.setSource(arr.getString("SOURCE"));
            _obj.setXy_level(arr.getString("XY_LEVEL"));
            _obj.setWeight(arr.getString("WEIGHT"));
            _obj.setIs_exist(arr.getString("IS_EXIST"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setOpen_time(arr.getString("OPEN_TIME"));
            _obj.setOfficial_site(arr.getString("OFFICIAL_SITE"));
            _obj.setWl_discount(arr.getString("WL_DISCOUNT"));
            _obj.setBizcode(arr.getString("BIZCODE"));
            _obj.setStatus(arr.getString("STATUS"));
            _obj.setOwner(arr.getString("OWNER"));
            _obj.setCollector_id(arr.getString("COLLECTOR_ID"));
            _obj.setReview_count(arr.getString("REVIEW_COUNT"));
            _obj.setIs_disp(arr.getString("IS_DISP"));
            _obj.setLevelv(arr.getString("LEVELV"));
            _obj.setRow_num(arr.getInt("ROW_NUM"));
            _obj.setGeohas(arr.getString("GEOHAS"));
            _obj.setBaidux(arr.getString("BAIDUX"));
            _obj.setBaiduy(arr.getString("BAIDUY"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setYouxiannum(arr.getInt("YOUXIANNUM"));
            _obj.setShowstatus(arr.getInt("SHOWSTATUS"));
            _obj.setData_flag(arr.getInt("DATA_FLAG"));
           try{_obj.setAdd_time(dateformat.parse(arr.getString("ADD_TIME")));}catch(Exception ce){_obj.setAdd_time((new Date()));}
            _obj.setDdyhbandid(arr.getString("DDYHBANDID"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOUPDATETABLE返回 分页数据
* @param AIHAOUPDATETABLE row
* @returnAIHAOUPDATETABLEList对象
* @throws Exception 
*/
public List<aihaoupdatetable_Dao> get_aihaoupdatetable_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaoupdatetable_Dao> _list = new ArrayList<aihaoupdatetable_Dao>();
		String sqlStr = "{ call AIHAOUPDATETABLE_PRO.GetAIHAOUPDATETABLEPage(?,?,?,?,?,?)}";
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
				aihaoupdatetable_Dao _obj = new aihaoupdatetable_Dao();
            _obj.setId(arr.getString("ID"));
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
            _obj.setProvince_id(arr.getString("PROVINCE_ID"));
            _obj.setCity_id(arr.getString("CITY_ID"));
            _obj.setDistrict_id(arr.getString("DISTRICT_ID"));
            _obj.setTrade_id(arr.getString("TRADE_ID"));
            _obj.setProvince_name(arr.getString("PROVINCE_NAME"));
            _obj.setCity_name(arr.getString("CITY_NAME"));
            _obj.setDistrict_name(arr.getString("DISTRICT_NAME"));
            _obj.setTrade_name(arr.getString("TRADE_NAME"));
            try{_obj.setCreated_at(dateformat.parse(arr.getString("CREATED_AT")));}catch(Exception ce){_obj.setCreated_at((new Date()));}
            try{_obj.setUpdated_at(dateformat.parse(arr.getString("UPDATED_AT")));}catch(Exception ce){_obj.setUpdated_at((new Date()));}
            _obj.setService_mask(arr.getString("SERVICE_MASK"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _obj.setLandmark(arr.getString("LANDMARK"));
            _obj.setRegion(arr.getString("REGION"));
            _obj.setSource(arr.getString("SOURCE"));
            _obj.setXy_level(arr.getString("XY_LEVEL"));
            _obj.setWeight(arr.getString("WEIGHT"));
            _obj.setIs_exist(arr.getString("IS_EXIST"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setPrice(arr.getString("PRICE"));
            _obj.setOpen_time(arr.getString("OPEN_TIME"));
            _obj.setOfficial_site(arr.getString("OFFICIAL_SITE"));
            _obj.setWl_discount(arr.getString("WL_DISCOUNT"));
            _obj.setBizcode(arr.getString("BIZCODE"));
            _obj.setStatus(arr.getString("STATUS"));
            _obj.setOwner(arr.getString("OWNER"));
            _obj.setCollector_id(arr.getString("COLLECTOR_ID"));
            _obj.setReview_count(arr.getString("REVIEW_COUNT"));
            _obj.setIs_disp(arr.getString("IS_DISP"));
            _obj.setLevelv(arr.getString("LEVELV"));
            _obj.setRow_num(arr.getInt("ROW_NUM"));
            _obj.setGeohas(arr.getString("GEOHAS"));
            _obj.setBaidux(arr.getString("BAIDUX"));
            _obj.setBaiduy(arr.getString("BAIDUY"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setYouxiannum(arr.getInt("YOUXIANNUM"));
            _obj.setShowstatus(arr.getInt("SHOWSTATUS"));
            _obj.setData_flag(arr.getInt("DATA_FLAG"));
            try{_obj.setAdd_time(dateformat.parse(arr.getString("ADD_TIME")));}catch(Exception ce){_obj.setAdd_time((new Date()));}
            _obj.setDdyhbandid(arr.getString("DDYHBANDID"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOUPDATETABLE返回的查询DataRow创建一个AIHAOUPDATETABLEEntity对象
* @param AIHAOUPDATETABLE row
* @returnAIHAOUPDATETABLEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaoupdatetable_Dao> get_aihaoupdatetable_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaoupdatetablestrWhere") == null) {
			Dictionary<Integer, aihaoupdatetable_Dao> _dic = new Hashtable<Integer, aihaoupdatetable_Dao>();
			List<aihaoupdatetable_Dao> _list = new ArrayList<aihaoupdatetable_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihaoupdatetable", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaoupdatetable_Dao> _dic = (Dictionary<Integer, aihaoupdatetable_Dao>) classFactory
					.cacheGet("dicaihaoupdatetablestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOUPDATETABLE字段加一
* @param FieldName
* @param sid
*/
public int create_aihaoupdatetable_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOUPDATETABLE_PRO.UpdateFieldAIHAOUPDATETABLE(?,?)}";
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
* 更新AIHAOUPDATETABLEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaoupdatetable_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOUPDATETABLE_PRO.UpdateFieldAIHAOUPDATETABLEV(?,?,?)}";
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
* 更新AIHAOUPDATETABLEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaoupdatetable_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOUPDATETABLE_PRO.UpdateFieldAIHAOUPDATETABLEU(?,?,?)}";
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
