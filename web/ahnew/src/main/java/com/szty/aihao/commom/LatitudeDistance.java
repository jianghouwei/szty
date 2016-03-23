package com.szty.aihao.commom;

public class LatitudeDistance {
	private static double EARTH_RADIUS = 6378.137;

	private static double rad(double d) {
		return d * Math.PI / 180.0;
	}

	public static double GetDistance(double lat1, double lng1, double lat2,
			double lng2) {
		double radLat1 = rad(lat1);
		double radLat2 = rad(lat2);
		double a = radLat1 - radLat2;
		double b = rad(lng1) - rad(lng2);
		double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
				+ Math.cos(radLat1) * Math.cos(radLat2)
				* Math.pow(Math.sin(b / 2), 2)));
		System.out.println(s+":s");
		s = s * EARTH_RADIUS*1000;
		System.out.println(s+":s");
		s = Math.round(s);
		return s;
	}
	//0.01lat=1113m
	public static void main(String[] args){
		//double dis=GetDistance(116.364571,39.972316,116.384571,39.972316);
		double dis=getbaiduDis(116.37111600026,39.978222002551,116.38111600026,39.978222002551);
		System.out.println(dis+":dis");
	}
	
	public static double getbaiduDis(double lat1, double lng1, double lat2,
			double lng2){
		
		double pk = 180 / 3.14169  ;
			double	a1 = lat1 / pk  ;
			double	a2 = lng1 / pk  ;
			double	b1 = lat2 / pk  ;
			double	b2 = lng2 / pk ; 
			double	t1 = Math.cos(a1) * Math.cos(a2) * Math.cos(b1) * Math.cos(b2)  ;
			double	t2 = Math.cos(a1) * Math.sin(a2) * Math.cos(b1) * Math.sin(b2)  ;
			double	t3 = Math.sin(a1) * Math.sin(b1)  ;
			double	tt = Math.acos(t1 + t2 + t3)  ;
				return 6366000 * tt  ;
		
	}
}
