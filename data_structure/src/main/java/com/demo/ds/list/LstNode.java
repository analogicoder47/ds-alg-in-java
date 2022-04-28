package com.demo.ds.list;

public class LstNode<T> {
	private T          data;
	private LstNode<T> next;

	public LstNode(T data) {
		this.data = data;
		this.next = null;
	}
	
	public T getData() {
		return data;
	}
	
	public LstNode<T> getNext() {
		return next;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public void setNext(LstNode<T> next) {
		this.next = next;
	}
}