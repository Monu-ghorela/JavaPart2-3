package polymorphism;

public class Defender extends car {

	int price = 15000000;
	String name = "defender";
	static String color = "blue";

	public static void main(String[] args) {
// by using defender object 
		Defender defender = new Defender();
		System.out.println(defender.name);// defender
		System.out.println(defender.price);// 15000000
		System.out.println(defender.color);// blue
// by using car object
		
		

		car car = new car();
		System.out.println(car.price);// 10000
		System.out.println(car.name);// car
		System.out.println(car.color);// white

/// by using car reference variable storing defender reference
		car car2 = new Defender();
		System.out.println(car2.price);// 10000
		System.out.println(car2.name);// car
		System.out.println(car2.color);// blue

/// by storing the reference variable of car
		Defender d = (Defender) car2;
		System.out.println(d.name);// defender
		System.out.println(d.price);// 15000000
		System.out.println(d.color);// blue

	}

}
