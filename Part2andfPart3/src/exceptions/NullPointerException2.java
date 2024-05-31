package exceptions;

public class NullPointerException2 {
	int abc;

	public static void main(String[] args) {

		try {

			nullpointer();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally block executed");
		}
	}

	public static void nullpointer() throws NullPointerException {
		NullPointerException2 aException2 = null;
		System.out.println(aException2.abc);

	}

}