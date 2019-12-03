package cn.java.demo;

public class JuXin {
	float width;
	float height;
	public float area(float a,float b) {//面积（形参）
		float mianji = a * b;
		return mianji;
	}
	public float zongLength(float num3,float num4) {
		float len = (num3+num4)*2;
		return len;
	
}
	public static void main(String[] args) {
		JuXin a = new JuXin();
		float num1 = 5.5F;
		float num2 = 4.4F;
		float sum = a.zongLength(3.2F,2.3F);
		float result = a.area(num1,num2);
		System.out.println("result="+result);
		System.out.println("sum="+sum);
	}
}
