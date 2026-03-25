package Week6;

import java.util.ArrayList;

public class Employee {
	private String name;
	private String email;
	private Department department;
	
	public Employee(String name, String email, Department department) {
		this.name = name;
		this.email = email;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public String toString() {
		String result = name + " (" + email + "), " + department.getName() + " department";
		return result;
	}
	
}
