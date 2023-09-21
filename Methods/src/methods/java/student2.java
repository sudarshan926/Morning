package methods.java;

public class student2 {
int roll_no=10;
String  name ="surnar";
String sub="physics";
      void student (int r,String s,String h){
    	  roll_no =r;
    	  name=s;
    	  sub =h;
    	  
}
      void surnar() {
    	  System.out.println(roll_no+ name +sub);
      }
	public static void main(String[] args) {
		student2 s4= new student2();
		student2 s3=new student2();	
		student2 s5=new student2();
		
		s4. surnar();
		s3.surnar  ();
		s5.surnar ();
		
		
		
}
}