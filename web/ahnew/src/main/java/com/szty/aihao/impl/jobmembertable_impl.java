/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataJobmembertable.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.jobmembertable_Dao;
import com.szty.aihao.core.jobmembertable_core;
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
*@JOBMEMBERTABLE数据接口
*@作者：宋春林 
*/
public class jobmembertable_impl implements jobmembertable_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(jobmembertable_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param JOBMEMBERTABLE实体
* @return 新插入记录的编号
*/
public int insert_jobmembertable(jobmembertable_Dao _JOBMEMBERTABLEModel)  throws Exception{
         String sqlStr = "{call JOBMEMBERTABLE_PRO.InsertJOBMEMBERTABLE(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_JOBMEMBERTABLEModel.getJobmemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_JOBMEMBERTABLEModel.getMobile());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_JOBMEMBERTABLEModel.getJobid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_JOBMEMBERTABLEModel.getCdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_JOBMEMBERTABLEModel.getUserid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param JOBMEMBERTABLE
* @Object 
* @return 新插入记录的编号
*/
public int insert_jobmembertable(Object[] _para)  throws Exception{
      String sqlStr = "{call JOBMEMBERTABLE_PRO.InsertJOBMEMBERTABLE(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param JOBMEMBERTABLE实体
* @return 影响的行数
*/
public int update_jobmembertable(jobmembertable_Dao _JOBMEMBERTABLEModel)  throws Exception{
        String sqlStr = "{call JOBMEMBERTABLE_PRO.UpdateJOBMEMBERTABLE(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_JOBMEMBERTABLEModel.getJobmemberid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_JOBMEMBERTABLEModel.getMobile());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_JOBMEMBERTABLEModel.getJobid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_JOBMEMBERTABLEModel.getCdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_JOBMEMBERTABLEModel.getUserid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表JOBMEMBERTABLE中的一条记录
* @param JOBMEMBERTABLE实体
* @return 新插入记录的编号
*/
public int delete_jobmembertable(int Jobmemberid)  throws Exception{
        String sqlStr = "{call JOBMEMBERTABLE_PRO.DeleteJOBMEMBERTABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Jobmemberid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 jobmembertable 数据实体
* @param Jobmemberid">Jobmemberid
* @return<jobmembertable 数据实体
* @throws Exception 
*/
public jobmembertable_Dao get_jobmembertableDao(int Jobmemberid) throws Exception{
         String sqlStr = "{ call JOBMEMBERTABLE_PRO.GetJOBMEMBERTABLEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Jobmemberid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			jobmembertable_Dao _obj = new jobmembertable_Dao();
            _obj.setJobmemberid(arr.getInt("JOBMEMBERID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setJobid(arr.getInt("JOBID"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setUserid(arr.getString("USERID"));
			return _obj;
		}
		return null;

}

/**
* 根据JOBMEMBERTABLE返回的查询DataRow创建一个JOBMEMBERTABLEEntity对象
* @param JOBMEMBERTABLE row
* @returnJOBMEMBERTABLEList对象
* @throws Exception 
*/
public List<jobmembertable_Dao> get_jobmembertable_All() throws Exception{
        List<jobmembertable_Dao> _list = new ArrayList<jobmembertable_Dao>();
		String sqlStr = "{ call JOBMEMBERTABLE_PRO.GetJOBMEMBERTABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			jobmembertable_Dao _obj = new jobmembertable_Dao();
            _obj.setJobmemberid(arr.getInt("JOBMEMBERID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setJobid(arr.getInt("JOBID"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setUserid(arr.getString("USERID"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据JOBMEMBERTABLE返回的查询DataRow创建一个JOBMEMBERTABLEEntity对象
* @param JOBMEMBERTABLE row
* @returnJOBMEMBERTABLEList对象
* @throws Exception 
*/
public List< jobmembertable_Dao> get_jobmembertable_All(String strWhere) throws Exception{
         List<jobmembertable_Dao> _list = new ArrayList<jobmembertable_Dao>();
		 String sqlStr = "{ call JOBMEMBERTABLE_PRO.GetJOBMEMBERTABLEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				jobmembertable_Dao _obj = new jobmembertable_Dao();
            _obj.setJobmemberid(arr.getInt("JOBMEMBERID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setJobid(arr.getInt("JOBID"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setUserid(arr.getString("USERID"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据JOBMEMBERTABLE返回 分页数据
* @param JOBMEMBERTABLE row
* @returnJOBMEMBERTABLEList对象
* @throws Exception 
*/
public List<jobmembertable_Dao> get_jobmembertable_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<jobmembertable_Dao> _list = new ArrayList<jobmembertable_Dao>();
		String sqlStr = "{ call JOBMEMBERTABLE_PRO.GetJOBMEMBERTABLEPage(?,?,?,?,?,?)}";
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
				jobmembertable_Dao _obj = new jobmembertable_Dao();
            _obj.setJobmemberid(arr.getInt("JOBMEMBERID"));
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setJobid(arr.getInt("JOBID"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setUserid(arr.getString("USERID"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据JOBMEMBERTABLE返回的查询DataRow创建一个JOBMEMBERTABLEEntity对象
* @param JOBMEMBERTABLE row
* @returnJOBMEMBERTABLEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, jobmembertable_Dao> get_jobmembertable_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicjobmembertablestrWhere") == null) {
			Dictionary<Integer, jobmembertable_Dao> _dic = new Hashtable<Integer, jobmembertable_Dao>();
			List<jobmembertable_Dao> _list = new ArrayList<jobmembertable_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getJobmemberid()), _list.get(i));
			}
			classFactory.cachePut("dicjobmembertable", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, jobmembertable_Dao> _dic = (Dictionary<Integer, jobmembertable_Dao>) classFactory
					.cacheGet("dicjobmembertablestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新JOBMEMBERTABLE字段加一
* @param FieldName
* @param sid
*/
public int create_jobmembertable_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call JOBMEMBERTABLE_PRO.UpdateFieldJOBMEMBERTABLE(?,?)}";
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
* 更新JOBMEMBERTABLEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_jobmembertable_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call JOBMEMBERTABLE_PRO.UpdateFieldJOBMEMBERTABLEV(?,?,?)}";
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
* 更新JOBMEMBERTABLEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_jobmembertable_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call JOBMEMBERTABLE_PRO.UpdateFieldJOBMEMBERTABLEU(?,?,?)}";
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
