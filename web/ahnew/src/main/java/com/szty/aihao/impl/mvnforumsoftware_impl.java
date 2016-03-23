/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumsoftware.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumsoftware_Dao;
import com.szty.aihao.core.mvnforumsoftware_core;
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
*@MVNFORUMSOFTWARE数据接口
*@作者：宋春林 
*/
public class mvnforumsoftware_impl implements mvnforumsoftware_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumsoftware_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSOFTWARE实体
* @return 新插入记录的编号
*/
public int insert_mvnforumsoftware(mvnforumsoftware_Dao _MVNFORUMSOFTWAREModel)  throws Exception{
         String sqlStr = "{call MVNFORUMSOFTWARE_PRO.InsertMVNFORUMSOFTWARE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[21];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getSoftwareid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwarename());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getSoftwarenature());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getSoftwarecategory());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwaretags());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwarelanguage());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwaredesc());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwarelogo());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwareimg());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwarefilename());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getFolderpart());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSOFTWAREModel.getSoftwarecreationdate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSOFTWAREModel.getSoftwaremodifieddate()));
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwareownername());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getSoftwarestatus());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getViewcount());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getDownloadcount());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getFavoritecount());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getCommentcount());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getScoring());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSOFTWARE
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumsoftware(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMSOFTWARE_PRO.InsertMVNFORUMSOFTWARE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[21];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_para[12]));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.DATE, dateformat.format(_para[13]));
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_para[18]);
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_para[19]);
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_para[20]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMSOFTWARE实体
* @return 影响的行数
*/
public int update_mvnforumsoftware(mvnforumsoftware_Dao _MVNFORUMSOFTWAREModel)  throws Exception{
        String sqlStr = "{call MVNFORUMSOFTWARE_PRO.UpdateMVNFORUMSOFTWARE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[21];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getSoftwareid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwarename());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getSoftwarenature());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getSoftwarecategory());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwaretags());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwarelanguage());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwaredesc());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwarelogo());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwareimg());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwarefilename());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getFolderpart());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSOFTWAREModel.getSoftwarecreationdate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSOFTWAREModel.getSoftwaremodifieddate()));
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSOFTWAREModel.getSoftwareownername());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getSoftwarestatus());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getViewcount());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getDownloadcount());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getFavoritecount());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getCommentcount());
        op[20]= new OracleParameter(21, "IN", java.sql.Types.NUMERIC,_MVNFORUMSOFTWAREModel.getScoring());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMSOFTWARE中的一条记录
