package com.Comparator.in;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId()-o2.getEmpId();
	}
}
