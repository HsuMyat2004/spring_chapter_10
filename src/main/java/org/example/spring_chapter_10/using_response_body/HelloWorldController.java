package org.example.spring_chapter_10.using_response_body;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
