package myprograms;

public class Swapstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a = "Love";  
	        String b = "You";  
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        
	     
	        b = a.substring(0, a.length() - b.length());  

	        a = a.substring(b.length());  
	        
	        System.out.println("After : " + a + " " + b);  
	        
	        Swapstring s = new Swapstring();
	        s.main(a);
	}
	
	//Main method overload
	public static void main(String a) {
		// TODO Auto-generated method stub
		   a = "Love";  
	        String b = "You";  
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  

	        a = a.substring(b.length());  
	        System.out.println("After : " + a + " " + b);  
	}

}
