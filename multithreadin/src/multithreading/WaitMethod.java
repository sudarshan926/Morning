package multithreading;

public class WaitMethod extends Thread {
	int amount=0;
	
	public void run() {
		synchronized(this) {
			
		for(int i=0;i<5;i++) {
			amount =amount+1000;
		  }
		}
	}
	public static void main(String[] args) throws InterruptedException {
		WaitMethod w=new WaitMethod();
		w.start();
		synchronized(w) {
			w.wait();
			System.out.println(w.amount);
		}
	}
}
