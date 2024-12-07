package view.test01;


import java.util.ArrayList;
import java.util.List;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex05BookManager {

	public static void main(String[] args) {
		TextBook t1 = new TextBook("SGK-01", 40, "Nhi Đồng");
		TextBook t2 = new TextBook("SGK-02", 50, "Nhi Đồng", false);
		TextBook t3 = new TextBook("SGK-03", 150, "Giáo Dục");
		ReferenceBook r1 = new ReferenceBook("STK-04", 45, "Giáo Dục", 2);
		ReferenceBook r2 = new ReferenceBook("STK-05", 30, "Giáo Dục", 2);
		
		Book[] books = new Book[] {t1,t2,t3,r1,r2};
	}
	
	private static List<Book> findBooksByPublisher(String publisher, Book[] books) {
		List<Book> foundedBooks = new ArrayList<Book>();
		for(Book book:books) {
			if(book.getPublisher() == publisher) {
				foundedBooks.add(book);
			}
		}
		
		return foundedBooks;
	}
	
	public static double calculateTotalAmount(Book[] books) {
		double amount = 0;
		for(Book book:books) {
			if(book instanceof TextBook) {
				var tb = (TextBook) book;
				if(tb.isNew() == false) {
					amount += tb.getPrice()*0.3; 
				}
				amount += tb.getPrice();
			}
			var rb = (ReferenceBook)book;
			amount += rb.getPrice()*(1 + rb.getTaxInPercent());
		}
		
		return amount;
	}
	
}
