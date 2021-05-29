package exception_multithreading_collections;

import java.util.*;//mandatiry

public class arraylisteg {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();//
		ArrayList<Integer> ali = new ArrayList<Integer>();
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
		//different methods in arraylist
		System.out.println(alist);
		alist.set(3, 6);
		System.out.println(alist);
		alist.add(8, 0);
		System.out.println(alist);
		alist.addAll(ali);
		System.out.println(alist);
		/*ali.addAll(alist);
		System.out.println(ali);*/
		alist.addAll(2, ali);
		System.out.println(alist);
		/*alist.clear();
		System.out.println(alist);*/
		Collections.sort(alist);
		System.out.println(alist);
		Collections.reverse(alist);;
		System.out.println(alist);
		
	}

}

//array list(class)<-list(interface)<-colletions(class)<-iterable(interface)
