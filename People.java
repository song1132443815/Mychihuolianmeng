package cn.java.demo;
//人类
public class People {
//属性(成员变量）：姓名,身高，体重，性别，年龄
	String name;
	char sex;
	int age;

	
	//方法（成员方法）:吃 喝  自我介绍
	public void eat(){
		System.out.println("我吃饭");
	}
	
	public void drink() {
	System.out.println();	
	}
	
	public void showInfo() {
		System.out.println("姓名："+name);
		System.out.println("性别是:"+sex);
		System.out.println("年龄是:"+age);
	}
	
	public String getName() {
		return name;
	}
	public void zuoxi() {
		//People类的普通方法之间互相调用，直接写方法名即可，不用声明对象
		
		drink();
		eat();
		
	}
	
	
	
	//测试
	public static void main(String[] args) {
		//main()方法即便写在People里，要调用People的方法也要先声明对象
		People p = new People();
		p.zuoxi();
	}
	
	
}
