package serialization.cloning.example;

import java.io.Serializable;

public class Employee implements Serializable,Cloneable {
	// remove the implements Serializable, run SerializationDemo and observe the
	// o/p.
	private String ename;
	private String eid;
	private String designation;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", designation="
				+ designation + "]";
	}

	/*public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}*/
	public Employee clone() {
		Employee o = null;
		try {
			o = (Employee)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}
}
