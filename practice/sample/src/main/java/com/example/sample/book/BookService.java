package com.example.sample.book;

import com.example.sample.book.entity.Book;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookService {

    public Book createbook(Book book) {
        return book;
    }

    public Book updateBook(Book book) {
        return book;
    }

    public Book findBook(long bookId) {
        Book book1 = new Book(1L, "집에", "가자", 100, 2);
        return book1;
    }

    public List<Book> findBooks() {
        List<Book> booklist = List.of(new Book(1L, "집에", "가자", 100, 2),
                new Book(2L, "집에", "못가", 100, 2));
        return booklist;
    }
    public void deleteBook(long boodId){

    }
}