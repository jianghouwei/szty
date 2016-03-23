/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataHuangyebaidugl.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.huangyebaidugl_Dao;
import com.szty.aihao.core.huangyebaidugl_core;
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
*@HUANGYEBAIDUGL数据接口
*@作者：宋春林 
*/
public class huangyebaidugl_impl implements huangyebaidugl_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(huangyebaidugl_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param HUANGYEBAIDUGL实体
* @return 新插入记录的编号
*/
public int insert_huangyebaidugl(huangyebaidugl_Dao _HUANGYEBAIDUGLModel)  throws Exception{
         String sqlStr = "{call HUANGYEBAIDUGL_PRO.InsertHUANGYEBAIDUGL(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[13];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_HUANGYEBAIDUGLModel.getGlid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_HUANGYEBAIDUGLModel.getGlfrom());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGladdr());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGlcp());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGldistance());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGlname());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGlpoitype());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGltel());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGluid());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGlzip());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGllongitude());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGllatitude());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_HUANGYEBAIDUGLModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param HUANGYEBAIDUGL
* @Object 
* @return 新插入记录的编号
*/
public int insert_huangyebaidugl(Object[] _para)  throws Exception{
      String sqlStr = "{call HUANGYEBAIDUGL_PRO.InsertHUANGYEBAIDUGL(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[13];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_para[12]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param HUANGYEBAIDUGL实体
* @return 影响的行数
*/
public int update_huangyebaidugl(huangyebaidugl_Dao _HUANGYEBAIDUGLModel)  throws Exception{
        String sqlStr = "{call HUANGYEBAIDUGL_PRO.UpdateHUANGYEBAIDUGL(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[13];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_HUANGYEBAIDUGLModel.getGlid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_HUANGYEBAIDUGLModel.getGlfrom());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGladdr());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGlcp());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGldistance());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGlname());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGlpoitype());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGltel());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGluid());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGlzip());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGllongitude());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_HUANGYEBAIDUGLModel.getGllatitude());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_HUANGYEBAIDUGLModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表HUANGYEBAIDUGL中的一条记录
* @param HUANGYEBAIDUGL实体
* @return 新插入记录的编号
*/
public int delete_huangyebaidugl(int Glid)  throws Exception{
        String sqlStr = "{call HUANGYEBAIDUGL_PRO.DeleteHUANGYEBAIDUGL(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Glid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 huangyebaidugl 数据实体
* @param Glid">Glid
* @return<huangyebaidugl 数据实体
* @throws Exception 
*/
public huangyebaidugl_Dao get_huangyebaiduglDao(int Glid) throws Exception{
         String sqlStr = "{ call HUANGYEBAIDUGL_PRO.GetHUANGYEBAIDUGLEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Glid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			huangyebaidugl_Dao _obj = new huangyebaidugl_Dao();
            _obj.setGlid(arr.getInt("GLID"));
            _obj.setGlfrom(arr.getInt("GLFROM"));
            _obj.setGladdr(arr.getString("GLADDR"));
            _obj.setGlcp(arr.getString("GLCP"));
            _obj.setGldistance(arr.getString("GLDISTANCE"));
            _obj.setGlname(arr.getString("GLNAME"));
            _obj.setGlpoitype(arr.getString("GLPOITYPE"));
            _obj.setGltel(arr.getString("GLTEL"));
            _obj.setGluid(arr.getString("GLUID"));
            _obj.setGlzip(arr.getString("GLZIP"));
            _obj.setGllongitude(arr.getString("GLLONGITUDE"));
            _obj.setGllatitude(arr.getString("GLLATITUDE"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据HUANGYEBAIDUGL返回的查询DataRow创建一个HUANGYEBAIDUGLEntity对象
* @param HUANGYEBAIDUGL row
* @returnHUANGYEBAIDUGLList对象
* @throws Exception 
*/
public List<huangyebaidugl_Dao> get_huangyebaidugl_All() throws Exception{
        List<huangyebaidugl_Dao> _list = new ArrayList<huangyebaidugl_Dao>();
		String sqlStr = "{ call HUANGYEBAIDUGL_PRO.GetHUANGYEBAIDUGL(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			huangyebaidugl_Dao _obj = new huangyebaidugl_Dao();
            _obj.setGlid(arr.getInt("GLID"));
            _obj.setGlfrom(arr.getInt("GLFROM"));
            _obj.setGladdr(arr.getString("GLADDR"));
            _obj.setGlcp(arr.getString("GLCP"));
            _obj.setGldistance(arr.getString("GLDISTANCE"));
            _obj.setGlname(arr.getString("GLNAME"));
            _obj.setGlpoitype(arr.getString("GLPOITYPE"));
            _obj.setGltel(arr.getString("GLTEL"));
            _obj.setGluid(arr.getString("GLUID"));
            _obj.setGlzip(arr.getString("GLZIP"));
            _obj.setGllongitude(arr.getString("GLLONGITUDE"));
            _obj.setGllatitude(arr.getString("GLLATITUDE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据HUANGYEBAIDUGL返回的查询DataRow创建一个HUANGYEBAIDUGLEntity对象
* @param HUANGYEBAIDUGL row
* @returnHUANGYEBAIDUGLList对象
* @throws Exception 
*/
public List< huangyebaidugl_Dao> get_huangyebaidugl_All(String strWhere) throws Exception{
         List<huangyebaidugl_Dao> _list = new ArrayList<huangyebaidugl_Dao>();
		 String sqlStr = "{ call HUANGYEBAIDUGL_PRO.GetHUANGYEBAIDUGLWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				huangyebaidugl_Dao _obj = new huangyebaidugl_Dao();
            _obj.setGlid(arr.getInt("GLID"));
            _obj.setGlfrom(arr.getInt("GLFROM"));
            _obj.setGladdr(arr.getString("GLADDR"));
            _obj.setGlcp(arr.getString("GLCP"));
            _obj.setGldistance(arr.getString("GLDISTANCE"));
            _obj.setGlname(arr.getString("GLNAME"));
            _obj.setGlpoitype(arr.getString("GLPOITYPE"));
            _obj.setGltel(arr.getString("GLTEL"));
            _obj.setGluid(arr.getString("GLUID"));
            _obj.setGlzip(arr.getString("GLZIP"));
            _obj.setGllongitude(arr.getString("GLLONGITUDE"));
            _obj.setGllatitude(arr.getString("GLLATITUDE"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据HUANGYEBAIDUGL返回 分页数据
* @param HUANGYEBAIDUGL row
* @returnHUANGYEBAIDUGLList对象
* @throws Exception 
*/
public List<huangyebaidugl_Dao> get_huangyebaidugl_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<huangyebaidugl_Dao> _list = new ArrayList<huangyebaidugl_Dao>();
		String sqlStr = "{ call HUANGYEBAIDUGL_PRO.GetHUANGYEBAIDUGLPage(?,?,?,?,?,?)}";
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
				huangyebaidugl_Dao _obj = new huangyebaidugl_Dao();
            _obj.setGlid(arr.getInt("GLID"));
            _obj.setGlfrom(arr.getInt("GLFROM"));
            _obj.setGladdr(arr.getString("GLADDR"));
            _obj.setGlcp(arr.getString("GLCP"));
            _obj.setGldistance(arr.getString("GLDISTANCE"));
            _obj.setGlname(arr.getString("GLNAME"));
            _obj.setGlpoitype(arr.getString("GLPOITYPE"));
            _obj.setGltel(arr.getString("GLTEL"));
            _obj.setGluid(arr.getString("GLUID"));
            _obj.setGlzip(arr.getString("GLZIP"));
            _obj.setGllongitude(arr.getString("GLLONGITUDE"));
            _obj.setGllatitude(arr.getString("GLLATITUDE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据HUANGYEBAIDUGL返回的查询DataRow创建一个HUANGYEBAIDUGLEntity对象
* @param HUANGYEBAIDUGL row
* @returnHUANGYEBAIDUGLDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, huangyebaidugl_Dao> get_huangyebaidugl_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dichuangyebaiduglstrWhere") == null) {
			Dictionary<Integer, huangyebaidugl_Dao> _dic = new Hashtable<Integer, huangyebaidugl_Dao>();
			List<huangyebaidugl_Dao> _list = new ArrayList<huangyebaidugl_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getGlid()), _list.get(i));
			}
			classFactory.cachePut("dichuangyebaidugl", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, huangyebaidugl_Dao> _dic = (Dictionary<Integer, huangyebaidugl_Dao>) classFactory
					.cacheGet("dichuangyebaiduglstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新HUANGYEBAIDUGL字段加一
* @param FieldName
* @param sid
*/
public int create_huangyebaidugl_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call HUANGYEBAIDUGL_PRO.UpdateFieldHUANGYEBAIDUGL(?,?)}";
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
* 更新HUANGYEBAIDUGLInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_huangyebaidugl_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call HUANGYEBAIDUGL_PRO.UpdateFieldHUANGYEBAIDUGLV(?,?,?)}";
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
* 更新HUANGYEBAIDUGLIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_huangyebaidugl_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call HUANGYEBAIDUGL_PRO.UpdateFieldHUANGYEBAIDUGLU(?,?,?)}";
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
