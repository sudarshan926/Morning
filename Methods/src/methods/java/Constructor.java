package methods.java;

public class Constructor {
	  int Empid;
	  String name; String Company;
	  String Position;static long  Salary;
	
	 Constructor(int i,String n, String s, String g,long p){
        Empid=i;name=n; Company=s;
	    Position=g;Salary=p; 
	   
		 System.out.println(+Empid+" "+name+" "+Company+" "+Position+" "+Salary);  
	   }
	public static void main(String[] args) {
		System.out.println("Empid"+"  Name "+   "    Company  "+  "  Position  "+  "     Salary ");
		System.out.println("-------------------------------------------------");
		//Constructor c=new Constructor(id,"Name","Institute","Position",Salary);
		Constructor c1=new Constructor(101, "   Abarao","  Vionsys","   JavaDevloper  ",900000);
		Constructor c2=new Constructor(102, "   Ganesh","  TCS    ","   JavaDevloper  ",150000);
		Constructor c3=new Constructor(103, "   Payal ","  Infosys ","  Tester        ",100000);
		Constructor c4=new Constructor(104, "   Arvind","  Capgemini"," Tester        ",800000);
		Constructor m7=new Constructor(105, "   Vishal","  Zenser   "," Javadevloper  ",500000);
		Constructor m8=new Constructor(106, "   Akash","   Citibank  ","AWS           ", 450000);
	}
}
