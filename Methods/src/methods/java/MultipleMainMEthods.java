package methods.java;

public class MultipleMainMEthods {
	 public static void main() {
	    	System.out.println("Hellow Word");
		}
		
 class simple extends MultipleMainMEthods{
	public static void main() {
		    	System.out.println("Hellow Java");
		}
	 }
	public static void main(String[] args) {
		MultipleMainMEthods.main();
		MultipleMainMEthods.main();
		
	}

}


