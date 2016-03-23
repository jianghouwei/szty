/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumwallpaperadapter.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumwallpaperadapter_Dao;
import com.szty.aihao.core.mvnforumwallpaperadapter_core;
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
*@MVNFORUMWALLPAPERADAPTER数据接口
*@作者：宋春林 
*/
public class mvnforumwallpaperadapter_impl implements mvnforumwallpaperadapter_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumwallpaperadapter_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMWALLPAPERADAPTER实体
* @return 新插入记录的编号
*/
public int insert_mvnforumwallpaperadapter(mvnforumwallpaperadapter_Dao _MVNFORUMWALLPAPERADAPTERModel)  throws Exception{
         String sqlStr = "{call MVNFORUMWALLPAPERADAPTER_PRO.InsertMVNFORUMWALLPAPERADAPTER(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMWALLPAPERADAPTERModel.getAdapterid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMWALLPAPERADAPTERModel.getWallpaperid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMWALLPAPERADAPTERModel.getAdaptername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMWALLPAPERADAPTERModel.getWallpaperscreen());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMWALLPAPERADAPTERModel.getWallpaperformat());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMWALLPAPERADAPTERModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMWALLPAPERADAPTER
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumwallpaperadapter(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMWALLPAPERADAPTER_PRO.InsertMVNFORUMWALLPAPERADAPTER(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMWALLPAPERADAPTER实体
* @return 影响的行数
*/
public int update_mvnforumwallpaperadapter(mvnforumwallpaperadapter_Dao _MVNFORUMWALLPAPERADAPTERModel)  throws Exception{
        String sqlStr = "{call MVNFORUMWALLPAPERADAPTER_PRO.UpdateMVNFORUMWALLPAPERADAPTER(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMWALLPAPERADAPTERModel.getAdapterid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMWALLPAPERADAPTERModel.getWallpaperid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMWALLPAPERADAPTERModel.getAdaptername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMWALLPAPERADAPTERModel.getWallpaperscreen());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMWALLPAPERADAPTERModel.getWallpaperformat());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMWALLPAPERADAPTERModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMWALLPAPERADAPTER中的一条记录
* @param MVNFORUMWALLPAPERADAPTER实体
* @return 新插入记录的编号
*/
public int delete_mvnforumwallpaperadapter(int Adapterid)  throws Exception{
        String sqlStr = "{call MVNFORUMWALLPAPERADAPTER_PRO.DeleteMVNFORUMWALLPAPERADAPTER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Adapterid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumwallpaperadapter 数据实体
* @param Adapterid">Adapterid
* @return<mvnforumwallpaperadapter 数据实体
* @throws Exception 
*/
public mvnforumwallpaperadapter_Dao get_mvnforumwallpaperadapterDao(int Adapterid) throws Exception{
         String sqlStr = "{ call MVNFORUMWALLPAPERADAPTER_PRO.GetMVNFORUMWALLPAPERADAPTEREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Adapterid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumwallpaperadapter_Dao _obj = new mvnforumwallpaperadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setWallpaperid(arr.getInt("WALLPAPERID"));
            _obj.setAdaptername(arr.getString("ADAPTERNAME"));
            _obj.setWallpaperscreen(arr.getString("WALLPAPERSCREEN"));
            _obj.setWallpaperformat(arr.getString("WALLPAPERFORMAT"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMWALLPAPERADAPTER返回的查询DataRow创建一个MVNFORUMWALLPAPERADAPTEREntity对象
* @param MVNFORUMWALLPAPERADAPTER row
* @returnMVNFORUMWALLPAPERADAPTERList对象
* @throws Exception 
*/
public List<mvnforumwallpaperadapter_Dao> get_mvnforumwallpaperadapter_All() throws Exception{
        List<mvnforumwallpaperadapter_Dao> _list = new ArrayList<mvnforumwallpaperadapter_Dao>();
		String sqlStr = "{ call MVNFORUMWALLPAPERADAPTER_PRO.GetMVNFORUMWALLPAPERADAPTER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumwallpaperadapter_Dao _obj = new mvnforumwallpaperadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setWallpaperid(arr.getInt("WALLPAPERID"));
            _obj.setAdaptername(arr.getString("ADAPTERNAME"));
            _obj.setWallpaperscreen(arr.getString("WALLPAPERSCREEN"));
            _obj.setWallpaperformat(arr.getString("WALLPAPERFORMAT"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMWALLPAPERADAPTER返回的查询DataRow创建一个MVNFORUMWALLPAPERADAPTEREntity对象
* @param MVNFORUMWALLPAPERADAPTER row
* @returnMVNFORUMWALLPAPERADAPTERList对象
* @throws Exception 
*/
public List< mvnforumwallpaperadapter_Dao> get_mvnforumwallpaperadapter_All(String strWhere) throws Exception{
         List<mvnforumwallpaperadapter_Dao> _list = new ArrayList<mvnforumwallpaperadapter_Dao>();
		 String sqlStr = "{ call MVNFORUMWALLPAPERADAPTER_PRO.GetMVNFORUMWALLPAPERADAPTERWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumwallpaperadapter_Dao _obj = new mvnforumwallpaperadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setWallpaperid(arr.getInt("WALLPAPERID"));
            _obj.setAdaptername(arr.getString("ADAPTERNAME"));
            _obj.setWallpaperscreen(arr.getString("WALLPAPERSCREEN"));
            _obj.setWallpaperformat(arr.getString("WALLPAPERFORMAT"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMWALLPAPERADAPTER返回 分页数据
* @param MVNFORUMWALLPAPERADAPTER row
* @returnMVNFORUMWALLPAPERADAPTERList对象
* @throws Exception 
*/
public List<mvnforumwallpaperadapter_Dao> get_mvnforumwallpaperadapter_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumwallpaperadapter_Dao> _list = new ArrayList<mvnforumwallpaperadapter_Dao>();
		String sqlStr = "{ call MVNFORUMWALLPAPERADAPTER_PRO.GetMVNFORUMWALLPAPERADAPTERPage(?,?,?,?,?,?)}";
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
				mvnforumwallpaperadapter_Dao _obj = new mvnforumwallpaperadapter_Dao();
            _obj.setAdapterid(arr.getInt("ADAPTERID"));
            _obj.setWallpaperid(arr.getInt("WALLPAPERID"));
            _obj.setAdaptername(arr.getString("ADAPTERNAME"));
            _obj.setWallpaperscreen(arr.getString("WALLPAPERSCREEN"));
            _obj.setWallpaperformat(arr.getString("WALLPAPERFORMAT"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMWALLPAPERADAPTER返回的查询DataRow创建一个MVNFORUMWALLPAPERADAPTEREntity对象
* @param MVNFORUMWALLPAPERADAPTER row
* @returnMVNFORUMWALLPAPERADAPTERDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumwallpaperadapter_Dao> get_mvnforumwallpaperadapter_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumwallpaperadapterstrWhere") == null) {
			Dictionary<Integer, mvnforumwallpaperadapter_Dao> _dic = new Hashtable<Integer, mvnforumwallpaperadapter_Dao>();
			List<mvnforumwallpaperadapter_Dao> _list = new ArrayList<mvnforumwallpaperadapter_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getAdapterid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumwallpaperadapter", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumwallpaperadapter_Dao> _dic = (Dictionary<Integer, mvnforumwallpaperadapter_Dao>) classFactory
					.cacheGet("dicmvnforumwallpaperadapterstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMWALLPAPERADAPTER字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumwallpaperadapter_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMWALLPAPERADAPTER_PRO.UpdateFieldMVNFORUMWALLPAPERADAPTER(?,?)}";
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
* 更新MVNFORUMWALLPAPERADAPTERInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumwallpaperadapter_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMWALLPAPERADAPTER_PRO.UpdateFieldMVNFORUMWALLPAPERADAPTERV(?,?,?)}";
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
* 更新MVNFORUMWALLPAPERADAPTERIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumwallpaperadapter_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMWALLPAPERADAPTER_PRO.UpdateFieldMVNFORUMWALLPAPERADAPTERU(?,?,?)}";
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
