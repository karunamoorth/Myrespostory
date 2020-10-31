package myprograms;

 abstract class home
{
	abstract void fun();
	void simplemethod()
	{
		System.out.println("Hi");
	}
}

class abstract_class extends home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		home h = new abstract_class();
		h.fun();
		h.simplemethod();
		
		
	}
	
	
	@Override
	void fun() {
		// TODO Auto-generated method stub
		System.out.println("this is  in child class");
	
	}

}
