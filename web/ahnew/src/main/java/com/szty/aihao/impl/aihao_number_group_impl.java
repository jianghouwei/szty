/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihao_number_group.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihao_number_group_Dao;
import com.szty.aihao.core.aihao_number_group_core;
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
*@AIHAO_NUMBER_GROUP数据接口
*@作者：宋春林 
*/
public class aihao_number_group_impl implements aihao_number_group_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihao_number_group_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAO_NUMBER_GROUP实体
* @return 新插入记录的编号
*/
public int insert_aihao_number_group(aihao_number_group_Dao _AIHAO_NUMBER_GROUPModel)  throws Exception{
         String sqlStr = "{call AIHAO_NUMBER_GROUP_PRO.InsertAIHAO_NUMBER_GROUP(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBER_GROUPModel.getGroupname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getProvincecode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getCitycode());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getStatus());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_NUMBER_GROUPModel.getCreatedate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_NUMBER_GROUPModel.getUpdatedate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getIsnew());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getWeights());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBER_GROUPModel.getImgid());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getDowncnt());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAO_NUMBER_GROUP
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihao_number_group(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAO_NUMBER_GROUP_PRO.InsertAIHAO_NUMBER_GROUP(?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[11];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAO_NUMBER_GROUP实体
* @return 影响的行数
*/
public int update_aihao_number_group(aihao_number_group_Dao _AIHAO_NUMBER_GROUPModel)  throws Exception{
        String sqlStr = "{call AIHAO_NUMBER_GROUP_PRO.UpdateAIHAO_NUMBER_GROUP(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBER_GROUPModel.getGroupname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getProvincecode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getCitycode());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getStatus());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_NUMBER_GROUPModel.getCreatedate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_AIHAO_NUMBER_GROUPModel.getUpdatedate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getIsnew());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getWeights());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AIHAO_NUMBER_GROUPModel.getImgid());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_AIHAO_NUMBER_GROUPModel.getDowncnt());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAO_NUMBER_GROUP中的一条记录
* @param AIHAO_NUMBER_GROUP实体
* @return 新插入记录的编号
*/
public int delete_aihao_number_group(int Id)  throws Exception{
        String sqlStr = "{call AIHAO_NUMBER_GROUP_PRO.DeleteAIHAO_NUMBER_GROUP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihao_number_group 数据实体
* @param Id">Id
* @return<aihao_number_group 数据实体
* @throws Exception 
*/
public aihao_number_group_Dao get_aihao_number_groupDao(int Id) throws Exception{
         String sqlStr = "{ call AIHAO_NUMBER_GROUP_PRO.GetAIHAO_NUMBER_GROUPEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_number_group_Dao _obj = new aihao_number_group_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setProvincecode(arr.getInt("PROVINCECODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setStatus(arr.getInt("STATUS"));
             try{_obj.setCreatedate(dateformat.parse(arr.getString("CREATEDATE")));}catch(Exception ce){_obj.setCreatedate((new Date()));}
             try{_obj.setUpdatedate(dateformat.parse(arr.getString("UPDATEDATE")));}catch(Exception ce){_obj.setUpdatedate((new Date()));}
            _obj.setIsnew(arr.getInt("ISNEW"));
            _obj.setWeights(arr.getInt("WEIGHTS"));
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setDowncnt(arr.getInt("DOWNCNT"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAO_NUMBER_GROUP返回的查询DataRow创建一个AIHAO_NUMBER_GROUPEntity对象
* @param AIHAO_NUMBER_GROUP row
* @returnAIHAO_NUMBER_GROUPList对象
* @throws Exception 
*/
public List<aihao_number_group_Dao> get_aihao_number_group_All() throws Exception{
        List<aihao_number_group_Dao> _list = new ArrayList<aihao_number_group_Dao>();
		String sqlStr = "{ call AIHAO_NUMBER_GROUP_PRO.GetAIHAO_NUMBER_GROUP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_number_group_Dao _obj = new aihao_number_group_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setProvincecode(arr.getInt("PROVINCECODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setStatus(arr.getInt("STATUS"));
            try{_obj.setCreatedate(dateformat.parse(arr.getString("CREATEDATE")));}catch(Exception ce){_obj.setCreatedate((new Date()));}
            try{_obj.setUpdatedate(dateformat.parse(arr.getString("UPDATEDATE")));}catch(Exception ce){_obj.setUpdatedate((new Date()));}
            _obj.setIsnew(arr.getInt("ISNEW"));
            _obj.setWeights(arr.getInt("WEIGHTS"));
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setDowncnt(arr.getInt("DOWNCNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAO_NUMBER_GROUP返回的查询DataRow创建一个AIHAO_NUMBER_GROUPEntity对象
* @param AIHAO_NUMBER_GROUP row
* @returnAIHAO_NUMBER_GROUPList对象
* @throws Exception 
*/
public List< aihao_number_group_Dao> get_aihao_number_group_All(String strWhere) throws Exception{
         List<aihao_number_group_Dao> _list = new ArrayList<aihao_number_group_Dao>();
		 String sqlStr = "{ call AIHAO_NUMBER_GROUP_PRO.GetAIHAO_NUMBER_GROUPWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihao_number_group_Dao _obj = new aihao_number_group_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setProvincecode(arr.getInt("PROVINCECODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setStatus(arr.getInt("STATUS"));
           try{_obj.setCreatedate(dateformat.parse(arr.getString("CREATEDATE")));}catch(Exception ce){_obj.setCreatedate((new Date()));}
           try{_obj.setUpdatedate(dateformat.parse(arr.getString("UPDATEDATE")));}catch(Exception ce){_obj.setUpdatedate((new Date()));}
            _obj.setIsnew(arr.getInt("ISNEW"));
            _obj.setWeights(arr.getInt("WEIGHTS"));
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setDowncnt(arr.getInt("DOWNCNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAO_NUMBER_GROUP返回 分页数据
* @param AIHAO_NUMBER_GROUP row
* @returnAIHAO_NUMBER_GROUPList对象
* @throws Exception 
*/
public List<aihao_number_group_Dao> get_aihao_number_group_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihao_number_group_Dao> _list = new ArrayList<aihao_number_group_Dao>();
		String sqlStr = "{ call AIHAO_NUMBER_GROUP_PRO.GetAIHAO_NUMBER_GROUPPage(?,?,?,?,?,?)}";
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
				aihao_number_group_Dao _obj = new aihao_number_group_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setGroupname(arr.getString("GROUPNAME"));
            _obj.setProvincecode(arr.getInt("PROVINCECODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setStatus(arr.getInt("STATUS"));
            try{_obj.setCreatedate(dateformat.parse(arr.getString("CREATEDATE")));}catch(Exception ce){_obj.setCreatedate((new Date()));}
            try{_obj.setUpdatedate(dateformat.parse(arr.getString("UPDATEDATE")));}catch(Exception ce){_obj.setUpdatedate((new Date()));}
            _obj.setIsnew(arr.getInt("ISNEW"));
            _obj.setWeights(arr.getInt("WEIGHTS"));
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setDowncnt(arr.getInt("DOWNCNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAO_NUMBER_GROUP返回的查询DataRow创建一个AIHAO_NUMBER_GROUPEntity对象
* @param AIHAO_NUMBER_GROUP row
* @returnAIHAO_NUMBER_GROUPDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihao_number_group_Dao> get_aihao_number_group_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihao_number_groupstrWhere") == null) {
			Dictionary<Integer, aihao_number_group_Dao> _dic = new Hashtable<Integer, aihao_number_group_Dao>();
			List<aihao_number_group_Dao> _list = new ArrayList<aihao_number_group_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihao_number_group", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihao_number_group_Dao> _dic = (Dictionary<Integer, aihao_number_group_Dao>) classFactory
					.cacheGet("dicaihao_number_groupstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAO_NUMBER_GROUP字段加一
* @param FieldName
* @param sid
*/
public int create_aihao_number_group_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAO_NUMBER_GROUP_PRO.UpdateFieldAIHAO_NUMBER_GROUP(?,?)}";
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
* 更新AIHAO_NUMBER_GROUPInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihao_number_group_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAO_NUMBER_GROUP_PRO.UpdateFieldAIHAO_NUMBER_GROUPV(?,?,?)}";
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
* 更新AIHAO_NUMBER_GROUPIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihao_number_group_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAO_NUMBER_GROUP_PRO.UpdateFieldAIHAO_NUMBER_GROUPU(?,?,?)}";
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
