package com.library.libraryBack.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "library_card")
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "surname", nullable = false, length = Integer.MAX_VALUE)
    private String surname;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "patronomic", length = Integer.MAX_VALUE)
    private String patronomic;

    @Column(name = "passport", nullable = false, length = 10)
    private String passport;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "phone", nullable = false, length = Integer.MAX_VALUE)
    private String phone;

    @OneToMany(mappedBy = "libraryCard")
    private Set<BookIssuance> bookIssuances = new LinkedHashSet<>();

}