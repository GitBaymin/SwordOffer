package com.baymin._22_;

import java.util.Stack;
/**
 * ������22��ջ��ѹ��͵�������
 * @author Baymin
 * @date 2016��7��31��
 */
public class IsPopOrderDemo {
	/**
	 * ���������������У���һ�����б�ʾջ��ѹ��˳��
	 * �жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
	 * @param pushNum	ѹ��˳��
	 * @param popNum	����˳��
	 * @return			�Ƿ���
	 */
	public static boolean isPopOrder(Integer[] pushNum,Integer[] popNum){
		boolean isOrder = false;
		if(pushNum!=null && popNum!=null){
			int indexInPushNum = 0;
			int indexInPopNum = 0;
			Stack<Integer> s = new Stack<Integer>();	//����ջ
			while(indexInPopNum<popNum.length){
				while(s.isEmpty() || s.peek()!=popNum[indexInPopNum]){
					if(indexInPushNum==pushNum.length)
						break;
					s.push(pushNum[indexInPushNum]);
					indexInPushNum++;
				}
				if(s.peek()!=popNum[indexInPopNum])
					break;
				s.pop();
				indexInPopNum++;
			}
			if(s.isEmpty() && indexInPopNum==popNum.length)
				isOrder = true;
		}
		return isOrder;
	}
	public static void main(String[] args) {
		Integer[] pushNum = {1,2,3,4,5};
		Integer[] popNum1 = {4,5,3,2,1};
		Integer[] popNum2 = {4,3,5,1,2};
		
		System.out.println(isPopOrder(pushNum, popNum1));
		System.out.println(isPopOrder(pushNum, popNum2));
		
	}

}
