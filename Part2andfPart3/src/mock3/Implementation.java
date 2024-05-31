package mock3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Implementation {

	public static void main(String[] args) {
		Map<Integer, Student> map = new LinkedHashMap<Integer, Student>();
		Student s1 = new Student(1, "monu", "ggn");
		Student s2 = new Student(2, "naman", "ggn");
		Student s3 = new Student(3, "ajay", "ggn");
		Student s4 = new Student(4, "akhil", "ggn");
		Student s5 = new Student(5, "panda", "ggn");

		map.put(s1.id, s1);
		map.put(s2.id, s2);
		map.put(s3.id, s3);
		map.put(s4.id, s4);
		map.put(s5.id, s5);

		Collection<Student> c=map.values();
		
		for (Student student : c) {
			System.out.println(student.name);
		}
		
		
	}

}
