package com.baymin._41_;

import java.util.LinkedList;

/**
 * 和为sum的两个数字
 * @author Baymin
 * @date 2016年8月9日
 */
public class FindNumberWithSpecificSumSolution {
	public static LinkedList<Integer> findNumWithSpecificSum(int[] data,int sum){
		if(data==null){
			System.out.print("The data is ");
			return null;
		}
		int right = data.length-1;
		int left = 0;
		int currSum = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		while(right>left){
			currSum = data[left] + data[right];
			if(currSum==sum){
				list.addLast(data[left]);
				list.addLast(data[right]);
				break;
			}else if(currSum>sum){
				right--;
			}else
				left++;
		}
		if(right<=left)
			return null;
		return list;
	}
}
