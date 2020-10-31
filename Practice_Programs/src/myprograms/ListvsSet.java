package myprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListvsSet {
	String sdf = "sdf";

	//List
	public void getlist()
	{
		List<String> lis = new ArrayList<String>();
		lis.add("a");
		lis.add("b");
		System.out.println(lis);

		List<Integer> ll= new LinkedList<Integer>();
		ll.add(3);
		ll.add((int) 2.9F);
		System.out.println(ll);

	}

	//Set
	void getset()
	{
		Set<String> aa = new HashSet<String>();
		aa.add("aaa");
		aa.add("ccc");
		aa.add("bbb");
		System.out.println(aa);

		TreeSet<String> oi = new TreeSet<String>(aa);
		System.out.println(oi);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListvsSet a = new ListvsSet();
		a.getlist();
		a.getset();
	}

}
