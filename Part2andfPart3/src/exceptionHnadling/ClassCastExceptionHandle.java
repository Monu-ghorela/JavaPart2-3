package exceptionHnadling;

public class ClassCastExceptionHandle extends Parent {

	public static void main(String[] args) {

		Parent parent = new Parent();
		try {

			ClassCastExceptionHandle castExceptionHandle = (ClassCastExceptionHandle) parent;

		} catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}

class Parent {
	int a;
	int b;

	public Parent() {
		System.out.println("object created");
		// TODO Auto-generated constructor stub
	}
}
