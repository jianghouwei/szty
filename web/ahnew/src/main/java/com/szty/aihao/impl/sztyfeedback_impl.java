/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSztyfeedback.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sztyfeedback_Dao;
import com.szty.aihao.core.sztyfeedback_core;
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
*@SZTYFEEDBACK数据接口
*@作者：宋春林 
*/
public class sztyfeedback_impl implements sztyfeedback_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sztyfeedback_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTYFEEDBACK实体
* @return 新插入记录的编号
*/
public int insert_sztyfeedback(sztyfeedback_Dao _SZTYFEEDBACKModel)  throws Exception{
         String sqlStr = "{call SZTYFEEDBACK_PRO.InsertSZTYFEEDBACK(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTYFEEDBACKModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getOrderno());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getPlatform());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getMobile());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getImsi());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getBrand());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getModel());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getInfotype());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getContent());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_SZTYFEEDBACKModel.getFeedbacktime()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getProductcode());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTYFEEDBACK
* @Object 
* @return 新插入记录的编号
*/
public int insert_sztyfeedback(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTYFEEDBACK_PRO.InsertSZTYFEEDBACK(?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[11];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_para[9]));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SZTYFEEDBACK实体
* @return 影响的行数
*/
public int update_sztyfeedback(sztyfeedback_Dao _SZTYFEEDBACKModel)  throws Exception{
        String sqlStr = "{call SZTYFEEDBACK_PRO.UpdateSZTYFEEDBACK(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.BIGINT,_SZTYFEEDBACKModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getOrderno());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getPlatform());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getMobile());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getImsi());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getBrand());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getModel());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getInfotype());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getContent());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_SZTYFEEDBACKModel.getFeedbacktime()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_SZTYFEEDBACKModel.getProductcode());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTYFEEDBACK中的一条记录
* @param SZTYFEEDBACK实体
* @return 新插入记录的编号
*/
public int delete_sztyfeedback(int Id)  throws Exception{
        String sqlStr = "{call SZTYFEEDBACK_PRO.DeleteSZTYFEEDBACK(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 sztyfeedback 数据实体
* @param Id">Id
* @return<sztyfeedback 数据实体
* @throws Exception 
*/
public sztyfeedback_Dao get_sztyfeedbackDao(int Id) throws Exception{
         String sqlStr = "{ call SZTYFEEDBACK_PRO.GetSZTYFEEDBACKEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyfeedback_Dao _obj = new sztyfeedback_Dao();
            _obj.setOrderno(arr.getString("ORDERNO"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setBrand(arr.getString("BRAND"));
            _obj.setModel(arr.getString("MODEL"));
            _obj.setInfotype(arr.getString("INFOTYPE"));
            _obj.setContent(arr.getString("CONTENT"));
             try{_obj.setFeedbacktime(dateformat.parse(arr.getString("FEEDBACKTIME")));}catch(Exception ce){_obj.setFeedbacktime((new Date()));}
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
			return _obj;
		}
		return null;

}

/**
* 根据SZTYFEEDBACK返回的查询DataRow创建一个SZTYFEEDBACKEntity对象
* @param SZTYFEEDBACK row
* @returnSZTYFEEDBACKList对象
* @throws Exception 
*/
public List<sztyfeedback_Dao> get_sztyfeedback_All() throws Exception{
        List<sztyfeedback_Dao> _list = new ArrayList<sztyfeedback_Dao>();
		String sqlStr = "{ call SZTYFEEDBACK_PRO.GetSZTYFEEDBACK(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyfeedback_Dao _obj = new sztyfeedback_Dao();
            _obj.setOrderno(arr.getString("ORDERNO"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setBrand(arr.getString("BRAND"));
            _obj.setModel(arr.getString("MODEL"));
            _obj.setInfotype(arr.getString("INFOTYPE"));
            _obj.setContent(arr.getString("CONTENT"));
            try{_obj.setFeedbacktime(dateformat.parse(arr.getString("FEEDBACKTIME")));}catch(Exception ce){_obj.setFeedbacktime((new Date()));}
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTYFEEDBACK返回的查询DataRow创建一个SZTYFEEDBACKEntity对象
* @param SZTYFEEDBACK row
* @returnSZTYFEEDBACKList对象
* @throws Exception 
*/
public List< sztyfeedback_Dao> get_sztyfeedback_All(String strWhere) throws Exception{
         List<sztyfeedback_Dao> _list = new ArrayList<sztyfeedback_Dao>();
		 String sqlStr = "{ call SZTYFEEDBACK_PRO.GetSZTYFEEDBACKWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sztyfeedback_Dao _obj = new sztyfeedback_Dao();
            _obj.setOrderno(arr.getString("ORDERNO"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setBrand(arr.getString("BRAND"));
            _obj.setModel(arr.getString("MODEL"));
            _obj.setInfotype(arr.getString("INFOTYPE"));
            _obj.setContent(arr.getString("CONTENT"));
           try{_obj.setFeedbacktime(dateformat.parse(arr.getString("FEEDBACKTIME")));}catch(Exception ce){_obj.setFeedbacktime((new Date()));}
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTYFEEDBACK返回 分页数据
* @param SZTYFEEDBACK row
* @returnSZTYFEEDBACKList对象
* @throws Exception 
*/
public List<sztyfeedback_Dao> get_sztyfeedback_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sztyfeedback_Dao> _list = new ArrayList<sztyfeedback_Dao>();
		String sqlStr = "{ call SZTYFEEDBACK_PRO.GetSZTYFEEDBACKPage(?,?,?,?,?,?)}";
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
				sztyfeedback_Dao _obj = new sztyfeedback_Dao();
            _obj.setOrderno(arr.getString("ORDERNO"));
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setBrand(arr.getString("BRAND"));
            _obj.setModel(arr.getString("MODEL"));
            _obj.setInfotype(arr.getString("INFOTYPE"));
            _obj.setContent(arr.getString("CONTENT"));
            try{_obj.setFeedbacktime(dateformat.parse(arr.getString("FEEDBACKTIME")));}catch(Exception ce){_obj.setFeedbacktime((new Date()));}
            _obj.setProductcode(arr.getString("PRODUCTCODE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTYFEEDBACK返回的查询DataRow创建一个SZTYFEEDBACKEntity对象
* @param SZTYFEEDBACK row
* @returnSZTYFEEDBACKDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, sztyfeedback_Dao> get_sztyfeedback_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsztyfeedbackstrWhere") == null) {
			Dictionary<Integer, sztyfeedback_Dao> _dic = new Hashtable<Integer, sztyfeedback_Dao>();
			List<sztyfeedback_Dao> _list = new ArrayList<sztyfeedback_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((int)(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicsztyfeedback", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sztyfeedback_Dao> _dic = (Dictionary<Integer, sztyfeedback_Dao>) classFactory
					.cacheGet("dicsztyfeedbackstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTYFEEDBACK字段加一
* @param FieldName
* @param sid
*/
public int create_sztyfeedback_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTYFEEDBACK_PRO.UpdateFieldSZTYFEEDBACK(?,?)}";
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
* 更新SZTYFEEDBACKInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_sztyfeedback_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTYFEEDBACK_PRO.UpdateFieldSZTYFEEDBACKV(?,?,?)}";
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
* 更新SZTYFEEDBACKIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_sztyfeedback_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTYFEEDBACK_PRO.UpdateFieldSZTYFEEDBACKU(?,?,?)}";
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
