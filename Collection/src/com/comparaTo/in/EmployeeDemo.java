package com.comparaTo.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDemo {

	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee(105,"Rahul",9307265103l));
		emp.add(new Employee(102,"Sujit",9207265103l));
		emp.add(new Employee(103,"Virat",99072651056l));
		emp.add(new Employee(106,"Amar",9707265103l));
		emp.add(new Employee(107,"Mangesh",98072651049l));
		emp.add(new Employee(101,"Abhijit",6307265103l));

		for(Employee emp1:emp) {
			System.out.println(emp1.getEmpId()+" "+emp1.getName()+"   "+emp1.getNum());
		}
		System.out.println("\nAfter Sorting EMPID: ");
		Collections.sort(emp);
		for(Employee emp1:emp) {
			System.out.println(emp1.getEmpId()+" "+emp1.getName()+"   "+emp1.getNum());
		}
		System.out.println("\nComparator Name and EmpID:");
		ArrayList<Employee> emps=new ArrayList<>(emp);
	
		Collections.sort( emps,new NameComparators());
		for(Employee emp1:emps) {
			System.out.println(emp1.getEmpId()+" "+emp1.getName()+"   "+emp1.getNum());
		}
		Collections.sort( emps,new EmpIDComparators());
		System.out.println("\nComparator Name and EmpID:");

		for(Employee emp1:emps) {
			System.out.println(emp1.getEmpId()+" "+emp1.getName()+"   "+emp1.getNum());
		}
		
		
	}


}
