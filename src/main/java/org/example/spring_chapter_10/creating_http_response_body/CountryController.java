package org.example.spring_chapter_10.creating_http_response_body;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @GetMapping("/france")
    public Country getCountry() {
        Country c = Country.of("France",67);
        return c;
    }

    @GetMapping("/all")
    public List<Country> getAllCountries() {
        Country c1 = Country.of("France",67);
        Country c2 = Country.of("Spain",47);

        return List.of(c1,c2);
    }
}
