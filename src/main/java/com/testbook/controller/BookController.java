package com.testbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testbook.enties.Book;
import com.testbook.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService service;
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book)
	{
		return service.saveBook(book);
	}
	@GetMapping("/book/{id}")
	public Book findBookById(@PathVariable int id)
	{
		return service.getBookById(id);
	}

}
