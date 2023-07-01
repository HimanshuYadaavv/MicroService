package com.example.testservice4;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {


    @GetMapping("/")
    public ResponseEntity<String> greet(){
        return  new ResponseEntity<>("Return form test services4", HttpStatus.OK);

    }
}
