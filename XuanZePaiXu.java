package cn.java.shuzu;

public class XuanZePaiXu {

	public static void main(String[] args) {
		int[] arr = {4,7,3,9,1};
		int min = -1;
		//外层：比较几轮
		for(int i=0;i<arr.length;i++) {
			min=i;//每轮比较min的初始值
			//内层：当前元素和后面元素比较，记录最新的最小元素下标
			for(int j =i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {  //如果降序，将>改成<就行了 
					min = j;
				}
			}
			// 如果min值发生了变化，说明发现了更小的值，则将当前值和更小的值交换，保证小值放在数组的前面
			if(min!=i) {
				int temp = arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}	
			//输出排序后的数组
			for(int num:arr) {
				System.out.println(num);
			}
			
		

	}

}
