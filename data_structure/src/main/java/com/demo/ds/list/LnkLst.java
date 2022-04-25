package com.demo.ds.list;

public class LnkLst<T> {
	private LstNode<T> head;

	public LnkLst() {
		this.head = null;
	}

	public void insert2Head(LstNode<T> node) {
		node.next = head;
		head = node;
	}

	public void insert(T key, LstNode<T> node) {
		if (head == null) {
			head = node;
			return;
		}

		LstNode<T> current = head;
		while (current.next != null) {
			current = current.next;
		}
		node.next = current.next;
		current.next = node;
	}

	public void delete(T key) {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		if (head.data == key) {
			head = null;
		}

		LstNode<T> previous = null;
		LstNode<T> current = head;
		while (current != null && current.data != key) {
			previous = current;
			current = current.next;
		}
		if (current != null) {
			previous.next = current.next;
			current = null;
		} else {
			System.out.println("No match key");
		}
	}

	public void reverse() {
		LstNode<T> previous = null;
		LstNode<T> current = head;
		LstNode<T> tail = head.next;

		while (current.next != null) {
			current.next = previous;
			previous = current;
			current = tail;
			tail = tail.next;
		}
		current.next = previous;
		head = current;
	}

	public int size() {
		int len = 0;

		LstNode<T> current = head;
		while (current != null) {
			len++;
			current = current.next;
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
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("\n=======================");
	}
}