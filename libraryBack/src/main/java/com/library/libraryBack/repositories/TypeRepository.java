package com.library.libraryBack.repositories;

import com.library.libraryBack.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Long> {
}