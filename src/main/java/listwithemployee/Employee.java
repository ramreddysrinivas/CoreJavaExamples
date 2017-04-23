package listwithemployee;

public class Employee {
	private String empid;
	private String ename;
	private String disignation;
	
	Employee (String empid,String ename,String disignation){
		this.empid= empid;
		this.ename= ename;
		this.disignation= disignation;
		
	}
	
	public String getEmpid() {
		return empid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public String getDisignation() {
		return disignation;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename
				+ ", disignation=" + disignation  + "]";
	}

}
