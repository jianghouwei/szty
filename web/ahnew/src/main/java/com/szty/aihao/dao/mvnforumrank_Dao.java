/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumrankEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMRANK数据实体
    *@作者：宋春林 
    */

	public class mvnforumrank_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int rankid;
        /**
	     * 
	     */
		private int rankminposts;
        /**
	     * 
	     */
		private int ranklevel;
        /**
	     * 
	     */
		private String ranktitle;
        /**
	     * 
	     */
		private String rankimage;
        /**
	     * 
	     */
		private int ranktype;
        /**
	     * 
	     */
		private int rankoption;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getRankid() {
     
		return rankid;
	    }
        
	    public void setRankid(int rankid) {
		this.rankid = rankid;
	    }
       

	    /**
		*
		*/
		
        public int getRankminposts() {
     
		return rankminposts;
	    }
        
	    public void setRankminposts(int rankminposts) {
		this.rankminposts = rankminposts;
	    }
       

	    /**
		*
		*/
		
        public int getRanklevel() {
     
		return ranklevel;
	    }
        
	    public void setRanklevel(int ranklevel) {
		this.ranklevel = ranklevel;
	    }
       

	    /**
		*
		*/
		
        public String getRanktitle() {
     
		return ranktitle;
	    }
        
	    public void setRanktitle(String ranktitle) {
		this.ranktitle = ranktitle;
	    }
       

	    /**
		*
		*/
		
        public String getRankimage() {
     
		return rankimage;
	    }
        
	    public void setRankimage(String rankimage) {
		this.rankimage = rankimage;
	    }
       

	    /**
		*
		*/
		
        public int getRanktype() {
     
		return ranktype;
	    }
        
	    public void setRanktype(int ranktype) {
		this.ranktype = ranktype;
	    }
       

	    /**
		*
		*/
		
        public int getRankoption() {
     
		return rankoption;
	    }
        
	    public void setRankoption(int rankoption) {
		this.rankoption = rankoption;
	    }
       
      /*  public static aihao_dao convert(mvnforumrank_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setRankid(_dao.getRankid());
        
        temp.setRankminposts(_dao.getRankminposts());
        
        temp.setRanklevel(_dao.getRanklevel());
        
        temp.setRanktitle(_dao.getRanktitle());
        
        temp.setRankimage(_dao.getRankimage());
        
        temp.setRanktype(_dao.getRanktype());
        
        temp.setRankoption(_dao.getRankoption());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

