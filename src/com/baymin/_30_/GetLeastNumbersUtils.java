package com.baymin._30_;


/**
 * 数组中最小的k个数
 * @author Baymin
 * @date 2016年8月2日
 */
public class GetLeastNumbersUtils {
	/**
	 * 方法1：根据快速排序中的partition方法
	 * 时间复杂度:O(n)
	 * @param input
	 * @return 最小的k个数
	 * @throws Exception 
	 */
	public static int[] getLeastNums1(int[] input,int k) throws Exception{
		if(input==null)
			throw new Exception("The input are empty.");
		if(k>input.length)
			throw new Exception("k is greater than input.length.");
		if(k<=0)
			throw new Exception("k should greater than 0.");
		int index = QuickSort.partition(input, 0, input.length-1);
		while(index!=k-1){
			if(index>k-1)
				QuickSort.partition(input, 0, index-1);
			else
				QuickSort.partition(input, index+1, input.length-1);
		}
		int[] output = new int[k];
		for (int i = 0; i < k; i++) {
			output[i] = input[i];
		}
		return output;
	}
	/**
	 * 方法2：根据构建最大堆的方法
	 * @param input
	 * @param k
	 * @return 最小的k个数
	 * @throws Exception
	 */
	public static int[] getLeastNums2(int[] input, int k) throws Exception{
		if(input==null)
			throw new Exception("The input are empty.");
		if(k>input.length)
			throw new Exception("k is greater than input.length.");
		if(k<=0)
			throw new Exception("k should greater than 0.");
		int[] output = new int[k];	//创建容量k个数的空数组
		int i = 0;
		for (; i < k; i++) {		//初始化output数组
			output[i] = input[i];
		}
		/*
		 * 对output数组最大堆化后，
		 * output[0]是数组output中最大的数
		 */
		HeapSortUtils.buildMaxHeap(output);	
		/*
		 * 遍历input数组，求出最小的k个数
		 */
		while(i<input.length){
			if(input[i]<output[0]){
				output[0] = input[i];
			}
			HeapSortUtils.buildMaxHeap(output);
			i++;
		}
		return output;
	}
}	
