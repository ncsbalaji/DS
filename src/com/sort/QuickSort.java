package com.sort;

public class QuickSort {
	
	private int[] array;
	private int length;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[] = {1, 12, 5, 26, 7, 14, 3, 7, 2};
		QuickSort quickSort = new QuickSort();
		quickSort.sort(inputArray);
		
		for(int i: quickSort.array){
			System.out.print(i+ " ");
		}
	}

	public void sort(int[] inputArray){
		if(inputArray==null || inputArray.length==0){
			return;
		}
		this.array = inputArray;
		length = inputArray.length;
		
		quickSort(0, length-1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {
		// TODO Auto-generated method stub
		
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[(higherIndex + lowerIndex)/2];
		
		while(i <= j){
			
			while(array[i] < pivot){
				i++;
			}
			
			while(array[j] > pivot){
				j--;
			}
			
			// exchange both elements 
			if(i <= j){
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				i++;
				j--;
			}
			
		}
		
		if(lowerIndex < j){
			quickSort(lowerIndex, j);
		}
		if(i < higherIndex){
			quickSort(i, higherIndex);
		}
		
	}
}
