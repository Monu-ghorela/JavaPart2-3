package array;

public class RollNo {

	public static void main(String[] args) {

		int[] rollno = { 1, 2, 3, 4, 5, 8, 90 };
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < rollno.length; i++) {

			if (rollno[i] % 2 == 0) {
				evenCount++;

			}
		}
		System.out.println("the no of even elements are " + evenCount);
		for (int i = 0; i < rollno.length; i++) {

			if (!(rollno[i] % 2 == 0)) {
				oddCount++;

			}
		}
		System.out.println("the no of od elements are " + oddCount);

		for (int i = 0; i < rollno.length; i++) {

			if (i % 2 == 0) {
				System.out.println("the element present at even index is " + rollno[i]);

			}
		}

		int rollNo2[] = new int[rollno.length];
		for (int i = 0; i < rollNo2.length; i++) {
			rollNo2[i] = rollno[i];
		}
		for (int i = 0; i < rollNo2.length; i++) {
			System.out.println("the element of second array in forward direction " + rollNo2[i]);
		}
		int j = 0;
		for (int i = rollno.length - 1; i >= 0; i--) {
			rollNo2[j++] = rollno[i];
		}

		for (int i = 0; i < rollNo2.length; i++) {
			System.out.println("the element of second array in backward direction  " + rollNo2[i]);
		}
	}

}
