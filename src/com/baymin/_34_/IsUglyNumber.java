package com.baymin._34_;
/**
 * 丑数
 * @author Baymin
 * @date 2016年8月4日
 */
public class IsUglyNumber {
	/**
	 * 判断是否是丑数
	 * @param n
	 * @return
	 */
	public static boolean isUgly(int n){
		while(n%2==0)
			n/=2;
		while(n%3==0)
			n/=3;
		while(n%5==0)
			n/=5;
		return (n==1) ? true:false;
	}
	/**
	 * 方法1：逐个判断，得到第index个丑数
	 * @param index
	 * @return
	 */
	public static int getUglyNum(int index){
		if(index<0)
			return 0;
		int num=0;
		int count=0;
		while(count<index){
			num++;
			if(isUgly(num)){
				count++;
			}
		}
		return num;
	}
	/**
	 * 三个数中的最小数
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static int Min(int num1,int num2,int num3){
		int min = (num1<num2) ? num1:num2;
		min = (min<num3) ? min:num3;
		return min;
	}
	/**
	 * 方法2：只计算丑数，得到第index个丑数
	 * @param index
	 * @return
	 */
	public static int getUglyNum2(int index){
		if(index<0)
			return 0;
		int[] uglyNums = new int[index];
		uglyNums[0] = 1;
		int uglyIndex = 1;
		
		int[] uglyNumProduct2 = uglyNums;// 2的倍数的数组
		int[] uglyNumProduct3 = uglyNums;// 3的倍数的数组
		int[] uglyNumProduct5 = uglyNums;// 5的倍数的数组
		
		//三个数组的索引
		int uglyNumProduct2Index = 0;
		int uglyNumProduct3Index = 0;
		int uglyNumProduct5Index = 0;
		while(uglyIndex<index){
			//得到三个数中的最小值放在uglyNums数组中，这样就是有序的
			int minNum = Min(
					uglyNumProduct2[uglyNumProduct2Index]*2, 
					uglyNumProduct3[uglyNumProduct3Index]*3,
					uglyNumProduct5[uglyNumProduct5Index]*5); 
			uglyNums[uglyIndex] = minNum;
			//每次比较前需要将三个数组的索引初始化为零
			uglyNumProduct2Index = 0;
			uglyNumProduct3Index = 0;
			uglyNumProduct5Index = 0;
			//找出2倍数组中第一个大于已有最大丑数的数
			while(uglyNumProduct2[uglyNumProduct2Index]*2<=uglyNums[uglyIndex])
				uglyNumProduct2Index++;
			//找出3倍数组中第一个大于已有最大丑数的数
			while(uglyNumProduct3[uglyNumProduct3Index]*3<=uglyNums[uglyIndex])
				uglyNumProduct3Index++;
			//找出5倍数组中第一个大于已有最大丑数的数
			while(uglyNumProduct5[uglyNumProduct5Index]*5<=uglyNums[uglyIndex])
				uglyNumProduct5Index++;
			//有序丑数数组索引+1
			uglyIndex++;
		}
		return uglyNums[index-1];
	}
}
