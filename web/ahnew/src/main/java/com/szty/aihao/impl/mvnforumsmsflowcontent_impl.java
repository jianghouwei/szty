/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumsmsflowcontent.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumsmsflowcontent_Dao;
import com.szty.aihao.core.mvnforumsmsflowcontent_core;
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
*@MVNFORUMSMSFLOWCONTENT数据接口
*@作者：宋春林 
*/
public class mvnforumsmsflowcontent_impl implements mvnforumsmsflowcontent_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumsmsflowcontent_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSMSFLOWCONTENT实体
* @return 新插入记录的编号
*/
public int insert_mvnforumsmsflowcontent(mvnforumsmsflowcontent_Dao _MVNFORUMSMSFLOWCONTENTModel)  throws Exception{
         String sqlStr = "{call MVNFORUMSMSFLOWCONTENT_PRO.InsertMVNFORUMSMSFLOWCONTENT(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMSMSFLOWCONTENTModel.getFlowcontentid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSFLOWCONTENTModel.getProductname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMSMSFLOWCONTENTModel.getStep());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSFLOWCONTENTModel.getContent());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSMSFLOWCONTENTModel.getFlowcontentcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSMSFLOWCONTENT
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumsmsflowcontent(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMSMSFLOWCONTENT_PRO.InsertMVNFORUMSMSFLOWCONTENT(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
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
* @param MVNFORUMSMSFLOWCONTENT实体
* @return 影响的行数
*/
public int update_mvnforumsmsflowcontent(mvnforumsmsflowcontent_Dao _MVNFORUMSMSFLOWCONTENTModel)  throws Exception{
        String sqlStr = "{call MVNFORUMSMSFLOWCONTENT_PRO.UpdateMVNFORUMSMSFLOWCONTENT(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMSMSFLOWCONTENTModel.getFlowcontentid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSFLOWCONTENTModel.getProductname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMSMSFLOWCONTENTModel.getStep());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSFLOWCONTENTModel.getContent());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSMSFLOWCONTENTModel.getFlowcontentcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMSMSFLOWCONTENT中的一条记录
* @param MVNFORUMSMSFLOWCONTENT实体
* @return 新插入记录的编号
*/
public int delete_mvnforumsmsflowcontent(int Flowcontentid)  throws Exception{
        String sqlStr = "{call MVNFORUMSMSFLOWCONTENT_PRO.DeleteMVNFORUMSMSFLOWCONTENT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Flowcontentid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumsmsflowcontent 数据实体
* @param Flowcontentid">Flowcontentid
* @return<mvnforumsmsflowcontent 数据实体
* @throws Exception 
*/
public mvnforumsmsflowcontent_Dao get_mvnforumsmsflowcontentDao(int Flowcontentid) throws Exception{
         String sqlStr = "{ call MVNFORUMSMSFLOWCONTENT_PRO.GetMVNFORUMSMSFLOWCONTENTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Flowcontentid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsmsflowcontent_Dao _obj = new mvnforumsmsflowcontent_Dao();
            _obj.setFlowcontentid(arr.getInt("FLOWCONTENTID"));
            _obj.setProductname(arr.getString("PRODUCTNAME"));
            _obj.setStep(arr.getInt("STEP"));
            _obj.setContent(arr.getString("CONTENT"));
             try{_obj.setFlowcontentcreationdate(dateformat.parse(arr.getString("FLOWCONTENTCREATIONDATE")));}catch(Exception ce){_obj.setFlowcontentcreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMSMSFLOWCONTENT返回的查询DataRow创建一个MVNFORUMSMSFLOWCONTENTEntity对象
* @param MVNFORUMSMSFLOWCONTENT row
* @returnMVNFORUMSMSFLOWCONTENTList对象
* @throws Exception 
*/
public List<mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_All() throws Exception{
        List<mvnforumsmsflowcontent_Dao> _list = new ArrayList<mvnforumsmsflowcontent_Dao>();
		String sqlStr = "{ call MVNFORUMSMSFLOWCONTENT_PRO.GetMVNFORUMSMSFLOWCONTENT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsmsflowcontent_Dao _obj = new mvnforumsmsflowcontent_Dao();
            _obj.setFlowcontentid(arr.getInt("FLOWCONTENTID"));
            _obj.setProductname(arr.getString("PRODUCTNAME"));
            _obj.setStep(arr.getInt("STEP"));
            _obj.setContent(arr.getString("CONTENT"));
            try{_obj.setFlowcontentcreationdate(dateformat.parse(arr.getString("FLOWCONTENTCREATIONDATE")));}catch(Exception ce){_obj.setFlowcontentcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMSMSFLOWCONTENT返回的查询DataRow创建一个MVNFORUMSMSFLOWCONTENTEntity对象
* @param MVNFORUMSMSFLOWCONTENT row
* @returnMVNFORUMSMSFLOWCONTENTList对象
* @throws Exception 
*/
public List< mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_All(String strWhere) throws Exception{
         List<mvnforumsmsflowcontent_Dao> _list = new ArrayList<mvnforumsmsflowcontent_Dao>();
		 String sqlStr = "{ call MVNFORUMSMSFLOWCONTENT_PRO.GetMVNFORUMSMSFLOWCONTENTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumsmsflowcontent_Dao _obj = new mvnforumsmsflowcontent_Dao();
            _obj.setFlowcontentid(arr.getInt("FLOWCONTENTID"));
            _obj.setProductname(arr.getString("PRODUCTNAME"));
            _obj.setStep(arr.getInt("STEP"));
            _obj.setContent(arr.getString("CONTENT"));
           try{_obj.setFlowcontentcreationdate(dateformat.parse(arr.getString("FLOWCONTENTCREATIONDATE")));}catch(Exception ce){_obj.setFlowcontentcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMSMSFLOWCONTENT返回 分页数据
* @param MVNFORUMSMSFLOWCONTENT row
* @returnMVNFORUMSMSFLOWCONTENTList对象
* @throws Exception 
*/
public List<mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumsmsflowcontent_Dao> _list = new ArrayList<mvnforumsmsflowcontent_Dao>();
		String sqlStr = "{ call MVNFORUMSMSFLOWCONTENT_PRO.GetMVNFORUMSMSFLOWCONTENTPage(?,?,?,?,?,?)}";
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
				mvnforumsmsflowcontent_Dao _obj = new mvnforumsmsflowcontent_Dao();
            _obj.setFlowcontentid(arr.getInt("FLOWCONTENTID"));
            _obj.setProductname(arr.getString("PRODUCTNAME"));
            _obj.setStep(arr.getInt("STEP"));
            _obj.setContent(arr.getString("CONTENT"));
            try{_obj.setFlowcontentcreationdate(dateformat.parse(arr.getString("FLOWCONTENTCREATIONDATE")));}catch(Exception ce){_obj.setFlowcontentcreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMSMSFLOWCONTENT返回的查询DataRow创建一个MVNFORUMSMSFLOWCONTENTEntity对象
* @param MVNFORUMSMSFLOWCONTENT row
* @returnMVNFORUMSMSFLOWCONTENTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumsmsflowcontentstrWhere") == null) {
			Dictionary<Integer, mvnforumsmsflowcontent_Dao> _dic = new Hashtable<Integer, mvnforumsmsflowcontent_Dao>();
			List<mvnforumsmsflowcontent_Dao> _list = new ArrayList<mvnforumsmsflowcontent_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getFlowcontentid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumsmsflowcontent", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumsmsflowcontent_Dao> _dic = (Dictionary<Integer, mvnforumsmsflowcontent_Dao>) classFactory
					.cacheGet("dicmvnforumsmsflowcontentstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMSMSFLOWCONTENT字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumsmsflowcontent_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMSMSFLOWCONTENT_PRO.UpdateFieldMVNFORUMSMSFLOWCONTENT(?,?)}";
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
* 更新MVNFORUMSMSFLOWCONTENTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumsmsflowcontent_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMSMSFLOWCONTENT_PRO.UpdateFieldMVNFORUMSMSFLOWCONTENTV(?,?,?)}";
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
* 更新MVNFORUMSMSFLOWCONTENTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumsmsflowcontent_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMSMSFLOWCONTENT_PRO.UpdateFieldMVNFORUMSMSFLOWCONTENTU(?,?,?)}";
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
