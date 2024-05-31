package array;

public class StringArray {

	public static void main(String[] args) {

		System.out.println("the string type of arry");

		String a[] = { "monu", "akhil", "ajay", "naman" };
		System.out.println("the lenght of the array is ");
		System.out.println(a.length);
		System.out.println("the referenec of the arrya is ");
		System.out.println(a);
		System.out.println("the elements of the array is ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("the elements of the arrya in forward direction is  ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("the elements of the array in backward direction is ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);

		}
		System.out.println("printing the each elemnt of array in forward direction using while loop");
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
