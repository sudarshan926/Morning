package com.Comparator.in;

public class Employee1 {
	private int empId;
	private String name;
	private String Company;
	
	
	public Employee1(int empId, String name, String company) {
		super();
		this.empId = empId;
		this.name = name;
		Company = company;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", Company=" + Company + "]";
	}
	
}
