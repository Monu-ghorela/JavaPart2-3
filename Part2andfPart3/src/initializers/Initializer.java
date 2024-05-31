package initializers;

public class Initializer {
	Initializer() {
		System.out.println("OBJECT CREATED");
	}

	{

		System.out.println("hi non static initializers called");
	}

	{
		System.out.println("second  non static initializers called");

	}

	static {

		System.out.println("hi static initializer called");

	}
	static {

		System.out.println("hi 2nd static initializer called");
    
	}

	public static void main(String[] args) {
		System.out.println("execution started ");

		Initializer i1 = new Initializer();
		Initializer i2 = new Initializer();

		System.out.println(i1);

		Initializer i3 = new Initializer();

	}

}
