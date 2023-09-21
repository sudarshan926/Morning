

package om.Protected.in;
class Super{
	  protected void super1(int a,int b) {
		int c=a+b;
		System.out.println("Addition: "+c);
      }
	}
class Sub1 extends Super{
      protected void sub1(int a,int b){
	  int c=a-b;
	  System.out.println("Division: "+c);
    }  
   }
class Protected2 extends Sub1{
	protected void show() {
		System.out.println("Hello Java");
	}
}
public class ProtectedClass  {
	public static void main(String[] args) {
		Protected2 p=new Protected2();
		p.show();
		p.super1(30, 40);
		p.sub1(34, 14);
	}
}
