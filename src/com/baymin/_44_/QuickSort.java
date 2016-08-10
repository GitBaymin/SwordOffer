package com.baymin._44_;
/**
 * 快速排序
 * @author Baymin
 * @date 2016年8月2日
 */
public class QuickSort {
	/**
	 * 分块方法
	 * @param data	要排序的数组
	 * @param left	左边索引
	 * @param right	右边索引
	 * @return		分块完成后的索引值
	 * @throws Exception
	 */
	public static int partition(int[] data,int left,int right) throws Exception{
		if(data==null||left<0||right>=data.length)
			throw new Exception("the input parameters are not right");
		int key = data[left];
		while(left<right){
			while(left<right && data[right]>=key)
				right--;
			data[left]= data[right];
			while(left<right && data[left]<=key)
				left++;
			data[right] = data[left];
		}
		data[left] = key;
		return left;
	}
	/**
	 * 快速排序方法
	 * @param data	要排序的数组
	 * @param left	左边索引
	 * @param right	右边索引
	 * @throws Exception
	 */
	public static void sort(int[] data,int left,int right) throws Exception{
		if(left<right){
			int result = partition(data, left, right);
			sort(data,left,result-1);
			sort(data, result+1, right);
		}
	}
}
