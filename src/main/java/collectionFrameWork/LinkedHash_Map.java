package collectionFrameWork;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHash_Map {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//In LinkedHashMap insertion order is maintained
		
		LinkedHashMap lhm = new LinkedHashMap();
		//non-generic
		lhm.put(1, 100);
		lhm.put("Tom", 30);
		System.out.println(lhm);
		System.out.println(lhm.get("Tom"));
		System.out.println(lhm.containsKey("Tom"));
		System.out.println(lhm.containsValue(100));
		System.out.println("-------------------------------------------------------");		
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		//Generic
		map.put(1, 10);
		map.put(2, 45);
		map.put(3, 80);
		map.put(4, 45);
		map.put(5, 20);//Repeated key value will be added only once.
		map.put(5, 40);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.isEmpty());
		System.out.println(map.hashCode());
		Set<Integer> s=map.keySet();
		for (Integer key : s) {
			System.out.println(key+" "+map.get(key));
		}
		System.out.println("-------------------------------------------------------");		

		System.out.println(map.remove(1, 10));
		System.out.println(map);
		System.out.println(map.keySet());
	}

}
