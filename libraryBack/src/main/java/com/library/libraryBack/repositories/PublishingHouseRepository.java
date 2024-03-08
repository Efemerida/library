package com.library.libraryBack.repositories;

import com.library.libraryBack.entities.PublishingHouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishingHouseRepository extends JpaRepository<PublishingHouse, Long> {
    PublishingHouse findByName(String name);
}