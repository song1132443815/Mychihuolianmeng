package cn.java.demo;

import java.util.Scanner;

public class Dog {
	//构造方法
	/**
	 * 访问修饰符  类名(【形参】){}<br>
	 * 
	 * ！注意事项；构造方法的方法名必须与类名保持一致
	 * 
	 * 创建一个类是，每一个类中都有一个默认的隐藏式无参构造方法；
	 * 当我们显示的书写一个构造方法后，隐式的构造方法就自动消失。
	 * 
	 * 构造方法也可以重载
	 */
	public  Dog() {//无参构造 /*显示构造方法*/
		/*静态和实例是程序员调用
		 * 构造方法是系统调用 */
		
		/*
		 * 创建一个类时，每一个都有一个默认的、隐藏的隐式无参构造方法；
		 * 当我们显示的书写一个构造方法后，隐式的构造方法就会自动消失。
		 * 构造方法也可以重载*/
		System.out.println("我是无参构造方法");
		
	}
	public  Dog(String strain) {
		System.out.println("我是显示有参构造方法");
	}
	
	public  Dog(int a) {
		System.out.println("Dog(int a)");
	}
	//静态方法
	public static void sound() {
		System.out.println("狗喜欢旺旺叫");
	}
	//实例方法
	public void yaoWB() {//摇尾巴
		System.out.println("喜欢摇尾巴");
	}
	
	public static void main(String[] args) {
		//Dog.sound();
		
		Dog dog1 = new Dog();
		
		//dog1.yaoWB(); 
		
		
		//Dog dog2 = new Dog("土狗");
		
		//Dog dog3 = new Dog(10);
		
		Scanner input = new Scanner(System.in);
		
		String str = "123";
			String str2 = new String("hello");
		
//		Scanner input = new Scanner();
	}
	
}

