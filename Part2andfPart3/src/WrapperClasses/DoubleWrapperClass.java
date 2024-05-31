package WrapperClasses;

public class DoubleWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d=1.5555;
		Double double1=new Double(d);//boxing
		double1=double1;//autoboxing
		d=double1;//autounboxing
		System.out.println(d);
		System.out.println(double1);
		
		double a=Double.parseDouble("1.56565");
		System.out.println(a);
		double s=Double.parseDouble("nkfnd");//Exception :NumberFormatexception
		
		
		
	}

}
