package com.example.sample.book;

import com.example.sample.book.dto.BookPatchDto;
import com.example.sample.book.dto.BookPostDto;
import com.example.sample.book.dto.BookResponseDto;
import com.example.sample.book.entity.Book;

public interface BookMapper {
    Book BookPostDtoToBook(BookPostDto bookPostDto);
    BookResponseDto BookToBookResponseDto(Book book);
    Book bookPatchDtoToBook(BookPatchDto bookPatchDto);
}
