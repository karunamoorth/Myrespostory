package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// hash set
		HashSet s = new HashSet();
		s.add(4);
		s.add("a");
		s.add("c");
		s.add("b");
		s.add("vgh");
		s.add(null);
		
		System.out.println(s);
		
		
		
		LinkedHashSet a = new LinkedHashSet();
		a.add("b");
		a.add(4);
		a.add("a");
		a.add("c");
		a.add("vgh");
		a.add(null);
		
		System.out.println(a);
		
		
		
	}

}
