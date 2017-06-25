//Assignment 4.3

//Write a program in java to demonstrate the use of final keyword with class, 
//with the method, with the constructor, and with a variable.

//                               Final Method
//This program is used to show that final method can be inherited.

package assignment_4_3;

public class Show {
	public final void show(){
		System.out.println("Hello world.");
	}
}
 
class Display extends Show{
	public void display(){
		System.out.println("Hello javawithease.com.");
	}
}
 
class FinalExample4 {
	public static void main(String args[]){
		//creating object of Display class
		Display obj = new Display();
		//method call
		obj.show();
	}
}


