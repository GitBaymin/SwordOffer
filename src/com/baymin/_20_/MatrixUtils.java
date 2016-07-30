package com.baymin._20_;
/**
 * ���󹤾���
 * @author Baymin
 * @date 2016��7��30��
 */
public class MatrixUtils {
	/**
	 * ˳ʱ���ӡһȦ����
	 * @param nums 		����
	 * @param columns	��������
	 * @param rows		��������
	 * @param start		��ʼ��ӡλ��
	 */
	public static void printMatrixInCircle(int[][] nums,int columns,int rows,int start){
		int endCol = columns - 1 - start;
		int endRow = rows - 1 - start;
		
		//�������Ҵ�ӡһ��
		for (int i = start; i <= endCol; i++) {
			int num = nums[start][i];
			System.out.print(num+" ");
		}
		//�������´�ӡһ��
		if(start<endRow){
			for(int i = start +1;i<=endRow;i++){
				int num = nums[i][endCol];
				System.out.print(num+" ");
			}
		}
		//���������ӡһ��
		if(start<endCol && start<endRow){
			for(int i=endCol-1;i>=start;i--){
				int num = nums[endRow][i];
				System.out.print(num+" ");
			}
		}
		//�������ϴ�ӡһ��
		if(start<endCol && start < endRow-1){
			for(int i = endRow - 1;i>=start+1;i--){
				int num = nums[i][start];
				System.out.print(num+" ");
			}
		}
	}
	/**
	 * ѭ����ӡ����
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
