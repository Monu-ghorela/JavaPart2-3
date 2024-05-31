package WrapperClasses;

public class ShortWrapperClass {

	public static void main(String[] args) {

		short i = 90;
		Short a = new Short(i);// boxing
		a = i;// autoboxing

		System.out.println(a);// 90
		System.out.println(i);// 90

		i = a.byteValue();// autoUnboxing
		System.out.println(i);// 90

		short j = Short.parseShort("123");// 123 will be stored
//		short k = Short.parseShort("hy");// exception:: nnumberForamtException	

	}

}
