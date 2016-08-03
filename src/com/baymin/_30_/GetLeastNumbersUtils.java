package com.baymin._30_;


/**
 * ��������С��k����
 * @author Baymin
 * @date 2016��8��2��
 */
public class GetLeastNumbersUtils {
	/**
	 * ����1�����ݿ��������е�partition����
	 * ʱ�临�Ӷ�:O(n)
	 * @param input
	 * @return ��С��k����
	 * @throws Exception 
	 */
	public static int[] getLeastNums1(int[] input,int k) throws Exception{
		if(input==null)
			throw new Exception("The input are empty.");
		if(k>input.length)
			throw new Exception("k is greater than input.length.");
		if(k<=0)
			throw new Exception("k should greater than 0.");
		int index = QuickSort.partition(input, 0, input.length-1);
		while(index!=k-1){
			if(index>k-1)
				QuickSort.partition(input, 0, index-1);
			else
				QuickSort.partition(input, index+1, input.length-1);
		}
		int[] output = new int[k];
		for (int i = 0; i < k; i++) {
			output[i] = input[i];
		}
		return output;
	}
	/**
	 * ����2�����ݹ������ѵķ���
	 * @param input
	 * @param k
	 * @return ��С��k����
	 * @throws Exception
	 */
	public static int[] getLeastNums2(int[] input, int k) throws Exception{
		if(input==null)
			throw new Exception("The input are empty.");
		if(k>input.length)
			throw new Exception("k is greater than input.length.");
		if(k<=0)
			throw new Exception("k should greater than 0.");
		int[] output = new int[k];	//��������k�����Ŀ�����
		int i = 0;
		for (; i < k; i++) {		//��ʼ��output����
			output[i] = input[i];
		}
		/*
		 * ��output�������ѻ���
		 * output[0]������output��������
		 */
		HeapSortUtils.buildMaxHeap(output);	
		/*
		 * ����input���飬�����С��k����
		 */
		while(i<input.length){
			if(input[i]<output[0]){
				output[0] = input[i];
			}
			HeapSortUtils.buildMaxHeap(output);
			i++;
		}
		return output;
	}
}	
