package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTesting {

	public static void main(String[] args) {
		// <--------------Hash set------->

		Set<String> set = new HashSet();
		set.add("monu");                                      
		set.add("ajay");
		set.add("akhil");
		set.add("naman");
		set.add("monu");
		set.add(null);

		collectionFramework.PrintCollection.print(set);
		set.remove("akhil");
		System.out.println();

		collectionFramework.PrintCollection.print(set);

		System.out.println(set);

		// <--------------tree set------->
		Set set2 = new TreeSet<>();
		set2.add(2);
		set2.add(5);
		set2.add(1);
		set2.remove(2);
		set2.add(2);
		System.out.println(set2.contains(2));
//		set2.add("mer");
//		set2.add("esdf");
		collectionFramework.PrintCollection.print(set2);
		System.out.println(set2);

	}

}
