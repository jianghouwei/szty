/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumsoftwareadapter.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumsoftwareadapter_Dao;
import com.szty.aihao.core.mvnforumsoftwareadapter_core;
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
*@MVNFORUMSOFTWAREADAPTER数据接口
*@作者：宋春林 
*/
public class mvnforumsoftwareadapter_impl implements mvnforumsoftwareadapter_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumsoftwareadapter_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSOFTWAREADAPTER实体
* @return 新插入记录的编号
*/
public int insert_mvnforumsoftwareadapter(mvnforumsoftwareadapter_Dao _MVNFORUMSOFTWAREADAPTERModel)  throws Exception{
         String sqlStr = "{call MVNFORUMSOFTWAREADAPTER_PRO.InsertMVNFORUMSOFTWAREADAPTER(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREADAPTERModel.getAdapterid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREADAPTERModel.getSoftwareid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREADAPTERModel.getMobilemanufacturer());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREADAPTERModel.getOperatingsystem());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREADAPTERModel.getMobiletype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREADAPTERModel.getMobilescreen());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREADAPTERModel.getAdapterurl());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREADAPTERModel.getAdapterfilesize());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSOFTWAREADAPTERModel.getAdaptercreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREADAPTERModel.getViewcount());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREADAPTERModel.getDownloadcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSOFTWAREADAPTER
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumsoftwareadapter(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMSOFTWAREADAPTER_PRO.InsertMVNFORUMSOFTWAREADAPTER(?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[11];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_para[8]));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMSOFTWAREADAPTER实体
* @return 影响的行数
*/
public int update_mvnforumsoftwareadapter(mvnforumsoftwareadapter_Dao _MVNFORUMSOFTWAREADAPTERModel)  throws Exception{
        String sqlStr = "{call MVNFORUMSOFTWAREADAPTER_PRO.UpdateMVNFORUMSOFTWAREADAPTER(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREADAPTERModel.getAdapterid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREADAPTERModel.getSoftwareid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREADAPTERModel.getMobilemanufacturer());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREADAPTERModel.getOperatingsystem());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREADAPTERModel.getMobiletype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREADAPTERModel.getMobilescreen());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREADAPTERModel.getAdapterurl());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREADAPTERModel.getAdapterfilesize());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSOFTWAREADAPTERModel.getAdaptercreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREADAPTERModel.getViewcount());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREADAPTERModel.getDownloadcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMSOFTWAREADAPTER中的一条记录
* @param MVNFORUMSOFTWAREADAPTER实体
* @return 新插入记录的编号
*/
public int delete_mvnforumsoftwareadapter(int Adapterid)  throws Exception{
        String sqlStr = "{call MVNFORUMSOFTWAREADAPTER_PRO.DeleteMVNFORUMSOFTWAREADAPTER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Adapterid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumsoftwareadapter 数据实体
* @param Adapterid">Adapterid
* @return<mvnforumsoftwareadapter 数据实体
* @throws Exception 
*/
public mvnforumsoftwareadapter_Dao get_mvnforumsoftwareadapterDao(int Adapterid) throws Exception{
         String sqlStr = "{ call MVNFORUMSOFTWAREADAPTER_PRO.GetMVNFORUMSOFTWAREADAPTEREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Adapterid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsoftwareadapter_Dao _obj = new mvnforumsoftwareadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setSoftwareid(arr.getInt("SOFTWAREID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setAdapterurl(arr.getString("ADAPTERURL"));
            _obj.setAdapterfilesize(arr.getInt("ADAPTERFILESIZE"));
             try{_obj.setAdaptercreationdate(dateformat.parse(arr.getString("ADAPTERCREATIONDATE")));}catch(Exception ce){_obj.setAdaptercreationdate((new Date()));}
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMSOFTWAREADAPTER返回的查询DataRow创建一个MVNFORUMSOFTWAREADAPTEREntity对象
* @param MVNFORUMSOFTWAREADAPTER row
* @returnMVNFORUMSOFTWAREADAPTERList对象
* @throws Exception 
*/
public List<mvnforumsoftwareadapter_Dao> get_mvnforumsoftwareadapter_All() throws Exception{
        List<mvnforumsoftwareadapter_Dao> _list = new ArrayList<mvnforumsoftwareadapter_Dao>();
		String sqlStr = "{ call MVNFORUMSOFTWAREADAPTER_PRO.GetMVNFORUMSOFTWAREADAPTER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsoftwareadapter_Dao _obj = new mvnforumsoftwareadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setSoftwareid(arr.getInt("SOFTWAREID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setAdapterurl(arr.getString("ADAPTERURL"));
            _obj.setAdapterfilesize(arr.getInt("ADAPTERFILESIZE"));
            try{_obj.setAdaptercreationdate(dateformat.parse(arr.getString("ADAPTERCREATIONDATE")));}catch(Exception ce){_obj.setAdaptercreationdate((new Date()));}
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMSOFTWAREADAPTER返回的查询DataRow创建一个MVNFORUMSOFTWAREADAPTEREntity对象
* @param MVNFORUMSOFTWAREADAPTER row
* @returnMVNFORUMSOFTWAREADAPTERList对象
* @throws Exception 
*/
public List< mvnforumsoftwareadapter_Dao> get_mvnforumsoftwareadapter_All(String strWhere) throws Exception{
         List<mvnforumsoftwareadapter_Dao> _list = new ArrayList<mvnforumsoftwareadapter_Dao>();
		 String sqlStr = "{ call MVNFORUMSOFTWAREADAPTER_PRO.GetMVNFORUMSOFTWAREADAPTERWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumsoftwareadapter_Dao _obj = new mvnforumsoftwareadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setSoftwareid(arr.getInt("SOFTWAREID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setAdapterurl(arr.getString("ADAPTERURL"));
            _obj.setAdapterfilesize(arr.getInt("ADAPTERFILESIZE"));
           try{_obj.setAdaptercreationdate(dateformat.parse(arr.getString("ADAPTERCREATIONDATE")));}catch(Exception ce){_obj.setAdaptercreationdate((new Date()));}
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMSOFTWAREADAPTER返回 分页数据
* @param MVNFORUMSOFTWAREADAPTER row
* @returnMVNFORUMSOFTWAREADAPTERList对象
* @throws Exception 
*/
public List<mvnforumsoftwareadapter_Dao> get_mvnforumsoftwareadapter_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumsoftwareadapter_Dao> _list = new ArrayList<mvnforumsoftwareadapter_Dao>();
		String sqlStr = "{ call MVNFORUMSOFTWAREADAPTER_PRO.GetMVNFORUMSOFTWAREADAPTERPage(?,?,?,?,?,?)}";
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
				mvnforumsoftwareadapter_Dao _obj = new mvnforumsoftwareadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setSoftwareid(arr.getInt("SOFTWAREID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setAdapterurl(arr.getString("ADAPTERURL"));
            _obj.setAdapterfilesize(arr.getInt("ADAPTERFILESIZE"));
            try{_obj.setAdaptercreationdate(dateformat.parse(arr.getString("ADAPTERCREATIONDATE")));}catch(Exception ce){_obj.setAdaptercreationdate((new Date()));}
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMSOFTWAREADAPTER返回的查询DataRow创建一个MVNFORUMSOFTWAREADAPTEREntity对象
* @param MVNFORUMSOFTWAREADAPTER row
* @returnMVNFORUMSOFTWAREADAPTERDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumsoftwareadapter_Dao> get_mvnforumsoftwareadapter_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumsoftwareadapterstrWhere") == null) {
			Dictionary<Integer, mvnforumsoftwareadapter_Dao> _dic = new Hashtable<Integer, mvnforumsoftwareadapter_Dao>();
			List<mvnforumsoftwareadapter_Dao> _list = new ArrayList<mvnforumsoftwareadapter_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getAdapterid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumsoftwareadapter", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumsoftwareadapter_Dao> _dic = (Dictionary<Integer, mvnforumsoftwareadapter_Dao>) classFactory
					.cacheGet("dicmvnforumsoftwareadapterstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMSOFTWAREADAPTER字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumsoftwareadapter_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMSOFTWAREADAPTER_PRO.UpdateFieldMVNFORUMSOFTWAREADAPTER(?,?)}";
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
* 更新MVNFORUMSOFTWAREADAPTERInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumsoftwareadapter_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMSOFTWAREADAPTER_PRO.UpdateFieldMVNFORUMSOFTWAREADAPTERV(?,?,?)}";
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
* 更新MVNFORUMSOFTWAREADAPTERIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumsoftwareadapter_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMSOFTWAREADAPTER_PRO.UpdateFieldMVNFORUMSOFTWAREADAPTERU(?,?,?)}";
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
