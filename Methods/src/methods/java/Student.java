package methods.java;

public class Student {
	      int roll_no=101;
	      String name="Sudhir";
	      String college="Fusion";
	     
	     public  void Student(int g, String s, String c) {// Initialization
	    	  roll_no=g;
	    	  name=s;
	    	  college=c;
	      }
	      void dispaly(){
	    	  System.out.println(roll_no+" " +name+" " +college );
	      }
	public static void main(String[] args) {
		
		Student s=new Student();
		Student s2=new Student();
		Student d=new Student();
		Student m=new Student();
		s.dispaly();
		s2.dispaly();
		d.dispaly();
		m.dispaly();	
	}
}
