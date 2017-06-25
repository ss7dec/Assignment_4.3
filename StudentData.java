//                               Assignment 4.3

//Write a program in java to demonstrate the use of final keyword with class, 
//with the method, with the constructor, and with a variable.

//                             Static Final Variable

//Uninitialized static final variable
//A static final variable that is not initialized during declaration can only 
//be initialized in static block

package assignment_4_3;

public class StudentData {
	//Blank final variable
	   final int ROLL_NO;
		 
	   StudentData(int rnum){
	      //It must be initialized in constructor
	      ROLL_NO=rnum;
	   }
	   void myMethod(){  
	      System.out.println("Roll no is:"+ROLL_NO);
	   }  
	   public static void main(String args[]){  
	      StudentData obj=new  StudentData(1234);  
	      obj.myMethod();  
	   }  

}
