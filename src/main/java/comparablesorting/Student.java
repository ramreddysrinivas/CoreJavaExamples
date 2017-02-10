package comparablesorting;

class Student implements Comparable<Student> {
	 private int rollno;
	private String name;
	private int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int getRollno(){
		return rollno;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}

	@Override
	public int compareTo(Student st) {
		/*if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;*/
		return (age < st.age )? -1 :((age>st.age) ? 1 : 0);
		//return name.compareTo(st.name);//String already override compareTo()
	}
}