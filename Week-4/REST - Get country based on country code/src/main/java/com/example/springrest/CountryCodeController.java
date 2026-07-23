package com.example.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryCodeController {
    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return new Country(code.toUpperCase(), switch (code.toUpperCase()) {
            case "US" -> "United States";
            case "IN" -> "India";
            case "CA" -> "Canada";
            default -> "Unknown Country";
        });
    }
}
