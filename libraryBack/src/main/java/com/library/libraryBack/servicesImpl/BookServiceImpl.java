package com.library.libraryBack.servicesImpl;

import com.library.libraryBack.entities.Author;
import com.library.libraryBack.entities.Book;
import com.library.libraryBack.repositories.BookRepository;
import com.library.libraryBack.services.BookService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookServiceImpl implements BookService {

    BookRepository bookRepository;


    @Override
    public List<Book> loadAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book loadBookById(long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Book loadBookByName(String name) {
        return bookRepository.findBookByName(name);
    }

    @Override
    public Book loadBookByAuthor(Author author) {
        return bookRepository.findBookByAuthor(author);
    }


}
