package collectionFrameWork;

import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//In TreeMap insertion default sorting happens
		
		TreeMap lhm = new TreeMap();
		//non-generic
		lhm.put(1, 100);
		lhm.put(3, 50.5);
		System.out.println(lhm);
		System.out.println(lhm.get(2));
		System.out.println(lhm.containsValue(100));
		System.out.println("-------------------------------------------------------");		
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		//Generic
		map.put(3, 10);
		map.put(2, 45);
		map.put(1, 80);
		map.put(5, 45);
		map.put(4, 40);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.isEmpty());
		System.out.println(map.hashCode());
		Set<Integer> s=map.keySet();
		for (Integer key : s) {
			System.out.println(key+" "+map.get(key));
		}
		System.out.println("-------------------------------------------------------");		

		System.out.println(map.remove(1, 80));
		System.out.println(map);
		System.out.println(map.keySet());
		
	}

}
