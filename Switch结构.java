package dt60_chapter5;

public class Switch结构 {

	public static void main(String[] args) {
		
		int flag = 4;
		switch(flag) {
		case 1:
			System.out.println("星期一");
			//System.exit(0);//终止当前的整个java程序
			break;
		case 2://判断flag是否等于2
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
			default:
				System.out.println("今天不是星期一");
				break;
		}
		System.out.println("程序结束了");
		
		
		
	}

}
