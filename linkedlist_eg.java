package exception_multithreading_collections;

import java.util.*;

public class linkedlist_eg {
	public static void main(String args[]) {
	LinkedList<Integer> alist = new LinkedList<Integer>();
	LinkedList<Integer> ali = new LinkedList<Integer>();
	ali.add(20);
	ali.add(21);
	ali.add(22);
	alist.add(1);
	alist.add(2);
	alist.add(3);
	alist.add(4);
	alist.add(5);
	alist.add(4);
	alist.add(9);
	alist.add(10);
	//different methods in Linked list
	System.out.println(alist);
	alist.set(3, 6);
	System.out.println(alist);
	alist.add(8, 0);
	System.out.println(alist);
	alist.addAll(ali);
	System.out.println(alist);
	ali.addAll(alist);
	System.out.println(ali);
	alist.addAll(2, ali);
	System.out.println(alist);
	alist.remove(2);
	System.out.println(alist);
	alist.addFirst(26);
	alist.addLast(600);
	System.out.println(alist);
}
}
