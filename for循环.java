package cn.java.demo;

public class for循环 {

	public static void main(String[] args) {
		//200内所有奇数之和
		/*
		 * int sum = 0; for (int i = 1;i<=200;i++) { if(i % 2 != 0) { sum += i; } }
		 * System.out.println("所有奇数之和为："+sum);
		 */
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			if(i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("所有奇数之和为："+sum);
	}

}
