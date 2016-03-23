/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumring.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumring_Dao;
import com.szty.aihao.core.mvnforumring_core;
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
*@MVNFORUMRING数据接口
*@作者：宋春林 
*/
public class mvnforumring_impl implements mvnforumring_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumring_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMRING实体
* @return 新插入记录的编号
*/
public int insert_mvnforumring(mvnforumring_Dao _MVNFORUMRINGModel)  throws Exception{
         String sqlStr = "{call MVNFORUMRING_PRO.InsertMVNFORUMRING(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMRINGModel.getRingid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGModel.getRingname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGModel.getSingername());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGModel.getRingcategory());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGModel.getFolderpart());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMRINGModel.getRingcreationdate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMRINGModel.getRingmodifieddate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGModel.getRingownername());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGModel.getRingownerid());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGModel.getRingstatus());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMRING
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumring(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMRING_PRO.InsertMVNFORUMRING(?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[12];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_para[7]));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
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
* @param MVNFORUMRING实体
* @return 影响的行数
*/
public int update_mvnforumring(mvnforumring_Dao _MVNFORUMRINGModel)  throws Exception{
        String sqlStr = "{call MVNFORUMRING_PRO.UpdateMVNFORUMRING(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGModel.getRingid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGModel.getRingname());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGModel.getSingername());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGModel.getRingcategory());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGModel.getFolderpart());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMRINGModel.getRingcreationdate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMRINGModel.getRingmodifieddate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGModel.getRingownername());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMRINGModel.getRingownerid());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGModel.getRingstatus());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMRINGModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMRING中的一条记录
* @param MVNFORUMRING实体
* @return 新插入记录的编号
*/
public int delete_mvnforumring(int Ringid)  throws Exception{
        String sqlStr = "{call MVNFORUMRING_PRO.DeleteMVNFORUMRING(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Ringid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumring 数据实体
* @param Ringid">Ringid
* @return<mvnforumring 数据实体
* @throws Exception 
*/
public mvnforumring_Dao get_mvnforumringDao(int Ringid) throws Exception{
         String sqlStr = "{ call MVNFORUMRING_PRO.GetMVNFORUMRINGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Ringid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumring_Dao _obj = new mvnforumring_Dao();
            _obj.setRingid(arr.getInt("RINGID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setRingname(arr.getString("RINGNAME"));
            _obj.setSingername(arr.getString("SINGERNAME"));
            _obj.setRingcategory(arr.getInt("RINGCATEGORY"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
             try{_obj.setRingcreationdate(dateformat.parse(arr.getString("RINGCREATIONDATE")));}catch(Exception ce){_obj.setRingcreationdate((new Date()));}
             try{_obj.setRingmodifieddate(dateformat.parse(arr.getString("RINGMODIFIEDDATE")));}catch(Exception ce){_obj.setRingmodifieddate((new Date()));}
            _obj.setRingownername(arr.getString("RINGOWNERNAME"));
            _obj.setRingownerid(arr.getString("RINGOWNERID"));
            _obj.setRingstatus(arr.getInt("RINGSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMRING返回的查询DataRow创建一个MVNFORUMRINGEntity对象
* @param MVNFORUMRING row
* @returnMVNFORUMRINGList对象
* @throws Exception 
*/
public List<mvnforumring_Dao> get_mvnforumring_All() throws Exception{
        List<mvnforumring_Dao> _list = new ArrayList<mvnforumring_Dao>();
		String sqlStr = "{ call MVNFORUMRING_PRO.GetMVNFORUMRING(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumring_Dao _obj = new mvnforumring_Dao();
            _obj.setRingid(arr.getInt("RINGID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setRingname(arr.getString("RINGNAME"));
            _obj.setSingername(arr.getString("SINGERNAME"));
            _obj.setRingcategory(arr.getInt("RINGCATEGORY"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
            try{_obj.setRingcreationdate(dateformat.parse(arr.getString("RINGCREATIONDATE")));}catch(Exception ce){_obj.setRingcreationdate((new Date()));}
            try{_obj.setRingmodifieddate(dateformat.parse(arr.getString("RINGMODIFIEDDATE")));}catch(Exception ce){_obj.setRingmodifieddate((new Date()));}
            _obj.setRingownername(arr.getString("RINGOWNERNAME"));
            _obj.setRingownerid(arr.getString("RINGOWNERID"));
            _obj.setRingstatus(arr.getInt("RINGSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMRING返回的查询DataRow创建一个MVNFORUMRINGEntity对象
* @param MVNFORUMRING row
* @returnMVNFORUMRINGList对象
* @throws Exception 
*/
public List< mvnforumring_Dao> get_mvnforumring_All(String strWhere) throws Exception{
         List<mvnforumring_Dao> _list = new ArrayList<mvnforumring_Dao>();
		 String sqlStr = "{ call MVNFORUMRING_PRO.GetMVNFORUMRINGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumring_Dao _obj = new mvnforumring_Dao();
            _obj.setRingid(arr.getInt("RINGID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setRingname(arr.getString("RINGNAME"));
            _obj.setSingername(arr.getString("SINGERNAME"));
            _obj.setRingcategory(arr.getInt("RINGCATEGORY"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
           try{_obj.setRingcreationdate(dateformat.parse(arr.getString("RINGCREATIONDATE")));}catch(Exception ce){_obj.setRingcreationdate((new Date()));}
           try{_obj.setRingmodifieddate(dateformat.parse(arr.getString("RINGMODIFIEDDATE")));}catch(Exception ce){_obj.setRingmodifieddate((new Date()));}
            _obj.setRingownername(arr.getString("RINGOWNERNAME"));
            _obj.setRingownerid(arr.getString("RINGOWNERID"));
            _obj.setRingstatus(arr.getInt("RINGSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMRING返回 分页数据
* @param MVNFORUMRING row
* @returnMVNFORUMRINGList对象
* @throws Exception 
*/
public List<mvnforumring_Dao> get_mvnforumring_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumring_Dao> _list = new ArrayList<mvnforumring_Dao>();
		String sqlStr = "{ call MVNFORUMRING_PRO.GetMVNFORUMRINGPage(?,?,?,?,?,?)}";
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
				mvnforumring_Dao _obj = new mvnforumring_Dao();
            _obj.setRingid(arr.getInt("RINGID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setRingname(arr.getString("RINGNAME"));
            _obj.setSingername(arr.getString("SINGERNAME"));
            _obj.setRingcategory(arr.getInt("RINGCATEGORY"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
            try{_obj.setRingcreationdate(dateformat.parse(arr.getString("RINGCREATIONDATE")));}catch(Exception ce){_obj.setRingcreationdate((new Date()));}
            try{_obj.setRingmodifieddate(dateformat.parse(arr.getString("RINGMODIFIEDDATE")));}catch(Exception ce){_obj.setRingmodifieddate((new Date()));}
            _obj.setRingownername(arr.getString("RINGOWNERNAME"));
            _obj.setRingownerid(arr.getString("RINGOWNERID"));
            _obj.setRingstatus(arr.getInt("RINGSTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMRING返回的查询DataRow创建一个MVNFORUMRINGEntity对象
* @param MVNFORUMRING row
* @returnMVNFORUMRINGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumring_Dao> get_mvnforumring_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumringstrWhere") == null) {
			Dictionary<Integer, mvnforumring_Dao> _dic = new Hashtable<Integer, mvnforumring_Dao>();
			List<mvnforumring_Dao> _list = new ArrayList<mvnforumring_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getRingid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumring", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumring_Dao> _dic = (Dictionary<Integer, mvnforumring_Dao>) classFactory
					.cacheGet("dicmvnforumringstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMRING字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumring_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMRING_PRO.UpdateFieldMVNFORUMRING(?,?)}";
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
* 更新MVNFORUMRINGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumring_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMRING_PRO.UpdateFieldMVNFORUMRINGV(?,?,?)}";
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
* 更新MVNFORUMRINGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumring_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMRING_PRO.UpdateFieldMVNFORUMRINGU(?,?,?)}";
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
