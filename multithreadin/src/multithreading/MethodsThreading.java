package multithreading;
class A extends Thread {
	
	public void run() {
	for (int i = 0; i <=5; i++) {
			System.out.println("XYZ " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}}}}
class B implements Runnable{

	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println("ABC " + i);
	}}}
public class MethodsThreading {
	public static void main(String[] args) throws InterruptedException {
		A d=new A();
		d.start();
		System.out.println("Default Priority");
     	System.out.println(d.getPriority());
		B d1=new B();
		Thread t=new Thread(d1);
		t.setPriority(10);// minimum prority
		t.start();
		  d.join();
		  t.join();
		 System.out.println("Minimum Priority: "+d.MIN_PRIORITY);
		 System.out.println("Normal Priority: "+d.NORM_PRIORITY);
		 System.out.println("Max Priority: "+d.MAX_PRIORITY);
		 System.out.println("Class A :"+d.getName());
		 System.out.println("Class B :"+t.getName());
		 d.setName("Mythread");
		 t.setName("YourThread");
		 System.out.println("After changing name of threads :");
		 System.out.println("Class A :"+d.getName());
		 System.out.println("Class B :"+t.getName());
		 System.out.println("Current Thread :"+t.currentThread());
		 System.out.println(t.getClass());
		}
}



	
