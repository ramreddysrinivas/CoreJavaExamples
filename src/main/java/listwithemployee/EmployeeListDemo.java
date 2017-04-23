package listwithemployee;

import java.util.ArrayList;

import java.util.List;
public class EmployeeListDemo {
	public static void main(String[] args) {
		EmployeeListDemo employeeListDemo = new EmployeeListDemo();
	List<Employee> list	=employeeListDemo.createEmployeeList();
		employeeListDemo.iterateEmployeeList(list);
		
	}
	private void iterateEmployeeList(List<Employee> list) {
		for (Employee e : list){
			System.out.println( e);
		}
	}
	private List<Employee> createEmployeeList() {
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("empid","empname","disignation"));
		emps.add(new Employee("empid","empname","disignation"));
		emps.add(new Employee("empid","empname","disignation"));
		emps.add(new Employee("empid","empname","disignation"));
		emps.add(new Employee("empid","empname","disignation"));
		emps.add(new Employee("empid","empname","disignation"));
		return emps;
		
	}
}
