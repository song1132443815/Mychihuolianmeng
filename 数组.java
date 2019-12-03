package cn.java.demo;

import java.util.Arrays;
import java.util.Scanner;

public class 数组 {

	public static void main(String[] args) {
		//数组
		//数组的声明语法：数据类型  数组变量名[]=new 数据类型[长度]
		Scanner input = new Scanner(System.in);
		
		float[] money = new float[5];
		
		System.out.println("请输入会员本月消费记录：");
		
		for(int i = 1; i <= 5;i++){
			
			
		System.out.println("请输入第"+i+"笔购物金额：");
		
		 money[i - 1] = input.nextFloat();
		 
		}
		//排序
		Arrays.sort(money);
		
		//遍历Money数组
		System.out.println("\n序号\t\t金额");
		for(int j = 1;j <= money.length;j++) {
			System.out.println(j+"\t\t"+money[j-1]);
		}
		
	

	}

}
