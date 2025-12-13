package com.revature.library.controller;

import com.revature.library.model.Book;
import com.revature.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * BookController - TODO: Complete the REST endpoints
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

    // TODO: Add BookService with constructor injection
    // private final BookService bookService;

    // TODO: Create constructor
    // public BookController(BookService bookService) {
    // this.bookService = bookService;
    // }

    @GetMapping
    public List<Book> getAllBooks() {
        // TODO: Return all books
        return null;
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id) {
        // TODO: Return book by ID, handle not found case
        return null;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        // TODO: Add and return the new book
        return null;
    }

    @PutMapping("/{id}/checkout")
    public Book checkoutBook(@PathVariable Long id) {
        // TODO: Checkout the book
        return null;
    }

    @PutMapping("/{id}/return")
    public Book returnBook(@PathVariable Long id) {
        // TODO: Return the book
        return null;
    }
}
