package equalshashcode.studentsset;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		Student st1 = new Student(1,"name1");
		Student st2 = new Student(1,"name1");
		Student st3 = new Student(1,"name1");
		Student st4 = new Student(1,"name4");
		set.add(st1);
		set.add(st2);
		set.add(st3);
		set.add(st4);
		System.out.println("size = " +set.size());
		
		for(Student s :set){
			System.out.println(s.getSname() + "   "   + s.getSno());
			
		}
	}

}
