package com.library.libraryBack.repositories;

import com.library.libraryBack.entities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryCardRepository extends JpaRepository<LibraryCard, Long> {
}