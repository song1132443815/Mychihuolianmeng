package cn.java.demo;

public class Cat {
	//属性
	String zhuaZiShape;//脚
	String  strain;//品种
	String  color;//颜色
	String catName;//名字
	
	public  Cat() {
		
	}
	public  Cat( String shape,String sTrain,String cOlor,String cName) {
		this.catName=cName;//this代表当前对象
		this.strain=sTrain;
		this.color=cOlor;
		this.zhuaZiShape=shape;
	}
	
	public void eatFish() {
		System.out.println("猫喜欢吃鱼");
	}
	
	public void shangTree() {
		System.out.println("猫喜欢上树");
	}
	
	public static void main(String[] args) {
		
		 Cat cat1 = new Cat(); 
		 cat1.catName = "tom"; 
		 cat1.strain = "波斯";
		 cat1.zhuaZiShape="钩钩";
		 
		Cat cat2 = new Cat("大钩钩","波斯","黑色","小黑");
		
		Cat cat3 = new Cat("大钩钩2","波斯2","黄色","小黄");
		System.out.println(cat2.catName);
		
	}

}
