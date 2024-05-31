package tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Testing {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();

		list.add(1);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(8);
		list.add(8);
		Collections.sort(list);
		System.out.println(list);

		System.out.println("------------");
		List<Integer> list2 = new LinkedList<>();

		list2.add(1);
		list2.add(5);
		list2.add(3);
		list2.add(4);
		list2.add(8);
		list2.add(8);
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println("------------");
		List<Integer> list3 = new Vector<>();
		list3.add(4);
		list3.add(3);
		list3.add(5);
		list3.add(1);
		list3.add(2);
		Collections.sort(list3);
		System.out.println(list3);
		System.out.println("----------");
		System.out.println("set testing");

		Set<String> set = new LinkedHashSet<>();
		set.add("monu");
		set.add("nken");
		set.add(",e");
		set.add(",e");
		set.add("enkn");
		set.add("kner");

		System.out.println(set);
		System.out.println("----------------");
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(5);
		set2.add(85);
		set2.add(96);
		set2.add(12);
		System.out.println(set2);
		System.out.println("==========");
		Set<Integer> set3 = new TreeSet();

		set3.add(5);
		set3.add(5);
		set3.add(1);
		set3.add(3);
		set3.add(8);
		set3.add(2);
		System.out.println(set3);

		Map<Integer, Student> map = new TreeMap<>();

	}

}
