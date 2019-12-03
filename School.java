package cn.java.demo;
//学校
public class School {
	//属性
	String schoolName;
	int classNum;
	int stuNum;
	
	
	
	//方法
	public void show() {
		System.out.println(schoolName+"\n有"+classNum+"个教室\n有"+stuNum+"学生");
	}
	public static void  main(String[] age) {
		School school1 = new School();
		school1.schoolName="同文职业技术学院";
		school1.classNum=36;
		school1.stuNum=3562;
		school1.show();
		
		School school2=new School();
		
	}
	
	
	
	
	
	
	
	
}
