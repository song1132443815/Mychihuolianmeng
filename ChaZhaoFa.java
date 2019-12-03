package cn.java.shuzu;

public class ChaZhaoFa {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int searchNum = 1;//查找的数字
		int starIndex=0;//开始查找范围的第一个的下标
		int endIndex=arr.length-1;//结束查找范围的下标
		int midIndex= -1;//中间位置的下标
		boolean s=false;//false 没找到
		do {
			midIndex=(starIndex+endIndex)/2;	
			if(arr[midIndex]==searchNum) {
				System.out.println("恭喜！下标是"+midIndex);
				s=true;
				break;
			}else if(arr[midIndex]>searchNum) {
				endIndex=midIndex-1;
			}else {
				starIndex= midIndex+1;
			}
			
			
			
		}while(starIndex<=endIndex);
		
		
		if(!s) {
			System.out.println("没找到");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
