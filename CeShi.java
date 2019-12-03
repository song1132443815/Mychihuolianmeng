package cn.java.demo;

public class CeShi {
	public static void main(String[] args) {
		XQ diqiu = new XQ();
		diqiu.name= "地球";
		diqiu.color= "蓝色";
		diqiu.classNum = "行星";
		diqiu.tep = 15;
		diqiu.time = 24;
		
		People likexin = new People();
		likexin.name="李柯馨";
		likexin.age=23;
		likexin.sex='女';
		likexin.showInfo();
	}
}
