package com.baymin._36_;
/**
 * ����Բ���
 * @author Baymin
 * @date 2016��8��5��
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
