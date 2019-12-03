package cn.java.demo;

public class 作业2 {

	public static void main(String[] args) {
		int i = 1 ;
		int sum = 0;
		while(i <= 10000) {
			if(i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("sum="+sum);
		
		
	}

}
