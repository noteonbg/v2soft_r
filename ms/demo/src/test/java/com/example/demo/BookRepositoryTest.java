package com.example.demo;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class BookRepositoryTest {

    private BookRepository bookRepository;

    @BeforeEach
    void setUp() {
        bookRepository = new BookRepository();
    }

    @Test
    void testSaveAndFindBook() {
        Book book = new Book(1L, "Spring Boot", "John Doe");
        bookRepository.save(book);
        Optional<Book> foundBook = bookRepository.findById(1L);

        assertTrue(foundBook.isPresent());
        assertEquals("Spring Boot", foundBook.get().getTitle());
        assertEquals("John Doe", foundBook.get().getAuthor());
    }

    @Test
    void testDeleteBook() {
        Book book = new Book(1L, "Spring Boot", "John Doe");
        bookRepository.save(book);
        bookRepository.deleteById(1L);
        Optional<Book> foundBook = bookRepository.findById(1L);
        assertFalse(foundBook.isPresent());
    }
}
