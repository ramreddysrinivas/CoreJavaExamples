package serialization.cloning.example;

public class CloneableDemo {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEname("name1");
		employee.setEid("eid1");
		employee.setDesignation("designation1");
		System.out.println(employee);
		//Employee employee2 = (Employee)employee.clone();// check  commented clone() in Employee.
		Employee employee2 = employee.clone();
		System.out.println(employee2);
		if(employee.equals(employee2)){
			System.out.println("employee and employee2 are same");
		}else{
			System.out.println("employee and employee2 are  not same");
		}
		
	}

}
