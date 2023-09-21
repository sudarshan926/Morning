package com.Book.in;

public class Book {
	
	private static int bookCount =0;
	
	public static int getBookCount() {
		
		return bookCount++;
	}
	public static void setBookCount(int bookCount) {
		Book.bookCount = bookCount;
	}
	private int bookNo; 
	private String title; 
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title.length()<4) {
			System.out.println("The book must be character 4");
			this.title = title;
		}else {
			System.out.println("Validation is fail...!");
		}
		
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price<5000 || price>1) {
		this.price = price;
		}

	}
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
}
