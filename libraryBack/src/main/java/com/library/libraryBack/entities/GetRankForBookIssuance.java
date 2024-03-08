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
@Table(name = "get_rank_for_book_issuance")
public class GetRankForBookIssuance {
    @Id
    @Column(name = "book", length = 300)
    private String book;

    @Column(name = "author", length = Integer.MAX_VALUE)
    private String author;

    @Column(name = "count")
    private Long count;

    @Column(name = "rank")
    private Long rank;

}