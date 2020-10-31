package myprograms;

public class Reverseno {

	public static void main(String[] args) {
		//reverse the string

		String str = "hello sir";
		String rev = "";

		int len = str.length();
		System.out.println("Total letters:" + len);

		for(int i=len-1;i>=0;i--)
		{
			rev = rev + (str.charAt(i));

		}
		System.out.println("Given is :" + str);
		System.out.println("reverse is :" + rev);
			// palindrome or not
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("Not a Plaindrome");
		}
		
		
	}
}
