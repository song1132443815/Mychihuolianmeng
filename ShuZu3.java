package cn.java.shuzu;

import java.util.Scanner;
//import java.util.Arrays;
public class ShuZu3 {

	public static void  main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5名同学的成绩：");
		int[] scores=new int[5];
		for(int i =0; i<scores.length;i++) {
			System.out.println("请输入第"+(i+1)+"名同学的成绩");
			scores[i]=input.nextInt();	
			
		}
		
			System.out.println("******冒泡排序前********");
			for(int num:scores) {
				System.out.println(num);
			}
			//冒泡排序
			for(int i = 0;i<scores.length-1;i++) {//轮
				for(int j = 0;j<scores.length-i-1;j++) {//每一轮比较几次
					//按照规律比较并交换数字,前面比后面数字大，就交换
					if(scores[j]<scores[j+1]) {
						int temp = scores[j];
						scores[j]=scores[j+1];
						scores[j+1]=temp;
					}
					
				}
				
			}
			
			//冒泡排序后
			System.out.println("**********排序后*****");
			for(int num:scores) {
				System.out.println(num);
			}
			
			
			
			
			
			
			
			
			
			
	}

}
