package com.baymin._32_;
/**
 * ��1��N������1���ֵĴ���
 * @author Baymin
 * @date 2016��8��3��
 */
public class NumberOf1Between1AndNSolution {
	/**
	 * һ������1�ĸ���
	 * @param num
	 * @return
	 */
	public static int numberOf1(int num){
		int count = 0;
		while(num>0){
			if(num%10==1)
				count++;
			num = num/10;
		}
		return count;
	}
	/**
	 * ����1�����淽:
	 * ʱ�临�Ӷȣ�O(n*logn)
	 * @param num
	 * @return
	 */
	public static int numOf1Between1AndN(int num){
		int count = 0;
		for (int i = 1; i <= num; i++) {
			count+=numberOf1(i);
		}
		return count;
	}
	/**
	 * 10��num����
	 * @param num
	 * @return
	 */
	public static int powerBase10(int num){
		int result = 1;
		for (int i = 0; i < num; i++) {
			result *= 10;
		}
		return result;
	}
	/**
	 * ����2���ݹ�ʵ��
	 * ʱ�临�Ӷȣ�O(logn)
	 * @param num
	 * @return
	 */
	public static Integer numOf1Recursion(String num){
		if(num==null){
			System.out.println("The array is ");
			return null;
		}
		int length = num.length();
		
		int first = num.charAt(0)-'0';
		if(length==1 && first ==0)
			return 0;
		if(length==1 && first >0)
			return 1;
		/*
		 * ����������abcde
		 * numFirstDigit�����λ����Ϊ1ʱ�Ĵ���
		 * 1.���a>1������ÿһλ����0-9ʮ�����ֿ���ѡ��,��numFirstDigit = powerBase10(length-1)
		 * 2.���a=1��numFirstDigit=bcde+1
		 */
		int numFirstDigit = 0;
		if(first>1)
			numFirstDigit = powerBase10(length-1);
		else if(first == 1)
			numFirstDigit = Integer.parseInt(num.substring(1))+1;
		else
			;
		/*
		 * ��bcde+1~abcde��Χ�У����λ����1������£�ʣ��λ��Ϊ1�Ĵ���
		 * �������λ��ʣ��length-1λ������ÿһλ�������趨Ϊ1��Ȼ�������Ķ�����ȡ0~9��Χ�����֣�
		 * �������λ������ȡ0,2,3,...,a(a<10),��a��������ѡ��
		 * ����,numOtherDigits = first*(length-1)*powerBase10(length-2);
		 */
		int numOtherDigits = first*(length-1)*powerBase10(length-2);
		/*
		 * ��ʣ�෶Χ1~bcde����1���ֵĴ������Ϳ��Եݹ�ʵ����
		 */
		int numRecursive = numOf1Recursion(num.substring(1));
		
		return numFirstDigit+numOtherDigits+numRecursive;
			
	}
	public static void main(String[] args) throws Exception {
		System.out.println(numOf1Between1AndN(132));
		System.out.println(numOf1Recursion("132"));
	}

}
