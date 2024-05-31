package upcastingDowncasting;

public class College {

	int id;
	String name = "MIMIT MALOUT";

	College() {
		super();
	}

	College(int a) {
		super();
		
	}

//public  void  College() {
//	College();
//System.out.println("method loaded");
//}
	public static void main(String[] args) {

//	new College().College();

		College college = (College) new Student();
		System.out.println(college);

	}
}