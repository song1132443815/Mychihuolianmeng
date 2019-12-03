package cn.java.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 练习4 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		int[] attr = {8,4,2,1,23,344,12};
	System.out.println("请输入您要查找的数据：");
		int num = input.nextInt();
		
	Arrays.sort(attr);
	int flag = Arrays.binarySearch(attr, num);
	System.out.println(flag);
	
	if(flag >= 0) {
		System.out.println("包含");
	}else {
		System.out.println("不包含");
	}
	
	
	
	}

}
