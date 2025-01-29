package com.example.demo;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    private BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        bookService = new BookService(bookRepository);
    }

    @Test
    void testSaveBook() {
        Book book = new Book(1L, "Spring Boot", "John Doe");
        when(bookRepository.save(book)).thenReturn(book);

        Book savedBook = bookService.saveBook(book);

        assertNotNull(savedBook);
        assertEquals("Spring Boot", savedBook.getTitle());
    }

    @Test
    void testGetBookById() {
        Book book = new Book(1L, "Spring Boot", "John Doe");
        when(bookRepository.findById(1L)).thenReturn(Optional.of(book));

        Optional<Book> foundBook = bookService.getBookById(1L);

        assertTrue(foundBook.isPresent());
        assertEquals("Spring Boot", foundBook.get().getTitle());
    }

    @Test
    void testGetAllBooks() {
        Map<Long, Book> bookMap = Map.of(1L, new Book(1L, "Spring Boot", "John Doe"));
        when(bookRepository.findAll()).thenReturn(bookMap);

        Map<Long, Book> allBooks = bookService.getAllBooks();

        assertFalse(allBooks.isEmpty());
        assertEquals(1, allBooks.size());
    }

    @Test
    void testDeleteBook() {
        doNothing().when(bookRepository).deleteById(1L);

        bookService.deleteBook(1L);

        verify(bookRepository, times(1)).deleteById(1L);
    }
}
