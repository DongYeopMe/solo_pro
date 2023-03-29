package com.example.sample.book.dto;

public class BookPatchDto {

    private Long bookId;
    private String Title;
    private String Author;
    private int Price;

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getBookId() {
        return bookId;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    private int Quantity;
}
