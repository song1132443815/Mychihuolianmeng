import java.util.Arrays;
public class LianXi8 {

	public static void main(String[] args) {
		 char[] chars = new char[] {'a','c','u','b','h','z'};
		 System.out.println("原字符序列：");
		 for (char oldChar:chars) {
			System.out.println(oldChar+" ");
		}
		 Arrays.sort(chars);
		 for(char oldChar:chars) {
			 System.out.println(oldChar+" ");
		 }
		 int index = Arrays.binarySearch(chars,'b');
		 System.out.println(index);

	}

}
