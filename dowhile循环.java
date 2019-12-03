package cn.java.demo;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class dowhile循环 {

	public static void main(String[] args) {
		/*
		 * do{ 循环体; 循环终止条件; }while() {
		 * 
		 * }
		 */
		/*
		 * int i = 1; do {
		 * 
		 * System.out.println("hello word"); i++;
		 * 
		 * }while(i <= 3);
		 */
		
		//do whlie的练习
		Scanner input = new Scanner(System.in );
		do {
		System.out.println("*************请输入如下选项**************");
		System.out.println("\t\t1，信息录入：");
		System.out.println("\t\t2，信息查询：");
		System.out.println("\t\t3，细心修改：");
		System.out.println("\t\t4，信息删除：");
		System.out.println("\t\t5，退出：");
		System.out.println("******************************");
		int flag = input.nextInt();
		switch(flag) {
		case 1:
			System.out.println("信息录入成功");
			break;
		case 2:
			System.out.println("信息查询成功");
			break;
		case 3:
			System.out.println("信息修改成功");
			break;
		case 4:
			System.out.println("信息删除成功");
			break;
		case 5:
			System.out.println("退出");
			System.exit(0);
			break;
		}
		}while(true);
	}

}
