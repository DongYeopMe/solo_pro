package com.example.sample.book.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookPatchDto {

    private Long bookId;
    private String Title;
    private String Author;
    private int Price;
    private int quantity;
}
