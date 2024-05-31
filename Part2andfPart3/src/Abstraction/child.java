package Abstraction;

public abstract class child extends Parent {
	@Override
	void m1() {
		System.out.println("abstract method called");
	}

	private child() {

	}

	public static void main(String[] args) {

		Parent.a = 10;
		System.out.println(Parent.class);
//		Parent parent2=new Parent();
		// TODO Auto-generated method stub

	}
 
}
