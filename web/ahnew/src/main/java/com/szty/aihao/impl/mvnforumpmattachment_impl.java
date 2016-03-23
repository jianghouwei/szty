/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumpmattachment.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumpmattachment_Dao;
import com.szty.aihao.core.mvnforumpmattachment_core;
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
*@MVNFORUMPMATTACHMENT数据接口
*@作者：宋春林 
*/
public class mvnforumpmattachment_impl implements mvnforumpmattachment_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumpmattachment_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPMATTACHMENT实体
* @return 新插入记录的编号
*/
public int insert_mvnforumpmattachment(mvnforumpmattachment_Dao _MVNFORUMPMATTACHMENTModel)  throws Exception{
         String sqlStr = "{call MVNFORUMPMATTACHMENT_PRO.InsertMVNFORUMPMATTACHMENT(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getPmattachid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getMemberid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPMATTACHMENTModel.getPmattachfilename());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getPmattachfilesize());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPMATTACHMENTModel.getPmattachmimetype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPMATTACHMENTModel.getPmattachdesc());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPMATTACHMENTModel.getPmattachcreationip());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPMATTACHMENTModel.getPmattachcreationdate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPMATTACHMENTModel.getPmattachmodifieddate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getPmattachdownloadcount());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getPmattachoption());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getPmattachstatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMPMATTACHMENT
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumpmattachment(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMPMATTACHMENT_PRO.InsertMVNFORUMPMATTACHMENT(?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[12];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_para[7]));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_para[8]));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_para[9]);
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
* @param MVNFORUMPMATTACHMENT实体
* @return 影响的行数
*/
public int update_mvnforumpmattachment(mvnforumpmattachment_Dao _MVNFORUMPMATTACHMENTModel)  throws Exception{
        String sqlStr = "{call MVNFORUMPMATTACHMENT_PRO.UpdateMVNFORUMPMATTACHMENT(?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[12];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getPmattachid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getMemberid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPMATTACHMENTModel.getPmattachfilename());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getPmattachfilesize());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPMATTACHMENTModel.getPmattachmimetype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPMATTACHMENTModel.getPmattachdesc());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMPMATTACHMENTModel.getPmattachcreationip());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPMATTACHMENTModel.getPmattachcreationdate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMPMATTACHMENTModel.getPmattachmodifieddate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getPmattachdownloadcount());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getPmattachoption());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NUMERIC,_MVNFORUMPMATTACHMENTModel.getPmattachstatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMPMATTACHMENT中的一条记录
* @param MVNFORUMPMATTACHMENT实体
* @return 新插入记录的编号
*/
public int delete_mvnforumpmattachment(int Pmattachid)  throws Exception{
        String sqlStr = "{call MVNFORUMPMATTACHMENT_PRO.DeleteMVNFORUMPMATTACHMENT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Pmattachid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumpmattachment 数据实体
* @param Pmattachid">Pmattachid
* @return<mvnforumpmattachment 数据实体
* @throws Exception 
*/
public mvnforumpmattachment_Dao get_mvnforumpmattachmentDao(int Pmattachid) throws Exception{
         String sqlStr = "{ call MVNFORUMPMATTACHMENT_PRO.GetMVNFORUMPMATTACHMENTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Pmattachid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumpmattachment_Dao _obj = new mvnforumpmattachment_Dao();
            _obj.setPmattachid(arr.getInt("PMATTACHID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setPmattachfilename(arr.getString("PMATTACHFILENAME"));
            _obj.setPmattachfilesize(arr.getInt("PMATTACHFILESIZE"));
            _obj.setPmattachmimetype(arr.getString("PMATTACHMIMETYPE"));
            _obj.setPmattachdesc(arr.getString("PMATTACHDESC"));
            _obj.setPmattachcreationip(arr.getString("PMATTACHCREATIONIP"));
             try{_obj.setPmattachcreationdate(dateformat.parse(arr.getString("PMATTACHCREATIONDATE")));}catch(Exception ce){_obj.setPmattachcreationdate((new Date()));}
             try{_obj.setPmattachmodifieddate(dateformat.parse(arr.getString("PMATTACHMODIFIEDDATE")));}catch(Exception ce){_obj.setPmattachmodifieddate((new Date()));}
            _obj.setPmattachdownloadcount(arr.getInt("PMATTACHDOWNLOADCOUNT"));
            _obj.setPmattachoption(arr.getInt("PMATTACHOPTION"));
            _obj.setPmattachstatus(arr.getInt("PMATTACHSTATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMPMATTACHMENT返回的查询DataRow创建一个MVNFORUMPMATTACHMENTEntity对象
* @param MVNFORUMPMATTACHMENT row
* @returnMVNFORUMPMATTACHMENTList对象
* @throws Exception 
*/
public List<mvnforumpmattachment_Dao> get_mvnforumpmattachment_All() throws Exception{
        List<mvnforumpmattachment_Dao> _list = new ArrayList<mvnforumpmattachment_Dao>();
		String sqlStr = "{ call MVNFORUMPMATTACHMENT_PRO.GetMVNFORUMPMATTACHMENT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumpmattachment_Dao _obj = new mvnforumpmattachment_Dao();
            _obj.setPmattachid(arr.getInt("PMATTACHID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setPmattachfilename(arr.getString("PMATTACHFILENAME"));
            _obj.setPmattachfilesize(arr.getInt("PMATTACHFILESIZE"));
            _obj.setPmattachmimetype(arr.getString("PMATTACHMIMETYPE"));
            _obj.setPmattachdesc(arr.getString("PMATTACHDESC"));
            _obj.setPmattachcreationip(arr.getString("PMATTACHCREATIONIP"));
            try{_obj.setPmattachcreationdate(dateformat.parse(arr.getString("PMATTACHCREATIONDATE")));}catch(Exception ce){_obj.setPmattachcreationdate((new Date()));}
            try{_obj.setPmattachmodifieddate(dateformat.parse(arr.getString("PMATTACHMODIFIEDDATE")));}catch(Exception ce){_obj.setPmattachmodifieddate((new Date()));}
            _obj.setPmattachdownloadcount(arr.getInt("PMATTACHDOWNLOADCOUNT"));
            _obj.setPmattachoption(arr.getInt("PMATTACHOPTION"));
            _obj.setPmattachstatus(arr.getInt("PMATTACHSTATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMPMATTACHMENT返回的查询DataRow创建一个MVNFORUMPMATTACHMENTEntity对象
* @param MVNFORUMPMATTACHMENT row
* @returnMVNFORUMPMATTACHMENTList对象
* @throws Exception 
*/
public List< mvnforumpmattachment_Dao> get_mvnforumpmattachment_All(String strWhere) throws Exception{
         List<mvnforumpmattachment_Dao> _list = new ArrayList<mvnforumpmattachment_Dao>();
		 String sqlStr = "{ call MVNFORUMPMATTACHMENT_PRO.GetMVNFORUMPMATTACHMENTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumpmattachment_Dao _obj = new mvnforumpmattachment_Dao();
            _obj.setPmattachid(arr.getInt("PMATTACHID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setPmattachfilename(arr.getString("PMATTACHFILENAME"));
            _obj.setPmattachfilesize(arr.getInt("PMATTACHFILESIZE"));
            _obj.setPmattachmimetype(arr.getString("PMATTACHMIMETYPE"));
            _obj.setPmattachdesc(arr.getString("PMATTACHDESC"));
            _obj.setPmattachcreationip(arr.getString("PMATTACHCREATIONIP"));
           try{_obj.setPmattachcreationdate(dateformat.parse(arr.getString("PMATTACHCREATIONDATE")));}catch(Exception ce){_obj.setPmattachcreationdate((new Date()));}
           try{_obj.setPmattachmodifieddate(dateformat.parse(arr.getString("PMATTACHMODIFIEDDATE")));}catch(Exception ce){_obj.setPmattachmodifieddate((new Date()));}
            _obj.setPmattachdownloadcount(arr.getInt("PMATTACHDOWNLOADCOUNT"));
            _obj.setPmattachoption(arr.getInt("PMATTACHOPTION"));
            _obj.setPmattachstatus(arr.getInt("PMATTACHSTATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMPMATTACHMENT返回 分页数据
* @param MVNFORUMPMATTACHMENT row
* @returnMVNFORUMPMATTACHMENTList对象
* @throws Exception 
*/
public List<mvnforumpmattachment_Dao> get_mvnforumpmattachment_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumpmattachment_Dao> _list = new ArrayList<mvnforumpmattachment_Dao>();
		String sqlStr = "{ call MVNFORUMPMATTACHMENT_PRO.GetMVNFORUMPMATTACHMENTPage(?,?,?,?,?,?)}";
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
				mvnforumpmattachment_Dao _obj = new mvnforumpmattachment_Dao();
            _obj.setPmattachid(arr.getInt("PMATTACHID"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setPmattachfilename(arr.getString("PMATTACHFILENAME"));
            _obj.setPmattachfilesize(arr.getInt("PMATTACHFILESIZE"));
            _obj.setPmattachmimetype(arr.getString("PMATTACHMIMETYPE"));
            _obj.setPmattachdesc(arr.getString("PMATTACHDESC"));
            _obj.setPmattachcreationip(arr.getString("PMATTACHCREATIONIP"));
            try{_obj.setPmattachcreationdate(dateformat.parse(arr.getString("PMATTACHCREATIONDATE")));}catch(Exception ce){_obj.setPmattachcreationdate((new Date()));}
            try{_obj.setPmattachmodifieddate(dateformat.parse(arr.getString("PMATTACHMODIFIEDDATE")));}catch(Exception ce){_obj.setPmattachmodifieddate((new Date()));}
            _obj.setPmattachdownloadcount(arr.getInt("PMATTACHDOWNLOADCOUNT"));
            _obj.setPmattachoption(arr.getInt("PMATTACHOPTION"));
            _obj.setPmattachstatus(arr.getInt("PMATTACHSTATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMPMATTACHMENT返回的查询DataRow创建一个MVNFORUMPMATTACHMENTEntity对象
* @param MVNFORUMPMATTACHMENT row
* @returnMVNFORUMPMATTACHMENTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumpmattachment_Dao> get_mvnforumpmattachment_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumpmattachmentstrWhere") == null) {
			Dictionary<Integer, mvnforumpmattachment_Dao> _dic = new Hashtable<Integer, mvnforumpmattachment_Dao>();
			List<mvnforumpmattachment_Dao> _list = new ArrayList<mvnforumpmattachment_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getPmattachid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumpmattachment", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumpmattachment_Dao> _dic = (Dictionary<Integer, mvnforumpmattachment_Dao>) classFactory
					.cacheGet("dicmvnforumpmattachmentstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMPMATTACHMENT字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumpmattachment_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMPMATTACHMENT_PRO.UpdateFieldMVNFORUMPMATTACHMENT(?,?)}";
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
* 更新MVNFORUMPMATTACHMENTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumpmattachment_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMPMATTACHMENT_PRO.UpdateFieldMVNFORUMPMATTACHMENTV(?,?,?)}";
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
* 更新MVNFORUMPMATTACHMENTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumpmattachment_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMPMATTACHMENT_PRO.UpdateFieldMVNFORUMPMATTACHMENTU(?,?,?)}";
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
