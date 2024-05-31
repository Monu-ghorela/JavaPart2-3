package upcastingDowncasting;

public class Upcasting_Downcasting extends Parent {

	int id = 10;
	String nameString = "username";

	public static void main(String[] args) {
		Parent parent = new Upcasting_Downcasting();// upcasting
		System.out.println(parent.id);
//		System.out.println(parent);
		Upcasting_Downcasting upcasting_Downcasting = (Upcasting_Downcasting) parent;// downcasting
		System.out.println(upcasting_Downcasting.id);
		System.out.println(upcasting_Downcasting.nameString);

	}

}
