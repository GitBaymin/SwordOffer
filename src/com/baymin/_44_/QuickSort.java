package com.baymin._44_;
/**
 * ��������
 * @author Baymin
 * @date 2016��8��2��
 */
public class QuickSort {
	/**
	 * �ֿ鷽��
	 * @param data	Ҫ���������
	 * @param left	�������
	 * @param right	�ұ�����
	 * @return		�ֿ���ɺ������ֵ
	 * @throws Exception
	 */
	public static int partition(int[] data,int left,int right) throws Exception{
		if(data==null||left<0||right>=data.length)
			throw new Exception("the input parameters are not right");
		int key = data[left];
		while(left<right){
			while(left<right && data[right]>=key)
				right--;
			data[left]= data[right];
			while(left<right && data[left]<=key)
				left++;
			data[right] = data[left];
		}
		data[left] = key;
		return left;
	}
	/**
	 * �������򷽷�
	 * @param data	Ҫ���������
	 * @param left	�������
	 * @param right	�ұ�����
	 * @throws Exception
	 */
	public static void sort(int[] data,int left,int right) throws Exception{
		if(left<right){
			int result = partition(data, left, right);
			sort(data,left,result-1);
			sort(data, result+1, right);
		}
	}
}
