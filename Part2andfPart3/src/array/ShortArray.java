package array;

public class ShortArray {

	public static void main(String[] args) {
	
		
		System.out.println("this is the short type array");
		int []a= {11,22,33,44};
		System.out.println("printing refernce- of an array");
		System.out.println(a);///reference of an array
		System.out.println("printing lenth of an array");
		System.out.println(a.length);// length of an array
		
		System.out.println("printing the each elemnt of array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
			
		}// printing each element
		
		
		System.out.println("printing the each elemnt of array in forward direction");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("printing the each elemnt of array in backward direction");
		for (int i = a.length-1; i >=0; i--) {
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
