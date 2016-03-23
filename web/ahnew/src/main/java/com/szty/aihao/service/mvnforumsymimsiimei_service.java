/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumsymimsiimei.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumsymimsiimei_Dao;
import com.szty.aihao.core.mvnforumsymimsiimei_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMSYMIMSIIMEI逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumsymimsiimei_service
	{
        public  mvnforumsymimsiimei_core _dal=classFactory.getmvnforumsymimsiimei();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMIMSIIMEI实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumsymimsiimei (mvnforumsymimsiimei_Dao _MVNFORUMSYMIMSIIMEIModel )  throws Exception{
         return _dal.insert_mvnforumsymimsiimei( _MVNFORUMSYMIMSIIMEIModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMIMSIIMEIprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumsymimsiimei(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumsymimsiimei( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMIMSIIMEI实体
         * @return 影响的行数
         */
		public int update_mvnforumsymimsiimei(mvnforumsymimsiimei_Dao _MVNFORUMSYMIMSIIMEIModel)  throws Exception{
        return _dal.update_mvnforumsymimsiimei( _MVNFORUMSYMIMSIIMEIModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMSYMIMSIIMEI中的一条记录
         * @param MVNFORUMSYMIMSIIMEI实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumsymimsiimei(int Imid)  throws Exception{
        return _dal.delete_mvnforumsymimsiimei( Imid);
		}

		

       
          /**
         * 得到 mvnforumsymimsiimei 数据实体
         * @param Imid">Imid
         * @return<mvnforumsymimsiimei 数据实体
        * @throws Exception 
         */
		public mvnforumsymimsiimei_Dao get_mvnforumsymimsiimeiDao(int Imid) throws Exception{
        return _dal.get_mvnforumsymimsiimeiDao( Imid);
		}
		
		    /**
         * 根据MVNFORUMSYMIMSIIMEI返回的查询DataRow创建一个MVNFORUMSYMIMSIIMEIEntity对象
         * @param MVNFORUMSYMIMSIIMEI row
         * @returnMVNFORUMSYMIMSIIMEIList对象
        * @throws Exception 
         */
		public List<mvnforumsymimsiimei_Dao> get_mvnforumsymimsiimei_All() throws Exception{
            return _dal.get_mvnforumsymimsiimei_All();
            }
		    /**
         * 根据MVNFORUMSYMIMSIIMEI返回的查询DataRow创建一个MVNFORUMSYMIMSIIMEIEntity对象
         * @param MVNFORUMSYMIMSIIMEI row
         * @returnMVNFORUMSYMIMSIIMEIList对象
        * @throws Exception 
         */
		public List<mvnforumsymimsiimei_Dao> get_mvnforumsymimsiimei_All(String strWhere) throws Exception{
            return _dal.get_mvnforumsymimsiimei_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumsymimsiimei_Dao> get_mvnforumsymimsiimei_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumsymimsiimei_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMSYMIMSIIMEI返回的查询DataRow创建一个MVNFORUMSYMIMSIIMEIEntity对象
         * @param MVNFORUMSYMIMSIIMEI row
         * @returnMVNFORUMSYMIMSIIMEIDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumsymimsiimei_Dao> get_mvnforumsymimsiimei_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumsymimsiimei_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMSYMIMSIIMEI字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumsymimsiimei_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumsymimsiimei_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMSYMIMSIIMEIInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumsymimsiimei_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumsymimsiimei_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMSYMIMSIIMEIIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumsymimsiimei_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumsymimsiimei_UpdateString( FieldName, Value, sid);
            }
        
        
    }
