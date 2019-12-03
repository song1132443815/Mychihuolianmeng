package cn.java.demo;

public class Demo2 {

	public static void main(String[] args) {
		//字符串类常用的构造方法
		String str = new String("hello String");
		//将char数组转成字符串
		char[] chs = {'a','b','c','1'}; 
		String str2 = new String(chs);
		System.out.println(str2);
		
		//string类中常用的方法
		String str3 = "hello java";
		String str4 = str3.toUpperCase();
		System.out.println(str4);
		//大写转小写
		String str5 = "ABC";
		String str6 = str5.toLowerCase();
		System.out.println(str6);
	}

}
