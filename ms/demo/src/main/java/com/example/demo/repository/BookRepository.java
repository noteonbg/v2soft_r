package com.example.demo.repository;



import com.example.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class BookRepository {
    private Map<Long, Book> bookMap = new HashMap<>();

    // Save a book
    public Book save(Book book) {
        bookMap.put(book.getId(), book);
        return book;
    }

    // Find a book by id
    public Optional<Book> findById(Long id) {
        return Optional.ofNullable(bookMap.get(id));
    }

    // Get all books
    public Map<Long, Book> findAll() {
        return bookMap;
    }

    // Delete a book by id
    public void deleteById(Long id) {
        bookMap.remove(id);
    }
}
