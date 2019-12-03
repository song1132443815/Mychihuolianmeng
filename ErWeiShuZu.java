package cn.java.shuzu;
import java.util.Scanner;
public class ErWeiShuZu {

	public static void main(String[] args) {
		//定义赋值
//		int[][] s = new int[6][];
//		int i[][] = {{90,61,64,31,12},{76,63,82,34},{73}};
//		int[][] x = new int[][] {{13,15,35},{15,58,69},{78,65,14},{45,13,91,54,31}};
			
		int[][] scores=new int[5][5];//第一个是五个班，第二个是每个班五位同学的成绩
		Scanner input = new Scanner(System.in);
		//外层是班   内层是班同学
		for (int i = 0; i <scores.length; i++) {
			System.out.println("------第"+(i+1)+"个班");
			
			for (int j = 0; j <scores[i].length; j++) {
				System.out.print("请输入第"+(i+1)+"个班第"+(j+1)+"个同学的成绩");
				scores[i][j]=input.nextInt();
			}
			
			
		}
		//计算五个班级的成绩统计
		System.out.println("---------统计成绩---------------------");
		
		for (int i = 0; i <scores.length; i++) {
			int sum=0;
			for (int j = 0; j <scores[i].length; j++) {			
				sum+=scores[i][j];
				
			}
			
			System.out.println("第"+(i+1)+"个班的同学总成绩为"+sum);
		}
	
	
	
	
	
	}

}
