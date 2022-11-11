package com.tns.client;

import com.tns.entities.Book;
import com.tns.service.BookService;
import com.tns.service.BookServiceImpl;

import javassist.bytecode.Descriptor.Iterator;

public class Client {
	public static void main(String args[] ) {
		BookService service = new BookServiceImpl();
		
		System.out.println("\n**************List all the books **************");
		for (Book book:service.getAllBook()) {
			System.out.println(book);
		}
		
		System.out.println("\n\n**************List number ofbooks **************");
		System.out.println(service.getBookCount());
			
		System.out.println("\n\n**************List books BY TITLE **************");
		for (Book book:service.getBookByTitle("java")) {
			System.out.println(book);
			}
			
		System.out.println("\n\n************** books by author **************");
		System.out.println(service.getAuthorBook("vilas"));
		
		
			
		System.out.println("\n**************List price in between 500 to 1000 **************");
		System.out.println(service.getBookInPriceRange(500, 600));
			
		System.out.println("\n**************book by id **************");
		System.out.println(service.getBookById(2));
			
				
	}

}
