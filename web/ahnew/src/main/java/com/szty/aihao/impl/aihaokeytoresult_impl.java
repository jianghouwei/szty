/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaokeytoresult.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaokeytoresult_Dao;
import com.szty.aihao.core.aihaokeytoresult_core;
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
*@AIHAOKEYTORESULT数据接口
*@作者：宋春林 
*/
public class aihaokeytoresult_impl implements aihaokeytoresult_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaokeytoresult_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOKEYTORESULT实体
* @return 新插入记录的编号
*/
public int insert_aihaokeytoresult(aihaokeytoresult_Dao _AIHAOKEYTORESULTModel)  throws Exception{
         String sqlStr = "{call AIHAOKEYTORESULT_PRO.InsertAIHAOKEYTORESULT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getKeyid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getKeynames());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getMerchantid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getProcode());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getCitycode());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getDistrictcode());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getDistrictname());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getMerchantname());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getMerchantphone());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getMerchantaddress());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getGooglelat());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getGooglelng());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getBaidulat());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getBaidulng());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getGeohas());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getFromtype());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getBigclass());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOKEYTORESULTModel.getCdate()));
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getKeyorder());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOKEYTORESULT
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaokeytoresult(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOKEYTORESULT_PRO.InsertAIHAOKEYTORESULT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[19];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.DATE, dateformat.format(_para[17]));
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_para[18]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOKEYTORESULT实体
* @return 影响的行数
*/
public int update_aihaokeytoresult(aihaokeytoresult_Dao _AIHAOKEYTORESULTModel)  throws Exception{
        String sqlStr = "{call AIHAOKEYTORESULT_PRO.UpdateAIHAOKEYTORESULT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getKeyid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getKeynames());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getMerchantid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getProcode());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getCitycode());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getDistrictcode());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getDistrictname());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getMerchantname());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getMerchantphone());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getMerchantaddress());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getGooglelat());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getGooglelng());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getBaidulat());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getBaidulng());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getGeohas());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getFromtype());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AIHAOKEYTORESULTModel.getBigclass());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOKEYTORESULTModel.getCdate()));
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_AIHAOKEYTORESULTModel.getKeyorder());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOKEYTORESULT中的一条记录
* @param AIHAOKEYTORESULT实体
* @return 新插入记录的编号
*/
public int delete_aihaokeytoresult(int Keyid)  throws Exception{
        String sqlStr = "{call AIHAOKEYTORESULT_PRO.DeleteAIHAOKEYTORESULT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Keyid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaokeytoresult 数据实体
* @param Keyid">Keyid
* @return<aihaokeytoresult 数据实体
* @throws Exception 
*/
public aihaokeytoresult_Dao get_aihaokeytoresultDao(int Keyid) throws Exception{
         String sqlStr = "{ call AIHAOKEYTORESULT_PRO.GetAIHAOKEYTORESULTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Keyid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaokeytoresult_Dao _obj = new aihaokeytoresult_Dao();
            _obj.setKeyid(arr.getInt("KEYID"));
            _obj.setKeynames(arr.getString("KEYNAMES"));
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setDistrictcode(arr.getInt("DISTRICTCODE"));
            _obj.setDistrictname(arr.getString("DISTRICTNAME"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantphone(arr.getString("MERCHANTPHONE"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setGooglelat(arr.getString("GOOGLELAT"));
            _obj.setGooglelng(arr.getString("GOOGLELNG"));
            _obj.setBaidulat(arr.getString("BAIDULAT"));
            _obj.setBaidulng(arr.getString("BAIDULNG"));
            _obj.setGeohas(arr.getString("GEOHAS"));
            _obj.setFromtype(arr.getInt("FROMTYPE"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setKeyorder(arr.getInt("KEYORDER"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOKEYTORESULT返回的查询DataRow创建一个AIHAOKEYTORESULTEntity对象
* @param AIHAOKEYTORESULT row
* @returnAIHAOKEYTORESULTList对象
* @throws Exception 
*/
public List<aihaokeytoresult_Dao> get_aihaokeytoresult_All() throws Exception{
        List<aihaokeytoresult_Dao> _list = new ArrayList<aihaokeytoresult_Dao>();
		String sqlStr = "{ call AIHAOKEYTORESULT_PRO.GetAIHAOKEYTORESULT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaokeytoresult_Dao _obj = new aihaokeytoresult_Dao();
            _obj.setKeyid(arr.getInt("KEYID"));
            _obj.setKeynames(arr.getString("KEYNAMES"));
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setDistrictcode(arr.getInt("DISTRICTCODE"));
            _obj.setDistrictname(arr.getString("DISTRICTNAME"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantphone(arr.getString("MERCHANTPHONE"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setGooglelat(arr.getString("GOOGLELAT"));
            _obj.setGooglelng(arr.getString("GOOGLELNG"));
            _obj.setBaidulat(arr.getString("BAIDULAT"));
            _obj.setBaidulng(arr.getString("BAIDULNG"));
            _obj.setGeohas(arr.getString("GEOHAS"));
            _obj.setFromtype(arr.getInt("FROMTYPE"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setKeyorder(arr.getInt("KEYORDER"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOKEYTORESULT返回的查询DataRow创建一个AIHAOKEYTORESULTEntity对象
* @param AIHAOKEYTORESULT row
* @returnAIHAOKEYTORESULTList对象
* @throws Exception 
*/
public List< aihaokeytoresult_Dao> get_aihaokeytoresult_All(String strWhere) throws Exception{
         List<aihaokeytoresult_Dao> _list = new ArrayList<aihaokeytoresult_Dao>();
		 String sqlStr = "{ call AIHAOKEYTORESULT_PRO.GetAIHAOKEYTORESULTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaokeytoresult_Dao _obj = new aihaokeytoresult_Dao();
            _obj.setKeyid(arr.getInt("KEYID"));
            _obj.setKeynames(arr.getString("KEYNAMES"));
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setDistrictcode(arr.getInt("DISTRICTCODE"));
            _obj.setDistrictname(arr.getString("DISTRICTNAME"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantphone(arr.getString("MERCHANTPHONE"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setGooglelat(arr.getString("GOOGLELAT"));
            _obj.setGooglelng(arr.getString("GOOGLELNG"));
            _obj.setBaidulat(arr.getString("BAIDULAT"));
            _obj.setBaidulng(arr.getString("BAIDULNG"));
            _obj.setGeohas(arr.getString("GEOHAS"));
            _obj.setFromtype(arr.getInt("FROMTYPE"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setKeyorder(arr.getInt("KEYORDER"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOKEYTORESULT返回 分页数据
* @param AIHAOKEYTORESULT row
* @returnAIHAOKEYTORESULTList对象
* @throws Exception 
*/
public List<aihaokeytoresult_Dao> get_aihaokeytoresult_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaokeytoresult_Dao> _list = new ArrayList<aihaokeytoresult_Dao>();
		String sqlStr = "{ call AIHAOKEYTORESULT_PRO.GetAIHAOKEYTORESULTPage(?,?,?,?,?,?)}";
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
				aihaokeytoresult_Dao _obj = new aihaokeytoresult_Dao();
            _obj.setKeyid(arr.getInt("KEYID"));
            _obj.setKeynames(arr.getString("KEYNAMES"));
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setDistrictcode(arr.getInt("DISTRICTCODE"));
            _obj.setDistrictname(arr.getString("DISTRICTNAME"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantphone(arr.getString("MERCHANTPHONE"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setGooglelat(arr.getString("GOOGLELAT"));
            _obj.setGooglelng(arr.getString("GOOGLELNG"));
            _obj.setBaidulat(arr.getString("BAIDULAT"));
            _obj.setBaidulng(arr.getString("BAIDULNG"));
            _obj.setGeohas(arr.getString("GEOHAS"));
            _obj.setFromtype(arr.getInt("FROMTYPE"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setKeyorder(arr.getInt("KEYORDER"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOKEYTORESULT返回的查询DataRow创建一个AIHAOKEYTORESULTEntity对象
* @param AIHAOKEYTORESULT row
* @returnAIHAOKEYTORESULTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaokeytoresult_Dao> get_aihaokeytoresult_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaokeytoresultstrWhere") == null) {
			Dictionary<Integer, aihaokeytoresult_Dao> _dic = new Hashtable<Integer, aihaokeytoresult_Dao>();
			List<aihaokeytoresult_Dao> _list = new ArrayList<aihaokeytoresult_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getKeyid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaokeytoresult", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaokeytoresult_Dao> _dic = (Dictionary<Integer, aihaokeytoresult_Dao>) classFactory
					.cacheGet("dicaihaokeytoresultstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOKEYTORESULT字段加一
* @param FieldName
* @param sid
*/
public int create_aihaokeytoresult_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOKEYTORESULT_PRO.UpdateFieldAIHAOKEYTORESULT(?,?)}";
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
* 更新AIHAOKEYTORESULTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaokeytoresult_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOKEYTORESULT_PRO.UpdateFieldAIHAOKEYTORESULTV(?,?,?)}";
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
* 更新AIHAOKEYTORESULTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaokeytoresult_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOKEYTORESULT_PRO.UpdateFieldAIHAOKEYTORESULTU(?,?,?)}";
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
