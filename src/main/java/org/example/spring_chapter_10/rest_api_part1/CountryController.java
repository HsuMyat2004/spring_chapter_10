package org.example.spring_chapter_10.rest_api_part1;

import org.example.spring_chapter_10.creating_http_response_body.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @GetMapping("/france")
    public ResponseEntity<Country> getFrance() {
        Country c = Country.of("France",67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent","Europe")
                .header("capital","Paris")
                .header("favorite_food","cheese and wine")
                .body(c);
    }
}
