package com.library.libraryBack.repositories;

import com.library.libraryBack.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findBookByName(String name);

}