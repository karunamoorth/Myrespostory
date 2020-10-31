package myprograms;

import java.util.Set;

public class DuplicatesofArray {

	/*void Hi()
	{
		int[] a = {3,5,2,1,5,3,2,1,1,1,2,3};
		for(int name : a)
		{
			if(Set.this(name) == false)
			{
				System.out.println(name);
			}
		}
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,5,2,3,2};

		int len = a.length;

		/*
		 * for(int i=0;i<len;i++ ) { for(int j=i+1;j<len;j++) { if(a[i]==a[j]) {
		 * System.out.print(a[j]); } } }
		 */
		
		
		for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j]) 
                {
                    System.out.println(a[j]); 
                }}}
		/*
		 * String reverse = "abcde fghijkl";
		 * 
		 * System.out.println("*************************");
		 * 
		 * DuplicatesofArray abc = new DuplicatesofArray();
		 * abc.reversestringwithstringbuild(reverse);
		 * abc.reversestringwithoutbuild(reverse);
		 */
	}

	public void reversestringwithstringbuild(String a)
	{

		StringBuilder str = new StringBuilder(a);

		System.out.println(str.reverse());
	}

	public void reversestringwithoutbuild(String a)
	{

		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
	}
	
	//Write a Java Program to count the number of words in a string using HashMap.
	public void count()
	{
		
	}

}
