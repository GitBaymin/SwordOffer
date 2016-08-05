package com.baymin._35_;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * ��һ��ֻ����һ�ε��ַ�
 * @author Baymin
 * @date 2016��8��4��
 */
public class FirstNotRepeatingCharSolution {
	/**
	 * ��һ��ֻ����һ�ε��ַ�����
	 * @param chars
	 * @return ��һ��ֻ����һ�ε��ַ�
	 */
	public static Character firstNotRepeatingChar(char[] chars){
		if(chars==null){
			System.out.print("The chars is ");
			return null;
		}
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		/*
		 * �����ַ����飬��ÿ���ַ�����map�У���һ�μ�����ַ�valueֵ��1��
		 * ֮��ÿ�μ�����ͬ�ַ�����Ӧvalueֵ��1
		 */
		for (int i = 0; i < chars.length; i++) {
			if(map.containsKey(chars[i])){
				int value = map.get(chars[i])+1;
				map.put(chars[i], value);
				continue;
			}
			map.put(chars[i], 1);
		}
		Character ch = null;//�����洢��һ��ֻ����һ�ε��ַ�
		Iterator<Entry<Character, Integer>> iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Entry<Character, Integer> entry = iter.next();
			if(entry.getValue()==1){
				ch = entry.getKey();
				break;
			}
		}
		return ch;
	}
	public static void main(String[] args) {
		String s = "asbasdb";
		char[] chars= new char[s.length()];
		s.getChars(0, s.length(), chars, 0);
		System.out.println(firstNotRepeatingChar(chars));
	}

}
