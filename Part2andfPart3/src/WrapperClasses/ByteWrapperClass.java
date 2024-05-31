package WrapperClasses;

public class ByteWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte i = 90;
		Byte aInteger = new Byte(i);// boxing
		aInteger = i;// autoboxing

		System.out.println(aInteger);// 90
		System.out.println(i);// 90

		i = aInteger.byteValue();// autoUnboxing
		System.out.println(i);// 90

		byte j=Byte.parseByte("123");// 123 will be stored
		byte k = Byte.parseByte("hy");// exception:: nnumberForamtException
	}

}
