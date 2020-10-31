package myprograms;

public class Static {
	int r = 0;
	int t =9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static obj = new Static();
		obj.t =4;
		obj.r =9;
		System.out.println(obj.t);
		System.out.println(obj.r);
		pyramid();
	}
	
static	public void pyramid(){
		
	int k=0, lines = 5;
	
	//loop for line count
	for(int i=1; i<=lines;i++)
	{
		k=0;
		//loop for space
		for(int space=0; space<=lines-i;space++ )
		{
			System.out.print(" ");
		}
		//loop for stars
		while(k != 2*i-1)
		{
			System.out.print(k);
			++k;
		}
		System.out.println();
	}

}
}
