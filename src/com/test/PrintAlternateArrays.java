package com.test;

public class PrintAlternateArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = {1,23,4,5,6,7,1, 1,2,3, 4,5};
		int array2[] = {56,2,3,8,12,32, 1,2,3, 4,5};
		
		int count = Math.max(array1.length, array2.length);
		
		for(int i=0; i< (count); i++){
			if(i < array1.length){
				System.out.print(" "+array1[i]);
			}
			if(i < array2.length){
				System.out.print(" "+array2[i]);
			}
		}
		
	}

}
