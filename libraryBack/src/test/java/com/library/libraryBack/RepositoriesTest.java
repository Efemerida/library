package com.library.libraryBack;


import com.library.libraryBack.customTypes.Fio;
import com.library.libraryBack.customTypes.Passport;
import com.library.libraryBack.entities.*;
import com.library.libraryBack.repositories.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class RepositoriesTest {

    AuthorRepository authorRepository;
    BookIssuanceRepository bookIssuanceRepository;
    BookRepository bookRepository;
    LibrarianRepository librarianRepository;
    LibraryCardRepository libraryCardRepository;
    PublishingHouseRepository publishingHouseRepository;
    TypeRepository typeRepository;


    @Autowired
    public RepositoriesTest(AuthorRepository authorRepository,
                            BookIssuanceRepository bookIssuanceRepository,
                            BookRepository bookRepository, LibrarianRepository librarianRepository,
                            LibraryCardRepository libraryCardRepository,
                            PublishingHouseRepository publishingHouseRepository, TypeRepository typeRepository) {
        this.authorRepository = authorRepository;
        this.bookIssuanceRepository = bookIssuanceRepository;
        this.bookRepository = bookRepository;
        this.librarianRepository = librarianRepository;
        this.libraryCardRepository = libraryCardRepository;
        this.publishingHouseRepository = publishingHouseRepository;
        this.typeRepository = typeRepository;

    }



    @Test
    @Transactional
    void testAuthorRepository(){
        Author author = new Author();
        author.setName("Test");
        authorRepository.save(author);
        Author author1 = authorRepository.findAuthorByName("Test");
        assertThat(author.getName().equals(author1.getName()));
        authorRepository.delete(author1);
        Author author2 = authorRepository.findAuthorByName("Test");
        assertThat(author2==null);
    }

    @Test
    @Transactional
    void testBookRepository(){
        Book book = new Book();
        book.setName("Test");
        bookRepository.save(book);
        Book book1 = bookRepository.findBookByName("Test");
        assertThat(book.getName().equals(book1.getName()));
        bookRepository.delete(book1);
        Book book2 = bookRepository.findBookByName("Test");
        assertThat(book2==null);
    }

    @Test
    @Transactional
    void testLibrarianRepository(){
        Librarian librarian = new Librarian();
        Fio fio = new Fio();
        fio.setName("Test1");
        fio.setSurname("Test2");
        fio.setPatronomic("Test3");
        librarian.setFio(fio);
        Passport passport = new Passport();
        passport.setSeries("1234");
        passport.setNumber("123456");
        librarian.setPassport(passport);
        librarian.setIsDismissed(false);
        System.out.println("'Test1'");
        librarianRepository.insert("Test1", "Test2", "Test3", false,
                "1234", "123456");
        Librarian librarian1 = librarianRepository.findByPassportCustom(passport.getSeries(), passport.getNumber());
        assertThat(librarian.getPassport().equals(librarian1.getPassport()));
        librarianRepository.delete(librarian1);
    }

    @Test
    @Transactional
    void testPublishingHouseRepository(){
        PublishingHouse ph = new PublishingHouse();
        ph.setName("Test");
        publishingHouseRepository.save(ph);
        PublishingHouse ph2 = publishingHouseRepository.findByName(ph.getName());
        assertThat(ph.getName().equals(ph2.getName()));
        publishingHouseRepository.delete(ph);
        PublishingHouse ph3 = publishingHouseRepository.findByName(ph.getName());
        assertThat(ph3==null);
    }

    @Test
    @Transactional
    void testTypeRepository(){
        PublishingHouse ph = new PublishingHouse();
        ph.setName("Test");
        publishingHouseRepository.save(ph);
        PublishingHouse ph2 = publishingHouseRepository.findByName(ph.getName());
        assertThat(ph.getName().equals(ph2.getName()));
        publishingHouseRepository.delete(ph);
        PublishingHouse ph3 = publishingHouseRepository.findByName(ph.getName());
        assertThat(ph3==null);
    }

}
