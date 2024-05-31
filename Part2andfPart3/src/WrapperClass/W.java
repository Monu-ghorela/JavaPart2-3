package WrapperClass;

public class W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer integer = new Integer(10);// boxing
		System.out.println(integer);
		int i = integer.intValue();// unboxing
		System.out.println(i);
		Boolean boolean1=true;
		boolean b1=boolean1.booleanValue();
		System.out.println(b1);
		int t = integer;// auto unboxing

	}

}
