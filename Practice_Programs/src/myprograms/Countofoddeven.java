package myprograms;

public class Countofoddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int OddCount=0;
		int evencount=0;
		int count =0;
		String Primenum = "" ;
		String Oddnum = "" ;
		String Evennum = "" ;
		
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			{
				
				evencount = evencount +1;
				Evennum = Evennum + i + " ";
				
			}			
			else if(i%2==1)
			{ 
				OddCount = OddCount + 1;
				Oddnum = Oddnum + i + " ";
				
			} 

		}
		System.out.println("Even number  :  " +Evennum);
		System.out.println("Odd number   :  " +Oddnum);
		System.out.println("Total Even counts   :" +evencount);
		System.out.println("Total Odd counts   :" + OddCount);


		boolean flag = true;

		for(int num=1; num<=100;num++)
		{
			int COunter =0;
			for(int i=num;i>=1;i--)
			{
				
				if(num%i==0)
				{			
					COunter = COunter +1;
					
				}
			}
				if(COunter==2)
				{
					Primenum = Primenum + num + " ";
					
					count = count + 1;
				}
		}
		System.out.println("It is prime number   :"+Primenum);
		System.out.println("Total Prime counts   :" + count);
	}}
