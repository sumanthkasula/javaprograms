package exception_multithreading_collections;

import java.util.ArrayDeque;

public class deque { // can act as double ended queue used as both stack and queue

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> dq =  new ArrayDeque<>();
		dq.addLast(40);
		dq.addLast(30);
		dq.addLast(20);
		dq.addLast(10);
		dq.addFirst(1);
		dq.addFirst(2);
		dq.addFirst(3);
		dq.addFirst(4);
		System.out.println(dq);
		dq.pollLast();//removes last element
		System.out.println(dq);
	}
}
