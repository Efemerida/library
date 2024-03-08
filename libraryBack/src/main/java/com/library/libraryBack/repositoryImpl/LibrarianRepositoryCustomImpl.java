package com.library.libraryBack.repositoryImpl;

import com.library.libraryBack.entities.Librarian;
import com.library.libraryBack.repositories.LibrarianRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;



public class LibrarianRepositoryCustomImpl implements LibrarianRepositoryCustom {


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void insertCustom(Librarian librarian) {
        entityManager.createNativeQuery("insert into  librarian (fio, is_dismissed,passport) values (cast((?, ?, ?) as fio), ?, cast((?, ?) as passport))")
                .setParameter(1, librarian.getFio().getSurname())
                .setParameter(2, librarian.getFio().getName())
                .setParameter(3, librarian.getFio().getPatronomic())
                .setParameter(4, librarian.getIsDismissed())
                .setParameter(5, librarian.getPassport().getSeries())
                .setParameter(6, librarian.getPassport().getNumber()).executeUpdate();

    }
}
