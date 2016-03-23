/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumattachment.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumattachment_Dao;
import com.szty.aihao.core.mvnforumattachment_core;
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
*@MVNFORUMATTACHMENT数据接口
*@作者：宋春林 
*/
public class mvnforumattachment_impl implements mvnforumattachment_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumattachment_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMATTACHMENT实体
* @return 新插入记录的编号
*/
public int insert_mvnforumattachment(mvnforumattachment_Dao _MVNFORUMATTACHMENTModel)  throws Exception{
         String sqlStr = "{call MVNFORUMATTACHMENT_PRO.InsertMVNFORUMATTACHMENT(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[13];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getAttachid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getPostid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getMemberid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMATTACHMENTModel.getAttachfilename());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getAttachfilesize());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMATTACHMENTModel.getAttachmimetype());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMATTACHMENTModel.getAttachdesc());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMATTACHMENTModel.getAttachcreationip());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMATTACHMENTModel.getAttachcreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMATTACHMENTModel.getAttachmodifieddate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getAttachdownloadcount());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getAttachoption());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getAttachstatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMATTACHMENT
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumattachment(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMATTACHMENT_PRO.InsertMVNFORUMATTACHMENT(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[13];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_para[8]));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_para[9]));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_para[12]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMATTACHMENT实体
* @return 影响的行数
*/
public int update_mvnforumattachment(mvnforumattachment_Dao _MVNFORUMATTACHMENTModel)  throws Exception{
        String sqlStr = "{call MVNFORUMATTACHMENT_PRO.UpdateMVNFORUMATTACHMENT(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[13];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getAttachid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getPostid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getMemberid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMATTACHMENTModel.getAttachfilename());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getAttachfilesize());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMATTACHMENTModel.getAttachmimetype());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMATTACHMENTModel.getAttachdesc());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMATTACHMENTModel.getAttachcreationip());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMATTACHMENTModel.getAttachcreationdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMATTACHMENTModel.getAttachmodifieddate()));
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getAttachdownloadcount());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getAttachoption());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NUMERIC,_MVNFORUMATTACHMENTModel.getAttachstatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMATTACHMENT中的一条记录
* @param MVNFORUMATTACHMENT实体
* @return 新插入记录的编号
*/
public int delete_mvnforumattachment(int Attachid)  throws Exception{
        String sqlStr = "{call MVNFORUMATTACHMENT_PRO.DeleteMVNFORUMATTACHMENT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Attachid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumattachment 数据实体
* @param Attachid">Attachid
* @return<mvnforumattachment 数据实体
* @throws Exception 
*/
public mvnforumattachment_Dao get_mvnforumattachmentDao(int Attachid) throws Exception{
         String sqlStr = "{ call MVNFORUMATTACHMENT_PRO.GetMVNFORUMATTACHMENTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Attachid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumattachment_Dao _obj = new mvnforumattachment_Dao();
            _obj.setAttachid(arr.getInt("ATTACHID"));
            _obj.setPostid(arr.getInt("POSTID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setAttachfilename(arr.getString("ATTACHFILENAME"));
            _obj.setAttachfilesize(arr.getInt("ATTACHFILESIZE"));
            _obj.setAttachmimetype(arr.getString("ATTACHMIMETYPE"));
            _obj.setAttachdesc(arr.getString("ATTACHDESC"));
            _obj.setAttachcreationip(arr.getString("ATTACHCREATIONIP"));
             try{_obj.setAttachcreationdate(dateformat.parse(arr.getString("ATTACHCREATIONDATE")));}catch(Exception ce){_obj.setAttachcreationdate((new Date()));}
             try{_obj.setAttachmodifieddate(dateformat.parse(arr.getString("ATTACHMODIFIEDDATE")));}catch(Exception ce){_obj.setAttachmodifieddate((new Date()));}
            _obj.setAttachdownloadcount(arr.getInt("ATTACHDOWNLOADCOUNT"));
            _obj.setAttachoption(arr.getInt("ATTACHOPTION"));
            _obj.setAttachstatus(arr.getInt("ATTACHSTATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMATTACHMENT返回的查询DataRow创建一个MVNFORUMATTACHMENTEntity对象
* @param MVNFORUMATTACHMENT row
* @returnMVNFORUMATTACHMENTList对象
* @throws Exception 
*/
public List<mvnforumattachment_Dao> get_mvnforumattachment_All() throws Exception{
        List<mvnforumattachment_Dao> _list = new ArrayList<mvnforumattachment_Dao>();
		String sqlStr = "{ call MVNFORUMATTACHMENT_PRO.GetMVNFORUMATTACHMENT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumattachment_Dao _obj = new mvnforumattachment_Dao();
            _obj.setAttachid(arr.getInt("ATTACHID"));
            _obj.setPostid(arr.getInt("POSTID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setAttachfilename(arr.getString("ATTACHFILENAME"));
            _obj.setAttachfilesize(arr.getInt("ATTACHFILESIZE"));
            _obj.setAttachmimetype(arr.getString("ATTACHMIMETYPE"));
            _obj.setAttachdesc(arr.getString("ATTACHDESC"));
            _obj.setAttachcreationip(arr.getString("ATTACHCREATIONIP"));
            try{_obj.setAttachcreationdate(dateformat.parse(arr.getString("ATTACHCREATIONDATE")));}catch(Exception ce){_obj.setAttachcreationdate((new Date()));}
            try{_obj.setAttachmodifieddate(dateformat.parse(arr.getString("ATTACHMODIFIEDDATE")));}catch(Exception ce){_obj.setAttachmodifieddate((new Date()));}
            _obj.setAttachdownloadcount(arr.getInt("ATTACHDOWNLOADCOUNT"));
            _obj.setAttachoption(arr.getInt("ATTACHOPTION"));
            _obj.setAttachstatus(arr.getInt("ATTACHSTATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMATTACHMENT返回的查询DataRow创建一个MVNFORUMATTACHMENTEntity对象
* @param MVNFORUMATTACHMENT row
* @returnMVNFORUMATTACHMENTList对象
* @throws Exception 
*/
public List< mvnforumattachment_Dao> get_mvnforumattachment_All(String strWhere) throws Exception{
         List<mvnforumattachment_Dao> _list = new ArrayList<mvnforumattachment_Dao>();
		 String sqlStr = "{ call MVNFORUMATTACHMENT_PRO.GetMVNFORUMATTACHMENTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumattachment_Dao _obj = new mvnforumattachment_Dao();
            _obj.setAttachid(arr.getInt("ATTACHID"));
            _obj.setPostid(arr.getInt("POSTID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setAttachfilename(arr.getString("ATTACHFILENAME"));
            _obj.setAttachfilesize(arr.getInt("ATTACHFILESIZE"));
            _obj.setAttachmimetype(arr.getString("ATTACHMIMETYPE"));
            _obj.setAttachdesc(arr.getString("ATTACHDESC"));
            _obj.setAttachcreationip(arr.getString("ATTACHCREATIONIP"));
           try{_obj.setAttachcreationdate(dateformat.parse(arr.getString("ATTACHCREATIONDATE")));}catch(Exception ce){_obj.setAttachcreationdate((new Date()));}
           try{_obj.setAttachmodifieddate(dateformat.parse(arr.getString("ATTACHMODIFIEDDATE")));}catch(Exception ce){_obj.setAttachmodifieddate((new Date()));}
            _obj.setAttachdownloadcount(arr.getInt("ATTACHDOWNLOADCOUNT"));
            _obj.setAttachoption(arr.getInt("ATTACHOPTION"));
            _obj.setAttachstatus(arr.getInt("ATTACHSTATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMATTACHMENT返回 分页数据
* @param MVNFORUMATTACHMENT row
* @returnMVNFORUMATTACHMENTList对象
* @throws Exception 
*/
public List<mvnforumattachment_Dao> get_mvnforumattachment_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumattachment_Dao> _list = new ArrayList<mvnforumattachment_Dao>();
		String sqlStr = "{ call MVNFORUMATTACHMENT_PRO.GetMVNFORUMATTACHMENTPage(?,?,?,?,?,?)}";
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
				mvnforumattachment_Dao _obj = new mvnforumattachment_Dao();
            _obj.setAttachid(arr.getInt("ATTACHID"));
            _obj.setPostid(arr.getInt("POSTID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setAttachfilename(arr.getString("ATTACHFILENAME"));
            _obj.setAttachfilesize(arr.getInt("ATTACHFILESIZE"));
            _obj.setAttachmimetype(arr.getString("ATTACHMIMETYPE"));
            _obj.setAttachdesc(arr.getString("ATTACHDESC"));
            _obj.setAttachcreationip(arr.getString("ATTACHCREATIONIP"));
            try{_obj.setAttachcreationdate(dateformat.parse(arr.getString("ATTACHCREATIONDATE")));}catch(Exception ce){_obj.setAttachcreationdate((new Date()));}
            try{_obj.setAttachmodifieddate(dateformat.parse(arr.getString("ATTACHMODIFIEDDATE")));}catch(Exception ce){_obj.setAttachmodifieddate((new Date()));}
            _obj.setAttachdownloadcount(arr.getInt("ATTACHDOWNLOADCOUNT"));
            _obj.setAttachoption(arr.getInt("ATTACHOPTION"));
            _obj.setAttachstatus(arr.getInt("ATTACHSTATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMATTACHMENT返回的查询DataRow创建一个MVNFORUMATTACHMENTEntity对象
* @param MVNFORUMATTACHMENT row
* @returnMVNFORUMATTACHMENTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumattachment_Dao> get_mvnforumattachment_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumattachmentstrWhere") == null) {
			Dictionary<Integer, mvnforumattachment_Dao> _dic = new Hashtable<Integer, mvnforumattachment_Dao>();
			List<mvnforumattachment_Dao> _list = new ArrayList<mvnforumattachment_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getAttachid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumattachment", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumattachment_Dao> _dic = (Dictionary<Integer, mvnforumattachment_Dao>) classFactory
					.cacheGet("dicmvnforumattachmentstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMATTACHMENT字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumattachment_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMATTACHMENT_PRO.UpdateFieldMVNFORUMATTACHMENT(?,?)}";
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
* 更新MVNFORUMATTACHMENTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumattachment_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMATTACHMENT_PRO.UpdateFieldMVNFORUMATTACHMENTV(?,?,?)}";
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
* 更新MVNFORUMATTACHMENTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumattachment_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMATTACHMENT_PRO.UpdateFieldMVNFORUMATTACHMENTU(?,?,?)}";
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
