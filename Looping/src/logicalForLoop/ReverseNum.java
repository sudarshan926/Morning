package logicalForLoop;

public class ReverseNum {

    public  static void main(String[] args) {
		
		int s=123;
	
		int d=0;
	  while(s>0)
		{
			d=s%10;
			System.out.print(d);
			s=s/10;
		}
	 
	}

}
