package cn.java.dome;
import java.util.Scanner;
public class YuanDeJiSuan{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入圆的半径:");
		double banjing = input.nextDouble();//圆的半径
		
		Circle yuan = new Circle(banjing);
		yuan.getcircle(banjing);
		
		System.out.println("点的数值是:");
		double dian = input.nextDouble();
		Point d = new Point(dian);
		d.getPoint(yuan);
		
		
		
		
		
		
		
		
		
		

	}		
}
