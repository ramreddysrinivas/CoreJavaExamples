package collection.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithListValues {
	public static void main(String[] args) {
		MapWithListValues mapWithListValues =  new MapWithListValues();
		Map<String,List<String>> map = mapWithListValues.prepareMap();
		System.out.println(" map = " + map );
		mapWithListValues.iterateMapForEachLoop(map);
	}

	private void iterateMapForEachLoop(Map<String, List<String>> map) {
		for(String key : map.keySet()){
		 List<String> valueList = map.get(key);
		 System.out.println("valueList = " + valueList);
		 System.out.println("key = " + key + " value = " );
		 for(String value : valueList   ){
			 System.out.print(value + "  ");
		 }
		 System.out.println();
		}
		
		
	}

	private Map<String, List<String>> prepareMap() {
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		List<String> addresses1 = new ArrayList<String>();
		addresses1.add("morthad");
		addresses1.add("chandanagar");
		addresses1.add("nellore");
		map.put("kiran", addresses1);
		List<String> addresses2 = new ArrayList<String>();
		addresses2.add("morthad");
		addresses2.add("yusufguda");
		addresses2.add("nellore");
		addresses2.add("nirmal");
		map.put("srinu", addresses2);
		return map;
	}

}
