package inheritence;

 class Parent {
	 int id;
	 String name;
	 int roll;
	static {
		System.out.println("first static init called ");
	}
	{

		System.out.println("first non static initalizer called ");
	}
	{
		System.out.println("second non static initalizer called ");

	}


	public static void main(String[] args) {

	}

	public Parent() {
		System.out.println("parent constructor called");
	}

	public void m1() {
		System.out.println("m1 method called ");
	}

}
