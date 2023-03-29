package com.example.sample.book;

import com.example.sample.book.dto.BookPatchDto;
import com.example.sample.book.dto.BookPostDto;
import com.example.sample.book.dto.BookResponseDto;
import com.example.sample.book.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/books")
public class BookController {
    private BookService bookService;
    private BookMapper mapper;

    public BookController(BookService bookService, BookMapper bookMapper) {
        this.bookService = bookService;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity postBook(@RequestBody BookPostDto bookPostDto){
        Book response = bookService.createbook(mapper.BookPostDtoToBook(bookPostDto));
        return new ResponseEntity<>(mapper.BookToBookResponseDto(response), HttpStatus.CREATED);
    }

    @PatchMapping("/{book-id}")
    public ResponseEntity patchBook(@PathVariable("book-id") @Positive long bookId,
                                    @Valid @RequestBody BookPatchDto bookPatchDto){
        bookPatchDto.setBookId(bookId);
        Book book = bookService.updateBook(mapper.bookPatchDtoToBook(bookPatchDto));

        return new ResponseEntity<>(mapper.BookToBookResponseDto(book),HttpStatus.OK);
    }
    public ResponseEntity getBook(@PathVariable("book-id") long bookId){
        Book book = bookService.findBook(bookId);
        return new ResponseEntity<>(mapper.BookToBookResponseDto(book),HttpStatus.OK);
    }
    public ResponseEntity getbooks(){
        List<Book> books = bookService.findBooks();
       List<BookResponseDto> response =
               books.stream()
                       .map(book -> mapper.BookToBookResponseDto(book))
                       .collect(Collectors.toList());
       return new ResponseEntity<>(response,HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity deletebook(){

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
