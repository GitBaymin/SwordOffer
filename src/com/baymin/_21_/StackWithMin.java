package com.baymin._21_;

import java.util.Stack;

/**
 * ����min������ջ
 * @author Baymin
 * @date 2016��7��30��
 */
public class StackWithMin {
	/**
	 * push����
	 * @param data
	 * @param minData
	 * @param i
	 */
	public static void pushMin(Stack<Integer> data,Stack<Integer> minData,Integer i){
		data.push(i);
		if(minData.size()==0||i<minData.peek())
			minData.push(i);
		else
			minData.push(minData.peek());
	}
	/**
	 * pop����
	 * @param data
	 * @param minData
	 */
	public static void popMin(Stack<Integer> data,Stack<Integer> minData){
		data.pop();
		minData.pop();
	}
	/**
	 * ������Сֵ����
	 * @param minData
	 * @return
	 */
	public static Integer min(Stack<Integer> minData){
		return minData.pop();
	}
	public static void main(String[] args) {
		Stack<Integer> data = new Stack<Integer>();
		Stack<Integer> minData = new Stack<Integer>();
		pushMin(data, minData, 6);
		pushMin(data, minData, 2);
		pushMin(data, minData, 3);
		pushMin(data, minData, 4);
		for (Integer i : data) {
			System.out.print(i+" ");
		}
		System.out.println();
		popMin(data, minData);
		for (Integer i : data) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(min(minData));
	}

}
