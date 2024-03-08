package com.library.libraryBack.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.library.libraryBack", repositoryImplementationPostfix = "Impl")
public class HibernateConfig {
}
