package com.baymin._33_;
/**
 * ��������
 * @author Baymin
 * @date 2016��8��2��
 */
public class QuickSort {
	/**
	 * �����ַ���ƴ��˳��ͬ���ж��ĸ�ƴ�ӵ��ַ������ĸ�ƴ�ӵ��ַ���С
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isSmall(String s1,String s2){
		String s1s2 = s1+s2;
		String s2s1 = s2+s1;
		boolean result = false;
		for (int i = 0; i < s1s2.length(); i++) {
			if(s1s2.charAt(i)<s2s1.charAt(i))
				return result = true;
			else if(s1s2.charAt(i)>s2s1.charAt(i))
				return result = false;
			else
				;
		}
		return result;
	}
	/**
	 * ���s1+s2<s2+s1����ô����s1С��s2
	 * ���s1+s2>s2+s1����ô����s1����s2
	 * �������Сֵ�ַ�������������ߣ�����Ĵ�ֵ�ַ������������ұ�
	 * @param data
	 * @param left
	 * @param right
	 * @return 
	 * @throws Exception
	 */
	public static int partition(int[] data,int left,int right) throws Exception{
		if(data==null||left<0||right>=data.length)
			throw new Exception("the input parameters are not right");
		int key = data[left];
		while(left<right){
			while(left<right && !isSmall(String.valueOf(data[right]),String.valueOf(key)))
				right--;
			data[left]= data[right];
			while(left<right && isSmall(String.valueOf(data[left]),String.valueOf(key)))
				left++;
			data[right] = data[left];
		}
		data[left] = key;
		return left;
	}
	/**
	 * ������Ĵ�Сֵ����ֵ��˳�򷵻�����
	 * Ȼ��˳���ӡ���������ųɵ���Сֵ
	 * @param data
	 * @param left
	 * @param right
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
