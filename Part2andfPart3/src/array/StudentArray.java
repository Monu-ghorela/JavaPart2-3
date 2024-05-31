package array;

public class StudentArray {

	public static void main(String[] args) {

		Student[] a = { new Student(), new Student(), new Student() };
		System.out.println("the reference of the array is ");
		System.out.println(a);
		System.out.println("the lenth of the array is ");
		System.out.println(a.length);
		System.out.println("the elements of the array is ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("the elements of the arrya in forward direction is ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("the elements of the arrya in backward direction is ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("printing the each elemnt of array in forward direction using while loop");
		System.out.println("here , the properties of the students");
		for (int i = 0; i < a.length; i++) {
			System.out.println(i+1+":student");
			System.out.println(a[i].cls);
			System.out.println(a[i].id);
			System.out.println(a[i].name);
			
		}

		int i=0;
		while (i<a.length) {
			System.out.println(a[i]);
			i++;
			
		}
		i=0;
		System.out.println("printing the each elemnt of array in forward direction using do  while loop");
		do {
			System.out.println(a[i]);
			i++;
		} while (i<a.length);
	}

}

class Student {
	int id;
	String name;
	String cls;

}
