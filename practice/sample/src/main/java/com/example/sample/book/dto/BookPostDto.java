package com.example.sample.book.dto;

import lombok.Getter;

@Getter
public class BookPostDto {
    private Long bookId;
    private String Title;
    private String Author;
    private int Price;

}
