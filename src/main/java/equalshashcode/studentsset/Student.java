package equalshashcode.studentsset;

public class Student {
	private int sno;
	private String sname;
	
	 public Student(int sno, String sname){
		 this .sno= sno;
		 this.sname=sname;
		 
		 }
	 public void setSno(int sno){
		 this.sno= sno;
	 }
	 public int getSno(){
		 return sno;
	 }
	 public void setSname(String sname){
		 this.sname= sname;
	 }
	 public String getSname(){
		 return sname;
	 }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		result = prime * result + sno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		if (sno != other.sno)
			return false;
		return true;
	}
	 
}
