package com.example.demo;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

//mvn test
//mvn -Dtest=BookRepositoryTest test
//mvn -Dtest=BookRepositoryTest#testSaveAndFindBook test

import com.example.demo.controller.BookController;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;


public class BookControllerTest {

	
	private MockMvc mockMvc;

    @Mock
    private BookService bookService;

    private BookController bookController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        bookController = new BookController(bookService);
        mockMvc = MockMvcBuilders.standaloneSetup(bookController).build();
    }

    @Test
    void testCreateBook() throws Exception {
        Book book = new Book(1L, "Spring Boot", "John Doe");
        when(bookService.saveBook(any(Book.class))).thenReturn(book);

        mockMvc.perform(post("/api/books")
                        .contentType("application/json")
                        .content("{\"id\":1,\"title\":\"Spring Boot\",\"author\":\"John Doe\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.title").value("Spring Boot"));
    }

    @Test
    void testGetBookById() throws Exception {
        Book book = new Book(1L, "Spring Boot", "John Doe");
        when(bookService.getBookById(1L)).thenReturn(Optional.of(book));

        mockMvc.perform(get("/api/books/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Spring Boot"));
    }
}
