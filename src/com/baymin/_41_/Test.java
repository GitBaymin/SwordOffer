package com.baymin._41_;

import java.util.LinkedList;

/**
 * ����
 * @author Baymin
 * @date 2016��8��9��
 */
public class Test {

	public static void main(String[] args) {
		int[] data = {1,2,4,7,11,15};
		LinkedList<Integer> list = FindNumberWithSpecificSumSolution.findNumWithSpecificSum(data, 15);
		if(list==null){
			System.out.println("There is none.");
			return;
		}
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
		System.out.println("-----------------");
		FindContinuousSequenceSolution.findContinuousSequence(15);
	}

}
