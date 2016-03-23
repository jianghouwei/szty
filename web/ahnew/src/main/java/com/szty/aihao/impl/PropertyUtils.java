/*
 *@===================================================================
 *@项目说明
 *@作??：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件??PropertyUtils.java
 *@项目名称：JAVA项目管理
 *@创建时间??014-2-26
 *@===================================================================
 */
package com.szty.aihao.impl;


import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2010-4-23
 * Time: 18:02:11
 * To change this template use File | Settings | File Templates.
 */
public class PropertyUtils {
    private Properties pro = new Properties();
    private static PropertyUtils propertyUtils = new PropertyUtils();
    private static Logger log = Logger.getLogger(PropertyUtils.class);

    private PropertyUtils() {
        try {
            pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("system.properties"));
        } catch (IOException e) {
            log.error(e);
            throw new RuntimeException(e.getMessage());
        } finally {
        }
    }

    public static PropertyUtils getInstance(){
           return propertyUtils;
    }

    public static  String getValue(String key) {
            return (String)getInstance(). pro.get(key);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getValue("IdleConnectionTestPeriod"));
    }

}



