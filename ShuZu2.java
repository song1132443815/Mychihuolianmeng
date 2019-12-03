package cn.java.shuzu;
import java.util.Scanner;

public class ShuZu2 {

	public static void main(String[] args) {
	  //声明数组储存数据源
//		int[] list = new int[] {8,4,2,1,23,344,12};
//		int sum =0;
//		for (int num : list) {
//			System.out.println(num);
//			sum+=num;
//		}
//		System.out.println("数组元素总和为:"+sum);
//		
//		
//		//猜数
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入您要猜的数字:");
//		int guess = input.nextInt();
//		boolean isCorrect = false;
//		for(int num:list) {
//			if(num == guess) {
//				//猜测正确
//				isCorrect=true;
//				break;
//			}
//		}
//		if(isCorrect) {
//			System.out.println("恭喜你，你猜的数字在数列中存在");
//		}else {
//			System.out.println("对不起，您猜数字不在数列中");
			
//			Scanner input = new Scanner(System.in);
//			System.out.println("请输入本月的消费记录");
//			double[] list = new double[5];
//			for(int i =0;i<list.length;i++) {
//				System.out.print("请输入第"+(i+1)+"笔会员的金额");
//				list[i] = input.nextDouble();
//
//			}
//			double sum = 0;
//			System.out.println("序号\t\t金额");
//			
//			for(int i =0;i<list.length;i++) {
//				System.out.println((i+1)+"\t\t"+list[i]);
//				sum+=list[i];
//			}
//			System.out.println("总和\t\t"+sum);
//			求最大值
//			Scanner input = new Scanner(System.in);
//			int[] scores=new int[5];
//			for(int i = 0 ;i<scores.length;i++) {
//				System.out.println("请输入第"+(i+1)+"个同学的考试成绩");
//				scores[i]=input.nextInt();
//			}
//			int max=scores[0];
//			for(int i = 1;i<scores.length;i++) {
//				if(scores[i]>max) {
//					max=scores[i];
//				}
//			}
//			System.out.println("最高分为"+max);
			
			
			//最小值
//		Scanner input = new Scanner(System.in);
//		double[] prices=new double[4];
//		for(int i = 0 ;i<prices.length;i++) {
//			System.out.println("请输入第"+(i+1)+"个同学的考试成绩");
//			prices[i]=input.nextInt();
//		}
//		double min = prices[0];
//		for(int i = 1;i<prices.length;i++) {
//			if(prices[i]< min) {
//				min = prices[i];
//			}
//		}
//		System.out.println("最di分为"+min);
			//通过数组存储原来的五个成绩
		int[] list = new int[6];
		list[0]=99;
		list[1]=85;
		list[2]=58;
		list[3]=58;
		list[4]=58;
	//获取用户要插入的数值
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您要插入的数值：");
		int num = input.nextInt();  //插入一个数
		//找到num要插入的位置index  找到num比数组中元素（第一个）大的位置
		int index = 0;
		for(int i = 0;i<list.length;i++) {
			if(num>list[i]) {  // 如果这个数大于里面的数
				index=i; 	//那index坐标==这个数组中的坐标
				break;  //跳出循环  
			}
			
		}
		//index
		//原index位置及以后的所有数据要整体往后挪
		for(int i =list.length-1;i>index;i--) {//数组减一起点6-1   终点 index     list.length是数值
			list[i]=list[i-1];              //list.length-1；   list[5]=list[5-1];
		}
		//在index位置将num插入进来
			list[index] = num;  
			
			
		System.out.println("插入成绩的下标是"+index);
		System.out.println("插入数值后的最后成绩是:");
		for (int listNum : list) {
			System.out.print(listNum+"\t");
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
