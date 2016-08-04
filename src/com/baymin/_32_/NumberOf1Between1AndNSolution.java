package com.baymin._32_;
/**
 * 从1到N整数中1出现的次数
 * @author Baymin
 * @date 2016年8月3日
 */
public class NumberOf1Between1AndNSolution {
	/**
	 * 一个数中1的个数
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
	 * 方法1：常规方:
	 * 时间复杂度：O(n*logn)
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
	 * 10的num次幂
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
	 * 方法2：递归实现
	 * 时间复杂度：O(logn)
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
		 * 假设数字是abcde
		 * numFirstDigit是最高位数字为1时的次数
		 * 1.如果a>1，其他每一位都有0-9十个数字可以选择,故numFirstDigit = powerBase10(length-1)
		 * 2.如果a=1，numFirstDigit=bcde+1
		 */
		int numFirstDigit = 0;
		if(first>1)
			numFirstDigit = powerBase10(length-1);
		else if(first == 1)
			numFirstDigit = Integer.parseInt(num.substring(1))+1;
		else
			;
		/*
		 * 在bcde+1~abcde范围中，最高位不是1的情况下，剩余位数为1的次数
		 * 除了最高位，剩余length-1位，其中每一位都可以设定为1，然后其他的都可以取0~9范围的数字，
		 * 并且最高位还可以取0,2,3,...,a(a<10),即a个数可以选择
		 * 所以,numOtherDigits = first*(length-1)*powerBase10(length-2);
		 */
		int numOtherDigits = first*(length-1)*powerBase10(length-2);
		/*
		 * 在剩余范围1~bcde中求1出现的次数，就可以递归实现了
		 */
		int numRecursive = numOf1Recursion(num.substring(1));
		
		return numFirstDigit+numOtherDigits+numRecursive;
			
	}
	public static void main(String[] args) throws Exception {
		System.out.println(numOf1Between1AndN(132));
		System.out.println(numOf1Recursion("132"));
	}

}
