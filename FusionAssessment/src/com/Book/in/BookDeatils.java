package com.Book.in;

import java.util.Scanner;

public class BookDeatils {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Book b=new Book();
		Book b1[]=new Book[3];
		for(int i=0;i<b1.length;i++) {
			System.out.println("Book Datails :"+b1);
		}
		System.out.println("Following Book details shown below");
		System.out.println("Book Number :");
		int bookNo=sc1.nextInt();
		System.out.println("title :");
		String title=sc.nextLine();
		System.out.println("Author :");
		String author=sc.nextLine();
		System.out.println("Price :");
		float price=sc1.nextFloat();
		System.out.println();
		
		b.setAuthor(author);
		b.setBookNo(bookNo);
		b.setPrice(price);
		b.setTitle(title);
		
		System.out.println("Author :"+b.getAuthor());
		System.out.println("Book :"+b.getBookNo());
		System.out.println("Price :"+b.getPrice());
		System.out.println("Title :"+b.getTitle());
		sc.nextLine();
		sc.next();
		sc.close();
		for(Book k:b1) {
			
			
		}
	}
}
