/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumcontact.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumcontact_Dao;
import com.szty.aihao.core.mvnforumcontact_core;
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
*@MVNFORUMCONTACT数据接口
*@作者：宋春林 
*/
public class mvnforumcontact_impl implements mvnforumcontact_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumcontact_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMCONTACT实体
* @return 新插入记录的编号
*/
public int insert_mvnforumcontact(mvnforumcontact_Dao _MVNFORUMCONTACTModel)  throws Exception{
         String sqlStr = "{call MVNFORUMCONTACT_PRO.InsertMVNFORUMCONTACT(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMCONTACTModel.getContactid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getContactownername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getFriendsname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getFriendsmobile());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getFriendsemail());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getFamilyphone());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getCompanyname());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getCompanyphone());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getFaxphone());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMCONTACTModel.getContactcreationdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMCONTACTModel.getContactmodifieddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMCONTACT
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumcontact(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMCONTACT_PRO.InsertMVNFORUMCONTACT(?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[11];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_para[9]));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_para[10]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMCONTACT实体
* @return 影响的行数
*/
public int update_mvnforumcontact(mvnforumcontact_Dao _MVNFORUMCONTACTModel)  throws Exception{
        String sqlStr = "{call MVNFORUMCONTACT_PRO.UpdateMVNFORUMCONTACT(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMCONTACTModel.getContactid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getContactownername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getFriendsname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getFriendsmobile());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getFriendsemail());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getFamilyphone());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getCompanyname());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getCompanyphone());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCONTACTModel.getFaxphone());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMCONTACTModel.getContactcreationdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMCONTACTModel.getContactmodifieddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMCONTACT中的一条记录
* @param MVNFORUMCONTACT实体
* @return 新插入记录的编号
*/
public int delete_mvnforumcontact(int Contactid)  throws Exception{
        String sqlStr = "{call MVNFORUMCONTACT_PRO.DeleteMVNFORUMCONTACT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Contactid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumcontact 数据实体
* @param Contactid">Contactid
* @return<mvnforumcontact 数据实体
* @throws Exception 
*/
public mvnforumcontact_Dao get_mvnforumcontactDao(int Contactid) throws Exception{
         String sqlStr = "{ call MVNFORUMCONTACT_PRO.GetMVNFORUMCONTACTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Contactid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumcontact_Dao _obj = new mvnforumcontact_Dao();
            _obj.setContactid(arr.getInt("CONTACTID"));
            _obj.setContactownername(arr.getString("CONTACTOWNERNAME"));
            _obj.setFriendsname(arr.getString("FRIENDSNAME"));
            _obj.setFriendsmobile(arr.getString("FRIENDSMOBILE"));
            _obj.setFriendsemail(arr.getString("FRIENDSEMAIL"));
            _obj.setFamilyphone(arr.getString("FAMILYPHONE"));
            _obj.setCompanyname(arr.getString("COMPANYNAME"));
            _obj.setCompanyphone(arr.getString("COMPANYPHONE"));
            _obj.setFaxphone(arr.getString("FAXPHONE"));
             try{_obj.setContactcreationdate(dateformat.parse(arr.getString("CONTACTCREATIONDATE")));}catch(Exception ce){_obj.setContactcreationdate((new Date()));}
             try{_obj.setContactmodifieddate(dateformat.parse(arr.getString("CONTACTMODIFIEDDATE")));}catch(Exception ce){_obj.setContactmodifieddate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMCONTACT返回的查询DataRow创建一个MVNFORUMCONTACTEntity对象
* @param MVNFORUMCONTACT row
* @returnMVNFORUMCONTACTList对象
* @throws Exception 
*/
public List<mvnforumcontact_Dao> get_mvnforumcontact_All() throws Exception{
        List<mvnforumcontact_Dao> _list = new ArrayList<mvnforumcontact_Dao>();
		String sqlStr = "{ call MVNFORUMCONTACT_PRO.GetMVNFORUMCONTACT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumcontact_Dao _obj = new mvnforumcontact_Dao();
            _obj.setContactid(arr.getInt("CONTACTID"));
            _obj.setContactownername(arr.getString("CONTACTOWNERNAME"));
            _obj.setFriendsname(arr.getString("FRIENDSNAME"));
            _obj.setFriendsmobile(arr.getString("FRIENDSMOBILE"));
            _obj.setFriendsemail(arr.getString("FRIENDSEMAIL"));
            _obj.setFamilyphone(arr.getString("FAMILYPHONE"));
            _obj.setCompanyname(arr.getString("COMPANYNAME"));
            _obj.setCompanyphone(arr.getString("COMPANYPHONE"));
            _obj.setFaxphone(arr.getString("FAXPHONE"));
            try{_obj.setContactcreationdate(dateformat.parse(arr.getString("CONTACTCREATIONDATE")));}catch(Exception ce){_obj.setContactcreationdate((new Date()));}
            try{_obj.setContactmodifieddate(dateformat.parse(arr.getString("CONTACTMODIFIEDDATE")));}catch(Exception ce){_obj.setContactmodifieddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMCONTACT返回的查询DataRow创建一个MVNFORUMCONTACTEntity对象
* @param MVNFORUMCONTACT row
* @returnMVNFORUMCONTACTList对象
* @throws Exception 
*/
public List< mvnforumcontact_Dao> get_mvnforumcontact_All(String strWhere) throws Exception{
         List<mvnforumcontact_Dao> _list = new ArrayList<mvnforumcontact_Dao>();
		 String sqlStr = "{ call MVNFORUMCONTACT_PRO.GetMVNFORUMCONTACTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumcontact_Dao _obj = new mvnforumcontact_Dao();
            _obj.setContactid(arr.getInt("CONTACTID"));
            _obj.setContactownername(arr.getString("CONTACTOWNERNAME"));
            _obj.setFriendsname(arr.getString("FRIENDSNAME"));
            _obj.setFriendsmobile(arr.getString("FRIENDSMOBILE"));
            _obj.setFriendsemail(arr.getString("FRIENDSEMAIL"));
            _obj.setFamilyphone(arr.getString("FAMILYPHONE"));
            _obj.setCompanyname(arr.getString("COMPANYNAME"));
            _obj.setCompanyphone(arr.getString("COMPANYPHONE"));
            _obj.setFaxphone(arr.getString("FAXPHONE"));
           try{_obj.setContactcreationdate(dateformat.parse(arr.getString("CONTACTCREATIONDATE")));}catch(Exception ce){_obj.setContactcreationdate((new Date()));}
           try{_obj.setContactmodifieddate(dateformat.parse(arr.getString("CONTACTMODIFIEDDATE")));}catch(Exception ce){_obj.setContactmodifieddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMCONTACT返回 分页数据
* @param MVNFORUMCONTACT row
* @returnMVNFORUMCONTACTList对象
* @throws Exception 
*/
public List<mvnforumcontact_Dao> get_mvnforumcontact_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumcontact_Dao> _list = new ArrayList<mvnforumcontact_Dao>();
		String sqlStr = "{ call MVNFORUMCONTACT_PRO.GetMVNFORUMCONTACTPage(?,?,?,?,?,?)}";
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
				mvnforumcontact_Dao _obj = new mvnforumcontact_Dao();
            _obj.setContactid(arr.getInt("CONTACTID"));
            _obj.setContactownername(arr.getString("CONTACTOWNERNAME"));
            _obj.setFriendsname(arr.getString("FRIENDSNAME"));
            _obj.setFriendsmobile(arr.getString("FRIENDSMOBILE"));
            _obj.setFriendsemail(arr.getString("FRIENDSEMAIL"));
            _obj.setFamilyphone(arr.getString("FAMILYPHONE"));
            _obj.setCompanyname(arr.getString("COMPANYNAME"));
            _obj.setCompanyphone(arr.getString("COMPANYPHONE"));
            _obj.setFaxphone(arr.getString("FAXPHONE"));
            try{_obj.setContactcreationdate(dateformat.parse(arr.getString("CONTACTCREATIONDATE")));}catch(Exception ce){_obj.setContactcreationdate((new Date()));}
            try{_obj.setContactmodifieddate(dateformat.parse(arr.getString("CONTACTMODIFIEDDATE")));}catch(Exception ce){_obj.setContactmodifieddate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMCONTACT返回的查询DataRow创建一个MVNFORUMCONTACTEntity对象
* @param MVNFORUMCONTACT row
* @returnMVNFORUMCONTACTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumcontact_Dao> get_mvnforumcontact_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumcontactstrWhere") == null) {
			Dictionary<Integer, mvnforumcontact_Dao> _dic = new Hashtable<Integer, mvnforumcontact_Dao>();
			List<mvnforumcontact_Dao> _list = new ArrayList<mvnforumcontact_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getContactid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumcontact", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumcontact_Dao> _dic = (Dictionary<Integer, mvnforumcontact_Dao>) classFactory
					.cacheGet("dicmvnforumcontactstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMCONTACT字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumcontact_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMCONTACT_PRO.UpdateFieldMVNFORUMCONTACT(?,?)}";
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
* 更新MVNFORUMCONTACTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumcontact_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMCONTACT_PRO.UpdateFieldMVNFORUMCONTACTV(?,?,?)}";
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
* 更新MVNFORUMCONTACTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumcontact_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMCONTACT_PRO.UpdateFieldMVNFORUMCONTACTU(?,?,?)}";
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
