package com.Comparator.in;

import java.util.ArrayList;
import java.util.Collections;

import com.comparaTo.in.Employee;

public class Comparators {

	public static void main(String[] args) {
		ArrayList<Employee1> emp = new ArrayList<>();
		emp.add(new Employee1(105, "Rahul", "Infosys"));
		emp.add(new Employee1(103, "Abhinav", "TCS"));
		emp.add(new Employee1(107, "Ganesh", "Hexaware"));
		emp.add(new Employee1(109, "Mangesh", "TIAA"));
		emp.add(new Employee1(104, "Swapnil", "Wipro"));
		emp.add(new Employee1(102, "Krishna", "HCL"));

		System.out.println("Before Sort EmpID :");

		for (Employee1 e : emp) {
			System.out.println(e.getEmpId() + " " + e.getName() + "      " + e.getCompany());
		}
		
		Collections.sort(emp, new EmpIdComparator());
		System.out.println("\nAfter Sort  EmpID :");

		for (Employee1 e : emp) {
			System.out.println(e.getEmpId() + "  " + e.getName() + "      " + e.getCompany());
		}

	}
}