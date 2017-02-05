package collection.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListVectorDiffrence {
	//debug the program and observe how the size of the List and Vector is increasing
	//at 10,11th elements in List and Vector. {15th,16th elements in List},{20,21st elements in Vector}.
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> vector = new Vector<Integer>();
		arrayList.add(1);arrayList.add(1);arrayList.add(1);arrayList.add(1);
		arrayList.add(1);arrayList.add(1);arrayList.add(1);arrayList.add(1);
		arrayList.add(1);arrayList.add(10);
		vector.add(1);vector.add(1);vector.add(1);vector.add(1);
		vector.add(1);vector.add(1);vector.add(1);vector.add(1);
		vector.add(1);vector.add(10);
		arrayList.add(11);
		vector.add(11);
		arrayList.add(1);arrayList.add(1);arrayList.add(1);arrayList.add(1);
		arrayList.add(1);
		arrayList.add(1);arrayList.add(1);arrayList.add(1);
		arrayList.add(1);arrayList.add(10);
		vector.add(1);vector.add(1);vector.add(1);vector.add(1);
		vector.add(1);vector.add(1);vector.add(1);vector.add(1);
		vector.add(1);
		vector.add(10);
		
		
	}

}
