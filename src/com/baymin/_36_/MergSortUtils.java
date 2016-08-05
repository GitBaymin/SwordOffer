package com.baymin._36_;

/**
 * �鲢���򹤾���
 * 
 * @author Baymin
 * @date 2016��8��5��
 */
public class MergSortUtils {
	/**
	 * ��˳��ϲ�ǰ������������
	 * 
	 * @param mergeBefore
	 *            �������������飬��midIndexΪ��
	 * @param mergeAfter
	 *            �ϲ�����˳�������
	 * @param startIndex
	 *            startIndex-minIndexΪǰ����������
	 * @param midIndex
	 *            �ֽ��
	 * @param endIndex
	 *            minIndex+1-endIndexΪ������������
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
		 * ��ʣ���ǰ�����������е����ݷ��ںϲ�������
		 */
		for (; startIndex <= midIndex; startIndex++) {
			mergeAfter[i++] = mergeBefore[startIndex];
		}

		/*
		 * ��ʣ��ĺ������������е����ݷ��ںϲ�������
		 */
		for (; j <= endIndex; j++) {
			mergeAfter[i++] = mergeBefore[j];
		}
	}

	/**
	 * �鲢����
	 * 
	 * @param mergeSortBefore
	 *            Ҫ���������
	 * @param mergeSortAfter
	 *            Ҫ���������
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
