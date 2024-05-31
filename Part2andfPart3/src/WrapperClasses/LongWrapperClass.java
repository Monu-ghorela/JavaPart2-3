package WrapperClasses;

public class LongWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i = 70;
		Long a = new Long(i);// boxing
		a = i;// autoboxing

		System.out.println(a);// 70
		System.out.println(i);// 70

		i = a.longValue();// Unboxing
		System.out.println(i);// 70

		long j = Long.parseLong("123");// 123 will be stored
//		long k = Long.parseLong("hy");// exception:: nnumberForamtException	

		
		

	}

}
