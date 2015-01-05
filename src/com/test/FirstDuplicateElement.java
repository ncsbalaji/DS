package com.test;

import java.util.HashSet;

public class FirstDuplicateElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {2,3,4,5,21,3,4,5};
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i< intArray.length; i++){
			if(set.contains(intArray[i])){
				System.out.println("Repeated Element is "+intArray[i]);
			} else {
				set.add(intArray[i]);
			}
		}
		
	}

}
