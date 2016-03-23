/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforummessagefolder.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforummessagefolder_Dao;
import com.szty.aihao.core.mvnforummessagefolder_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMMESSAGEFOLDER逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforummessagefolder_service
	{
        public  mvnforummessagefolder_core _dal=classFactory.getmvnforummessagefolder();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMESSAGEFOLDER实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforummessagefolder (mvnforummessagefolder_Dao _MVNFORUMMESSAGEFOLDERModel )  throws Exception{
         return _dal.insert_mvnforummessagefolder( _MVNFORUMMESSAGEFOLDERModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMESSAGEFOLDERprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforummessagefolder(Object[] _para)  throws Exception{
        return _dal.insert_mvnforummessagefolder( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMESSAGEFOLDER实体
         * @return 影响的行数
         */
		public int update_mvnforummessagefolder(mvnforummessagefolder_Dao _MVNFORUMMESSAGEFOLDERModel)  throws Exception{
        return _dal.update_mvnforummessagefolder( _MVNFORUMMESSAGEFOLDERModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMMESSAGEFOLDER中的一条记录
         * @param MVNFORUMMESSAGEFOLDER实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforummessagefolder(int Foldername)  throws Exception{
        return _dal.delete_mvnforummessagefolder( Foldername);
		}

		

       
          /**
         * 得到 mvnforummessagefolder 数据实体
         * @param Foldername">Foldername
         * @return<mvnforummessagefolder 数据实体
        * @throws Exception 
         */
		public mvnforummessagefolder_Dao get_mvnforummessagefolderDao(int Foldername) throws Exception{
        return _dal.get_mvnforummessagefolderDao( Foldername);
		}
		
		    /**
         * 根据MVNFORUMMESSAGEFOLDER返回的查询DataRow创建一个MVNFORUMMESSAGEFOLDEREntity对象
         * @param MVNFORUMMESSAGEFOLDER row
         * @returnMVNFORUMMESSAGEFOLDERList对象
        * @throws Exception 
         */
		public List<mvnforummessagefolder_Dao> get_mvnforummessagefolder_All() throws Exception{
            return _dal.get_mvnforummessagefolder_All();
            }
		    /**
         * 根据MVNFORUMMESSAGEFOLDER返回的查询DataRow创建一个MVNFORUMMESSAGEFOLDEREntity对象
         * @param MVNFORUMMESSAGEFOLDER row
         * @returnMVNFORUMMESSAGEFOLDERList对象
        * @throws Exception 
         */
		public List<mvnforummessagefolder_Dao> get_mvnforummessagefolder_All(String strWhere) throws Exception{
            return _dal.get_mvnforummessagefolder_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforummessagefolder_Dao> get_mvnforummessagefolder_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforummessagefolder_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMMESSAGEFOLDER返回的查询DataRow创建一个MVNFORUMMESSAGEFOLDEREntity对象
         * @param MVNFORUMMESSAGEFOLDER row
         * @returnMVNFORUMMESSAGEFOLDERDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforummessagefolder_Dao> get_mvnforummessagefolder_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforummessagefolder_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMMESSAGEFOLDER字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforummessagefolder_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforummessagefolder_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMMESSAGEFOLDERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforummessagefolder_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforummessagefolder_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMMESSAGEFOLDERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforummessagefolder_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforummessagefolder_UpdateString( FieldName, Value, sid);
            }
        
        
    }
