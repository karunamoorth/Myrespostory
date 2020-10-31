package myprograms;

import java.util.TreeSet;
public class ComparatorFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mycomparator hi = new Mycomparator();
		TreeSet<Integer> t = new TreeSet<Integer>(hi);
		
		t.add(4);
		t.add(23);
		t.add(60);
		
		System.out.println(t);
	}

}

