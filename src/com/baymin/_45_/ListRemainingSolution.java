package com.baymin._45_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 圆圈中最后剩下的数字
 * @author Baymin
 * @date 2016年8月10日
 */
public class ListRemainingSolution {
	/**
	 * 经典方法：模拟环形链表
	 * @param n	生成从0开始的n个数
	 * @param m	删除第m个数字
	 * @return	剩余的数字
	 */
	public static int lastRemaining(int n,int m){
		if(n<1 || m<1)
			return -1;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			list.addLast(i);
		}
		int removeIndex = 0;
		while(list.size()>1){
			for (int i = 1; i < m; i++) {
				// 保证每次的removeIndex循环遍历list
				removeIndex = (removeIndex+1)%list.size();
			}
			list.remove(removeIndex);
		}
		return list.get(0);
	}
	/**
	 * 方法2:循环
	 * @param n	生成从0开始的n个数
	 * @param m	删除第m个数字
	 * @return	剩余的数字
	 */
	public static int lastRemaining2(int n, int m){
		if(n<1||m<1)
			return -1;
		int last = 0;
		for (int i = 2; i <= n; i++) {
			last = (last+m)%i;
		}
		return last;
	}
	/**
	 * 方法3：递归
	 * @param n	生成从0开始的n个数
	 * @param m	删除第m个数字
	 * @return	剩余的数字
	 */
	public static int lastRemainRecurr(int n,int m){
		if(n<1||m<1)
			return -1;
		if(n==1)
			return 0;
		return (lastRemainRecurr(n-1, m)+m)%n;
	}
}
