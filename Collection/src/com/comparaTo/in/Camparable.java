package com.comparaTo.in;

import java.util.ArrayList;
import java.util.Collections;

public class Camparable {

	public static void main(String[] args) {
		ArrayList<Student> stud = new ArrayList<Student>();
		Student s = new Student(1, "Suraj");
		Student s1 = new Student(2, "Sumit");
		Student s2 = new Student(5, "Ram");
		Student s3 = new Student(4, "Sham");
		Student s4 = new Student(3, "Sham");

		stud.add(s);
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		System.out.println("Before Sort element :");

		for (Student st : stud) {
			System.out.println(st.getRollno() + " " + st.getName());
		}
		System.out.println("AfterSort element :");

		Collections.sort(stud);
		for (Student st : stud) {
			System.out.println(st.getRollno() + " " + st.getName());
		}

	}

}