* @param MVNFORUMSOFTWARE实体
* @return 新插入记录的编号
*/
public int delete_mvnforumsoftware(int Softwareid)  throws Exception{
        String sqlStr = "{call MVNFORUMSOFTWARE_PRO.DeleteMVNFORUMSOFTWARE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Softwareid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumsoftware 数据实体
* @param Softwareid">Softwareid
* @return<mvnforumsoftware 数据实体
* @throws Exception 
*/
public mvnforumsoftware_Dao get_mvnforumsoftwareDao(int Softwareid) throws Exception{
         String sqlStr = "{ call MVNFORUMSOFTWARE_PRO.GetMVNFORUMSOFTWAREEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Softwareid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsoftware_Dao _obj = new mvnforumsoftware_Dao();
            _obj.setSoftwareid(arr.getInt("SOFTWAREID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setSoftwarename(arr.getString("SOFTWARENAME"));
            _obj.setSoftwarenature(arr.getInt("SOFTWARENATURE"));
            _obj.setSoftwarecategory(arr.getInt("SOFTWARECATEGORY"));
            _obj.setSoftwaretags(arr.getString("SOFTWARETAGS"));
            _obj.setSoftwarelanguage(arr.getString("SOFTWARELANGUAGE"));
            _obj.setSoftwaredesc(arr.getString("SOFTWAREDESC"));
            _obj.setSoftwarelogo(arr.getString("SOFTWARELOGO"));
            _obj.setSoftwareimg(arr.getString("SOFTWAREIMG"));
            _obj.setSoftwarefilename(arr.getString("SOFTWAREFILENAME"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
             try{_obj.setSoftwarecreationdate(dateformat.parse(arr.getString("SOFTWARECREATIONDATE")));}catch(Exception ce){_obj.setSoftwarecreationdate((new Date()));}
             try{_obj.setSoftwaremodifieddate(dateformat.parse(arr.getString("SOFTWAREMODIFIEDDATE")));}catch(Exception ce){_obj.setSoftwaremodifieddate((new Date()));}
            _obj.setSoftwareownername(arr.getString("SOFTWAREOWNERNAME"));
            _obj.setSoftwarestatus(arr.getInt("SOFTWARESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _obj.setFavoritecount(arr.getInt("FAVORITECOUNT"));
            _obj.setCommentcount(arr.getInt("COMMENTCOUNT"));
            _obj.setScoring(arr.getInt("SCORING"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMSOFTWARE返回的查询DataRow创建一个MVNFORUMSOFTWAREEntity对象
* @param MVNFORUMSOFTWARE row
* @returnMVNFORUMSOFTWAREList对象
* @throws Exception 
*/
public List<mvnforumsoftware_Dao> get_mvnforumsoftware_All() throws Exception{
        List<mvnforumsoftware_Dao> _list = new ArrayList<mvnforumsoftware_Dao>();
		String sqlStr = "{ call MVNFORUMSOFTWARE_PRO.GetMVNFORUMSOFTWARE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsoftware_Dao _obj = new mvnforumsoftware_Dao();
            _obj.setSoftwareid(arr.getInt("SOFTWAREID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setSoftwarename(arr.getString("SOFTWARENAME"));
            _obj.setSoftwarenature(arr.getInt("SOFTWARENATURE"));
            _obj.setSoftwarecategory(arr.getInt("SOFTWARECATEGORY"));
            _obj.setSoftwaretags(arr.getString("SOFTWARETAGS"));
            _obj.setSoftwarelanguage(arr.getString("SOFTWARELANGUAGE"));
            _obj.setSoftwaredesc(arr.getString("SOFTWAREDESC"));
            _obj.setSoftwarelogo(arr.getString("SOFTWARELOGO"));
            _obj.setSoftwareimg(arr.getString("SOFTWAREIMG"));
            _obj.setSoftwarefilename(arr.getString("SOFTWAREFILENAME"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
            try{_obj.setSoftwarecreationdate(dateformat.parse(arr.getString("SOFTWARECREATIONDATE")));}catch(Exception ce){_obj.setSoftwarecreationdate((new Date()));}
            try{_obj.setSoftwaremodifieddate(dateformat.parse(arr.getString("SOFTWAREMODIFIEDDATE")));}catch(Exception ce){_obj.setSoftwaremodifieddate((new Date()));}
            _obj.setSoftwareownername(arr.getString("SOFTWAREOWNERNAME"));
            _obj.setSoftwarestatus(arr.getInt("SOFTWARESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _obj.setFavoritecount(arr.getInt("FAVORITECOUNT"));
            _obj.setCommentcount(arr.getInt("COMMENTCOUNT"));
            _obj.setScoring(arr.getInt("SCORING"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMSOFTWARE返回的查询DataRow创建一个MVNFORUMSOFTWAREEntity对象
* @param MVNFORUMSOFTWARE row
* @returnMVNFORUMSOFTWAREList对象
* @throws Exception 
*/
public List< mvnforumsoftware_Dao> get_mvnforumsoftware_All(String strWhere) throws Exception{
         List<mvnforumsoftware_Dao> _list = new ArrayList<mvnforumsoftware_Dao>();
		 String sqlStr = "{ call MVNFORUMSOFTWARE_PRO.GetMVNFORUMSOFTWAREWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumsoftware_Dao _obj = new mvnforumsoftware_Dao();
            _obj.setSoftwareid(arr.getInt("SOFTWAREID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setSoftwarename(arr.getString("SOFTWARENAME"));
            _obj.setSoftwarenature(arr.getInt("SOFTWARENATURE"));
            _obj.setSoftwarecategory(arr.getInt("SOFTWARECATEGORY"));
            _obj.setSoftwaretags(arr.getString("SOFTWARETAGS"));
            _obj.setSoftwarelanguage(arr.getString("SOFTWARELANGUAGE"));
            _obj.setSoftwaredesc(arr.getString("SOFTWAREDESC"));
            _obj.setSoftwarelogo(arr.getString("SOFTWARELOGO"));
            _obj.setSoftwareimg(arr.getString("SOFTWAREIMG"));
            _obj.setSoftwarefilename(arr.getString("SOFTWAREFILENAME"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
           try{_obj.setSoftwarecreationdate(dateformat.parse(arr.getString("SOFTWARECREATIONDATE")));}catch(Exception ce){_obj.setSoftwarecreationdate((new Date()));}
           try{_obj.setSoftwaremodifieddate(dateformat.parse(arr.getString("SOFTWAREMODIFIEDDATE")));}catch(Exception ce){_obj.setSoftwaremodifieddate((new Date()));}
            _obj.setSoftwareownername(arr.getString("SOFTWAREOWNERNAME"));
            _obj.setSoftwarestatus(arr.getInt("SOFTWARESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _obj.setFavoritecount(arr.getInt("FAVORITECOUNT"));
            _obj.setCommentcount(arr.getInt("COMMENTCOUNT"));
            _obj.setScoring(arr.getInt("SCORING"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMSOFTWARE返回 分页数据
* @param MVNFORUMSOFTWARE row
* @returnMVNFORUMSOFTWAREList对象
* @throws Exception 
*/
public List<mvnforumsoftware_Dao> get_mvnforumsoftware_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumsoftware_Dao> _list = new ArrayList<mvnforumsoftware_Dao>();
		String sqlStr = "{ call MVNFORUMSOFTWARE_PRO.GetMVNFORUMSOFTWAREPage(?,?,?,?,?,?)}";
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
				mvnforumsoftware_Dao _obj = new mvnforumsoftware_Dao();
            _obj.setSoftwareid(arr.getInt("SOFTWAREID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setSoftwarename(arr.getString("SOFTWARENAME"));
            _obj.setSoftwarenature(arr.getInt("SOFTWARENATURE"));
            _obj.setSoftwarecategory(arr.getInt("SOFTWARECATEGORY"));
            _obj.setSoftwaretags(arr.getString("SOFTWARETAGS"));
            _obj.setSoftwarelanguage(arr.getString("SOFTWARELANGUAGE"));
            _obj.setSoftwaredesc(arr.getString("SOFTWAREDESC"));
            _obj.setSoftwarelogo(arr.getString("SOFTWARELOGO"));
            _obj.setSoftwareimg(arr.getString("SOFTWAREIMG"));
            _obj.setSoftwarefilename(arr.getString("SOFTWAREFILENAME"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
            try{_obj.setSoftwarecreationdate(dateformat.parse(arr.getString("SOFTWARECREATIONDATE")));}catch(Exception ce){_obj.setSoftwarecreationdate((new Date()));}
            try{_obj.setSoftwaremodifieddate(dateformat.parse(arr.getString("SOFTWAREMODIFIEDDATE")));}catch(Exception ce){_obj.setSoftwaremodifieddate((new Date()));}
            _obj.setSoftwareownername(arr.getString("SOFTWAREOWNERNAME"));
            _obj.setSoftwarestatus(arr.getInt("SOFTWARESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _obj.setFavoritecount(arr.getInt("FAVORITECOUNT"));
            _obj.setCommentcount(arr.getInt("COMMENTCOUNT"));
            _obj.setScoring(arr.getInt("SCORING"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMSOFTWARE返回的查询DataRow创建一个MVNFORUMSOFTWAREEntity对象
* @param MVNFORUMSOFTWARE row
* @returnMVNFORUMSOFTWAREDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumsoftware_Dao> get_mvnforumsoftware_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumsoftwarestrWhere") == null) {
			Dictionary<Integer, mvnforumsoftware_Dao> _dic = new Hashtable<Integer, mvnforumsoftware_Dao>();
			List<mvnforumsoftware_Dao> _list = new ArrayList<mvnforumsoftware_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getSoftwareid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumsoftware", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumsoftware_Dao> _dic = (Dictionary<Integer, mvnforumsoftware_Dao>) classFactory
					.cacheGet("dicmvnforumsoftwarestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMSOFTWARE字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumsoftware_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMSOFTWARE_PRO.UpdateFieldMVNFORUMSOFTWARE(?,?)}";
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
* 更新MVNFORUMSOFTWAREInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumsoftware_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMSOFTWARE_PRO.UpdateFieldMVNFORUMSOFTWAREV(?,?,?)}";
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
* 更新MVNFORUMSOFTWAREIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumsoftware_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMSOFTWARE_PRO.UpdateFieldMVNFORUMSOFTWAREU(?,?,?)}";
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
