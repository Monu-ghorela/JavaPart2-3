package upcasting_downcasting;

public class Implementation {

	public static void main(String[] args) {

//		Car car = new Defender();
//	    Car car=new Hilux();

		Car car = new Hilux();

		if (car instanceof Defender) {
			Defender defender = (Defender) car;

			System.out.println(defender.name);
			System.out.println(defender.price);
			System.out.println(defender.engineType);
			defender.start();

		} else if (car instanceof Bmw) {
			Bmw bmw = (Bmw) car;
			System.out.println(bmw.name);
			System.out.println(bmw.price);
			System.out.println(bmw.engineType);
			bmw.start();
		} else if (car instanceof Hilux) {
			Hilux hilux = (Hilux) car;
			System.out.println(hilux.name);
			System.out.println(hilux.price);
			System.out.println(hilux.engineType);
			hilux.start();

		} else {
			System.out.println("chose the car name");
		}
	}

}
