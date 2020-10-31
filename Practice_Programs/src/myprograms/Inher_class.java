package myprograms;



public class Inher_class implements hi{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hi h = new Inher_class();
		h.m1();
		hi.m2();
		//int u =9;
		System.out.println(u);
		
	}

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("324");
	}
	

}
interface hi{
	
	int h = 9;
	final int u = 0;
	static int r = 3;
//	default int w = 9;
	void m1();
	static void m2(){
		System.out.println("234");
		int u = 8;
		System.out.println(u);
		
	}
	
	
}