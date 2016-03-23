/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataChina_area.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.china_area_Dao;
import com.szty.aihao.core.china_area_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@CHINA_AREA逻辑层接口
    *@作者：宋春林 
    */

	public class china_area_service
	{
        public  china_area_core _dal=classFactory.getchina_area();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param CHINA_AREA实体
         * @return 新插入记录的编号
         */
		public int insert_china_area (china_area_Dao _CHINA_AREAModel )  throws Exception{
         return _dal.insert_china_area( _CHINA_AREAModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param CHINA_AREAprrameter
         * @return 新插入记录的编号
         */
         public int insert_china_area(Object[] _para)  throws Exception{
        return _dal.insert_china_area( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param CHINA_AREA实体
         * @return 影响的行数
         */
		public int update_china_area(china_area_Dao _CHINA_AREAModel)  throws Exception{
        return _dal.update_china_area( _CHINA_AREAModel);
		}
	
		

         /**
         *  删除数据表CHINA_AREA中的一条记录
         * @param CHINA_AREA实体
         * @return 新插入记录的编号
         */
		public int delete_china_area(int Id)  throws Exception{
        return _dal.delete_china_area( Id);
		}

		

       
          /**
         * 得到 china_area 数据实体
         * @param Id">Id
         * @return<china_area 数据实体
        * @throws Exception 
         */
		public china_area_Dao get_china_areaDao(int Id) throws Exception{
        return _dal.get_china_areaDao( Id);
		}
		
		    /**
         * 根据CHINA_AREA返回的查询DataRow创建一个CHINA_AREAEntity对象
         * @param CHINA_AREA row
         * @returnCHINA_AREAList对象
        * @throws Exception 
         */
		public List<china_area_Dao> get_china_area_All() throws Exception{
            return _dal.get_china_area_All();
            }
		    /**
         * 根据CHINA_AREA返回的查询DataRow创建一个CHINA_AREAEntity对象
         * @param CHINA_AREA row
         * @returnCHINA_AREAList对象
        * @throws Exception 
         */
		public List<china_area_Dao> get_china_area_All(String strWhere) throws Exception{
            return _dal.get_china_area_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<china_area_Dao> get_china_area_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_china_area_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据CHINA_AREA返回的查询DataRow创建一个CHINA_AREAEntity对象
         * @param CHINA_AREA row
         * @returnCHINA_AREADictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, china_area_Dao> get_china_area_Dictionary(String strWhere) throws Exception{
            return _dal.get_china_area_Dictionary(strWhere);
            }
		 /**
         * 更新CHINA_AREA字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_china_area_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_china_area_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新CHINA_AREAInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_china_area_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_china_area_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新CHINA_AREAIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createchina_area_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_china_area_UpdateString( FieldName, Value, sid);
            }
        
        
    }
