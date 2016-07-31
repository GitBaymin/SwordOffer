package com.baymin._22_;

import java.util.Stack;
/**
 * 面试题22：栈的压入和弹出序列
 * @author Baymin
 * @date 2016年7月31日
 */
public class IsPopOrderDemo {
	/**
	 * 输入两个整数序列，第一个序列表示栈的压入顺序，
	 * 判断第二个序列是否为该栈的弹出顺序。
	 * @param pushNum	压入顺序
	 * @param popNum	弹出顺序
	 * @return			是否是
	 */
	public static boolean isPopOrder(Integer[] pushNum,Integer[] popNum){
		boolean isOrder = false;
		if(pushNum!=null && popNum!=null){
			int indexInPushNum = 0;
			int indexInPopNum = 0;
			Stack<Integer> s = new Stack<Integer>();	//辅助栈
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
