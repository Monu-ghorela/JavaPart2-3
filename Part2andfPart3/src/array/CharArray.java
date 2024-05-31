package array;

public class CharArray {

	public static void main(String[] args) {

		System.out.println("the character type of arrya is ");

		char a[] = { 'a', '2', 'd', '5' };
	
		System.out.println("the length of an array is ");
		System.out.println(a.length);
		System.out.println("the reference of an array is ");
		System.out.println(a);
		System.out.println("the elements of array are");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("the array elements in forward direction are ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("the array elements in backward  direction are ");
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
