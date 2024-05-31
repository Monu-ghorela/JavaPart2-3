package exceptions;

public class NUmberFormatException8 {

	public static void main(String[] args) {

		try {

			numberformat();
		} catch (NumberFormatException e) {

			System.out.println(e.getMessage());;;
			
		}
		finally {
			System.out.println("finally block is called");
		}
	}

	public static void numberformat() throws NumberFormatException {
		int a = Integer.parseInt("d");
		System.out.println(a);

	}

}
