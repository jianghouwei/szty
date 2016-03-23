/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumpmattachmessage.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumpmattachmessage_Dao;
import com.szty.aihao.core.mvnforumpmattachmessage_core;
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
*@MVNFORUMPMATTACHMESSAGE数据接口
*@作者：宋春林 
*/
public class mvnforumpmattachmessage_impl implements mvnforumpmattachmessage_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumpmattachmessage_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPMATTACHMESSAGE实体
* @return 新插入记录的编号
*/
public int insert_mvnforumpmattachmessage(mvnforumpmattachmessage_Dao _MVNFORUMPMATTACHMESSAGEModel)  throws Exception{
         String sqlStr = "{call MVNFORUMPMATTACHMESSAGE_PRO.InsertMVNFORUMPMATTACHMESSAGE(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMESSAGEModel.getMessageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMESSAGEModel.getPmattachid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMESSAGEModel.getRelationtype());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMESSAGEModel.getRelationoption());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMESSAGEModel.getRelationstatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPMATTACHMESSAGE
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumpmattachmessage(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMPMATTACHMESSAGE_PRO.InsertMVNFORUMPMATTACHMESSAGE(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMPMATTACHMESSAGE实体
* @return 影响的行数
*/
public int update_mvnforumpmattachmessage(mvnforumpmattachmessage_Dao _MVNFORUMPMATTACHMESSAGEModel)  throws Exception{
        String sqlStr = "{call MVNFORUMPMATTACHMESSAGE_PRO.UpdateMVNFORUMPMATTACHMESSAGE(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMESSAGEModel.getMessageid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMESSAGEModel.getPmattachid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMESSAGEModel.getRelationtype());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMESSAGEModel.getRelationoption());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMESSAGEModel.getRelationstatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMPMATTACHMESSAGE中的一条记录
* @param MVNFORUMPMATTACHMESSAGE实体
* @return 新插入记录的编号
*/
public int delete_mvnforumpmattachmessage(int Messageid)  throws Exception{
        String sqlStr = "{call MVNFORUMPMATTACHMESSAGE_PRO.DeleteMVNFORUMPMATTACHMESSAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Messageid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumpmattachmessage 数据实体
* @param Messageid">Messageid
* @return<mvnforumpmattachmessage 数据实体
* @throws Exception 
*/
public mvnforumpmattachmessage_Dao get_mvnforumpmattachmessageDao(int Messageid) throws Exception{
         String sqlStr = "{ call MVNFORUMPMATTACHMESSAGE_PRO.GetMVNFORUMPMATTACHMESSAGEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Messageid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumpmattachmessage_Dao _obj = new mvnforumpmattachmessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setPmattachid(arr.getInt("PMATTACHID"));
            _obj.setRelationtype(arr.getInt("RELATIONTYPE"));
            _obj.setRelationoption(arr.getInt("RELATIONOPTION"));
            _obj.setRelationstatus(arr.getInt("RELATIONSTATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMPMATTACHMESSAGE返回的查询DataRow创建一个MVNFORUMPMATTACHMESSAGEEntity对象
* @param MVNFORUMPMATTACHMESSAGE row
* @returnMVNFORUMPMATTACHMESSAGEList对象
* @throws Exception 
*/
public List<mvnforumpmattachmessage_Dao> get_mvnforumpmattachmessage_All() throws Exception{
        List<mvnforumpmattachmessage_Dao> _list = new ArrayList<mvnforumpmattachmessage_Dao>();
		String sqlStr = "{ call MVNFORUMPMATTACHMESSAGE_PRO.GetMVNFORUMPMATTACHMESSAGE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumpmattachmessage_Dao _obj = new mvnforumpmattachmessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setPmattachid(arr.getInt("PMATTACHID"));
            _obj.setRelationtype(arr.getInt("RELATIONTYPE"));
            _obj.setRelationoption(arr.getInt("RELATIONOPTION"));
            _obj.setRelationstatus(arr.getInt("RELATIONSTATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMPMATTACHMESSAGE返回的查询DataRow创建一个MVNFORUMPMATTACHMESSAGEEntity对象
* @param MVNFORUMPMATTACHMESSAGE row
* @returnMVNFORUMPMATTACHMESSAGEList对象
* @throws Exception 
*/
public List< mvnforumpmattachmessage_Dao> get_mvnforumpmattachmessage_All(String strWhere) throws Exception{
         List<mvnforumpmattachmessage_Dao> _list = new ArrayList<mvnforumpmattachmessage_Dao>();
		 String sqlStr = "{ call MVNFORUMPMATTACHMESSAGE_PRO.GetMVNFORUMPMATTACHMESSAGEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumpmattachmessage_Dao _obj = new mvnforumpmattachmessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setPmattachid(arr.getInt("PMATTACHID"));
            _obj.setRelationtype(arr.getInt("RELATIONTYPE"));
            _obj.setRelationoption(arr.getInt("RELATIONOPTION"));
            _obj.setRelationstatus(arr.getInt("RELATIONSTATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMPMATTACHMESSAGE返回 分页数据
* @param MVNFORUMPMATTACHMESSAGE row
* @returnMVNFORUMPMATTACHMESSAGEList对象
* @throws Exception 
*/
public List<mvnforumpmattachmessage_Dao> get_mvnforumpmattachmessage_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumpmattachmessage_Dao> _list = new ArrayList<mvnforumpmattachmessage_Dao>();
		String sqlStr = "{ call MVNFORUMPMATTACHMESSAGE_PRO.GetMVNFORUMPMATTACHMESSAGEPage(?,?,?,?,?,?)}";
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
				mvnforumpmattachmessage_Dao _obj = new mvnforumpmattachmessage_Dao();
            _obj.setMessageid(arr.getInt("MESSAGEID"));
            _obj.setPmattachid(arr.getInt("PMATTACHID"));
            _obj.setRelationtype(arr.getInt("RELATIONTYPE"));
            _obj.setRelationoption(arr.getInt("RELATIONOPTION"));
            _obj.setRelationstatus(arr.getInt("RELATIONSTATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMPMATTACHMESSAGE返回的查询DataRow创建一个MVNFORUMPMATTACHMESSAGEEntity对象
* @param MVNFORUMPMATTACHMESSAGE row
* @returnMVNFORUMPMATTACHMESSAGEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumpmattachmessage_Dao> get_mvnforumpmattachmessage_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumpmattachmessagestrWhere") == null) {
			Dictionary<Integer, mvnforumpmattachmessage_Dao> _dic = new Hashtable<Integer, mvnforumpmattachmessage_Dao>();
			List<mvnforumpmattachmessage_Dao> _list = new ArrayList<mvnforumpmattachmessage_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMessageid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumpmattachmessage", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumpmattachmessage_Dao> _dic = (Dictionary<Integer, mvnforumpmattachmessage_Dao>) classFactory
					.cacheGet("dicmvnforumpmattachmessagestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMPMATTACHMESSAGE字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumpmattachmessage_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMPMATTACHMESSAGE_PRO.UpdateFieldMVNFORUMPMATTACHMESSAGE(?,?)}";
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
* 更新MVNFORUMPMATTACHMESSAGEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumpmattachmessage_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMPMATTACHMESSAGE_PRO.UpdateFieldMVNFORUMPMATTACHMESSAGEV(?,?,?)}";
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
* 更新MVNFORUMPMATTACHMESSAGEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumpmattachmessage_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMPMATTACHMESSAGE_PRO.UpdateFieldMVNFORUMPMATTACHMESSAGEU(?,?,?)}";
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
