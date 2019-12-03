package cn.java.demo2;
//游客类
public class JQ {
	String name;
	int age;
	
	//根据年龄判断门票价格
	//18-60  20元   《10  》60  免费   10 -18 10元
	public void showping() {
		if(age>0&&age<10) {
			System.out.println(name+"年龄为："+age+"岁；门票免费！");
		}else if(age<18) {
			System.out.println(name+"年龄为："+age+"岁；门票10元！");
		}else if(age<60) {
			System.out.println(name+"年龄为："+age+"岁；门票20元！");
		}else {
			System.out.println(name+"年龄为："+age+"岁；门票免费！");
		}
	}
}
