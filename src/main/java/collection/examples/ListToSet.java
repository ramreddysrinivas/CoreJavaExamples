package collection.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
	public static void main(String[] args) {
		ListToSet listToSet = new ListToSet();
		List<Integer> arrayList =listToSet.createArrayList(5);
		arrayList.add(1);
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(2);
		arrayList.add(5);
		System.out.println("arrayList = " + arrayList);
	Set<Integer>	hashSet= listToSet.convertToHashSet(arrayList);
	System.out.println("hashSet = " + hashSet);
	}

	private Set<Integer> convertToHashSet(List<Integer> arrayList) {
		
		Set<Integer> set = new HashSet<Integer>(arrayList);
		
		return set;
	}

	private List<Integer> createArrayList(int count) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<count;i++){
			list.add(i);
		}
		return list;
	}

}
