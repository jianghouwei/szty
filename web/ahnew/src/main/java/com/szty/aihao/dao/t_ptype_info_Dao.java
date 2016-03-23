/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： t_ptype_infoEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@T_PTYPE_INFO数据实体
    *@作者：宋春林 
    */

	public class t_ptype_info_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 埋点ID
	     */
		private int pid;
        /**
	     * 对应类别
	     */
		private String ptype;
        /**
	     * 备注
	     */
		private String rmk;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*埋点ID
		*/
		
        public int getPid() {
     
		return pid;
	    }
        
	    public void setPid(int pid) {
		this.pid = pid;
	    }
       

	    /**
		*对应类别
		*/
		
        public String getPtype() {
     
		return ptype;
	    }
        
	    public void setPtype(String ptype) {
		this.ptype = ptype;
	    }
       

	    /**
		*备注
		*/
		
        public String getRmk() {
     
		return rmk;
	    }
        
	    public void setRmk(String rmk) {
		this.rmk = rmk;
	    }
       
      /*  public static aihao_dao convert(t_ptype_info_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setPid(_dao.getPid());
        
        temp.setPtype(_dao.getPtype());
        
        temp.setRmk(_dao.getRmk());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

