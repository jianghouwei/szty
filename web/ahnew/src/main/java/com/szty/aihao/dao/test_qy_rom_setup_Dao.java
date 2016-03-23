/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： test_qy_rom_setupEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TEST_QY_ROM_SETUP数据实体
    *@作者：宋春林 
    */

	public class test_qy_rom_setup_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int id;
        /**
	     * 
	     */
		private String sn;
        /**
	     * 
	     */
		private int num;
        /**
	     * 
	     */
		private String sd;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getId() {
     
		return id;
	    }
        
	    public void setId(int id) {
		this.id = id;
	    }
       

	    /**
		*
		*/
		
        public String getSn() {
     
		return sn;
	    }
        
	    public void setSn(String sn) {
		this.sn = sn;
	    }
       

	    /**
		*
		*/
		
        public int getNum() {
     
		return num;
	    }
        
	    public void setNum(int num) {
		this.num = num;
	    }
       

	    /**
		*
		*/
		
        public String getSd() {
     
		return sd;
	    }
        
	    public void setSd(String sd) {
		this.sd = sd;
	    }
       
      /*  public static aihao_dao convert(test_qy_rom_setup_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setSn(_dao.getSn());
        
        temp.setNum(_dao.getNum());
        
        temp.setSd(_dao.getSd());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

