package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> name_RollHashMap = new HashMap();

		name_RollHashMap.put(1, "Monu");
		name_RollHashMap.put(2, "Akhil");
		name_RollHashMap.put(3, "Ajay");
		name_RollHashMap.put(4, "Naman");
		name_RollHashMap.put(5, "Panda");

//		Collection<String> nameSet = name_RollHashMap.values();
//		for (String name : nameSet) {
//			System.out.println(name);
//		}
		Map<Integer, String> name_RollHashMap2 = new HashMap();
		name_RollHashMap2.put(2, "domar");
		name_RollHashMap2.put(4, "anoop");
		name_RollHashMap2.putAll(name_RollHashMap);
		System.out.println(name_RollHashMap2);

		Collection<String> Names2 = name_RollHashMap2.values();

		for (String name : Names2) {
			System.out.println("👌👌👌" + name);
		}
		name_RollHashMap2.remove(2);
		System.out.println(name_RollHashMap2);
//		name_RollHashMap2.clear();// to clear the map
		System.out.println(name_RollHashMap2);

		name_RollHashMap.put(5, "Rahul");
		Map abcMap = new HashMap<>();
		abcMap.put(1, "mren");
		abcMap.put(2, "mren");
		abcMap.put(3, null);
		abcMap.put(4, true);
		abcMap.put(5, 45);
		abcMap.put(6, 5);
		abcMap.put("monu", null);

		System.out.println(name_RollHashMap.hashCode());
		System.out.println(abcMap.hashCode());

	}
}