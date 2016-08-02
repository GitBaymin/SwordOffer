package com.baymin._29_;
/**
 * 数组中出现次数超过一半的数字
 * @author Baymin
 * @date 2016年8月2日
 */
public class MoreThanHalfNumDemo {
	/**
	 * 方法1：使用快速排序中的partition方法
	 * @param nums
	 * @return 要查找的数字
	 * @throws Exception
	 */
	public static int moreThanHalf1(int[] nums) throws Exception{
		if(checkInvalidArray(nums))
			return 0;
		int mid = nums.length>>1;
		int index = QuickSort.partition(nums, 0, nums.length-1);
		while(index!=mid){
			if(index>mid)
				index = QuickSort.partition(nums, 0, index-1);
			else
				index = QuickSort.partition(nums, index+1, nums.length-1);
		}
		int result = nums[index];
		if(!checkMoreThanHalf(nums, result))
			result = 0;
		return result;
	}
	/**
	 * 方法2：根据数组特点
	 * @param nums
	 * @return 要查找的数字
	 * @throws Exception
	 */
	public static int moreThanHalf2(int[] nums){
		if(checkInvalidArray(nums))
			return 0;
		int result = nums[0];
		int times = 1;
		for (int i = 1; i < nums.length; i++) {
			if(times == 0){
				result = nums[i];
				times=1;
			}
			else if(nums[i]==result)
				times++;
			else 
				times--;
		}
		if(!checkMoreThanHalf(nums, result))
			result = 0;
		return result;
	}
	static boolean inputValid = false;
	public static boolean checkInvalidArray(int[] nums){
		inputValid = false;
		if(nums==null)
			inputValid = true;
		return inputValid;
	}
	public static boolean checkMoreThanHalf(int[] nums,int num){
		int times=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==num)
				times++;
		}
		boolean moreThanHalf = true;
		if(times*2<=nums.length){
			inputValid = true;
			moreThanHalf = false;
		}
		return moreThanHalf;
	}
	public static void main(String[] args) throws Exception {
		int[] nums = {1,2,2,4,5,3,2,2,2};
		System.out.println(moreThanHalf1(nums));
		System.out.println(moreThanHalf2(nums));
	}

}
