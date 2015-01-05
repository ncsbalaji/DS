package com.tree;

public class BSTNode {

	public int value;
	public BSTNode left;
	public BSTNode right;
	
	public BSTNode(int value) {
		this.value = value;
		left = null;
		right = null;
	}
	
	public boolean add(int value){
		if(this.value == value){
			return false;
		} else if(this.value > value){
			if(left == null){
				left = new BSTNode(value);
				return true;
			} else{
				left.add(value);
				return true;
			}
		} else if(this.value < value){
			if(right == null){
				right = new BSTNode(value);
				return true;
			} else{
				right.add(value);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean remove(int value, BSTNode parent){
		if(this.value < value){
			if(right != null){
				return right.remove(value, this);
			} else{
				return false;
			}
		} else if(this.value > value){
			if(left != null){
				return left.remove(value, this);
			} else{
				return false;
			}
		} else{
			if(left != null && right != null){
				this.value = right.minValue();
				return remove(this.value, this);
			} else if(parent.left == this){
				parent.left = (left!=null)? left: right;
			} else if(parent.right == this){
				parent.right = (right!=null)? right: left;
			}
			return true;
		}
	}
	
	public int minValue(){
		if(left != null){
			return left.minValue();
		} else{
			return value;
		}
	}
}
