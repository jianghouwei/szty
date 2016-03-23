/*
*@===================================================================
*@��Ŀ˵��
*@���ߣ��δ��� 
*@�汾��Ϣ:@Copy Right 2011-2015
*@�ļ��� dataSc_admin.java
*@��Ŀ���ƣ�JAVA��Ŀ���� 
*@����ʱ�䣺2015/11/3
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sc_admin_Dao;
import com.szty.aihao.core.sc_admin_core;
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
*@�ļ�˵��
*@SC_ADMIN���ݽӿ�
*@���ߣ��δ��� 
*/
public class sc_admin_impl implements sc_admin_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sc_admin_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* �����ݿ��в���һ���¼�¼��
* @param SC_ADMINʵ��
* @return �²����¼�ı��
*/
public int insert_sc_admin(sc_admin_Dao _SC_ADMINModel)  throws Exception{
         String sqlStr = "{call SC_ADMIN_PRO.InsertSC_ADMIN(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SC_ADMINModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SC_ADMINModel.getAdminname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SC_ADMINModel.getAdminpass());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SC_ADMINModel.getAdminflag());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_SC_ADMINModel.getCreatetime()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_SC_ADMINModel.getIsdel());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* �����ݿ��в���һ���¼�¼��
* @param SC_ADMIN
* @Object 
* @return �²����¼�ı��
*/
public int insert_sc_admin(Object[] _para)  throws Exception{
      String sqlStr = "{call SC_ADMIN_PRO.InsertSC_ADMIN(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* �����ݿ��и���һ���¼�¼��
* @param SC_ADMINʵ��
* @return Ӱ�������
*/
public int update_sc_admin(sc_admin_Dao _SC_ADMINModel)  throws Exception{
        String sqlStr = "{call SC_ADMIN_PRO.UpdateSC_ADMIN(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_SC_ADMINModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SC_ADMINModel.getAdminname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SC_ADMINModel.getAdminpass());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SC_ADMINModel.getAdminflag());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_SC_ADMINModel.getCreatetime()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_SC_ADMINModel.getIsdel());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  ɾ�����ݱ�SC_ADMIN�е�һ����¼
* @param SC_ADMINʵ��
* @return �²����¼�ı��
*/
public int delete_sc_admin(int Id)  throws Exception{
        String sqlStr = "{call SC_ADMIN_PRO.DeleteSC_ADMIN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* �õ� sc_admin ����ʵ��
* @param Id">Id
* @return<sc_admin ����ʵ��
* @throws Exception 
*/
public sc_admin_Dao get_sc_adminDao(int Id) throws Exception{
         String sqlStr = "{ call SC_ADMIN_PRO.GetSC_ADMINEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sc_admin_Dao _obj = new sc_admin_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setAdminname(arr.getString("ADMINNAME"));
            _obj.setAdminpass(arr.getString("ADMINPASS"));
            _obj.setAdminflag(arr.getString("ADMINFLAG"));
             try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setIsdel(arr.getInt("ISDEL"));
			return _obj;
		}
		return null;

}
/**
* �õ� sc_admin ��������
* @param Id">Id
* @return<sc_admin ��������
* @throws Exception 
*/
public int get_sc_adminCount(String sWhere) throws Exception{
         String sqlStr = "{ call SC_ADMIN_PRO.GetSC_ADMINCount(?,?)}";
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
* ����SC_ADMIN���صĲ�ѯDataRow����һ��SC_ADMINEntity����
* @param SC_ADMIN row
* @returnSC_ADMINList����
* @throws Exception 
*/
public List<sc_admin_Dao> get_sc_admin_All() throws Exception{
        List<sc_admin_Dao> _list = new ArrayList<sc_admin_Dao>();
		String sqlStr = "{ call SC_ADMIN_PRO.GetSC_ADMIN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sc_admin_Dao _obj = new sc_admin_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setAdminname(arr.getString("ADMINNAME"));
            _obj.setAdminpass(arr.getString("ADMINPASS"));
            _obj.setAdminflag(arr.getString("ADMINFLAG"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setIsdel(arr.getInt("ISDEL"));
            _list.add(_obj);
		}
		return _list;
}
/**
* ����SC_ADMIN���صĲ�ѯDataRow����һ��SC_ADMINEntity����
* @param SC_ADMIN row
* @returnSC_ADMINList����
* @throws Exception 
*/
public List< sc_admin_Dao> get_sc_admin_All(String strWhere) throws Exception{
         List<sc_admin_Dao> _list = new ArrayList<sc_admin_Dao>();
		 String sqlStr = "{ call SC_ADMIN_PRO.GetSC_ADMINWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sc_admin_Dao _obj = new sc_admin_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setAdminname(arr.getString("ADMINNAME"));
            _obj.setAdminpass(arr.getString("ADMINPASS"));
            _obj.setAdminflag(arr.getString("ADMINFLAG"));
           try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setIsdel(arr.getInt("ISDEL"));
            _list.add(_obj);
		}
		return _list;
}

/**
* ����SC_ADMIN���� ��ҳ����
* @param SC_ADMIN row
* @returnSC_ADMINList����
* @throws Exception 
*/
public List<sc_admin_Dao> get_sc_admin_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sc_admin_Dao> _list = new ArrayList<sc_admin_Dao>();
		String sqlStr = "{ call SC_ADMIN_PRO.GetSC_ADMINPage(?,?,?,?,?,?)}";
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
				sc_admin_Dao _obj = new sc_admin_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setAdminname(arr.getString("ADMINNAME"));
            _obj.setAdminpass(arr.getString("ADMINPASS"));
            _obj.setAdminflag(arr.getString("ADMINFLAG"));
            try{_obj.setCreatetime(dateformat.parse(arr.getString("CREATETIME")));}catch(Exception ce){_obj.setCreatetime((new Date()));}
            _obj.setIsdel(arr.getInt("ISDEL"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* ����SC_ADMIN���صĲ�ѯDataRow����һ��SC_ADMINEntity����
* @param SC_ADMIN row
* @returnSC_ADMINDictionary����
* @throws Exception 
*/
public Dictionary<Integer, sc_admin_Dao> get_sc_admin_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsc_adminstrWhere") == null) {
			Dictionary<Integer, sc_admin_Dao> _dic = new Hashtable<Integer, sc_admin_Dao>();
			List<sc_admin_Dao> _list = new ArrayList<sc_admin_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicsc_admin", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sc_admin_Dao> _dic = (Dictionary<Integer, sc_admin_Dao>) classFactory
					.cacheGet("dicsc_adminstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* ����SC_ADMIN�ֶμ�һ
* @param FieldName
* @param sid
*/
public int create_sc_admin_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SC_ADMIN_PRO.UpdateFieldSC_ADMIN(?,?)}";
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
* ����SC_ADMINInt���ֶ�
* @param FieldName
* @param Num
* @param sid
*/
public int create_sc_admin_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SC_ADMIN_PRO.UpdateFieldSC_ADMINV(?,?,?)}";
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
* ����SC_ADMINIString���ֶ�
* @param FieldName
* @param Value
* @param sid
*/
public int create_sc_admin_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SC_ADMIN_PRO.UpdateFieldSC_ADMINU(?,?,?)}";
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
