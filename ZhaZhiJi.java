//榨汁机
package cn.java.demo;

public class ZhaZhiJi {
	String color;
	double price;
	
	
	
//方法；输出信息
	
	
	
	public void shIfor() {
		System.out.println("这是一台"+color+"的榨汁机，价格为："+price+"元");
	}
	
	public void zhaZhi(String a) {
		System.out.println("一杯"+a+"汁");
		
	}
	public static void main(String[] args) {
		ZhaZhiJi  Zzj= new ZhaZhiJi();
		
		Zzj.zhaZhi("桃子");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
