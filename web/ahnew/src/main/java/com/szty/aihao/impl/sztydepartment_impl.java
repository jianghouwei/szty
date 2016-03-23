/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSztydepartment.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sztydepartment_Dao;
import com.szty.aihao.core.sztydepartment_core;
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
*@SZTYDEPARTMENT数据接口
*@作者：宋春林 
*/
public class sztydepartment_impl implements sztydepartment_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sztydepartment_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTYDEPARTMENT实体
* @return 新插入记录的编号
*/
public int insert_sztydepartment(sztydepartment_Dao _SZTYDEPARTMENTModel)  throws Exception{
         String sqlStr = "{call SZTYDEPARTMENT_PRO.InsertSZTYDEPARTMENT(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTYDEPARTMENTModel.getDid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYDEPARTMENTModel.getDepartmentname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYDEPARTMENTModel.getEnglishname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_SZTYDEPARTMENTModel.getPerantid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYDEPARTMENTModel.getLeader());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYDEPARTMENTModel.getTelephone());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_SZTYDEPARTMENTModel.getMemo());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTYDEPARTMENT
* @Object 
* @return 新插入记录的编号
*/
public int insert_sztydepartment(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTYDEPARTMENT_PRO.InsertSZTYDEPARTMENT(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SZTYDEPARTMENT实体
* @return 影响的行数
*/
public int update_sztydepartment(sztydepartment_Dao _SZTYDEPARTMENTModel)  throws Exception{
        String sqlStr = "{call SZTYDEPARTMENT_PRO.UpdateSZTYDEPARTMENT(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_SZTYDEPARTMENTModel.getDid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SZTYDEPARTMENTModel.getDepartmentname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYDEPARTMENTModel.getEnglishname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_SZTYDEPARTMENTModel.getPerantid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYDEPARTMENTModel.getLeader());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYDEPARTMENTModel.getTelephone());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_SZTYDEPARTMENTModel.getMemo());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTYDEPARTMENT中的一条记录
* @param SZTYDEPARTMENT实体
* @return 新插入记录的编号
*/
public int delete_sztydepartment(int Did)  throws Exception{
        String sqlStr = "{call SZTYDEPARTMENT_PRO.DeleteSZTYDEPARTMENT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Did);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 sztydepartment 数据实体
* @param Did">Did
* @return<sztydepartment 数据实体
* @throws Exception 
*/
public sztydepartment_Dao get_sztydepartmentDao(int Did) throws Exception{
         String sqlStr = "{ call SZTYDEPARTMENT_PRO.GetSZTYDEPARTMENTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Did);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztydepartment_Dao _obj = new sztydepartment_Dao();
            _obj.setDid(arr.getInt("DID"));
            _obj.setDepartmentname(arr.getString("DEPARTMENTNAME"));
            _obj.setEnglishname(arr.getString("ENGLISHNAME"));
            _obj.setPerantid(arr.getInt("PERANTID"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setMemo(arr.getString("MEMO"));
			return _obj;
		}
		return null;

}

/**
* 根据SZTYDEPARTMENT返回的查询DataRow创建一个SZTYDEPARTMENTEntity对象
* @param SZTYDEPARTMENT row
* @returnSZTYDEPARTMENTList对象
* @throws Exception 
*/
public List<sztydepartment_Dao> get_sztydepartment_All() throws Exception{
        List<sztydepartment_Dao> _list = new ArrayList<sztydepartment_Dao>();
		String sqlStr = "{ call SZTYDEPARTMENT_PRO.GetSZTYDEPARTMENT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztydepartment_Dao _obj = new sztydepartment_Dao();
            _obj.setDid(arr.getInt("DID"));
            _obj.setDepartmentname(arr.getString("DEPARTMENTNAME"));
            _obj.setEnglishname(arr.getString("ENGLISHNAME"));
            _obj.setPerantid(arr.getInt("PERANTID"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setMemo(arr.getString("MEMO"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTYDEPARTMENT返回的查询DataRow创建一个SZTYDEPARTMENTEntity对象
* @param SZTYDEPARTMENT row
* @returnSZTYDEPARTMENTList对象
* @throws Exception 
*/
public List< sztydepartment_Dao> get_sztydepartment_All(String strWhere) throws Exception{
         List<sztydepartment_Dao> _list = new ArrayList<sztydepartment_Dao>();
		 String sqlStr = "{ call SZTYDEPARTMENT_PRO.GetSZTYDEPARTMENTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sztydepartment_Dao _obj = new sztydepartment_Dao();
            _obj.setDid(arr.getInt("DID"));
            _obj.setDepartmentname(arr.getString("DEPARTMENTNAME"));
            _obj.setEnglishname(arr.getString("ENGLISHNAME"));
            _obj.setPerantid(arr.getInt("PERANTID"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setMemo(arr.getString("MEMO"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTYDEPARTMENT返回 分页数据
* @param SZTYDEPARTMENT row
* @returnSZTYDEPARTMENTList对象
* @throws Exception 
*/
public List<sztydepartment_Dao> get_sztydepartment_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sztydepartment_Dao> _list = new ArrayList<sztydepartment_Dao>();
		String sqlStr = "{ call SZTYDEPARTMENT_PRO.GetSZTYDEPARTMENTPage(?,?,?,?,?,?)}";
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
				sztydepartment_Dao _obj = new sztydepartment_Dao();
            _obj.setDid(arr.getInt("DID"));
            _obj.setDepartmentname(arr.getString("DEPARTMENTNAME"));
            _obj.setEnglishname(arr.getString("ENGLISHNAME"));
            _obj.setPerantid(arr.getInt("PERANTID"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setMemo(arr.getString("MEMO"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTYDEPARTMENT返回的查询DataRow创建一个SZTYDEPARTMENTEntity对象
* @param SZTYDEPARTMENT row
* @returnSZTYDEPARTMENTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, sztydepartment_Dao> get_sztydepartment_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsztydepartmentstrWhere") == null) {
			Dictionary<Integer, sztydepartment_Dao> _dic = new Hashtable<Integer, sztydepartment_Dao>();
			List<sztydepartment_Dao> _list = new ArrayList<sztydepartment_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getDid()), _list.get(i));
			}
			classFactory.cachePut("dicsztydepartment", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sztydepartment_Dao> _dic = (Dictionary<Integer, sztydepartment_Dao>) classFactory
					.cacheGet("dicsztydepartmentstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTYDEPARTMENT字段加一
* @param FieldName
* @param sid
*/
public int create_sztydepartment_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTYDEPARTMENT_PRO.UpdateFieldSZTYDEPARTMENT(?,?)}";
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
* 更新SZTYDEPARTMENTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_sztydepartment_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTYDEPARTMENT_PRO.UpdateFieldSZTYDEPARTMENTV(?,?,?)}";
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
* 更新SZTYDEPARTMENTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_sztydepartment_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTYDEPARTMENT_PRO.UpdateFieldSZTYDEPARTMENTU(?,?,?)}";
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
