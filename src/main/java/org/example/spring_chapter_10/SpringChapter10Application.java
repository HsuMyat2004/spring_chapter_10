package org.example.spring_chapter_10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.example.spring_chapter_10.rest_api_part1")

public class SpringChapter10Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringChapter10Application.class, args);
    }

}
