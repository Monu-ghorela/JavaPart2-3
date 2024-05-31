package WrapperClasses;

public class FloatWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f=1.5f;
		Float float1=new Float(f);//boxing
		
		f=float1;//autoboxing
		System.out.println(f);
		System.out.println(float1);
		
		
		float a=Float.parseFloat("1.5");
		System.out.println(a);
		a=Float.parseFloat("hyy");//exception:number format exception
		
		
		
		
		
		
	}

}
