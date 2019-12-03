package cn.java.demo;

import java.util.Scanner;

//测试学生信息管理
public class TestStudentMgr {
	public static void main(String[] args) {
		StudentMgr mgr = new StudentMgr();
		Scanner input = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("请输入第"+(i+1)+"个同学的姓名：");
			String name = input.next();
			mgr.addName(name);
		}
		mgr.showNames();
		//查找某个学生信息
		System.out.println("请输入开始查找的位置");
		int start=input.nextInt();
		System.out.println("请输入要结束查找的位置");
		int end = input.nextInt();
		System.out.println("请输入要查找的学生姓名：");
		String findname = input.next();
		boolean flag=mgr.searchName(start, end, findname);
		if(flag) {
			System.out.println("恭喜您，查到了该生的姓名");
		}else {
			System.out.println("对不起，该生不在我们班级");
		}
	}
}
