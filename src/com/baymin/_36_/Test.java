package com.baymin._36_;
/**
 * 逆序对测试
 * @author Baymin
 * @date 2016年8月5日
 */
public class Test {

	public static void main(String[] args) {
		int[] nums = { 7,5,6,4 };
		int count = InversePairsUtils.inversePairs(nums, nums, 0, nums.length-1);
		System.out.println(count);
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}

}
