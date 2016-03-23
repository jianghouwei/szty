/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihao_tj_parse.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihao_tj_parse_Dao;
import com.szty.aihao.core.aihao_tj_parse_core;
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
*@AIHAO_TJ_PARSE数据接口
*@作者：宋春林 
*/
public class aihao_tj_parse_impl implements aihao_tj_parse_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihao_tj_parse_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAO_TJ_PARSE实体
* @return 新插入记录的编号
*/
public int insert_aihao_tj_parse(aihao_tj_parse_Dao _AIHAO_TJ_PARSEModel)  throws Exception{
         String sqlStr = "{call AIHAO_TJ_PARSE_PRO.InsertAIHAO_TJ_PARSE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[55];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara1());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara2());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara3());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara4());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara5());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara6());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara7());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara8());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara9());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara10());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara11());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara12());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara13());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara14());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara15());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara16());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara17());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara18());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara19());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara20());
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara21());
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara22());
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara23());
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara24());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara25());
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara26());
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara27());
        op[28]= new OracleParameter(29, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara28());
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara29());
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara30());
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara31());
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara32());
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara33());
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara34());
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara35());
        op[36]= new OracleParameter(37, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara36());
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara37());
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara38());
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara39());
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara40());
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara41());
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara42());
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara43());
        op[44]= new OracleParameter(45, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara44());
        op[45]= new OracleParameter(46, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara45());
        op[46]= new OracleParameter(47, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara46());
        op[47]= new OracleParameter(48, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara47());
        op[48]= new OracleParameter(49, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara48());
        op[49]= new OracleParameter(50, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara49());
        op[50]= new OracleParameter(51, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara50());
        op[51]= new OracleParameter(52, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara51());
        op[52]= new OracleParameter(53, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara52());
        op[53]= new OracleParameter(54, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara53());
        op[54]= new OracleParameter(55, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara54());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAO_TJ_PARSE
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihao_tj_parse(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAO_TJ_PARSE_PRO.InsertAIHAO_TJ_PARSE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[55];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_para[18]);
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_para[19]);
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_para[20]);
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NUMERIC,_para[21]);
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NUMERIC,_para[22]);
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NUMERIC,_para[23]);
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NUMERIC,_para[24]);
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NUMERIC,_para[25]);
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NUMERIC,_para[26]);
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NUMERIC,_para[27]);
        op[28]= new OracleParameter(29, "IN", java.sql.Types.NVARCHAR,_para[28]);
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NUMERIC,_para[29]);
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NVARCHAR,_para[30]);
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NUMERIC,_para[31]);
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_para[32]);
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NUMERIC,_para[33]);
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_para[34]);
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NUMERIC,_para[35]);
        op[36]= new OracleParameter(37, "IN", java.sql.Types.NVARCHAR,_para[36]);
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NUMERIC,_para[37]);
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_para[38]);
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NUMERIC,_para[39]);
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_para[40]);
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NUMERIC,_para[41]);
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NVARCHAR,_para[42]);
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NUMERIC,_para[43]);
        op[44]= new OracleParameter(45, "IN", java.sql.Types.NUMERIC,_para[44]);
        op[45]= new OracleParameter(46, "IN", java.sql.Types.NUMERIC,_para[45]);
        op[46]= new OracleParameter(47, "IN", java.sql.Types.NUMERIC,_para[46]);
        op[47]= new OracleParameter(48, "IN", java.sql.Types.NUMERIC,_para[47]);
        op[48]= new OracleParameter(49, "IN", java.sql.Types.NUMERIC,_para[48]);
        op[49]= new OracleParameter(50, "IN", java.sql.Types.NUMERIC,_para[49]);
        op[50]= new OracleParameter(51, "IN", java.sql.Types.NUMERIC,_para[50]);
        op[51]= new OracleParameter(52, "IN", java.sql.Types.NUMERIC,_para[51]);
        op[52]= new OracleParameter(53, "IN", java.sql.Types.NUMERIC,_para[52]);
        op[53]= new OracleParameter(54, "IN", java.sql.Types.NUMERIC,_para[53]);
        op[54]= new OracleParameter(55, "IN", java.sql.Types.NUMERIC,_para[54]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAO_TJ_PARSE实体
* @return 影响的行数
*/
public int update_aihao_tj_parse(aihao_tj_parse_Dao _AIHAO_TJ_PARSEModel)  throws Exception{
        String sqlStr = "{call AIHAO_TJ_PARSE_PRO.UpdateAIHAO_TJ_PARSE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[55];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara1());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara2());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara3());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara4());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara5());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara6());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara7());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara8());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara9());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara10());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara11());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara12());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara13());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara14());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara15());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara16());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara17());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara18());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara19());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara20());
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara21());
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara22());
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara23());
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara24());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara25());
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara26());
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara27());
        op[28]= new OracleParameter(29, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara28());
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara29());
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara30());
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara31());
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara32());
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara33());
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara34());
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara35());
        op[36]= new OracleParameter(37, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara36());
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara37());
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara38());
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara39());
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara40());
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara41());
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_PARSEModel.getPara42());
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara43());
        op[44]= new OracleParameter(45, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara44());
        op[45]= new OracleParameter(46, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara45());
        op[46]= new OracleParameter(47, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara46());
        op[47]= new OracleParameter(48, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara47());
        op[48]= new OracleParameter(49, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara48());
        op[49]= new OracleParameter(50, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara49());
        op[50]= new OracleParameter(51, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara50());
        op[51]= new OracleParameter(52, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara51());
        op[52]= new OracleParameter(53, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara52());
        op[53]= new OracleParameter(54, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara53());
        op[54]= new OracleParameter(55, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_PARSEModel.getPara54());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAO_TJ_PARSE中的一条记录
