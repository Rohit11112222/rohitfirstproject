package com.testbook.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testbook.enties.Book;

public interface BookRepositry extends JpaRepository<Book, Integer> {

}
