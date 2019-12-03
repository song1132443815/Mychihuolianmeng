//import java.util.Scanner;
public class LianXi6 {

	public static void main(String[] args) {
	/*Scanner input = new Scanner(System.in);
	System.out.println("请输入班级总人数");
	int total = input.nextInt();
	int score = 0;
	int num = 0;
	for(int i = 1; i<=total;i++) {
		System.out.println("请输入第"+i+"个同学的java 成绩");
		score = input.nextInt();
		if(score>=80) {
			num++;
		}
	}
	System.out.println("80分以上的学生人数"+num);
	double biLi=(double)num/total*100;
	System.out.println("80分以上的学生所占的比例为"+biLi+"%");
	*/
		
		/*
		 * int sum = 0; int i =1; for(;i<=10;i++) { sum+=i; if(sum>20) { break; } }
		 * System.out.println("1~10之间累加，"+i);
		 */
	/**矩形
	 * 
		//行数
		for (int i = 1; i <=5; i++) {
			//列
			for (int j = 0; j <=5 ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		*/
		//平行四边形
		/**for (int i = 1; i <=5; i++) {
			//列
			for (int j = 0; j <5-i ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <=5 ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		*/
		//三角形
		/**for (int i = 1; i <= 5; i++) {
			//列
			for (int j = 1; j<=5-i ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1 ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		*/
		//菱形
		/**for (int i = 1; i <= 5; i++) {
			//列
			for (int j = 1; j<=5-i ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1 ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		//再补一个4行的倒三角
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*(5-i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//数字菱形
		/**for (int i = 1; i <= 5; i++) {
			//列
			for (int j = 1; j<=5-i ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1 ; j++) {
				System.out.print(5-i);
			}
			System.out.println(" ");
		}
		//再补一个4行的倒三角
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*(5-i)-1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		*/
		//空心菱形
		/**for (int i = 1; i <= 5; i++) {
			//列
			for (int j = 1; j<=5-i ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1 ; j++) {
				if (j==1||j==2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		//再补一个4行的倒三角
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*(5-i)-1; j++) {
				if (j==1||j ==2*(5-i)-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		*/

	
		
		
	}

}
