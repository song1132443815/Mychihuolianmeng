package cn.java.demo;

public class Monkey {
	String monkeyName;//名字
	
	String strain;//品种
	
	String piGuDesc; //年龄

	char gender;//颜色
	
	int age;//体重
	
	String color;//颜色
	
	float weight;//体重
	
	float height;//身高
	//快速生成构造方法： alt+shift+s----> generator constor
	public Monkey(String monkeyName, String strain, String piGuDesc, char gender, int age, String color, float weight,
			float height) {
		super();
		this.monkeyName = monkeyName;
		this.strain = strain;
		this.piGuDesc = piGuDesc;
		this.gender = gender;
		this.age = age;
		this.color = color;
		this.weight = weight;
		this.height = height;
	}

	
	public Monkey(String monkeyName, String strain, int age) {
		super();
		this.monkeyName = monkeyName;
		this.strain = strain;
		this.age = age;
	}


	public Monkey() {
		super();
		
	}
	public void show() {
		System.out.println(this.monkeyName);
		System.out.println(this.strain);
		
	}
	//alt+shift+s--------->generate toString
	//@Override
	//如果直接打印某一对象，则系统会自动调用toString方法
	//
	public String toString() {
		return "Monkey [monkeyName=" + monkeyName + ", strain=" + strain + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		Monkey monkey1 = new Monkey("孙悟空","石猴",500);	
		//monkey1.show();
		System.out.println(monkey1);
		
		
		Monkey monkey2 = new Monkey("六耳猕猴","猴",100);	
		//monkey2.show();
		
		
	}


	
}
