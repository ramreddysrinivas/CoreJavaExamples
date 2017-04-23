package collection.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample {
	public static void main(String[] args) {
		System.out.println("\'nshdgdihoahdgd\'" );
		Integer[] array1 = {10,2,13,4,6,5,4,3,8};
		System.out.println("array1 = " + array1);
		
	//	List<Integer> list = new ArrayList<Integer>(array1);// its gives compilation error.
	List<Integer> list	= Arrays.asList(array1);
	System.out.println("list = " + list);
	Arrays.sort(array1);
	System.out.println("after sorting " + list );
	}

}
