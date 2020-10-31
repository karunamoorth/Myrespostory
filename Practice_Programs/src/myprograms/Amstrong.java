package myprograms;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int add,temp,check=0;
		Scanner sc = new Scanner(System.in);
		
		int ams = sc.nextInt();
		
		System.out.println(ams);
		
		temp = ams;
		while(ams>0)
		{
			add = ams%10;
			System.out.println(add);
			ams = ams/10;
			System.out.println(ams);
			check =check +( add*add*add);
		}
		
		
		if(check==temp)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		int abcd = 1008;
		abcd = abcd%10;
		System.out.println(abcd);
		
	}

}
