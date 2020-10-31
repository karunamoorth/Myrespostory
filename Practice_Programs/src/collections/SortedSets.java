package collections;

import java.util.TreeSet;

public class SortedSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Comparator Comparator a = ;
		TreeSet<Object> s = new TreeSet<Object>();
	
		  s.add(4); 
		  s.add(4);
		  s.add(1);
		  s.add(9);
		  s.add(8);
		 
	// s.add("a");
		System.out.println(s);
		
		
		//with stringBuffer
		
		/*
		 * TreeSet<StringBuffer> a = new TreeSet<StringBuffer>(); a.add(new
		 * StringBuffer("a")); a.add(new StringBuffer("c")); a.add(new
		 * StringBuffer("t")); a.add(new StringBuffer("b")); System.out.println(a);
		 */
		
		
		
		//comparable
		System.out.println("a".compareTo("z"));
		System.out.println("z".compareTo("a"));
		System.out.println("a".compareTo("a"));
		System.out.println("null".compareTo("a"));
	}

}
