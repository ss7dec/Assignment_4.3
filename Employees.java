//Assignment 4.3

//Write a program in java to demonstrate the use of final keyword with class, 
//with the method, with the constructor, and with a variable.

//                               Final Method


package assignment_4_3;

public class Employees {
	void disp()
	{
	System.out.println("Hello Good Morning");  
	}
	}
	class Developer extends Employees
	{
	void disp()
	{
	System.out.println("How are you ?");  
	}
	}
	class FinalDemo
	{
	public static void main(String args[])
	{
	Developer obj=new Developer();
	obj.disp();
	}  

}
	
//
