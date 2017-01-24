package collection.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMethodsExample {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		System.out.println("set1  = "  +set1);
		System.out.println("intilally set1 size = "  +set1.size());
		if(set1.isEmpty()){
			System.out.println("set1 is empty");	
		}else{
			System.out.println("set1 is not empty");
		}
		set1.add(1);
		set1.add(2);
		set1.add(10);
		set1.add(null);
		set1.add(4);
		set1.add(5);
		set1.add(4);
		set1.add(null);
		set1.add(7);
		set1.add(8);
		set1.add(1);
		set1.add(100);
		set1.add(10);
		System.out.println("set1 = "  +set1);
		System.out.println("after adding elements, set1 size = "  +set1.size());
		
		if(set1.isEmpty()){
			System.out.println("set1 is empty");	
		}else{
			System.out.println("set1 is not empty");
		}
		System.out.println(set1.remove(1000));// it removes the element if it is present in set. 
		set1.remove(1);// it removes element 1 from the set.but not 1st index element.
		System.out.println("after removing set1 = " + set1);
		if(set1.contains(5)){
			System.out.println("set1 contains element");	
		}else{
			System.out.println("set1 does not contain element");
		}
		List<Integer> set2 = new ArrayList<Integer>();
		set2.addAll(set1);
		System.out.println("set2 elements are : " + set2);
		
		set2.clear();
		System.out.println("after clearing set2 : " );
		System.out.println("set1 elements are:" + set1 );
		System.out.println("set2 elements are:" + set2);
		
	}

}
