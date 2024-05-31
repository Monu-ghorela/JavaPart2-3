package tasks;

import java.util.Comparator;

public class Student implements Comparable<Student> {

	int id;
	String name;
	String email;
	long phno;
	String address;

	Student(int id, String name, long phno, String email, String adress) {

		this.id = id;
		this.address = adress;
		this.email = email;
		this.phno = phno;
		this.name = name;

	}

	public String toString() {
		return "id: " + id + "name: " + name + "phnno: " + phno + "address: " + address + " email: " + email;

	}

	public int compareTo(Student s) {
//		return this.id - s.id;
		System.gc();
		return this.name.compareTo(s.name);
	}
}
class A{
	
}