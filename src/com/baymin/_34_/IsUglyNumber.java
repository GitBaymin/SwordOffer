package com.baymin._34_;
/**
 * ����
 * @author Baymin
 * @date 2016��8��4��
 */
public class IsUglyNumber {
	/**
	 * �ж��Ƿ��ǳ���
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
	 * ����1������жϣ��õ���index������
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
	 * �������е���С��
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
	 * ����2��ֻ����������õ���index������
	 * @param index
	 * @return
	 */
	public static int getUglyNum2(int index){
		if(index<0)
			return 0;
		int[] uglyNums = new int[index];
		uglyNums[0] = 1;
		int uglyIndex = 1;
		
		int[] uglyNumProduct2 = uglyNums;// 2�ı���������
		int[] uglyNumProduct3 = uglyNums;// 3�ı���������
		int[] uglyNumProduct5 = uglyNums;// 5�ı���������
		
		//�������������
		int uglyNumProduct2Index = 0;
		int uglyNumProduct3Index = 0;
		int uglyNumProduct5Index = 0;
		while(uglyIndex<index){
			//�õ��������е���Сֵ����uglyNums�����У��������������
			int minNum = Min(
					uglyNumProduct2[uglyNumProduct2Index]*2, 
					uglyNumProduct3[uglyNumProduct3Index]*3,
					uglyNumProduct5[uglyNumProduct5Index]*5); 
			uglyNums[uglyIndex] = minNum;
			//ÿ�αȽ�ǰ��Ҫ�����������������ʼ��Ϊ��
			uglyNumProduct2Index = 0;
			uglyNumProduct3Index = 0;
			uglyNumProduct5Index = 0;
			//�ҳ�2�������е�һ��������������������
			while(uglyNumProduct2[uglyNumProduct2Index]*2<=uglyNums[uglyIndex])
				uglyNumProduct2Index++;
			//�ҳ�3�������е�һ��������������������
			while(uglyNumProduct3[uglyNumProduct3Index]*3<=uglyNums[uglyIndex])
				uglyNumProduct3Index++;
			//�ҳ�5�������е�һ��������������������
			while(uglyNumProduct5[uglyNumProduct5Index]*5<=uglyNums[uglyIndex])
				uglyNumProduct5Index++;
			//���������������+1
			uglyIndex++;
		}
		return uglyNums[index-1];
	}
}
