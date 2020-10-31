package myprograms;

import java.util.Arrays;

public class Sorting {

	public static void Ascending()
	{
		int[] array = {12,76,12,34,45};
		System.out.println("Data before sorting");
		for(int i:array)
		{
			
			System.out.println(i);
		}
		Arrays.sort(array);
		System.out.println("Data after sorting");
		for(int i :array)
		{
			System.out.println(i);
		}
		
		System.out.println("coverted to string:");
		System.out.println(Arrays.toString(array));
	}
}
