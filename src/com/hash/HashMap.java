package com.hash;

public class HashMap {
	
	private static int TABLE_SIZE = 128;
	private HashEntry[] table;
	public HashMap(){
		table = new HashEntry[TABLE_SIZE];
		
	}

	public void put(int key, int value){
		int hash = key % TABLE_SIZE;
		
		while(table[hash] !=null && table[hash].getKey() != key){
			hash = (hash + 1) % TABLE_SIZE;
		}
		
		table[hash] = new HashEntry(key, value);
	}
	
	public int get(int key){
		int hash = key % TABLE_SIZE;
		
		while(table[hash] != null && table[hash].getKey() != key){
			hash = (hash + 1) % TABLE_SIZE;
		}
		
		if(table[hash]==null){
			return -1;
		} else {
			return table[hash].getValue();
		}
	}
	
}
