package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Cursors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// enumeration


		Vector<Integer> v = new Vector<Integer>();

		for(int i=0; i<=10;i++) { v.add(i); }

		System.out.println(v);


		Enumeration<Integer> a = v.elements();

		System.out.println(a.getClass().getName());
		while(a.hasMoreElements()) { int i = (int) a.nextElement();

		if(i%2==0) { System.out.println(i); }

		} System.out.println(v);


		//iterator

		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println(al.getClass().getName());
		for(int i=0;i<=10;i++) { al.add(i); } System.out.println(al);

		Iterator<Integer> it = al.listIterator();

		while(it.hasNext()) { int g = (int) it.next();

		if(g%2==0) { System.out.println(g); } else { it.remove();

		} }

		System.out.println(al);



		// ListIterator

		LinkedList<Integer> l = new LinkedList<Integer>();
		System.out.println(l.getClass().getName());
		for (int i = 0; i <= 5; i++) {
			l.add(i);
		}
		System.out.println("list:" + l);

		ListIterator<Integer> li = l.listIterator();




		while(li.hasNext()) { 

			int num = (int) li.next();
			if(num ==1) {  li.add(4); }		  
			else if(num == 3) { li.remove();} 
			else if(num == 5) { li.set(45); }

			System.out.println(num); }

		System.out.println(l);

	}

}
