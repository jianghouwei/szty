/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataJobtable.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.jobtable_Dao;
import com.szty.aihao.core.jobtable_core;
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
*@JOBTABLE数据接口
*@作者：宋春林 
*/
public class jobtable_impl implements jobtable_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(jobtable_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param JOBTABLE实体
* @return 新插入记录的编号
*/
public int insert_jobtable(jobtable_Dao _JOBTABLEModel)  throws Exception{
         String sqlStr = "{call JOBTABLE_PRO.InsertJOBTABLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_JOBTABLEModel.getJobid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.DATE, dateformat.format(_JOBTABLEModel.getJobcdate()));
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getJobcreatemobile());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getJobcreateuserid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_JOBTABLEModel.getJobusedtime()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_JOBTABLEModel.getJobinvitetype());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMobilelist());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getJobwarn());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantname());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantlat());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantlng());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantbaidulat());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantbaidulng());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantaddress());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantphone());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantbigclass());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getJobwarnhour());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_JOBTABLEModel.getMerchantfrom());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param JOBTABLE
* @Object 
* @return 新插入记录的编号
*/
public int insert_jobtable(Object[] _para)  throws Exception{
      String sqlStr = "{call JOBTABLE_PRO.InsertJOBTABLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[19];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.DATE, dateformat.format(_para[1]));
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_para[18]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param JOBTABLE实体
* @return 影响的行数
*/
public int update_jobtable(jobtable_Dao _JOBTABLEModel)  throws Exception{
        String sqlStr = "{call JOBTABLE_PRO.UpdateJOBTABLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_JOBTABLEModel.getJobid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.DATE, dateformat.format(_JOBTABLEModel.getJobcdate()));
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getJobcreatemobile());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getJobcreateuserid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_JOBTABLEModel.getJobusedtime()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_JOBTABLEModel.getJobinvitetype());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMobilelist());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getJobwarn());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantname());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantlat());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantlng());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantbaidulat());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantbaidulng());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantaddress());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantphone());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getMerchantbigclass());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_JOBTABLEModel.getJobwarnhour());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_JOBTABLEModel.getMerchantfrom());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表JOBTABLE中的一条记录
* @param JOBTABLE实体
* @return 新插入记录的编号
*/
public int delete_jobtable(int Jobid)  throws Exception{
        String sqlStr = "{call JOBTABLE_PRO.DeleteJOBTABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Jobid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 jobtable 数据实体
* @param Jobid">Jobid
* @return<jobtable 数据实体
* @throws Exception 
*/
public jobtable_Dao get_jobtableDao(int Jobid) throws Exception{
         String sqlStr = "{ call JOBTABLE_PRO.GetJOBTABLEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Jobid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			jobtable_Dao _obj = new jobtable_Dao();
            _obj.setJobid(arr.getInt("JOBID"));
             try{_obj.setJobcdate(dateformat.parse(arr.getString("JOBCDATE")));}catch(Exception ce){_obj.setJobcdate((new Date()));}
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setJobcreatemobile(arr.getString("JOBCREATEMOBILE"));
            _obj.setJobcreateuserid(arr.getString("JOBCREATEUSERID"));
             try{_obj.setJobusedtime(dateformat.parse(arr.getString("JOBUSEDTIME")));}catch(Exception ce){_obj.setJobusedtime((new Date()));}
            _obj.setJobinvitetype(arr.getInt("JOBINVITETYPE"));
            _obj.setMobilelist(arr.getString("MOBILELIST"));
            _obj.setJobwarn(arr.getString("JOBWARN"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantlat(arr.getString("MERCHANTLAT"));
            _obj.setMerchantlng(arr.getString("MERCHANTLNG"));
            _obj.setMerchantbaidulat(arr.getString("MERCHANTBAIDULAT"));
            _obj.setMerchantbaidulng(arr.getString("MERCHANTBAIDULNG"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setMerchantphone(arr.getString("MERCHANTPHONE"));
            _obj.setMerchantbigclass(arr.getString("MERCHANTBIGCLASS"));
            _obj.setJobwarnhour(arr.getString("JOBWARNHOUR"));
            _obj.setMerchantfrom(arr.getInt("MERCHANTFROM"));
			return _obj;
		}
		return null;

}

/**
* 根据JOBTABLE返回的查询DataRow创建一个JOBTABLEEntity对象
* @param JOBTABLE row
* @returnJOBTABLEList对象
* @throws Exception 
*/
public List<jobtable_Dao> get_jobtable_All() throws Exception{
        List<jobtable_Dao> _list = new ArrayList<jobtable_Dao>();
		String sqlStr = "{ call JOBTABLE_PRO.GetJOBTABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			jobtable_Dao _obj = new jobtable_Dao();
            _obj.setJobid(arr.getInt("JOBID"));
            try{_obj.setJobcdate(dateformat.parse(arr.getString("JOBCDATE")));}catch(Exception ce){_obj.setJobcdate((new Date()));}
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setJobcreatemobile(arr.getString("JOBCREATEMOBILE"));
            _obj.setJobcreateuserid(arr.getString("JOBCREATEUSERID"));
            try{_obj.setJobusedtime(dateformat.parse(arr.getString("JOBUSEDTIME")));}catch(Exception ce){_obj.setJobusedtime((new Date()));}
            _obj.setJobinvitetype(arr.getInt("JOBINVITETYPE"));
            _obj.setMobilelist(arr.getString("MOBILELIST"));
            _obj.setJobwarn(arr.getString("JOBWARN"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantlat(arr.getString("MERCHANTLAT"));
            _obj.setMerchantlng(arr.getString("MERCHANTLNG"));
            _obj.setMerchantbaidulat(arr.getString("MERCHANTBAIDULAT"));
            _obj.setMerchantbaidulng(arr.getString("MERCHANTBAIDULNG"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setMerchantphone(arr.getString("MERCHANTPHONE"));
            _obj.setMerchantbigclass(arr.getString("MERCHANTBIGCLASS"));
            _obj.setJobwarnhour(arr.getString("JOBWARNHOUR"));
            _obj.setMerchantfrom(arr.getInt("MERCHANTFROM"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据JOBTABLE返回的查询DataRow创建一个JOBTABLEEntity对象
* @param JOBTABLE row
* @returnJOBTABLEList对象
* @throws Exception 
*/
public List< jobtable_Dao> get_jobtable_All(String strWhere) throws Exception{
         List<jobtable_Dao> _list = new ArrayList<jobtable_Dao>();
		 String sqlStr = "{ call JOBTABLE_PRO.GetJOBTABLEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				jobtable_Dao _obj = new jobtable_Dao();
            _obj.setJobid(arr.getInt("JOBID"));
           try{_obj.setJobcdate(dateformat.parse(arr.getString("JOBCDATE")));}catch(Exception ce){_obj.setJobcdate((new Date()));}
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setJobcreatemobile(arr.getString("JOBCREATEMOBILE"));
            _obj.setJobcreateuserid(arr.getString("JOBCREATEUSERID"));
           try{_obj.setJobusedtime(dateformat.parse(arr.getString("JOBUSEDTIME")));}catch(Exception ce){_obj.setJobusedtime((new Date()));}
            _obj.setJobinvitetype(arr.getInt("JOBINVITETYPE"));
            _obj.setMobilelist(arr.getString("MOBILELIST"));
            _obj.setJobwarn(arr.getString("JOBWARN"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantlat(arr.getString("MERCHANTLAT"));
            _obj.setMerchantlng(arr.getString("MERCHANTLNG"));
            _obj.setMerchantbaidulat(arr.getString("MERCHANTBAIDULAT"));
            _obj.setMerchantbaidulng(arr.getString("MERCHANTBAIDULNG"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setMerchantphone(arr.getString("MERCHANTPHONE"));
            _obj.setMerchantbigclass(arr.getString("MERCHANTBIGCLASS"));
            _obj.setJobwarnhour(arr.getString("JOBWARNHOUR"));
            _obj.setMerchantfrom(arr.getInt("MERCHANTFROM"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据JOBTABLE返回 分页数据
* @param JOBTABLE row
* @returnJOBTABLEList对象
* @throws Exception 
*/
public List<jobtable_Dao> get_jobtable_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<jobtable_Dao> _list = new ArrayList<jobtable_Dao>();
		String sqlStr = "{ call JOBTABLE_PRO.GetJOBTABLEPage(?,?,?,?,?,?)}";
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
				jobtable_Dao _obj = new jobtable_Dao();
            _obj.setJobid(arr.getInt("JOBID"));
            try{_obj.setJobcdate(dateformat.parse(arr.getString("JOBCDATE")));}catch(Exception ce){_obj.setJobcdate((new Date()));}
            _obj.setMerchantid(arr.getString("MERCHANTID"));
            _obj.setJobcreatemobile(arr.getString("JOBCREATEMOBILE"));
            _obj.setJobcreateuserid(arr.getString("JOBCREATEUSERID"));
            try{_obj.setJobusedtime(dateformat.parse(arr.getString("JOBUSEDTIME")));}catch(Exception ce){_obj.setJobusedtime((new Date()));}
            _obj.setJobinvitetype(arr.getInt("JOBINVITETYPE"));
            _obj.setMobilelist(arr.getString("MOBILELIST"));
            _obj.setJobwarn(arr.getString("JOBWARN"));
            _obj.setMerchantname(arr.getString("MERCHANTNAME"));
            _obj.setMerchantlat(arr.getString("MERCHANTLAT"));
            _obj.setMerchantlng(arr.getString("MERCHANTLNG"));
            _obj.setMerchantbaidulat(arr.getString("MERCHANTBAIDULAT"));
            _obj.setMerchantbaidulng(arr.getString("MERCHANTBAIDULNG"));
            _obj.setMerchantaddress(arr.getString("MERCHANTADDRESS"));
            _obj.setMerchantphone(arr.getString("MERCHANTPHONE"));
            _obj.setMerchantbigclass(arr.getString("MERCHANTBIGCLASS"));
            _obj.setJobwarnhour(arr.getString("JOBWARNHOUR"));
            _obj.setMerchantfrom(arr.getInt("MERCHANTFROM"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据JOBTABLE返回的查询DataRow创建一个JOBTABLEEntity对象
* @param JOBTABLE row
* @returnJOBTABLEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, jobtable_Dao> get_jobtable_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicjobtablestrWhere") == null) {
			Dictionary<Integer, jobtable_Dao> _dic = new Hashtable<Integer, jobtable_Dao>();
			List<jobtable_Dao> _list = new ArrayList<jobtable_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getJobid()), _list.get(i));
			}
			classFactory.cachePut("dicjobtable", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, jobtable_Dao> _dic = (Dictionary<Integer, jobtable_Dao>) classFactory
					.cacheGet("dicjobtablestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新JOBTABLE字段加一
* @param FieldName
* @param sid
*/
public int create_jobtable_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call JOBTABLE_PRO.UpdateFieldJOBTABLE(?,?)}";
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
* 更新JOBTABLEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_jobtable_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call JOBTABLE_PRO.UpdateFieldJOBTABLEV(?,?,?)}";
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
* 更新JOBTABLEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_jobtable_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call JOBTABLE_PRO.UpdateFieldJOBTABLEU(?,?,?)}";
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
