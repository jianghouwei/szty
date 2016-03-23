/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： tj_aihao_point_typeEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TJ_AIHAO_POINT_TYPE数据实体
    *@作者：宋春林 
    */

	public class tj_aihao_point_type_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 埋点ID
	     */
		private int pointid;
        /**
	     * 统计类型 "1"- 数值型；"2"- 字符型；"3"-常用号码；"4"-拨打类
	     */
		private String ptype;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*埋点ID
		*/
		
        public int getPointid() {
     
		return pointid;
	    }
        
	    public void setPointid(int pointid) {
		this.pointid = pointid;
	    }
       

	    /**
		*统计类型 "1"- 数值型；"2"- 字符型；"3"-常用号码；"4"-拨打类
		*/
		
        public String getPtype() {
     
		return ptype;
	    }
        
	    public void setPtype(String ptype) {
		this.ptype = ptype;
	    }
       
      /*  public static aihao_dao convert(tj_aihao_point_type_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setPointid(_dao.getPointid());
        
        temp.setPtype(_dao.getPtype());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

