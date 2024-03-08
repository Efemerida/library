package com.library.libraryBack.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_type")
    private Type parentType;

    @OneToMany(mappedBy = "type")
    private Set<Book> books = new LinkedHashSet<>();

    @OneToMany(mappedBy = "parentType")
    private Set<Type> types = new LinkedHashSet<>();

}