package exceptions;

public class ArithmaticException1 {

	public static void main(String[] args) {
		try {
			arithmaticOperatic();

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("finally block execute");
		}

	}

	public static void arithmaticOperatic() {
		int a = 10;
		System.out.println(a / 0);

	}

}
