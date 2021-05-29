package exception_multithreading_collections;
import java.util.*;
import java.util.function.Consumer;

public class hashset_eg {

	public static void main(String[] args) {
	
		HashSet<Integer> hs =new HashSet<>();/*HashSet(int initialCapacity)
		HashSet(int initialCapacity, float loadFactor)*/ // constructors of hashset
		HashSet<Integer> hs1 =new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs1.add(10);
		hs1.add(20);
		hs1.add(40);
		hs.add(10);// it should not print as it is duplicate
		System.out.println(hs);
		hs.addAll(hs1); // it should not contain duplicate elements from hs1 set
		System.out.println(hs);	
	}

}
