package collectionFramework;

import java.util.*;

public class CollectionFramework {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList arrayList = new ArrayList();

		arrayList.add(1);

		arrayList.add(true);
		arrayList.add("monu");
		arrayList.add("hyy");
		arrayList.add(3);
		arrayList.add(null);
		arrayList.add(0.5);
		arrayList.add('A');
	
		arrayList.addAll(arrayList);
//		arrayList.add(arrayList);
		arrayList.removeAll(arrayList);
//		arrayList.retainAll(arrayList);
//		for (Object object : arrayList) {
//			System.out.println(object);
//
//		}
		System.out.println(arrayList);

		@SuppressWarnings("rawtypes")
		ArrayList<String> arrayList2 = new ArrayList();
		arrayList2.add("monu");
		arrayList2.add(null);
		arrayList2.add("hyyy");
		arrayList2.add("hyyy");
		arrayList2.add("1");
		arrayList.sort(null);
		System.out.println(arrayList2);
////		arrayList2.add(1);    //not applicable :CTE
//
//		// linkedlistt
//
//		@SuppressWarnings("rawtypes")
//		LinkedList linkedList = new LinkedList();
//		linkedList.add(1);
//		linkedList.add("monu");
//		linkedList.add(150);
//		linkedList.add("lnke");
//		linkedList.add("an");
//		for (Object object : linkedList) {
//			System.out.println(object);
//		}
//
//		@SuppressWarnings("rawtypes")
//		LinkedList<Integer> linkedList2 = new LinkedList();
//		linkedList2.add(1);
//		linkedList2.add(4);
//		linkedList2.add(5);
//		linkedList2.add(null);
//		linkedList2.add(3);
//		// linkedList2.add(""); //cte:not applicable
//
//		System.out.println("vector set");
//
//		@SuppressWarnings("rawtypes")
//		Vector<Integer> a = new Vector();
//		a.add(1);
//		a.add(5);
//		a.add(2);
//		a.add(8);
//		a.add(1);
//		a.add(5);
//		for (Integer integer : a) {
//			System.out.println(integer);
//
//		}
//
//		System.out.println("hashset");
//		HashSet<Integer> hashSet = new HashSet<>();
//
//		hashSet.add(5);
//		hashSet.add(5);
//		hashSet.add(5);
//		hashSet.add(5);
//
//		for (Integer integer : hashSet) {
//			System.out.println(integer);
//
//		}
//		System.out.println();
//		@SuppressWarnings("rawtypes")
//		HashSet hashSet2 = new HashSet<>();
//		hashSet2.add(1);
//		hashSet2.add("44");
//		hashSet2.add("44");
//		hashSet2.add(.52);
//		hashSet2.add(7564);
//		hashSet2.add('a');
//		for (Object object : hashSet2) {
//			System.out.println(object);
//
//		}
		System.out.println("linkedhashset");
		System.out.println();
		@SuppressWarnings("rawtypes")
		LinkedHashSet linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(1);
		linkedHashSet.add("44");
		linkedHashSet.add("44");
		linkedHashSet.add(.52);
		linkedHashSet.add(7564);
		linkedHashSet.add(null);
		for (Object object : linkedHashSet) {
			System.out.println(object);

		}
//		System.out.println("treee set");
//		System.out.println();
//
//		@SuppressWarnings("rawtypes")
//		TreeSet treeSet = new TreeSet<>();
//		treeSet.add(1);
////		treeSet.add(null);
//		treeSet.add(5);
//		treeSet.add(45);
//		treeSet.add(1);
//		for (Object object : treeSet) {
//			System.out.println(object);
//		}
//
//		@SuppressWarnings("rawtypes")
//		TreeSet treeSet2 = new TreeSet();
//		treeSet2.add("monu");
//		treeSet2.add("mlrn");
//		treeSet2.add("nbjf");
//		treeSet2.add("a");
//
//		System.out.println("treesset ");
//		System.out.println();
//		for (Object object : treeSet2) {
//			System.out.println(object);
//
//		}
////		@SuppressWarnings("rawtypes")
////		TreeSet<Integer> treeSet3 = new TreeSet();
////		treeSet3.add(null);

		
	}

}
