package mock3;

public class HandleException {
	int a;

	public static void m1() {

		HandleException handleException = null;
		
		System.out.println(handleException.a);
	}

	public static void main(String[] args) {
		try {
			
			m1();
		} catch (NullPointerException e) {
			
			System.out.println(e);
			
		} finally {
			System.out.println("finally block invoked");
		}

		
		
		
	}

}
