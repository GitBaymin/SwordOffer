package com.baymin._14_;
/**
 * 调整数组顺序
 * @author BaiXue
 * @date 2016年7月23日
 */
public class Reorder {
	/**
	 * 调整数组顺序的静态方法
	 * @param array
	 * @return
	 * @throws Exception 
	 */
	public static int[] reordeMethod(int[] array) throws Exception{
		if(array==null){
			throw new Exception("The array is null");
		}
		if(array.length==0){
			return array;
		}
		int beginIndex = 0;
		int tailIndex = array.length - 1;
		while(beginIndex<tailIndex){
			while(beginIndex<tailIndex && (!isEven(array[beginIndex]))){
				beginIndex++;
			}
			while(beginIndex<tailIndex && isEven(array[tailIndex])){
				tailIndex--;
			}
			if(beginIndex < tailIndex){
				int temp = array[beginIndex];
				array[beginIndex] = array[tailIndex];
				array[tailIndex] = temp;
			}
		}
	return array;
	}
	public static boolean isEven(int array){
		return ((array & 0x1)==0);
	}
	/**
	 * 判断是否为偶数
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		int[] array = {};
		System.out.println(array.length);
		int[] reN = reordeMethod(array);
		for (int i : reN) {
			System.out.print(i+" ");
		}
	}
}
