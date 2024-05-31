package constructor;

class ConstructorChaining {
	int roll;
	int id;
	String nameString;

	ConstructorChaining(String nameString) {
		this();
		this.nameString = nameString;
	}

	ConstructorChaining() {

		System.out.println("object created");
	}

	ConstructorChaining(int roll, int id) {
		this("monu ghorela");
		this.roll = roll;
		this.id = id;

	}

	public static void main(String[] args) {
//	
		ConstructorChaining chaining = new ConstructorChaining();

		ConstructorChaining chaining1 = new ConstructorChaining(1, 2);

		System.out.println(chaining1.id);

		System.out.println(chaining1.roll);
		System.out.println(chaining1.nameString);

	}

}
