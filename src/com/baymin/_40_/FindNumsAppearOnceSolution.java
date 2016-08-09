package com.baymin._40_;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 数组中只出现一个的数字
 * 
 * @author Baymin
 * @date 2016年8月7日
 */
public class FindNumsAppearOnceSolution {
	public static int isBit1(int num, int indexBit) {
		num = num >> indexBit;
		return (num & 0x1);
	}

	public static int findFirstBitIs1(int num) {
		int indexBit = 0;
		while (((num & 1) == 0)
				&& indexBit < ((Integer) indexBit).toString().length()) {
			num = num >> 1;
			++indexBit;
		}
		return indexBit;
	}

	public static Map<String, Integer> findNumsAppearOnce(int data[]) {
		if (data == null)
			return null;
		int resultExclusiveOR = 0;
		for (int i = 0; i < data.length; i++) {
			resultExclusiveOR ^= data[i];
		}
		int indexOf1 = findFirstBitIs1(resultExclusiveOR);
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < data.length; i++) {
			if(isBit1(data[i], indexOf1)>0){
				num1 ^= data[i];
			}else
				num2 ^= data[i];
		}
		map.put("num1", num1);
		map.put("num2", num2);
		return map;
	}
}
