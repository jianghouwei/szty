/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataPhoneareamap.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.phoneareamap_Dao;
import com.szty.aihao.core.phoneareamap_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@PHONEAREAMAP逻辑层接口
    *@作者：宋春林 
    */

	public class phoneareamap_service
	{
        public  phoneareamap_core _dal=classFactory.getphoneareamap();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param PHONEAREAMAP实体
         * @return 新插入记录的编号
         */
		public int insert_phoneareamap (phoneareamap_Dao _PHONEAREAMAPModel )  throws Exception{
         return _dal.insert_phoneareamap( _PHONEAREAMAPModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param PHONEAREAMAPprrameter
         * @return 新插入记录的编号
         */
         public int insert_phoneareamap(Object[] _para)  throws Exception{
        return _dal.insert_phoneareamap( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param PHONEAREAMAP实体
         * @return 影响的行数
         */
		public int update_phoneareamap(phoneareamap_Dao _PHONEAREAMAPModel)  throws Exception{
        return _dal.update_phoneareamap( _PHONEAREAMAPModel);
		}
	
		

         /**
         *  删除数据表PHONEAREAMAP中的一条记录
         * @param PHONEAREAMAP实体
         * @return 新插入记录的编号
         */
		public int delete_phoneareamap(int Prefix)  throws Exception{
        return _dal.delete_phoneareamap( Prefix);
		}

		

       
          /**
         * 得到 phoneareamap 数据实体
         * @param Prefix">Prefix
         * @return<phoneareamap 数据实体
        * @throws Exception 
         */
		public phoneareamap_Dao get_phoneareamapDao(int Prefix) throws Exception{
        return _dal.get_phoneareamapDao( Prefix);
		}
		
		    /**
         * 根据PHONEAREAMAP返回的查询DataRow创建一个PHONEAREAMAPEntity对象
         * @param PHONEAREAMAP row
         * @returnPHONEAREAMAPList对象
        * @throws Exception 
         */
		public List<phoneareamap_Dao> get_phoneareamap_All() throws Exception{
            return _dal.get_phoneareamap_All();
            }
		    /**
         * 根据PHONEAREAMAP返回的查询DataRow创建一个PHONEAREAMAPEntity对象
         * @param PHONEAREAMAP row
         * @returnPHONEAREAMAPList对象
        * @throws Exception 
         */
		public List<phoneareamap_Dao> get_phoneareamap_All(String strWhere) throws Exception{
            return _dal.get_phoneareamap_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<phoneareamap_Dao> get_phoneareamap_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_phoneareamap_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据PHONEAREAMAP返回的查询DataRow创建一个PHONEAREAMAPEntity对象
         * @param PHONEAREAMAP row
         * @returnPHONEAREAMAPDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, phoneareamap_Dao> get_phoneareamap_Dictionary(String strWhere) throws Exception{
            return _dal.get_phoneareamap_Dictionary(strWhere);
            }
		 /**
         * 更新PHONEAREAMAP字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_phoneareamap_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_phoneareamap_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新PHONEAREAMAPInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_phoneareamap_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_phoneareamap_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新PHONEAREAMAPIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createphoneareamap_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_phoneareamap_UpdateString( FieldName, Value, sid);
            }
        
        
    }
