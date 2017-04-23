package collection.examples;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsExample {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list3 =list1;// list3 will point to list1 memory. 
		//if we add  any element in list1 it will automatically adds to list3
		list3= new ArrayList<Integer>();// it will create list3 in new memory
		list3.addAll(list1);
		
		System.out.println("list 1 = "  +list1);
		System.out.println("intilally list1 size = "  +list1.size());
		System.out.println("list 3 = "  +list3);
		System.out.println("intilally list3 size = "  +list3.size());
		if(list1.isEmpty()){
			System.out.println("list1 is empty");	
		}else{
			System.out.println("list1 is not empty");
		}
		list1.add(1);
		list1.add(2);
		list1.add(10);
		list1.add(null);
		list1.add(4);
		list1.add(5);
		list1.add(4);
		list1.add(null);
		list1.add(7);
		list1.add(8);
		list1.add(1);
		list1.add(100);
		list1.add(10);
		list1.add(2, 45);
		list1.remove(2);
		System.out.println("list1 = "  +list1);
		System.out.println("list3 = "  +list3);
		System.out.println("after adding elements, list1 size = "  +list1.size());
		if(!list1.isEmpty()){
			System.out.println("list1 is not empty");	
		}else{
			System.out.println("list is  empty");
		}
	
		if(list1.contains(5)){
			System.out.println("list contains element");	
		}else{
			System.out.println("list does not contain element");
		}
		//list.remove(100);// it removes the element at 100th index. it may give  java.lang.IndexOutOfBoundsException 
		                  //if list size is <100
		list1.remove(10);//  it removes the element at 10th index.
		list1.remove(new Integer(10));// it removes the first occurrence of element
		list1.remove(new Integer(100));
		
		System.out.println("after removing element " +list1);
			
			/*Object [] i1 =  list.toArray();
			System.out.println(i1);*/
			
		System.out.println(list1.get(5));
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(list1);
		System.out.println("list2 elements are : " + list2);
		
		list2.clear();
		System.out.println("after clearing list2 : " );
		System.out.println("list1 elements are:" + list1 );
		System.out.println("list2 elements are:" + list2);
		
		
		
	}

}
