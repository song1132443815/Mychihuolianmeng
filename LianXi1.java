import java.util.Scanner;

public class LianXi1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员号");
		int huiYuan = input.nextInt();
		if (huiYuan>999&&huiYuan<10000) {
			int BaiWei=huiYuan/100%10;
			System.out.println(BaiWei);
			int suiJi=(int)(Math.random()*10);
			System.out.println(suiJi);
			if (BaiWei==suiJi) {
				System.out.println(huiYuan+"号客户是幸运客户，获得精美Mp3一个");
			}else {
				System.out.println(huiYuan+"号客户，谢谢您的参与");
			}
		}else {
			System.out.println("您输入的会员号有误");
		}
		
		System.out.println("请输入1-7的数字");
		int xingQi = input.nextInt();
		switch (xingQi) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("输入错误");
			break;
		}
		System.out.println("输入一个运算符");
		String ds= input.nextLine();
		System.out.println(ds);
		
	}
}