* @param AIHAO_TJ_PARSE实体
* @return 新插入记录的编号
*/
public int delete_aihao_tj_parse(int Logid)  throws Exception{
        String sqlStr = "{call AIHAO_TJ_PARSE_PRO.DeleteAIHAO_TJ_PARSE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Logid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihao_tj_parse 数据实体
* @param Logid">Logid
* @return<aihao_tj_parse 数据实体
* @throws Exception 
*/
public aihao_tj_parse_Dao get_aihao_tj_parseDao(int Logid) throws Exception{
         String sqlStr = "{ call AIHAO_TJ_PARSE_PRO.GetAIHAO_TJ_PARSEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Logid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_tj_parse_Dao _obj = new aihao_tj_parse_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setPara1(arr.getInt("PARA1"));
            _obj.setPara2(arr.getInt("PARA2"));
            _obj.setPara3(arr.getInt("PARA3"));
            _obj.setPara4(arr.getInt("PARA4"));
            _obj.setPara5(arr.getInt("PARA5"));
            _obj.setPara6(arr.getString("PARA6"));
            _obj.setPara7(arr.getString("PARA7"));
            _obj.setPara8(arr.getString("PARA8"));
            _obj.setPara9(arr.getString("PARA9"));
            _obj.setPara10(arr.getString("PARA10"));
            _obj.setPara11(arr.getInt("PARA11"));
            _obj.setPara12(arr.getString("PARA12"));
            _obj.setPara13(arr.getString("PARA13"));
            _obj.setPara14(arr.getInt("PARA14"));
            _obj.setPara15(arr.getInt("PARA15"));
            _obj.setPara16(arr.getInt("PARA16"));
            _obj.setPara17(arr.getInt("PARA17"));
            _obj.setPara18(arr.getInt("PARA18"));
            _obj.setPara19(arr.getInt("PARA19"));
            _obj.setPara20(arr.getInt("PARA20"));
            _obj.setPara21(arr.getInt("PARA21"));
            _obj.setPara22(arr.getInt("PARA22"));
            _obj.setPara23(arr.getInt("PARA23"));
            _obj.setPara24(arr.getInt("PARA24"));
            _obj.setPara25(arr.getInt("PARA25"));
            _obj.setPara26(arr.getInt("PARA26"));
            _obj.setPara27(arr.getInt("PARA27"));
            _obj.setPara28(arr.getString("PARA28"));
            _obj.setPara29(arr.getInt("PARA29"));
            _obj.setPara30(arr.getString("PARA30"));
            _obj.setPara31(arr.getInt("PARA31"));
            _obj.setPara32(arr.getString("PARA32"));
            _obj.setPara33(arr.getInt("PARA33"));
            _obj.setPara34(arr.getString("PARA34"));
            _obj.setPara35(arr.getInt("PARA35"));
            _obj.setPara36(arr.getString("PARA36"));
            _obj.setPara37(arr.getInt("PARA37"));
            _obj.setPara38(arr.getString("PARA38"));
            _obj.setPara39(arr.getInt("PARA39"));
            _obj.setPara40(arr.getString("PARA40"));
            _obj.setPara41(arr.getInt("PARA41"));
            _obj.setPara42(arr.getString("PARA42"));
            _obj.setPara43(arr.getInt("PARA43"));
            _obj.setPara44(arr.getInt("PARA44"));
            _obj.setPara45(arr.getInt("PARA45"));
            _obj.setPara46(arr.getInt("PARA46"));
            _obj.setPara47(arr.getInt("PARA47"));
            _obj.setPara48(arr.getInt("PARA48"));
            _obj.setPara49(arr.getInt("PARA49"));
            _obj.setPara50(arr.getInt("PARA50"));
            _obj.setPara51(arr.getInt("PARA51"));
            _obj.setPara52(arr.getInt("PARA52"));
            _obj.setPara53(arr.getInt("PARA53"));
            _obj.setPara54(arr.getInt("PARA54"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAO_TJ_PARSE返回的查询DataRow创建一个AIHAO_TJ_PARSEEntity对象
* @param AIHAO_TJ_PARSE row
* @returnAIHAO_TJ_PARSEList对象
* @throws Exception 
*/
public List<aihao_tj_parse_Dao> get_aihao_tj_parse_All() throws Exception{
        List<aihao_tj_parse_Dao> _list = new ArrayList<aihao_tj_parse_Dao>();
		String sqlStr = "{ call AIHAO_TJ_PARSE_PRO.GetAIHAO_TJ_PARSE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_tj_parse_Dao _obj = new aihao_tj_parse_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setPara1(arr.getInt("PARA1"));
            _obj.setPara2(arr.getInt("PARA2"));
            _obj.setPara3(arr.getInt("PARA3"));
            _obj.setPara4(arr.getInt("PARA4"));
            _obj.setPara5(arr.getInt("PARA5"));
            _obj.setPara6(arr.getString("PARA6"));
            _obj.setPara7(arr.getString("PARA7"));
            _obj.setPara8(arr.getString("PARA8"));
            _obj.setPara9(arr.getString("PARA9"));
            _obj.setPara10(arr.getString("PARA10"));
            _obj.setPara11(arr.getInt("PARA11"));
            _obj.setPara12(arr.getString("PARA12"));
            _obj.setPara13(arr.getString("PARA13"));
            _obj.setPara14(arr.getInt("PARA14"));
            _obj.setPara15(arr.getInt("PARA15"));
            _obj.setPara16(arr.getInt("PARA16"));
            _obj.setPara17(arr.getInt("PARA17"));
            _obj.setPara18(arr.getInt("PARA18"));
            _obj.setPara19(arr.getInt("PARA19"));
            _obj.setPara20(arr.getInt("PARA20"));
            _obj.setPara21(arr.getInt("PARA21"));
            _obj.setPara22(arr.getInt("PARA22"));
            _obj.setPara23(arr.getInt("PARA23"));
            _obj.setPara24(arr.getInt("PARA24"));
            _obj.setPara25(arr.getInt("PARA25"));
            _obj.setPara26(arr.getInt("PARA26"));
            _obj.setPara27(arr.getInt("PARA27"));
            _obj.setPara28(arr.getString("PARA28"));
            _obj.setPara29(arr.getInt("PARA29"));
            _obj.setPara30(arr.getString("PARA30"));
            _obj.setPara31(arr.getInt("PARA31"));
            _obj.setPara32(arr.getString("PARA32"));
            _obj.setPara33(arr.getInt("PARA33"));
            _obj.setPara34(arr.getString("PARA34"));
            _obj.setPara35(arr.getInt("PARA35"));
            _obj.setPara36(arr.getString("PARA36"));
            _obj.setPara37(arr.getInt("PARA37"));
            _obj.setPara38(arr.getString("PARA38"));
            _obj.setPara39(arr.getInt("PARA39"));
            _obj.setPara40(arr.getString("PARA40"));
            _obj.setPara41(arr.getInt("PARA41"));
            _obj.setPara42(arr.getString("PARA42"));
            _obj.setPara43(arr.getInt("PARA43"));
            _obj.setPara44(arr.getInt("PARA44"));
            _obj.setPara45(arr.getInt("PARA45"));
            _obj.setPara46(arr.getInt("PARA46"));
            _obj.setPara47(arr.getInt("PARA47"));
            _obj.setPara48(arr.getInt("PARA48"));
            _obj.setPara49(arr.getInt("PARA49"));
            _obj.setPara50(arr.getInt("PARA50"));
            _obj.setPara51(arr.getInt("PARA51"));
            _obj.setPara52(arr.getInt("PARA52"));
            _obj.setPara53(arr.getInt("PARA53"));
            _obj.setPara54(arr.getInt("PARA54"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAO_TJ_PARSE返回的查询DataRow创建一个AIHAO_TJ_PARSEEntity对象
* @param AIHAO_TJ_PARSE row
* @returnAIHAO_TJ_PARSEList对象
* @throws Exception 
*/
public List< aihao_tj_parse_Dao> get_aihao_tj_parse_All(String strWhere) throws Exception{
         List<aihao_tj_parse_Dao> _list = new ArrayList<aihao_tj_parse_Dao>();
		 String sqlStr = "{ call AIHAO_TJ_PARSE_PRO.GetAIHAO_TJ_PARSEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihao_tj_parse_Dao _obj = new aihao_tj_parse_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setPara1(arr.getInt("PARA1"));
            _obj.setPara2(arr.getInt("PARA2"));
            _obj.setPara3(arr.getInt("PARA3"));
            _obj.setPara4(arr.getInt("PARA4"));
            _obj.setPara5(arr.getInt("PARA5"));
            _obj.setPara6(arr.getString("PARA6"));
            _obj.setPara7(arr.getString("PARA7"));
            _obj.setPara8(arr.getString("PARA8"));
            _obj.setPara9(arr.getString("PARA9"));
            _obj.setPara10(arr.getString("PARA10"));
            _obj.setPara11(arr.getInt("PARA11"));
            _obj.setPara12(arr.getString("PARA12"));
            _obj.setPara13(arr.getString("PARA13"));
            _obj.setPara14(arr.getInt("PARA14"));
            _obj.setPara15(arr.getInt("PARA15"));
            _obj.setPara16(arr.getInt("PARA16"));
            _obj.setPara17(arr.getInt("PARA17"));
            _obj.setPara18(arr.getInt("PARA18"));
            _obj.setPara19(arr.getInt("PARA19"));
            _obj.setPara20(arr.getInt("PARA20"));
            _obj.setPara21(arr.getInt("PARA21"));
            _obj.setPara22(arr.getInt("PARA22"));
            _obj.setPara23(arr.getInt("PARA23"));
            _obj.setPara24(arr.getInt("PARA24"));
            _obj.setPara25(arr.getInt("PARA25"));
            _obj.setPara26(arr.getInt("PARA26"));
            _obj.setPara27(arr.getInt("PARA27"));
            _obj.setPara28(arr.getString("PARA28"));
            _obj.setPara29(arr.getInt("PARA29"));
            _obj.setPara30(arr.getString("PARA30"));
            _obj.setPara31(arr.getInt("PARA31"));
            _obj.setPara32(arr.getString("PARA32"));
            _obj.setPara33(arr.getInt("PARA33"));
            _obj.setPara34(arr.getString("PARA34"));
            _obj.setPara35(arr.getInt("PARA35"));
            _obj.setPara36(arr.getString("PARA36"));
            _obj.setPara37(arr.getInt("PARA37"));
            _obj.setPara38(arr.getString("PARA38"));
            _obj.setPara39(arr.getInt("PARA39"));
            _obj.setPara40(arr.getString("PARA40"));
            _obj.setPara41(arr.getInt("PARA41"));
            _obj.setPara42(arr.getString("PARA42"));
            _obj.setPara43(arr.getInt("PARA43"));
            _obj.setPara44(arr.getInt("PARA44"));
            _obj.setPara45(arr.getInt("PARA45"));
            _obj.setPara46(arr.getInt("PARA46"));
            _obj.setPara47(arr.getInt("PARA47"));
            _obj.setPara48(arr.getInt("PARA48"));
            _obj.setPara49(arr.getInt("PARA49"));
            _obj.setPara50(arr.getInt("PARA50"));
            _obj.setPara51(arr.getInt("PARA51"));
            _obj.setPara52(arr.getInt("PARA52"));
            _obj.setPara53(arr.getInt("PARA53"));
            _obj.setPara54(arr.getInt("PARA54"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAO_TJ_PARSE返回 分页数据
* @param AIHAO_TJ_PARSE row
* @returnAIHAO_TJ_PARSEList对象
* @throws Exception 
*/
public List<aihao_tj_parse_Dao> get_aihao_tj_parse_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihao_tj_parse_Dao> _list = new ArrayList<aihao_tj_parse_Dao>();
		String sqlStr = "{ call AIHAO_TJ_PARSE_PRO.GetAIHAO_TJ_PARSEPage(?,?,?,?,?,?)}";
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
				aihao_tj_parse_Dao _obj = new aihao_tj_parse_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setPara1(arr.getInt("PARA1"));
            _obj.setPara2(arr.getInt("PARA2"));
            _obj.setPara3(arr.getInt("PARA3"));
            _obj.setPara4(arr.getInt("PARA4"));
            _obj.setPara5(arr.getInt("PARA5"));
            _obj.setPara6(arr.getString("PARA6"));
            _obj.setPara7(arr.getString("PARA7"));
            _obj.setPara8(arr.getString("PARA8"));
            _obj.setPara9(arr.getString("PARA9"));
            _obj.setPara10(arr.getString("PARA10"));
            _obj.setPara11(arr.getInt("PARA11"));
            _obj.setPara12(arr.getString("PARA12"));
            _obj.setPara13(arr.getString("PARA13"));
            _obj.setPara14(arr.getInt("PARA14"));
            _obj.setPara15(arr.getInt("PARA15"));
            _obj.setPara16(arr.getInt("PARA16"));
            _obj.setPara17(arr.getInt("PARA17"));
            _obj.setPara18(arr.getInt("PARA18"));
            _obj.setPara19(arr.getInt("PARA19"));
            _obj.setPara20(arr.getInt("PARA20"));
            _obj.setPara21(arr.getInt("PARA21"));
            _obj.setPara22(arr.getInt("PARA22"));
            _obj.setPara23(arr.getInt("PARA23"));
            _obj.setPara24(arr.getInt("PARA24"));
            _obj.setPara25(arr.getInt("PARA25"));
            _obj.setPara26(arr.getInt("PARA26"));
            _obj.setPara27(arr.getInt("PARA27"));
            _obj.setPara28(arr.getString("PARA28"));
            _obj.setPara29(arr.getInt("PARA29"));
            _obj.setPara30(arr.getString("PARA30"));
            _obj.setPara31(arr.getInt("PARA31"));
            _obj.setPara32(arr.getString("PARA32"));
            _obj.setPara33(arr.getInt("PARA33"));
            _obj.setPara34(arr.getString("PARA34"));
            _obj.setPara35(arr.getInt("PARA35"));
            _obj.setPara36(arr.getString("PARA36"));
            _obj.setPara37(arr.getInt("PARA37"));
            _obj.setPara38(arr.getString("PARA38"));
            _obj.setPara39(arr.getInt("PARA39"));
            _obj.setPara40(arr.getString("PARA40"));
            _obj.setPara41(arr.getInt("PARA41"));
            _obj.setPara42(arr.getString("PARA42"));
            _obj.setPara43(arr.getInt("PARA43"));
            _obj.setPara44(arr.getInt("PARA44"));
            _obj.setPara45(arr.getInt("PARA45"));
            _obj.setPara46(arr.getInt("PARA46"));
            _obj.setPara47(arr.getInt("PARA47"));
            _obj.setPara48(arr.getInt("PARA48"));
            _obj.setPara49(arr.getInt("PARA49"));
            _obj.setPara50(arr.getInt("PARA50"));
            _obj.setPara51(arr.getInt("PARA51"));
            _obj.setPara52(arr.getInt("PARA52"));
            _obj.setPara53(arr.getInt("PARA53"));
            _obj.setPara54(arr.getInt("PARA54"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAO_TJ_PARSE返回的查询DataRow创建一个AIHAO_TJ_PARSEEntity对象
* @param AIHAO_TJ_PARSE row
* @returnAIHAO_TJ_PARSEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihao_tj_parse_Dao> get_aihao_tj_parse_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihao_tj_parsestrWhere") == null) {
			Dictionary<Integer, aihao_tj_parse_Dao> _dic = new Hashtable<Integer, aihao_tj_parse_Dao>();
			List<aihao_tj_parse_Dao> _list = new ArrayList<aihao_tj_parse_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLogid()), _list.get(i));
			}
			classFactory.cachePut("dicaihao_tj_parse", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihao_tj_parse_Dao> _dic = (Dictionary<Integer, aihao_tj_parse_Dao>) classFactory
					.cacheGet("dicaihao_tj_parsestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAO_TJ_PARSE字段加一
* @param FieldName
* @param sid
*/
public int create_aihao_tj_parse_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAO_TJ_PARSE_PRO.UpdateFieldAIHAO_TJ_PARSE(?,?)}";
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
* 更新AIHAO_TJ_PARSEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihao_tj_parse_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAO_TJ_PARSE_PRO.UpdateFieldAIHAO_TJ_PARSEV(?,?,?)}";
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
* 更新AIHAO_TJ_PARSEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihao_tj_parse_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAO_TJ_PARSE_PRO.UpdateFieldAIHAO_TJ_PARSEU(?,?,?)}";
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
