/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumbookchapters.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumbookchapters_Dao;
import com.szty.aihao.core.mvnforumbookchapters_core;
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
*@MVNFORUMBOOKCHAPTERS数据接口
*@作者：宋春林 
*/
public class mvnforumbookchapters_impl implements mvnforumbookchapters_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumbookchapters_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBOOKCHAPTERS实体
* @return 新插入记录的编号
*/
public int insert_mvnforumbookchapters(mvnforumbookchapters_Dao _MVNFORUMBOOKCHAPTERSModel)  throws Exception{
         String sqlStr = "{call MVNFORUMBOOKCHAPTERS_PRO.InsertMVNFORUMBOOKCHAPTERS(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMBOOKCHAPTERSModel.getChaptersid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKCHAPTERSModel.getBookid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKCHAPTERSModel.getJarid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKCHAPTERSModel.getChaptersname());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKCHAPTERSModel.getChaptersfolder());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKCHAPTERSModel.getChaptersurl());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKCHAPTERSModel.getChapterssize());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKCHAPTERSModel.getSubvolumes());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKCHAPTERSModel.getChapterscreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKCHAPTERSModel.getChaptersmodifieddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBOOKCHAPTERS
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumbookchapters(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMBOOKCHAPTERS_PRO.InsertMVNFORUMBOOKCHAPTERS(?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[10];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_para[8]));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_para[9]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMBOOKCHAPTERS实体
* @return 影响的行数
*/
public int update_mvnforumbookchapters(mvnforumbookchapters_Dao _MVNFORUMBOOKCHAPTERSModel)  throws Exception{
        String sqlStr = "{call MVNFORUMBOOKCHAPTERS_PRO.UpdateMVNFORUMBOOKCHAPTERS(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKCHAPTERSModel.getChaptersid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKCHAPTERSModel.getBookid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKCHAPTERSModel.getJarid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKCHAPTERSModel.getChaptersname());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKCHAPTERSModel.getChaptersfolder());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKCHAPTERSModel.getChaptersurl());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKCHAPTERSModel.getChapterssize());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKCHAPTERSModel.getSubvolumes());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKCHAPTERSModel.getChapterscreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKCHAPTERSModel.getChaptersmodifieddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMBOOKCHAPTERS中的一条记录
* @param MVNFORUMBOOKCHAPTERS实体
* @return 新插入记录的编号
*/
public int delete_mvnforumbookchapters(int Chaptersid)  throws Exception{
        String sqlStr = "{call MVNFORUMBOOKCHAPTERS_PRO.DeleteMVNFORUMBOOKCHAPTERS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Chaptersid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumbookchapters 数据实体
* @param Chaptersid">Chaptersid
* @return<mvnforumbookchapters 数据实体
* @throws Exception 
*/
public mvnforumbookchapters_Dao get_mvnforumbookchaptersDao(int Chaptersid) throws Exception{
         String sqlStr = "{ call MVNFORUMBOOKCHAPTERS_PRO.GetMVNFORUMBOOKCHAPTERSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Chaptersid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumbookchapters_Dao _obj = new mvnforumbookchapters_Dao();
            _obj.setChaptersid(arr.getInt("CHAPTERSID"));
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setJarid(arr.getInt("JARID"));
            _obj.setChaptersname(arr.getString("CHAPTERSNAME"));
            _obj.setChaptersfolder(arr.getString("CHAPTERSFOLDER"));
            _obj.setChaptersurl(arr.getString("CHAPTERSURL"));
            _obj.setChapterssize(arr.getInt("CHAPTERSSIZE"));
            _obj.setSubvolumes(arr.getString("SUBVOLUMES"));
             try{_obj.setChapterscreationdate(dateformat.parse(arr.getString("CHAPTERSCREATIONDATE")));}catch(Exception ce){_obj.setChapterscreationdate((new Date()));}
             try{_obj.setChaptersmodifieddate(dateformat.parse(arr.getString("CHAPTERSMODIFIEDDATE")));}catch(Exception ce){_obj.setChaptersmodifieddate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMBOOKCHAPTERS返回的查询DataRow创建一个MVNFORUMBOOKCHAPTERSEntity对象
* @param MVNFORUMBOOKCHAPTERS row
* @returnMVNFORUMBOOKCHAPTERSList对象
* @throws Exception 
*/
public List<mvnforumbookchapters_Dao> get_mvnforumbookchapters_All() throws Exception{
        List<mvnforumbookchapters_Dao> _list = new ArrayList<mvnforumbookchapters_Dao>();
		String sqlStr = "{ call MVNFORUMBOOKCHAPTERS_PRO.GetMVNFORUMBOOKCHAPTERS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumbookchapters_Dao _obj = new mvnforumbookchapters_Dao();
            _obj.setChaptersid(arr.getInt("CHAPTERSID"));
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setJarid(arr.getInt("JARID"));
            _obj.setChaptersname(arr.getString("CHAPTERSNAME"));
            _obj.setChaptersfolder(arr.getString("CHAPTERSFOLDER"));
            _obj.setChaptersurl(arr.getString("CHAPTERSURL"));
            _obj.setChapterssize(arr.getInt("CHAPTERSSIZE"));
            _obj.setSubvolumes(arr.getString("SUBVOLUMES"));
            try{_obj.setChapterscreationdate(dateformat.parse(arr.getString("CHAPTERSCREATIONDATE")));}catch(Exception ce){_obj.setChapterscreationdate((new Date()));}
            try{_obj.setChaptersmodifieddate(dateformat.parse(arr.getString("CHAPTERSMODIFIEDDATE")));}catch(Exception ce){_obj.setChaptersmodifieddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMBOOKCHAPTERS返回的查询DataRow创建一个MVNFORUMBOOKCHAPTERSEntity对象
* @param MVNFORUMBOOKCHAPTERS row
* @returnMVNFORUMBOOKCHAPTERSList对象
* @throws Exception 
*/
public List< mvnforumbookchapters_Dao> get_mvnforumbookchapters_All(String strWhere) throws Exception{
         List<mvnforumbookchapters_Dao> _list = new ArrayList<mvnforumbookchapters_Dao>();
		 String sqlStr = "{ call MVNFORUMBOOKCHAPTERS_PRO.GetMVNFORUMBOOKCHAPTERSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumbookchapters_Dao _obj = new mvnforumbookchapters_Dao();
            _obj.setChaptersid(arr.getInt("CHAPTERSID"));
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setJarid(arr.getInt("JARID"));
            _obj.setChaptersname(arr.getString("CHAPTERSNAME"));
            _obj.setChaptersfolder(arr.getString("CHAPTERSFOLDER"));
            _obj.setChaptersurl(arr.getString("CHAPTERSURL"));
            _obj.setChapterssize(arr.getInt("CHAPTERSSIZE"));
            _obj.setSubvolumes(arr.getString("SUBVOLUMES"));
           try{_obj.setChapterscreationdate(dateformat.parse(arr.getString("CHAPTERSCREATIONDATE")));}catch(Exception ce){_obj.setChapterscreationdate((new Date()));}
           try{_obj.setChaptersmodifieddate(dateformat.parse(arr.getString("CHAPTERSMODIFIEDDATE")));}catch(Exception ce){_obj.setChaptersmodifieddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMBOOKCHAPTERS返回 分页数据
* @param MVNFORUMBOOKCHAPTERS row
* @returnMVNFORUMBOOKCHAPTERSList对象
* @throws Exception 
*/
public List<mvnforumbookchapters_Dao> get_mvnforumbookchapters_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumbookchapters_Dao> _list = new ArrayList<mvnforumbookchapters_Dao>();
		String sqlStr = "{ call MVNFORUMBOOKCHAPTERS_PRO.GetMVNFORUMBOOKCHAPTERSPage(?,?,?,?,?,?)}";
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
				mvnforumbookchapters_Dao _obj = new mvnforumbookchapters_Dao();
            _obj.setChaptersid(arr.getInt("CHAPTERSID"));
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setJarid(arr.getInt("JARID"));
            _obj.setChaptersname(arr.getString("CHAPTERSNAME"));
            _obj.setChaptersfolder(arr.getString("CHAPTERSFOLDER"));
            _obj.setChaptersurl(arr.getString("CHAPTERSURL"));
            _obj.setChapterssize(arr.getInt("CHAPTERSSIZE"));
            _obj.setSubvolumes(arr.getString("SUBVOLUMES"));
            try{_obj.setChapterscreationdate(dateformat.parse(arr.getString("CHAPTERSCREATIONDATE")));}catch(Exception ce){_obj.setChapterscreationdate((new Date()));}
            try{_obj.setChaptersmodifieddate(dateformat.parse(arr.getString("CHAPTERSMODIFIEDDATE")));}catch(Exception ce){_obj.setChaptersmodifieddate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMBOOKCHAPTERS返回的查询DataRow创建一个MVNFORUMBOOKCHAPTERSEntity对象
* @param MVNFORUMBOOKCHAPTERS row
* @returnMVNFORUMBOOKCHAPTERSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumbookchapters_Dao> get_mvnforumbookchapters_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumbookchaptersstrWhere") == null) {
			Dictionary<Integer, mvnforumbookchapters_Dao> _dic = new Hashtable<Integer, mvnforumbookchapters_Dao>();
			List<mvnforumbookchapters_Dao> _list = new ArrayList<mvnforumbookchapters_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getChaptersid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumbookchapters", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumbookchapters_Dao> _dic = (Dictionary<Integer, mvnforumbookchapters_Dao>) classFactory
					.cacheGet("dicmvnforumbookchaptersstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMBOOKCHAPTERS字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumbookchapters_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMBOOKCHAPTERS_PRO.UpdateFieldMVNFORUMBOOKCHAPTERS(?,?)}";
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
* 更新MVNFORUMBOOKCHAPTERSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumbookchapters_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMBOOKCHAPTERS_PRO.UpdateFieldMVNFORUMBOOKCHAPTERSV(?,?,?)}";
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
* 更新MVNFORUMBOOKCHAPTERSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumbookchapters_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMBOOKCHAPTERS_PRO.UpdateFieldMVNFORUMBOOKCHAPTERSU(?,?,?)}";
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
