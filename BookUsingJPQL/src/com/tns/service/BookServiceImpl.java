package com.tns.service;

import java.util.List;

import com.tns.dao.BookDao;
import com.tns.dao.BookDaoImpl;
import com.tns.entities.Book;

public class BookServiceImpl implements BookService{
	private BookDao dao;
	public BookServiceImpl() {
		dao = new BookDaoImpl();
	}
	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorBook(String author) {
		// TODO Auto-generated method stub
		return dao.getAuthorBook(author);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return dao.getAllBook();
	}

	@Override
	public List<Book> getBookInPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		return dao.getBookInPriceRange(low, high);
	}

}
