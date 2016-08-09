package com.baymin._41_;
/**
 * ��ӡ���к�Ϊsum��������������
 * @author Baymin
 * @date 2016��8��9��
 */
public class FindContinuousSequenceSolution {
	public static void findContinuousSequence(int sum){
		if(sum<3){
			System.out.println("There is none.");
			return;
		}
		int small = 1;
		int big = 2;
		int middle = (sum+1)/2;
		int currSum = small + big;
		while(small<middle){
			if(currSum==sum)
				print(small, big);
			while(currSum>sum && small<middle){
				currSum -= small;
				small ++;
				if(currSum==sum)
					print(small, big);
			}
			big++;
			currSum += big;
		}
	}
	
	public static void print(int small,int big){
		for (int i = small; i <= big; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
