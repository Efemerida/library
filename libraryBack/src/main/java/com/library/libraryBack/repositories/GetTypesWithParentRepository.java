package com.library.libraryBack.repositories;

import com.library.libraryBack.entities.GetTypesWithParent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GetTypesWithParentRepository extends JpaRepository<GetTypesWithParent, Long> {
}