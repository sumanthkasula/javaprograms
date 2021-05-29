package exception_multithreading_collections;

import java.util.*;

public class Stringtokenizereg {

	public static void main(String[] args) {
		String str= "name=sumanth;age=18;place=hyderbad;country=india";
		StringTokenizer s =new StringTokenizer(str,"=;");
		ArrayList<String> al = new ArrayList<>();
		String k;
		while(s.hasMoreTokens()) {
			k=s.nextToken();
			System.out.println(k);// need to remove delimiters(=;,/n/r--etc) and print only tokens/elements
			al.add(k);
		}
		System.out.println(al);//store into array list
	}

}

