package tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import tasks.*;
import tasks.Student;

public class Implementation {

	public static void main(String[] args) {

		Map<Integer, Student> Students = new HashMap<>();

		Students.put(1, new Student(1, "monu", 6377730881L, "monughorela2002@gmail.com", "Gurugram"));
		Students.put(2, new Student(2, "Akhil", 6345630881L, "akkhil@gmail.com", "Gurugram"));
		Students.put(3, new Student(3, "Naman", 6123630881L, "naman@gmail.com", "Gurugram"));
		Students.put(3, new Student(4, "ajay", 6123630881L, "ajay@gmail.com", "Gurugram"));
		Students.put(3, new Student(5, "rahul", 612660881L, "rahul@gmail.com", "Gurugram"));
		Students.put(3, new Student(6, "panda", 6123630881L, "panda@gmail.com", "Gurugram"));
		Students.put(3, new Student(7, "yukti", 6123454881L, "yukti@gmail.com", "Gurugram"));

		Collection<Student> students2 = Students.values();
		for (Student student : students2) {
			System.out.println("Name: " + student.name);

		}
		System.out.println("------------------");
		System.out.println(Students);
		System.out.println("------------------");

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "monu", 6377730881L, "monughorela2002@gmail.com", "Gurugram"));
		studentList.add(new Student(2, "Akhil", 6345630881L, "akkhil@gmail.com", "Gurugram"));
		studentList.add(new Student(3, "Naman", 6123630881L, "naman@gmail.com", "Gurugram"));

		Collections.sort(studentList,new Sort());
		System.out.println(studentList);
		System.out.println("------------------");

		Set<Student> set2 = new TreeSet();

		set2.add(new Student(3, "Naman", 6123630881L, "naman@gmail.com", "Gurugram"));
		set2.add(new Student(2, "Akhil", 6345630881L, "akkhil@gmail.com", "Gurugram"));
		set2.add(new Student(7, "yukti", 6123454881L, "yukti@gmail.com", "Gurugram"));
		System.out.println(set2);

	}

}
