package collection.examples;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String,String> hashtable = new  Hashtable<String,String>();
		hashtable.put("kay1", "value1");
		hashtable.put("kay2", "value2");
		hashtable.put("kay3", "value1");
		hashtable.put("kay1", "value2");
		
		System.out.println("hashtable = " + hashtable);
		//hashtable.put(null, "value2");// throws NullPointerException.
		//hashtable.put("key1", null);// throws NullPointerException.
		//hashtable.put(null, null);// throws NullPointerException.
		
	}

}
