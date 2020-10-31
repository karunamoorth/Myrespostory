package myprograms;

import java.util.Scanner;

public class Myprimeno {

	public static void main(String[] args) {
		
		//Prime no or not

		Privateconstructor obj = new Privateconstructor();
		
		Scanner scan = new Scanner(System.in);
				
		int num = scan.nextInt();
		int m= num/2;
		boolean flag =true;
		for(int i=2; i<=m;i++)
		{	
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Prime    " + num);
		}
		else
		{
			System.out.println("it is Not Prime    " + num);
		}

	}

}
