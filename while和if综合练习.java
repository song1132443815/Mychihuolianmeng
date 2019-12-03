package cn.java.demo;

import java.util.Scanner;

public class while和if综合练习 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 1;
		while(i <= 3) {
		System.out.println("请输入用户编号:(<四位整数>)");
		int bianhao = input.nextInt(); //编号
		
		System.out.println("请输入用户年龄");
		int age = input.nextInt(); //年龄
		if(age < 10 ) {
			System.out.println("抱歉您的年龄不适合玩此游戏");
			System.out.println("信息录入失败\n");
			i++;
			continue;//提前终止下面程序//不可达代码
			
		}
		
		System.out.println("请输入会员积分：");
		int jifen = input.nextInt();//积分
		
		System.out.println("您录入的会员信息是：");
		System.out.println("用户编号："+bianhao+"\t年龄:"+age+"\t积分"+jifen);
		System.out.println();
		i++;//循环终止条件
		}
	}

}
