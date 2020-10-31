package myprograms;

import java.util.Arrays;

public class Merging {

	public static void Twomerging()
	{
		//inti 2 arrays
		int[]array1 = {12,34,12,45,34};
		int[]array2 = {52,37,15,90,78};
		//inti merge the array length
		int[]merge = new int[array1.length + array2.length];
		//assigning array1 to merge
		for(int i=0;i<array1.length;i++)
		{
			merge[i]=array1[i];
		}
		//assigning array2 values to merge with array1 length
		for(int i=0;i<array2.length;i++)
		{
			merge[i+array1.length]=array2[i];
			System.out.println(merge[i]);
		}
		
		//converting arrays into string
		System.out.println(Arrays.toString(merge));
	}
}
