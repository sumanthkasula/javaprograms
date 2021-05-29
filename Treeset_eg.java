package exception_multithreading_collections;
import java.util.*;
public class Treeset_eg {

	public static void main(String[] args) {
	TreeSet<Integer> ts =new TreeSet<Integer>();
	TreeSet<Integer> ts1 =new TreeSet<Integer>();
	ts.add(20);
	ts.add(1);
	ts.add(26);
	ts.add(20);
	ts.add(25);
	System.out.println(ts);//verify no duplicate values and it should be in ascending order
	ts1.add(100);
	ts1.add(0);
	ts1.add(16);
	//ts.addAll(ts1);
	//System.out.println(ts);//both sets should combine and align in ascending order
	System.out.println(ts.ceiling(10));//should give nearest highest number
	System.out.println(ts.floor(10));//should give nearest lower number
	System.out.println(ts.descendingSet());//should print in decending order
	}

}
