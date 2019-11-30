package song.java.demo;

import java.util.Scanner;

public class Xiangmu1 {

	public static void main(String[] args) {
		//定义数据主体：订单  菜品
		String[]  disName = {"红烧带鱼","鱼香肉丝","宫保鸡丁"};//菜名  菜品编号1  disNames[0]
		double[]  prices= {38.0,20.0,10.0};//单价
		int[] praiseNums = new int[3];//点赞数
		//定义数据主体: 订单-订餐人           餐品信息         送餐时间          送餐地址          总金额           订单状态
		String[] names = new String[4];
		String[] dishMsg = new String[4];
		int[] times = new int[4];
		String[] adresses = new String[4];
		double[] sumPrices = new double[4];
		int[] states = new int[4];//0;已预订    1.已完成
		//初始化2个订单
		
		//初始化订单1
		names[0]="张三";
		dishMsg[0] = "红烧带鱼2份";
		times[0] = 10;
		adresses[0]="知春路223号";
		sumPrices[0]=16;//餐费>50 免配送费，不然配送费6元
		states[0]=0;	
		//初始化订单2
		names[1]="李四";
		dishMsg[1] = "鱼香肉丝1份";
		times[1] = 13;
		adresses[1]="天成路207号";
		sumPrices[1]=26;//餐费>50 免配送费，不然配送费6元
		states[1]=1;		
		
		//搭建项目整体框架
		Scanner input = new Scanner(System.in);
		int num= -1;//用户是否输入0返回时的输入数字  num=0时重复显示主菜单  num在用户每次订餐操作后进行提示
		System.out.println("欢迎使用“吃货联盟订餐系统”");		
		//记录用户是否退出系统的状态  true退出    
		boolean flag = false;	
		do {
			System.out.println("******************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("******************************");
			System.out.print("请选择");
			int choose = input.nextInt();
			switch(choose) {
			case 1:{
				System.out.println("\n************我要订餐**************");
					//判断订餐前是订单未满
			//	订餐前提是订单未满，boolean变量来标识订单是否满了的结果 满了false---不能订餐
					boolean isAdd=false;
										
					for(int i = 0;i<names.length;i++) {
						if(names[i]==null) {
						//订单未满，可以订餐
							isAdd = true;
							//订餐
							System.out.print("请输入订餐人姓名:");
							String name = input.next();
							//循环菜品信息
							System.out.println("序号\t菜名\t单价");
							for(int j =0;j<disName.length;j++) {
								String praise = (praiseNums[j]==0)?" ":praiseNums[j]+"赞";
								System.out.println((j+1)+"\t"+disName[j]+"\t"+prices[j]+"\t"+praise);
							}
							//菜品编号的输入及判断
							System.out.print("请输入您要选择的菜品编号");
							int no = input.nextInt();
							while(no<1||no>disName.length) {
								System.out.print("本店没有这个菜品请重新选择");
								no = input.nextInt();
							}
							//点菜的份数
							System.out.print("请输入那你需要的份数");
							int number = input.nextInt();
							//送餐时间的
							System.out.print("请输入送餐时间（只能在10点到22点之间的整数");
							int time = input.nextInt();
							while(time<10||time>20) {
								System.out.print("您的输入有误，请重新输入");
								time = input.nextInt();					
							}
							//送餐地址
							System.out.println("请输入送餐地址");
							String adress = input.next();
							//添加到订单信息    // 输入订单信息给用户看
							System.out.println("订单成功");
							//菜品信息；菜名名称  份数
							String dishInfo = disName[no-1]+" "+number+"份";
							System.out.println("您订的是："+dishInfo);//*******注意：用户选择的菜品下标比真正的数组元素下标大1
							System.out.println("送餐时间"+time+"点");
							//餐费  配送费  总计  
							double dishPrise = prices[no-1]*number;//餐费=单价*份数
							double peiSong = (dishPrise>50)?0:6;;
							double sumPrise = dishPrise+peiSong;
							System.out.println("餐费是"+dishPrise+"元；配送费："+peiSong+";总计："+sumPrise+"元");						
						//订餐信息添加到订单信息   插入订单的位置是关键						
							names[i]=name;
							dishMsg[i]=dishInfo;
							times[i]=time;
							adresses[i]=adress;
							sumPrices[i]=sumPrise;			
							break;
						}
					}				
					if(!isAdd) {
						System.out.println("对不起，您的餐袋已满！");						
					}	
			}
				break;								
			case 2:
				System.out.println("\n************产看餐袋**************");
				System.out.println("序号\t订餐人\t餐品信息\t\t配送时间\t配送地址\t\t总金额\t订单状态");
				for(int i =0;i<names.length;i++) {					
					if(names[i]!=null) {//输出非空订单信息						
						String time = times[i]+"点";
						String state = (states[i]==0)?"已经预定":"已经完成";
						System.out.println((i+1)+"\t"+names[i]+"\t"+dishMsg[i]+"\t"+time+"\t"+adresses[i]+"\t"+sumPrices[i]+"\t"+state);												
					}
				}
				break;
			case 3:
				System.out.println("\n************签收订单**************");
			//签收之前，要先判断订单是否存在，false   不存在 
				boolean isSign = false;				
				System.out.println("请输入您要签收的订单编号：");
				int signNo = input.nextInt();
				for(int i=0;i<names.length;i++) {
					if(names[i]!=null&&  states[i]==0  &&i==signNo-1) {
						isSign = true;
						states[i]=1;
						System.out.println("订单签收成功");
					}else if(names[i]!=null&& states[i]==1  &&i==signNo-1) {
						isSign = true;
						System.out.println("您选择的订单已经完成签收，不能再次签收！");
					}
				}				
				if(!isSign) {
					System.out.println("您选择的订单不存在");
				}								
				break;
			case 4:
				
				
				
				System.out.println("\n************删除订单**************");
				//删除之前，要先判断订单是否存在，false不存在   代表不能删除   	true存在  且预定状态不能删除     完成状态 
				boolean siDelete = false;				
				System.out.println("请输入您要删除的订单编号：");
				int deleteNo = input.nextInt();
				for(int i=0;i<names.length;i++) {
					if(names[i]!=null&&  states[i]==0  &&i==deleteNo-1) {
						siDelete = true;
						states[i]=1;												
					System.out.println("您选择的订单未签收！不能删除！");
					}else if(names[i]!=null&& states[i]==1  &&i==deleteNo-1) {
						siDelete = true;
						//但是订单状态已完成，删除
						//找到删除订单的位置 i   吧I后面的元素依次往前移动  最后一个元素要置空  
						//注意   移动的过程其实是把后一个元素往前一个元素复制的过程											
						for(int j =i;j<names.length-1;j++) {
							names[j] = names[j+1];
							dishMsg[j] = dishMsg[j+1];
							times[j] = times[j+1];
							adresses[j] = adresses[j+1];
							sumPrices[j] = sumPrices[j+1];
							states[j] = states[j+1];
						}
						//最后一个元素一定要置空，置空后就可以下新的订单了  
						names[names.length-1]= null;
						dishMsg[names.length-1]= null;
						times[names.length-1]= 0;
						adresses[names.length-1]= null;
						sumPrices[names.length-1]= 0;
						states[names.length-1]= 0;
						System.out.println("订单删除成功！");
					}
				}				
				if(!siDelete) {
					System.out.println("您选择的订单不存在");
				}
				break;
				
				
				
				
				
				
				
				
				
				
				
			case 5:
				System.out.println("\n************我要点赞**************");		
				//显示菜品信息
				System.out.println("序号\t菜名\t单价");
				for(int j =0;j<disName.length;j++) {
					String praise = (praiseNums[j]==0)?" ":praiseNums[j]+"赞";
					System.out.println((j+1)+"\t"+disName[j]+"\t"+prices[j]+"\t"+praise);
				}
				//点赞
					System.out.println("请输入您要点赞的菜品序号");
					int priseNo = input.nextInt();
				
					while(priseNo<1||priseNo>disName.length) {
						System.out.print("本店没有这个菜品，无法点赞！请重新输入一个菜品序号：");
						priseNo = input.nextInt();	
					}
					//***********关键点  把哪个位置的菜品+1   点赞菜品的位置=priseNo-1
					 praiseNums[priseNo-1]++;
				break;
			case 6:
				//退出系统
				flag=true;
				break;
			default:
				flag = true;
				break;
			}						
			if(!flag) {//!flag等 等同于flag==false
				System.out.print("请输入0返回：");
				num = input.nextInt();
			}else {
				break;
			}			
		}while(num==0);
		System.out.println("谢谢使用，欢迎下次光临!");	
	}
}
