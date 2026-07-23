package com.example.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaQuickExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaQuickExampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(CountryRepository repository) {
        return args -> {
            repository.save(new Country("US", "United States"));
            repository.save(new Country("IN", "India"));
            repository.findAll().forEach(country -> System.out.println(country.getCode() + ": " + country.getName()));
        };
    }
}
