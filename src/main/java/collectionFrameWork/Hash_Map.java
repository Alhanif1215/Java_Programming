package collectionFrameWork;

import java.util.HashMap;
import java.util.Set;

public class Hash_Map {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//Key value pair, key should be unique
		//insertion order not maintained
		
		HashMap hm = new HashMap();
		//non-generic
		hm.put(1, 100);
		hm.put("Tom", 30);
		System.out.println(hm);
		System.out.println(hm.get("Tom"));
		System.out.println(hm.containsKey("Tom"));
		System.out.println(hm.containsValue(100));
		System.out.println("-------------------------------------------------------");
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		//Generic
		map.put(1, 10);
		map.put(2, 45);
		map.put(3, 80);
		map.put(4, 45);
		map.put(5, 20);//Repeated key value will be added only once.
		map.put(5, 40);
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.hashCode());
		Set<Integer> s=map.keySet();
		for (Integer key : s) {
			System.out.println(key+" "+map.get(key));
		}
	}

}
