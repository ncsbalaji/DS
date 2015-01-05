package com.test;

public class StringReversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdefghijkl";
		System.out.println(reverse(s1));
	}
	
	static String reverse(String s1){
		if(s1.length()==1){
			return s1;
		} else {
			return reverse(s1.substring(1))+s1.charAt(0);
		}
	}

}
