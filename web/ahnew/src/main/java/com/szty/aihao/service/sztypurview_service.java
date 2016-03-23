/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztypurview.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.sztypurview_Dao;
import com.szty.aihao.core.sztypurview_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYPURVIEW逻辑层接口
    *@作者：宋春林 
    */

	public class sztypurview_service
	{
        public  sztypurview_core _dal=classFactory.getsztypurview();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYPURVIEW实体
         * @return 新插入记录的编号
         */
		public int insert_sztypurview (sztypurview_Dao _SZTYPURVIEWModel )  throws Exception{
         return _dal.insert_sztypurview( _SZTYPURVIEWModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYPURVIEWprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztypurview(Object[] _para)  throws Exception{
        return _dal.insert_sztypurview( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYPURVIEW实体
         * @return 影响的行数
         */
		public int update_sztypurview(sztypurview_Dao _SZTYPURVIEWModel)  throws Exception{
        return _dal.update_sztypurview( _SZTYPURVIEWModel);
		}
	
		

         /**
         *  删除数据表SZTYPURVIEW中的一条记录
         * @param SZTYPURVIEW实体
         * @return 新插入记录的编号
         */
		public int delete_sztypurview(int Purid)  throws Exception{
        return _dal.delete_sztypurview( Purid);
		}

		

       
          /**
         * 得到 sztypurview 数据实体
         * @param Purid">Purid
         * @return<sztypurview 数据实体
        * @throws Exception 
         */
		public sztypurview_Dao get_sztypurviewDao(int Purid) throws Exception{
        return _dal.get_sztypurviewDao( Purid);
		}
		
		    /**
         * 根据SZTYPURVIEW返回的查询DataRow创建一个SZTYPURVIEWEntity对象
         * @param SZTYPURVIEW row
         * @returnSZTYPURVIEWList对象
        * @throws Exception 
         */
		public List<sztypurview_Dao> get_sztypurview_All() throws Exception{
            return _dal.get_sztypurview_All();
            }
		    /**
         * 根据SZTYPURVIEW返回的查询DataRow创建一个SZTYPURVIEWEntity对象
         * @param SZTYPURVIEW row
         * @returnSZTYPURVIEWList对象
        * @throws Exception 
         */
		public List<sztypurview_Dao> get_sztypurview_All(String strWhere) throws Exception{
            return _dal.get_sztypurview_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztypurview_Dao> get_sztypurview_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_sztypurview_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据SZTYPURVIEW返回的查询DataRow创建一个SZTYPURVIEWEntity对象
         * @param SZTYPURVIEW row
         * @returnSZTYPURVIEWDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, sztypurview_Dao> get_sztypurview_Dictionary(String strWhere) throws Exception{
            return _dal.get_sztypurview_Dictionary(strWhere);
            }
		 /**
         * 更新SZTYPURVIEW字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_sztypurview_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_sztypurview_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新SZTYPURVIEWInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_sztypurview_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_sztypurview_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新SZTYPURVIEWIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createsztypurview_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_sztypurview_UpdateString( FieldName, Value, sid);
            }
        
        
    }
