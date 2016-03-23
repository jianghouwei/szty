/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumbook.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumbook_Dao;
import com.szty.aihao.core.mvnforumbook_core;
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
*@MVNFORUMBOOK数据接口
*@作者：宋春林 
*/
public class mvnforumbook_impl implements mvnforumbook_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumbook_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBOOK实体
* @return 新插入记录的编号
*/
public int insert_mvnforumbook(mvnforumbook_Dao _MVNFORUMBOOKModel)  throws Exception{
         String sqlStr = "{call MVNFORUMBOOK_PRO.InsertMVNFORUMBOOK(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookdescription());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookauthor());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookcategory());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookicon());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookchapterscount());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookjarcount());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBooklisturl());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookcopyright());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookseries());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKModel.getBookcreationdate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKModel.getBookmodifieddate()));
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookownername());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookstatus());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBOOK
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumbook(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMBOOK_PRO.InsertMVNFORUMBOOK(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[17];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_para[12]));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.DATE, dateformat.format(_para[13]));
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_para[16]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMBOOK实体
* @return 影响的行数
*/
public int update_mvnforumbook(mvnforumbook_Dao _MVNFORUMBOOKModel)  throws Exception{
        String sqlStr = "{call MVNFORUMBOOK_PRO.UpdateMVNFORUMBOOK(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookdescription());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookauthor());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookcategory());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookicon());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookchapterscount());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookjarcount());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBooklisturl());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookcopyright());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookseries());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKModel.getBookcreationdate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKModel.getBookmodifieddate()));
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKModel.getBookownername());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getBookstatus());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMBOOK中的一条记录
* @param MVNFORUMBOOK实体
* @return 新插入记录的编号
*/
public int delete_mvnforumbook(int Bookid)  throws Exception{
        String sqlStr = "{call MVNFORUMBOOK_PRO.DeleteMVNFORUMBOOK(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Bookid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumbook 数据实体
* @param Bookid">Bookid
* @return<mvnforumbook 数据实体
* @throws Exception 
*/
public mvnforumbook_Dao get_mvnforumbookDao(int Bookid) throws Exception{
         String sqlStr = "{ call MVNFORUMBOOK_PRO.GetMVNFORUMBOOKEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Bookid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumbook_Dao _obj = new mvnforumbook_Dao();
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setBookname(arr.getString("BOOKNAME"));
            _obj.setBookdescription(arr.getString("BOOKDESCRIPTION"));
            _obj.setBookauthor(arr.getString("BOOKAUTHOR"));
            _obj.setBookcategory(arr.getInt("BOOKCATEGORY"));
            _obj.setBookicon(arr.getString("BOOKICON"));
            _obj.setBookchapterscount(arr.getInt("BOOKCHAPTERSCOUNT"));
            _obj.setBookjarcount(arr.getInt("BOOKJARCOUNT"));
            _obj.setBooklisturl(arr.getString("BOOKLISTURL"));
            _obj.setBookcopyright(arr.getString("BOOKCOPYRIGHT"));
            _obj.setBookseries(arr.getInt("BOOKSERIES"));
             try{_obj.setBookcreationdate(dateformat.parse(arr.getString("BOOKCREATIONDATE")));}catch(Exception ce){_obj.setBookcreationdate((new Date()));}
             try{_obj.setBookmodifieddate(dateformat.parse(arr.getString("BOOKMODIFIEDDATE")));}catch(Exception ce){_obj.setBookmodifieddate((new Date()));}
            _obj.setBookownername(arr.getString("BOOKOWNERNAME"));
            _obj.setBookstatus(arr.getInt("BOOKSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMBOOK返回的查询DataRow创建一个MVNFORUMBOOKEntity对象
* @param MVNFORUMBOOK row
* @returnMVNFORUMBOOKList对象
* @throws Exception 
*/
public List<mvnforumbook_Dao> get_mvnforumbook_All() throws Exception{
        List<mvnforumbook_Dao> _list = new ArrayList<mvnforumbook_Dao>();
		String sqlStr = "{ call MVNFORUMBOOK_PRO.GetMVNFORUMBOOK(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumbook_Dao _obj = new mvnforumbook_Dao();
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setBookname(arr.getString("BOOKNAME"));
            _obj.setBookdescription(arr.getString("BOOKDESCRIPTION"));
            _obj.setBookauthor(arr.getString("BOOKAUTHOR"));
            _obj.setBookcategory(arr.getInt("BOOKCATEGORY"));
            _obj.setBookicon(arr.getString("BOOKICON"));
            _obj.setBookchapterscount(arr.getInt("BOOKCHAPTERSCOUNT"));
            _obj.setBookjarcount(arr.getInt("BOOKJARCOUNT"));
            _obj.setBooklisturl(arr.getString("BOOKLISTURL"));
            _obj.setBookcopyright(arr.getString("BOOKCOPYRIGHT"));
            _obj.setBookseries(arr.getInt("BOOKSERIES"));
            try{_obj.setBookcreationdate(dateformat.parse(arr.getString("BOOKCREATIONDATE")));}catch(Exception ce){_obj.setBookcreationdate((new Date()));}
            try{_obj.setBookmodifieddate(dateformat.parse(arr.getString("BOOKMODIFIEDDATE")));}catch(Exception ce){_obj.setBookmodifieddate((new Date()));}
            _obj.setBookownername(arr.getString("BOOKOWNERNAME"));
            _obj.setBookstatus(arr.getInt("BOOKSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMBOOK返回的查询DataRow创建一个MVNFORUMBOOKEntity对象
* @param MVNFORUMBOOK row
* @returnMVNFORUMBOOKList对象
* @throws Exception 
*/
public List< mvnforumbook_Dao> get_mvnforumbook_All(String strWhere) throws Exception{
         List<mvnforumbook_Dao> _list = new ArrayList<mvnforumbook_Dao>();
		 String sqlStr = "{ call MVNFORUMBOOK_PRO.GetMVNFORUMBOOKWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumbook_Dao _obj = new mvnforumbook_Dao();
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setBookname(arr.getString("BOOKNAME"));
            _obj.setBookdescription(arr.getString("BOOKDESCRIPTION"));
            _obj.setBookauthor(arr.getString("BOOKAUTHOR"));
            _obj.setBookcategory(arr.getInt("BOOKCATEGORY"));
            _obj.setBookicon(arr.getString("BOOKICON"));
            _obj.setBookchapterscount(arr.getInt("BOOKCHAPTERSCOUNT"));
            _obj.setBookjarcount(arr.getInt("BOOKJARCOUNT"));
            _obj.setBooklisturl(arr.getString("BOOKLISTURL"));
            _obj.setBookcopyright(arr.getString("BOOKCOPYRIGHT"));
            _obj.setBookseries(arr.getInt("BOOKSERIES"));
           try{_obj.setBookcreationdate(dateformat.parse(arr.getString("BOOKCREATIONDATE")));}catch(Exception ce){_obj.setBookcreationdate((new Date()));}
           try{_obj.setBookmodifieddate(dateformat.parse(arr.getString("BOOKMODIFIEDDATE")));}catch(Exception ce){_obj.setBookmodifieddate((new Date()));}
            _obj.setBookownername(arr.getString("BOOKOWNERNAME"));
            _obj.setBookstatus(arr.getInt("BOOKSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMBOOK返回 分页数据
* @param MVNFORUMBOOK row
* @returnMVNFORUMBOOKList对象
* @throws Exception 
*/
public List<mvnforumbook_Dao> get_mvnforumbook_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumbook_Dao> _list = new ArrayList<mvnforumbook_Dao>();
		String sqlStr = "{ call MVNFORUMBOOK_PRO.GetMVNFORUMBOOKPage(?,?,?,?,?,?)}";
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
				mvnforumbook_Dao _obj = new mvnforumbook_Dao();
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setBookname(arr.getString("BOOKNAME"));
            _obj.setBookdescription(arr.getString("BOOKDESCRIPTION"));
            _obj.setBookauthor(arr.getString("BOOKAUTHOR"));
            _obj.setBookcategory(arr.getInt("BOOKCATEGORY"));
            _obj.setBookicon(arr.getString("BOOKICON"));
            _obj.setBookchapterscount(arr.getInt("BOOKCHAPTERSCOUNT"));
            _obj.setBookjarcount(arr.getInt("BOOKJARCOUNT"));
            _obj.setBooklisturl(arr.getString("BOOKLISTURL"));
            _obj.setBookcopyright(arr.getString("BOOKCOPYRIGHT"));
            _obj.setBookseries(arr.getInt("BOOKSERIES"));
            try{_obj.setBookcreationdate(dateformat.parse(arr.getString("BOOKCREATIONDATE")));}catch(Exception ce){_obj.setBookcreationdate((new Date()));}
            try{_obj.setBookmodifieddate(dateformat.parse(arr.getString("BOOKMODIFIEDDATE")));}catch(Exception ce){_obj.setBookmodifieddate((new Date()));}
            _obj.setBookownername(arr.getString("BOOKOWNERNAME"));
            _obj.setBookstatus(arr.getInt("BOOKSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMBOOK返回的查询DataRow创建一个MVNFORUMBOOKEntity对象
* @param MVNFORUMBOOK row
* @returnMVNFORUMBOOKDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumbook_Dao> get_mvnforumbook_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumbookstrWhere") == null) {
			Dictionary<Integer, mvnforumbook_Dao> _dic = new Hashtable<Integer, mvnforumbook_Dao>();
			List<mvnforumbook_Dao> _list = new ArrayList<mvnforumbook_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getBookid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumbook", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumbook_Dao> _dic = (Dictionary<Integer, mvnforumbook_Dao>) classFactory
					.cacheGet("dicmvnforumbookstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMBOOK字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumbook_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMBOOK_PRO.UpdateFieldMVNFORUMBOOK(?,?)}";
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
* 更新MVNFORUMBOOKInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumbook_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMBOOK_PRO.UpdateFieldMVNFORUMBOOKV(?,?,?)}";
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
* 更新MVNFORUMBOOKIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumbook_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMBOOK_PRO.UpdateFieldMVNFORUMBOOKU(?,?,?)}";
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
