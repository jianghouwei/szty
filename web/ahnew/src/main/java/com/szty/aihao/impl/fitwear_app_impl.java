/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataFitwear_app.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/11/5
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.fitwear_app_Dao;
import com.szty.aihao.core.fitwear_app_core;
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
*@FITWEAR_APP数据接口
*@作者：宋春林 
*/
public class fitwear_app_impl implements fitwear_app_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(fitwear_app_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param FITWEAR_APP实体
* @return 新插入记录的编号
*/
public int insert_fitwear_app(fitwear_app_Dao _FITWEAR_APPModel)  throws Exception{
         String sqlStr = "{call FITWEAR_APP_PRO.InsertFITWEAR_APP(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_FITWEAR_APPModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getAppname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getCategory());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getDeveloper());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getVername());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getVercode());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getSummary());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getDescript());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getLogo());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getImgs());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getM_apk());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getF_apk());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_FITWEAR_APPModel.getCreatetime()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getOperater());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_FITWEAR_APPModel.getIsdel());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getSortorder());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getM_apk_size());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getF_apk_size());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getPackagename());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param FITWEAR_APP
* @Object 
* @return 新插入记录的编号
*/
public int insert_fitwear_app(Object[] _para)  throws Exception{
      String sqlStr = "{call FITWEAR_APP_PRO.InsertFITWEAR_APP(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[19];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
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
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_para[18]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param FITWEAR_APP实体
* @return 影响的行数
*/
public int update_fitwear_app(fitwear_app_Dao _FITWEAR_APPModel)  throws Exception{
        String sqlStr = "{call FITWEAR_APP_PRO.UpdateFITWEAR_APP(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[19];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_FITWEAR_APPModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getAppname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getCategory());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getDeveloper());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getVername());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getVercode());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getSummary());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getDescript());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getLogo());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getImgs());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getM_apk());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getF_apk());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_FITWEAR_APPModel.getCreatetime()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getOperater());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_FITWEAR_APPModel.getIsdel());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getSortorder());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getM_apk_size());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getF_apk_size());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NVARCHAR,_FITWEAR_APPModel.getPackagename());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表FITWEAR_APP中的一条记录
* @param FITWEAR_APP实体
* @return 新插入记录的编号
*/
public int delete_fitwear_app(int Id)  throws Exception{
        String sqlStr = "{call FITWEAR_APP_PRO.DeleteFITWEAR_APP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 fitwear_app 数据实体
* @param Id">Id
* @return<fitwear_app 数据实体
* @throws Exception 
*/
public fitwear_app_Dao get_fitwear_appDao(int Id) throws Exception{
         String sqlStr = "{ call FITWEAR_APP_PRO.GetFITWEAR_APPEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			fitwear_app_Dao _obj = new fitwear_app_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setAppname(arr.getString("APPNAME"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setDeveloper(arr.getString("DEVELOPER"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setVercode(arr.getString("VERCODE"));
            _obj.setSummary(arr.getString("SUMMARY"));
            _obj.setDescript(arr.getString("DESCRIPT"));
            _obj.setLogo(arr.getString("LOGO"));
            _obj.setImgs(arr.getString("IMGS"));
            _obj.setM_apk(arr.getString("M_APK"));
            _obj.setF_apk(arr.getString("F_APK"));
             try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setOperater(arr.getString("OPERATER"));
            _obj.setIsdel(arr.getInt("ISDEL"));
            _obj.setSortorder(arr.getString("SORTORDER"));
            _obj.setM_apk_size(arr.getString("M_APK_SIZE"));
            _obj.setF_apk_size(arr.getString("F_APK_SIZE"));
            _obj.setPackagename(arr.getString("PACKAGENAME"));
			return _obj;
		}
		return null;

}
/**
* 得到 fitwear_app 数据行数
* @param Id">Id
* @return<fitwear_app 数据行数
* @throws Exception 
*/
public int get_fitwear_appCount(String sWhere) throws Exception{
         String sqlStr = "{ call FITWEAR_APP_PRO.GetFITWEAR_APPCount(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NVARCHAR, sWhere);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			
			
        
           return arr.getInt("SCOUNT");
           
  
		}
		return 0;

}
/**
* 得到 fitwear_app 数据行数
* @param Id">Id
* @return<fitwear_app 数据行数
* @throws Exception 
*/
public int get_fitwear_appVal() throws Exception{
         String sqlStr = "{ call FITWEAR_APP_PRO.GetFITWEAR_APPVal(?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
           return arr.getInt("SCOUNT");
		}
		return 0;

}
/**
* 根据FITWEAR_APP返回的查询DataRow创建一个FITWEAR_APPEntity对象
* @param FITWEAR_APP row
* @returnFITWEAR_APPList对象
* @throws Exception 
*/
public List<fitwear_app_Dao> get_fitwear_app_All() throws Exception{
        List<fitwear_app_Dao> _list = new ArrayList<fitwear_app_Dao>();
		String sqlStr = "{ call FITWEAR_APP_PRO.GetFITWEAR_APP(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			fitwear_app_Dao _obj = new fitwear_app_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setAppname(arr.getString("APPNAME"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setDeveloper(arr.getString("DEVELOPER"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setVercode(arr.getString("VERCODE"));
            _obj.setSummary(arr.getString("SUMMARY"));
            _obj.setDescript(arr.getString("DESCRIPT"));
            _obj.setLogo(arr.getString("LOGO"));
            _obj.setImgs(arr.getString("IMGS"));
            _obj.setM_apk(arr.getString("M_APK"));
            _obj.setF_apk(arr.getString("F_APK"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setOperater(arr.getString("OPERATER"));
            _obj.setIsdel(arr.getInt("ISDEL"));
            _obj.setSortorder(arr.getString("SORTORDER"));
            _obj.setM_apk_size(arr.getString("M_APK_SIZE"));
            _obj.setF_apk_size(arr.getString("F_APK_SIZE"));
            _obj.setPackagename(arr.getString("PACKAGENAME"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据FITWEAR_APP返回的查询DataRow创建一个FITWEAR_APPEntity对象
* @param FITWEAR_APP row
* @returnFITWEAR_APPList对象
* @throws Exception 
*/
public List< fitwear_app_Dao> get_fitwear_app_All(String strWhere) throws Exception{
         List<fitwear_app_Dao> _list = new ArrayList<fitwear_app_Dao>();
		 String sqlStr = "{ call FITWEAR_APP_PRO.GetFITWEAR_APPWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				fitwear_app_Dao _obj = new fitwear_app_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setAppname(arr.getString("APPNAME"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setDeveloper(arr.getString("DEVELOPER"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setVercode(arr.getString("VERCODE"));
            _obj.setSummary(arr.getString("SUMMARY"));
            _obj.setDescript(arr.getString("DESCRIPT"));
            _obj.setLogo(arr.getString("LOGO"));
            _obj.setImgs(arr.getString("IMGS"));
            _obj.setM_apk(arr.getString("M_APK"));
            _obj.setF_apk(arr.getString("F_APK"));
           try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setOperater(arr.getString("OPERATER"));
            _obj.setIsdel(arr.getInt("ISDEL"));
            _obj.setSortorder(arr.getString("SORTORDER"));
            _obj.setM_apk_size(arr.getString("M_APK_SIZE"));
            _obj.setF_apk_size(arr.getString("F_APK_SIZE"));
            _obj.setPackagename(arr.getString("PACKAGENAME"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据FITWEAR_APP返回 分页数据
* @param FITWEAR_APP row
* @returnFITWEAR_APPList对象
* @throws Exception 
*/
public List<fitwear_app_Dao> get_fitwear_app_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<fitwear_app_Dao> _list = new ArrayList<fitwear_app_Dao>();
		String sqlStr = "{ call FITWEAR_APP_PRO.GetFITWEAR_APPPage(?,?,?,?,?,?)}";
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
				fitwear_app_Dao _obj = new fitwear_app_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setAppname(arr.getString("APPNAME"));
            _obj.setCategory(arr.getString("CATEGORY"));
            _obj.setDeveloper(arr.getString("DEVELOPER"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setVercode(arr.getString("VERCODE"));
            _obj.setSummary(arr.getString("SUMMARY"));
            _obj.setDescript(arr.getString("DESCRIPT"));
            _obj.setLogo(arr.getString("LOGO"));
            _obj.setImgs(arr.getString("IMGS"));
            _obj.setM_apk(arr.getString("M_APK"));
            _obj.setF_apk(arr.getString("F_APK"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setOperater(arr.getString("OPERATER"));
            _obj.setIsdel(arr.getInt("ISDEL"));
            _obj.setSortorder(arr.getString("SORTORDER"));
            _obj.setM_apk_size(arr.getString("M_APK_SIZE"));
            _obj.setF_apk_size(arr.getString("F_APK_SIZE"));
            _obj.setPackagename(arr.getString("PACKAGENAME"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据FITWEAR_APP返回的查询DataRow创建一个FITWEAR_APPEntity对象
* @param FITWEAR_APP row
* @returnFITWEAR_APPDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, fitwear_app_Dao> get_fitwear_app_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicfitwear_appstrWhere") == null) {
			Dictionary<Integer, fitwear_app_Dao> _dic = new Hashtable<Integer, fitwear_app_Dao>();
			List<fitwear_app_Dao> _list = new ArrayList<fitwear_app_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicfitwear_app", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, fitwear_app_Dao> _dic = (Dictionary<Integer, fitwear_app_Dao>) classFactory
					.cacheGet("dicfitwear_appstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新FITWEAR_APP字段加一
* @param FieldName
* @param sid
*/
public int create_fitwear_app_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call FITWEAR_APP_PRO.UpdateFieldFITWEAR_APP(?,?)}";
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
* 更新FITWEAR_APPInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_fitwear_app_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call FITWEAR_APP_PRO.UpdateFieldFITWEAR_APPV(?,?,?)}";
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
* 更新FITWEAR_APPIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_fitwear_app_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call FITWEAR_APP_PRO.UpdateFieldFITWEAR_APPU(?,?,?)}";
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
