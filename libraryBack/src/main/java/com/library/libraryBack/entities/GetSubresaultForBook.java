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
@Table(name = "get_subresault_for_book")
public class GetSubresaultForBook {
    @Id
    @Column(name = "type", length = Integer.MAX_VALUE)
    private String type;

    @Column(name = "author", length = Integer.MAX_VALUE)
    private String author;

    @Column(name = "count")
    private Long count;

}