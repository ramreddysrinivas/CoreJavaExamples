package collection.examples;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"value1");
		map.put(2,null);
		map.put(null,"value1");
		map.put(5,"value1");
		map.put(null,"value2");
		map.put(4,"value1");
		map.put(null,null);
		map.put(null,null);
		map.put(3,null);
		System.out.println("map = " + map);
	}

}
