package cn.java.demo;

import java.util.Scanner;

public class 练习3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		int[] attr = {8,4,2,1,23,344,12};
	System.out.println("请输入您要查找的数据：");
		int num = input.nextInt();
		
		boolean flag = false;
		for (int i = 0; i < attr.length; i++) {
			if(num == attr[i]) {
				flag = true;
				break;
			}
		}
		if(flag ==true ) {
			System.out.println("包含");
		}else {
			System.out.println("不包含");
		}

	}

}
