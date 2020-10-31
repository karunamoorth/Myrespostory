package myprograms;

import java.util.Random;

public class Randomno {

	public static void Generate()
	{
		int count;
		Random rnum = new Random();
		System.out.println("Numbers generated in Random manner:");
		//below loop generate random numbers to the rnum
		for(count=1; count<=10;count++)
		{
			System.out.println(rnum.nextInt(100));
		}
	}
}
