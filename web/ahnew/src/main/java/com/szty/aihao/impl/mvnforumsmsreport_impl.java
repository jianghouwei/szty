/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumsmsreport.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumsmsreport_Dao;
import com.szty.aihao.core.mvnforumsmsreport_core;
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
*@MVNFORUMSMSREPORT数据接口
*@作者：宋春林 
*/
public class mvnforumsmsreport_impl implements mvnforumsmsreport_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumsmsreport_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSMSREPORT实体
* @return 新插入记录的编号
*/
public int insert_mvnforumsmsreport(mvnforumsmsreport_Dao _MVNFORUMSMSREPORTModel)  throws Exception{
         String sqlStr = "{call MVNFORUMSMSREPORT_PRO.InsertMVNFORUMSMSREPORT(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMSMSREPORTModel.getReportid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSREPORTModel.getSpid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSREPORTModel.getMobile());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSREPORTModel.getLinkid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSREPORTModel.getReport());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSMSREPORTModel.getReportcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSMSREPORT
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumsmsreport(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMSMSREPORT_PRO.InsertMVNFORUMSMSREPORT(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMSMSREPORT实体
* @return 影响的行数
*/
public int update_mvnforumsmsreport(mvnforumsmsreport_Dao _MVNFORUMSMSREPORTModel)  throws Exception{
        String sqlStr = "{call MVNFORUMSMSREPORT_PRO.UpdateMVNFORUMSMSREPORT(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMSMSREPORTModel.getReportid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSREPORTModel.getSpid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSREPORTModel.getMobile());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSREPORTModel.getLinkid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSMSREPORTModel.getReport());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSMSREPORTModel.getReportcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMSMSREPORT中的一条记录
* @param MVNFORUMSMSREPORT实体
* @return 新插入记录的编号
*/
public int delete_mvnforumsmsreport(int Reportid)  throws Exception{
        String sqlStr = "{call MVNFORUMSMSREPORT_PRO.DeleteMVNFORUMSMSREPORT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Reportid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumsmsreport 数据实体
* @param Reportid">Reportid
* @return<mvnforumsmsreport 数据实体
* @throws Exception 
*/
public mvnforumsmsreport_Dao get_mvnforumsmsreportDao(int Reportid) throws Exception{
         String sqlStr = "{ call MVNFORUMSMSREPORT_PRO.GetMVNFORUMSMSREPORTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Reportid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsmsreport_Dao _obj = new mvnforumsmsreport_Dao();
            _obj.setReportid(arr.getInt("REPORTID"));
            _obj.setSpid(arr.getString("SPID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setLinkid(arr.getString("LINKID"));
            _obj.setReport(arr.getString("REPORT"));
             try{_obj.setReportcreationdate(dateformat.parse(arr.getString("REPORTCREATIONDATE")));}catch(Exception ce){_obj.setReportcreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMSMSREPORT返回的查询DataRow创建一个MVNFORUMSMSREPORTEntity对象
* @param MVNFORUMSMSREPORT row
* @returnMVNFORUMSMSREPORTList对象
* @throws Exception 
*/
public List<mvnforumsmsreport_Dao> get_mvnforumsmsreport_All() throws Exception{
        List<mvnforumsmsreport_Dao> _list = new ArrayList<mvnforumsmsreport_Dao>();
		String sqlStr = "{ call MVNFORUMSMSREPORT_PRO.GetMVNFORUMSMSREPORT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsmsreport_Dao _obj = new mvnforumsmsreport_Dao();
            _obj.setReportid(arr.getInt("REPORTID"));
            _obj.setSpid(arr.getString("SPID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setLinkid(arr.getString("LINKID"));
            _obj.setReport(arr.getString("REPORT"));
            try{_obj.setReportcreationdate(dateformat.parse(arr.getString("REPORTCREATIONDATE")));}catch(Exception ce){_obj.setReportcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMSMSREPORT返回的查询DataRow创建一个MVNFORUMSMSREPORTEntity对象
* @param MVNFORUMSMSREPORT row
* @returnMVNFORUMSMSREPORTList对象
* @throws Exception 
*/
public List< mvnforumsmsreport_Dao> get_mvnforumsmsreport_All(String strWhere) throws Exception{
         List<mvnforumsmsreport_Dao> _list = new ArrayList<mvnforumsmsreport_Dao>();
		 String sqlStr = "{ call MVNFORUMSMSREPORT_PRO.GetMVNFORUMSMSREPORTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumsmsreport_Dao _obj = new mvnforumsmsreport_Dao();
            _obj.setReportid(arr.getInt("REPORTID"));
            _obj.setSpid(arr.getString("SPID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setLinkid(arr.getString("LINKID"));
            _obj.setReport(arr.getString("REPORT"));
           try{_obj.setReportcreationdate(dateformat.parse(arr.getString("REPORTCREATIONDATE")));}catch(Exception ce){_obj.setReportcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMSMSREPORT返回 分页数据
* @param MVNFORUMSMSREPORT row
* @returnMVNFORUMSMSREPORTList对象
* @throws Exception 
*/
public List<mvnforumsmsreport_Dao> get_mvnforumsmsreport_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumsmsreport_Dao> _list = new ArrayList<mvnforumsmsreport_Dao>();
		String sqlStr = "{ call MVNFORUMSMSREPORT_PRO.GetMVNFORUMSMSREPORTPage(?,?,?,?,?,?)}";
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
				mvnforumsmsreport_Dao _obj = new mvnforumsmsreport_Dao();
            _obj.setReportid(arr.getInt("REPORTID"));
            _obj.setSpid(arr.getString("SPID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setLinkid(arr.getString("LINKID"));
            _obj.setReport(arr.getString("REPORT"));
            try{_obj.setReportcreationdate(dateformat.parse(arr.getString("REPORTCREATIONDATE")));}catch(Exception ce){_obj.setReportcreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMSMSREPORT返回的查询DataRow创建一个MVNFORUMSMSREPORTEntity对象
* @param MVNFORUMSMSREPORT row
* @returnMVNFORUMSMSREPORTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumsmsreport_Dao> get_mvnforumsmsreport_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumsmsreportstrWhere") == null) {
			Dictionary<Integer, mvnforumsmsreport_Dao> _dic = new Hashtable<Integer, mvnforumsmsreport_Dao>();
			List<mvnforumsmsreport_Dao> _list = new ArrayList<mvnforumsmsreport_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getReportid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumsmsreport", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumsmsreport_Dao> _dic = (Dictionary<Integer, mvnforumsmsreport_Dao>) classFactory
					.cacheGet("dicmvnforumsmsreportstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMSMSREPORT字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumsmsreport_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMSMSREPORT_PRO.UpdateFieldMVNFORUMSMSREPORT(?,?)}";
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
* 更新MVNFORUMSMSREPORTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumsmsreport_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMSMSREPORT_PRO.UpdateFieldMVNFORUMSMSREPORTV(?,?,?)}";
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
* 更新MVNFORUMSMSREPORTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumsmsreport_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMSMSREPORT_PRO.UpdateFieldMVNFORUMSMSREPORTU(?,?,?)}";
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
