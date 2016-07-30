package com.baymin._20_;
/**
 * 矩阵工具类
 * @author Baymin
 * @date 2016年7月30日
 */
public class MatrixUtils {
	/**
	 * 顺时针打印一圈矩阵
	 * @param nums 		矩阵
	 * @param columns	矩阵列数
	 * @param rows		矩阵行数
	 * @param start		开始打印位置
	 */
	public static void printMatrixInCircle(int[][] nums,int columns,int rows,int start){
		int endCol = columns - 1 - start;
		int endRow = rows - 1 - start;
		
		//从左往右打印一行
		for (int i = start; i <= endCol; i++) {
			int num = nums[start][i];
			System.out.print(num+" ");
		}
		//从上向下打印一列
		if(start<endRow){
			for(int i = start +1;i<=endRow;i++){
				int num = nums[i][endCol];
				System.out.print(num+" ");
			}
		}
		//从右往左打印一行
		if(start<endCol && start<endRow){
			for(int i=endCol-1;i>=start;i--){
				int num = nums[endRow][i];
				System.out.print(num+" ");
			}
		}
		//从下向上打印一列
		if(start<endCol && start < endRow-1){
			for(int i = endRow - 1;i>=start+1;i--){
				int num = nums[i][start];
				System.out.print(num+" ");
			}
		}
	}
	/**
	 * 循环打印矩阵
	 * @param nums
	 * @param columns
	 * @param rows
	 */
	public static void printMatrixClockwise(int[][] nums,int columns,int rows){
		if(nums==null||columns<=0||rows<=0){
			return;
		}
		int start = 0;
		while(columns>start*2 && rows>start*2){
			printMatrixInCircle(nums, columns, rows, start);
			start++;
		}
	}
}
