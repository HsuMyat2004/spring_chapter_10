package org.example.spring_chapter_10.simple_rest_api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody /* we use the @ResponseBody annotation to inform the
    dispatcher servlet that this method
    doesn't return a view name but the HTTP response directly */
    public String hello() {
        return "Hello World";
    }
}
