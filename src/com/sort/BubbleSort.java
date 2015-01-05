package com.sort;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {1, 5, 9, 10, 3, 7, 3, 4, 4, 17};
		new BubbleSort().bubbleSort(inputArray);
		for(int i : inputArray){
			System.out.print(i+" ");
		}
	}
	
	public void bubbleSort(int[] inputArray){
		boolean swapped = true;
		int j = 0;
		int temp;

		while(swapped){
			j++;
			swapped = false;
			for(int i = 0; i < inputArray.length - j; i++){
				if(inputArray[i] > inputArray[i+1]){
					//swap both elements
					temp = inputArray[i+1];
					inputArray[i+1] = inputArray[i];
					inputArray[i] = temp;
					swapped = true;
				}
			}
		}
	}

}
