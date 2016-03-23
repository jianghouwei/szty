/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： dataAccessFactory.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */
package com.szty.aihao.factory;
import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;
public class classFactory {
	
	
    private static JCS myCache;

	public classFactory() {
		try {
			myCache = JCS.getInstance("proxyCache");
		} catch (Exception e) {
			System.out.println("proxyCache 获得错误！");
		}

	}

	public static void cachePut(String key, Object obj) {

		try {
			if (myCache == null) {
				System.out.println("null");
			}
			myCache.put(key, obj);
		} catch (CacheException e) {

			System.out.println("cache 插入失败！" + e.getMessage());
		}
	}

	public static Object cacheGet(String key) {
		if (myCache == null) {
			try {
				myCache = JCS.getInstance("proxyCache");
			} catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Object obj = myCache.get(key);
		return obj;
	}
    public static void cacheclean() {

		try {

			myCache.clear();
			myCache = null;
		} catch (CacheException e) {

			System.out.println("cache 清除失败！" + e.getMessage());
		}
	}
    private static Object CreateObject(String path, String CacheKey) {
		Object objType = cacheGet(CacheKey);
		if (objType == null) {
			try {
				objType = Class.forName(path).newInstance();
				cachePut(CacheKey, objType);
			} catch (Exception ce) {
				System.out.println(ce.getMessage());
			}

		}
		return objType;
	}
	/**
    * 通过反射机制，实例化A实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.a_core   geta(){
		Object objType = CreateObject("com.szty.aihao.impl.a_impl",
				"A");
        return (com.szty.aihao.impl.a_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AAA实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aaa_core   getaaa(){
		Object objType = CreateObject("com.szty.aihao.impl.aaa_impl",
				"AAA");
        return (com.szty.aihao.impl.aaa_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AAACE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aaace_core   getaaace(){
		Object objType = CreateObject("com.szty.aihao.impl.aaace_impl",
				"AAACE");
        return (com.szty.aihao.impl.aaace_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO10实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao10_core   getaihao10(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao10_impl",
				"AIHAO10");
        return (com.szty.aihao.impl.aihao10_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO10_20140409BAK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao10_20140409bak_core   getaihao10_20140409bak(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao10_20140409bak_impl",
				"AIHAO10_20140409BAK");
        return (com.szty.aihao.impl.aihao10_20140409bak_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO10_BAIDU_UPDATE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao10_baidu_update_core   getaihao10_baidu_update(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao10_baidu_update_impl",
				"AIHAO10_BAIDU_UPDATE");
        return (com.szty.aihao.impl.aihao10_baidu_update_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO10_BAK20121129实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao10_bak20121129_core   getaihao10_bak20121129(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao10_bak20121129_impl",
				"AIHAO10_BAK20121129");
        return (com.szty.aihao.impl.aihao10_bak20121129_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO10_DDYH实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao10_ddyh_core   getaihao10_ddyh(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao10_ddyh_impl",
				"AIHAO10_DDYH");
        return (com.szty.aihao.impl.aihao10_ddyh_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO11实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao11_core   getaihao11(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao11_impl",
				"AIHAO11");
        return (com.szty.aihao.impl.aihao11_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO11_DDYH实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao11_ddyh_core   getaihao11_ddyh(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao11_ddyh_impl",
				"AIHAO11_DDYH");
        return (com.szty.aihao.impl.aihao11_ddyh_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO12实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao12_core   getaihao12(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao12_impl",
				"AIHAO12");
        return (com.szty.aihao.impl.aihao12_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO13实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao13_core   getaihao13(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao13_impl",
				"AIHAO13");
        return (com.szty.aihao.impl.aihao13_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO14实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao14_core   getaihao14(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao14_impl",
				"AIHAO14");
        return (com.szty.aihao.impl.aihao14_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO15实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao15_core   getaihao15(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao15_impl",
				"AIHAO15");
        return (com.szty.aihao.impl.aihao15_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO16实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao16_core   getaihao16(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao16_impl",
				"AIHAO16");
        return (com.szty.aihao.impl.aihao16_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO17实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao17_core   getaihao17(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao17_impl",
				"AIHAO17");
        return (com.szty.aihao.impl.aihao17_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO18实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao18_core   getaihao18(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao18_impl",
				"AIHAO18");
        return (com.szty.aihao.impl.aihao18_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO18_20140409BAK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao18_20140409bak_core   getaihao18_20140409bak(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao18_20140409bak_impl",
				"AIHAO18_20140409BAK");
        return (com.szty.aihao.impl.aihao18_20140409bak_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO18_BAIDU_UPDATE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao18_baidu_update_core   getaihao18_baidu_update(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao18_baidu_update_impl",
				"AIHAO18_BAIDU_UPDATE");
        return (com.szty.aihao.impl.aihao18_baidu_update_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO19实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao19_core   getaihao19(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao19_impl",
				"AIHAO19");
        return (com.szty.aihao.impl.aihao19_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO20实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao20_core   getaihao20(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao20_impl",
				"AIHAO20");
        return (com.szty.aihao.impl.aihao20_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO21实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao21_core   getaihao21(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao21_impl",
				"AIHAO21");
        return (com.szty.aihao.impl.aihao21_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO22实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao22_core   getaihao22(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao22_impl",
				"AIHAO22");
        return (com.szty.aihao.impl.aihao22_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO23实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao23_core   getaihao23(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao23_impl",
				"AIHAO23");
        return (com.szty.aihao.impl.aihao23_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO24实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao24_core   getaihao24(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao24_impl",
				"AIHAO24");
        return (com.szty.aihao.impl.aihao24_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO25实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao25_core   getaihao25(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao25_impl",
				"AIHAO25");
        return (com.szty.aihao.impl.aihao25_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO26实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao26_core   getaihao26(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao26_impl",
				"AIHAO26");
        return (com.szty.aihao.impl.aihao26_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO27实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao27_core   getaihao27(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao27_impl",
				"AIHAO27");
        return (com.szty.aihao.impl.aihao27_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO28实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao28_core   getaihao28(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao28_impl",
				"AIHAO28");
        return (com.szty.aihao.impl.aihao28_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO29实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao29_core   getaihao29(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao29_impl",
				"AIHAO29");
        return (com.szty.aihao.impl.aihao29_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO30实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao30_core   getaihao30(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao30_impl",
				"AIHAO30");
        return (com.szty.aihao.impl.aihao30_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO31实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao31_core   getaihao31(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao31_impl",
				"AIHAO31");
        return (com.szty.aihao.impl.aihao31_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO32实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao32_core   getaihao32(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao32_impl",
				"AIHAO32");
        return (com.szty.aihao.impl.aihao32_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO32TMP实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao32tmp_core   getaihao32tmp(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao32tmp_impl",
				"AIHAO32TMP");
        return (com.szty.aihao.impl.aihao32tmp_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO33实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao33_core   getaihao33(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao33_impl",
				"AIHAO33");
        return (com.szty.aihao.impl.aihao33_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO34实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao34_core   getaihao34(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao34_impl",
				"AIHAO34");
        return (com.szty.aihao.impl.aihao34_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO35实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao35_core   getaihao35(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao35_impl",
				"AIHAO35");
        return (com.szty.aihao.impl.aihao35_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO36实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao36_core   getaihao36(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao36_impl",
				"AIHAO36");
        return (com.szty.aihao.impl.aihao36_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO37实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao37_core   getaihao37(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao37_impl",
				"AIHAO37");
        return (com.szty.aihao.impl.aihao37_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO38实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao38_core   getaihao38(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao38_impl",
				"AIHAO38");
        return (com.szty.aihao.impl.aihao38_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO39实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao39_core   getaihao39(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao39_impl",
				"AIHAO39");
        return (com.szty.aihao.impl.aihao39_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO39_1实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao39_1_core   getaihao39_1(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao39_1_impl",
				"AIHAO39_1");
        return (com.szty.aihao.impl.aihao39_1_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO40实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao40_core   getaihao40(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao40_impl",
				"AIHAO40");
        return (com.szty.aihao.impl.aihao40_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO41实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao41_core   getaihao41(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao41_impl",
				"AIHAO41");
        return (com.szty.aihao.impl.aihao41_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO43实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao43_core   getaihao43(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao43_impl",
				"AIHAO43");
        return (com.szty.aihao.impl.aihao43_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO44实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao44_core   getaihao44(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao44_impl",
				"AIHAO44");
        return (com.szty.aihao.impl.aihao44_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOAAA实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoaaa_core   getaihaoaaa(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoaaa_impl",
				"AIHAOAAA");
        return (com.szty.aihao.impl.aihaoaaa_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOACTIVITY实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoactivity_core   getaihaoactivity(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoactivity_impl",
				"AIHAOACTIVITY");
        return (com.szty.aihao.impl.aihaoactivity_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOACTIVITYLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoactivitylog_core   getaihaoactivitylog(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoactivitylog_impl",
				"AIHAOACTIVITYLOG");
        return (com.szty.aihao.impl.aihaoactivitylog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOANDROIDPUSH实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoandroidpush_core   getaihaoandroidpush(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoandroidpush_impl",
				"AIHAOANDROIDPUSH");
        return (com.szty.aihao.impl.aihaoandroidpush_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBIGCLASS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobigclass_core   getaihaobigclass(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobigclass_impl",
				"AIHAOBIGCLASS");
        return (com.szty.aihao.impl.aihaobigclass_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness_core   getaihaobusiness(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness_impl",
				"AIHAOBUSINESS");
        return (com.szty.aihao.impl.aihaobusiness_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS10实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness10_core   getaihaobusiness10(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness10_impl",
				"AIHAOBUSINESS10");
        return (com.szty.aihao.impl.aihaobusiness10_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS11实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness11_core   getaihaobusiness11(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness11_impl",
				"AIHAOBUSINESS11");
        return (com.szty.aihao.impl.aihaobusiness11_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS12实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness12_core   getaihaobusiness12(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness12_impl",
				"AIHAOBUSINESS12");
        return (com.szty.aihao.impl.aihaobusiness12_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS13实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness13_core   getaihaobusiness13(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness13_impl",
				"AIHAOBUSINESS13");
        return (com.szty.aihao.impl.aihaobusiness13_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS14实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness14_core   getaihaobusiness14(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness14_impl",
				"AIHAOBUSINESS14");
        return (com.szty.aihao.impl.aihaobusiness14_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS15实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness15_core   getaihaobusiness15(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness15_impl",
				"AIHAOBUSINESS15");
        return (com.szty.aihao.impl.aihaobusiness15_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS16实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness16_core   getaihaobusiness16(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness16_impl",
				"AIHAOBUSINESS16");
        return (com.szty.aihao.impl.aihaobusiness16_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS17实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness17_core   getaihaobusiness17(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness17_impl",
				"AIHAOBUSINESS17");
        return (com.szty.aihao.impl.aihaobusiness17_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS18实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness18_core   getaihaobusiness18(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness18_impl",
				"AIHAOBUSINESS18");
        return (com.szty.aihao.impl.aihaobusiness18_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS19实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness19_core   getaihaobusiness19(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness19_impl",
				"AIHAOBUSINESS19");
        return (com.szty.aihao.impl.aihaobusiness19_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS20实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness20_core   getaihaobusiness20(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness20_impl",
				"AIHAOBUSINESS20");
        return (com.szty.aihao.impl.aihaobusiness20_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS21实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness21_core   getaihaobusiness21(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness21_impl",
				"AIHAOBUSINESS21");
        return (com.szty.aihao.impl.aihaobusiness21_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS22实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness22_core   getaihaobusiness22(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness22_impl",
				"AIHAOBUSINESS22");
        return (com.szty.aihao.impl.aihaobusiness22_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS23实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness23_core   getaihaobusiness23(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness23_impl",
				"AIHAOBUSINESS23");
        return (com.szty.aihao.impl.aihaobusiness23_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS24实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness24_core   getaihaobusiness24(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness24_impl",
				"AIHAOBUSINESS24");
        return (com.szty.aihao.impl.aihaobusiness24_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS25实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness25_core   getaihaobusiness25(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness25_impl",
				"AIHAOBUSINESS25");
        return (com.szty.aihao.impl.aihaobusiness25_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS26实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness26_core   getaihaobusiness26(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness26_impl",
				"AIHAOBUSINESS26");
        return (com.szty.aihao.impl.aihaobusiness26_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS27实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness27_core   getaihaobusiness27(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness27_impl",
				"AIHAOBUSINESS27");
        return (com.szty.aihao.impl.aihaobusiness27_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS28实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness28_core   getaihaobusiness28(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness28_impl",
				"AIHAOBUSINESS28");
        return (com.szty.aihao.impl.aihaobusiness28_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS29实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness29_core   getaihaobusiness29(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness29_impl",
				"AIHAOBUSINESS29");
        return (com.szty.aihao.impl.aihaobusiness29_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS30实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness30_core   getaihaobusiness30(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness30_impl",
				"AIHAOBUSINESS30");
        return (com.szty.aihao.impl.aihaobusiness30_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS31实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness31_core   getaihaobusiness31(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness31_impl",
				"AIHAOBUSINESS31");
        return (com.szty.aihao.impl.aihaobusiness31_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS32实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness32_core   getaihaobusiness32(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness32_impl",
				"AIHAOBUSINESS32");
        return (com.szty.aihao.impl.aihaobusiness32_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS33实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness33_core   getaihaobusiness33(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness33_impl",
				"AIHAOBUSINESS33");
        return (com.szty.aihao.impl.aihaobusiness33_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS34实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness34_core   getaihaobusiness34(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness34_impl",
				"AIHAOBUSINESS34");
        return (com.szty.aihao.impl.aihaobusiness34_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS35实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness35_core   getaihaobusiness35(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness35_impl",
				"AIHAOBUSINESS35");
        return (com.szty.aihao.impl.aihaobusiness35_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS36实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness36_core   getaihaobusiness36(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness36_impl",
				"AIHAOBUSINESS36");
        return (com.szty.aihao.impl.aihaobusiness36_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS37实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness37_core   getaihaobusiness37(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness37_impl",
				"AIHAOBUSINESS37");
        return (com.szty.aihao.impl.aihaobusiness37_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS38实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness38_core   getaihaobusiness38(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness38_impl",
				"AIHAOBUSINESS38");
        return (com.szty.aihao.impl.aihaobusiness38_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS39实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness39_core   getaihaobusiness39(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness39_impl",
				"AIHAOBUSINESS39");
        return (com.szty.aihao.impl.aihaobusiness39_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS40实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness40_core   getaihaobusiness40(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness40_impl",
				"AIHAOBUSINESS40");
        return (com.szty.aihao.impl.aihaobusiness40_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOBUSINESS41实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaobusiness41_core   getaihaobusiness41(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaobusiness41_impl",
				"AIHAOBUSINESS41");
        return (com.szty.aihao.impl.aihaobusiness41_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOCHANGYONGHAOMA实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaochangyonghaoma_core   getaihaochangyonghaoma(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaochangyonghaoma_impl",
				"AIHAOCHANGYONGHAOMA");
        return (com.szty.aihao.impl.aihaochangyonghaoma_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOCONTACT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaocontact_core   getaihaocontact(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaocontact_impl",
				"AIHAOCONTACT");
        return (com.szty.aihao.impl.aihaocontact_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOCY实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaocy_core   getaihaocy(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaocy_impl",
				"AIHAOCY");
        return (com.szty.aihao.impl.aihaocy_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOINSTALLINFO实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoinstallinfo_core   getaihaoinstallinfo(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoinstallinfo_impl",
				"AIHAOINSTALLINFO");
        return (com.szty.aihao.impl.aihaoinstallinfo_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIOSTOKEN实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiostoken_core   getaihaoiostoken(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiostoken_impl",
				"AIHAOIOSTOKEN");
        return (com.szty.aihao.impl.aihaoiostoken_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP10实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp10_core   getaihaoiptmp10(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp10_impl",
				"AIHAOIPTMP10");
        return (com.szty.aihao.impl.aihaoiptmp10_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP11实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp11_core   getaihaoiptmp11(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp11_impl",
				"AIHAOIPTMP11");
        return (com.szty.aihao.impl.aihaoiptmp11_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP12实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp12_core   getaihaoiptmp12(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp12_impl",
				"AIHAOIPTMP12");
        return (com.szty.aihao.impl.aihaoiptmp12_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP13实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp13_core   getaihaoiptmp13(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp13_impl",
				"AIHAOIPTMP13");
        return (com.szty.aihao.impl.aihaoiptmp13_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP14实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp14_core   getaihaoiptmp14(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp14_impl",
				"AIHAOIPTMP14");
        return (com.szty.aihao.impl.aihaoiptmp14_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP15实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp15_core   getaihaoiptmp15(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp15_impl",
				"AIHAOIPTMP15");
        return (com.szty.aihao.impl.aihaoiptmp15_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP16实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp16_core   getaihaoiptmp16(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp16_impl",
				"AIHAOIPTMP16");
        return (com.szty.aihao.impl.aihaoiptmp16_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP17实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp17_core   getaihaoiptmp17(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp17_impl",
				"AIHAOIPTMP17");
        return (com.szty.aihao.impl.aihaoiptmp17_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP18实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp18_core   getaihaoiptmp18(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp18_impl",
				"AIHAOIPTMP18");
        return (com.szty.aihao.impl.aihaoiptmp18_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP19实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp19_core   getaihaoiptmp19(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp19_impl",
				"AIHAOIPTMP19");
        return (com.szty.aihao.impl.aihaoiptmp19_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP20实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp20_core   getaihaoiptmp20(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp20_impl",
				"AIHAOIPTMP20");
        return (com.szty.aihao.impl.aihaoiptmp20_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP21实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp21_core   getaihaoiptmp21(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp21_impl",
				"AIHAOIPTMP21");
        return (com.szty.aihao.impl.aihaoiptmp21_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP22实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp22_core   getaihaoiptmp22(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp22_impl",
				"AIHAOIPTMP22");
        return (com.szty.aihao.impl.aihaoiptmp22_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP23实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp23_core   getaihaoiptmp23(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp23_impl",
				"AIHAOIPTMP23");
        return (com.szty.aihao.impl.aihaoiptmp23_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP24实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp24_core   getaihaoiptmp24(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp24_impl",
				"AIHAOIPTMP24");
        return (com.szty.aihao.impl.aihaoiptmp24_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP25实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp25_core   getaihaoiptmp25(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp25_impl",
				"AIHAOIPTMP25");
        return (com.szty.aihao.impl.aihaoiptmp25_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP26实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp26_core   getaihaoiptmp26(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp26_impl",
				"AIHAOIPTMP26");
        return (com.szty.aihao.impl.aihaoiptmp26_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP27实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp27_core   getaihaoiptmp27(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp27_impl",
				"AIHAOIPTMP27");
        return (com.szty.aihao.impl.aihaoiptmp27_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP28实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp28_core   getaihaoiptmp28(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp28_impl",
				"AIHAOIPTMP28");
        return (com.szty.aihao.impl.aihaoiptmp28_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP29实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp29_core   getaihaoiptmp29(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp29_impl",
				"AIHAOIPTMP29");
        return (com.szty.aihao.impl.aihaoiptmp29_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP30实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp30_core   getaihaoiptmp30(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp30_impl",
				"AIHAOIPTMP30");
        return (com.szty.aihao.impl.aihaoiptmp30_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP31实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp31_core   getaihaoiptmp31(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp31_impl",
				"AIHAOIPTMP31");
        return (com.szty.aihao.impl.aihaoiptmp31_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP32实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp32_core   getaihaoiptmp32(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp32_impl",
				"AIHAOIPTMP32");
        return (com.szty.aihao.impl.aihaoiptmp32_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP33实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp33_core   getaihaoiptmp33(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp33_impl",
				"AIHAOIPTMP33");
        return (com.szty.aihao.impl.aihaoiptmp33_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP34实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp34_core   getaihaoiptmp34(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp34_impl",
				"AIHAOIPTMP34");
        return (com.szty.aihao.impl.aihaoiptmp34_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP35实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp35_core   getaihaoiptmp35(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp35_impl",
				"AIHAOIPTMP35");
        return (com.szty.aihao.impl.aihaoiptmp35_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP36实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp36_core   getaihaoiptmp36(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp36_impl",
				"AIHAOIPTMP36");
        return (com.szty.aihao.impl.aihaoiptmp36_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP37实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp37_core   getaihaoiptmp37(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp37_impl",
				"AIHAOIPTMP37");
        return (com.szty.aihao.impl.aihaoiptmp37_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP38实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp38_core   getaihaoiptmp38(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp38_impl",
				"AIHAOIPTMP38");
        return (com.szty.aihao.impl.aihaoiptmp38_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP39实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp39_core   getaihaoiptmp39(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp39_impl",
				"AIHAOIPTMP39");
        return (com.szty.aihao.impl.aihaoiptmp39_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOIPTMP40实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoiptmp40_core   getaihaoiptmp40(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoiptmp40_impl",
				"AIHAOIPTMP40");
        return (com.szty.aihao.impl.aihaoiptmp40_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOKEYTORESULT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaokeytoresult_core   getaihaokeytoresult(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaokeytoresult_impl",
				"AIHAOKEYTORESULT");
        return (com.szty.aihao.impl.aihaokeytoresult_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOMEMBER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaomember_core   getaihaomember(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaomember_impl",
				"AIHAOMEMBER");
        return (com.szty.aihao.impl.aihaomember_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOMEMBER_BAK_130913实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaomember_bak_130913_core   getaihaomember_bak_130913(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaomember_bak_130913_impl",
				"AIHAOMEMBER_BAK_130913");
        return (com.szty.aihao.impl.aihaomember_bak_130913_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAONEARSEARCHLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaonearsearchlog_core   getaihaonearsearchlog(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaonearsearchlog_impl",
				"AIHAONEARSEARCHLOG");
        return (com.szty.aihao.impl.aihaonearsearchlog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOPPC实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoppc_core   getaihaoppc(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoppc_impl",
				"AIHAOPPC");
        return (com.szty.aihao.impl.aihaoppc_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOSEARCHLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaosearchlog_core   getaihaosearchlog(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaosearchlog_impl",
				"AIHAOSEARCHLOG");
        return (com.szty.aihao.impl.aihaosearchlog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOSEARCHRECORD实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaosearchrecord_core   getaihaosearchrecord(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaosearchrecord_impl",
				"AIHAOSEARCHRECORD");
        return (com.szty.aihao.impl.aihaosearchrecord_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOSETUP实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaosetup_core   getaihaosetup(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaosetup_impl",
				"AIHAOSETUP");
        return (com.szty.aihao.impl.aihaosetup_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOSONCLASS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaosonclass_core   getaihaosonclass(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaosonclass_impl",
				"AIHAOSONCLASS");
        return (com.szty.aihao.impl.aihaosonclass_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOSPECIALKEY实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaospecialkey_core   getaihaospecialkey(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaospecialkey_impl",
				"AIHAOSPECIALKEY");
        return (com.szty.aihao.impl.aihaospecialkey_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOTJ实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaotj_core   getaihaotj(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaotj_impl",
				"AIHAOTJ");
        return (com.szty.aihao.impl.aihaotj_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOUPDATETABLE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoupdatetable_core   getaihaoupdatetable(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoupdatetable_impl",
				"AIHAOUPDATETABLE");
        return (com.szty.aihao.impl.aihaoupdatetable_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOUSELOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaouselog_core   getaihaouselog(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaouselog_impl",
				"AIHAOUSELOG");
        return (com.szty.aihao.impl.aihaouselog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOUSERECORD实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaouserecord_core   getaihaouserecord(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaouserecord_impl",
				"AIHAOUSERECORD");
        return (com.szty.aihao.impl.aihaouserecord_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOUSERINFO实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaouserinfo_core   getaihaouserinfo(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaouserinfo_impl",
				"AIHAOUSERINFO");
        return (com.szty.aihao.impl.aihaouserinfo_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOUSERLOGIN实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaouserlogin_core   getaihaouserlogin(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaouserlogin_impl",
				"AIHAOUSERLOGIN");
        return (com.szty.aihao.impl.aihaouserlogin_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOUSERLOGIN_NEW实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaouserlogin_new_core   getaihaouserlogin_new(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaouserlogin_new_impl",
				"AIHAOUSERLOGIN_NEW");
        return (com.szty.aihao.impl.aihaouserlogin_new_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAOVERIFYCODE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihaoverifycode_core   getaihaoverifycode(){
		Object objType = CreateObject("com.szty.aihao.impl.aihaoverifycode_impl",
				"AIHAOVERIFYCODE");
        return (com.szty.aihao.impl.aihaoverifycode_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO_BAIDU_UPDATE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao_baidu_update_core   getaihao_baidu_update(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao_baidu_update_impl",
				"AIHAO_BAIDU_UPDATE");
        return (com.szty.aihao.impl.aihao_baidu_update_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO_NUMBER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao_number_core   getaihao_number(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao_number_impl",
				"AIHAO_NUMBER");
        return (com.szty.aihao.impl.aihao_number_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO_NUMBER_BAK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao_number_bak_core   getaihao_number_bak(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao_number_bak_impl",
				"AIHAO_NUMBER_BAK");
        return (com.szty.aihao.impl.aihao_number_bak_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO_NUMBER_GROUP实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao_number_group_core   getaihao_number_group(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao_number_group_impl",
				"AIHAO_NUMBER_GROUP");
        return (com.szty.aihao.impl.aihao_number_group_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO_NUMBER_GROUP_BAK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao_number_group_bak_core   getaihao_number_group_bak(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao_number_group_bak_impl",
				"AIHAO_NUMBER_GROUP_BAK");
        return (com.szty.aihao.impl.aihao_number_group_bak_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO_TJ_CALLTIME实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao_tj_calltime_core   getaihao_tj_calltime(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao_tj_calltime_impl",
				"AIHAO_TJ_CALLTIME");
        return (com.szty.aihao.impl.aihao_tj_calltime_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO_TJ_PARSE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao_tj_parse_core   getaihao_tj_parse(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao_tj_parse_impl",
				"AIHAO_TJ_PARSE");
        return (com.szty.aihao.impl.aihao_tj_parse_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO_TJ_PARSET实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao_tj_parset_core   getaihao_tj_parset(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao_tj_parset_impl",
				"AIHAO_TJ_PARSET");
        return (com.szty.aihao.impl.aihao_tj_parset_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO_TJ_PARSET_BAK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao_tj_parset_bak_core   getaihao_tj_parset_bak(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao_tj_parset_bak_impl",
				"AIHAO_TJ_PARSET_BAK");
        return (com.szty.aihao.impl.aihao_tj_parset_bak_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO_USER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao_user_core   getaihao_user(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao_user_impl",
				"AIHAO_USER");
        return (com.szty.aihao.impl.aihao_user_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化AIHAO_WEATHERINFO实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.aihao_weatherinfo_core   getaihao_weatherinfo(){
		Object objType = CreateObject("com.szty.aihao.impl.aihao_weatherinfo_impl",
				"AIHAO_WEATHERINFO");
        return (com.szty.aihao.impl.aihao_weatherinfo_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化BUINESS_BAIDU实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.buiness_baidu_core   getbuiness_baidu(){
		Object objType = CreateObject("com.szty.aihao.impl.buiness_baidu_impl",
				"BUINESS_BAIDU");
        return (com.szty.aihao.impl.buiness_baidu_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化CHINA_AREA实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.china_area_core   getchina_area(){
		Object objType = CreateObject("com.szty.aihao.impl.china_area_impl",
				"CHINA_AREA");
        return (com.szty.aihao.impl.china_area_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化CITYS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.citys_core   getcitys(){
		Object objType = CreateObject("com.szty.aihao.impl.citys_impl",
				"CITYS");
        return (com.szty.aihao.impl.citys_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化CITYS_BAK2012实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.citys_bak2012_core   getcitys_bak2012(){
		Object objType = CreateObject("com.szty.aihao.impl.citys_bak2012_impl",
				"CITYS_BAK2012");
        return (com.szty.aihao.impl.citys_bak2012_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化CLIENTUPDATE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.clientupdate_core   getclientupdate(){
		Object objType = CreateObject("com.szty.aihao.impl.clientupdate_impl",
				"CLIENTUPDATE");
        return (com.szty.aihao.impl.clientupdate_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化COMPANYNUMBER实体。
    * @param 
    * @return 
    */
	/*public static  com.szty.aihao.core.companynumber_core   getcompanynumber(){
		Object objType = CreateObject("com.szty.aihao.impl.companynumber_impl",
				"COMPANYNUMBER");
        return (com.szty.aihao.impl.companynumber_impl) objType;
	}*/
	
	/**
    * 通过反射机制，实例化DDINPUT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.ddinput_core   getddinput(){
		Object objType = CreateObject("com.szty.aihao.impl.ddinput_impl",
				"DDINPUT");
        return (com.szty.aihao.impl.ddinput_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化ERRCORRECTTABLE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.errcorrecttable_core   geterrcorrecttable(){
		Object objType = CreateObject("com.szty.aihao.impl.errcorrecttable_impl",
				"ERRCORRECTTABLE");
        return (com.szty.aihao.impl.errcorrecttable_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化EXCEPTION_LOG实体。
    * @param 
    * @return 
    */
	/*public static  com.szty.aihao.core.exception_log_core   getexception_log(){
		Object objType = CreateObject("com.szty.aihao.impl.exception_log_impl",
				"EXCEPTION_LOG");
        return (com.szty.aihao.impl.exception_log_impl) objType;
	}
	*/
	/**
    * 通过反射机制，实例化EXPLEVTABLE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.explevtable_core   getexplevtable(){
		Object objType = CreateObject("com.szty.aihao.impl.explevtable_impl",
				"EXPLEVTABLE");
        return (com.szty.aihao.impl.explevtable_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化EXPRULETABLE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.expruletable_core   getexpruletable(){
		Object objType = CreateObject("com.szty.aihao.impl.expruletable_impl",
				"EXPRULETABLE");
        return (com.szty.aihao.impl.expruletable_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GA实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.ga_core   getga(){
		Object objType = CreateObject("com.szty.aihao.impl.ga_impl",
				"GA");
        return (com.szty.aihao.impl.ga_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GAMEACTIONLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.gameactionlog_core   getgameactionlog(){
		Object objType = CreateObject("com.szty.aihao.impl.gameactionlog_impl",
				"GAMEACTIONLOG");
        return (com.szty.aihao.impl.gameactionlog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GAMECENTERGAME实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.gamecentergame_core   getgamecentergame(){
		Object objType = CreateObject("com.szty.aihao.impl.gamecentergame_impl",
				"GAMECENTERGAME");
        return (com.szty.aihao.impl.gamecentergame_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GAMECENTERGAME_20130327实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.gamecentergame_20130327_core   getgamecentergame_20130327(){
		Object objType = CreateObject("com.szty.aihao.impl.gamecentergame_20130327_impl",
				"GAMECENTERGAME_20130327");
        return (com.szty.aihao.impl.gamecentergame_20130327_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GAMEDOWNLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.gamedownlog_core   getgamedownlog(){
		Object objType = CreateObject("com.szty.aihao.impl.gamedownlog_impl",
				"GAMEDOWNLOG");
        return (com.szty.aihao.impl.gamedownlog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GAMEREQUESTLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.gamerequestlog_core   getgamerequestlog(){
		Object objType = CreateObject("com.szty.aihao.impl.gamerequestlog_impl",
				"GAMEREQUESTLOG");
        return (com.szty.aihao.impl.gamerequestlog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GPUSHLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.gpushlog_core   getgpushlog(){
		Object objType = CreateObject("com.szty.aihao.impl.gpushlog_impl",
				"GPUSHLOG");
        return (com.szty.aihao.impl.gpushlog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GUANJIAN实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.guanjian_core   getguanjian(){
		Object objType = CreateObject("com.szty.aihao.impl.guanjian_impl",
				"GUANJIAN");
        return (com.szty.aihao.impl.guanjian_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GUANJIANNUM实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.guanjiannum_core   getguanjiannum(){
		Object objType = CreateObject("com.szty.aihao.impl.guanjiannum_impl",
				"GUANJIANNUM");
        return (com.szty.aihao.impl.guanjiannum_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GUISHULOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.guishulog_core   getguishulog(){
		Object objType = CreateObject("com.szty.aihao.impl.guishulog_impl",
				"GUISHULOG");
        return (com.szty.aihao.impl.guishulog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GUJIANZI实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.gujianzi_core   getgujianzi(){
		Object objType = CreateObject("com.szty.aihao.impl.gujianzi_impl",
				"GUJIANZI");
        return (com.szty.aihao.impl.gujianzi_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化GUJIANZI_BAK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.gujianzi_bak_core   getgujianzi_bak(){
		Object objType = CreateObject("com.szty.aihao.impl.gujianzi_bak_impl",
				"GUJIANZI_BAK");
        return (com.szty.aihao.impl.gujianzi_bak_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化HLLCLIENTLOGON实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.hllclientlogon_core   gethllclientlogon(){
		Object objType = CreateObject("com.szty.aihao.impl.hllclientlogon_impl",
				"HLLCLIENTLOGON");
        return (com.szty.aihao.impl.hllclientlogon_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化HUANGYE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.huangye_core   gethuangye(){
		Object objType = CreateObject("com.szty.aihao.impl.huangye_impl",
				"HUANGYE");
        return (com.szty.aihao.impl.huangye_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化HUANGYEBAIDU实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.huangyebaidu_core   gethuangyebaidu(){
		Object objType = CreateObject("com.szty.aihao.impl.huangyebaidu_impl",
				"HUANGYEBAIDU");
        return (com.szty.aihao.impl.huangyebaidu_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化HUANGYEBAIDUGL实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.huangyebaidugl_core   gethuangyebaidugl(){
		Object objType = CreateObject("com.szty.aihao.impl.huangyebaidugl_impl",
				"HUANGYEBAIDUGL");
        return (com.szty.aihao.impl.huangyebaidugl_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化HUANGYE_BAK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.huangye_bak_core   gethuangye_bak(){
		Object objType = CreateObject("com.szty.aihao.impl.huangye_bak_impl",
				"HUANGYE_BAK");
        return (com.szty.aihao.impl.huangye_bak_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化IPNUMBER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.ipnumber_core   getipnumber(){
		Object objType = CreateObject("com.szty.aihao.impl.ipnumber_impl",
				"IPNUMBER");
        return (com.szty.aihao.impl.ipnumber_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化JOBMEMBERTABLE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.jobmembertable_core   getjobmembertable(){
		Object objType = CreateObject("com.szty.aihao.impl.jobmembertable_impl",
				"JOBMEMBERTABLE");
        return (com.szty.aihao.impl.jobmembertable_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化JOBTABLE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.jobtable_core   getjobtable(){
		Object objType = CreateObject("com.szty.aihao.impl.jobtable_impl",
				"JOBTABLE");
        return (com.szty.aihao.impl.jobtable_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MOBILEAREAMAP实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mobileareamap_core   getmobileareamap(){
		Object objType = CreateObject("com.szty.aihao.impl.mobileareamap_impl",
				"MOBILEAREAMAP");
        return (com.szty.aihao.impl.mobileareamap_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MOBILEAREAMAP1实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mobileareamap1_core   getmobileareamap1(){
		Object objType = CreateObject("com.szty.aihao.impl.mobileareamap1_impl",
				"MOBILEAREAMAP1");
        return (com.szty.aihao.impl.mobileareamap1_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MOBILEHAOCLASS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mobilehaoclass_core   getmobilehaoclass(){
		Object objType = CreateObject("com.szty.aihao.impl.mobilehaoclass_impl",
				"MOBILEHAOCLASS");
        return (com.szty.aihao.impl.mobilehaoclass_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MOBILETYPE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mobiletype_core   getmobiletype(){
		Object objType = CreateObject("com.szty.aihao.impl.mobiletype_impl",
				"MOBILETYPE");
        return (com.szty.aihao.impl.mobiletype_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMATTACHMENT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumattachment_core   getmvnforumattachment(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumattachment_impl",
				"MVNFORUMATTACHMENT");
        return (com.szty.aihao.impl.mvnforumattachment_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMBLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumblog_core   getmvnforumblog(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumblog_impl",
				"MVNFORUMBLOG");
        return (com.szty.aihao.impl.mvnforumblog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMBLOGFAVORITES实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumblogfavorites_core   getmvnforumblogfavorites(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumblogfavorites_impl",
				"MVNFORUMBLOGFAVORITES");
        return (com.szty.aihao.impl.mvnforumblogfavorites_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMBLOGREVIEW实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumblogreview_core   getmvnforumblogreview(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumblogreview_impl",
				"MVNFORUMBLOGREVIEW");
        return (com.szty.aihao.impl.mvnforumblogreview_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMBOOK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumbook_core   getmvnforumbook(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumbook_impl",
				"MVNFORUMBOOK");
        return (com.szty.aihao.impl.mvnforumbook_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMBOOKCHAPTERS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumbookchapters_core   getmvnforumbookchapters(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumbookchapters_impl",
				"MVNFORUMBOOKCHAPTERS");
        return (com.szty.aihao.impl.mvnforumbookchapters_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMBOOKJAR实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumbookjar_core   getmvnforumbookjar(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumbookjar_impl",
				"MVNFORUMBOOKJAR");
        return (com.szty.aihao.impl.mvnforumbookjar_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMCATEGORY实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumcategory_core   getmvnforumcategory(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumcategory_impl",
				"MVNFORUMCATEGORY");
        return (com.szty.aihao.impl.mvnforumcategory_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMCITY实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumcity_core   getmvnforumcity(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumcity_impl",
				"MVNFORUMCITY");
        return (com.szty.aihao.impl.mvnforumcity_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMCONTACT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumcontact_core   getmvnforumcontact(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumcontact_impl",
				"MVNFORUMCONTACT");
        return (com.szty.aihao.impl.mvnforumcontact_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMDOWNLOADRESLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumdownloadreslog_core   getmvnforumdownloadreslog(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumdownloadreslog_impl",
				"MVNFORUMDOWNLOADRESLOG");
        return (com.szty.aihao.impl.mvnforumdownloadreslog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMEMBEDDEDPAGE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumembeddedpage_core   getmvnforumembeddedpage(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumembeddedpage_impl",
				"MVNFORUMEMBEDDEDPAGE");
        return (com.szty.aihao.impl.mvnforumembeddedpage_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMFAVORITETHREAD实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumfavoritethread_core   getmvnforumfavoritethread(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumfavoritethread_impl",
				"MVNFORUMFAVORITETHREAD");
        return (com.szty.aihao.impl.mvnforumfavoritethread_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMFORUM实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumforum_core   getmvnforumforum(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumforum_impl",
				"MVNFORUMFORUM");
        return (com.szty.aihao.impl.mvnforumforum_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMGAME实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumgame_core   getmvnforumgame(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumgame_impl",
				"MVNFORUMGAME");
        return (com.szty.aihao.impl.mvnforumgame_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMGAMEADAPTER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumgameadapter_core   getmvnforumgameadapter(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumgameadapter_impl",
				"MVNFORUMGAMEADAPTER");
        return (com.szty.aihao.impl.mvnforumgameadapter_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMGROUPFORUM实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumgroupforum_core   getmvnforumgroupforum(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumgroupforum_impl",
				"MVNFORUMGROUPFORUM");
        return (com.szty.aihao.impl.mvnforumgroupforum_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMGROUPPERMISSION实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumgrouppermission_core   getmvnforumgrouppermission(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumgrouppermission_impl",
				"MVNFORUMGROUPPERMISSION");
        return (com.szty.aihao.impl.mvnforumgrouppermission_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMGROUPS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumgroups_core   getmvnforumgroups(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumgroups_impl",
				"MVNFORUMGROUPS");
        return (com.szty.aihao.impl.mvnforumgroups_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMHLLCLIENTLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumhllclientlog_core   getmvnforumhllclientlog(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumhllclientlog_impl",
				"MVNFORUMHLLCLIENTLOG");
        return (com.szty.aihao.impl.mvnforumhllclientlog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMHLLDOWNLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumhlldownlog_core   getmvnforumhlldownlog(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumhlldownlog_impl",
				"MVNFORUMHLLDOWNLOG");
        return (com.szty.aihao.impl.mvnforumhlldownlog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMMEMBER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforummember_core   getmvnforummember(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforummember_impl",
				"MVNFORUMMEMBER");
        return (com.szty.aihao.impl.mvnforummember_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMMEMBERFORUM实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforummemberforum_core   getmvnforummemberforum(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforummemberforum_impl",
				"MVNFORUMMEMBERFORUM");
        return (com.szty.aihao.impl.mvnforummemberforum_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMMEMBERGROUP实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforummembergroup_core   getmvnforummembergroup(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforummembergroup_impl",
				"MVNFORUMMEMBERGROUP");
        return (com.szty.aihao.impl.mvnforummembergroup_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMMEMBERPERMISSION实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforummemberpermission_core   getmvnforummemberpermission(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforummemberpermission_impl",
				"MVNFORUMMEMBERPERMISSION");
        return (com.szty.aihao.impl.mvnforummemberpermission_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMMESSAGE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforummessage_core   getmvnforummessage(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforummessage_impl",
				"MVNFORUMMESSAGE");
        return (com.szty.aihao.impl.mvnforummessage_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMMESSAGEFOLDER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforummessagefolder_core   getmvnforummessagefolder(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforummessagefolder_impl",
				"MVNFORUMMESSAGEFOLDER");
        return (com.szty.aihao.impl.mvnforummessagefolder_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMMESSAGESTATISTICS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforummessagestatistics_core   getmvnforummessagestatistics(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforummessagestatistics_impl",
				"MVNFORUMMESSAGESTATISTICS");
        return (com.szty.aihao.impl.mvnforummessagestatistics_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMMOBILEOS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforummobileos_core   getmvnforummobileos(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforummobileos_impl",
				"MVNFORUMMOBILEOS");
        return (com.szty.aihao.impl.mvnforummobileos_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMNEWS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumnews_core   getmvnforumnews(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumnews_impl",
				"MVNFORUMNEWS");
        return (com.szty.aihao.impl.mvnforumnews_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMOFFLINEMESSAGE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumofflinemessage_core   getmvnforumofflinemessage(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumofflinemessage_impl",
				"MVNFORUMOFFLINEMESSAGE");
        return (com.szty.aihao.impl.mvnforumofflinemessage_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMOFFLINEMESSAGEBACK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumofflinemessageback_core   getmvnforumofflinemessageback(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumofflinemessageback_impl",
				"MVNFORUMOFFLINEMESSAGEBACK");
        return (com.szty.aihao.impl.mvnforumofflinemessageback_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMPAGE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumpage_core   getmvnforumpage(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumpage_impl",
				"MVNFORUMPAGE");
        return (com.szty.aihao.impl.mvnforumpage_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMPAGEELEMENTS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumpageelements_core   getmvnforumpageelements(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumpageelements_impl",
				"MVNFORUMPAGEELEMENTS");
        return (com.szty.aihao.impl.mvnforumpageelements_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMPICTURE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumpicture_core   getmvnforumpicture(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumpicture_impl",
				"MVNFORUMPICTURE");
        return (com.szty.aihao.impl.mvnforumpicture_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMPMATTACHMENT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumpmattachment_core   getmvnforumpmattachment(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumpmattachment_impl",
				"MVNFORUMPMATTACHMENT");
        return (com.szty.aihao.impl.mvnforumpmattachment_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMPMATTACHMESSAGE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumpmattachmessage_core   getmvnforumpmattachmessage(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumpmattachmessage_impl",
				"MVNFORUMPMATTACHMESSAGE");
        return (com.szty.aihao.impl.mvnforumpmattachmessage_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMPOST实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumpost_core   getmvnforumpost(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumpost_impl",
				"MVNFORUMPOST");
        return (com.szty.aihao.impl.mvnforumpost_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMPROVINCE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumprovince_core   getmvnforumprovince(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumprovince_impl",
				"MVNFORUMPROVINCE");
        return (com.szty.aihao.impl.mvnforumprovince_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMQUOTE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumquote_core   getmvnforumquote(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumquote_impl",
				"MVNFORUMQUOTE");
        return (com.szty.aihao.impl.mvnforumquote_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMRANK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumrank_core   getmvnforumrank(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumrank_impl",
				"MVNFORUMRANK");
        return (com.szty.aihao.impl.mvnforumrank_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMRING实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumring_core   getmvnforumring(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumring_impl",
				"MVNFORUMRING");
        return (com.szty.aihao.impl.mvnforumring_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMRINGADAPTER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumringadapter_core   getmvnforumringadapter(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumringadapter_impl",
				"MVNFORUMRINGADAPTER");
        return (com.szty.aihao.impl.mvnforumringadapter_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMSMSFLOWCONTENT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumsmsflowcontent_core   getmvnforumsmsflowcontent(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumsmsflowcontent_impl",
				"MVNFORUMSMSFLOWCONTENT");
        return (com.szty.aihao.impl.mvnforumsmsflowcontent_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMSMSMT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumsmsmt_core   getmvnforumsmsmt(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumsmsmt_impl",
				"MVNFORUMSMSMT");
        return (com.szty.aihao.impl.mvnforumsmsmt_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMSMSPRODUCT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumsmsproduct_core   getmvnforumsmsproduct(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumsmsproduct_impl",
				"MVNFORUMSMSPRODUCT");
        return (com.szty.aihao.impl.mvnforumsmsproduct_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMSMSREPORT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumsmsreport_core   getmvnforumsmsreport(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumsmsreport_impl",
				"MVNFORUMSMSREPORT");
        return (com.szty.aihao.impl.mvnforumsmsreport_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMSOFTWARE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumsoftware_core   getmvnforumsoftware(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumsoftware_impl",
				"MVNFORUMSOFTWARE");
        return (com.szty.aihao.impl.mvnforumsoftware_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMSOFTWAREADAPTER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumsoftwareadapter_core   getmvnforumsoftwareadapter(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumsoftwareadapter_impl",
				"MVNFORUMSOFTWAREADAPTER");
        return (com.szty.aihao.impl.mvnforumsoftwareadapter_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMSYMBLACKLIST实体。
    * @param 
    * @return 
    */
	/*public static  com.szty.aihao.core.mvnforumsymblacklist_core   getmvnforumsymblacklist(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumsymblacklist_impl",
				"MVNFORUMSYMBLACKLIST");
        return (com.szty.aihao.impl.mvnforumsymblacklist_impl) objType;
	}
	*/
	/**
    * 通过反射机制，实例化MVNFORUMSYMBUS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumsymbus_core   getmvnforumsymbus(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumsymbus_impl",
				"MVNFORUMSYMBUS");
        return (com.szty.aihao.impl.mvnforumsymbus_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMSYMCONFIG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumsymconfig_core   getmvnforumsymconfig(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumsymconfig_impl",
				"MVNFORUMSYMCONFIG");
        return (com.szty.aihao.impl.mvnforumsymconfig_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMSYMIMSIIMEI实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumsymimsiimei_core   getmvnforumsymimsiimei(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumsymimsiimei_impl",
				"MVNFORUMSYMIMSIIMEI");
        return (com.szty.aihao.impl.mvnforumsymimsiimei_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMSYMLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumsymlog_core   getmvnforumsymlog(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumsymlog_impl",
				"MVNFORUMSYMLOG");
        return (com.szty.aihao.impl.mvnforumsymlog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMTHREAD实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumthread_core   getmvnforumthread(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumthread_impl",
				"MVNFORUMTHREAD");
        return (com.szty.aihao.impl.mvnforumthread_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMVIDEO实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumvideo_core   getmvnforumvideo(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumvideo_impl",
				"MVNFORUMVIDEO");
        return (com.szty.aihao.impl.mvnforumvideo_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMWALLPAPER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumwallpaper_core   getmvnforumwallpaper(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumwallpaper_impl",
				"MVNFORUMWALLPAPER");
        return (com.szty.aihao.impl.mvnforumwallpaper_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMWALLPAPERADAPTER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumwallpaperadapter_core   getmvnforumwallpaperadapter(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumwallpaperadapter_impl",
				"MVNFORUMWALLPAPERADAPTER");
        return (com.szty.aihao.impl.mvnforumwallpaperadapter_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化MVNFORUMWATCH实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.mvnforumwatch_core   getmvnforumwatch(){
		Object objType = CreateObject("com.szty.aihao.impl.mvnforumwatch_impl",
				"MVNFORUMWATCH");
        return (com.szty.aihao.impl.mvnforumwatch_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化NEWS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.news_core   getnews(){
		Object objType = CreateObject("com.szty.aihao.impl.news_impl",
				"NEWS");
        return (com.szty.aihao.impl.news_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化OSMOBILE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.osmobile_core   getosmobile(){
		Object objType = CreateObject("com.szty.aihao.impl.osmobile_impl",
				"OSMOBILE");
        return (com.szty.aihao.impl.osmobile_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化PHONEAREAMAP实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.phoneareamap_core   getphoneareamap(){
		Object objType = CreateObject("com.szty.aihao.impl.phoneareamap_impl",
				"PHONEAREAMAP");
        return (com.szty.aihao.impl.phoneareamap_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化PPTMPTABLE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.pptmptable_core   getpptmptable(){
		Object objType = CreateObject("com.szty.aihao.impl.pptmptable_impl",
				"PPTMPTABLE");
        return (com.szty.aihao.impl.pptmptable_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化PREFIXCITYS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.prefixcitys_core   getprefixcitys(){
		Object objType = CreateObject("com.szty.aihao.impl.prefixcitys_impl",
				"PREFIXCITYS");
        return (com.szty.aihao.impl.prefixcitys_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化PROVINCES实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.provinces_core   getprovinces(){
		Object objType = CreateObject("com.szty.aihao.impl.provinces_impl",
				"PROVINCES");
        return (com.szty.aihao.impl.provinces_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SCLTEST实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.scltest_core   getscltest(){
		Object objType = CreateObject("com.szty.aihao.impl.scltest_impl",
				"SCLTEST");
        return (com.szty.aihao.impl.scltest_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SEARCHKEYWORDS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.searchkeywords_core   getsearchkeywords(){
		Object objType = CreateObject("com.szty.aihao.impl.searchkeywords_impl",
				"SEARCHKEYWORDS");
        return (com.szty.aihao.impl.searchkeywords_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYCONTACT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztycontact_core   getsztycontact(){
		Object objType = CreateObject("com.szty.aihao.impl.sztycontact_impl",
				"SZTYCONTACT");
        return (com.szty.aihao.impl.sztycontact_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYCONTACTGROUP实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztycontactgroup_core   getsztycontactgroup(){
		Object objType = CreateObject("com.szty.aihao.impl.sztycontactgroup_impl",
				"SZTYCONTACTGROUP");
        return (com.szty.aihao.impl.sztycontactgroup_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYDEPARTMENT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztydepartment_core   getsztydepartment(){
		Object objType = CreateObject("com.szty.aihao.impl.sztydepartment_impl",
				"SZTYDEPARTMENT");
        return (com.szty.aihao.impl.sztydepartment_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYEMPLOYEE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztyemployee_core   getsztyemployee(){
		Object objType = CreateObject("com.szty.aihao.impl.sztyemployee_impl",
				"SZTYEMPLOYEE");
        return (com.szty.aihao.impl.sztyemployee_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYFEEDBACK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztyfeedback_core   getsztyfeedback(){
		Object objType = CreateObject("com.szty.aihao.impl.sztyfeedback_impl",
				"SZTYFEEDBACK");
        return (com.szty.aihao.impl.sztyfeedback_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYINSTALLINFO实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztyinstallinfo_core   getsztyinstallinfo(){
		Object objType = CreateObject("com.szty.aihao.impl.sztyinstallinfo_impl",
				"SZTYINSTALLINFO");
        return (com.szty.aihao.impl.sztyinstallinfo_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYPURVIEW实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztypurview_core   getsztypurview(){
		Object objType = CreateObject("com.szty.aihao.impl.sztypurview_impl",
				"SZTYPURVIEW");
        return (com.szty.aihao.impl.sztypurview_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYUSER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztyuser_core   getsztyuser(){
		Object objType = CreateObject("com.szty.aihao.impl.sztyuser_impl",
				"SZTYUSER");
        return (com.szty.aihao.impl.sztyuser_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYUSERINFO实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztyuserinfo_core   getsztyuserinfo(){
		Object objType = CreateObject("com.szty.aihao.impl.sztyuserinfo_impl",
				"SZTYUSERINFO");
        return (com.szty.aihao.impl.sztyuserinfo_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYUSERLOGINLOG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztyuserloginlog_core   getsztyuserloginlog(){
		Object objType = CreateObject("com.szty.aihao.impl.sztyuserloginlog_impl",
				"SZTYUSERLOGINLOG");
        return (com.szty.aihao.impl.sztyuserloginlog_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYUSERSTATUS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztyuserstatus_core   getsztyuserstatus(){
		Object objType = CreateObject("com.szty.aihao.impl.sztyuserstatus_impl",
				"SZTYUSERSTATUS");
        return (com.szty.aihao.impl.sztyuserstatus_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTYVERIFY实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.sztyverify_core   getsztyverify(){
		Object objType = CreateObject("com.szty.aihao.impl.sztyverify_impl",
				"SZTYVERIFY");
        return (com.szty.aihao.impl.sztyverify_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化SZTY_EMP_PUR实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.szty_emp_pur_core   getszty_emp_pur(){
		Object objType = CreateObject("com.szty.aihao.impl.szty_emp_pur_impl",
				"SZTY_EMP_PUR");
        return (com.szty.aihao.impl.szty_emp_pur_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEMP_AAA实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.temp_aaa_core   gettemp_aaa(){
		Object objType = CreateObject("com.szty.aihao.impl.temp_aaa_impl",
				"TEMP_AAA");
        return (com.szty.aihao.impl.temp_aaa_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEMP_AAA_BAK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.temp_aaa_bak_core   gettemp_aaa_bak(){
		Object objType = CreateObject("com.szty.aihao.impl.temp_aaa_bak_impl",
				"TEMP_AAA_BAK");
        return (com.szty.aihao.impl.temp_aaa_bak_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEST_CHAR实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.test_char_core   gettest_char(){
		Object objType = CreateObject("com.szty.aihao.impl.test_char_impl",
				"TEST_CHAR");
        return (com.szty.aihao.impl.test_char_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEST_COL_ROW实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.test_col_row_core   gettest_col_row(){
		Object objType = CreateObject("com.szty.aihao.impl.test_col_row_impl",
				"TEST_COL_ROW");
        return (com.szty.aihao.impl.test_col_row_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEST_NCHAR实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.test_nchar_core   gettest_nchar(){
		Object objType = CreateObject("com.szty.aihao.impl.test_nchar_impl",
				"TEST_NCHAR");
        return (com.szty.aihao.impl.test_nchar_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEST_QY_1206实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.test_qy_1206_core   gettest_qy_1206(){
		Object objType = CreateObject("com.szty.aihao.impl.test_qy_1206_impl",
				"TEST_QY_1206");
        return (com.szty.aihao.impl.test_qy_1206_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEST_QY_1206_BAK实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.test_qy_1206_bak_core   gettest_qy_1206_bak(){
		Object objType = CreateObject("com.szty.aihao.impl.test_qy_1206_bak_impl",
				"TEST_QY_1206_BAK");
        return (com.szty.aihao.impl.test_qy_1206_bak_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEST_QY_APP_6001实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.test_qy_app_6001_core   gettest_qy_app_6001(){
		Object objType = CreateObject("com.szty.aihao.impl.test_qy_app_6001_impl",
				"TEST_QY_APP_6001");
        return (com.szty.aihao.impl.test_qy_app_6001_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEST_QY_DD实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.test_qy_dd_core   gettest_qy_dd(){
		Object objType = CreateObject("com.szty.aihao.impl.test_qy_dd_impl",
				"TEST_QY_DD");
        return (com.szty.aihao.impl.test_qy_dd_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEST_QY_ROM_SETUP实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.test_qy_rom_setup_core   gettest_qy_rom_setup(){
		Object objType = CreateObject("com.szty.aihao.impl.test_qy_rom_setup_impl",
				"TEST_QY_ROM_SETUP");
        return (com.szty.aihao.impl.test_qy_rom_setup_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEST_ROWID实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.test_rowid_core   gettest_rowid(){
		Object objType = CreateObject("com.szty.aihao.impl.test_rowid_impl",
				"TEST_ROWID");
        return (com.szty.aihao.impl.test_rowid_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TEST_VARCHAR实体。
    * @param 
    * @return 
    */
	/*public static  com.szty.aihao.core.test_varchar_core   gettest_varchar(){
		Object objType = CreateObject("com.szty.aihao.impl.test_varchar_impl",
				"TEST_VARCHAR");
        return (com.szty.aihao.impl.test_varchar_impl) objType;
	}*/
	
	/**
    * 通过反射机制，实例化TJ_AIHAO_POINT_TYPE实体。
    * @param 
    * @return 
    */
	/*public static  com.szty.aihao.core.tj_aihao_point_type_core   gettj_aihao_point_type(){
		Object objType = CreateObject("com.szty.aihao.impl.tj_aihao_point_type_impl",
				"TJ_AIHAO_POINT_TYPE");
        return (com.szty.aihao.impl.tj_aihao_point_type_impl) objType;
	}*/
	
	/**
    * 通过反射机制，实例化TJ_AIHAO_STAT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tj_aihao_stat_core   gettj_aihao_stat(){
		Object objType = CreateObject("com.szty.aihao.impl.tj_aihao_stat_impl",
				"TJ_AIHAO_STAT");
        return (com.szty.aihao.impl.tj_aihao_stat_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TJ_AIHAO_STAT_NEW实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tj_aihao_stat_new_core   gettj_aihao_stat_new(){
		Object objType = CreateObject("com.szty.aihao.impl.tj_aihao_stat_new_impl",
				"TJ_AIHAO_STAT_NEW");
        return (com.szty.aihao.impl.tj_aihao_stat_new_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TJ_AIHAO_STAT_TMP实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tj_aihao_stat_tmp_core   gettj_aihao_stat_tmp(){
		Object objType = CreateObject("com.szty.aihao.impl.tj_aihao_stat_tmp_impl",
				"TJ_AIHAO_STAT_TMP");
        return (com.szty.aihao.impl.tj_aihao_stat_tmp_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TJ_AIHAO_STAT_TMP1实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tj_aihao_stat_tmp1_core   gettj_aihao_stat_tmp1(){
		Object objType = CreateObject("com.szty.aihao.impl.tj_aihao_stat_tmp1_impl",
				"TJ_AIHAO_STAT_TMP1");
        return (com.szty.aihao.impl.tj_aihao_stat_tmp1_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TJ_HUOYUE_USER实体。
    * @param 
    * @return 
    */
	/*public static  com.szty.aihao.core.tj_huoyue_user_core   gettj_huoyue_user(){
		Object objType = CreateObject("com.szty.aihao.impl.tj_huoyue_user_impl",
				"TJ_HUOYUE_USER");
        return (com.szty.aihao.impl.tj_huoyue_user_impl) objType;
	}*/
	
	/**
    * 通过反射机制，实例化TMP_DZ_1101_JH_121011实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_1101_jh_121011_core   gettmp_dz_1101_jh_121011(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_1101_jh_121011_impl",
				"TMP_DZ_1101_JH_121011");
        return (com.szty.aihao.impl.tmp_dz_1101_jh_121011_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_1101_JH_GGG实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_1101_jh_ggg_core   gettmp_dz_1101_jh_ggg(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_1101_jh_ggg_impl",
				"TMP_DZ_1101_JH_GGG");
        return (com.szty.aihao.impl.tmp_dz_1101_jh_ggg_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_1101_ZC_121011实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_1101_zc_121011_core   gettmp_dz_1101_zc_121011(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_1101_zc_121011_impl",
				"TMP_DZ_1101_ZC_121011");
        return (com.szty.aihao.impl.tmp_dz_1101_zc_121011_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_1106_JH_121011实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_1106_jh_121011_core   gettmp_dz_1106_jh_121011(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_1106_jh_121011_impl",
				"TMP_DZ_1106_JH_121011");
        return (com.szty.aihao.impl.tmp_dz_1106_jh_121011_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_1106_ZC_121011实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_1106_zc_121011_core   gettmp_dz_1106_zc_121011(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_1106_zc_121011_impl",
				"TMP_DZ_1106_ZC_121011");
        return (com.szty.aihao.impl.tmp_dz_1106_zc_121011_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_120823_JH实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_120823_jh_core   gettmp_dz_120823_jh(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_120823_jh_impl",
				"TMP_DZ_120823_JH");
        return (com.szty.aihao.impl.tmp_dz_120823_jh_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_120823_ZC7实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_120823_zc7_core   gettmp_dz_120823_zc7(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_120823_zc7_impl",
				"TMP_DZ_120823_ZC7");
        return (com.szty.aihao.impl.tmp_dz_120823_zc7_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_120823_ZC8实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_120823_zc8_core   gettmp_dz_120823_zc8(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_120823_zc8_impl",
				"TMP_DZ_120823_ZC8");
        return (com.szty.aihao.impl.tmp_dz_120823_zc8_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_120824_ZC实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_120824_zc_core   gettmp_dz_120824_zc(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_120824_zc_impl",
				"TMP_DZ_120824_ZC");
        return (com.szty.aihao.impl.tmp_dz_120824_zc_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_120909_JH实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_120909_jh_core   gettmp_dz_120909_jh(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_120909_jh_impl",
				"TMP_DZ_120909_JH");
        return (com.szty.aihao.impl.tmp_dz_120909_jh_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_120909_ZC8实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_120909_zc8_core   gettmp_dz_120909_zc8(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_120909_zc8_impl",
				"TMP_DZ_120909_ZC8");
        return (com.szty.aihao.impl.tmp_dz_120909_zc8_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_121008_LY实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_121008_ly_core   gettmp_dz_121008_ly(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_121008_ly_impl",
				"TMP_DZ_121008_LY");
        return (com.szty.aihao.impl.tmp_dz_121008_ly_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_121008_ML实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_121008_ml_core   gettmp_dz_121008_ml(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_121008_ml_impl",
				"TMP_DZ_121008_ML");
        return (com.szty.aihao.impl.tmp_dz_121008_ml_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_121008_WM实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_121008_wm_core   gettmp_dz_121008_wm(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_121008_wm_impl",
				"TMP_DZ_121008_WM");
        return (com.szty.aihao.impl.tmp_dz_121008_wm_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_121008_WM_ME实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_121008_wm_me_core   gettmp_dz_121008_wm_me(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_121008_wm_me_impl",
				"TMP_DZ_121008_WM_ME");
        return (com.szty.aihao.impl.tmp_dz_121008_wm_me_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_121008_YES实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_121008_yes_core   gettmp_dz_121008_yes(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_121008_yes_impl",
				"TMP_DZ_121008_YES");
        return (com.szty.aihao.impl.tmp_dz_121008_yes_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_121008_ZR实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_121008_zr_core   gettmp_dz_121008_zr(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_121008_zr_impl",
				"TMP_DZ_121008_ZR");
        return (com.szty.aihao.impl.tmp_dz_121008_zr_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TMP_DZ_RESULT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.tmp_dz_result_core   gettmp_dz_result(){
		Object objType = CreateObject("com.szty.aihao.impl.tmp_dz_result_impl",
				"TMP_DZ_RESULT");
        return (com.szty.aihao.impl.tmp_dz_result_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TWITTERCOLLECT实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.twittercollect_core   gettwittercollect(){
		Object objType = CreateObject("com.szty.aihao.impl.twittercollect_impl",
				"TWITTERCOLLECT");
        return (com.szty.aihao.impl.twittercollect_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TWITTERCONCERN实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.twitterconcern_core   gettwitterconcern(){
		Object objType = CreateObject("com.szty.aihao.impl.twitterconcern_impl",
				"TWITTERCONCERN");
        return (com.szty.aihao.impl.twitterconcern_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TWITTERFRIENDS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.twitterfriends_core   gettwitterfriends(){
		Object objType = CreateObject("com.szty.aihao.impl.twitterfriends_impl",
				"TWITTERFRIENDS");
        return (com.szty.aihao.impl.twitterfriends_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TWITTERMESSAGE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.twittermessage_core   gettwittermessage(){
		Object objType = CreateObject("com.szty.aihao.impl.twittermessage_impl",
				"TWITTERMESSAGE");
        return (com.szty.aihao.impl.twittermessage_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TWITTERPHOTO实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.twitterphoto_core   gettwitterphoto(){
		Object objType = CreateObject("com.szty.aihao.impl.twitterphoto_impl",
				"TWITTERPHOTO");
        return (com.szty.aihao.impl.twitterphoto_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TWITTERSHARE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.twittershare_core   gettwittershare(){
		Object objType = CreateObject("com.szty.aihao.impl.twittershare_impl",
				"TWITTERSHARE");
        return (com.szty.aihao.impl.twittershare_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TWITTERTOPICS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.twittertopics_core   gettwittertopics(){
		Object objType = CreateObject("com.szty.aihao.impl.twittertopics_impl",
				"TWITTERTOPICS");
        return (com.szty.aihao.impl.twittertopics_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化TWITTERUSER实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.twitteruser_core   gettwitteruser(){
		Object objType = CreateObject("com.szty.aihao.impl.twitteruser_impl",
				"TWITTERUSER");
        return (com.szty.aihao.impl.twitteruser_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化T_MENBER_EXPRVALUE实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.t_menber_exprvalue_core   gett_menber_exprvalue(){
		Object objType = CreateObject("com.szty.aihao.impl.t_menber_exprvalue_impl",
				"T_MENBER_EXPRVALUE");
        return (com.szty.aihao.impl.t_menber_exprvalue_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化T_MENBER_EXPRVALUE_DETAIL实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.t_menber_exprvalue_detail_core   gett_menber_exprvalue_detail(){
		Object objType = CreateObject("com.szty.aihao.impl.t_menber_exprvalue_detail_impl",
				"T_MENBER_EXPRVALUE_DETAIL");
        return (com.szty.aihao.impl.t_menber_exprvalue_detail_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化T_PTYPE_INFO实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.t_ptype_info_core   gett_ptype_info(){
		Object objType = CreateObject("com.szty.aihao.impl.t_ptype_info_impl",
				"T_PTYPE_INFO");
        return (com.szty.aihao.impl.t_ptype_info_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化T_QY_130116实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.t_qy_130116_core   gett_qy_130116(){
		Object objType = CreateObject("com.szty.aihao.impl.t_qy_130116_impl",
				"T_QY_130116");
        return (com.szty.aihao.impl.t_qy_130116_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化T_QY_130222实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.t_qy_130222_core   gett_qy_130222(){
		Object objType = CreateObject("com.szty.aihao.impl.t_qy_130222_impl",
				"T_QY_130222");
        return (com.szty.aihao.impl.t_qy_130222_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化T_QY_130408实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.t_qy_130408_core   gett_qy_130408(){
		Object objType = CreateObject("com.szty.aihao.impl.t_qy_130408_impl",
				"T_QY_130408");
        return (com.szty.aihao.impl.t_qy_130408_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化T_STAT_WEEKLY实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.t_stat_weekly_core   gett_stat_weekly(){
		Object objType = CreateObject("com.szty.aihao.impl.t_stat_weekly_impl",
				"T_STAT_WEEKLY");
        return (com.szty.aihao.impl.t_stat_weekly_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化T_STAT_WEEKLY2实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.t_stat_weekly2_core   gett_stat_weekly2(){
		Object objType = CreateObject("com.szty.aihao.impl.t_stat_weekly2_impl",
				"T_STAT_WEEKLY2");
        return (com.szty.aihao.impl.t_stat_weekly2_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化T_STAT_WEEKLY3实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.t_stat_weekly3_core   gett_stat_weekly3(){
		Object objType = CreateObject("com.szty.aihao.impl.t_stat_weekly3_impl",
				"T_STAT_WEEKLY3");
        return (com.szty.aihao.impl.t_stat_weekly3_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化T_USER_CHAN实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.t_user_chan_core   gett_user_chan(){
		Object objType = CreateObject("com.szty.aihao.impl.t_user_chan_impl",
				"T_USER_CHAN");
        return (com.szty.aihao.impl.t_user_chan_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化URLHAO实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.urlhao_core   geturlhao(){
		Object objType = CreateObject("com.szty.aihao.impl.urlhao_impl",
				"URLHAO");
        return (com.szty.aihao.impl.urlhao_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化USERREQUEST实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.userrequest_core   getuserrequest(){
		Object objType = CreateObject("com.szty.aihao.impl.userrequest_impl",
				"USERREQUEST");
        return (com.szty.aihao.impl.userrequest_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化UTILHAOCLASS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.utilhaoclass_core   getutilhaoclass(){
		Object objType = CreateObject("com.szty.aihao.impl.utilhaoclass_impl",
				"UTILHAOCLASS");
        return (com.szty.aihao.impl.utilhaoclass_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化WAPHAOCLASS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.waphaoclass_core   getwaphaoclass(){
		Object objType = CreateObject("com.szty.aihao.impl.waphaoclass_impl",
				"WAPHAOCLASS");
        return (com.szty.aihao.impl.waphaoclass_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化WEBHAOCLASS实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.webhaoclass_core   getwebhaoclass(){
		Object objType = CreateObject("com.szty.aihao.impl.webhaoclass_impl",
				"WEBHAOCLASS");
        return (com.szty.aihao.impl.webhaoclass_impl) objType;
	}
	
	/**
    * 通过反射机制，实例化WINLIST实体。
    * @param 
    * @return 
    */
	public static  com.szty.aihao.core.winlist_core   getwinlist(){
		Object objType = CreateObject("com.szty.aihao.impl.winlist_impl",
				"WINLIST");
        return (com.szty.aihao.impl.winlist_impl) objType;
	}
	
 
	/**
    * 通过反射机制，实例化A实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.aihaoinstallinfo_view_core   getaihaoinstallinfo_view(){
	//	Object objType = CreateObject("com.szty.aihao.impl.aihaoinstallinfo_view_impl",
	//			"AIHAOINSTALLINFO_VIEW");
  //      return (com.szty.aihao.impl.aihaoinstallinfo_view_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AAA实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.aihaosearchrecord_view_core   getaihaosearchrecord_view(){
	//	Object objType = CreateObject("com.szty.aihao.impl.aihaosearchrecord_view_impl",
	//			"AIHAOSEARCHRECORD_VIEW");
  //      return (com.szty.aihao.impl.aihaosearchrecord_view_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AAACE实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.aihaosearchrecord_view2_core   getaihaosearchrecord_view2(){
	//	Object objType = CreateObject("com.szty.aihao.impl.aihaosearchrecord_view2_impl",
	//			"AIHAOSEARCHRECORD_VIEW2");
  //      return (com.szty.aihao.impl.aihaosearchrecord_view2_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO10实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.aihaouselog_view_core   getaihaouselog_view(){
	//	Object objType = CreateObject("com.szty.aihao.impl.aihaouselog_view_impl",
	//			"AIHAOUSELOG_VIEW");
  //      return (com.szty.aihao.impl.aihaouselog_view_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO10_20140409BAK实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.aihaouserinfo_veiw_core   getaihaouserinfo_veiw(){
	//	Object objType = CreateObject("com.szty.aihao.impl.aihaouserinfo_veiw_impl",
	//			"AIHAOUSERINFO_VEIW");
  //      return (com.szty.aihao.impl.aihaouserinfo_veiw_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO10_BAIDU_UPDATE实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.aihaouserlogin_new_veiw_core   getaihaouserlogin_new_veiw(){
	//	Object objType = CreateObject("com.szty.aihao.impl.aihaouserlogin_new_veiw_impl",
	//			"AIHAOUSERLOGIN_NEW_VEIW");
  //      return (com.szty.aihao.impl.aihaouserlogin_new_veiw_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO10_BAK20121129实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.aihao_install_des_view_core   getaihao_install_des_view(){
	//	Object objType = CreateObject("com.szty.aihao.impl.aihao_install_des_view_impl",
	//			"AIHAO_INSTALL_DES_VIEW");
  //      return (com.szty.aihao.impl.aihao_install_des_view_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO10_DDYH实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.aihao_install_src_view_core   getaihao_install_src_view(){
	//	Object objType = CreateObject("com.szty.aihao.impl.aihao_install_src_view_impl",
	//			"AIHAO_INSTALL_SRC_VIEW");
  //      return (com.szty.aihao.impl.aihao_install_src_view_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO11实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.tj_aihao_use_view_core   gettj_aihao_use_view(){
	//	Object objType = CreateObject("com.szty.aihao.impl.tj_aihao_use_view_impl",
	//			"TJ_AIHAO_USE_VIEW");
  //      return (com.szty.aihao.impl.tj_aihao_use_view_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO11_DDYH实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.tj_install_aihao_src_view_core   gettj_install_aihao_src_view(){
	//	Object objType = CreateObject("com.szty.aihao.impl.tj_install_aihao_src_view_impl",
	//			"TJ_INSTALL_AIHAO_SRC_VIEW");
  //      return (com.szty.aihao.impl.tj_install_aihao_src_view_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO12实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.tj_install_aihao_view_core   gettj_install_aihao_view(){
	//	Object objType = CreateObject("com.szty.aihao.impl.tj_install_aihao_view_impl",
	//			"TJ_INSTALL_AIHAO_VIEW");
  //      return (com.szty.aihao.impl.tj_install_aihao_view_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO13实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.tj_register_aihao_view_core   gettj_register_aihao_view(){
	//	Object objType = CreateObject("com.szty.aihao.impl.tj_register_aihao_view_impl",
	//			"TJ_REGISTER_AIHAO_VIEW");
  //      return (com.szty.aihao.impl.tj_register_aihao_view_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO14实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_aihaosetup_core   getv_aihaosetup(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_aihaosetup_impl",
	//			"V_AIHAOSETUP");
  //      return (com.szty.aihao.impl.v_aihaosetup_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO15实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_aihaotj_core   getv_aihaotj(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_aihaotj_impl",
	//			"V_AIHAOTJ");
  //      return (com.szty.aihao.impl.v_aihaotj_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO16实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_setup_all_core   getv_setup_all(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_setup_all_impl",
	//			"V_SETUP_ALL");
  //      return (com.szty.aihao.impl.v_setup_all_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO17实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_act_join_core   getv_stat_act_join(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_act_join_impl",
	//			"V_STAT_ACT_JOIN");
  //      return (com.szty.aihao.impl.v_stat_act_join_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO18实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_act_join_dtl_core   getv_stat_act_join_dtl(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_act_join_dtl_impl",
	//			"V_STAT_ACT_JOIN_DTL");
  //      return (com.szty.aihao.impl.v_stat_act_join_dtl_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO18_20140409BAK实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_chanin_core   getv_stat_chanin(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_chanin_impl",
	//			"V_STAT_CHANIN");
  //      return (com.szty.aihao.impl.v_stat_chanin_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO18_BAIDU_UPDATE实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_chanpop_core   getv_stat_chanpop(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_chanpop_impl",
	//			"V_STAT_CHANPOP");
  //      return (com.szty.aihao.impl.v_stat_chanpop_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO19实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_chanpop_cg_core   getv_stat_chanpop_cg(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_chanpop_cg_impl",
	//			"V_STAT_CHANPOP_CG");
  //      return (com.szty.aihao.impl.v_stat_chanpop_cg_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO20实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_chanpop_usr_core   getv_stat_chanpop_usr(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_chanpop_usr_impl",
	//			"V_STAT_CHANPOP_USR");
  //      return (com.szty.aihao.impl.v_stat_chanpop_usr_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO21实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_collect_core   getv_stat_collect(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_collect_impl",
	//			"V_STAT_COLLECT");
  //      return (com.szty.aihao.impl.v_stat_collect_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO22实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_history_core   getv_stat_history(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_history_impl",
	//			"V_STAT_HISTORY");
  //      return (com.szty.aihao.impl.v_stat_history_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO23实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_hotsearch_core   getv_stat_hotsearch(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_hotsearch_impl",
	//			"V_STAT_HOTSEARCH");
  //      return (com.szty.aihao.impl.v_stat_hotsearch_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO24实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_keysearch_core   getv_stat_keysearch(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_keysearch_impl",
	//			"V_STAT_KEYSEARCH");
  //      return (com.szty.aihao.impl.v_stat_keysearch_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO25实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_numnormal_core   getv_stat_numnormal(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_numnormal_impl",
	//			"V_STAT_NUMNORMAL");
  //      return (com.szty.aihao.impl.v_stat_numnormal_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO26实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_numsearch_core   getv_stat_numsearch(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_numsearch_impl",
	//			"V_STAT_NUMSEARCH");
  //      return (com.szty.aihao.impl.v_stat_numsearch_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO27实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_personc_core   getv_stat_personc(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_personc_impl",
	//			"V_STAT_PERSONC");
  //      return (com.szty.aihao.impl.v_stat_personc_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO28实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_prov_core   getv_stat_prov(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_prov_impl",
	//			"V_STAT_PROV");
  //      return (com.szty.aihao.impl.v_stat_prov_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO29实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_prov_usenum_core   getv_stat_prov_usenum(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_prov_usenum_impl",
	//			"V_STAT_PROV_USENUM");
  //      return (com.szty.aihao.impl.v_stat_prov_usenum_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO30实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_rsv_core   getv_stat_rsv(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_rsv_impl",
	//			"V_STAT_RSV");
  //      return (com.szty.aihao.impl.v_stat_rsv_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO31实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_shop_core   getv_stat_shop(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_shop_impl",
	//			"V_STAT_SHOP");
  //      return (com.szty.aihao.impl.v_stat_shop_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO32实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_shopsearch_core   getv_stat_shopsearch(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_shopsearch_impl",
	//			"V_STAT_SHOPSEARCH");
  //      return (com.szty.aihao.impl.v_stat_shopsearch_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO32TMP实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_task_core   getv_stat_task(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_task_impl",
	//			"V_STAT_TASK");
  //      return (com.szty.aihao.impl.v_stat_task_impl) objType;
	//}
	/**
	    * 通过反射机制，实例化SC_ADMIN实体。
	    * @param 
	    * @return 
	    */
		public static  com.szty.aihao.core.sc_admin_core   getsc_admin(){
			Object objType = CreateObject("com.szty.aihao.impl.sc_admin_impl",
					"SC_ADMIN");
	        return (com.szty.aihao.impl.sc_admin_impl) objType;
		}
	
	/**
    * 通过反射机制，实例化AIHAO33实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_toll_core   getv_stat_toll(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_toll_impl",
	//			"V_STAT_TOLL");
  //      return (com.szty.aihao.impl.v_stat_toll_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO34实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_toll_chanactive_core   getv_stat_toll_chanactive(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_toll_chanactive_impl",
	//			"V_STAT_TOLL_CHANACTIVE");
  //      return (com.szty.aihao.impl.v_stat_toll_chanactive_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO35实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_toll_chanuser_core   getv_stat_toll_chanuser(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_toll_chanuser_impl",
	//			"V_STAT_TOLL_CHANUSER");
  //      return (com.szty.aihao.impl.v_stat_toll_chanuser_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO36实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_typehit_core   getv_stat_typehit(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_typehit_impl",
	//			"V_STAT_TYPEHIT");
  //      return (com.szty.aihao.impl.v_stat_typehit_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO37实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_stat_userresv_core   getv_stat_userresv(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_stat_userresv_impl",
	//			"V_STAT_USERRESV");
  //      return (com.szty.aihao.impl.v_stat_userresv_impl) objType;
	//}
	
	
	/**
    * 通过反射机制，实例化AIHAO38实体。
    * @param 
    * @return 
    */
  //  public static  com.szty.aihao.core.v_test_core   getv_test(){
	//	Object objType = CreateObject("com.szty.aihao.impl.v_test_impl",
	//			"V_TEST");
  //      return (com.szty.aihao.impl.v_test_impl) objType;
	//}
	
	
	/**
	    * 通过反射机制，实例化FITWEAR_APP实体。
	    * @param 
	    * @return 
	    */
		public static  com.szty.aihao.core.fitwear_app_core   getfitwear_app(){
			Object objType = CreateObject("com.szty.aihao.impl.fitwear_app_impl",
					"FITWEAR_APP");
	        return (com.szty.aihao.impl.fitwear_app_impl) objType;
		}
		/**
		    * 通过反射机制，实例化SC_CATEGORY实体。
		    * @param 
		    * @return 
		    */
			public static  com.szty.aihao.core.sc_category_core   getsc_category(){
				Object objType = CreateObject("com.szty.aihao.impl.sc_category_impl",
						"SC_CATEGORY");
		        return (com.szty.aihao.impl.sc_category_impl) objType;
			}
}

