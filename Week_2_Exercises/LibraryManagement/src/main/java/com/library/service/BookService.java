package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public BookRepository getBookRepository() {
        return bookRepository;
    }
    public void someMethod() {
        System.out.println("Executing someMethod in BookService");
    }

}
