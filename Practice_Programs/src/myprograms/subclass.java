package myprograms;

class superclass {
	
	superclass()
	{
		System.out.println("parent class");
	}

}

class subclass extends superclass{
	
	subclass()
	{
		System.out.println("child class");
	}
	void m()
	{
		System.out.println("test");
	}
	public static void main(String[] args) {
		new subclass();
		System.out.println("main");
		
	}
}
