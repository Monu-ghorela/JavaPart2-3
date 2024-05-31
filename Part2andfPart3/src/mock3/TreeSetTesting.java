package mock3;

import java.util.TreeSet;

public class TreeSetTesting {

	public static void main(String[] args) {
		TreeSet treeSet=new TreeSet();
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(5);
		for (Object object : treeSet) {
			System.out.println(object);
		}
		

	}

}
