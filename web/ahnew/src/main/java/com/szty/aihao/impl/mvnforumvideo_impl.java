/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumvideo.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumvideo_Dao;
import com.szty.aihao.core.mvnforumvideo_core;
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
*@MVNFORUMVIDEO数据接口
*@作者：宋春林 
*/
public class mvnforumvideo_impl implements mvnforumvideo_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumvideo_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMVIDEO实体
* @return 新插入记录的编号
*/
public int insert_mvnforumvideo(mvnforumvideo_Dao _MVNFORUMVIDEOModel)  throws Exception{
         String sqlStr = "{call MVNFORUMVIDEO_PRO.InsertMVNFORUMVIDEO(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMVIDEOModel.getVideoid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMVIDEOModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMVIDEOModel.getVideotitle());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMVIDEOModel.getVideoimg());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMVIDEOModel.getFolderpart());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMVIDEOModel.getVideourl());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMVIDEOModel.getVideofilesize());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMVIDEOModel.getVideocreationdate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMVIDEOModel.getVideomodifieddate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMVIDEOModel.getVideoownername());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMVIDEOModel.getVideostatus());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMVIDEOModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMVIDEO
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumvideo(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMVIDEO_PRO.InsertMVNFORUMVIDEO(?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[12];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_para[7]));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_para[8]));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMVIDEO实体
* @return 影响的行数
*/
public int update_mvnforumvideo(mvnforumvideo_Dao _MVNFORUMVIDEOModel)  throws Exception{
        String sqlStr = "{call MVNFORUMVIDEO_PRO.UpdateMVNFORUMVIDEO(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMVIDEOModel.getVideoid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMVIDEOModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMVIDEOModel.getVideotitle());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMVIDEOModel.getVideoimg());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMVIDEOModel.getFolderpart());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMVIDEOModel.getVideourl());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MVNFORUMVIDEOModel.getVideofilesize());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMVIDEOModel.getVideocreationdate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMVIDEOModel.getVideomodifieddate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMVIDEOModel.getVideoownername());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMVIDEOModel.getVideostatus());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMVIDEOModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMVIDEO中的一条记录
* @param MVNFORUMVIDEO实体
* @return 新插入记录的编号
*/
public int delete_mvnforumvideo(int Videoid)  throws Exception{
        String sqlStr = "{call MVNFORUMVIDEO_PRO.DeleteMVNFORUMVIDEO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Videoid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumvideo 数据实体
* @param Videoid">Videoid
* @return<mvnforumvideo 数据实体
* @throws Exception 
*/
public mvnforumvideo_Dao get_mvnforumvideoDao(int Videoid) throws Exception{
         String sqlStr = "{ call MVNFORUMVIDEO_PRO.GetMVNFORUMVIDEOEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Videoid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumvideo_Dao _obj = new mvnforumvideo_Dao();
            _obj.setVideoid(arr.getInt("VIDEOID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setVideotitle(arr.getString("VIDEOTITLE"));
            _obj.setVideoimg(arr.getString("VIDEOIMG"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
            _obj.setVideourl(arr.getString("VIDEOURL"));
            _obj.setVideofilesize(arr.getInt("VIDEOFILESIZE"));
             try{_obj.setVideocreationdate(dateformat.parse(arr.getString("VIDEOCREATIONDATE")));}catch(Exception ce){_obj.setVideocreationdate((new Date()));}
             try{_obj.setVideomodifieddate(dateformat.parse(arr.getString("VIDEOMODIFIEDDATE")));}catch(Exception ce){_obj.setVideomodifieddate((new Date()));}
            _obj.setVideoownername(arr.getString("VIDEOOWNERNAME"));
            _obj.setVideostatus(arr.getInt("VIDEOSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMVIDEO返回的查询DataRow创建一个MVNFORUMVIDEOEntity对象
* @param MVNFORUMVIDEO row
* @returnMVNFORUMVIDEOList对象
* @throws Exception 
*/
public List<mvnforumvideo_Dao> get_mvnforumvideo_All() throws Exception{
        List<mvnforumvideo_Dao> _list = new ArrayList<mvnforumvideo_Dao>();
		String sqlStr = "{ call MVNFORUMVIDEO_PRO.GetMVNFORUMVIDEO(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumvideo_Dao _obj = new mvnforumvideo_Dao();
            _obj.setVideoid(arr.getInt("VIDEOID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setVideotitle(arr.getString("VIDEOTITLE"));
            _obj.setVideoimg(arr.getString("VIDEOIMG"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
            _obj.setVideourl(arr.getString("VIDEOURL"));
            _obj.setVideofilesize(arr.getInt("VIDEOFILESIZE"));
            try{_obj.setVideocreationdate(dateformat.parse(arr.getString("VIDEOCREATIONDATE")));}catch(Exception ce){_obj.setVideocreationdate((new Date()));}
            try{_obj.setVideomodifieddate(dateformat.parse(arr.getString("VIDEOMODIFIEDDATE")));}catch(Exception ce){_obj.setVideomodifieddate((new Date()));}
            _obj.setVideoownername(arr.getString("VIDEOOWNERNAME"));
            _obj.setVideostatus(arr.getInt("VIDEOSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMVIDEO返回的查询DataRow创建一个MVNFORUMVIDEOEntity对象
* @param MVNFORUMVIDEO row
* @returnMVNFORUMVIDEOList对象
* @throws Exception 
*/
public List< mvnforumvideo_Dao> get_mvnforumvideo_All(String strWhere) throws Exception{
         List<mvnforumvideo_Dao> _list = new ArrayList<mvnforumvideo_Dao>();
		 String sqlStr = "{ call MVNFORUMVIDEO_PRO.GetMVNFORUMVIDEOWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumvideo_Dao _obj = new mvnforumvideo_Dao();
            _obj.setVideoid(arr.getInt("VIDEOID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setVideotitle(arr.getString("VIDEOTITLE"));
            _obj.setVideoimg(arr.getString("VIDEOIMG"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
            _obj.setVideourl(arr.getString("VIDEOURL"));
            _obj.setVideofilesize(arr.getInt("VIDEOFILESIZE"));
           try{_obj.setVideocreationdate(dateformat.parse(arr.getString("VIDEOCREATIONDATE")));}catch(Exception ce){_obj.setVideocreationdate((new Date()));}
           try{_obj.setVideomodifieddate(dateformat.parse(arr.getString("VIDEOMODIFIEDDATE")));}catch(Exception ce){_obj.setVideomodifieddate((new Date()));}
            _obj.setVideoownername(arr.getString("VIDEOOWNERNAME"));
            _obj.setVideostatus(arr.getInt("VIDEOSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMVIDEO返回 分页数据
* @param MVNFORUMVIDEO row
* @returnMVNFORUMVIDEOList对象
* @throws Exception 
*/
public List<mvnforumvideo_Dao> get_mvnforumvideo_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumvideo_Dao> _list = new ArrayList<mvnforumvideo_Dao>();
		String sqlStr = "{ call MVNFORUMVIDEO_PRO.GetMVNFORUMVIDEOPage(?,?,?,?,?,?)}";
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
				mvnforumvideo_Dao _obj = new mvnforumvideo_Dao();
            _obj.setVideoid(arr.getInt("VIDEOID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setVideotitle(arr.getString("VIDEOTITLE"));
            _obj.setVideoimg(arr.getString("VIDEOIMG"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
            _obj.setVideourl(arr.getString("VIDEOURL"));
            _obj.setVideofilesize(arr.getInt("VIDEOFILESIZE"));
            try{_obj.setVideocreationdate(dateformat.parse(arr.getString("VIDEOCREATIONDATE")));}catch(Exception ce){_obj.setVideocreationdate((new Date()));}
            try{_obj.setVideomodifieddate(dateformat.parse(arr.getString("VIDEOMODIFIEDDATE")));}catch(Exception ce){_obj.setVideomodifieddate((new Date()));}
            _obj.setVideoownername(arr.getString("VIDEOOWNERNAME"));
            _obj.setVideostatus(arr.getInt("VIDEOSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMVIDEO返回的查询DataRow创建一个MVNFORUMVIDEOEntity对象
* @param MVNFORUMVIDEO row
* @returnMVNFORUMVIDEODictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumvideo_Dao> get_mvnforumvideo_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumvideostrWhere") == null) {
			Dictionary<Integer, mvnforumvideo_Dao> _dic = new Hashtable<Integer, mvnforumvideo_Dao>();
			List<mvnforumvideo_Dao> _list = new ArrayList<mvnforumvideo_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getVideoid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumvideo", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumvideo_Dao> _dic = (Dictionary<Integer, mvnforumvideo_Dao>) classFactory
					.cacheGet("dicmvnforumvideostrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMVIDEO字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumvideo_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMVIDEO_PRO.UpdateFieldMVNFORUMVIDEO(?,?)}";
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
* 更新MVNFORUMVIDEOInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumvideo_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMVIDEO_PRO.UpdateFieldMVNFORUMVIDEOV(?,?,?)}";
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
* 更新MVNFORUMVIDEOIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumvideo_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMVIDEO_PRO.UpdateFieldMVNFORUMVIDEOU(?,?,?)}";
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
