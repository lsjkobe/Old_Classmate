package com.leoli.old_classmate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OldClassmateApplication {

    public static void main(String[] args) {
        SpringApplication.run(OldClassmateApplication.class, args);
    }

    @GetMapping("/")
    String test(){
        return "Hellp Word!";
    }

}
