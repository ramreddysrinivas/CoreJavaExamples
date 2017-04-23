package collection.examples;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionHeterogeneousData {
	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add(5);
		collection.add(true);
		collection.add(5.5);
		collection.add("4");
		
		collection.add('a');
		System.out.println(collection);
		//System.out.println(5+"4"+true );
	}

}
