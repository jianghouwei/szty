/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataHuangyebaidu.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.huangyebaidu_Dao;
import com.szty.aihao.core.huangyebaidu_core;
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
*@HUANGYEBAIDU数据接口
*@作者：宋春林 
*/
public class huangyebaidu_impl implements huangyebaidu_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(huangyebaidu_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param HUANGYEBAIDU实体
* @return 新插入记录的编号
*/
public int insert_huangyebaidu(huangyebaidu_Dao _HUANGYEBAIDUModel)  throws Exception{
         String sqlStr = "{call HUANGYEBAIDU_PRO.InsertHUANGYEBAIDU(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_HUANGYEBAIDUModel.getMerid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerphone());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaiducity());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaiducitycode());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaidudistrict());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaiduprovince());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaidustreet());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaidustreetnumber());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_HUANGYEBAIDUModel.getCdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaidubusiness());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param HUANGYEBAIDU
* @Object 
* @return 新插入记录的编号
*/
public int insert_huangyebaidu(Object[] _para)  throws Exception{
      String sqlStr = "{call HUANGYEBAIDU_PRO.InsertHUANGYEBAIDU(?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[11];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_para[9]));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param HUANGYEBAIDU实体
* @return 影响的行数
*/
public int update_huangyebaidu(huangyebaidu_Dao _HUANGYEBAIDUModel)  throws Exception{
        String sqlStr = "{call HUANGYEBAIDU_PRO.UpdateHUANGYEBAIDU(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_HUANGYEBAIDUModel.getMerid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerphone());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaiducity());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaiducitycode());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaidudistrict());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaiduprovince());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaidustreet());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaidustreetnumber());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_HUANGYEBAIDUModel.getCdate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUModel.getMerbaidubusiness());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表HUANGYEBAIDU中的一条记录
* @param HUANGYEBAIDU实体
* @return 新插入记录的编号
*/
public int delete_huangyebaidu(int Merid)  throws Exception{
        String sqlStr = "{call HUANGYEBAIDU_PRO.DeleteHUANGYEBAIDU(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Merid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 huangyebaidu 数据实体
* @param Merid">Merid
* @return<huangyebaidu 数据实体
* @throws Exception 
*/
public huangyebaidu_Dao get_huangyebaiduDao(int Merid) throws Exception{
         String sqlStr = "{ call HUANGYEBAIDU_PRO.GetHUANGYEBAIDUEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Merid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			huangyebaidu_Dao _obj = new huangyebaidu_Dao();
            _obj.setMerid(arr.getInt("MERID"));
            _obj.setMername(arr.getString("MERNAME"));
            _obj.setMerphone(arr.getString("MERPHONE"));
            _obj.setMerbaiducity(arr.getString("MERBAIDUCITY"));
            _obj.setMerbaiducitycode(arr.getString("MERBAIDUCITYCODE"));
            _obj.setMerbaidudistrict(arr.getString("MERBAIDUDISTRICT"));
            _obj.setMerbaiduprovince(arr.getString("MERBAIDUPROVINCE"));
            _obj.setMerbaidustreet(arr.getString("MERBAIDUSTREET"));
            _obj.setMerbaidustreetnumber(arr.getString("MERBAIDUSTREETNUMBER"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setMerbaidubusiness(arr.getString("MERBAIDUBUSINESS"));
			return _obj;
		}
		return null;

}

/**
* 根据HUANGYEBAIDU返回的查询DataRow创建一个HUANGYEBAIDUEntity对象
* @param HUANGYEBAIDU row
* @returnHUANGYEBAIDUList对象
* @throws Exception 
*/
public List<huangyebaidu_Dao> get_huangyebaidu_All() throws Exception{
        List<huangyebaidu_Dao> _list = new ArrayList<huangyebaidu_Dao>();
		String sqlStr = "{ call HUANGYEBAIDU_PRO.GetHUANGYEBAIDU(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			huangyebaidu_Dao _obj = new huangyebaidu_Dao();
            _obj.setMerid(arr.getInt("MERID"));
            _obj.setMername(arr.getString("MERNAME"));
            _obj.setMerphone(arr.getString("MERPHONE"));
            _obj.setMerbaiducity(arr.getString("MERBAIDUCITY"));
            _obj.setMerbaiducitycode(arr.getString("MERBAIDUCITYCODE"));
            _obj.setMerbaidudistrict(arr.getString("MERBAIDUDISTRICT"));
            _obj.setMerbaiduprovince(arr.getString("MERBAIDUPROVINCE"));
            _obj.setMerbaidustreet(arr.getString("MERBAIDUSTREET"));
            _obj.setMerbaidustreetnumber(arr.getString("MERBAIDUSTREETNUMBER"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setMerbaidubusiness(arr.getString("MERBAIDUBUSINESS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据HUANGYEBAIDU返回的查询DataRow创建一个HUANGYEBAIDUEntity对象
* @param HUANGYEBAIDU row
* @returnHUANGYEBAIDUList对象
* @throws Exception 
*/
public List< huangyebaidu_Dao> get_huangyebaidu_All(String strWhere) throws Exception{
         List<huangyebaidu_Dao> _list = new ArrayList<huangyebaidu_Dao>();
		 String sqlStr = "{ call HUANGYEBAIDU_PRO.GetHUANGYEBAIDUWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				huangyebaidu_Dao _obj = new huangyebaidu_Dao();
            _obj.setMerid(arr.getInt("MERID"));
            _obj.setMername(arr.getString("MERNAME"));
            _obj.setMerphone(arr.getString("MERPHONE"));
            _obj.setMerbaiducity(arr.getString("MERBAIDUCITY"));
            _obj.setMerbaiducitycode(arr.getString("MERBAIDUCITYCODE"));
            _obj.setMerbaidudistrict(arr.getString("MERBAIDUDISTRICT"));
            _obj.setMerbaiduprovince(arr.getString("MERBAIDUPROVINCE"));
            _obj.setMerbaidustreet(arr.getString("MERBAIDUSTREET"));
            _obj.setMerbaidustreetnumber(arr.getString("MERBAIDUSTREETNUMBER"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setMerbaidubusiness(arr.getString("MERBAIDUBUSINESS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据HUANGYEBAIDU返回 分页数据
* @param HUANGYEBAIDU row
* @returnHUANGYEBAIDUList对象
* @throws Exception 
*/
public List<huangyebaidu_Dao> get_huangyebaidu_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<huangyebaidu_Dao> _list = new ArrayList<huangyebaidu_Dao>();
		String sqlStr = "{ call HUANGYEBAIDU_PRO.GetHUANGYEBAIDUPage(?,?,?,?,?,?)}";
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
				huangyebaidu_Dao _obj = new huangyebaidu_Dao();
            _obj.setMerid(arr.getInt("MERID"));
            _obj.setMername(arr.getString("MERNAME"));
            _obj.setMerphone(arr.getString("MERPHONE"));
            _obj.setMerbaiducity(arr.getString("MERBAIDUCITY"));
            _obj.setMerbaiducitycode(arr.getString("MERBAIDUCITYCODE"));
            _obj.setMerbaidudistrict(arr.getString("MERBAIDUDISTRICT"));
            _obj.setMerbaiduprovince(arr.getString("MERBAIDUPROVINCE"));
            _obj.setMerbaidustreet(arr.getString("MERBAIDUSTREET"));
            _obj.setMerbaidustreetnumber(arr.getString("MERBAIDUSTREETNUMBER"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setMerbaidubusiness(arr.getString("MERBAIDUBUSINESS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据HUANGYEBAIDU返回的查询DataRow创建一个HUANGYEBAIDUEntity对象
* @param HUANGYEBAIDU row
* @returnHUANGYEBAIDUDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, huangyebaidu_Dao> get_huangyebaidu_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dichuangyebaidustrWhere") == null) {
			Dictionary<Integer, huangyebaidu_Dao> _dic = new Hashtable<Integer, huangyebaidu_Dao>();
			List<huangyebaidu_Dao> _list = new ArrayList<huangyebaidu_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMerid()), _list.get(i));
			}
			classFactory.cachePut("dichuangyebaidu", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, huangyebaidu_Dao> _dic = (Dictionary<Integer, huangyebaidu_Dao>) classFactory
					.cacheGet("dichuangyebaidustrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新HUANGYEBAIDU字段加一
* @param FieldName
* @param sid
*/
public int create_huangyebaidu_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call HUANGYEBAIDU_PRO.UpdateFieldHUANGYEBAIDU(?,?)}";
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
* 更新HUANGYEBAIDUInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_huangyebaidu_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call HUANGYEBAIDU_PRO.UpdateFieldHUANGYEBAIDUV(?,?,?)}";
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
* 更新HUANGYEBAIDUIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_huangyebaidu_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call HUANGYEBAIDU_PRO.UpdateFieldHUANGYEBAIDUU(?,?,?)}";
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
