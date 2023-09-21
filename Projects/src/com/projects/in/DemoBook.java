package com.projects.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book1 {

	String Bookno;
	String Bookname;
	String author;
	String Price;

	public Book1(String bookno, String bookname, String author, String price) {
		super();
		Bookno = bookno;
		Bookname = bookname;
		this.author = author;
		Price = price;
	}

	public String getBookno() {
		return Bookno;
	}

	public void setBookno(String bookno) {
		Bookno = bookno;
	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Book1 [Bookno=" + Bookno + ", Bookname=" + Bookname + ", author=" + author + ", Price=" + Price + "]";
	}

}

public class DemoBook {

	public static void main(String[] args) {

		ArrayList<Book1> ar = new ArrayList<>();
		Map<String, Book1> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		int choice;
		System.out.println("About Book");
		while (true) {

			System.out.print("Enter Choice :");
			choice = sc1.nextInt();

			switch (choice) {

			case 1:
				System.out.print("EnterBook No:");
				String Bookno = sc.nextLine();
				System.out.print("EnterBookname :");
				String Bookname = sc.nextLine();
				System.out.print("Enter author:");
				String author = sc.nextLine();
				System.out.print("Enter price:");
				String price = sc.nextLine();

				Book1 b = new Book1(Bookno, Bookname, author, price);
				ar.add(b);
				map.put(Bookno, b);
				System.out.println("Book Added");
				break;
			case 2:
				if (ar.isEmpty()) {
					System.out.println("Not have any Book :");
				} else {

					for (Book1 s : ar) {
						System.out.println("BookNo: " + s.Bookno + "\n" + "BookName: " + s.getBookname() + " \n"
								+ " Author :" + s.getAuthor() + "\n" + " PriceBook :" + s.getPrice());
					}
				}

				System.out.println("Books are addedd");
				break;
			case 3:
				System.out.println("Searching Book In Your List :");
				System.out.println("Search book:");

				String Booksearch = sc1.next();
				Book1 searched = map.get(Booksearch);
				if (Booksearch != null) {
				   System.out.println("searched BookNO :" + searched);
				} else {
					System.out.println("Not Found Book sorry Please Check again...!");
				}
				break;
			case 4:
				System.out.println("Remove Book :");
	             String search=sc.nextLine();
	             if(search!=null) {
				Book1 remove=map.remove(search);
				System.out.println("Please EnterBookNumber :"+remove);
	             }else {
	            	 System.out.println("Please check not yet any book...!");
	             }
	             break;
	             
			case 5:
			}
		}

	}
}
