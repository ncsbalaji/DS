package com.list;

public class TestSinglyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList();
		
		for(int i=0; i< 10; i++){
			SinglyLinkedListNode node = new SinglyLinkedListNode(i);
			list.addLast(node);
		}
		
		list.traverse();
	}

}
