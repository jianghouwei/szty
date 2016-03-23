/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumblogreview.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumblogreview_Dao;
import com.szty.aihao.core.mvnforumblogreview_core;
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
*@MVNFORUMBLOGREVIEW数据接口
*@作者：宋春林 
*/
public class mvnforumblogreview_impl implements mvnforumblogreview_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumblogreview_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBLOGREVIEW实体
* @return 新插入记录的编号
*/
public int insert_mvnforumblogreview(mvnforumblogreview_Dao _MVNFORUMBLOGREVIEWModel)  throws Exception{
         String sqlStr = "{call MVNFORUMBLOGREVIEW_PRO.InsertMVNFORUMBLOGREVIEW(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMBLOGREVIEWModel.getReviewid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGREVIEWModel.getBlogid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGREVIEWModel.getReviewownername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGREVIEWModel.getReviewcontent());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBLOGREVIEWModel.getReviewcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBLOGREVIEW
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumblogreview(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMBLOGREVIEW_PRO.InsertMVNFORUMBLOGREVIEW(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMBLOGREVIEW实体
* @return 影响的行数
*/
public int update_mvnforumblogreview(mvnforumblogreview_Dao _MVNFORUMBLOGREVIEWModel)  throws Exception{
        String sqlStr = "{call MVNFORUMBLOGREVIEW_PRO.UpdateMVNFORUMBLOGREVIEW(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGREVIEWModel.getReviewid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMBLOGREVIEWModel.getBlogid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGREVIEWModel.getReviewownername());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBLOGREVIEWModel.getReviewcontent());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBLOGREVIEWModel.getReviewcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMBLOGREVIEW中的一条记录
* @param MVNFORUMBLOGREVIEW实体
* @return 新插入记录的编号
*/
public int delete_mvnforumblogreview(int Reviewid)  throws Exception{
        String sqlStr = "{call MVNFORUMBLOGREVIEW_PRO.DeleteMVNFORUMBLOGREVIEW(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Reviewid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumblogreview 数据实体
* @param Reviewid">Reviewid
* @return<mvnforumblogreview 数据实体
* @throws Exception 
*/
public mvnforumblogreview_Dao get_mvnforumblogreviewDao(int Reviewid) throws Exception{
         String sqlStr = "{ call MVNFORUMBLOGREVIEW_PRO.GetMVNFORUMBLOGREVIEWEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Reviewid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumblogreview_Dao _obj = new mvnforumblogreview_Dao();
            _obj.setReviewid(arr.getInt("REVIEWID"));
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setReviewownername(arr.getString("REVIEWOWNERNAME"));
            _obj.setReviewcontent(arr.getString("REVIEWCONTENT"));
             try{_obj.setReviewcreationdate(dateformat.parse(arr.getString("REVIEWCREATIONDATE")));}catch(Exception ce){_obj.setReviewcreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMBLOGREVIEW返回的查询DataRow创建一个MVNFORUMBLOGREVIEWEntity对象
* @param MVNFORUMBLOGREVIEW row
* @returnMVNFORUMBLOGREVIEWList对象
* @throws Exception 
*/
public List<mvnforumblogreview_Dao> get_mvnforumblogreview_All() throws Exception{
        List<mvnforumblogreview_Dao> _list = new ArrayList<mvnforumblogreview_Dao>();
		String sqlStr = "{ call MVNFORUMBLOGREVIEW_PRO.GetMVNFORUMBLOGREVIEW(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumblogreview_Dao _obj = new mvnforumblogreview_Dao();
            _obj.setReviewid(arr.getInt("REVIEWID"));
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setReviewownername(arr.getString("REVIEWOWNERNAME"));
            _obj.setReviewcontent(arr.getString("REVIEWCONTENT"));
            try{_obj.setReviewcreationdate(dateformat.parse(arr.getString("REVIEWCREATIONDATE")));}catch(Exception ce){_obj.setReviewcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMBLOGREVIEW返回的查询DataRow创建一个MVNFORUMBLOGREVIEWEntity对象
* @param MVNFORUMBLOGREVIEW row
* @returnMVNFORUMBLOGREVIEWList对象
* @throws Exception 
*/
public List< mvnforumblogreview_Dao> get_mvnforumblogreview_All(String strWhere) throws Exception{
         List<mvnforumblogreview_Dao> _list = new ArrayList<mvnforumblogreview_Dao>();
		 String sqlStr = "{ call MVNFORUMBLOGREVIEW_PRO.GetMVNFORUMBLOGREVIEWWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumblogreview_Dao _obj = new mvnforumblogreview_Dao();
            _obj.setReviewid(arr.getInt("REVIEWID"));
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setReviewownername(arr.getString("REVIEWOWNERNAME"));
            _obj.setReviewcontent(arr.getString("REVIEWCONTENT"));
           try{_obj.setReviewcreationdate(dateformat.parse(arr.getString("REVIEWCREATIONDATE")));}catch(Exception ce){_obj.setReviewcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMBLOGREVIEW返回 分页数据
* @param MVNFORUMBLOGREVIEW row
* @returnMVNFORUMBLOGREVIEWList对象
* @throws Exception 
*/
public List<mvnforumblogreview_Dao> get_mvnforumblogreview_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumblogreview_Dao> _list = new ArrayList<mvnforumblogreview_Dao>();
		String sqlStr = "{ call MVNFORUMBLOGREVIEW_PRO.GetMVNFORUMBLOGREVIEWPage(?,?,?,?,?,?)}";
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
				mvnforumblogreview_Dao _obj = new mvnforumblogreview_Dao();
            _obj.setReviewid(arr.getInt("REVIEWID"));
            _obj.setBlogid(arr.getInt("BLOGID"));
            _obj.setReviewownername(arr.getString("REVIEWOWNERNAME"));
            _obj.setReviewcontent(arr.getString("REVIEWCONTENT"));
            try{_obj.setReviewcreationdate(dateformat.parse(arr.getString("REVIEWCREATIONDATE")));}catch(Exception ce){_obj.setReviewcreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMBLOGREVIEW返回的查询DataRow创建一个MVNFORUMBLOGREVIEWEntity对象
* @param MVNFORUMBLOGREVIEW row
* @returnMVNFORUMBLOGREVIEWDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumblogreview_Dao> get_mvnforumblogreview_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumblogreviewstrWhere") == null) {
			Dictionary<Integer, mvnforumblogreview_Dao> _dic = new Hashtable<Integer, mvnforumblogreview_Dao>();
			List<mvnforumblogreview_Dao> _list = new ArrayList<mvnforumblogreview_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getReviewid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumblogreview", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumblogreview_Dao> _dic = (Dictionary<Integer, mvnforumblogreview_Dao>) classFactory
					.cacheGet("dicmvnforumblogreviewstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMBLOGREVIEW字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumblogreview_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMBLOGREVIEW_PRO.UpdateFieldMVNFORUMBLOGREVIEW(?,?)}";
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
* 更新MVNFORUMBLOGREVIEWInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumblogreview_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMBLOGREVIEW_PRO.UpdateFieldMVNFORUMBLOGREVIEWV(?,?,?)}";
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
* 更新MVNFORUMBLOGREVIEWIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumblogreview_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMBLOGREVIEW_PRO.UpdateFieldMVNFORUMBLOGREVIEWU(?,?,?)}";
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
