package com.comparaTo.in;

import java.util.Comparator;

public class EmpIDComparators implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId()-o2.getEmpId();
	}

	
	

	

}
