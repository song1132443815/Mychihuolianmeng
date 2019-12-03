package cn.java.demo;


import java.util.Arrays;

public class 练习 {

	public static void main(String[] args) {
		int[] attr = { 100,12,45,26,65,-37 };
		
		Arrays.sort(attr);
		
		for(int i = 0;i < attr.length;i++) {
			System.out.print(attr[i]+"\t");
		}
		
		

	}

}
