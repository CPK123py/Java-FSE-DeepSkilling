package com.example.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FindCountryApplication {
    public static void main(String[] args) {
        SpringApplication.run(FindCountryApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(CountryRepository repository) {
        return args -> {
            repository.save(new Country("CA", "Canada"));
            repository.save(new Country("AU", "Australia"));
            repository.findByCode("CA").ifPresent(country -> System.out.println("Found: " + country.getName()));
        };
    }
}
