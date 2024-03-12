package com.library.libraryBack.services;

import com.library.libraryBack.entities.Author;
import com.library.libraryBack.entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> loadAllBooks();

    Book loadBookById(long id);

    Book loadBookByName(String name);

    Book loadBookByAuthor(Author author);


}
