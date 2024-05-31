package interfaceInJava;

public class bike implements Vehicle, Store {

//	the overiding is mandatory in case of the multiple inheeritence

	@Override
	public int FuelLevel() {
		return 0;
		// TODO Auto-generated method stub

	}

	public bike() {
		super(); // TODO Auto-generated constructor stub
	}

	@Override
	public void Start() {

	}

	@Override
	public void m2() {
		System.out.println("it is mandatory to override the method ");
//		return 0;
	}

	public static void main(String[] args) {
		bike bike = new bike();
		bike.m2();
		System.out.println(1 / 0);

	}

}
