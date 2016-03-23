/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSztycontact.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sztycontact_Dao;
import com.szty.aihao.core.sztycontact_core;
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
*@SZTYCONTACT数据接口
*@作者：宋春林 
*/
public class sztycontact_impl implements sztycontact_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sztycontact_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTYCONTACT实体
* @return 新插入记录的编号
*/
public int insert_sztycontact(sztycontact_Dao _SZTYCONTACTModel)  throws Exception{
         String sqlStr = "{call SZTYCONTACT_PRO.InsertSZTYCONTACT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[26];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTYCONTACTModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getMobile());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getContactmobile());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getUsername());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getFamilyname());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getName());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_SZTYCONTACTModel.getGender());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getAlias());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getSignature());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getAvatar());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getFromring());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getToring());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getEmail());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getMsn());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getQq());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getWeb());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getBlog());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.DATE, dateformat.format(_SZTYCONTACTModel.getBirthday()));
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getAddress());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getUnit());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getSpecially());
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getRemark());
        op[22]= new OracleParameter(23, "IN", java.sql.Types.DATE, dateformat.format(_SZTYCONTACTModel.getCreatetime()));
        op[23]= new OracleParameter(24, "IN", java.sql.Types.DATE, dateformat.format(_SZTYCONTACTModel.getUpdatetime()));
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NUMERIC,_SZTYCONTACTModel.getIsdelete());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NUMERIC,_SZTYCONTACTModel.getGroupid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTYCONTACT
* @Object 
* @return 新插入记录的编号
*/
public int insert_sztycontact(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTYCONTACT_PRO.InsertSZTYCONTACT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[26];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
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
        op[17]= new OracleParameter(18, "IN", java.sql.Types.DATE, dateformat.format(_para[17]));
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_para[18]);
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_para[19]);
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NVARCHAR,_para[20]);
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NVARCHAR,_para[21]);
        op[22]= new OracleParameter(23, "IN", java.sql.Types.DATE, dateformat.format(_para[22]));
        op[23]= new OracleParameter(24, "IN", java.sql.Types.DATE, dateformat.format(_para[23]));
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NUMERIC,_para[24]);
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NUMERIC,_para[25]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SZTYCONTACT实体
* @return 影响的行数
*/
public int update_sztycontact(sztycontact_Dao _SZTYCONTACTModel)  throws Exception{
        String sqlStr = "{call SZTYCONTACT_PRO.UpdateSZTYCONTACT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[26];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.BIGINT,_SZTYCONTACTModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getMobile());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getContactmobile());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getUsername());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getFamilyname());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getName());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_SZTYCONTACTModel.getGender());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getAlias());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getSignature());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getAvatar());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getFromring());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getToring());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getEmail());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getMsn());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getQq());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getWeb());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getBlog());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.DATE, dateformat.format(_SZTYCONTACTModel.getBirthday()));
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getAddress());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getUnit());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getSpecially());
        op[21]= new OracleParameter(22, "IN", java.sql.Types.NVARCHAR,_SZTYCONTACTModel.getRemark());
        op[22]= new OracleParameter(23, "IN", java.sql.Types.DATE, dateformat.format(_SZTYCONTACTModel.getCreatetime()));
        op[23]= new OracleParameter(24, "IN", java.sql.Types.DATE, dateformat.format(_SZTYCONTACTModel.getUpdatetime()));
        op[24]= new OracleParameter(25, "IN", java.sql.Types.NUMERIC,_SZTYCONTACTModel.getIsdelete());
        op[25]= new OracleParameter(26, "IN", java.sql.Types.NUMERIC,_SZTYCONTACTModel.getGroupid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTYCONTACT中的一条记录
* @param SZTYCONTACT实体
* @return 新插入记录的编号
*/
public int delete_sztycontact(int Id)  throws Exception{
        String sqlStr = "{call SZTYCONTACT_PRO.DeleteSZTYCONTACT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 sztycontact 数据实体
* @param Id">Id
* @return<sztycontact 数据实体
* @throws Exception 
*/
public sztycontact_Dao get_sztycontactDao(int Id) throws Exception{
         String sqlStr = "{ call SZTYCONTACT_PRO.GetSZTYCONTACTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztycontact_Dao _obj = new sztycontact_Dao();
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setContactmobile(arr.getString("CONTACTMOBILE"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setFamilyname(arr.getString("FAMILYNAME"));
            _obj.setName(arr.getString("NAME"));
            _obj.setGender(arr.getInt("GENDER"));
            _obj.setAlias(arr.getString("ALIAS"));
            _obj.setSignature(arr.getString("SIGNATURE"));
            _obj.setAvatar(arr.getString("AVATAR"));
            _obj.setFromring(arr.getString("FROMRING"));
            _obj.setToring(arr.getString("TORING"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setMsn(arr.getString("MSN"));
            _obj.setQq(arr.getString("QQ"));
            _obj.setWeb(arr.getString("WEB"));
            _obj.setBlog(arr.getString("BLOG"));
             try{_obj.setBirthday(dateformat.parse(arr.getString("BIRTHDAY")));}catch(Exception ce){_obj.setBirthday((new Date()));}
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setUnit(arr.getString("UNIT"));
            _obj.setSpecially(arr.getString("SPECIALLY"));
            _obj.setRemark(arr.getString("REMARK"));
             try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
             try{_obj.setUpdatetime(dateformat.parse(arr.getString("UPDATETIME")));}catch(Exception ce){_obj.setUpdatetime((new Date()));}
            _obj.setIsdelete(arr.getInt("ISDELETE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
			return _obj;
		}
		return null;

}

/**
* 根据SZTYCONTACT返回的查询DataRow创建一个SZTYCONTACTEntity对象
* @param SZTYCONTACT row
* @returnSZTYCONTACTList对象
* @throws Exception 
*/
public List<sztycontact_Dao> get_sztycontact_All() throws Exception{
        List<sztycontact_Dao> _list = new ArrayList<sztycontact_Dao>();
		String sqlStr = "{ call SZTYCONTACT_PRO.GetSZTYCONTACT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztycontact_Dao _obj = new sztycontact_Dao();
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setContactmobile(arr.getString("CONTACTMOBILE"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setFamilyname(arr.getString("FAMILYNAME"));
            _obj.setName(arr.getString("NAME"));
            _obj.setGender(arr.getInt("GENDER"));
            _obj.setAlias(arr.getString("ALIAS"));
            _obj.setSignature(arr.getString("SIGNATURE"));
            _obj.setAvatar(arr.getString("AVATAR"));
            _obj.setFromring(arr.getString("FROMRING"));
            _obj.setToring(arr.getString("TORING"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setMsn(arr.getString("MSN"));
            _obj.setQq(arr.getString("QQ"));
            _obj.setWeb(arr.getString("WEB"));
            _obj.setBlog(arr.getString("BLOG"));
            try{_obj.setBirthday(dateformat.parse(arr.getString("BIRTHDAY")));}catch(Exception ce){_obj.setBirthday((new Date()));}
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setUnit(arr.getString("UNIT"));
            _obj.setSpecially(arr.getString("SPECIALLY"));
            _obj.setRemark(arr.getString("REMARK"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            try{_obj.setUpdatetime(dateformat.parse(arr.getString("UPDATETIME")));}catch(Exception ce){_obj.setUpdatetime((new Date()));}
            _obj.setIsdelete(arr.getInt("ISDELETE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTYCONTACT返回的查询DataRow创建一个SZTYCONTACTEntity对象
* @param SZTYCONTACT row
* @returnSZTYCONTACTList对象
* @throws Exception 
*/
public List< sztycontact_Dao> get_sztycontact_All(String strWhere) throws Exception{
         List<sztycontact_Dao> _list = new ArrayList<sztycontact_Dao>();
		 String sqlStr = "{ call SZTYCONTACT_PRO.GetSZTYCONTACTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sztycontact_Dao _obj = new sztycontact_Dao();
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setContactmobile(arr.getString("CONTACTMOBILE"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setFamilyname(arr.getString("FAMILYNAME"));
            _obj.setName(arr.getString("NAME"));
            _obj.setGender(arr.getInt("GENDER"));
            _obj.setAlias(arr.getString("ALIAS"));
            _obj.setSignature(arr.getString("SIGNATURE"));
            _obj.setAvatar(arr.getString("AVATAR"));
            _obj.setFromring(arr.getString("FROMRING"));
            _obj.setToring(arr.getString("TORING"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setMsn(arr.getString("MSN"));
            _obj.setQq(arr.getString("QQ"));
            _obj.setWeb(arr.getString("WEB"));
            _obj.setBlog(arr.getString("BLOG"));
           try{_obj.setBirthday(dateformat.parse(arr.getString("BIRTHDAY")));}catch(Exception ce){_obj.setBirthday((new Date()));}
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setUnit(arr.getString("UNIT"));
            _obj.setSpecially(arr.getString("SPECIALLY"));
            _obj.setRemark(arr.getString("REMARK"));
           try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
           try{_obj.setUpdatetime(dateformat.parse(arr.getString("UPDATETIME")));}catch(Exception ce){_obj.setUpdatetime((new Date()));}
            _obj.setIsdelete(arr.getInt("ISDELETE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTYCONTACT返回 分页数据
* @param SZTYCONTACT row
* @returnSZTYCONTACTList对象
* @throws Exception 
*/
public List<sztycontact_Dao> get_sztycontact_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sztycontact_Dao> _list = new ArrayList<sztycontact_Dao>();
		String sqlStr = "{ call SZTYCONTACT_PRO.GetSZTYCONTACTPage(?,?,?,?,?,?)}";
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
				sztycontact_Dao _obj = new sztycontact_Dao();
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setContactmobile(arr.getString("CONTACTMOBILE"));
            _obj.setUsername(arr.getString("USERNAME"));
            _obj.setFamilyname(arr.getString("FAMILYNAME"));
            _obj.setName(arr.getString("NAME"));
            _obj.setGender(arr.getInt("GENDER"));
            _obj.setAlias(arr.getString("ALIAS"));
            _obj.setSignature(arr.getString("SIGNATURE"));
            _obj.setAvatar(arr.getString("AVATAR"));
            _obj.setFromring(arr.getString("FROMRING"));
            _obj.setToring(arr.getString("TORING"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setMsn(arr.getString("MSN"));
            _obj.setQq(arr.getString("QQ"));
            _obj.setWeb(arr.getString("WEB"));
            _obj.setBlog(arr.getString("BLOG"));
            try{_obj.setBirthday(dateformat.parse(arr.getString("BIRTHDAY")));}catch(Exception ce){_obj.setBirthday((new Date()));}
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setUnit(arr.getString("UNIT"));
            _obj.setSpecially(arr.getString("SPECIALLY"));
            _obj.setRemark(arr.getString("REMARK"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            try{_obj.setUpdatetime(dateformat.parse(arr.getString("UPDATETIME")));}catch(Exception ce){_obj.setUpdatetime((new Date()));}
            _obj.setIsdelete(arr.getInt("ISDELETE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTYCONTACT返回的查询DataRow创建一个SZTYCONTACTEntity对象
* @param SZTYCONTACT row
* @returnSZTYCONTACTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, sztycontact_Dao> get_sztycontact_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsztycontactstrWhere") == null) {
			Dictionary<Integer, sztycontact_Dao> _dic = new Hashtable<Integer, sztycontact_Dao>();
			List<sztycontact_Dao> _list = new ArrayList<sztycontact_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((int)(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicsztycontact", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sztycontact_Dao> _dic = (Dictionary<Integer, sztycontact_Dao>) classFactory
					.cacheGet("dicsztycontactstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTYCONTACT字段加一
* @param FieldName
* @param sid
*/
public int create_sztycontact_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTYCONTACT_PRO.UpdateFieldSZTYCONTACT(?,?)}";
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
* 更新SZTYCONTACTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_sztycontact_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTYCONTACT_PRO.UpdateFieldSZTYCONTACTV(?,?,?)}";
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
* 更新SZTYCONTACTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_sztycontact_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTYCONTACT_PRO.UpdateFieldSZTYCONTACTU(?,?,?)}";
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
