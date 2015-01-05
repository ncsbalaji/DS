package com.test;

public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArray = {1,2,3,3,3,4,4,5,5,5,6,6,6,7,7};
		
		int i = 0, j = 1;
		
		while(i < intArray.length && j < intArray.length){
			if(intArray[i]==intArray[j]){
				j++;
			}else{
				i++;
				intArray[i] = intArray[j];
				j++;
			}
		}
		
		for(int k =0; k< i+1; k++){
			System.out.print(" "+intArray[k]);
		}
	}

}
