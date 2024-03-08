package com.library.libraryBack.controllers;

import com.library.libraryBack.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    AuthorRepository authorRepository;

}
