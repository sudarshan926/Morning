package com.encapsulation.in;

public class BankDemo {
	private double balance;
	
	public double getBalance() {
		return this.balance;		
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposite :"+balance);
		}
		else {
			System.out.println("Not Deposited balance");
		}}
   public void withdrow(double amount) {
	   
		if(amount>0) {
			balance-=amount;
			System.out.println("Withdrow :"+balance);
		}
		else {
			System.out.println("Not Withdrow balance");
			}
	}
	public static void main(String[] args) {
		BankDemo b=new BankDemo();
		b.setBalance(3000.0);
		System.out.println("Current balance :"+b.getBalance());
		b.deposit(0);
		System.out.println("Current balance :"+b.getBalance());
		b.withdrow(300);
		}
}
