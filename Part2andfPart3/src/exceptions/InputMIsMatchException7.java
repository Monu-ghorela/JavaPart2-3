package exceptions;
import java.util.*;
public class InputMIsMatchException7 {
public static void main(String[] args) {
	try {
		
		input();
	} catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("finally block executed");
	}
}

public static void input() throws InputMismatchException{
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	System.out.println(a);
	
}
}
