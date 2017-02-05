package collection.examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetLinkedHashSet {
	public static void main(String[] args) {
		HashSetLinkedHashSet hashSetLinkedHashSet= new HashSetLinkedHashSet();
		
	Set<String> hashSet	=hashSetLinkedHashSet.createHashSet();
	Set<String> linkedHashSet	=hashSetLinkedHashSet.createLinkedHashSet();
	System.out.println("hashSet = " + hashSet);
	System.out.println("linkedHashSet = " +linkedHashSet);
	}

	private Set<String> createLinkedHashSet() {

		Set<String> set = new LinkedHashSet<String>();
		set.add("element1");
		set.add("element2");
		set.add("element1");
		set.add(null);
		set.add("element3");
		set.add("A");
		set.add("a");
		set.add(null);
		
		return set;
	
		
		
	}

	private Set<String> createHashSet() {
		Set<String> set = new HashSet<String>();
		set.add("element1");
		set.add("element2");
		set.add(null);
		set.add("element1");
		set.add("element3");
		set.add("A");
		set.add(null);
		set.add("a");
		
		return set;
	}
	

}
