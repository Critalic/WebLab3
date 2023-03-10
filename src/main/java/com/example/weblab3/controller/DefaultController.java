package com.example.weblab3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class DefaultController {

    @GetMapping("")
    public ResponseEntity<String> getSliders() { return ResponseEntity.ok("Hello world"); }
}
