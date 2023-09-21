package Forloop.com;

public class BreakKeyword {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;//Terminate the loop at condition i==5
			}
			System.out.println(i);
		}
	}
}
