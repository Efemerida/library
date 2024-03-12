package com.library.libraryBack.controllers;

import com.library.libraryBack.entities.Book;
import com.library.libraryBack.services.BookService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class BookController {

    BookService bookService;

    @GetMapping("/")
    public List<Book> getBooks(){
        return bookService.loadAllBooks();
    }

}
