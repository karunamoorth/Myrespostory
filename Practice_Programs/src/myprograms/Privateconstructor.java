package myprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.sun.jna.platform.win32.OaIdl.DECIMAL;

import collections.Collections;

public class Privateconstructor {
	int a = 100;
	//Integer c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Privateconstructor obj = new Privateconstructor();
		 * 
		 * Integer b = new Integer(12); System.out.println(b + "456aff" +
		 * Float.parseFloat("345"));
		 */
		/*
		 * System.out.println("Enter the total number");
		 * 
		 * Scanner sn = new Scanner(System.in); int total = sn.nextInt();
		 * System.out.println("Enter the total numbe :" + total);
		 * 
		 * System.out.println("Enter the number");
		 * 
		 * ArrayList<Integer> AL = new ArrayList<Integer>();
		 * 
		 * Scanner num = new Scanner(System.in); for(int i=1; i<=total;i++) { int Add =
		 * num.nextInt(); AL.add(Add); } sn.close(); num.close();
		 * System.out.println(AL);
		 * 
		 * 
		 * System.out.println(AL);
		 */
		
		
		int a,b;
		
		a =1; b=2;
		
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println(a);
		System.out.println(b);
	}
	
	int method1(int a)
	{
		return this.a = method1(100);
	}
	
Privateconstructor()
{
	this(10);
	//this(10,10);
	System.out.println("this is constructor");
}
	
private Privateconstructor(int a)
{
	this(10,10);
	this.a = a;
	System.out.println("this is constructor :"+a);
}
public Privateconstructor(int i, int j) {
	// TODO Auto-generated constructor stub
}
}
  