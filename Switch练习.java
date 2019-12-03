package dt60_chapter5;

import java.util.Scanner;

public class Switch练习 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的名次信息");
		String mingci = input.next();
			switch(mingci) {
			case "第一名":
				System.out.println("夏令营");
				break;
			case"第二名":
				System.out.println("笔记本电脑");
				break;
			case"第三名":
				System.out.println("移动硬盘");
				break;
				default:
					System.out.println("无奖励");
				break;
			}

	}

}
