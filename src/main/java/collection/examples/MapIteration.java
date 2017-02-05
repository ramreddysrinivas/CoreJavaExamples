package collection.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteration {
	public static void main(String[] args) {
		
		MapIteration mapIteration =  new MapIteration();
	Map<String,String> hashMap	= mapIteration.createHashMap();
	mapIteration.iterateKeySetForEachLoop(hashMap);
	mapIteration.iterateKeySetIterator(hashMap);
	mapIteration.iterateEntrySetForEachLoop(hashMap);
	mapIteration.iterateEntrySetIterator(hashMap);
	}

	private void iterateEntrySetIterator(Map<String, String> hashMap) {
		System.out.println("iterateEntrySetIterator");
		Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
		Iterator<Map.Entry<String, String>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.print("{key = " + entry.getKey() + " value = "
					+ entry.getValue() + "}  ");
		}
		System.out.println();
	}

	private void iterateEntrySetForEachLoop(Map<String, String> hashMap) {
		System.out.println("iterateEntrySetForEachLoop");
		for(Map.Entry<String,String> entry:hashMap.entrySet()){
			System.out.print("{key = " + entry.getKey() + " value = " + entry.getValue() + "}  " );
		}
		System.out.println();
	}

	private void iterateKeySetIterator(Map<String, String> hashMap) {
		System.out.println("iterateKeySetIterator");
		Set<String> keySet = hashMap.keySet();
		Iterator<String> itr = keySet.iterator();
		while(itr.hasNext()){
			String key = itr.next();
			System.out.print("{key = " + key + " value = " + hashMap.get(key) + "}  " );
		}
		System.out.println();
	}

	private void iterateKeySetForEachLoop(Map<String, String> hashMap) {
		System.out.println("iterateKeySetForEachLoop");
		for(String key:hashMap.keySet()){
			System.out.print("{key = " + key + " value = " + hashMap.get(key) + "}  " );
		}
		System.out.println();
	}

	private Map<String, String> createHashMap() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("key1","value1");
		map.put("key2","value2");
		map.put("key5","value5");
		map.put("key4","value1");
		map.put(null,"value1");
		map.put("key1",null);
		map.put(null,"value6");
		map.put("key7","value7");
		map.put("key2",null);
		map.put("key3","value3");
		return map;
	}

}
