package com.baymin._30_;
/**
 * 堆排序
 * @author Baymin
 * @date 2016年8月3日
 */
public class HeapSortUtils {
	/**
	 * 调整数组中的数据位置
	 * @param nums
	 * @param i
	 * @param length
	 */
	public static void heapAdjust(int[] nums,int i, int length){
		int temp = nums[i];
		for (int j = 2*i; j <= length; j*=2) {
			if(j<length && nums[j]<nums[j+1])
				j=j+1;	//取较大数的索引
			if(temp>=nums[j])
				break;
			nums[i] = nums[j];
			i = j;
		}
		nums[i] = temp;
	}
	/**
	 * 交换数组中两个元素
	 * @param nums
	 * @param index1
	 * @param index2
	 */
	public static void swap(int[] nums,int index1,int index2){
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
	/**
	 * 构建最大堆
	 * @param nums
	 */
	public static void buildMaxHeap(int[] nums){
		if(nums==null)
			return;
		for (int i = (nums.length-1)/2; i >=0; i--) {
			heapAdjust(nums, i, nums.length-1);
		}
	}
	/**
	 * 最大堆排序
	 * @param nums
	 */
	public static void maxHeapSort(int[] nums){
		if(nums == null)
			return;
		for (int j = nums.length-1; j >=1; j--) {
			swap(nums, 0, j);
			heapAdjust(nums, 0, j-1);
		}
	}
}
