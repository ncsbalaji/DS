package com.sort;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = {4, 2, 9, 6, 23, 12, 34, 0, 1};
		SelectionSort sort = new SelectionSort();
		sort.sort(inputArr);
		for(int i : inputArr){
			System.out.print(i+" ");
		}

	}
	
	public void sort(int [] inputArr){
		int i, j, minIndex;

		for(i = 0; i< inputArr.length ; i++){
			minIndex = i;
			for(j = i; j < inputArr.length ; j++){

				if(inputArr[i] <= inputArr[j]){
					minIndex = i;
				} else{
					minIndex = j;
				}

				System.out.println("minIndex "+ minIndex);

				if(i != minIndex){
					int temp = inputArr[minIndex];
					inputArr[minIndex] = inputArr[i];
					inputArr[i] = temp;
				}
			}
		}
	}

}
