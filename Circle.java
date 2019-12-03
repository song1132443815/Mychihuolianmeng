package cn.java.dome;
//圆的面积和周长
public class Circle {
	double Pi;//圆周率
	double r;
	
	public void getcircle(double r) {
		this.r= r;
	}
	

	public  Circle(double r) {
		Pi = 3.14;
		double S=Pi*r*r;
		System.out.println("圆的面积是:"+S);
		double C = this.Pi*2*r;
		System.out.println("圆的周长为:"+C);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
