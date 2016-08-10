package com.baymin._44_;

public class Test {
	public static void main(String[] args) throws Exception {
		int[] numbers = { 1, 2, 0, 3, 0, 5 };

		System.out.println(IsContinousSolution.isContinuous(numbers));
		for (int i : numbers) {
			System.out.print(i+" ");
		}
	}
}
