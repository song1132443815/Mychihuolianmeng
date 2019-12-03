package cn.java.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 练习5 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		int[] attr = {8,4,2,1,23,344,12};
	System.out.println("请输入您要查找的数据：");
		int num = input.nextInt();
		
	Arrays.sort(attr);//先排序
	//int flag = Arrays.binarySearch(attr, num);//判断num在这个数组中是否存在
	//System.out.println(flag);
	
	System.out.println(Arrays.binarySearch(attr,num)>=0?"包含":"不包含");
	
	
	
	}

}
