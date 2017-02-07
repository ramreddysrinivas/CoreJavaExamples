package collection.examples;

import java.util.ArrayList;
import java.util.List;

public class ListConcurrentModificationException {
	public List<String> prepareList(int size) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < size; i++) {
			list.add("element" + i);
		}
		return list;
	}
	public static void main(String[] args) {
		ListConcurrentModificationException object = new ListConcurrentModificationException();
	List<String> list	= object.prepareList(10);
	System.out.println("list = " + list);
	for (String s : list){
		if(s.equals("element3")){
			//list.remove("element3");// it throws java.util.ConcurrentModificationException
			//list.add("element3");//it throws java.util.ConcurrentModificationException
		}
			
		
		
	}
		
	}

}
