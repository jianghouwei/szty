/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataIpnumber.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.ipnumber_Dao;
import com.szty.aihao.core.ipnumber_core;
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
*@IPNUMBER数据接口
*@作者：宋春林 
*/
public class ipnumber_impl implements ipnumber_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(ipnumber_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param IPNUMBER实体
* @return 新插入记录的编号
*/
public int insert_ipnumber(ipnumber_Dao _IPNUMBERModel)  throws Exception{
         String sqlStr = "{call IPNUMBER_PRO.InsertIPNUMBER(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_IPNUMBERModel.getIpfrom());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_IPNUMBERModel.getIpto());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_IPNUMBERModel.getIntro());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_IPNUMBERModel.getProvince());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_IPNUMBERModel.getCity());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_IPNUMBERModel.getOther());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_IPNUMBERModel.getCdate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_IPNUMBERModel.getIpfromnumber());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_IPNUMBERModel.getIptonumber());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param IPNUMBER
* @Object 
* @return 新插入记录的编号
*/
public int insert_ipnumber(Object[] _para)  throws Exception{
      String sqlStr = "{call IPNUMBER_PRO.InsertIPNUMBER(?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[9];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
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
* @param IPNUMBER实体
* @return 影响的行数
*/
public int update_ipnumber(ipnumber_Dao _IPNUMBERModel)  throws Exception{
        String sqlStr = "{call IPNUMBER_PRO.UpdateIPNUMBER(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_IPNUMBERModel.getIpfrom());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_IPNUMBERModel.getIpto());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_IPNUMBERModel.getIntro());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_IPNUMBERModel.getProvince());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_IPNUMBERModel.getCity());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_IPNUMBERModel.getOther());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_IPNUMBERModel.getCdate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_IPNUMBERModel.getIpfromnumber());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_IPNUMBERModel.getIptonumber());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表IPNUMBER中的一条记录
* @param IPNUMBER实体
* @return 新插入记录的编号
*/
public int delete_ipnumber(int Ipfrom)  throws Exception{
        String sqlStr = "{call IPNUMBER_PRO.DeleteIPNUMBER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Ipfrom);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 ipnumber 数据实体
* @param Ipfrom">Ipfrom
* @return<ipnumber 数据实体
* @throws Exception 
*/
public ipnumber_Dao get_ipnumberDao(int Ipfrom) throws Exception{
         String sqlStr = "{ call IPNUMBER_PRO.GetIPNUMBEREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Ipfrom);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			ipnumber_Dao _obj = new ipnumber_Dao();
            _obj.setIpfrom(arr.getString("IPFROM"));
            _obj.setIpto(arr.getString("IPTO"));
            _obj.setIntro(arr.getString("INTRO"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setOther(arr.getString("OTHER"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setIpfromnumber(arr.getInt("IPFROMNUMBER"));
            _obj.setIptonumber(arr.getInt("IPTONUMBER"));
			return _obj;
		}
		return null;

}

/**
* 根据IPNUMBER返回的查询DataRow创建一个IPNUMBEREntity对象
* @param IPNUMBER row
* @returnIPNUMBERList对象
* @throws Exception 
*/
public List<ipnumber_Dao> get_ipnumber_All() throws Exception{
        List<ipnumber_Dao> _list = new ArrayList<ipnumber_Dao>();
		String sqlStr = "{ call IPNUMBER_PRO.GetIPNUMBER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			ipnumber_Dao _obj = new ipnumber_Dao();
            _obj.setIpfrom(arr.getString("IPFROM"));
            _obj.setIpto(arr.getString("IPTO"));
            _obj.setIntro(arr.getString("INTRO"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setOther(arr.getString("OTHER"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setIpfromnumber(arr.getInt("IPFROMNUMBER"));
            _obj.setIptonumber(arr.getInt("IPTONUMBER"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据IPNUMBER返回的查询DataRow创建一个IPNUMBEREntity对象
* @param IPNUMBER row
* @returnIPNUMBERList对象
* @throws Exception 
*/
public List< ipnumber_Dao> get_ipnumber_All(String strWhere) throws Exception{
         List<ipnumber_Dao> _list = new ArrayList<ipnumber_Dao>();
		 String sqlStr = "{ call IPNUMBER_PRO.GetIPNUMBERWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				ipnumber_Dao _obj = new ipnumber_Dao();
            _obj.setIpfrom(arr.getString("IPFROM"));
            _obj.setIpto(arr.getString("IPTO"));
            _obj.setIntro(arr.getString("INTRO"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setOther(arr.getString("OTHER"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setIpfromnumber(arr.getInt("IPFROMNUMBER"));
            _obj.setIptonumber(arr.getInt("IPTONUMBER"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据IPNUMBER返回 分页数据
* @param IPNUMBER row
* @returnIPNUMBERList对象
* @throws Exception 
*/
public List<ipnumber_Dao> get_ipnumber_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<ipnumber_Dao> _list = new ArrayList<ipnumber_Dao>();
		String sqlStr = "{ call IPNUMBER_PRO.GetIPNUMBERPage(?,?,?,?,?,?)}";
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
				ipnumber_Dao _obj = new ipnumber_Dao();
            _obj.setIpfrom(arr.getString("IPFROM"));
            _obj.setIpto(arr.getString("IPTO"));
            _obj.setIntro(arr.getString("INTRO"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setOther(arr.getString("OTHER"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setIpfromnumber(arr.getInt("IPFROMNUMBER"));
            _obj.setIptonumber(arr.getInt("IPTONUMBER"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据IPNUMBER返回的查询DataRow创建一个IPNUMBEREntity对象
* @param IPNUMBER row
* @returnIPNUMBERDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, ipnumber_Dao> get_ipnumber_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicipnumberstrWhere") == null) {
			Dictionary<Integer, ipnumber_Dao> _dic = new Hashtable<Integer, ipnumber_Dao>();
			List<ipnumber_Dao> _list = new ArrayList<ipnumber_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getIpfrom()), _list.get(i));
			}
			classFactory.cachePut("dicipnumber", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, ipnumber_Dao> _dic = (Dictionary<Integer, ipnumber_Dao>) classFactory
					.cacheGet("dicipnumberstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新IPNUMBER字段加一
* @param FieldName
* @param sid
*/
public int create_ipnumber_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call IPNUMBER_PRO.UpdateFieldIPNUMBER(?,?)}";
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
* 更新IPNUMBERInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_ipnumber_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call IPNUMBER_PRO.UpdateFieldIPNUMBERV(?,?,?)}";
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
* 更新IPNUMBERIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_ipnumber_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call IPNUMBER_PRO.UpdateFieldIPNUMBERU(?,?,?)}";
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
