package com.library.libraryBack.entities;


import com.library.libraryBack.customTypes.Fio;
import com.library.libraryBack.customTypes.Passport;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "librarian")
public class Librarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "is_dismissed", nullable = false)
    private Boolean isDismissed = false;

    @OneToMany(mappedBy = "librarian")
    private Set<BookIssuance> bookIssuances = new LinkedHashSet<>();

    @org.hibernate.annotations.Type(value = com.library.libraryBack.customTypes.PassportType.class)
    @Column(name = "passport", columnDefinition = "passport(0, 0) not null")
    private Passport passport;

    @org.hibernate.annotations.Type(value = com.library.libraryBack.customTypes.FioType.class)
    @Column(name = "fio", columnDefinition = "fio(0, 0) not null")
    private Fio fio;

}