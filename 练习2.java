package cn.java.demo;

import java.util.Arrays;
import java.util.Scanner;

public class 练习2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		float[] scores= new float[5];
		for(int i = 0; i < 5;i++) {
			scores[i] = input.nextFloat();
		}
		Arrays.sort(scores);//由小到大排序
		
		System.out.println(scores[scores.length-1]);

	}

}
