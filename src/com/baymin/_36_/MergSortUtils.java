package com.baymin._36_;

/**
 * 归并排序工具类
 * 
 * @author Baymin
 * @date 2016年8月5日
 */
public class MergSortUtils {
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
	public static void merge(int[] mergeBefore, int[] mergeAfter,
			int startIndex, int midIndex, int endIndex) {
		int i, j;
		for (i = startIndex, j = midIndex + 1; startIndex <= midIndex
				&& j <= endIndex; i++) {
			if (mergeBefore[startIndex] < mergeBefore[j]) {
				mergeAfter[i] = mergeBefore[startIndex++];
			} else {
				mergeAfter[i] = mergeBefore[j++];
			}
		}
		/*
		 * 将剩余的前有序子数组中的数据放在合并数组中
		 */
		for (; startIndex <= midIndex; startIndex++) {
			mergeAfter[i++] = mergeBefore[startIndex];
		}

		/*
		 * 将剩余的后有序子数组中的数据放在合并数组中
		 */
		for (; j <= endIndex; j++) {
			mergeAfter[i++] = mergeBefore[j];
		}
	}

	/**
	 * 归并排序
	 * 
	 * @param mergeSortBefore
	 *            要排序的数组
	 * @param mergeSortAfter
	 *            要排序的数组
	 * @param startIndex
	 * @param endIndex
	 */
	public static void mergeSort(int[] mergeSortBefore, int[] mergeSortAfter,
			int startIndex, int endIndex) {
		int mid;
		int[] temp = new int[mergeSortAfter.length];
		if (startIndex == endIndex)
			mergeSortAfter[startIndex] = mergeSortBefore[startIndex];
		else {
			mid = (startIndex + endIndex) / 2;
			mergeSort(mergeSortBefore, temp, startIndex, mid);
			mergeSort(mergeSortBefore, temp, mid + 1, endIndex);
			merge(temp, mergeSortAfter, startIndex, mid, endIndex);
		}
	}
}
