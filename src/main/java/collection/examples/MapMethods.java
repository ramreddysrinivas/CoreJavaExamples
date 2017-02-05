package collection.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapMethods {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		System.out.println("size = " + map.size());
		System.out.println("map empty = "+ map.isEmpty());
		map.put(1,"value1");
		map.put(2,null);
		map.put(null,"value1");
		map.put(5,"value1");
		map.put(null,"value2");
		map.put(4,"value1");
		map.put(null,null);
		map.put(null,null);
		map.put(3,null);
		System.out.println("size = " + map.size());
		System.out.println("map empty = "+ map.isEmpty());
		System.out.println("map = " + map);
		System.out.println("map contains key = " + map.containsKey(6));
		System.out.println("map contains value = " + map.containsValue("value1"));
		String value1 =map.get(4);
		System.out.println("map.get(4) = " + value1);
		map.remove(null);
		System.out.println("after removing null = " + map);
	Set<Integer> keySet	=map.keySet();
		System.out.println("keySet = " + keySet);
		
		List<String> values = new ArrayList<String>(map.values());
		System.out.println("values = "+ values);
	Set<Map.Entry<Integer,String>> entrySet	= map.entrySet();
	System.out.println("entrySet = " + entrySet);
		
	}

}
