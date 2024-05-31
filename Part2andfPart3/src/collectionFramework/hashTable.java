package collectionFramework;

import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class hashTable {

	public static void main(String[] args) {

		Map map = new Hashtable<>();
//		map.put(null,1 );//can't add null values

		map.put(1, "lneei");
		map.put(2, "kind");
		map.put(1, "nbef");
		map.put(3, 152);
//		map.put(5, null);
//		map.put(4, null);//cant add null value in thhe entry
//		map.put(7, null);
		Set keyset = map.keySet();
		for (Object object : keyset) {
			System.out.println(object);
		}
		System.out.println("-----------");
		System.out.println(map);
		System.out.println("--------");
		Map<Integer, Object> map2 = new Hashtable<>();
		map2.put(1, "monu");
		map2.put(2, "akhil");
		map2.put(3, "panada");
		map2.put(4, "ajay");
		map2.put(5, "naman");
		Collection<Object> names = map2.values();
		for (Object string : names) {
			System.out.println(string);

		}
		System.out.println("---------");
		System.out.println(map.remove(1));

		System.out.println("------");
		Map<Integer, Object> map3 = new LinkedHashMap<>();
		map3.put(1, "monu");
		map3.put(2, "njjj");
		map3.put(3, "nenfn");
		map3.put(4, "Akhil");
		map3.put(5, "Ajay");
		System.out.println(map3);

		Set<Integer> keyset3 = map3.keySet();
		System.out.println(keyset3.size());
		for (Integer integer : keyset3) {
			System.out.println(integer);
		}
		System.out.println("---------");
		Collection<Object> values = map3.values();
		System.out.println(values.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
