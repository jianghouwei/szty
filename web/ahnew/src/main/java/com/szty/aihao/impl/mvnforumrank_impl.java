/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumrank.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumrank_Dao;
import com.szty.aihao.core.mvnforumrank_core;
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
*@MVNFORUMRANK数据接口
*@作者：宋春林 
*/
public class mvnforumrank_impl implements mvnforumrank_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumrank_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMRANK实体
* @return 新插入记录的编号
*/
public int insert_mvnforumrank(mvnforumrank_Dao _MVNFORUMRANKModel)  throws Exception{
         String sqlStr = "{call MVNFORUMRANK_PRO.InsertMVNFORUMRANK(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMRANKModel.getRankid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMRANKModel.getRankminposts());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMRANKModel.getRanklevel());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRANKModel.getRanktitle());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRANKModel.getRankimage());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMRANKModel.getRanktype());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMRANKModel.getRankoption());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMRANK
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumrank(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMRANK_PRO.InsertMVNFORUMRANK(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMRANK实体
* @return 影响的行数
*/
public int update_mvnforumrank(mvnforumrank_Dao _MVNFORUMRANKModel)  throws Exception{
        String sqlStr = "{call MVNFORUMRANK_PRO.UpdateMVNFORUMRANK(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMRANKModel.getRankid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMRANKModel.getRankminposts());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMRANKModel.getRanklevel());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRANKModel.getRanktitle());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRANKModel.getRankimage());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMRANKModel.getRanktype());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMRANKModel.getRankoption());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMRANK中的一条记录
* @param MVNFORUMRANK实体
* @return 新插入记录的编号
*/
public int delete_mvnforumrank(int Rankid)  throws Exception{
        String sqlStr = "{call MVNFORUMRANK_PRO.DeleteMVNFORUMRANK(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Rankid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumrank 数据实体
* @param Rankid">Rankid
* @return<mvnforumrank 数据实体
* @throws Exception 
*/
public mvnforumrank_Dao get_mvnforumrankDao(int Rankid) throws Exception{
         String sqlStr = "{ call MVNFORUMRANK_PRO.GetMVNFORUMRANKEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Rankid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumrank_Dao _obj = new mvnforumrank_Dao();
            _obj.setRankid(arr.getInt("RANKID"));
            _obj.setRankminposts(arr.getInt("RANKMINPOSTS"));
            _obj.setRanklevel(arr.getInt("RANKLEVEL"));
            _obj.setRanktitle(arr.getString("RANKTITLE"));
            _obj.setRankimage(arr.getString("RANKIMAGE"));
            _obj.setRanktype(arr.getInt("RANKTYPE"));
            _obj.setRankoption(arr.getInt("RANKOPTION"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMRANK返回的查询DataRow创建一个MVNFORUMRANKEntity对象
* @param MVNFORUMRANK row
* @returnMVNFORUMRANKList对象
* @throws Exception 
*/
public List<mvnforumrank_Dao> get_mvnforumrank_All() throws Exception{
        List<mvnforumrank_Dao> _list = new ArrayList<mvnforumrank_Dao>();
		String sqlStr = "{ call MVNFORUMRANK_PRO.GetMVNFORUMRANK(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumrank_Dao _obj = new mvnforumrank_Dao();
            _obj.setRankid(arr.getInt("RANKID"));
            _obj.setRankminposts(arr.getInt("RANKMINPOSTS"));
            _obj.setRanklevel(arr.getInt("RANKLEVEL"));
            _obj.setRanktitle(arr.getString("RANKTITLE"));
            _obj.setRankimage(arr.getString("RANKIMAGE"));
            _obj.setRanktype(arr.getInt("RANKTYPE"));
            _obj.setRankoption(arr.getInt("RANKOPTION"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMRANK返回的查询DataRow创建一个MVNFORUMRANKEntity对象
* @param MVNFORUMRANK row
* @returnMVNFORUMRANKList对象
* @throws Exception 
*/
public List< mvnforumrank_Dao> get_mvnforumrank_All(String strWhere) throws Exception{
         List<mvnforumrank_Dao> _list = new ArrayList<mvnforumrank_Dao>();
		 String sqlStr = "{ call MVNFORUMRANK_PRO.GetMVNFORUMRANKWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumrank_Dao _obj = new mvnforumrank_Dao();
            _obj.setRankid(arr.getInt("RANKID"));
            _obj.setRankminposts(arr.getInt("RANKMINPOSTS"));
            _obj.setRanklevel(arr.getInt("RANKLEVEL"));
            _obj.setRanktitle(arr.getString("RANKTITLE"));
            _obj.setRankimage(arr.getString("RANKIMAGE"));
            _obj.setRanktype(arr.getInt("RANKTYPE"));
            _obj.setRankoption(arr.getInt("RANKOPTION"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMRANK返回 分页数据
* @param MVNFORUMRANK row
* @returnMVNFORUMRANKList对象
* @throws Exception 
*/
public List<mvnforumrank_Dao> get_mvnforumrank_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumrank_Dao> _list = new ArrayList<mvnforumrank_Dao>();
		String sqlStr = "{ call MVNFORUMRANK_PRO.GetMVNFORUMRANKPage(?,?,?,?,?,?)}";
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
				mvnforumrank_Dao _obj = new mvnforumrank_Dao();
            _obj.setRankid(arr.getInt("RANKID"));
            _obj.setRankminposts(arr.getInt("RANKMINPOSTS"));
            _obj.setRanklevel(arr.getInt("RANKLEVEL"));
            _obj.setRanktitle(arr.getString("RANKTITLE"));
            _obj.setRankimage(arr.getString("RANKIMAGE"));
            _obj.setRanktype(arr.getInt("RANKTYPE"));
            _obj.setRankoption(arr.getInt("RANKOPTION"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMRANK返回的查询DataRow创建一个MVNFORUMRANKEntity对象
* @param MVNFORUMRANK row
* @returnMVNFORUMRANKDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumrank_Dao> get_mvnforumrank_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumrankstrWhere") == null) {
			Dictionary<Integer, mvnforumrank_Dao> _dic = new Hashtable<Integer, mvnforumrank_Dao>();
			List<mvnforumrank_Dao> _list = new ArrayList<mvnforumrank_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getRankid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumrank", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumrank_Dao> _dic = (Dictionary<Integer, mvnforumrank_Dao>) classFactory
					.cacheGet("dicmvnforumrankstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMRANK字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumrank_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMRANK_PRO.UpdateFieldMVNFORUMRANK(?,?)}";
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
* 更新MVNFORUMRANKInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumrank_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMRANK_PRO.UpdateFieldMVNFORUMRANKV(?,?,?)}";
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
* 更新MVNFORUMRANKIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumrank_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMRANK_PRO.UpdateFieldMVNFORUMRANKU(?,?,?)}";
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
