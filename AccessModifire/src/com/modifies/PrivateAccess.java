package com.modifies;
  
class Demo{
	private String name; 
	   
	   public String getName() {
		   return name;
	   }
	   
	   public void setName(String myname)
	   {
		   this.name=myname;
	   }
}
public class PrivateAccess{
	
	public static void main(String[] args) {
		Demo p=new Demo();
	     p.setName("Vikas");
		System.out.println(p.getName());
	//System.out.println(p.name="vikas");//compile time error	
	}
}
