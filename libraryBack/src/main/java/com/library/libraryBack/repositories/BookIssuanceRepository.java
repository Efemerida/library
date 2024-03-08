package com.library.libraryBack.repositories;

import com.library.libraryBack.entities.BookIssuance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookIssuanceRepository extends JpaRepository<BookIssuance, Long> {
}