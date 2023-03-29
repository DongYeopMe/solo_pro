package com.example.sample.book.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {

    private Long bookId;
    private String Title;
    private String Author;
    private int Price;
    private int Quantity;
}
