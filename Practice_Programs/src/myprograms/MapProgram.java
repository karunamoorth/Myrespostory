package myprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapProgram {

	static void mymap()
	{
		//obj for map
		Map m = new HashMap() ;
		m.put(1,"Hi");
		m.put(5, "five");
		m.put(3, "three");
		
		System.out.println(m);
		System.out.println(m.get(3));
		
		Set n = m.entrySet();
		Iterator itr = n.iterator();


	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapProgram.mymap();
		
	}

}
