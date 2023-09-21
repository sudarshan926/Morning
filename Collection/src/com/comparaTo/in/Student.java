package com.comparaTo.in;

import java.util.ArrayList;
import java.util.Comparator;
public class Student implements Comparable<Student> {
	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(rollno==o.rollno) {
			return 0;
		}
		else if(rollno>o.rollno) {
			return 1;
		}
		return -1;
	}

	}

	
	
	
