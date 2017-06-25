//Assignment 4.3

//Write a program in java to demonstrate the use of final keyword with class, 
//with the method, with the constructor, and with a variable.

//                             Usage of Final Blank Variable

//Usage of blank final variable
//Lets say we have a Student class which is having a field called Roll No. Since 
//Roll No should not be changed once the student is registered, we can declare it 
//as a final variable in a class but we cannot initialize roll no in advance for 
//all the students


package assignment_4_3;

public class Example {
	//static blank final variable  
	   static final int ROLL_NO;
	   static{ 
	      ROLL_NO=1230;
	   }  
	   public static void main(String args[]){  
	      System.out.println(Example.ROLL_NO);  
	   }  

}
