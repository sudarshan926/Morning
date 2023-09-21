package chho;

public class inheritance implements m1,m2 {
	
	 public void interfaces(){
		 System.out.println("interfaces");
	 }
	 public void fix(){
		 System.out.println("fix");
	 }
	
	public static void main(String[] args) {
		inheritance s1=new inheritance();
		s1.interfaces();
		s1.fix();
			}

}
