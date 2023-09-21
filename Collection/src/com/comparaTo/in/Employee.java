package com.comparaTo.in;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String name;
	private long num;
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empId-o.empId;
	}
	
	
	public Employee(int empId, String name, long num) {
		super();
		this.empId = empId;
		this.name = name;
		this.num = num;
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
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", num=" + num + "]";
	}	
	
}
