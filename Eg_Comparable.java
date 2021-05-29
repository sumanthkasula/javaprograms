package exception_multithreading_collections;

import java.util.*;

@SuppressWarnings("rawtypes")
class num implements Comparable{
	int x;
	public num(int x) {
		this.x =x;
		}
	public String toString(){
		return "x:"+x;
	}
	public int compareTo(Object o) {
		num n = (num)o;
		if(this.x > n.x)
			return +1;
		else if(this.x < n.x)
			return -1;
		else
			return 0;
		
	}
}
public class Eg_Comparable {

	public static void main(String args[]) {
		TreeSet<num> a = new TreeSet<>();
		a.add(new num(1));
		a.add(new num(5));
		a.add(new num(4));
		a.add(new num(2));
		System.out.println(a);
		}
}
