/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumgameadapter.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumgameadapter_Dao;
import com.szty.aihao.core.mvnforumgameadapter_core;
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
*@MVNFORUMGAMEADAPTER数据接口
*@作者：宋春林 
*/
public class mvnforumgameadapter_impl implements mvnforumgameadapter_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumgameadapter_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMGAMEADAPTER实体
* @return 新插入记录的编号
*/
public int insert_mvnforumgameadapter(mvnforumgameadapter_Dao _MVNFORUMGAMEADAPTERModel)  throws Exception{
         String sqlStr = "{call MVNFORUMGAMEADAPTER_PRO.InsertMVNFORUMGAMEADAPTER(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMGAMEADAPTERModel.getAdapterid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEADAPTERModel.getGameid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getMobilemanufacturer());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getOperatingsystem());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getMobileseries());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getMobiletype());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getMobilescreen());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getAdapterfile());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEADAPTERModel.getAdapterfilesize());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMGAMEADAPTERModel.getAdaptercreationdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEADAPTERModel.getViewcount());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEADAPTERModel.getDownloadcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMGAMEADAPTER
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumgameadapter(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMGAMEADAPTER_PRO.InsertMVNFORUMGAMEADAPTER(?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[12];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_para[9]));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMGAMEADAPTER实体
* @return 影响的行数
*/
public int update_mvnforumgameadapter(mvnforumgameadapter_Dao _MVNFORUMGAMEADAPTERModel)  throws Exception{
        String sqlStr = "{call MVNFORUMGAMEADAPTER_PRO.UpdateMVNFORUMGAMEADAPTER(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEADAPTERModel.getAdapterid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEADAPTERModel.getGameid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getMobilemanufacturer());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getOperatingsystem());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getMobileseries());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getMobiletype());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getMobilescreen());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEADAPTERModel.getAdapterfile());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEADAPTERModel.getAdapterfilesize());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMGAMEADAPTERModel.getAdaptercreationdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEADAPTERModel.getViewcount());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEADAPTERModel.getDownloadcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMGAMEADAPTER中的一条记录
* @param MVNFORUMGAMEADAPTER实体
* @return 新插入记录的编号
*/
public int delete_mvnforumgameadapter(int Adapterid)  throws Exception{
        String sqlStr = "{call MVNFORUMGAMEADAPTER_PRO.DeleteMVNFORUMGAMEADAPTER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Adapterid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumgameadapter 数据实体
* @param Adapterid">Adapterid
* @return<mvnforumgameadapter 数据实体
* @throws Exception 
*/
public mvnforumgameadapter_Dao get_mvnforumgameadapterDao(int Adapterid) throws Exception{
         String sqlStr = "{ call MVNFORUMGAMEADAPTER_PRO.GetMVNFORUMGAMEADAPTEREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Adapterid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumgameadapter_Dao _obj = new mvnforumgameadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobileseries(arr.getString("MOBILESERIES"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setAdapterfile(arr.getString("ADAPTERFILE"));
            _obj.setAdapterfilesize(arr.getInt("ADAPTERFILESIZE"));
             try{_obj.setAdaptercreationdate(dateformat.parse(arr.getString("ADAPTERCREATIONDATE")));}catch(Exception ce){_obj.setAdaptercreationdate((new Date()));}
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMGAMEADAPTER返回的查询DataRow创建一个MVNFORUMGAMEADAPTEREntity对象
* @param MVNFORUMGAMEADAPTER row
* @returnMVNFORUMGAMEADAPTERList对象
* @throws Exception 
*/
public List<mvnforumgameadapter_Dao> get_mvnforumgameadapter_All() throws Exception{
        List<mvnforumgameadapter_Dao> _list = new ArrayList<mvnforumgameadapter_Dao>();
		String sqlStr = "{ call MVNFORUMGAMEADAPTER_PRO.GetMVNFORUMGAMEADAPTER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumgameadapter_Dao _obj = new mvnforumgameadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobileseries(arr.getString("MOBILESERIES"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setAdapterfile(arr.getString("ADAPTERFILE"));
            _obj.setAdapterfilesize(arr.getInt("ADAPTERFILESIZE"));
            try{_obj.setAdaptercreationdate(dateformat.parse(arr.getString("ADAPTERCREATIONDATE")));}catch(Exception ce){_obj.setAdaptercreationdate((new Date()));}
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMGAMEADAPTER返回的查询DataRow创建一个MVNFORUMGAMEADAPTEREntity对象
* @param MVNFORUMGAMEADAPTER row
* @returnMVNFORUMGAMEADAPTERList对象
* @throws Exception 
*/
public List< mvnforumgameadapter_Dao> get_mvnforumgameadapter_All(String strWhere) throws Exception{
         List<mvnforumgameadapter_Dao> _list = new ArrayList<mvnforumgameadapter_Dao>();
		 String sqlStr = "{ call MVNFORUMGAMEADAPTER_PRO.GetMVNFORUMGAMEADAPTERWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumgameadapter_Dao _obj = new mvnforumgameadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobileseries(arr.getString("MOBILESERIES"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setAdapterfile(arr.getString("ADAPTERFILE"));
            _obj.setAdapterfilesize(arr.getInt("ADAPTERFILESIZE"));
           try{_obj.setAdaptercreationdate(dateformat.parse(arr.getString("ADAPTERCREATIONDATE")));}catch(Exception ce){_obj.setAdaptercreationdate((new Date()));}
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMGAMEADAPTER返回 分页数据
* @param MVNFORUMGAMEADAPTER row
* @returnMVNFORUMGAMEADAPTERList对象
* @throws Exception 
*/
public List<mvnforumgameadapter_Dao> get_mvnforumgameadapter_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumgameadapter_Dao> _list = new ArrayList<mvnforumgameadapter_Dao>();
		String sqlStr = "{ call MVNFORUMGAMEADAPTER_PRO.GetMVNFORUMGAMEADAPTERPage(?,?,?,?,?,?)}";
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
				mvnforumgameadapter_Dao _obj = new mvnforumgameadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setMobilemanufacturer(arr.getString("MOBILEMANUFACTURER"));
            _obj.setOperatingsystem(arr.getString("OPERATINGSYSTEM"));
            _obj.setMobileseries(arr.getString("MOBILESERIES"));
            _obj.setMobiletype(arr.getString("MOBILETYPE"));
            _obj.setMobilescreen(arr.getString("MOBILESCREEN"));
            _obj.setAdapterfile(arr.getString("ADAPTERFILE"));
            _obj.setAdapterfilesize(arr.getInt("ADAPTERFILESIZE"));
            try{_obj.setAdaptercreationdate(dateformat.parse(arr.getString("ADAPTERCREATIONDATE")));}catch(Exception ce){_obj.setAdaptercreationdate((new Date()));}
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMGAMEADAPTER返回的查询DataRow创建一个MVNFORUMGAMEADAPTEREntity对象
* @param MVNFORUMGAMEADAPTER row
* @returnMVNFORUMGAMEADAPTERDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumgameadapter_Dao> get_mvnforumgameadapter_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumgameadapterstrWhere") == null) {
			Dictionary<Integer, mvnforumgameadapter_Dao> _dic = new Hashtable<Integer, mvnforumgameadapter_Dao>();
			List<mvnforumgameadapter_Dao> _list = new ArrayList<mvnforumgameadapter_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getAdapterid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumgameadapter", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumgameadapter_Dao> _dic = (Dictionary<Integer, mvnforumgameadapter_Dao>) classFactory
					.cacheGet("dicmvnforumgameadapterstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMGAMEADAPTER字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumgameadapter_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMGAMEADAPTER_PRO.UpdateFieldMVNFORUMGAMEADAPTER(?,?)}";
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
* 更新MVNFORUMGAMEADAPTERInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumgameadapter_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMGAMEADAPTER_PRO.UpdateFieldMVNFORUMGAMEADAPTERV(?,?,?)}";
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
* 更新MVNFORUMGAMEADAPTERIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumgameadapter_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMGAMEADAPTER_PRO.UpdateFieldMVNFORUMGAMEADAPTERU(?,?,?)}";
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
