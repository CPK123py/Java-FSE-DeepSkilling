package com.example.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AddCountryApplication {
    public static void main(String[] args) {
        SpringApplication.run(AddCountryApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(CountryRepository repository) {
        return args -> {
            Country newCountry = new Country("GB", "United Kingdom");
            repository.save(newCountry);
            System.out.println("Saved country: " + newCountry.getName());
        };
    }
}
