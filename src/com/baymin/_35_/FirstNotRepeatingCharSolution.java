package com.baymin._35_;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 第一个只出现一次的字符
 * @author Baymin
 * @date 2016年8月4日
 */
public class FirstNotRepeatingCharSolution {
	/**
	 * 第一个只出现一次的字符方法
	 * @param chars
	 * @return 第一个只出现一次的字符
	 */
	public static Character firstNotRepeatingChar(char[] chars){
		if(chars==null){
			System.out.print("The chars is ");
			return null;
		}
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		/*
		 * 遍历字符数组，将每个字符加入map中，第一次加入该字符value值是1，
		 * 之后每次加入相同字符，相应value值加1
		 */
		for (int i = 0; i < chars.length; i++) {
			if(map.containsKey(chars[i])){
				int value = map.get(chars[i])+1;
				map.put(chars[i], value);
				continue;
			}
			map.put(chars[i], 1);
		}
		Character ch = null;//用来存储第一个只出现一次的字符
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
