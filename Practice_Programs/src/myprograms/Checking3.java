package myprograms;

public class Checking3 implements Checking1,Checking2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] =new int[] {1,4,2,3,2,1,2,3,4,5};
		
		//find duplicate in array
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methoding() {
		// TODO Auto-generated method stub
		
	}
	
	Checking3(int a)
	{
		
	}
	Checking3(int a, int b)
	{
		
	}

}
