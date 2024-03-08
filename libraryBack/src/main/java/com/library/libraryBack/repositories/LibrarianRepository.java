package com.library.libraryBack.repositories;

import com.library.libraryBack.customTypes.Passport;
import com.library.libraryBack.entities.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
    @Query(value = "select id, passport, fio, is_dismissed from librarian where passport =(cast((:s, :n) as passport))",
            nativeQuery = true)
    Librarian findByPassportCustom(@Param("s") String series, @Param("n") String number);

//    @Modifying
//    @Query(value = "insert into  librarian (fio, is_dismissed,passport) values (((:surname, :name, :patronymic)::fio)," +
//            " :is_distinct, ((:series, :number)::passport))",
//    nativeQuery = true)
//    void insert(@Param("surname") String surname, @Param("name") String name, @Param("patronymic") String patronymic,
//                @Param("is_distinct") boolean is_distinct, @Param("series") String series, @Param("number") String number);

    @Modifying
    @Query(value = "call add_librarian(:s, :n, :p, :d, :ss, :nn)",
            nativeQuery = true)
    void insert(@Param("s") String surname, @Param("n") String name, @Param("p") String patronymic,
                @Param("d") boolean is_distinct, @Param("ss") String series, @Param("nn") String number);

}