package multithreading;
class Demo  extends Thread {
	
	public void run() {
	for (int i = 0; i <=10; i++) {
			System.out.println("A " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
		}
	}
}
class Demo1 implements Runnable{

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("B " + i);
		}
	}	
}
public class Threading {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.start();
		Demo1 d1=new Demo1();
		Thread t=new Thread(d1);
		t.start();	
		}
}