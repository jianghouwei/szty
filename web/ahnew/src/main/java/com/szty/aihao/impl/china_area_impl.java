/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataChina_area.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.china_area_Dao;
import com.szty.aihao.core.china_area_core;
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
*@CHINA_AREA数据接口
*@作者：宋春林 
*/
public class china_area_impl implements china_area_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(china_area_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param CHINA_AREA实体
* @return 新插入记录的编号
*/
public int insert_china_area(china_area_Dao _CHINA_AREAModel)  throws Exception{
         String sqlStr = "{call CHINA_AREA_PRO.InsertCHINA_AREA(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_CHINA_AREAModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_CHINA_AREAModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_CHINA_AREAModel.getLv());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_CHINA_AREAModel.getUsetype());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_CHINA_AREAModel.getUpid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_CHINA_AREAModel.getDisplayorder());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param CHINA_AREA
* @Object 
* @return 新插入记录的编号
*/
public int insert_china_area(Object[] _para)  throws Exception{
      String sqlStr = "{call CHINA_AREA_PRO.InsertCHINA_AREA(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param CHINA_AREA实体
* @return 影响的行数
*/
public int update_china_area(china_area_Dao _CHINA_AREAModel)  throws Exception{
        String sqlStr = "{call CHINA_AREA_PRO.UpdateCHINA_AREA(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_CHINA_AREAModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_CHINA_AREAModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_CHINA_AREAModel.getLv());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_CHINA_AREAModel.getUsetype());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_CHINA_AREAModel.getUpid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_CHINA_AREAModel.getDisplayorder());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表CHINA_AREA中的一条记录
* @param CHINA_AREA实体
* @return 新插入记录的编号
*/
public int delete_china_area(int Id)  throws Exception{
        String sqlStr = "{call CHINA_AREA_PRO.DeleteCHINA_AREA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 china_area 数据实体
* @param Id">Id
* @return<china_area 数据实体
* @throws Exception 
*/
public china_area_Dao get_china_areaDao(int Id) throws Exception{
         String sqlStr = "{ call CHINA_AREA_PRO.GetCHINA_AREAEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			china_area_Dao _obj = new china_area_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setLv(arr.getInt("LV"));
            _obj.setUsetype(arr.getInt("USETYPE"));
            _obj.setUpid(arr.getInt("UPID"));
            _obj.setDisplayorder(arr.getInt("DISPLAYORDER"));
			return _obj;
		}
		return null;

}

/**
* 根据CHINA_AREA返回的查询DataRow创建一个CHINA_AREAEntity对象
* @param CHINA_AREA row
* @returnCHINA_AREAList对象
* @throws Exception 
*/
public List<china_area_Dao> get_china_area_All() throws Exception{
        List<china_area_Dao> _list = new ArrayList<china_area_Dao>();
		String sqlStr = "{ call CHINA_AREA_PRO.GetCHINA_AREA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			china_area_Dao _obj = new china_area_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setLv(arr.getInt("LV"));
            _obj.setUsetype(arr.getInt("USETYPE"));
            _obj.setUpid(arr.getInt("UPID"));
            _obj.setDisplayorder(arr.getInt("DISPLAYORDER"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据CHINA_AREA返回的查询DataRow创建一个CHINA_AREAEntity对象
* @param CHINA_AREA row
* @returnCHINA_AREAList对象
* @throws Exception 
*/
public List< china_area_Dao> get_china_area_All(String strWhere) throws Exception{
         List<china_area_Dao> _list = new ArrayList<china_area_Dao>();
		 String sqlStr = "{ call CHINA_AREA_PRO.GetCHINA_AREAWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				china_area_Dao _obj = new china_area_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setLv(arr.getInt("LV"));
            _obj.setUsetype(arr.getInt("USETYPE"));
            _obj.setUpid(arr.getInt("UPID"));
            _obj.setDisplayorder(arr.getInt("DISPLAYORDER"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据CHINA_AREA返回 分页数据
* @param CHINA_AREA row
* @returnCHINA_AREAList对象
* @throws Exception 
*/
public List<china_area_Dao> get_china_area_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<china_area_Dao> _list = new ArrayList<china_area_Dao>();
		String sqlStr = "{ call CHINA_AREA_PRO.GetCHINA_AREAPage(?,?,?,?,?,?)}";
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
				china_area_Dao _obj = new china_area_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setName(arr.getString("NAME"));
            _obj.setLv(arr.getInt("LV"));
            _obj.setUsetype(arr.getInt("USETYPE"));
            _obj.setUpid(arr.getInt("UPID"));
            _obj.setDisplayorder(arr.getInt("DISPLAYORDER"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据CHINA_AREA返回的查询DataRow创建一个CHINA_AREAEntity对象
* @param CHINA_AREA row
* @returnCHINA_AREADictionary对象
* @throws Exception 
*/
public Dictionary<Integer, china_area_Dao> get_china_area_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicchina_areastrWhere") == null) {
			Dictionary<Integer, china_area_Dao> _dic = new Hashtable<Integer, china_area_Dao>();
			List<china_area_Dao> _list = new ArrayList<china_area_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicchina_area", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, china_area_Dao> _dic = (Dictionary<Integer, china_area_Dao>) classFactory
					.cacheGet("dicchina_areastrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新CHINA_AREA字段加一
* @param FieldName
* @param sid
*/
public int create_china_area_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call CHINA_AREA_PRO.UpdateFieldCHINA_AREA(?,?)}";
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
* 更新CHINA_AREAInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_china_area_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call CHINA_AREA_PRO.UpdateFieldCHINA_AREAV(?,?,?)}";
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
* 更新CHINA_AREAIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_china_area_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call CHINA_AREA_PRO.UpdateFieldCHINA_AREAU(?,?,?)}";
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
