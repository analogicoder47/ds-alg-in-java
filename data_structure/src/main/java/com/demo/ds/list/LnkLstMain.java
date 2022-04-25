package com.demo.ds.list;

public class LnkLstMain {
    public static void main(String[] args) {
        LnkLst<Integer> list = new LnkLst<>();
        list.print();

        list.insert2Head(new LstNode<Integer>(1) );
        list.print();

        list.insert(1, new LstNode<Integer>(2) );
        list.print();

        list.insert(5, new LstNode<Integer>(3) );
        list.print();

        list.delete(2);
        list.print();

        list.reverse();
        list.print();

        list.delete(1);
        list.print();

        list.reverse();
        list.print();

        list.delete(6);
        list.print();

        list.delete(3);
        list.print();
    }
}