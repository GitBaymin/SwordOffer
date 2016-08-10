package com.baymin._44_;
/**
 * �˿��Ƶ�˳��
 * @author Baymin
 * @date 2016��8��10��
 */
public class IsContinousSolution {
	public static boolean isContinuous(int[] numbers) throws Exception{
		if(numbers==null)
			return false;
		QuickSort.sort(numbers, 0, numbers.length-1);
		int numberOfZero = 0;
		int numberOfGap = 0;
		
		// ͳ�������������Ŀ
		for (int i = 0; i < numbers.length ; i++) {
			if(numbers[i]==0)
				++numberOfZero;
		}
		
		// ͳ�������м������Ŀ
		int smallIndex = numberOfZero;
		int bigIndex = smallIndex+1;
		while(bigIndex<numbers.length){
			if(numbers[smallIndex]==numbers[bigIndex])
				return false;
			numberOfGap += numbers[bigIndex]-numbers[smallIndex] -1;
			smallIndex = bigIndex;
			++bigIndex;
		}
		return (numberOfGap>numberOfZero) ? false : true;
	}
}
