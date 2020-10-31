package collections;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intvalue = 1234567890;
		double doublevalue = 12.5;
		float floatvalue = 1232312312;
		String stringvalue = "sdf";
		long longvalue = 342342343;
		char charvalue;
		short shrotvalue = 12121;
		
		
		System.out.println(intvalue);
		System.out.println(doublevalue);
		System.out.println(longvalue);
		System.out.println(shrotvalue);
		
		intvalue = (int)doublevalue;
		
		System.out.println(intvalue);
		doublevalue = intvalue;
		System.out.println(doublevalue);
		
		shrotvalue = (byte)123;
		System.out.println(shrotvalue);
	}

}
