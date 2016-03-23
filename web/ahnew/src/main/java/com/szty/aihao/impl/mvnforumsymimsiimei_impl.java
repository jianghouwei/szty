/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumsymimsiimei.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumsymimsiimei_Dao;
import com.szty.aihao.core.mvnforumsymimsiimei_core;
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
*@MVNFORUMSYMIMSIIMEI数据接口
*@作者：宋春林 
*/
public class mvnforumsymimsiimei_impl implements mvnforumsymimsiimei_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumsymimsiimei_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSYMIMSIIMEI实体
* @return 新插入记录的编号
*/
public int insert_mvnforumsymimsiimei(mvnforumsymimsiimei_Dao _MVNFORUMSYMIMSIIMEIModel)  throws Exception{
         String sqlStr = "{call MVNFORUMSYMIMSIIMEI_PRO.InsertMVNFORUMSYMIMSIIMEI(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMSYMIMSIIMEIModel.getImid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMIMSIIMEIModel.getImei());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMIMSIIMEIModel.getImsi());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMIMSIIMEIModel.getMobile());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSYMIMSIIMEIModel.getImcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSYMIMSIIMEI
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumsymimsiimei(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMSYMIMSIIMEI_PRO.InsertMVNFORUMSYMIMSIIMEI(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
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
* @param MVNFORUMSYMIMSIIMEI实体
* @return 影响的行数
*/
public int update_mvnforumsymimsiimei(mvnforumsymimsiimei_Dao _MVNFORUMSYMIMSIIMEIModel)  throws Exception{
        String sqlStr = "{call MVNFORUMSYMIMSIIMEI_PRO.UpdateMVNFORUMSYMIMSIIMEI(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMSYMIMSIIMEIModel.getImid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMIMSIIMEIModel.getImei());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMIMSIIMEIModel.getImsi());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMIMSIIMEIModel.getMobile());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSYMIMSIIMEIModel.getImcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMSYMIMSIIMEI中的一条记录
* @param MVNFORUMSYMIMSIIMEI实体
* @return 新插入记录的编号
*/
public int delete_mvnforumsymimsiimei(int Imid)  throws Exception{
        String sqlStr = "{call MVNFORUMSYMIMSIIMEI_PRO.DeleteMVNFORUMSYMIMSIIMEI(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Imid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumsymimsiimei 数据实体
* @param Imid">Imid
* @return<mvnforumsymimsiimei 数据实体
* @throws Exception 
*/
public mvnforumsymimsiimei_Dao get_mvnforumsymimsiimeiDao(int Imid) throws Exception{
         String sqlStr = "{ call MVNFORUMSYMIMSIIMEI_PRO.GetMVNFORUMSYMIMSIIMEIEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Imid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsymimsiimei_Dao _obj = new mvnforumsymimsiimei_Dao();
            _obj.setImid(arr.getInt("IMID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
             try{_obj.setImcreationdate(dateformat.parse(arr.getString("IMCREATIONDATE")));}catch(Exception ce){_obj.setImcreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMSYMIMSIIMEI返回的查询DataRow创建一个MVNFORUMSYMIMSIIMEIEntity对象
* @param MVNFORUMSYMIMSIIMEI row
* @returnMVNFORUMSYMIMSIIMEIList对象
* @throws Exception 
*/
public List<mvnforumsymimsiimei_Dao> get_mvnforumsymimsiimei_All() throws Exception{
        List<mvnforumsymimsiimei_Dao> _list = new ArrayList<mvnforumsymimsiimei_Dao>();
		String sqlStr = "{ call MVNFORUMSYMIMSIIMEI_PRO.GetMVNFORUMSYMIMSIIMEI(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsymimsiimei_Dao _obj = new mvnforumsymimsiimei_Dao();
            _obj.setImid(arr.getInt("IMID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            try{_obj.setImcreationdate(dateformat.parse(arr.getString("IMCREATIONDATE")));}catch(Exception ce){_obj.setImcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMSYMIMSIIMEI返回的查询DataRow创建一个MVNFORUMSYMIMSIIMEIEntity对象
* @param MVNFORUMSYMIMSIIMEI row
* @returnMVNFORUMSYMIMSIIMEIList对象
* @throws Exception 
*/
public List< mvnforumsymimsiimei_Dao> get_mvnforumsymimsiimei_All(String strWhere) throws Exception{
         List<mvnforumsymimsiimei_Dao> _list = new ArrayList<mvnforumsymimsiimei_Dao>();
		 String sqlStr = "{ call MVNFORUMSYMIMSIIMEI_PRO.GetMVNFORUMSYMIMSIIMEIWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumsymimsiimei_Dao _obj = new mvnforumsymimsiimei_Dao();
            _obj.setImid(arr.getInt("IMID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
           try{_obj.setImcreationdate(dateformat.parse(arr.getString("IMCREATIONDATE")));}catch(Exception ce){_obj.setImcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMSYMIMSIIMEI返回 分页数据
* @param MVNFORUMSYMIMSIIMEI row
* @returnMVNFORUMSYMIMSIIMEIList对象
* @throws Exception 
*/
public List<mvnforumsymimsiimei_Dao> get_mvnforumsymimsiimei_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumsymimsiimei_Dao> _list = new ArrayList<mvnforumsymimsiimei_Dao>();
		String sqlStr = "{ call MVNFORUMSYMIMSIIMEI_PRO.GetMVNFORUMSYMIMSIIMEIPage(?,?,?,?,?,?)}";
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
				mvnforumsymimsiimei_Dao _obj = new mvnforumsymimsiimei_Dao();
            _obj.setImid(arr.getInt("IMID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMobile(arr.getString("MOBILE"));
            try{_obj.setImcreationdate(dateformat.parse(arr.getString("IMCREATIONDATE")));}catch(Exception ce){_obj.setImcreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMSYMIMSIIMEI返回的查询DataRow创建一个MVNFORUMSYMIMSIIMEIEntity对象
* @param MVNFORUMSYMIMSIIMEI row
* @returnMVNFORUMSYMIMSIIMEIDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumsymimsiimei_Dao> get_mvnforumsymimsiimei_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumsymimsiimeistrWhere") == null) {
			Dictionary<Integer, mvnforumsymimsiimei_Dao> _dic = new Hashtable<Integer, mvnforumsymimsiimei_Dao>();
			List<mvnforumsymimsiimei_Dao> _list = new ArrayList<mvnforumsymimsiimei_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getImid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumsymimsiimei", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumsymimsiimei_Dao> _dic = (Dictionary<Integer, mvnforumsymimsiimei_Dao>) classFactory
					.cacheGet("dicmvnforumsymimsiimeistrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMSYMIMSIIMEI字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumsymimsiimei_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMSYMIMSIIMEI_PRO.UpdateFieldMVNFORUMSYMIMSIIMEI(?,?)}";
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
* 更新MVNFORUMSYMIMSIIMEIInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumsymimsiimei_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMSYMIMSIIMEI_PRO.UpdateFieldMVNFORUMSYMIMSIIMEIV(?,?,?)}";
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
* 更新MVNFORUMSYMIMSIIMEIIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumsymimsiimei_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMSYMIMSIIMEI_PRO.UpdateFieldMVNFORUMSYMIMSIIMEIU(?,?,?)}";
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
