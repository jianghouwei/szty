/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforummember.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforummember_Dao;
import com.szty.aihao.core.mvnforummember_core;
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
*@MVNFORUMMEMBER数据接口
*@作者：宋春林 
*/
public class mvnforummember_impl implements mvnforummember_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforummember_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMEMBER实体
* @return 新插入记录的编号
*/
public int insert_mvnforummember(mvnforummember_Dao _MVNFORUMMEMBERModel)  throws Exception{
         String sqlStr = "{call MVNFORUMMEMBER_PRO.InsertMVNFORUMMEMBER(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[52];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberpassword());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberfirstemail());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberemail());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberemailvisible());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembernamevisible());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberfirstip());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberlastip());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberviewcount());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberpostcount());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMembercreationdate()));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMembermodifieddate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMemberexpiredate()));
        op[14]= new OracleParameter(15, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMemberpasswordexpiredate()));
        op[15]= new OracleParameter(16, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMemberlastlogon()));
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberoption());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberstatus());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberactivatecode());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembertemppassword());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembermessagecount());
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembermessageoption());
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberpostsperpage());
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberwarncount());
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembervotecount());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembervotetotalstars());
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberrewardpoints());
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembertitle());
        op[28]= new OracleParameter(29, "IN", java.sql.Types.DOUBLE,_MVNFORUMMEMBERModel.getMembertimezone());
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembersignature());
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberavatar());
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberskin());
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberlanguage());
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberfirstname());
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberlastname());
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembergender());
        op[36]= new OracleParameter(37, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMemberbirthday()));
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberaddress());
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembercity());
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberstate());
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembercountry());
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberphone());
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembermobile());
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberfax());
        op[44]= new OracleParameter(45, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembercareer());
        op[45]= new OracleParameter(46, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberhomepage());
        op[46]= new OracleParameter(47, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberyahoo());
        op[47]= new OracleParameter(48, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberaol());
        op[48]= new OracleParameter(49, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembericq());
        op[49]= new OracleParameter(50, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembermsn());
        op[50]= new OracleParameter(51, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembercoollink1());
        op[51]= new OracleParameter(52, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembercoollink2());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMEMBER
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforummember(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMMEMBER_PRO.InsertMVNFORUMMEMBER(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[52];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_para[11]));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_para[12]));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.DATE, dateformat.format(_para[13]));
        op[14]= new OracleParameter(15, "IN", java.sql.Types.DATE, dateformat.format(_para[14]));
        op[15]= new OracleParameter(16, "IN", java.sql.Types.DATE, dateformat.format(_para[15]));
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_para[18]);
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_para[19]);
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_para[20]);
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NUMERIC,_para[21]);
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NUMERIC,_para[22]);
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NUMERIC,_para[23]);
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NUMERIC,_para[24]);
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NUMERIC,_para[25]);
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NUMERIC,_para[26]);
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NVARCHAR,_para[27]);
        op[28]= new OracleParameter(29, "IN", java.sql.Types.DOUBLE,_para[28]);
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NVARCHAR,_para[29]);
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NVARCHAR,_para[30]);
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NVARCHAR,_para[31]);
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_para[32]);
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NVARCHAR,_para[33]);
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_para[34]);
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NUMERIC,_para[35]);
        op[36]= new OracleParameter(37, "IN", java.sql.Types.DATE, dateformat.format(_para[36]));
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NVARCHAR,_para[37]);
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_para[38]);
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NVARCHAR,_para[39]);
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_para[40]);
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NVARCHAR,_para[41]);
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NVARCHAR,_para[42]);
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NVARCHAR,_para[43]);
        op[44]= new OracleParameter(45, "IN", java.sql.Types.NVARCHAR,_para[44]);
        op[45]= new OracleParameter(46, "IN", java.sql.Types.NVARCHAR,_para[45]);
        op[46]= new OracleParameter(47, "IN", java.sql.Types.NVARCHAR,_para[46]);
        op[47]= new OracleParameter(48, "IN", java.sql.Types.NVARCHAR,_para[47]);
        op[48]= new OracleParameter(49, "IN", java.sql.Types.NVARCHAR,_para[48]);
        op[49]= new OracleParameter(50, "IN", java.sql.Types.NVARCHAR,_para[49]);
        op[50]= new OracleParameter(51, "IN", java.sql.Types.NVARCHAR,_para[50]);
        op[51]= new OracleParameter(52, "IN", java.sql.Types.NVARCHAR,_para[51]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMMEMBER实体
* @return 影响的行数
*/
public int update_mvnforummember(mvnforummember_Dao _MVNFORUMMEMBERModel)  throws Exception{
        String sqlStr = "{call MVNFORUMMEMBER_PRO.UpdateMVNFORUMMEMBER(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[52];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberpassword());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberfirstemail());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberemail());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberemailvisible());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembernamevisible());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberfirstip());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberlastip());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberviewcount());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberpostcount());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMembercreationdate()));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMembermodifieddate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMemberexpiredate()));
        op[14]= new OracleParameter(15, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMemberpasswordexpiredate()));
        op[15]= new OracleParameter(16, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMemberlastlogon()));
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberoption());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberstatus());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberactivatecode());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembertemppassword());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembermessagecount());
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembermessageoption());
        op[22]= new OracleParameter(23, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberpostsperpage());
        op[23]= new OracleParameter(24, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberwarncount());
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembervotecount());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembervotetotalstars());
        op[26]= new OracleParameter(27, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMemberrewardpoints());
        op[27]= new OracleParameter(28, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembertitle());
        op[28]= new OracleParameter(29, "IN", java.sql.Types.DOUBLE,_MVNFORUMMEMBERModel.getMembertimezone());
        op[29]= new OracleParameter(30, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembersignature());
        op[30]= new OracleParameter(31, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberavatar());
        op[31]= new OracleParameter(32, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberskin());
        op[32]= new OracleParameter(33, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberlanguage());
        op[33]= new OracleParameter(34, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberfirstname());
        op[34]= new OracleParameter(35, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberlastname());
        op[35]= new OracleParameter(36, "IN", java.sql.Types.NUMERIC,_MVNFORUMMEMBERModel.getMembergender());
        op[36]= new OracleParameter(37, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMEMBERModel.getMemberbirthday()));
        op[37]= new OracleParameter(38, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberaddress());
        op[38]= new OracleParameter(39, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembercity());
        op[39]= new OracleParameter(40, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberstate());
        op[40]= new OracleParameter(41, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembercountry());
        op[41]= new OracleParameter(42, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberphone());
        op[42]= new OracleParameter(43, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembermobile());
        op[43]= new OracleParameter(44, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberfax());
        op[44]= new OracleParameter(45, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembercareer());
        op[45]= new OracleParameter(46, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberhomepage());
        op[46]= new OracleParameter(47, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberyahoo());
        op[47]= new OracleParameter(48, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMemberaol());
        op[48]= new OracleParameter(49, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembericq());
        op[49]= new OracleParameter(50, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembermsn());
        op[50]= new OracleParameter(51, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembercoollink1());
        op[51]= new OracleParameter(52, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMEMBERModel.getMembercoollink2());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMMEMBER中的一条记录
