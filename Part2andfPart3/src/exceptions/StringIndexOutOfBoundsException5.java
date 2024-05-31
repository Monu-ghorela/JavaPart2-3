package exceptions;

import java.io.FileNotFoundException;

public class StringIndexOutOfBoundsException5 {
public static void main(String[] args) {
	
	try {
		stringOutOfBound();
		 
	} catch (NullPointerException e) {
		System.out.println(e.getMessage());
		
	}finally {
		System.out.println("finally block executed");
	}
	
}


public static void stringOutOfBound()throws StringIndexOutOfBoundsException {
	String s1="monu";
	System.out.println(s1.charAt(4));
}
}
