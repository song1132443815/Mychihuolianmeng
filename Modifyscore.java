package cn.java.demo2;//操作学员成绩
//修改小于60分的学生成绩
public class Modifyscore {
	public void modifyStuScore(Student[] stus) {
		for(int i =0;i<stus.length;i++) {
			if(stus[i].score<60) {
				stus[i].score+=2;
			}
		}
	}
	//显示本组学生信息
	public void showStus(Student[] stus) {
		for(Student stu:stus) {
			stu.shoInfo();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
