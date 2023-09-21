package Forloop.com;

public class ContinueKeyword {

	public static void main(String[] args) {
		for(int m=1;m<=10;m++)
		{
			if(m==7)
			{
				continue;//Skip the current iteration at number 7 
				//and continue next iteration of loop.
			}
			System.out.println(m);
		}
	}
}
