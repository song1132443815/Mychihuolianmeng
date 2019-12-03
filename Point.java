package cn.java.dome;
//點
public class Point {
	double x;//点
	
	public Point(double a ) {
		this.x = a;
		return;
	}
	public void getPoint(Circle r) {
		if(this.x>r.r) {
			System.out.println("点在圆外");
		}else if(this.x==r.r) {
			System.out.println("点在圆上");
		}else if(this.x<r.r) {
			System.out.println("点在圆中");
		}
	}
	

}
