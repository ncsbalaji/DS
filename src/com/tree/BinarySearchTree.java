package com.tree;

public class BinarySearchTree {

	private BSTNode root;

	public BinarySearchTree() {
		root = null;
	}
	
	public boolean add(int value){
		if(root == null){
			root = new BSTNode(value);
			return true;
		} else{
			return root.add(value);
		}
	}
	
	public void printInOrder(BSTNode root){
		if(root == null){
			return;
		} else {
			printInOrder(root.left);
			System.out.println(root.value);
			printInOrder(root.right);
		}
	}
	
	public boolean remove(int value){
		if(root == null){
			return false;
		} else if(root.value == value){
			BSTNode auxNode = new BSTNode(0);
			auxNode.left = root;
			boolean result = root.remove(value, auxNode);
			root = auxNode.left;
			return result;
		} else{
			return root.remove(value, null);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(5);
		bst.add(7);
		bst.add(10);
		bst.add(1);
		bst.add(2);
		bst.add(3);
		bst.add(8);
		
		bst.printInOrder(bst.root);
		
		System.out.println(bst.remove(7));
		
		bst.printInOrder(bst.root);
		
	}
}
