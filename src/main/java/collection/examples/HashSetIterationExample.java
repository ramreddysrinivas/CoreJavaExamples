package collection.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterationExample {
	
	public static void main(String[] args) {
		HashSetIterationExample hashSetIterationExample = new HashSetIterationExample();
		Set<String>	set =hashSetIterationExample.createHashSet();
		System.out.println("set  = " + set);
		hashSetIterationExample.iterateHashSetForeachLoop(set);
		hashSetIterationExample.iterateHashSetWithIterator(set);
	}
	private void iterateHashSetWithIterator(Set<String> set) {
		System.out.println("\n iterateHashSetWithIterator");
		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
	}
	private void iterateHashSetForeachLoop(Set<String> set) {
		System.out.println("iterateHashSetForeachLoop");
		for(String s : set){
			System.out.print(s  + " ");
		}
	}
	private Set<String> createHashSet() {
		String s1="first";
		String s2 = new String(s1);
		Set<String> set1 = new HashSet<String>();
		set1.add(s1);
		set1.add(s2);
		set1.add(null);
		set1.add("second");
		set1.add(null);
		set1.add("null");
		set1.add("third");
		return set1;
	}

}
