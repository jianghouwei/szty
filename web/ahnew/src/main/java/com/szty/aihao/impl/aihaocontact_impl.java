/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaocontact.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaocontact_Dao;
import com.szty.aihao.core.aihaocontact_core;
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
*@AIHAOCONTACT数据接口
*@作者：宋春林 
*/
public class aihaocontact_impl implements aihaocontact_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaocontact_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOCONTACT实体
* @return 新插入记录的编号
*/
public int insert_aihaocontact(aihaocontact_Dao _AIHAOCONTACTModel)  throws Exception{
         String sqlStr = "{call AIHAOCONTACT_PRO.InsertAIHAOCONTACT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[15];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOCONTACTModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_AIHAOCONTACTModel.getUinfoid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getFirstname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getName());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getMobile());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getHometel());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getCompanytel());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getEmail());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getIm());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getPostcode());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getCountry());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getProvince());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getCity());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getStreet());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOCONTACTModel.getCreatetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOCONTACT
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaocontact(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOCONTACT_PRO.InsertAIHAOCONTACT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[15];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
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
        op[14]= new OracleParameter(15, "IN", java.sql.Types.DATE, dateformat.format(_para[14]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOCONTACT实体
* @return 影响的行数
*/
public int update_aihaocontact(aihaocontact_Dao _AIHAOCONTACTModel)  throws Exception{
        String sqlStr = "{call AIHAOCONTACT_PRO.UpdateAIHAOCONTACT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[15];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOCONTACTModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_AIHAOCONTACTModel.getUinfoid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getFirstname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getName());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getMobile());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getHometel());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getCompanytel());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getEmail());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getIm());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getPostcode());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getCountry());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getProvince());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getCity());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOCONTACTModel.getStreet());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOCONTACTModel.getCreatetime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOCONTACT中的一条记录
* @param AIHAOCONTACT实体
* @return 新插入记录的编号
*/
public int delete_aihaocontact(int Id)  throws Exception{
        String sqlStr = "{call AIHAOCONTACT_PRO.DeleteAIHAOCONTACT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaocontact 数据实体
* @param Id">Id
* @return<aihaocontact 数据实体
* @throws Exception 
*/
public aihaocontact_Dao get_aihaocontactDao(int Id) throws Exception{
         String sqlStr = "{ call AIHAOCONTACT_PRO.GetAIHAOCONTACTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaocontact_Dao _obj = new aihaocontact_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setUinfoid(arr.getInt("UINFOID"));
            _obj.setFirstname(arr.getString("FIRSTNAME"));
            _obj.setName(arr.getString("NAME"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setHometel(arr.getString("HOMETEL"));
            _obj.setCompanytel(arr.getString("COMPANYTEL"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setIm(arr.getString("IM"));
            _obj.setPostcode(arr.getString("POSTCODE"));
            _obj.setCountry(arr.getString("COUNTRY"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setStreet(arr.getString("STREET"));
             try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOCONTACT返回的查询DataRow创建一个AIHAOCONTACTEntity对象
* @param AIHAOCONTACT row
* @returnAIHAOCONTACTList对象
* @throws Exception 
*/
public List<aihaocontact_Dao> get_aihaocontact_All() throws Exception{
        List<aihaocontact_Dao> _list = new ArrayList<aihaocontact_Dao>();
		String sqlStr = "{ call AIHAOCONTACT_PRO.GetAIHAOCONTACT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaocontact_Dao _obj = new aihaocontact_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setUinfoid(arr.getInt("UINFOID"));
            _obj.setFirstname(arr.getString("FIRSTNAME"));
            _obj.setName(arr.getString("NAME"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setHometel(arr.getString("HOMETEL"));
            _obj.setCompanytel(arr.getString("COMPANYTEL"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setIm(arr.getString("IM"));
            _obj.setPostcode(arr.getString("POSTCODE"));
            _obj.setCountry(arr.getString("COUNTRY"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setStreet(arr.getString("STREET"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOCONTACT返回的查询DataRow创建一个AIHAOCONTACTEntity对象
* @param AIHAOCONTACT row
* @returnAIHAOCONTACTList对象
* @throws Exception 
*/
public List< aihaocontact_Dao> get_aihaocontact_All(String strWhere) throws Exception{
         List<aihaocontact_Dao> _list = new ArrayList<aihaocontact_Dao>();
		 String sqlStr = "{ call AIHAOCONTACT_PRO.GetAIHAOCONTACTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaocontact_Dao _obj = new aihaocontact_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setUinfoid(arr.getInt("UINFOID"));
            _obj.setFirstname(arr.getString("FIRSTNAME"));
            _obj.setName(arr.getString("NAME"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setHometel(arr.getString("HOMETEL"));
            _obj.setCompanytel(arr.getString("COMPANYTEL"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setIm(arr.getString("IM"));
            _obj.setPostcode(arr.getString("POSTCODE"));
            _obj.setCountry(arr.getString("COUNTRY"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setStreet(arr.getString("STREET"));
           try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOCONTACT返回 分页数据
* @param AIHAOCONTACT row
* @returnAIHAOCONTACTList对象
* @throws Exception 
*/
public List<aihaocontact_Dao> get_aihaocontact_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaocontact_Dao> _list = new ArrayList<aihaocontact_Dao>();
		String sqlStr = "{ call AIHAOCONTACT_PRO.GetAIHAOCONTACTPage(?,?,?,?,?,?)}";
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
				aihaocontact_Dao _obj = new aihaocontact_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setUinfoid(arr.getInt("UINFOID"));
            _obj.setFirstname(arr.getString("FIRSTNAME"));
            _obj.setName(arr.getString("NAME"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setHometel(arr.getString("HOMETEL"));
            _obj.setCompanytel(arr.getString("COMPANYTEL"));
            _obj.setEmail(arr.getString("EMAIL"));
            _obj.setIm(arr.getString("IM"));
            _obj.setPostcode(arr.getString("POSTCODE"));
            _obj.setCountry(arr.getString("COUNTRY"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setStreet(arr.getString("STREET"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOCONTACT返回的查询DataRow创建一个AIHAOCONTACTEntity对象
* @param AIHAOCONTACT row
* @returnAIHAOCONTACTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaocontact_Dao> get_aihaocontact_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaocontactstrWhere") == null) {
			Dictionary<Integer, aihaocontact_Dao> _dic = new Hashtable<Integer, aihaocontact_Dao>();
			List<aihaocontact_Dao> _list = new ArrayList<aihaocontact_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihaocontact", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaocontact_Dao> _dic = (Dictionary<Integer, aihaocontact_Dao>) classFactory
					.cacheGet("dicaihaocontactstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOCONTACT字段加一
* @param FieldName
* @param sid
*/
public int create_aihaocontact_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOCONTACT_PRO.UpdateFieldAIHAOCONTACT(?,?)}";
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
* 更新AIHAOCONTACTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaocontact_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOCONTACT_PRO.UpdateFieldAIHAOCONTACTV(?,?,?)}";
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
* 更新AIHAOCONTACTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaocontact_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOCONTACT_PRO.UpdateFieldAIHAOCONTACTU(?,?,?)}";
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
