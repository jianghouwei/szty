/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaocy.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaocy_Dao;
import com.szty.aihao.core.aihaocy_core;
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
*@AIHAOCY数据接口
*@作者：宋春林 
*/
public class aihaocy_impl implements aihaocy_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaocy_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOCY实体
* @return 新插入记录的编号
*/
public int insert_aihaocy(aihaocy_Dao _AIHAOCYModel)  throws Exception{
         String sqlStr = "{call AIHAOCY_PRO.InsertAIHAOCY(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOCYModel.getHaoid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOCYModel.getImgid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOCYModel.getName());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOCYModel.getTelephone());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOCYModel.getTypename());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_AIHAOCYModel.getTypecode());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_AIHAOCYModel.getSort());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOCYModel.getBigclass());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_AIHAOCYModel.getStatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOCY
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaocy(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOCY_PRO.InsertAIHAOCY(?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[9];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_para[8]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOCY实体
* @return 影响的行数
*/
public int update_aihaocy(aihaocy_Dao _AIHAOCYModel)  throws Exception{
        String sqlStr = "{call AIHAOCY_PRO.UpdateAIHAOCY(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOCYModel.getHaoid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOCYModel.getImgid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOCYModel.getName());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOCYModel.getTelephone());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOCYModel.getTypename());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_AIHAOCYModel.getTypecode());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_AIHAOCYModel.getSort());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOCYModel.getBigclass());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_AIHAOCYModel.getStatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOCY中的一条记录
* @param AIHAOCY实体
* @return 新插入记录的编号
*/
public int delete_aihaocy(int Haoid)  throws Exception{
        String sqlStr = "{call AIHAOCY_PRO.DeleteAIHAOCY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Haoid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaocy 数据实体
* @param Haoid">Haoid
* @return<aihaocy 数据实体
* @throws Exception 
*/
public aihaocy_Dao get_aihaocyDao(int Haoid) throws Exception{
         String sqlStr = "{ call AIHAOCY_PRO.GetAIHAOCYEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Haoid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaocy_Dao _obj = new aihaocy_Dao();
            _obj.setHaoid(arr.getInt("HAOID"));
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setTypename(arr.getString("TYPENAME"));
            _obj.setTypecode(arr.getInt("TYPECODE"));
            _obj.setSort(arr.getInt("SORT"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setStatus(arr.getInt("STATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOCY返回的查询DataRow创建一个AIHAOCYEntity对象
* @param AIHAOCY row
* @returnAIHAOCYList对象
* @throws Exception 
*/
public List<aihaocy_Dao> get_aihaocy_All() throws Exception{
        List<aihaocy_Dao> _list = new ArrayList<aihaocy_Dao>();
		String sqlStr = "{ call AIHAOCY_PRO.GetAIHAOCY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaocy_Dao _obj = new aihaocy_Dao();
            _obj.setHaoid(arr.getInt("HAOID"));
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setTypename(arr.getString("TYPENAME"));
            _obj.setTypecode(arr.getInt("TYPECODE"));
            _obj.setSort(arr.getInt("SORT"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setStatus(arr.getInt("STATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOCY返回的查询DataRow创建一个AIHAOCYEntity对象
* @param AIHAOCY row
* @returnAIHAOCYList对象
* @throws Exception 
*/
public List< aihaocy_Dao> get_aihaocy_All(String strWhere) throws Exception{
         List<aihaocy_Dao> _list = new ArrayList<aihaocy_Dao>();
		 String sqlStr = "{ call AIHAOCY_PRO.GetAIHAOCYWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaocy_Dao _obj = new aihaocy_Dao();
            _obj.setHaoid(arr.getInt("HAOID"));
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setTypename(arr.getString("TYPENAME"));
            _obj.setTypecode(arr.getInt("TYPECODE"));
            _obj.setSort(arr.getInt("SORT"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setStatus(arr.getInt("STATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOCY返回 分页数据
* @param AIHAOCY row
* @returnAIHAOCYList对象
* @throws Exception 
*/
public List<aihaocy_Dao> get_aihaocy_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaocy_Dao> _list = new ArrayList<aihaocy_Dao>();
		String sqlStr = "{ call AIHAOCY_PRO.GetAIHAOCYPage(?,?,?,?,?,?)}";
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
				aihaocy_Dao _obj = new aihaocy_Dao();
            _obj.setHaoid(arr.getInt("HAOID"));
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setTypename(arr.getString("TYPENAME"));
            _obj.setTypecode(arr.getInt("TYPECODE"));
            _obj.setSort(arr.getInt("SORT"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setStatus(arr.getInt("STATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOCY返回的查询DataRow创建一个AIHAOCYEntity对象
* @param AIHAOCY row
* @returnAIHAOCYDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaocy_Dao> get_aihaocy_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaocystrWhere") == null) {
			Dictionary<Integer, aihaocy_Dao> _dic = new Hashtable<Integer, aihaocy_Dao>();
			List<aihaocy_Dao> _list = new ArrayList<aihaocy_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getHaoid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaocy", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaocy_Dao> _dic = (Dictionary<Integer, aihaocy_Dao>) classFactory
					.cacheGet("dicaihaocystrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOCY字段加一
* @param FieldName
* @param sid
*/
public int create_aihaocy_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOCY_PRO.UpdateFieldAIHAOCY(?,?)}";
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
* 更新AIHAOCYInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaocy_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOCY_PRO.UpdateFieldAIHAOCYV(?,?,?)}";
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
* 更新AIHAOCYIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaocy_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOCY_PRO.UpdateFieldAIHAOCYU(?,?,?)}";
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
