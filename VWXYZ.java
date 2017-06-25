//                                       Assignment 4.3

//Write a program in java to demonstrate the use of final keyword with class, 
//with the method, with the constructor, and with a variable.

//                                   Final Class

package assignment_4_3;

public class VWXYZ {
}  

class ABCDE extends VWXYZ{  
   void demo(){
      System.out.println("My Method");
   }  
   public static void main(String args[]){  
      ABC obj= new ABC(); 
      obj.demo();
   }  

// it gives an error, because we can not inherit final class
}
