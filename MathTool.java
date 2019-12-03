package cn.java.demo;

import java.util.Arrays;

/**
 * Description:求绝对值
 * @author 小宋
 *
 */
	public class MathTool {
	//求绝对值
	public void abs(int num) {
		int result = num>0?num:-num;
		System.out.println("result="+result);
	}
	/*矩形的面积*/
	public float calculate1(float num1, float num2 ) {
		float result = num1 * num2;
		return result;
	}
	
	public static void main(String[] args) {
		MathTool mTool1 = new MathTool();
		mTool1.abs(-20);
		float s = mTool1.calculate1(2.7F, 2.0F);
		System.out.println(s);
		
		//======================
		MathTool mTool2 = new MathTool();
		//mTool1.abs(-20);
		float s2 = mTool2.calculate1(2.7F, 2.0F);
		System.out.println(s2);
		
		
		
		int[] sttr = {1,4,5,6};
		Arrays.sort(sttr);
		
	}

}
