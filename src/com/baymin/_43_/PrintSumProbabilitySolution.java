package com.baymin._43_;
/**
 * 所有n个骰子的点数之和的概率
 * @author Baymin
 * @date 2016年8月9日
 */
public class PrintSumProbabilitySolution {
	static final int MAX_VALUE = 6;
	public static void printProbability(int number){
		if(number<1)
			return;
		int maxSum = number * MAX_VALUE;
		/*
		 * sumProba:所有骰子和的值组成的数组
		 * maxSum:表示number个骰子的最大和
		 * number:表示骰子的个数以及最小和
		 */
		int[] sumProba = new int[maxSum-number+1];
		// 初始化数组
		for (int i = 0; i < sumProba.length; i++) {
			sumProba[i] = 0;
		}
		// 第一个骰子和number-1个骰子
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
		 * 将和sum放在sum-original位置
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
		// 最大值是number*MAX_VALUE，数组要多加1
		int[][] sumProba = new int[2][number*MAX_VALUE+1];
		// 初始化
		for (int i = 0; i < number*MAX_VALUE+1; i++) {
			sumProba[0][i] = 0;
			sumProba[1][i] = 0;
		}
		int flag = 0;
		// 一个骰子时，各个和的个数
		for (int i = 1; i <= MAX_VALUE; i++) {
			sumProba[flag][i] = 1;
		}
		// 从第2个骰子到第number个骰子
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
