package com.baymin._33_;
/**
 * 快速排序
 * @author Baymin
 * @date 2016年8月2日
 */
public class QuickSort {
	/**
	 * 两个字符串拼接顺序不同，判断哪个拼接的字符串大，哪个拼接的字符串小
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
	 * 如果s1+s2<s2+s1，那么定义s1小于s2
	 * 如果s1+s2>s2+s1，那么定义s1大于s2
	 * 将定义的小值字符串放在数组左边，定义的大值字符串放在数组右边
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
	 * 按定义的从小值到大值的顺序返回数组
	 * 然后顺序打印就是数组排成的最小值
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
