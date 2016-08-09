package com.baymin._40_;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		int[] nums = {2,4,3,6,3,2,5,5};
		Map<String, Integer> map = FindNumsAppearOnceSolution.findNumsAppearOnce(nums);
		Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, Integer> entry =  (Entry<String, Integer>) iter.next();
			System.out.print(entry.getKey()+":");
			System.out.println(entry.getValue());
		}
	}

}
