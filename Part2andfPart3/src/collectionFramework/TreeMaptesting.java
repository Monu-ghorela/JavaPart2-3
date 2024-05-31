package collectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaptesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map a = new TreeMap<>();
		a.put("ml", "mken");
		a.put("mm", true);
		a.put("rm", "elnr");
		a.put("mo", "nknr");
		a.put("rr", false);
		a.put("lwme", null);
//		a.put(null, "meknf");///null pointer exception
//		a.put("bir", true); //class cast exception
		System.out.println(a);

//		a.remove(5);

		Map<Integer,String> bMap=new TreeMap();
		bMap.put(1, null);
		bMap.put(2, null);
//		bMap.put(null, null);//null pointer exception
		bMap.put(1, "monu");
		
		
		
		
		
	}

}
