/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaochangyonghaoma.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaochangyonghaoma_Dao;
import com.szty.aihao.core.aihaochangyonghaoma_core;
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
*@AIHAOCHANGYONGHAOMA数据接口
*@作者：宋春林 
*/
public class aihaochangyonghaoma_impl implements aihaochangyonghaoma_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaochangyonghaoma_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOCHANGYONGHAOMA实体
* @return 新插入记录的编号
*/
public int insert_aihaochangyonghaoma(aihaochangyonghaoma_Dao _AIHAOCHANGYONGHAOMAModel)  throws Exception{
         String sqlStr = "{call AIHAOCHANGYONGHAOMA_PRO.InsertAIHAOCHANGYONGHAOMA(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOCHANGYONGHAOMAModel.getHaoid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOCHANGYONGHAOMAModel.getImgid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOCHANGYONGHAOMAModel.getName());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOCHANGYONGHAOMAModel.getTelephone());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOCHANGYONGHAOMAModel.getTypename());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.BIGINT,_AIHAOCHANGYONGHAOMAModel.getTypecode());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.BIGINT,_AIHAOCHANGYONGHAOMAModel.getSort());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOCHANGYONGHAOMA
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaochangyonghaoma(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOCHANGYONGHAOMA_PRO.InsertAIHAOCHANGYONGHAOMA(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.BIGINT,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.BIGINT,_para[6]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOCHANGYONGHAOMA实体
* @return 影响的行数
*/
public int update_aihaochangyonghaoma(aihaochangyonghaoma_Dao _AIHAOCHANGYONGHAOMAModel)  throws Exception{
        String sqlStr = "{call AIHAOCHANGYONGHAOMA_PRO.UpdateAIHAOCHANGYONGHAOMA(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.BIGINT,_AIHAOCHANGYONGHAOMAModel.getHaoid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOCHANGYONGHAOMAModel.getImgid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOCHANGYONGHAOMAModel.getName());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOCHANGYONGHAOMAModel.getTelephone());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOCHANGYONGHAOMAModel.getTypename());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.BIGINT,_AIHAOCHANGYONGHAOMAModel.getTypecode());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.BIGINT,_AIHAOCHANGYONGHAOMAModel.getSort());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOCHANGYONGHAOMA中的一条记录
* @param AIHAOCHANGYONGHAOMA实体
* @return 新插入记录的编号
*/
public int delete_aihaochangyonghaoma(int Haoid)  throws Exception{
        String sqlStr = "{call AIHAOCHANGYONGHAOMA_PRO.DeleteAIHAOCHANGYONGHAOMA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Haoid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaochangyonghaoma 数据实体
* @param Haoid">Haoid
* @return<aihaochangyonghaoma 数据实体
* @throws Exception 
*/
public aihaochangyonghaoma_Dao get_aihaochangyonghaomaDao(int Haoid) throws Exception{
         String sqlStr = "{ call AIHAOCHANGYONGHAOMA_PRO.GetAIHAOCHANGYONGHAOMAEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Haoid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaochangyonghaoma_Dao _obj = new aihaochangyonghaoma_Dao();
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setTypename(arr.getString("TYPENAME"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOCHANGYONGHAOMA返回的查询DataRow创建一个AIHAOCHANGYONGHAOMAEntity对象
* @param AIHAOCHANGYONGHAOMA row
* @returnAIHAOCHANGYONGHAOMAList对象
* @throws Exception 
*/
public List<aihaochangyonghaoma_Dao> get_aihaochangyonghaoma_All() throws Exception{
        List<aihaochangyonghaoma_Dao> _list = new ArrayList<aihaochangyonghaoma_Dao>();
		String sqlStr = "{ call AIHAOCHANGYONGHAOMA_PRO.GetAIHAOCHANGYONGHAOMA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaochangyonghaoma_Dao _obj = new aihaochangyonghaoma_Dao();
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setTypename(arr.getString("TYPENAME"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOCHANGYONGHAOMA返回的查询DataRow创建一个AIHAOCHANGYONGHAOMAEntity对象
* @param AIHAOCHANGYONGHAOMA row
* @returnAIHAOCHANGYONGHAOMAList对象
* @throws Exception 
*/
public List< aihaochangyonghaoma_Dao> get_aihaochangyonghaoma_All(String strWhere) throws Exception{
         List<aihaochangyonghaoma_Dao> _list = new ArrayList<aihaochangyonghaoma_Dao>();
		 String sqlStr = "{ call AIHAOCHANGYONGHAOMA_PRO.GetAIHAOCHANGYONGHAOMAWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaochangyonghaoma_Dao _obj = new aihaochangyonghaoma_Dao();
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setTypename(arr.getString("TYPENAME"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOCHANGYONGHAOMA返回 分页数据
* @param AIHAOCHANGYONGHAOMA row
* @returnAIHAOCHANGYONGHAOMAList对象
* @throws Exception 
*/
public List<aihaochangyonghaoma_Dao> get_aihaochangyonghaoma_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaochangyonghaoma_Dao> _list = new ArrayList<aihaochangyonghaoma_Dao>();
		String sqlStr = "{ call AIHAOCHANGYONGHAOMA_PRO.GetAIHAOCHANGYONGHAOMAPage(?,?,?,?,?,?)}";
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
				aihaochangyonghaoma_Dao _obj = new aihaochangyonghaoma_Dao();
            _obj.setImgid(arr.getString("IMGID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setTypename(arr.getString("TYPENAME"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOCHANGYONGHAOMA返回的查询DataRow创建一个AIHAOCHANGYONGHAOMAEntity对象
* @param AIHAOCHANGYONGHAOMA row
* @returnAIHAOCHANGYONGHAOMADictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaochangyonghaoma_Dao> get_aihaochangyonghaoma_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaochangyonghaomastrWhere") == null) {
			Dictionary<Integer, aihaochangyonghaoma_Dao> _dic = new Hashtable<Integer, aihaochangyonghaoma_Dao>();
			List<aihaochangyonghaoma_Dao> _list = new ArrayList<aihaochangyonghaoma_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((int)(_list.get(i).getHaoid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaochangyonghaoma", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaochangyonghaoma_Dao> _dic = (Dictionary<Integer, aihaochangyonghaoma_Dao>) classFactory
					.cacheGet("dicaihaochangyonghaomastrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOCHANGYONGHAOMA字段加一
* @param FieldName
* @param sid
*/
public int create_aihaochangyonghaoma_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOCHANGYONGHAOMA_PRO.UpdateFieldAIHAOCHANGYONGHAOMA(?,?)}";
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
* 更新AIHAOCHANGYONGHAOMAInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaochangyonghaoma_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOCHANGYONGHAOMA_PRO.UpdateFieldAIHAOCHANGYONGHAOMAV(?,?,?)}";
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
* 更新AIHAOCHANGYONGHAOMAIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaochangyonghaoma_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOCHANGYONGHAOMA_PRO.UpdateFieldAIHAOCHANGYONGHAOMAU(?,?,?)}";
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
