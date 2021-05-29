package exception_multithreading_collections;
import java.util.*;
public class linkedhasmap_eg {
public static void main(String args[]) {
	LinkedHashMap<Integer,String> lhm =new LinkedHashMap<>();
	lhm.put(1,"a");
	lhm.put(2,"b");
	lhm.put(3,"c");
	lhm.put(1,"a");//shouldn't print as key is duplicate
	lhm.put(4,"a");//valus can be duplicte
	System.out.println(lhm);
}
}
