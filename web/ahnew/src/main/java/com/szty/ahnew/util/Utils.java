package com.szty.ahnew.util;

public final class Utils {

	public static boolean isEmpty(Object str) {
		return (str == null || "".equals(str));
	}

	/**
	 * 比较归类字符串，前者是否属于后者
	 * @Title: isEquals
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @return 设定文件
	 * @return boolean 返回类型
	 * @throws
	 */
	public static boolean isEquals(String s, String e) {
		if(s.equals(e.substring(0, s.length()))){
			return true;
		}
		return false;

	}
	
	public static void main(String[] args) {
		System.out.println(isEquals("你","你"));
	}
}
