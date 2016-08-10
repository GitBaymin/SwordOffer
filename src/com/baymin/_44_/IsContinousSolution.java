package com.baymin._44_;
/**
 * 扑克牌的顺子
 * @author Baymin
 * @date 2016年8月10日
 */
public class IsContinousSolution {
	public static boolean isContinuous(int[] numbers) throws Exception{
		if(numbers==null)
			return false;
		QuickSort.sort(numbers, 0, numbers.length-1);
		int numberOfZero = 0;
		int numberOfGap = 0;
		
		// 统计数组中零的数目
		for (int i = 0; i < numbers.length ; i++) {
			if(numbers[i]==0)
				++numberOfZero;
		}
		
		// 统计数组中间隔的数目
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
