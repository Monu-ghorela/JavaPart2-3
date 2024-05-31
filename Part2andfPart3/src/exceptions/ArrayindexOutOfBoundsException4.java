package exceptions;

public class ArrayindexOutOfBoundsException4 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		try {
			int a[] = { 1, 2, 5 };
			array(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block is executed");

		}
	}

	public static void array(int[] a) throws ArrayIndexOutOfBoundsException {

		System.out.println(a[4]);

	}

}
