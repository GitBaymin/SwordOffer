package com.baymin._36_;

/**
 * ��������Թ�����
 * 
 * @author Baymin
 * @date 2016��8��5��
 */
public class InversePairsUtils {
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
		 * ��ʣ���ǰ�����������е����ݷ��ںϲ�������
		 */
		for (; k >= startIndex; k--) {
			mergeAfter[i--] = mergeBefore[k];
		}
		/*
		 * ��ʣ��ĺ������������е����ݷ��ںϲ�������
		 */
		for (; j >= midIndex + 1; j--) {
			mergeAfter[i--] = mergeBefore[j];
		}
		return count;
	}

	/**
	 * �����
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
		// ǰ������������Ե�����
		int left = inversePairs(nums, temp, startIndex, mid);
		// �������������Ե�����
		int right = inversePairs(nums, temp, mid + 1, endIndex);
		// ǰ������ͺ������ϲ�������Ե�����
		int count = merge(temp, copyNums, startIndex, mid, endIndex);

		return left + right + count;
	}
}
