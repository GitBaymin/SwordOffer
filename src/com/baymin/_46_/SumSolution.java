package com.baymin._46_;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SumSolution {
	public int terminator(int n){
		return 0;
	}
	public int sum(int n) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		list.add(false);
		list.add(true);
		Method[] methods = this.getClass().getMethods();
		int index = list.indexOf(n==0);
		return n+(Integer)methods[index].invoke(this, (--n));
	}
}
