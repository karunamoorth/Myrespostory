package myprograms;

public class Fibonacci {

	public static void main(String[] args) {
		
int first = 0, second=1, third= 0;
//get the final number

for(int i= 0; i<12;i++)
{	
	first = second;
	second = third;
	third = first + second;
	System.out.println(third);
}
	}

}
