package com.library.libraryBack.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "get_count_get_book")
public class GetCountGetBook {
    @Id
    @Column(name = "fio", length = Integer.MAX_VALUE)
    private String fio;

    @Column(name = "count")
    private Long count;

}