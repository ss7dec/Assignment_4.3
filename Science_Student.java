//                                     Assignment 4.3

//Write a program in java to demonstrate the use of final keyword with class, 
//with the method, with the constructor, and with a variable.

//                               Final Constructor

package assignment_4_3;

public class Science_Student {   // observe, final class
	
	public Science_Student() {  }  // observe, final constructor
}

// A constructor cannot be abstract, static, final, native, or synchronized
//Some people think that there can be final constructor in a final class. Even it is wrong. 
//The following code raises compilation error.

//Generally, final keyword is used when we do not want to override the class, 
//or not to over ride the subclass methods, but Constructor have the methods or datamembers 
//to activated when we instantiaed, hence, Final Keyword should not use before any constructor
// In addition, it does not take Final Keyword before constructor.
