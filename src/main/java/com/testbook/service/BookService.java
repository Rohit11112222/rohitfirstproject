package com.testbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testbook.enties.Book;
import com.testbook.repositry.BookRepositry;

@Service
public class BookService {
     
	@Autowired
	private BookRepositry repositry;
	
	public Book saveBook(Book book)
	{
		return repositry.save(book);
	}
	public Book getBookById(int id)
	{
		return repositry.findById(id).orElse(null);
	}
}
