package inheritence;

public class child extends Parent {
	int childId;
	String name;
	
	{
		System.out.println("child init called ");
	}
	static{
		System.out.println("child static initializer called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new child();  
//    new child();
//    new child();
		

	}

}
