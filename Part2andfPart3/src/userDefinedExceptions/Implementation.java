package userDefinedExceptions;

import java.util.Scanner;

public class Implementation {

	public static void main(String[] args) {
		System.out.println("Enter the password");
		Scanner scanner = new Scanner(System.in);
		int password = scanner.nextInt();

		try {

			if (password != 123) {

				throw new InvalidPassword();
			}
			System.out.println("u are successfully logged\n in");
		} catch (InvalidPassword e) {
			System.out.println(e.getMessage());
		
		}
	}

}
