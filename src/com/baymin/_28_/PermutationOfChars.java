package com.baymin._28_;
/**
 * �ַ�����ȫ����
 * @author Baymin
 * @date 2016��8��2��
 */
public class PermutationOfChars {
	/**
	 * �ַ�����ȫ���з���
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
				//���п��ܳ����ڵ�һ��λ�õ��ַ�
				char temp = c[i];
				c[i] = c[begin];
				c[begin] = temp;
				//�ݹ�
				permutation(c, begin+1);
				//�̶�һ���ַ�������������ַ���ȫ����
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
