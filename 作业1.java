package cn.java.demo;

import java.util.Scanner;

public class 作业1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
	Scanner input = new Scanner(System.in);
	System.out.println("请输入一个数：");
	int num1 = input.nextInt();
	System.out.println("请输入第二个数");
	int num2 = input.nextInt();
	int sum = 0;
	while(num1 <= num2) {
		if(num1 % 7 == 0) {
			sum += num1;
		}
		num1++;
	}
	System.out.println("sum="+sum);
	long endTime = System.currentTimeMillis();
		System.out.println("共消耗"+(endTime - startTime)+"ms");
	}

}
