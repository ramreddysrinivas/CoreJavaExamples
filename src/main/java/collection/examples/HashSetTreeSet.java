package collection.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTreeSet {
	public static void main(String[] args) {
		HashSetTreeSet hashSetTreeSet = new HashSetTreeSet();
		Set<String> hashSet = hashSetTreeSet.createHashSet();
		 Set<String> treeSet =hashSetTreeSet.createTreeSet();
		 System.out.println("hashSet = " + hashSet);
		 System.out.println("treeSet = " + treeSet);
		// treeSet.add(null);//TreeSet does not allow null value.
		
	}

	private Set<String> createTreeSet() {

		Set<String> set = new TreeSet<String>();
		set.add("element1");
		set.add("element2");
		set.add("element1");
		set.add("element3");
		set.add("A");
		set.add("a");
		
		return set;
	
		
	}

	private Set<String> createHashSet() {

		Set<String> set = new HashSet<String>();
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

}
