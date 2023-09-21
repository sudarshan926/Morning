package com.encapsulation.in;

public class StudData  {
	
	public static void main(String[] args) {
		Grades g=new Grades("Suraj",22,88.09);
		g.setAge(35);
		g.setGrade(95.8);
		g.setName("shubham");
		g.show();
		g.setAge(32);
		g.setGrade(67);
		g.setName("Sanjay");
		g.show();
		
	}

}
