package Forloop.com;

public class Demo {
   
	static int b=20;
	private static void demo1() {
		
		System.out.println(b);
	}
	
	public void add() {
		int d=10;
		int a=10;
		int c=a+d;
		System.out.print(c);
	}
	public  void main(String[] args) {
		Demo b=new Demo();
		Demo.demo1();
		b.add();
		

	}

}
