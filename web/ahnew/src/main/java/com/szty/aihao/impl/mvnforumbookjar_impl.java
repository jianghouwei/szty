/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumbookjar.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumbookjar_Dao;
import com.szty.aihao.core.mvnforumbookjar_core;
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
*@MVNFORUMBOOKJAR数据接口
*@作者：宋春林 
*/
public class mvnforumbookjar_impl implements mvnforumbookjar_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumbookjar_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBOOKJAR实体
* @return 新插入记录的编号
*/
public int insert_mvnforumbookjar(mvnforumbookjar_Dao _MVNFORUMBOOKJARModel)  throws Exception{
         String sqlStr = "{call MVNFORUMBOOKJAR_PRO.InsertMVNFORUMBOOKJAR(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMBOOKJARModel.getJarid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKJARModel.getBookid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKJARModel.getJardescription());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKJARModel.getJartexturl());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKJARModel.getJartextsize());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKJARModel.getJarjarurl());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKJARModel.getJarjarsize());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKJARModel.getJarchapterscount());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKJARModel.getJarcreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKJARModel.getJarmodifieddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMBOOKJAR
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumbookjar(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMBOOKJAR_PRO.InsertMVNFORUMBOOKJAR(?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[10];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
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
* @param MVNFORUMBOOKJAR实体
* @return 影响的行数
*/
public int update_mvnforumbookjar(mvnforumbookjar_Dao _MVNFORUMBOOKJARModel)  throws Exception{
        String sqlStr = "{call MVNFORUMBOOKJAR_PRO.UpdateMVNFORUMBOOKJAR(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKJARModel.getJarid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKJARModel.getBookid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKJARModel.getJardescription());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKJARModel.getJartexturl());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKJARModel.getJartextsize());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMBOOKJARModel.getJarjarurl());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKJARModel.getJarjarsize());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMBOOKJARModel.getJarchapterscount());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKJARModel.getJarcreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMBOOKJARModel.getJarmodifieddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMBOOKJAR中的一条记录
* @param MVNFORUMBOOKJAR实体
* @return 新插入记录的编号
*/
public int delete_mvnforumbookjar(int Jarid)  throws Exception{
        String sqlStr = "{call MVNFORUMBOOKJAR_PRO.DeleteMVNFORUMBOOKJAR(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Jarid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumbookjar 数据实体
* @param Jarid">Jarid
* @return<mvnforumbookjar 数据实体
* @throws Exception 
*/
public mvnforumbookjar_Dao get_mvnforumbookjarDao(int Jarid) throws Exception{
         String sqlStr = "{ call MVNFORUMBOOKJAR_PRO.GetMVNFORUMBOOKJAREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Jarid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumbookjar_Dao _obj = new mvnforumbookjar_Dao();
            _obj.setJarid(arr.getInt("JARID"));
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setJardescription(arr.getString("JARDESCRIPTION"));
            _obj.setJartexturl(arr.getString("JARTEXTURL"));
            _obj.setJartextsize(arr.getInt("JARTEXTSIZE"));
            _obj.setJarjarurl(arr.getString("JARJARURL"));
            _obj.setJarjarsize(arr.getInt("JARJARSIZE"));
            _obj.setJarchapterscount(arr.getInt("JARCHAPTERSCOUNT"));
             try{_obj.setJarcreationdate(dateformat.parse(arr.getString("JARCREATIONDATE")));}catch(Exception ce){_obj.setJarcreationdate((new Date()));}
             try{_obj.setJarmodifieddate(dateformat.parse(arr.getString("JARMODIFIEDDATE")));}catch(Exception ce){_obj.setJarmodifieddate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMBOOKJAR返回的查询DataRow创建一个MVNFORUMBOOKJAREntity对象
* @param MVNFORUMBOOKJAR row
* @returnMVNFORUMBOOKJARList对象
* @throws Exception 
*/
public List<mvnforumbookjar_Dao> get_mvnforumbookjar_All() throws Exception{
        List<mvnforumbookjar_Dao> _list = new ArrayList<mvnforumbookjar_Dao>();
		String sqlStr = "{ call MVNFORUMBOOKJAR_PRO.GetMVNFORUMBOOKJAR(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumbookjar_Dao _obj = new mvnforumbookjar_Dao();
            _obj.setJarid(arr.getInt("JARID"));
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setJardescription(arr.getString("JARDESCRIPTION"));
            _obj.setJartexturl(arr.getString("JARTEXTURL"));
            _obj.setJartextsize(arr.getInt("JARTEXTSIZE"));
            _obj.setJarjarurl(arr.getString("JARJARURL"));
            _obj.setJarjarsize(arr.getInt("JARJARSIZE"));
            _obj.setJarchapterscount(arr.getInt("JARCHAPTERSCOUNT"));
            try{_obj.setJarcreationdate(dateformat.parse(arr.getString("JARCREATIONDATE")));}catch(Exception ce){_obj.setJarcreationdate((new Date()));}
            try{_obj.setJarmodifieddate(dateformat.parse(arr.getString("JARMODIFIEDDATE")));}catch(Exception ce){_obj.setJarmodifieddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMBOOKJAR返回的查询DataRow创建一个MVNFORUMBOOKJAREntity对象
* @param MVNFORUMBOOKJAR row
* @returnMVNFORUMBOOKJARList对象
* @throws Exception 
*/
public List< mvnforumbookjar_Dao> get_mvnforumbookjar_All(String strWhere) throws Exception{
         List<mvnforumbookjar_Dao> _list = new ArrayList<mvnforumbookjar_Dao>();
		 String sqlStr = "{ call MVNFORUMBOOKJAR_PRO.GetMVNFORUMBOOKJARWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumbookjar_Dao _obj = new mvnforumbookjar_Dao();
            _obj.setJarid(arr.getInt("JARID"));
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setJardescription(arr.getString("JARDESCRIPTION"));
            _obj.setJartexturl(arr.getString("JARTEXTURL"));
            _obj.setJartextsize(arr.getInt("JARTEXTSIZE"));
            _obj.setJarjarurl(arr.getString("JARJARURL"));
            _obj.setJarjarsize(arr.getInt("JARJARSIZE"));
            _obj.setJarchapterscount(arr.getInt("JARCHAPTERSCOUNT"));
           try{_obj.setJarcreationdate(dateformat.parse(arr.getString("JARCREATIONDATE")));}catch(Exception ce){_obj.setJarcreationdate((new Date()));}
           try{_obj.setJarmodifieddate(dateformat.parse(arr.getString("JARMODIFIEDDATE")));}catch(Exception ce){_obj.setJarmodifieddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMBOOKJAR返回 分页数据
* @param MVNFORUMBOOKJAR row
* @returnMVNFORUMBOOKJARList对象
* @throws Exception 
*/
public List<mvnforumbookjar_Dao> get_mvnforumbookjar_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumbookjar_Dao> _list = new ArrayList<mvnforumbookjar_Dao>();
		String sqlStr = "{ call MVNFORUMBOOKJAR_PRO.GetMVNFORUMBOOKJARPage(?,?,?,?,?,?)}";
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
				mvnforumbookjar_Dao _obj = new mvnforumbookjar_Dao();
            _obj.setJarid(arr.getInt("JARID"));
            _obj.setBookid(arr.getInt("BOOKID"));
            _obj.setJardescription(arr.getString("JARDESCRIPTION"));
            _obj.setJartexturl(arr.getString("JARTEXTURL"));
            _obj.setJartextsize(arr.getInt("JARTEXTSIZE"));
            _obj.setJarjarurl(arr.getString("JARJARURL"));
            _obj.setJarjarsize(arr.getInt("JARJARSIZE"));
            _obj.setJarchapterscount(arr.getInt("JARCHAPTERSCOUNT"));
            try{_obj.setJarcreationdate(dateformat.parse(arr.getString("JARCREATIONDATE")));}catch(Exception ce){_obj.setJarcreationdate((new Date()));}
            try{_obj.setJarmodifieddate(dateformat.parse(arr.getString("JARMODIFIEDDATE")));}catch(Exception ce){_obj.setJarmodifieddate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMBOOKJAR返回的查询DataRow创建一个MVNFORUMBOOKJAREntity对象
* @param MVNFORUMBOOKJAR row
* @returnMVNFORUMBOOKJARDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumbookjar_Dao> get_mvnforumbookjar_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumbookjarstrWhere") == null) {
			Dictionary<Integer, mvnforumbookjar_Dao> _dic = new Hashtable<Integer, mvnforumbookjar_Dao>();
			List<mvnforumbookjar_Dao> _list = new ArrayList<mvnforumbookjar_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getJarid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumbookjar", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumbookjar_Dao> _dic = (Dictionary<Integer, mvnforumbookjar_Dao>) classFactory
					.cacheGet("dicmvnforumbookjarstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMBOOKJAR字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumbookjar_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMBOOKJAR_PRO.UpdateFieldMVNFORUMBOOKJAR(?,?)}";
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
* 更新MVNFORUMBOOKJARInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumbookjar_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMBOOKJAR_PRO.UpdateFieldMVNFORUMBOOKJARV(?,?,?)}";
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
* 更新MVNFORUMBOOKJARIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumbookjar_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMBOOKJAR_PRO.UpdateFieldMVNFORUMBOOKJARU(?,?,?)}";
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
