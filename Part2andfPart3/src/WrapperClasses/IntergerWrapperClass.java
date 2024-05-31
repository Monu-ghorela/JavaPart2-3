package WrapperClasses;

public class IntergerWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 128;
		Integer aInteger = new Integer(i);// boxing
		aInteger = i;// autoboxing

		System.out.println(aInteger);// 90
		System.out.println(i);// 90

		i = aInteger.intValue();
		// autoUnboxing

		System.out.println(i);// 90

		int j = Integer.parseInt("123.05");// 123 will be stored
//		int k = Integer.parseInt("hy");// exception:: nnumberForamtException
		int b=aInteger.byteValue();
		System.out.println(b);
	}

}
