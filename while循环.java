package dt60_chapter5;

public class while循环 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * while(条件) { 循环体 }
		 */
		int i = 1;
		while(i <= 3) {
			System.out.println("我爱编程"+i);
			Thread.sleep(1000);//休眠
			i++;
		}
		
		
		//死循环案例
		//第一种
		/*
		 * while(true) { System.out.println("hello，word"); }
		 */

	//	System.out.println("aaa");//不可达代码

		
//		第二种死循环
		/*
		 * while(1 == 1) { System.out.println("我爱编程"); }
		 */
		
		
	}

}
