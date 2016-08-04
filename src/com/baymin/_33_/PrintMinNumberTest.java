package com.baymin._33_;

public class PrintMinNumberTest {

	public static void main(String[] args) throws Exception {
		int[] nums={3,32,321};
		QuickSort.sort(nums, 0, nums.length-1);
		for (int i : nums) {
			System.out.print(i);
		}
	}

}
