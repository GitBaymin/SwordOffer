package com.baymin._36_;

/**
 * 数组逆序对工具类
 * 
 * @author Baymin
 * @date 2016年8月5日
 */
public class InversePairsUtils {
	/**
	 * 按顺序合并前后两个子数组
	 * 
	 * @param mergeBefore
	 *            包含两个子数组，以midIndex为界
	 * @param mergeAfter
	 *            合并后有顺序的数组
	 * @param startIndex
	 *            startIndex-minIndex为前有序子数组
	 * @param midIndex
	 *            分界点
	 * @param endIndex
	 *            minIndex+1-endIndex为后有序子数组
	 */
	public static int merge(int[] mergeBefore, int[] mergeAfter,
			int startIndex, int midIndex, int endIndex) {
		int i = endIndex;
		int j = endIndex;
		int k = midIndex;
		int count = 0;
		for (; k >= startIndex && j >= midIndex + 1; i--) {
			if (mergeBefore[k] > mergeBefore[j]) {
				mergeAfter[i] = mergeBefore[k--];
				count += j - midIndex;
			} else {
				mergeAfter[i] = mergeBefore[j--];
			}
		}
		/*
		 * 将剩余的前有序子数组中的数据放在合并数组中
		 */
		for (; k >= startIndex; k--) {
			mergeAfter[i--] = mergeBefore[k];
		}
		/*
		 * 将剩余的后有序子数组中的数据放在合并数组中
		 */
		for (; j >= midIndex + 1; j--) {
			mergeAfter[i--] = mergeBefore[j];
		}
		return count;
	}

	/**
	 * 逆序对
	 * 
	 * @param nums
	 * @param copyNums
	 * @param startIndex
	 * @param endIndex
	 */
	public static int inversePairs(int[] nums, int[] copyNums, int startIndex,
			int endIndex) {
		int mid;
		int[] temp = new int[copyNums.length];
		if (startIndex == endIndex) {
			copyNums[startIndex] = nums[startIndex];
			return 0;
		}
		mid = (startIndex + endIndex) / 2;
		// 前半数组中逆序对的数量
		int left = inversePairs(nums, temp, startIndex, mid);
		// 后半数组中逆序对的数量
		int right = inversePairs(nums, temp, mid + 1, endIndex);
		// 前半数组和后半数组合并后逆序对的数量
		int count = merge(temp, copyNums, startIndex, mid, endIndex);

		return left + right + count;
	}
}
