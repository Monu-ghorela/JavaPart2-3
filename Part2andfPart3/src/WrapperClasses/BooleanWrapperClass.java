package WrapperClasses;

public class BooleanWrapperClass {

	public static void main(String[] args) {
		boolean i = true;
		Boolean boolean1=new Boolean(i);//boxing
		i=boolean1;//autoboxing
		
		
		System.out.println(i);//true
		System.out.println(boolean1);//true
		
		boolean b=Boolean.parseBoolean("true");
		boolean c=Boolean.parseBoolean("hyy");
		System.out.println(c);//false
		System.out.println(b);//true
		

	}

}
