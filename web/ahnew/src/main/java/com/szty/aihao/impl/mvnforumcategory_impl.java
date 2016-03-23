/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumcategory.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumcategory_Dao;
import com.szty.aihao.core.mvnforumcategory_core;
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
*@MVNFORUMCATEGORY数据接口
*@作者：宋春林 
*/
public class mvnforumcategory_impl implements mvnforumcategory_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumcategory_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMCATEGORY实体
* @return 新插入记录的编号
*/
public int insert_mvnforumcategory(mvnforumcategory_Dao _MVNFORUMCATEGORYModel)  throws Exception{
         String sqlStr = "{call MVNFORUMCATEGORY_PRO.InsertMVNFORUMCATEGORY(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMCATEGORYModel.getCategoryid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMCATEGORYModel.getParentcategoryid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCATEGORYModel.getCategoryname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCATEGORYModel.getCategorydesc());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMCATEGORYModel.getCategorycreationdate()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMCATEGORYModel.getCategorymodifieddate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMCATEGORYModel.getCategoryorder());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMCATEGORYModel.getCategoryoption());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_MVNFORUMCATEGORYModel.getCategorystatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMCATEGORY
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumcategory(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMCATEGORY_PRO.InsertMVNFORUMCATEGORY(?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[9];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_para[8]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMCATEGORY实体
* @return 影响的行数
*/
public int update_mvnforumcategory(mvnforumcategory_Dao _MVNFORUMCATEGORYModel)  throws Exception{
        String sqlStr = "{call MVNFORUMCATEGORY_PRO.UpdateMVNFORUMCATEGORY(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMCATEGORYModel.getCategoryid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMCATEGORYModel.getParentcategoryid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCATEGORYModel.getCategoryname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMCATEGORYModel.getCategorydesc());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMCATEGORYModel.getCategorycreationdate()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMCATEGORYModel.getCategorymodifieddate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMCATEGORYModel.getCategoryorder());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MVNFORUMCATEGORYModel.getCategoryoption());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_MVNFORUMCATEGORYModel.getCategorystatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMCATEGORY中的一条记录
* @param MVNFORUMCATEGORY实体
* @return 新插入记录的编号
*/
public int delete_mvnforumcategory(int Categoryid)  throws Exception{
        String sqlStr = "{call MVNFORUMCATEGORY_PRO.DeleteMVNFORUMCATEGORY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Categoryid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumcategory 数据实体
* @param Categoryid">Categoryid
* @return<mvnforumcategory 数据实体
* @throws Exception 
*/
public mvnforumcategory_Dao get_mvnforumcategoryDao(int Categoryid) throws Exception{
         String sqlStr = "{ call MVNFORUMCATEGORY_PRO.GetMVNFORUMCATEGORYEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Categoryid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumcategory_Dao _obj = new mvnforumcategory_Dao();
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setParentcategoryid(arr.getInt("PARENTCATEGORYID"));
            _obj.setCategoryname(arr.getString("CATEGORYNAME"));
            _obj.setCategorydesc(arr.getString("CATEGORYDESC"));
             try{_obj.setCategorycreationdate(dateformat.parse(arr.getString("CATEGORYCREATIONDATE")));}catch(Exception ce){_obj.setCategorycreationdate((new Date()));}
             try{_obj.setCategorymodifieddate(dateformat.parse(arr.getString("CATEGORYMODIFIEDDATE")));}catch(Exception ce){_obj.setCategorymodifieddate((new Date()));}
            _obj.setCategoryorder(arr.getInt("CATEGORYORDER"));
            _obj.setCategoryoption(arr.getInt("CATEGORYOPTION"));
            _obj.setCategorystatus(arr.getInt("CATEGORYSTATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMCATEGORY返回的查询DataRow创建一个MVNFORUMCATEGORYEntity对象
* @param MVNFORUMCATEGORY row
* @returnMVNFORUMCATEGORYList对象
* @throws Exception 
*/
public List<mvnforumcategory_Dao> get_mvnforumcategory_All() throws Exception{
        List<mvnforumcategory_Dao> _list = new ArrayList<mvnforumcategory_Dao>();
		String sqlStr = "{ call MVNFORUMCATEGORY_PRO.GetMVNFORUMCATEGORY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumcategory_Dao _obj = new mvnforumcategory_Dao();
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setParentcategoryid(arr.getInt("PARENTCATEGORYID"));
            _obj.setCategoryname(arr.getString("CATEGORYNAME"));
            _obj.setCategorydesc(arr.getString("CATEGORYDESC"));
            try{_obj.setCategorycreationdate(dateformat.parse(arr.getString("CATEGORYCREATIONDATE")));}catch(Exception ce){_obj.setCategorycreationdate((new Date()));}
            try{_obj.setCategorymodifieddate(dateformat.parse(arr.getString("CATEGORYMODIFIEDDATE")));}catch(Exception ce){_obj.setCategorymodifieddate((new Date()));}
            _obj.setCategoryorder(arr.getInt("CATEGORYORDER"));
            _obj.setCategoryoption(arr.getInt("CATEGORYOPTION"));
            _obj.setCategorystatus(arr.getInt("CATEGORYSTATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMCATEGORY返回的查询DataRow创建一个MVNFORUMCATEGORYEntity对象
* @param MVNFORUMCATEGORY row
* @returnMVNFORUMCATEGORYList对象
* @throws Exception 
*/
public List< mvnforumcategory_Dao> get_mvnforumcategory_All(String strWhere) throws Exception{
         List<mvnforumcategory_Dao> _list = new ArrayList<mvnforumcategory_Dao>();
		 String sqlStr = "{ call MVNFORUMCATEGORY_PRO.GetMVNFORUMCATEGORYWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumcategory_Dao _obj = new mvnforumcategory_Dao();
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setParentcategoryid(arr.getInt("PARENTCATEGORYID"));
            _obj.setCategoryname(arr.getString("CATEGORYNAME"));
            _obj.setCategorydesc(arr.getString("CATEGORYDESC"));
           try{_obj.setCategorycreationdate(dateformat.parse(arr.getString("CATEGORYCREATIONDATE")));}catch(Exception ce){_obj.setCategorycreationdate((new Date()));}
           try{_obj.setCategorymodifieddate(dateformat.parse(arr.getString("CATEGORYMODIFIEDDATE")));}catch(Exception ce){_obj.setCategorymodifieddate((new Date()));}
            _obj.setCategoryorder(arr.getInt("CATEGORYORDER"));
            _obj.setCategoryoption(arr.getInt("CATEGORYOPTION"));
            _obj.setCategorystatus(arr.getInt("CATEGORYSTATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMCATEGORY返回 分页数据
* @param MVNFORUMCATEGORY row
* @returnMVNFORUMCATEGORYList对象
* @throws Exception 
*/
public List<mvnforumcategory_Dao> get_mvnforumcategory_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumcategory_Dao> _list = new ArrayList<mvnforumcategory_Dao>();
		String sqlStr = "{ call MVNFORUMCATEGORY_PRO.GetMVNFORUMCATEGORYPage(?,?,?,?,?,?)}";
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
				mvnforumcategory_Dao _obj = new mvnforumcategory_Dao();
            _obj.setCategoryid(arr.getInt("CATEGORYID"));
            _obj.setParentcategoryid(arr.getInt("PARENTCATEGORYID"));
            _obj.setCategoryname(arr.getString("CATEGORYNAME"));
            _obj.setCategorydesc(arr.getString("CATEGORYDESC"));
            try{_obj.setCategorycreationdate(dateformat.parse(arr.getString("CATEGORYCREATIONDATE")));}catch(Exception ce){_obj.setCategorycreationdate((new Date()));}
            try{_obj.setCategorymodifieddate(dateformat.parse(arr.getString("CATEGORYMODIFIEDDATE")));}catch(Exception ce){_obj.setCategorymodifieddate((new Date()));}
            _obj.setCategoryorder(arr.getInt("CATEGORYORDER"));
            _obj.setCategoryoption(arr.getInt("CATEGORYOPTION"));
            _obj.setCategorystatus(arr.getInt("CATEGORYSTATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMCATEGORY返回的查询DataRow创建一个MVNFORUMCATEGORYEntity对象
* @param MVNFORUMCATEGORY row
* @returnMVNFORUMCATEGORYDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumcategory_Dao> get_mvnforumcategory_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumcategorystrWhere") == null) {
			Dictionary<Integer, mvnforumcategory_Dao> _dic = new Hashtable<Integer, mvnforumcategory_Dao>();
			List<mvnforumcategory_Dao> _list = new ArrayList<mvnforumcategory_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getCategoryid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumcategory", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumcategory_Dao> _dic = (Dictionary<Integer, mvnforumcategory_Dao>) classFactory
					.cacheGet("dicmvnforumcategorystrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMCATEGORY字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumcategory_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMCATEGORY_PRO.UpdateFieldMVNFORUMCATEGORY(?,?)}";
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
* 更新MVNFORUMCATEGORYInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumcategory_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMCATEGORY_PRO.UpdateFieldMVNFORUMCATEGORYV(?,?,?)}";
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
* 更新MVNFORUMCATEGORYIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumcategory_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMCATEGORY_PRO.UpdateFieldMVNFORUMCATEGORYU(?,?,?)}";
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
