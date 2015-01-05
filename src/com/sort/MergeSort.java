package com.sort;

public class MergeSort {

	private int[] array;
	private int[] tempMergArray;
	private int length;
	int j;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {45, 23,11,89,77,98,4,28,65,43, 100};
		
		new MergeSort().sort(inputArray);
		for(int i=0; i < inputArray.length; i++){
			System.out.print(inputArray[i]+" ");
		}
	}

	public void sort(int inputArray[]){
		this.array = inputArray;
		this.length = inputArray.length;
		tempMergArray = new int[length];
		doMergeSort(0, length - 1);
	}

	public void doMergeSort(int lowerIndex, int higherIndex){
		if(lowerIndex < higherIndex){
			int middle = (lowerIndex + higherIndex )/2;
			doMergeSort(lowerIndex, middle);
			doMergeSort(middle + 1, higherIndex);
			mergeParts(lowerIndex, middle, higherIndex);
		}

	}

	public void mergeParts(int lowerIndex, int middle, int higherIndex){
		System.out.println("mergeParts() lowerIndex: "+ lowerIndex + " middle: "+middle+" higherIndex: "+higherIndex);
		for(int i = lowerIndex; i<= higherIndex; i++){
			tempMergArray[i] = array[i];
		}

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while(i <=  middle && j <= higherIndex){
			if(tempMergArray[i] <= tempMergArray[j]){
				array[k] = tempMergArray[i];
				i++;
			} else{
				array[k] = tempMergArray[j];
				j++;
			}
			k++;
		}

		while(i <= middle){
			array[k] = tempMergArray[i];
			System.out.println(array[k]+ " "+ k);
			i++;
			k++;
		}
	}
}
