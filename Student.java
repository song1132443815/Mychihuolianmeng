package cn.java.demo2;

public class Student {
	String name;
	int age;
	int score;
	
	public Student() {//体统默认提供的构造方法
		
	}
	//带参构造方法  this 指代当前对象
	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
	public Student(String name,int score,int age) {
		this(name,score);//
	}
	
	//带参构造方法可以理解为这种写法
//	public Student(String n,int s) {
//		name = n;
//		score = s;
//	}
	
	
	public void shoInfo() {
		System.out.println(name+"的成绩是"+score);
	}
	
}
