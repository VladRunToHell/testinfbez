package com.example.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Tester {
    @RequestMapping("/get")
    public ResponseEntity<String> getString() {
        return new ResponseEntity<>("Hey, listen!", HttpStatus.OK);
    }
}
