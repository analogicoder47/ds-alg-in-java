package com.demo.ds.list;

public class LnkLst<T> {
	private LstNode<T> head;

	public LnkLst() {
		this.head = null;
	}

	public void insert2Head(LstNode<T> node) {
		node.setNext(head);
		head = node;
	}

	public void insert(T key, LstNode<T> node) {
		if (head == null) {
			head = node;
			return;
		}

		LstNode<T> current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		node.setNext(current.getNext() );
		current.setNext(node);
	}

	public void delete(T key) {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		if (head.getData() == key) {
			head = null;
		}

		LstNode<T> previous = null;
		LstNode<T> current = head;
		while (current != null && current.getData() != key) {
			previous = current;
			current = current.getNext();
		}
		if (current != null) {
			previous.setNext(current.getNext() );
			current = null;
		} else {
			System.out.println("No match key");
		}
	}

	public void reverse() {
		LstNode<T> previous = null;
		LstNode<T> current = head;
		LstNode<T> tail = head.getNext();

		while (current.getNext() != null) {
			current.setNext(previous);
			previous = current;
			current = tail;
			tail = tail.getNext();
		}
		current.setNext(previous);
		head = current;
	}

	public int size() {
		int len = 0;

		LstNode<T> current = head;
		while (current != null) {
			len++;
			current = current.getNext();
		}
		return len;
	}

	public void print() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		LstNode<T> current = head;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println("\n=======================");
	}
}