* @param MVNFORUMMEMBER实体
* @return 新插入记录的编号
*/
public int delete_mvnforummember(int Memberid)  throws Exception{
        String sqlStr = "{call MVNFORUMMEMBER_PRO.DeleteMVNFORUMMEMBER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Memberid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforummember 数据实体
* @param Memberid">Memberid
* @return<mvnforummember 数据实体
* @throws Exception 
*/
public mvnforummember_Dao get_mvnforummemberDao(int Memberid) throws Exception{
         String sqlStr = "{ call MVNFORUMMEMBER_PRO.GetMVNFORUMMEMBEREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Memberid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummember_Dao _obj = new mvnforummember_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setMemberpassword(arr.getString("MEMBERPASSWORD"));
            _obj.setMemberfirstemail(arr.getString("MEMBERFIRSTEMAIL"));
            _obj.setMemberemail(arr.getString("MEMBEREMAIL"));
            _obj.setMemberemailvisible(arr.getInt("MEMBEREMAILVISIBLE"));
            _obj.setMembernamevisible(arr.getInt("MEMBERNAMEVISIBLE"));
            _obj.setMemberfirstip(arr.getString("MEMBERFIRSTIP"));
            _obj.setMemberlastip(arr.getString("MEMBERLASTIP"));
            _obj.setMemberviewcount(arr.getInt("MEMBERVIEWCOUNT"));
            _obj.setMemberpostcount(arr.getInt("MEMBERPOSTCOUNT"));
             try{_obj.setMembercreationdate(dateformat.parse(arr.getString("MEMBERCREATIONDATE")));}catch(Exception ce){_obj.setMembercreationdate((new Date()));}
             try{_obj.setMembermodifieddate(dateformat.parse(arr.getString("MEMBERMODIFIEDDATE")));}catch(Exception ce){_obj.setMembermodifieddate((new Date()));}
             try{_obj.setMemberexpiredate(dateformat.parse(arr.getString("MEMBEREXPIREDATE")));}catch(Exception ce){_obj.setMemberexpiredate((new Date()));}
             try{_obj.setMemberpasswordexpiredate(dateformat.parse(arr.getString("MEMBERPASSWORDEXPIREDATE")));}catch(Exception ce){_obj.setMemberpasswordexpiredate((new Date()));}
             try{_obj.setMemberlastlogon(dateformat.parse(arr.getString("MEMBERLASTLOGON")));}catch(Exception ce){_obj.setMemberlastlogon((new Date()));}
            _obj.setMemberoption(arr.getInt("MEMBEROPTION"));
            _obj.setMemberstatus(arr.getInt("MEMBERSTATUS"));
            _obj.setMemberactivatecode(arr.getString("MEMBERACTIVATECODE"));
            _obj.setMembertemppassword(arr.getString("MEMBERTEMPPASSWORD"));
            _obj.setMembermessagecount(arr.getInt("MEMBERMESSAGECOUNT"));
            _obj.setMembermessageoption(arr.getInt("MEMBERMESSAGEOPTION"));
            _obj.setMemberpostsperpage(arr.getInt("MEMBERPOSTSPERPAGE"));
            _obj.setMemberwarncount(arr.getInt("MEMBERWARNCOUNT"));
            _obj.setMembervotecount(arr.getInt("MEMBERVOTECOUNT"));
            _obj.setMembervotetotalstars(arr.getInt("MEMBERVOTETOTALSTARS"));
            _obj.setMemberrewardpoints(arr.getInt("MEMBERREWARDPOINTS"));
            _obj.setMembertitle(arr.getString("MEMBERTITLE"));
            _obj.setMembersignature(arr.getString("MEMBERSIGNATURE"));
            _obj.setMemberavatar(arr.getString("MEMBERAVATAR"));
            _obj.setMemberskin(arr.getString("MEMBERSKIN"));
            _obj.setMemberlanguage(arr.getString("MEMBERLANGUAGE"));
            _obj.setMemberfirstname(arr.getString("MEMBERFIRSTNAME"));
            _obj.setMemberlastname(arr.getString("MEMBERLASTNAME"));
            _obj.setMembergender(arr.getInt("MEMBERGENDER"));
             try{_obj.setMemberbirthday(dateformat.parse(arr.getString("MEMBERBIRTHDAY")));}catch(Exception ce){_obj.setMemberbirthday((new Date()));}
            _obj.setMemberaddress(arr.getString("MEMBERADDRESS"));
            _obj.setMembercity(arr.getString("MEMBERCITY"));
            _obj.setMemberstate(arr.getString("MEMBERSTATE"));
            _obj.setMembercountry(arr.getString("MEMBERCOUNTRY"));
            _obj.setMemberphone(arr.getString("MEMBERPHONE"));
            _obj.setMembermobile(arr.getString("MEMBERMOBILE"));
            _obj.setMemberfax(arr.getString("MEMBERFAX"));
            _obj.setMembercareer(arr.getString("MEMBERCAREER"));
            _obj.setMemberhomepage(arr.getString("MEMBERHOMEPAGE"));
            _obj.setMemberyahoo(arr.getString("MEMBERYAHOO"));
            _obj.setMemberaol(arr.getString("MEMBERAOL"));
            _obj.setMembericq(arr.getString("MEMBERICQ"));
            _obj.setMembermsn(arr.getString("MEMBERMSN"));
            _obj.setMembercoollink1(arr.getString("MEMBERCOOLLINK1"));
            _obj.setMembercoollink2(arr.getString("MEMBERCOOLLINK2"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMMEMBER返回的查询DataRow创建一个MVNFORUMMEMBEREntity对象
* @param MVNFORUMMEMBER row
* @returnMVNFORUMMEMBERList对象
* @throws Exception 
*/
public List<mvnforummember_Dao> get_mvnforummember_All() throws Exception{
        List<mvnforummember_Dao> _list = new ArrayList<mvnforummember_Dao>();
		String sqlStr = "{ call MVNFORUMMEMBER_PRO.GetMVNFORUMMEMBER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummember_Dao _obj = new mvnforummember_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setMemberpassword(arr.getString("MEMBERPASSWORD"));
            _obj.setMemberfirstemail(arr.getString("MEMBERFIRSTEMAIL"));
            _obj.setMemberemail(arr.getString("MEMBEREMAIL"));
            _obj.setMemberemailvisible(arr.getInt("MEMBEREMAILVISIBLE"));
            _obj.setMembernamevisible(arr.getInt("MEMBERNAMEVISIBLE"));
            _obj.setMemberfirstip(arr.getString("MEMBERFIRSTIP"));
            _obj.setMemberlastip(arr.getString("MEMBERLASTIP"));
            _obj.setMemberviewcount(arr.getInt("MEMBERVIEWCOUNT"));
            _obj.setMemberpostcount(arr.getInt("MEMBERPOSTCOUNT"));
            try{_obj.setMembercreationdate(dateformat.parse(arr.getString("MEMBERCREATIONDATE")));}catch(Exception ce){_obj.setMembercreationdate((new Date()));}
            try{_obj.setMembermodifieddate(dateformat.parse(arr.getString("MEMBERMODIFIEDDATE")));}catch(Exception ce){_obj.setMembermodifieddate((new Date()));}
            try{_obj.setMemberexpiredate(dateformat.parse(arr.getString("MEMBEREXPIREDATE")));}catch(Exception ce){_obj.setMemberexpiredate((new Date()));}
            try{_obj.setMemberpasswordexpiredate(dateformat.parse(arr.getString("MEMBERPASSWORDEXPIREDATE")));}catch(Exception ce){_obj.setMemberpasswordexpiredate((new Date()));}
            try{_obj.setMemberlastlogon(dateformat.parse(arr.getString("MEMBERLASTLOGON")));}catch(Exception ce){_obj.setMemberlastlogon((new Date()));}
            _obj.setMemberoption(arr.getInt("MEMBEROPTION"));
            _obj.setMemberstatus(arr.getInt("MEMBERSTATUS"));
            _obj.setMemberactivatecode(arr.getString("MEMBERACTIVATECODE"));
            _obj.setMembertemppassword(arr.getString("MEMBERTEMPPASSWORD"));
            _obj.setMembermessagecount(arr.getInt("MEMBERMESSAGECOUNT"));
            _obj.setMembermessageoption(arr.getInt("MEMBERMESSAGEOPTION"));
            _obj.setMemberpostsperpage(arr.getInt("MEMBERPOSTSPERPAGE"));
            _obj.setMemberwarncount(arr.getInt("MEMBERWARNCOUNT"));
            _obj.setMembervotecount(arr.getInt("MEMBERVOTECOUNT"));
            _obj.setMembervotetotalstars(arr.getInt("MEMBERVOTETOTALSTARS"));
            _obj.setMemberrewardpoints(arr.getInt("MEMBERREWARDPOINTS"));
            _obj.setMembertitle(arr.getString("MEMBERTITLE"));
            _obj.setMembersignature(arr.getString("MEMBERSIGNATURE"));
            _obj.setMemberavatar(arr.getString("MEMBERAVATAR"));
            _obj.setMemberskin(arr.getString("MEMBERSKIN"));
            _obj.setMemberlanguage(arr.getString("MEMBERLANGUAGE"));
            _obj.setMemberfirstname(arr.getString("MEMBERFIRSTNAME"));
            _obj.setMemberlastname(arr.getString("MEMBERLASTNAME"));
            _obj.setMembergender(arr.getInt("MEMBERGENDER"));
            try{_obj.setMemberbirthday(dateformat.parse(arr.getString("MEMBERBIRTHDAY")));}catch(Exception ce){_obj.setMemberbirthday((new Date()));}
            _obj.setMemberaddress(arr.getString("MEMBERADDRESS"));
            _obj.setMembercity(arr.getString("MEMBERCITY"));
            _obj.setMemberstate(arr.getString("MEMBERSTATE"));
            _obj.setMembercountry(arr.getString("MEMBERCOUNTRY"));
            _obj.setMemberphone(arr.getString("MEMBERPHONE"));
            _obj.setMembermobile(arr.getString("MEMBERMOBILE"));
            _obj.setMemberfax(arr.getString("MEMBERFAX"));
            _obj.setMembercareer(arr.getString("MEMBERCAREER"));
            _obj.setMemberhomepage(arr.getString("MEMBERHOMEPAGE"));
            _obj.setMemberyahoo(arr.getString("MEMBERYAHOO"));
            _obj.setMemberaol(arr.getString("MEMBERAOL"));
            _obj.setMembericq(arr.getString("MEMBERICQ"));
            _obj.setMembermsn(arr.getString("MEMBERMSN"));
            _obj.setMembercoollink1(arr.getString("MEMBERCOOLLINK1"));
            _obj.setMembercoollink2(arr.getString("MEMBERCOOLLINK2"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMMEMBER返回的查询DataRow创建一个MVNFORUMMEMBEREntity对象
* @param MVNFORUMMEMBER row
* @returnMVNFORUMMEMBERList对象
* @throws Exception 
*/
public List< mvnforummember_Dao> get_mvnforummember_All(String strWhere) throws Exception{
         List<mvnforummember_Dao> _list = new ArrayList<mvnforummember_Dao>();
		 String sqlStr = "{ call MVNFORUMMEMBER_PRO.GetMVNFORUMMEMBERWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforummember_Dao _obj = new mvnforummember_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setMemberpassword(arr.getString("MEMBERPASSWORD"));
            _obj.setMemberfirstemail(arr.getString("MEMBERFIRSTEMAIL"));
            _obj.setMemberemail(arr.getString("MEMBEREMAIL"));
            _obj.setMemberemailvisible(arr.getInt("MEMBEREMAILVISIBLE"));
            _obj.setMembernamevisible(arr.getInt("MEMBERNAMEVISIBLE"));
            _obj.setMemberfirstip(arr.getString("MEMBERFIRSTIP"));
            _obj.setMemberlastip(arr.getString("MEMBERLASTIP"));
            _obj.setMemberviewcount(arr.getInt("MEMBERVIEWCOUNT"));
            _obj.setMemberpostcount(arr.getInt("MEMBERPOSTCOUNT"));
           try{_obj.setMembercreationdate(dateformat.parse(arr.getString("MEMBERCREATIONDATE")));}catch(Exception ce){_obj.setMembercreationdate((new Date()));}
           try{_obj.setMembermodifieddate(dateformat.parse(arr.getString("MEMBERMODIFIEDDATE")));}catch(Exception ce){_obj.setMembermodifieddate((new Date()));}
           try{_obj.setMemberexpiredate(dateformat.parse(arr.getString("MEMBEREXPIREDATE")));}catch(Exception ce){_obj.setMemberexpiredate((new Date()));}
           try{_obj.setMemberpasswordexpiredate(dateformat.parse(arr.getString("MEMBERPASSWORDEXPIREDATE")));}catch(Exception ce){_obj.setMemberpasswordexpiredate((new Date()));}
           try{_obj.setMemberlastlogon(dateformat.parse(arr.getString("MEMBERLASTLOGON")));}catch(Exception ce){_obj.setMemberlastlogon((new Date()));}
            _obj.setMemberoption(arr.getInt("MEMBEROPTION"));
            _obj.setMemberstatus(arr.getInt("MEMBERSTATUS"));
            _obj.setMemberactivatecode(arr.getString("MEMBERACTIVATECODE"));
            _obj.setMembertemppassword(arr.getString("MEMBERTEMPPASSWORD"));
            _obj.setMembermessagecount(arr.getInt("MEMBERMESSAGECOUNT"));
            _obj.setMembermessageoption(arr.getInt("MEMBERMESSAGEOPTION"));
            _obj.setMemberpostsperpage(arr.getInt("MEMBERPOSTSPERPAGE"));
            _obj.setMemberwarncount(arr.getInt("MEMBERWARNCOUNT"));
            _obj.setMembervotecount(arr.getInt("MEMBERVOTECOUNT"));
            _obj.setMembervotetotalstars(arr.getInt("MEMBERVOTETOTALSTARS"));
            _obj.setMemberrewardpoints(arr.getInt("MEMBERREWARDPOINTS"));
            _obj.setMembertitle(arr.getString("MEMBERTITLE"));
            _obj.setMembersignature(arr.getString("MEMBERSIGNATURE"));
            _obj.setMemberavatar(arr.getString("MEMBERAVATAR"));
            _obj.setMemberskin(arr.getString("MEMBERSKIN"));
            _obj.setMemberlanguage(arr.getString("MEMBERLANGUAGE"));
            _obj.setMemberfirstname(arr.getString("MEMBERFIRSTNAME"));
            _obj.setMemberlastname(arr.getString("MEMBERLASTNAME"));
            _obj.setMembergender(arr.getInt("MEMBERGENDER"));
           try{_obj.setMemberbirthday(dateformat.parse(arr.getString("MEMBERBIRTHDAY")));}catch(Exception ce){_obj.setMemberbirthday((new Date()));}
            _obj.setMemberaddress(arr.getString("MEMBERADDRESS"));
            _obj.setMembercity(arr.getString("MEMBERCITY"));
            _obj.setMemberstate(arr.getString("MEMBERSTATE"));
            _obj.setMembercountry(arr.getString("MEMBERCOUNTRY"));
            _obj.setMemberphone(arr.getString("MEMBERPHONE"));
            _obj.setMembermobile(arr.getString("MEMBERMOBILE"));
            _obj.setMemberfax(arr.getString("MEMBERFAX"));
            _obj.setMembercareer(arr.getString("MEMBERCAREER"));
            _obj.setMemberhomepage(arr.getString("MEMBERHOMEPAGE"));
            _obj.setMemberyahoo(arr.getString("MEMBERYAHOO"));
            _obj.setMemberaol(arr.getString("MEMBERAOL"));
            _obj.setMembericq(arr.getString("MEMBERICQ"));
            _obj.setMembermsn(arr.getString("MEMBERMSN"));
            _obj.setMembercoollink1(arr.getString("MEMBERCOOLLINK1"));
            _obj.setMembercoollink2(arr.getString("MEMBERCOOLLINK2"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMMEMBER返回 分页数据
* @param MVNFORUMMEMBER row
* @returnMVNFORUMMEMBERList对象
* @throws Exception 
*/
public List<mvnforummember_Dao> get_mvnforummember_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforummember_Dao> _list = new ArrayList<mvnforummember_Dao>();
		String sqlStr = "{ call MVNFORUMMEMBER_PRO.GetMVNFORUMMEMBERPage(?,?,?,?,?,?)}";
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
				mvnforummember_Dao _obj = new mvnforummember_Dao();
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setMembername(arr.getString("MEMBERNAME"));
            _obj.setMemberpassword(arr.getString("MEMBERPASSWORD"));
            _obj.setMemberfirstemail(arr.getString("MEMBERFIRSTEMAIL"));
            _obj.setMemberemail(arr.getString("MEMBEREMAIL"));
            _obj.setMemberemailvisible(arr.getInt("MEMBEREMAILVISIBLE"));
            _obj.setMembernamevisible(arr.getInt("MEMBERNAMEVISIBLE"));
            _obj.setMemberfirstip(arr.getString("MEMBERFIRSTIP"));
            _obj.setMemberlastip(arr.getString("MEMBERLASTIP"));
            _obj.setMemberviewcount(arr.getInt("MEMBERVIEWCOUNT"));
            _obj.setMemberpostcount(arr.getInt("MEMBERPOSTCOUNT"));
            try{_obj.setMembercreationdate(dateformat.parse(arr.getString("MEMBERCREATIONDATE")));}catch(Exception ce){_obj.setMembercreationdate((new Date()));}
            try{_obj.setMembermodifieddate(dateformat.parse(arr.getString("MEMBERMODIFIEDDATE")));}catch(Exception ce){_obj.setMembermodifieddate((new Date()));}
            try{_obj.setMemberexpiredate(dateformat.parse(arr.getString("MEMBEREXPIREDATE")));}catch(Exception ce){_obj.setMemberexpiredate((new Date()));}
            try{_obj.setMemberpasswordexpiredate(dateformat.parse(arr.getString("MEMBERPASSWORDEXPIREDATE")));}catch(Exception ce){_obj.setMemberpasswordexpiredate((new Date()));}
            try{_obj.setMemberlastlogon(dateformat.parse(arr.getString("MEMBERLASTLOGON")));}catch(Exception ce){_obj.setMemberlastlogon((new Date()));}
            _obj.setMemberoption(arr.getInt("MEMBEROPTION"));
            _obj.setMemberstatus(arr.getInt("MEMBERSTATUS"));
            _obj.setMemberactivatecode(arr.getString("MEMBERACTIVATECODE"));
            _obj.setMembertemppassword(arr.getString("MEMBERTEMPPASSWORD"));
            _obj.setMembermessagecount(arr.getInt("MEMBERMESSAGECOUNT"));
            _obj.setMembermessageoption(arr.getInt("MEMBERMESSAGEOPTION"));
            _obj.setMemberpostsperpage(arr.getInt("MEMBERPOSTSPERPAGE"));
            _obj.setMemberwarncount(arr.getInt("MEMBERWARNCOUNT"));
            _obj.setMembervotecount(arr.getInt("MEMBERVOTECOUNT"));
            _obj.setMembervotetotalstars(arr.getInt("MEMBERVOTETOTALSTARS"));
            _obj.setMemberrewardpoints(arr.getInt("MEMBERREWARDPOINTS"));
            _obj.setMembertitle(arr.getString("MEMBERTITLE"));
            _obj.setMembersignature(arr.getString("MEMBERSIGNATURE"));
            _obj.setMemberavatar(arr.getString("MEMBERAVATAR"));
            _obj.setMemberskin(arr.getString("MEMBERSKIN"));
            _obj.setMemberlanguage(arr.getString("MEMBERLANGUAGE"));
            _obj.setMemberfirstname(arr.getString("MEMBERFIRSTNAME"));
            _obj.setMemberlastname(arr.getString("MEMBERLASTNAME"));
            _obj.setMembergender(arr.getInt("MEMBERGENDER"));
            try{_obj.setMemberbirthday(dateformat.parse(arr.getString("MEMBERBIRTHDAY")));}catch(Exception ce){_obj.setMemberbirthday((new Date()));}
            _obj.setMemberaddress(arr.getString("MEMBERADDRESS"));
            _obj.setMembercity(arr.getString("MEMBERCITY"));
            _obj.setMemberstate(arr.getString("MEMBERSTATE"));
            _obj.setMembercountry(arr.getString("MEMBERCOUNTRY"));
            _obj.setMemberphone(arr.getString("MEMBERPHONE"));
            _obj.setMembermobile(arr.getString("MEMBERMOBILE"));
            _obj.setMemberfax(arr.getString("MEMBERFAX"));
            _obj.setMembercareer(arr.getString("MEMBERCAREER"));
            _obj.setMemberhomepage(arr.getString("MEMBERHOMEPAGE"));
            _obj.setMemberyahoo(arr.getString("MEMBERYAHOO"));
            _obj.setMemberaol(arr.getString("MEMBERAOL"));
            _obj.setMembericq(arr.getString("MEMBERICQ"));
            _obj.setMembermsn(arr.getString("MEMBERMSN"));
            _obj.setMembercoollink1(arr.getString("MEMBERCOOLLINK1"));
            _obj.setMembercoollink2(arr.getString("MEMBERCOOLLINK2"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMMEMBER返回的查询DataRow创建一个MVNFORUMMEMBEREntity对象
* @param MVNFORUMMEMBER row
* @returnMVNFORUMMEMBERDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforummember_Dao> get_mvnforummember_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforummemberstrWhere") == null) {
			Dictionary<Integer, mvnforummember_Dao> _dic = new Hashtable<Integer, mvnforummember_Dao>();
			List<mvnforummember_Dao> _list = new ArrayList<mvnforummember_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMemberid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforummember", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforummember_Dao> _dic = (Dictionary<Integer, mvnforummember_Dao>) classFactory
					.cacheGet("dicmvnforummemberstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMMEMBER字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforummember_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMMEMBER_PRO.UpdateFieldMVNFORUMMEMBER(?,?)}";
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
* 更新MVNFORUMMEMBERInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforummember_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMMEMBER_PRO.UpdateFieldMVNFORUMMEMBERV(?,?,?)}";
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
* 更新MVNFORUMMEMBERIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforummember_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMMEMBER_PRO.UpdateFieldMVNFORUMMEMBERU(?,?,?)}";
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
