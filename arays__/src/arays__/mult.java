package arays__;

public class mult {

	public static void main(String[] args) {
		
		
		
		int a[][] = {
				{1,2,4,5},
				{3,5,6,7},
				{6,3,5,5},
				{9,8,6,5},
		};
       for(int i=0;i<a.length;i++) {
    	   for(int j=0;j<a.length;j++) 
    	   {
    		   
    	   
    	   System.out.print(a[i][j]+",");
    	   }
       }
       System.out.println();
       System.out.println("use inhanced for loop ");
    	   for (int[] h:a)
    	   {
    		   for( int m:h)
    		   
    		   System.out.print(m+"");
    	   }
    	   System.out.println();
       }      
}

