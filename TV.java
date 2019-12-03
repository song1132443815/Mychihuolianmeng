package cn.java.demo2;

import java.util.Scanner;

//测试类：构建游客类的对象  构建整个程序的流程
public class TV {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		JQ v= new JQ();
		boolean flag = true;//true :用户输入的姓名不是N；反之退出程序
		do {
		System.out.println("请输入姓名：");
		String name = input.next();
		if(!name.equals("n")) {
			v.name = name;//将用户键盘录入的姓名赋值给v对象的name的属性
			System.out.println("请输入年龄：");
			int age = input.nextInt();
			v.age = age;//将用户键盘录入的姓名赋值给v对象的age的属性
			
			v.showping();
		}else {
			flag=false;
		}
		
		
		}while(flag);
		System.out.println("退出程序");
	}
}
