package upcasting_downcasting;

import interfaceInJava.Extra;
import interfaceInJava.Vehicle;

public class Car extends Extra implements Vehicle {

	int price = 0;
	String name = null;
	String engineType = null;
	String modelname = null;

	@Override
	public void Start() {
		System.out.println("car is started");

	}

}
