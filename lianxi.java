import java.util.Scanner;

import javax.lang.model.element.Element;

public class lianxi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入张浩Java的成绩：");
		int Java = input.nextInt();
		System.out.println("请输入张浩的音乐成绩：");
		int mc = input.nextInt();
		
		if (Java>90&&mc>80||Java==100&&mc>70) {
			System.out.println("奖励");
		}else {
			System.out.println("惩罚");
		}
		
		
		
		
		if (Java>90 && Java<100) {
			
			if (mc>80) {
				System.out.println("老师奖励10元");		
			}
				
		}else if (Java==100) {
					if (mc>70) {
						System.out.println("老师奖励5元");
					}
		}else {
			System.out.println("老师惩罚写代码");
		}
	
		
		
		
	}

}
