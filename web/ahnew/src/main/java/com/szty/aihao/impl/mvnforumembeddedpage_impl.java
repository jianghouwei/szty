/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumembeddedpage.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumembeddedpage_Dao;
import com.szty.aihao.core.mvnforumembeddedpage_core;
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
*@MVNFORUMEMBEDDEDPAGE数据接口
*@作者：宋春林 
*/
public class mvnforumembeddedpage_impl implements mvnforumembeddedpage_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumembeddedpage_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMEMBEDDEDPAGE实体
* @return 新插入记录的编号
*/
public int insert_mvnforumembeddedpage(mvnforumembeddedpage_Dao _MVNFORUMEMBEDDEDPAGEModel)  throws Exception{
         String sqlStr = "{call MVNFORUMEMBEDDEDPAGE_PRO.InsertMVNFORUMEMBEDDEDPAGE(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMEMBEDDEDPAGEModel.getEmbid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMEMBEDDEDPAGEModel.getPageid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMEMBEDDEDPAGEModel.getPagenameindex());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMEMBEDDEDPAGEModel.getOwnername());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMEMBEDDEDPAGE
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumembeddedpage(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMEMBEDDEDPAGE_PRO.InsertMVNFORUMEMBEDDEDPAGE(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMEMBEDDEDPAGE实体
* @return 影响的行数
*/
public int update_mvnforumembeddedpage(mvnforumembeddedpage_Dao _MVNFORUMEMBEDDEDPAGEModel)  throws Exception{
        String sqlStr = "{call MVNFORUMEMBEDDEDPAGE_PRO.UpdateMVNFORUMEMBEDDEDPAGE(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMEMBEDDEDPAGEModel.getEmbid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMEMBEDDEDPAGEModel.getPageid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMEMBEDDEDPAGEModel.getPagenameindex());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMEMBEDDEDPAGEModel.getOwnername());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMEMBEDDEDPAGE中的一条记录
* @param MVNFORUMEMBEDDEDPAGE实体
* @return 新插入记录的编号
*/
public int delete_mvnforumembeddedpage(int Embid)  throws Exception{
        String sqlStr = "{call MVNFORUMEMBEDDEDPAGE_PRO.DeleteMVNFORUMEMBEDDEDPAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Embid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumembeddedpage 数据实体
* @param Embid">Embid
* @return<mvnforumembeddedpage 数据实体
* @throws Exception 
*/
public mvnforumembeddedpage_Dao get_mvnforumembeddedpageDao(int Embid) throws Exception{
         String sqlStr = "{ call MVNFORUMEMBEDDEDPAGE_PRO.GetMVNFORUMEMBEDDEDPAGEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Embid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumembeddedpage_Dao _obj = new mvnforumembeddedpage_Dao();
            _obj.setEmbid(arr.getInt("EMBID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setPagenameindex(arr.getInt("PAGENAMEINDEX"));
            _obj.setOwnername(arr.getString("OWNERNAME"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMEMBEDDEDPAGE返回的查询DataRow创建一个MVNFORUMEMBEDDEDPAGEEntity对象
* @param MVNFORUMEMBEDDEDPAGE row
* @returnMVNFORUMEMBEDDEDPAGEList对象
* @throws Exception 
*/
public List<mvnforumembeddedpage_Dao> get_mvnforumembeddedpage_All() throws Exception{
        List<mvnforumembeddedpage_Dao> _list = new ArrayList<mvnforumembeddedpage_Dao>();
		String sqlStr = "{ call MVNFORUMEMBEDDEDPAGE_PRO.GetMVNFORUMEMBEDDEDPAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumembeddedpage_Dao _obj = new mvnforumembeddedpage_Dao();
            _obj.setEmbid(arr.getInt("EMBID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setPagenameindex(arr.getInt("PAGENAMEINDEX"));
            _obj.setOwnername(arr.getString("OWNERNAME"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMEMBEDDEDPAGE返回的查询DataRow创建一个MVNFORUMEMBEDDEDPAGEEntity对象
* @param MVNFORUMEMBEDDEDPAGE row
* @returnMVNFORUMEMBEDDEDPAGEList对象
* @throws Exception 
*/
public List< mvnforumembeddedpage_Dao> get_mvnforumembeddedpage_All(String strWhere) throws Exception{
         List<mvnforumembeddedpage_Dao> _list = new ArrayList<mvnforumembeddedpage_Dao>();
		 String sqlStr = "{ call MVNFORUMEMBEDDEDPAGE_PRO.GetMVNFORUMEMBEDDEDPAGEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumembeddedpage_Dao _obj = new mvnforumembeddedpage_Dao();
            _obj.setEmbid(arr.getInt("EMBID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setPagenameindex(arr.getInt("PAGENAMEINDEX"));
            _obj.setOwnername(arr.getString("OWNERNAME"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMEMBEDDEDPAGE返回 分页数据
* @param MVNFORUMEMBEDDEDPAGE row
* @returnMVNFORUMEMBEDDEDPAGEList对象
* @throws Exception 
*/
public List<mvnforumembeddedpage_Dao> get_mvnforumembeddedpage_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumembeddedpage_Dao> _list = new ArrayList<mvnforumembeddedpage_Dao>();
		String sqlStr = "{ call MVNFORUMEMBEDDEDPAGE_PRO.GetMVNFORUMEMBEDDEDPAGEPage(?,?,?,?,?,?)}";
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
				mvnforumembeddedpage_Dao _obj = new mvnforumembeddedpage_Dao();
            _obj.setEmbid(arr.getInt("EMBID"));
            _obj.setPageid(arr.getInt("PAGEID"));
            _obj.setPagenameindex(arr.getInt("PAGENAMEINDEX"));
            _obj.setOwnername(arr.getString("OWNERNAME"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMEMBEDDEDPAGE返回的查询DataRow创建一个MVNFORUMEMBEDDEDPAGEEntity对象
* @param MVNFORUMEMBEDDEDPAGE row
* @returnMVNFORUMEMBEDDEDPAGEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumembeddedpage_Dao> get_mvnforumembeddedpage_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumembeddedpagestrWhere") == null) {
			Dictionary<Integer, mvnforumembeddedpage_Dao> _dic = new Hashtable<Integer, mvnforumembeddedpage_Dao>();
			List<mvnforumembeddedpage_Dao> _list = new ArrayList<mvnforumembeddedpage_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getEmbid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumembeddedpage", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumembeddedpage_Dao> _dic = (Dictionary<Integer, mvnforumembeddedpage_Dao>) classFactory
					.cacheGet("dicmvnforumembeddedpagestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMEMBEDDEDPAGE字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumembeddedpage_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMEMBEDDEDPAGE_PRO.UpdateFieldMVNFORUMEMBEDDEDPAGE(?,?)}";
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
* 更新MVNFORUMEMBEDDEDPAGEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumembeddedpage_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMEMBEDDEDPAGE_PRO.UpdateFieldMVNFORUMEMBEDDEDPAGEV(?,?,?)}";
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
* 更新MVNFORUMEMBEDDEDPAGEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumembeddedpage_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMEMBEDDEDPAGE_PRO.UpdateFieldMVNFORUMEMBEDDEDPAGEU(?,?,?)}";
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
