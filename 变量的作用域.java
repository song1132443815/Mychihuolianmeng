package dt60_chapter5;

public class 变量的作用域 {

	public static void main(String[] args) {
		int n = 30 ;
		if(true) {
			int i = 20;
			System.out.println(i); 
		}
		//System.out.println(i);
	}

}
