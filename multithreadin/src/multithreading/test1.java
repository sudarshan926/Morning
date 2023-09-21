package multithreading;

public class test1 {

	public static void main(String[] args) {
		class1 a1=new class1();
		N b=new N();
		a1.start();
		b.start();
		b.run();
		a1.run();
		System.out.println();
		
          
         
         
	}

}
