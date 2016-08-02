package com.baymin._28_;
/**
 * 字符串的全排列
 * @author Baymin
 * @date 2016年8月2日
 */
public class PermutationOfChars {
	/**
	 * 字符串的全排列方法
	 * @param c
	 * @param begin
	 */
	public static void permutation(char[] c,int begin){
		if(c==null)
			return ;
		if(begin==c.length)
			System.out.println(c);
		else{
			for (int i = begin; i < c.length; i++) {
				//所有可能出现在第一个位置的字符
				char temp = c[i];
				c[i] = c[begin];
				c[begin] = temp;
				//递归
				permutation(c, begin+1);
				//固定一个字符，求后面所有字符的全排列
				temp = c[i];
				c[i] = c[begin];
				c[begin] = temp;
			}
		}
			
	}
	public static void main(String[] args) {
		String s = "abc";
		char[] c = s.toCharArray();
		
		permutation(c, 0);
	}

}
