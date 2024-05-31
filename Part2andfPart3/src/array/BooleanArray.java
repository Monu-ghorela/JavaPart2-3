package array;

import java.util.Scanner;

public class BooleanArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean b[] = new boolean[5];
		System.out.println("the lenmgth of an array is ");
		System.out.println(b.length);
		System.out.println("the reference of an array is ");
		System.out.println(b);
		System.out.println("enter  elements of the array type boolean");
		for (int i = 0; i < b.length; i++) {
			b[i] = scanner.nextBoolean();
		}
		System.out.println("the elements of the arrya in forward direction ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}
		System.out.println("the elements of the arrya in backward direction ");
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.println(b[i]);

		}
		System.out.println("printing the each elemnt of array in forward direction using while loop");
		int i = 0;
		while (i < b.length) {
			System.out.println(b[i]);
			i++;

		}
		i = 0;
		System.out.println("printing the each elemnt of array in forward direction using do  while loop");
		do {
			System.out.println(b[i]);
			i++;
		} while (i < b.length);
		scanner.close();
	}

}
