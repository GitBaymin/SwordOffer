package com.baymin._30_;
/**
 * ����������30
 * ����1����
 * ����2����
 * @author Baymin
 * @date 2016��8��3��
 */
public class Test {
	public static void main(String[] args) throws Exception {
		int[] input = {4,5,1,6,2,7,3,8};
		System.out.println("------Method 1--------");
		int[] output1 = GetLeastNumbersUtils.getLeastNums1(input, 4);
		for (int i = 0; i < output1.length; i++) {
			System.out.print(output1[i]+" ");
		}
		System.out.println("\n------Method 2--------");
		int[] output2 = GetLeastNumbersUtils.getLeastNums2(input, 4);
		for (int i = 0; i < output2.length; i++) {
			System.out.print(output2[i]+" ");
		}
	}
}
