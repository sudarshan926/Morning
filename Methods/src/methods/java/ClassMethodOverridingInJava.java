package methods.java;

class Madhav{
	
	  public void love(String Partner){
	    System.out.println("Ashwini First Love  :"+Partner);
	  }
}
class Ashwini extends Madhav{
	//After ending college Ashwinies Love:
	public void love(String partner,String partner2) {
		System.out.println("Ashwini Loves After College :"+partner+" And "+partner2);
	}
}
public  class ClassMethodOverridingInJava {

	public static void main(String[] args) {
		
		Ashwini love=new Ashwini();
		love.love("Madhav");
		love.love("Dhiraj","Arvind");
	}
}
