package com.list;

public class SinglyLinkedList {
	
	public SinglyLinkedListNode head;
	public SinglyLinkedListNode tail;

	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
	}
	
	public void addLast(SinglyLinkedListNode newNode){
		if(newNode == null){
			return;
		} else{
			newNode.next = null;
			
			if(head == null){
				head = newNode;
				tail = newNode;
			} else{
				tail.next = newNode;
				tail = newNode;
			}
		}
	}
	
	public void addFirst(SinglyLinkedListNode newNode){
		if(newNode == null){
			return;
		} else{
			if(head == null){
				head = newNode;
				tail = newNode;
				newNode.next = null;
			} else{
				newNode.next = head;
				head = newNode;
			}
		}
	}
	
	public void insertAfter(SinglyLinkedListNode previousNode, SinglyLinkedListNode newNode){
		if(newNode == null){
			return;
		} else{
			if(previousNode == null){
				addFirst(newNode);
			} else if(previousNode.next == tail){
				addLast(newNode);
			} else{
				newNode.next = previousNode.next;
				previousNode.next = newNode;
			}
		}
	}

	public void traverse(){
		SinglyLinkedListNode current = head;
		while(current != null){
			System.out.println(" " + current.value);
			current = current.next;
		}
	}
}
