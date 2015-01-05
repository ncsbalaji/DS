package com.search;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[] = {1, 2, 3, 4, 10, 11, 100};
		System.out.println("binary search result "+ new BinarySearch().binarySearch(inputArray, 9));
	}

	public int binarySearch(int[] inputArray, int key){
		
		int mid, start = 0, end = inputArray.length-1;
		while(start <= end){
			mid = (start + end ) /2;
			if(inputArray[mid] == key){
				return mid;
			} else if(inputArray[mid] > key){
				end = mid - 1;
			} else if(inputArray[mid] < key){
				start = mid + 1;
			}
		}
		return -1;
		
	}
}
