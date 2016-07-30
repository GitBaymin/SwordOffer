package com.baymin._20_;
/**
 * ����
 * @author Baymin
 * @date 2016��7��30��
 */
public class MatrixClockwiseTest {

	public static void main(String[] args) {
		int[][] num1 = {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		int[][] num2 = {{1,2,3}};
		int[][] num3 = {{1},{2},{3}};
		MatrixUtils.printMatrixClockwise(num1, 4, 4);
		System.out.println();
		MatrixUtils.printMatrixClockwise(num2, 3, 1);
		System.out.println();
		MatrixUtils.printMatrixClockwise(num3, 1, 3);
	}

}
