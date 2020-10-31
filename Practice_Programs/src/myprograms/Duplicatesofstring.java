package myprograms;

public class Duplicatesofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "mississippi";
		int i,j;
		int len = word.length();
		char chri,chrj;
		for(i=0;i<len;i++)
		{
			chri = word.charAt(i);
					
			for(j=i+1;j<len;j++)
			{
				chrj = word.charAt(j);
				if(chri==chrj)
				{
					System.out.print(chrj + "");
					break;
				}
								
			}
			
		}
		
		
	}

}
