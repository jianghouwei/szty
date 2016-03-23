/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumblogfavorites.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumblogfavorites_Dao;
import com.szty.aihao.core.mvnforumblogfavorites_core;
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
*@MVNFORUMBLOGFAVORITES数据接口
*@作者：宋春林 
*/
public class mvnforumblogfavorites_impl implements mvnforumblogfavorites_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumblogfavorites_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBLOGFAVORITES实体
* @return 新插入记录的编号
*/
public int insert_mvnforumblogfavorites(mvnforumblogfavorites_Dao _MVNFORUMBLOGFAVORITESModel)  throws Exception{
         String sqlStr = "{call MVNFORUMBLOGFAVORITES_PRO.InsertMVNFORUMBLOGFAVORITES(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMBLOGFAVORITESModel.getFavoriteid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGFAVORITESModel.getBlogid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGFAVORITESModel.getFavoriteownername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBLOGFAVORITESModel.getFavoritecreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBLOGFAVORITES
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumblogfavorites(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMBLOGFAVORITES_PRO.InsertMVNFORUMBLOGFAVORITES(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMBLOGFAVORITES实体
* @return 影响的行数
*/
public int update_mvnforumblogfavorites(mvnforumblogfavorites_Dao _MVNFORUMBLOGFAVORITESModel)  throws Exception{
        String sqlStr = "{call MVNFORUMBLOGFAVORITES_PRO.UpdateMVNFORUMBLOGFAVORITES(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGFAVORITESModel.getFavoriteid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGFAVORITESModel.getBlogid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGFAVORITESModel.getFavoriteownername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBLOGFAVORITESModel.getFavoritecreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMBLOGFAVORITES中的一条记录
* @param MVNFORUMBLOGFAVORITES实体
* @return 新插入记录的编号
*/
public int delete_mvnforumblogfavorites(int Favoriteid)  throws Exception{
        String sqlStr = "{call MVNFORUMBLOGFAVORITES_PRO.DeleteMVNFORUMBLOGFAVORITES(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Favoriteid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumblogfavorites 数据实体
* @param Favoriteid">Favoriteid
* @return<mvnforumblogfavorites 数据实体
* @throws Exception 
*/
public mvnforumblogfavorites_Dao get_mvnforumblogfavoritesDao(int Favoriteid) throws Exception{
         String sqlStr = "{ call MVNFORUMBLOGFAVORITES_PRO.GetMVNFORUMBLOGFAVORITESEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Favoriteid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumblogfavorites_Dao _obj = new mvnforumblogfavorites_Dao();
            _obj.setFavoriteid(arr.getInt("FAVORITEID"));
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setFavoriteownername(arr.getString("FAVORITEOWNERNAME"));
             try{_obj.setFavoritecreationdate(dateformat.parse(arr.getString("FAVORITECREATIONDATE")));}catch(Exception ce){_obj.setFavoritecreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMBLOGFAVORITES返回的查询DataRow创建一个MVNFORUMBLOGFAVORITESEntity对象
* @param MVNFORUMBLOGFAVORITES row
* @returnMVNFORUMBLOGFAVORITESList对象
* @throws Exception 
*/
public List<mvnforumblogfavorites_Dao> get_mvnforumblogfavorites_All() throws Exception{
        List<mvnforumblogfavorites_Dao> _list = new ArrayList<mvnforumblogfavorites_Dao>();
		String sqlStr = "{ call MVNFORUMBLOGFAVORITES_PRO.GetMVNFORUMBLOGFAVORITES(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumblogfavorites_Dao _obj = new mvnforumblogfavorites_Dao();
            _obj.setFavoriteid(arr.getInt("FAVORITEID"));
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setFavoriteownername(arr.getString("FAVORITEOWNERNAME"));
            try{_obj.setFavoritecreationdate(dateformat.parse(arr.getString("FAVORITECREATIONDATE")));}catch(Exception ce){_obj.setFavoritecreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMBLOGFAVORITES返回的查询DataRow创建一个MVNFORUMBLOGFAVORITESEntity对象
* @param MVNFORUMBLOGFAVORITES row
* @returnMVNFORUMBLOGFAVORITESList对象
* @throws Exception 
*/
public List< mvnforumblogfavorites_Dao> get_mvnforumblogfavorites_All(String strWhere) throws Exception{
         List<mvnforumblogfavorites_Dao> _list = new ArrayList<mvnforumblogfavorites_Dao>();
		 String sqlStr = "{ call MVNFORUMBLOGFAVORITES_PRO.GetMVNFORUMBLOGFAVORITESWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumblogfavorites_Dao _obj = new mvnforumblogfavorites_Dao();
            _obj.setFavoriteid(arr.getInt("FAVORITEID"));
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setFavoriteownername(arr.getString("FAVORITEOWNERNAME"));
           try{_obj.setFavoritecreationdate(dateformat.parse(arr.getString("FAVORITECREATIONDATE")));}catch(Exception ce){_obj.setFavoritecreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMBLOGFAVORITES返回 分页数据
* @param MVNFORUMBLOGFAVORITES row
* @returnMVNFORUMBLOGFAVORITESList对象
* @throws Exception 
*/
public List<mvnforumblogfavorites_Dao> get_mvnforumblogfavorites_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumblogfavorites_Dao> _list = new ArrayList<mvnforumblogfavorites_Dao>();
		String sqlStr = "{ call MVNFORUMBLOGFAVORITES_PRO.GetMVNFORUMBLOGFAVORITESPage(?,?,?,?,?,?)}";
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
				mvnforumblogfavorites_Dao _obj = new mvnforumblogfavorites_Dao();
            _obj.setFavoriteid(arr.getInt("FAVORITEID"));
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setFavoriteownername(arr.getString("FAVORITEOWNERNAME"));
            try{_obj.setFavoritecreationdate(dateformat.parse(arr.getString("FAVORITECREATIONDATE")));}catch(Exception ce){_obj.setFavoritecreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMBLOGFAVORITES返回的查询DataRow创建一个MVNFORUMBLOGFAVORITESEntity对象
* @param MVNFORUMBLOGFAVORITES row
* @returnMVNFORUMBLOGFAVORITESDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumblogfavorites_Dao> get_mvnforumblogfavorites_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumblogfavoritesstrWhere") == null) {
			Dictionary<Integer, mvnforumblogfavorites_Dao> _dic = new Hashtable<Integer, mvnforumblogfavorites_Dao>();
			List<mvnforumblogfavorites_Dao> _list = new ArrayList<mvnforumblogfavorites_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getFavoriteid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumblogfavorites", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumblogfavorites_Dao> _dic = (Dictionary<Integer, mvnforumblogfavorites_Dao>) classFactory
					.cacheGet("dicmvnforumblogfavoritesstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMBLOGFAVORITES字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumblogfavorites_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMBLOGFAVORITES_PRO.UpdateFieldMVNFORUMBLOGFAVORITES(?,?)}";
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
* 更新MVNFORUMBLOGFAVORITESInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumblogfavorites_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMBLOGFAVORITES_PRO.UpdateFieldMVNFORUMBLOGFAVORITESV(?,?,?)}";
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
* 更新MVNFORUMBLOGFAVORITESIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumblogfavorites_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMBLOGFAVORITES_PRO.UpdateFieldMVNFORUMBLOGFAVORITESU(?,?,?)}";
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
