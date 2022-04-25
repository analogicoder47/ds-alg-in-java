package com.demo.ds.list;

public class LstNode<T> {
	public T          data;
	public LstNode<T> next;

	public LstNode(T data) {
		this.data = data;
		this.next = null;
	}
}