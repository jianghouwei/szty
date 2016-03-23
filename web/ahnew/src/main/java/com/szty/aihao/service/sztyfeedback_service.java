/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztyfeedback.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.sztyfeedback_Dao;
import com.szty.aihao.core.sztyfeedback_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYFEEDBACK逻辑层接口
    *@作者：宋春林 
    */

	public class sztyfeedback_service
	{
        public  sztyfeedback_core _dal=classFactory.getsztyfeedback();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYFEEDBACK实体
         * @return 新插入记录的编号
         */
		public int insert_sztyfeedback (sztyfeedback_Dao _SZTYFEEDBACKModel )  throws Exception{
         return _dal.insert_sztyfeedback( _SZTYFEEDBACKModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYFEEDBACKprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztyfeedback(Object[] _para)  throws Exception{
        return _dal.insert_sztyfeedback( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYFEEDBACK实体
         * @return 影响的行数
         */
		public int update_sztyfeedback(sztyfeedback_Dao _SZTYFEEDBACKModel)  throws Exception{
        return _dal.update_sztyfeedback( _SZTYFEEDBACKModel);
		}
	
		

         /**
         *  删除数据表SZTYFEEDBACK中的一条记录
         * @param SZTYFEEDBACK实体
         * @return 新插入记录的编号
         */
		public int delete_sztyfeedback(int Id)  throws Exception{
        return _dal.delete_sztyfeedback( Id);
		}

		

       
          /**
         * 得到 sztyfeedback 数据实体
         * @param Id">Id
         * @return<sztyfeedback 数据实体
        * @throws Exception 
         */
		public sztyfeedback_Dao get_sztyfeedbackDao(int Id) throws Exception{
        return _dal.get_sztyfeedbackDao( Id);
		}
		
		    /**
         * 根据SZTYFEEDBACK返回的查询DataRow创建一个SZTYFEEDBACKEntity对象
         * @param SZTYFEEDBACK row
         * @returnSZTYFEEDBACKList对象
        * @throws Exception 
         */
		public List<sztyfeedback_Dao> get_sztyfeedback_All() throws Exception{
            return _dal.get_sztyfeedback_All();
            }
		    /**
         * 根据SZTYFEEDBACK返回的查询DataRow创建一个SZTYFEEDBACKEntity对象
         * @param SZTYFEEDBACK row
         * @returnSZTYFEEDBACKList对象
        * @throws Exception 
         */
		public List<sztyfeedback_Dao> get_sztyfeedback_All(String strWhere) throws Exception{
            return _dal.get_sztyfeedback_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztyfeedback_Dao> get_sztyfeedback_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_sztyfeedback_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据SZTYFEEDBACK返回的查询DataRow创建一个SZTYFEEDBACKEntity对象
         * @param SZTYFEEDBACK row
         * @returnSZTYFEEDBACKDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, sztyfeedback_Dao> get_sztyfeedback_Dictionary(String strWhere) throws Exception{
            return _dal.get_sztyfeedback_Dictionary(strWhere);
            }
		 /**
         * 更新SZTYFEEDBACK字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_sztyfeedback_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_sztyfeedback_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新SZTYFEEDBACKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_sztyfeedback_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_sztyfeedback_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新SZTYFEEDBACKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createsztyfeedback_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_sztyfeedback_UpdateString( FieldName, Value, sid);
            }
        
        
    }
