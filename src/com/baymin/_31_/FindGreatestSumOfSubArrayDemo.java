package com.baymin._31_;
/**
 * 连续子数组的最大和
 * @author Baymin
 * @date 2016年8月3日
 */
public class FindGreatestSumOfSubArrayDemo {
	public static Integer findGreatestSumOfArray(int[] nums) {
		if(nums==null){
			System.out.print("The array nums is ");
			return null;
		}
		int currSum = 0;
		int greatestSum = 0x80000000;	//足够小的负数作为初始比较对象
		for (int i = 0; i < nums.length; i++) {
			if(currSum<=0)
				currSum = nums[i];
			else
				currSum += nums[i];
			if(currSum>greatestSum)
				greatestSum = currSum;
		}
		return greatestSum;
	}
	public static void main(String[] args) {
		int[] nums1 = {1,-2,3,10,-4,7,2,-5};
		int[] nums2 = {-1,-2,-3,-10,-4,-7,-2,-5};
		int sum = findGreatestSumOfArray(nums1);
		System.out.println(sum);
		System.out.println(findGreatestSumOfArray(nums2));
		System.out.println(findGreatestSumOfArray(null));
	}
}
