/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTwitterphoto.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.twitterphoto_Dao;
import com.szty.aihao.core.twitterphoto_core;
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
*@TWITTERPHOTO数据接口
*@作者：宋春林 
*/
public class twitterphoto_impl implements twitterphoto_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(twitterphoto_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TWITTERPHOTO实体
* @return 新插入记录的编号
*/
public int insert_twitterphoto(twitterphoto_Dao _TWITTERPHOTOModel)  throws Exception{
         String sqlStr = "{call TWITTERPHOTO_PRO.InsertTWITTERPHOTO(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TWITTERPHOTOModel.getPhotoid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERPHOTOModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TWITTERPHOTOModel.getPhotoname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TWITTERPHOTOModel.getNotes());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_TWITTERPHOTOModel.getFileimg());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_TWITTERPHOTOModel.getState());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERPHOTOModel.getPhototime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TWITTERPHOTO
* @Object 
* @return 新插入记录的编号
*/
public int insert_twitterphoto(Object[] _para)  throws Exception{
      String sqlStr = "{call TWITTERPHOTO_PRO.InsertTWITTERPHOTO(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param TWITTERPHOTO实体
* @return 影响的行数
*/
public int update_twitterphoto(twitterphoto_Dao _TWITTERPHOTOModel)  throws Exception{
        String sqlStr = "{call TWITTERPHOTO_PRO.UpdateTWITTERPHOTO(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_TWITTERPHOTOModel.getPhotoid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_TWITTERPHOTOModel.getUserid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TWITTERPHOTOModel.getPhotoname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TWITTERPHOTOModel.getNotes());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_TWITTERPHOTOModel.getFileimg());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_TWITTERPHOTOModel.getState());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_TWITTERPHOTOModel.getPhototime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TWITTERPHOTO中的一条记录
* @param TWITTERPHOTO实体
* @return 新插入记录的编号
*/
public int delete_twitterphoto(int Photoid)  throws Exception{
        String sqlStr = "{call TWITTERPHOTO_PRO.DeleteTWITTERPHOTO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Photoid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 twitterphoto 数据实体
* @param Photoid">Photoid
* @return<twitterphoto 数据实体
* @throws Exception 
*/
public twitterphoto_Dao get_twitterphotoDao(int Photoid) throws Exception{
         String sqlStr = "{ call TWITTERPHOTO_PRO.GetTWITTERPHOTOEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Photoid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twitterphoto_Dao _obj = new twitterphoto_Dao();
            _obj.setPhotoid(arr.getInt("PHOTOID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setPhotoname(arr.getString("PHOTONAME"));
            _obj.setNotes(arr.getString("NOTES"));
            _obj.setFileimg(arr.getString("FILEIMG"));
            _obj.setState(arr.getInt("STATE"));
             try{_obj.setPhototime(dateformat.parse(arr.getString("PHOTOTIME")));}catch(Exception ce){_obj.setPhototime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据TWITTERPHOTO返回的查询DataRow创建一个TWITTERPHOTOEntity对象
* @param TWITTERPHOTO row
* @returnTWITTERPHOTOList对象
* @throws Exception 
*/
public List<twitterphoto_Dao> get_twitterphoto_All() throws Exception{
        List<twitterphoto_Dao> _list = new ArrayList<twitterphoto_Dao>();
		String sqlStr = "{ call TWITTERPHOTO_PRO.GetTWITTERPHOTO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			twitterphoto_Dao _obj = new twitterphoto_Dao();
            _obj.setPhotoid(arr.getInt("PHOTOID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setPhotoname(arr.getString("PHOTONAME"));
            _obj.setNotes(arr.getString("NOTES"));
            _obj.setFileimg(arr.getString("FILEIMG"));
            _obj.setState(arr.getInt("STATE"));
            try{_obj.setPhototime(dateformat.parse(arr.getString("PHOTOTIME")));}catch(Exception ce){_obj.setPhototime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TWITTERPHOTO返回的查询DataRow创建一个TWITTERPHOTOEntity对象
* @param TWITTERPHOTO row
* @returnTWITTERPHOTOList对象
* @throws Exception 
*/
public List< twitterphoto_Dao> get_twitterphoto_All(String strWhere) throws Exception{
         List<twitterphoto_Dao> _list = new ArrayList<twitterphoto_Dao>();
		 String sqlStr = "{ call TWITTERPHOTO_PRO.GetTWITTERPHOTOWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				twitterphoto_Dao _obj = new twitterphoto_Dao();
            _obj.setPhotoid(arr.getInt("PHOTOID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setPhotoname(arr.getString("PHOTONAME"));
            _obj.setNotes(arr.getString("NOTES"));
            _obj.setFileimg(arr.getString("FILEIMG"));
            _obj.setState(arr.getInt("STATE"));
           try{_obj.setPhototime(dateformat.parse(arr.getString("PHOTOTIME")));}catch(Exception ce){_obj.setPhototime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TWITTERPHOTO返回 分页数据
* @param TWITTERPHOTO row
* @returnTWITTERPHOTOList对象
* @throws Exception 
*/
public List<twitterphoto_Dao> get_twitterphoto_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<twitterphoto_Dao> _list = new ArrayList<twitterphoto_Dao>();
		String sqlStr = "{ call TWITTERPHOTO_PRO.GetTWITTERPHOTOPage(?,?,?,?,?,?)}";
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
				twitterphoto_Dao _obj = new twitterphoto_Dao();
            _obj.setPhotoid(arr.getInt("PHOTOID"));
            _obj.setUserid(arr.getInt("USERID"));
            _obj.setPhotoname(arr.getString("PHOTONAME"));
            _obj.setNotes(arr.getString("NOTES"));
            _obj.setFileimg(arr.getString("FILEIMG"));
            _obj.setState(arr.getInt("STATE"));
            try{_obj.setPhototime(dateformat.parse(arr.getString("PHOTOTIME")));}catch(Exception ce){_obj.setPhototime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TWITTERPHOTO返回的查询DataRow创建一个TWITTERPHOTOEntity对象
* @param TWITTERPHOTO row
* @returnTWITTERPHOTODictionary对象
* @throws Exception 
*/
public Dictionary<Integer, twitterphoto_Dao> get_twitterphoto_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictwitterphotostrWhere") == null) {
			Dictionary<Integer, twitterphoto_Dao> _dic = new Hashtable<Integer, twitterphoto_Dao>();
			List<twitterphoto_Dao> _list = new ArrayList<twitterphoto_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getPhotoid()), _list.get(i));
			}
			classFactory.cachePut("dictwitterphoto", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, twitterphoto_Dao> _dic = (Dictionary<Integer, twitterphoto_Dao>) classFactory
					.cacheGet("dictwitterphotostrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TWITTERPHOTO字段加一
* @param FieldName
* @param sid
*/
public int create_twitterphoto_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TWITTERPHOTO_PRO.UpdateFieldTWITTERPHOTO(?,?)}";
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
* 更新TWITTERPHOTOInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_twitterphoto_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TWITTERPHOTO_PRO.UpdateFieldTWITTERPHOTOV(?,?,?)}";
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
* 更新TWITTERPHOTOIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_twitterphoto_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TWITTERPHOTO_PRO.UpdateFieldTWITTERPHOTOU(?,?,?)}";
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
