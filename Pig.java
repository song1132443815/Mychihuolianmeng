package cn.java.demo;

import java.util.Arrays;

public class Pig {
	//鼻子
	float weight;
	String strain;
	String ear;
	String noose;
	String name;
	private void behavior() {
		System.out.println("吃了睡，睡了吃，吃胖了被宰");
	}
	
	public static void main(String[] args) {
		Pig pig1 = new Pig();
		pig1.name = "小猪佩奇";
		pig1.behavior();
		
		float[] attr = new float[] {2.2F,3.14F,6.9F};
		Arrays.sort(attr);
		for (float f : attr) {
			System.out.println(f);
			
			
			
			
		}
	}

}
