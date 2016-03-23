/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforummessagefolder.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforummessagefolder_Dao;
import com.szty.aihao.core.mvnforummessagefolder_core;
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
*@MVNFORUMMESSAGEFOLDER数据接口
*@作者：宋春林 
*/
public class mvnforummessagefolder_impl implements mvnforummessagefolder_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforummessagefolder_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMESSAGEFOLDER实体
* @return 新插入记录的编号
*/
public int insert_mvnforummessagefolder(mvnforummessagefolder_Dao _MVNFORUMMESSAGEFOLDERModel)  throws Exception{
         String sqlStr = "{call MVNFORUMMESSAGEFOLDER_PRO.InsertMVNFORUMMESSAGEFOLDER(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEFOLDERModel.getFoldername());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEFOLDERModel.getMemberid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEFOLDERModel.getFolderorder());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEFOLDERModel.getFolderstatus());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEFOLDERModel.getFolderoption());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEFOLDERModel.getFoldertype());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMESSAGEFOLDERModel.getFoldercreationdate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMESSAGEFOLDERModel.getFoldermodifieddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMMESSAGEFOLDER
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforummessagefolder(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMMESSAGEFOLDER_PRO.InsertMVNFORUMMESSAGEFOLDER(?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[8];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_para[7]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMMESSAGEFOLDER实体
* @return 影响的行数
*/
public int update_mvnforummessagefolder(mvnforummessagefolder_Dao _MVNFORUMMESSAGEFOLDERModel)  throws Exception{
        String sqlStr = "{call MVNFORUMMESSAGEFOLDER_PRO.UpdateMVNFORUMMESSAGEFOLDER(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_MVNFORUMMESSAGEFOLDERModel.getFoldername());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEFOLDERModel.getMemberid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEFOLDERModel.getFolderorder());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEFOLDERModel.getFolderstatus());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEFOLDERModel.getFolderoption());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMMESSAGEFOLDERModel.getFoldertype());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMESSAGEFOLDERModel.getFoldercreationdate()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMMESSAGEFOLDERModel.getFoldermodifieddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMMESSAGEFOLDER中的一条记录
* @param MVNFORUMMESSAGEFOLDER实体
* @return 新插入记录的编号
*/
public int delete_mvnforummessagefolder(int Foldername)  throws Exception{
        String sqlStr = "{call MVNFORUMMESSAGEFOLDER_PRO.DeleteMVNFORUMMESSAGEFOLDER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Foldername);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforummessagefolder 数据实体
* @param Foldername">Foldername
* @return<mvnforummessagefolder 数据实体
* @throws Exception 
*/
public mvnforummessagefolder_Dao get_mvnforummessagefolderDao(int Foldername) throws Exception{
         String sqlStr = "{ call MVNFORUMMESSAGEFOLDER_PRO.GetMVNFORUMMESSAGEFOLDEREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Foldername);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummessagefolder_Dao _obj = new mvnforummessagefolder_Dao();
            _obj.setFoldername(arr.getString("FOLDERNAME"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setFolderorder(arr.getInt("FOLDERORDER"));
            _obj.setFolderstatus(arr.getInt("FOLDERSTATUS"));
            _obj.setFolderoption(arr.getInt("FOLDEROPTION"));
            _obj.setFoldertype(arr.getInt("FOLDERTYPE"));
             try{_obj.setFoldercreationdate(dateformat.parse(arr.getString("FOLDERCREATIONDATE")));}catch(Exception ce){_obj.setFoldercreationdate((new Date()));}
             try{_obj.setFoldermodifieddate(dateformat.parse(arr.getString("FOLDERMODIFIEDDATE")));}catch(Exception ce){_obj.setFoldermodifieddate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMMESSAGEFOLDER返回的查询DataRow创建一个MVNFORUMMESSAGEFOLDEREntity对象
* @param MVNFORUMMESSAGEFOLDER row
* @returnMVNFORUMMESSAGEFOLDERList对象
* @throws Exception 
*/
public List<mvnforummessagefolder_Dao> get_mvnforummessagefolder_All() throws Exception{
        List<mvnforummessagefolder_Dao> _list = new ArrayList<mvnforummessagefolder_Dao>();
		String sqlStr = "{ call MVNFORUMMESSAGEFOLDER_PRO.GetMVNFORUMMESSAGEFOLDER(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforummessagefolder_Dao _obj = new mvnforummessagefolder_Dao();
            _obj.setFoldername(arr.getString("FOLDERNAME"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setFolderorder(arr.getInt("FOLDERORDER"));
            _obj.setFolderstatus(arr.getInt("FOLDERSTATUS"));
            _obj.setFolderoption(arr.getInt("FOLDEROPTION"));
            _obj.setFoldertype(arr.getInt("FOLDERTYPE"));
            try{_obj.setFoldercreationdate(dateformat.parse(arr.getString("FOLDERCREATIONDATE")));}catch(Exception ce){_obj.setFoldercreationdate((new Date()));}
            try{_obj.setFoldermodifieddate(dateformat.parse(arr.getString("FOLDERMODIFIEDDATE")));}catch(Exception ce){_obj.setFoldermodifieddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMMESSAGEFOLDER返回的查询DataRow创建一个MVNFORUMMESSAGEFOLDEREntity对象
* @param MVNFORUMMESSAGEFOLDER row
* @returnMVNFORUMMESSAGEFOLDERList对象
* @throws Exception 
*/
public List< mvnforummessagefolder_Dao> get_mvnforummessagefolder_All(String strWhere) throws Exception{
         List<mvnforummessagefolder_Dao> _list = new ArrayList<mvnforummessagefolder_Dao>();
		 String sqlStr = "{ call MVNFORUMMESSAGEFOLDER_PRO.GetMVNFORUMMESSAGEFOLDERWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforummessagefolder_Dao _obj = new mvnforummessagefolder_Dao();
            _obj.setFoldername(arr.getString("FOLDERNAME"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setFolderorder(arr.getInt("FOLDERORDER"));
            _obj.setFolderstatus(arr.getInt("FOLDERSTATUS"));
            _obj.setFolderoption(arr.getInt("FOLDEROPTION"));
            _obj.setFoldertype(arr.getInt("FOLDERTYPE"));
           try{_obj.setFoldercreationdate(dateformat.parse(arr.getString("FOLDERCREATIONDATE")));}catch(Exception ce){_obj.setFoldercreationdate((new Date()));}
           try{_obj.setFoldermodifieddate(dateformat.parse(arr.getString("FOLDERMODIFIEDDATE")));}catch(Exception ce){_obj.setFoldermodifieddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMMESSAGEFOLDER返回 分页数据
* @param MVNFORUMMESSAGEFOLDER row
* @returnMVNFORUMMESSAGEFOLDERList对象
* @throws Exception 
*/
public List<mvnforummessagefolder_Dao> get_mvnforummessagefolder_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforummessagefolder_Dao> _list = new ArrayList<mvnforummessagefolder_Dao>();
		String sqlStr = "{ call MVNFORUMMESSAGEFOLDER_PRO.GetMVNFORUMMESSAGEFOLDERPage(?,?,?,?,?,?)}";
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
				mvnforummessagefolder_Dao _obj = new mvnforummessagefolder_Dao();
            _obj.setFoldername(arr.getString("FOLDERNAME"));
            _obj.setMemberid(arr.getInt("MEMBERID"));
            _obj.setFolderorder(arr.getInt("FOLDERORDER"));
            _obj.setFolderstatus(arr.getInt("FOLDERSTATUS"));
            _obj.setFolderoption(arr.getInt("FOLDEROPTION"));
            _obj.setFoldertype(arr.getInt("FOLDERTYPE"));
            try{_obj.setFoldercreationdate(dateformat.parse(arr.getString("FOLDERCREATIONDATE")));}catch(Exception ce){_obj.setFoldercreationdate((new Date()));}
            try{_obj.setFoldermodifieddate(dateformat.parse(arr.getString("FOLDERMODIFIEDDATE")));}catch(Exception ce){_obj.setFoldermodifieddate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMMESSAGEFOLDER返回的查询DataRow创建一个MVNFORUMMESSAGEFOLDEREntity对象
* @param MVNFORUMMESSAGEFOLDER row
* @returnMVNFORUMMESSAGEFOLDERDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforummessagefolder_Dao> get_mvnforummessagefolder_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforummessagefolderstrWhere") == null) {
			Dictionary<Integer, mvnforummessagefolder_Dao> _dic = new Hashtable<Integer, mvnforummessagefolder_Dao>();
			List<mvnforummessagefolder_Dao> _list = new ArrayList<mvnforummessagefolder_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getFoldername()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforummessagefolder", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforummessagefolder_Dao> _dic = (Dictionary<Integer, mvnforummessagefolder_Dao>) classFactory
					.cacheGet("dicmvnforummessagefolderstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMMESSAGEFOLDER字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforummessagefolder_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMMESSAGEFOLDER_PRO.UpdateFieldMVNFORUMMESSAGEFOLDER(?,?)}";
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
* 更新MVNFORUMMESSAGEFOLDERInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforummessagefolder_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMMESSAGEFOLDER_PRO.UpdateFieldMVNFORUMMESSAGEFOLDERV(?,?,?)}";
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
* 更新MVNFORUMMESSAGEFOLDERIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforummessagefolder_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMMESSAGEFOLDER_PRO.UpdateFieldMVNFORUMMESSAGEFOLDERU(?,?,?)}";
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
