package com.tns.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import com.tns.entities.Book;

public class BookDaoImpl implements BookDao {
	private EntityManager entitymanager;
	public BookDaoImpl() {
		entitymanager = JPAUtil.getEntityManager();
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		Book book = entitymanager.find(Book.class,id);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		String str = "Select book from Book book where book.title=:pTitle";
		TypedQuery<Book>  query = entitymanager.createQuery(str,Book.class);
		query.setParameter("pTitle", title);
		List<Book> booklist = query.getResultList();
		return booklist;
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		String str = "Select Count(book.id) from Book book";
		TypedQuery<Long> query = entitymanager.createQuery(str, Long.class);
		Long count = query.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getAuthorBook(String author) {
		// TODO Auto-generated method stub
		String qStr = "Select book from Book book where book.author=:pAuthor";
		TypedQuery<Book> query = entitymanager.createQuery(qStr,Book.class);
		query.setParameter("pAuthor", author);
		List<Book> booklist = query.getResultList();
		return booklist;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		Query  query = entitymanager.createNamedQuery("getAllBooks");
		List<Book> booklist = query.getResultList();
		return booklist;
	}

	@Override
	public List<Book> getBookInPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		String qstr = "select book from  Book book where book.price between :low and :high";
		TypedQuery<Book> query = entitymanager.createQuery(qstr,Book.class);
		query.setParameter("low",low);
		query.setParameter("high", high);
		List<Book> booklist = query.getResultList();
		return booklist;
	}

}
