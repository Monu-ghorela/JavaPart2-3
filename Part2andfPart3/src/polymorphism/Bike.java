package polymorphism;

public class Bike extends Vehicle {
	int price = 95000;
	String name = "Ninja Kawasaki";

	static String color = "blue";

	@Override
	public  Bike start() {
		System.out.println("zzzzz....");
		return null;

	}
	
	
	
	

	public static void main(String[] args) {
		/// vehicle object
		Vehicle vehicle = new Vehicle();
		System.out.println(vehicle.name);
		System.out.println(vehicle.price);
		vehicle.start();

		/// bike object

		Bike bike = new Bike();
		System.out.println(bike.price);
		System.out.println(bike.name);
		bike.start();

		// reference variable of vehicle storing reference of bike
		Vehicle vehicle2 = new Bike();
		System.out.println(vehicle2.price);
		System.out.println(vehicle2.name);

		vehicle2.start();
		System.out.println(vehicle2.color);
		System.out.println(bike.color);

	}

}
