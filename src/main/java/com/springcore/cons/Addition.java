package com.springcore.cons;

public class Addition {
	private int a ;
	private int b ;
	
	public Addition(int a, int b)  // const overloading
	{
		this.a = a;
		this.b = b;
		System.out.println("Constructor int , int");
	}
	public Addition(double a, double b) // const overloading
	{
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor double , double");
	}
	public Addition(String a, String b) // const overloading  call String type firstly
	{
		this.a = Integer.parseInt(a); // string change in to int 
		this.b = Integer.parseInt(b);
		System.out.println("Constructor string , string");
	}
	
	public void sum() {
		System.out.println("Value of a " + this.a);
		System.out.println("Value of b " + this.b);
		System.out.println("The Sum is : " +  (a+b));
		
	}


	

}
