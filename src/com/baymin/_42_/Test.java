package com.baymin._42_;


public class Test {
	public static void main(String[] args) {
		String s = "I am a student.";
		char[] ch = s.toCharArray();
	
		ReverseUtils.reverseSenteceMethod(ch);
		for (char c : ch) {
			System.out.print(c);
		}
		System.out.println("\n-------------");
		String s1 = "abcdef";
		char[] ch1 = s1.toCharArray();
		ReverseUtils.leftRotateString(ch1, 2);
		for (char c : ch1) {
			System.out.print(c+" ");
		}
	}
}
