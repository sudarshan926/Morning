package com.armstrong;

public class Studen
 {
   int rollno;
  String name;
  float fee;
    Studen(int rollno,String name,float fee)
   {
    this.rollno=rollno;
   this. name=name;
    this.fee=fee;
  }
   void display()
   {
     System.out.println(rollno+" "+name+" "+fee);
   }
	
	
   

public static void main(String args[])
{
  Studen s1=new Studen(111,"ankit",5000f);
  Studen s2=new Studen(112,"sumit",6000f);
   s1.display();
  s2.display();
}
}