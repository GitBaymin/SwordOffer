package com.baymin._43_;
/**
 * ����n�����ӵĵ���֮�͵ĸ���
 * @author Baymin
 * @date 2016��8��9��
 */
public class PrintSumProbabilitySolution {
	static final int MAX_VALUE = 6;
	public static void printProbability(int number){
		if(number<1)
			return;
		int maxSum = number * MAX_VALUE;
		/*
		 * sumProba:�������Ӻ͵�ֵ��ɵ�����
		 * maxSum:��ʾnumber�����ӵ�����
		 * number:��ʾ���ӵĸ����Լ���С��
		 */
		int[] sumProba = new int[maxSum-number+1];
		// ��ʼ������
		for (int i = 0; i < sumProba.length; i++) {
			sumProba[i] = 0;
		}
		// ��һ�����Ӻ�number-1������
		for (int sum = 1; sum <= MAX_VALUE; sum++) {
			sumProbability(number, number, sum, sumProba);
		}
		int total = (int) Math.pow(MAX_VALUE, number);
		for (int i = 0; i < sumProba.length; i++) {
			float ratio = (float)sumProba[i]/total;
			System.out.print("The probability of sum "+(i+number)+" is:"+ratio);
			System.out.println();
		}
	}
	
	public static void sumProbability(int original,int current,int sum,int[] sumProba){
		/*
		 * ����sum����sum-originalλ��
		 */
		if(current==1)
			sumProba[sum-original]++;
		else{
			for(int i=1;i<=MAX_VALUE;i++){
				sumProbability(original, current-1, sum+i, sumProba);
			}
		}
	}
	
	public static void printProbability2(int number){
		if(number<1)
			return;
		// ���ֵ��number*MAX_VALUE������Ҫ���1
		int[][] sumProba = new int[2][number*MAX_VALUE+1];
		// ��ʼ��
		for (int i = 0; i < number*MAX_VALUE+1; i++) {
			sumProba[0][i] = 0;
			sumProba[1][i] = 0;
		}
		int flag = 0;
		// һ������ʱ�������͵ĸ���
		for (int i = 1; i <= MAX_VALUE; i++) {
			sumProba[flag][i] = 1;
		}
		// �ӵ�2�����ӵ���number������
		for(int k=2;k<=number;++k){
			for(int i = 0;i<k;++i){
				sumProba[1-flag][i] = 0;
			}
			for(int i = k;i<=MAX_VALUE * k;++i){
				sumProba[1-flag][i] = 0;
				for(int j = 1;j<=i && j<= MAX_VALUE;++j){
					sumProba[1-flag][i] += sumProba[flag][i-j];
				}
			}
			flag = 1-flag;
		}
		
		float total = (float) Math.pow(MAX_VALUE, number);
		for (int i = number; i <= MAX_VALUE*number; i++) {
			float ratio = (float)sumProba[flag][i]/total;
			System.out.print("The probability of sum "+(i)+" is:"+ratio);
			System.out.println();
		}
	}
}
