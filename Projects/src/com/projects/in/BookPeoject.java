package com.projects.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookPeoject {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		Map<String, Book> bookMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Book Library");
			System.out.println("1. Add Book");
			System.out.println("2. List Books");
			System.out.println("3. Search Book by ISBN");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				System.out.print("Enter ISBN: ");
				String isbn = scanner.nextLine();
				System.out.print("Enter Title: ");
				String title = scanner.nextLine();
				System.out.print("Enter Author: ");
				String author = scanner.nextLine();

				Book newBook = new Book(isbn, title, author);
				bookList.add(newBook);
				bookMap.put(isbn, newBook);
				System.out.println("Book added!");
				break;
			case 2:
				if (bookList.isEmpty()) {
					System.out.println("No books in the library.");
				} else {
					System.out.println("Book List:");
					for (Book book : bookList) {
						System.out.println(book);
					}
				}
				break;
			case 3:
				System.out.print("Enter ISBN to search: ");
				String searchIsbn = scanner.nextLine();
				Book foundBook = bookMap.get(searchIsbn);
				if (foundBook != null) {
					System.out.println("Book found: " + foundBook);
				} else {
					System.out.println("Book not found.");
				}
				break;
			case 4:
				System.out.println("Exiting Book Library.");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}
}

class Book {
	private String isbn;
	private String title;
	private String author;

	public Book(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "ISBN: " + isbn + ", Title: " + title + ", Author: " + author;
	}
}
