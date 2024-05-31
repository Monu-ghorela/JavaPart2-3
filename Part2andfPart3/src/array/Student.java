package array;

class StudentA {
	int rollno;
	String name;
	long phnno;
	char gender;

	StudentA(int rollno, String name, long phnno, char gender) {
		this.gender = gender;
		this.name = name;
		this.phnno = phnno;
		this.rollno = rollno;

	}

	public static void main(String[] args) {
		StudentA[] studentA = { new StudentA(1, "monu", 6377730881L, 'M'), new StudentA(2, "akhil", 7585652315L, 'M'),new StudentA(3, "ajay", 8565451242l, 'M'),new StudentA(4, "bhabani", 8956412345l, 'M'),new StudentA(5, "naman", 8545651232l, 'M')};
       System.out.println("rollno     name     gender    phno");
       System.out.println("<---------------------------------->");
     
		for (int i = 0; i < studentA.length; i++) {
			
			
			
			System.out.print(studentA[i].rollno+" ");
			System.out.print(studentA[i].name+" ");
			System.out.print(studentA[i].gender+" ");
			System.out.print(studentA[i].phnno+" ");
			System.out.println();
		}
		
		
		
	}

}
