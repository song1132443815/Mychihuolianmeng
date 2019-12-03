import java.util.Scanner;
public class LianXi5 {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in); System.out.println("请输入一个整数："); int a
		 * = input.nextInt(); if(a==1) { System.out.println(a); }else { a--;
		 * System.out.println(a); }
		 */
		//输出一行星星
//		for(int i = 1;i<=5;i++) {
//			System.out.print("*");
//		}
		//
//		for(int i = 1;i<=5;i++) {
//			System.out.println("*");
//		}
		/*
		 * for(int i = 1;i<=10;i++) { System.out.println("自转"+i+"年"); for(int j
		 * =1;j<=365;j++) { System.out.println("第"+j+"天"); }
		 * 
		 * }
		 */
		//“*”号做矩形
		/*
		 * for(int i = 1;i<=5;i++) {
		 * 
		 * for(int j = 1;j<=5;j++) { System.out.print("*"); } System.out.println(); }
		 */
		//做平行四边形
		/*
		 * for(int i= 1; i<=5;i++) {
		 * 
		 * for(int j=1;j<=5-i;j++) { System.out.print(" "); } for(int j=1;j<=5;j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		//做等腰三角形
		/*
		 * for(int i = 1;i<=5;i++) {
		 * 
		 * for(int j=1;j<=5-i;j++) { System.out.print(" "); } for(int j =
		 * 1;j<=2*i-1;j++) { System.out.print("*"); } System.out.println(); }
		 */
		//数字三角形
//		Scanner input = new Scanner(System.in);
//		System.out.println("你想要几行数字：");
//		int num = input.nextInt();
//		for(int i = 1;i<=num;i++) {
//			
//			for(int j=1;j<=num-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<=2*i-1;j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		for(int i = 1;i<=5;i++) {
//			
//			for(int j=1;j<=5-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//九九乘法表
		
		  for(int a = 1; a<=9;a++) { 
			  
			  for(int b=1;b<=a;b++) {
				  
		  System.out.print(a+"*"+b+"="+(a*b)+" "); 
		  
		  } 
			  System.out.println();
			  }
		 
		
	}

}
