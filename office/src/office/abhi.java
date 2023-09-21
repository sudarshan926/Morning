package office;

public class abhi implements a1,a2 {
	public void substraction (){
	
		System.out.println("substraction");
	}
	public void addition(){
			
			System.out.println("addtion");
		}
	
	public  void multiplication () {
		System.out.println("multiplication");
	}
	public void mudulo () {
		System.out.println("mudulo ");
	}
	public void division () {
		System.out.println("division");
	}
	
	
	public static void main(String[] args) {
		abhi s1 =new abhi();
		s1.substraction();
		s1.addition ();
		s1.multiplication();
		s1.mudulo();
		s1.division();
	}

}
