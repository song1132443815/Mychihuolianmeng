package cn.java.demo2;
import java.util.Scanner;
public class Admin {
//属性
	String userName;
	String password;
	
	
	
	
	
	
	public void shouInfor() {
		System.out.println("用户名为："+userName+";密码为:"+password);
	}
	
	
	
	
	
	
	public void word() {
		Scanner input = new Scanner(System.in);
		Admin admin = new Admin();
		
		System.out.println("请输入用户名：");
		String name = input.next();
		System.out.println("请输入密码:");
		String pwd = input.next();
		
		if(admin.userName.equals(name)&&admin.password.equals(pwd)) {
			//输入用户名和密码正确有权限 修改密码
			System.out.println("\n请输入新密码");
			admin.password = input.next();
			System.out.println("修改密码成功，您的新密码为："+admin.password);
		}else {
			//用户明和密码不正确  不能修改
			System.out.println("您输入的用户名或密码不匹配，您没有权限修改！");
		}
		
	}
}
