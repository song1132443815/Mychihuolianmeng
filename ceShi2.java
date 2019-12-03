package cn.java.demo2;

public class ceShi {
	public static void main(String[] args) {
		Test test = new Test();
		int n =8;
		test.calc1(n); //参数类型为基本数据类型， 
		Student stu =new Student();
		stu.age=18;
		test.calc2(stu);//参数类型为引用数据类型     自定义数据类型
		System.out.println(n+"-----"+stu.age);
		
	}
	
}
