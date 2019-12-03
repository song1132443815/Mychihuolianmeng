import java.util.Scanner;

public class LianXi4 {

	public static void main(String[] args) {
		
		/*
		 * int i=1; while(i<=50) { System.out.println("打印第"+i+"份试卷"); i++; } String
		 * answer; Scanner input = new Scanner(System.in);
		 * System.out.println("合格了么？(y/n)"); answer = input.next();
		 * while(!"y".equals(answer)) { System.out.println("上午阅读教材");
		 * System.out.println("下午上机编程"); System.out.println("合格了么？(y/n)"); answer =
		 * input.next(); }
		 * 
		 * System.out.println("完成学习计划");
		 */
		
		/*
		 * Scanner input = new Scanner(System.in); System.out.println("请输入学生姓名：");
		 * String name = input.next(); //记录每门课的成绩 double score=0; double sum = 0;
		 * 
		 * 
		 * for(int i = 1;i<=5;i++) { System.out.println("请输入五门功课中的第"+i+"门课程"); score =
		 * input.nextInt(); sum= sum+score;//每一门课的额成绩都是累加在sum中 //计算平均分 }
		 * 
		 * double avg = sum/5; System.out.println(name+"的平均分"+avg);
		 */
		//一百以内的偶数之和
		/*int sum = 0;
		int i = 0;
		while(i<100) {
			i+=2;
			sum+=i;
		}
		System.out.println("一百以内的偶数之和是"+sum);
		*/
		
		//第二种方法
		/*
		 * int sum = 0; int i = 0; do{ i+=2; sum+=i;
		 * 
		 * }while(i<100); System.out.println("一百以内的偶数之和是"+sum);
		 */
		//第三种 
		int sum = 0;
		for(int i=0;i<=100;i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
