//                                       Assignment 4.3

//Write a program in java to demonstrate the use of final keyword with class, 
//with the method, with the constructor, and with a variable.

//                                   Blank final variable
package assignment_4_3;

public class Demo {

	
//Final variables are nothing but constants. We cannot change
//the value of a final variable once it is initialized.
	
//A final variable that is not initialized at the time of 
//declaration is known as blank final variable. We must initialize 
//the blank final variable in constructor of the class otherwise 
//it will throw a compilation error
	   
	final int MAX_VALUE;
		 
	   Demo(){
	      //It must be initialized in constructor
	      MAX_VALUE=100;
	   }
	   void myMethod(){  
	      System.out.println(MAX_VALUE);
	   }  
	   public static void main(String args[]){  
	      Demo obj=new  Demo();  
	      obj.myMethod();  
	   }  


}
