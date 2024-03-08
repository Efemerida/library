package com.library.libraryBack.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 300)
    private String name;

    @Column(name = "year")
    private Integer year;

    @Column(name = "count_of_page")
    private Integer countOfPage;

    @Column(name = "size", length = 20)
    private String size;

    @Column(name = "weight")
    private Integer weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publishing_house")
    private PublishingHouse publishingHouse;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type")
    private Type type;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "age_restrictions", length = Integer.MAX_VALUE)
    private String ageRestrictions;

    @Column(name = "cover_type")
    private Boolean coverType;

    @Column(name = "is_acsessable")
    private Boolean isAcsessable;

    @OneToMany(mappedBy = "book")
    private Set<BookIssuance> bookIssuances = new LinkedHashSet<>();

}