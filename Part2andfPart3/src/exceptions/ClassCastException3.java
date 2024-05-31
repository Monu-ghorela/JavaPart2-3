package exceptions;

class parent {
	int a;
	int b;

	public static void a() {
		System.out.println("mkernkf");
	}

}

public class ClassCastException3 extends parent {

	public static void main(String[] args) {
		try {
			a();
			
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally block executed");
			
		}
	}

	public static void a() throws ClassCastException {
		parent aParent = new parent();
		ClassCastException3 b = (ClassCastException3) aParent;
		System.out.println(b);

	}
}