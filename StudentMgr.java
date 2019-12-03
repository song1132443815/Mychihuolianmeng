//学员管理系统
package cn.java.demo;

public class StudentMgr {
	//属性 存放学生姓名的数组
	String[] names = new String[30];
	
	
	
	
	
	//方法  增大学生的姓名
	public void addName(String name) {
		for(int i =0;i<names.length;i++) {
			if(names[i]==null) {
				names[i]=name;
				break;
			}
		}
			
	}
	
	
	//固定区间内，查找某个学生
	//start  起始查找的位置
	//end  结束查找的位置
	//name  查找的学生姓名
	public boolean searchName(int start,int end,String name) {
		boolean flag = false;//是否找到了该名学生，false没找到，反之就是找到了
		for(int i =start-1;i<end;i++) {
			if(name.equals(names[i])) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	
	public  void showNames() {
		System.out.println("本班学员列表");
		for(int i =0;i<names.length;i++) {
			if(names[i]!=null) {
				System.out.println(names[i]+"\t");
			
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
